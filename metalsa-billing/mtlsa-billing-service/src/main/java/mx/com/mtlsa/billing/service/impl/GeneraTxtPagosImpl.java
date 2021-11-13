package mx.com.mtlsa.billing.service.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import mx.com.mtlsa.billing.dto.request.txt.FacElectronicaRequest;
import mx.com.mtlsa.billing.dto.request.txt.FacturaPagoRequest;
import mx.com.mtlsa.billing.dto.request.txt.FacturaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecMsFacturaPagosTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EstrucSecAuxComplePagoTxtDTO;
import mx.com.mtlsa.billing.service.GeneraTxtPagos;
import mx.com.mtlsa.billing.utils.SFTPSend;
import mx.com.mtlsa.billing.utils.Utils;
import mx.com.mtlsa.billing.utils.txt.GeneraStringComplemento;
import mx.com.mtlsa.billing.utils.txt.GeneraStringFacturas;
import mx.com.mtlsa.billing.utils.txt.GenerarStringAuxComplePago;
import mx.com.mtsla.billing.dao.GetInfoPagosTxtDao;

@Stateless
public class GeneraTxtPagosImpl implements GeneraTxtPagos, Serializable {

	/** 
	 *  
	 */
	private static final long serialVersionUID = 8369544792300547885L;

	@Inject
	GetInfoPagosTxtDao getInfoPagosTxtDao;

	@Override
	public EspecMsFacturaPagosTxtDTO getFacturaPagosTxt(FacturaPagoRequest request) {

		EspecMsFacturaPagosTxtDTO especMsFacPagos = new EspecMsFacturaPagosTxtDTO();

		FileWriter flwriter = null;
		StringBuilder getFacturaPagosFinal = new StringBuilder("");
		String nomArchivo = Utils.generaIdTxt();
		try {

			if (request.getFactura().size() == 0) {
				return especMsFacPagos;
			}
			Integer count = 1;
			for (FacturaRequest fac : request.getFactura()) {
				System.out.println("ENTRO  getFacturaPagosTxt ..");
				System.out.println("1-  Llama   ecabezado Pagos (EspecOrdEncaFacElecTxtDTO) ..");

				List<EspecOrdEncaFacElecTxtDTO> listaEcabezado = new ArrayList<EspecOrdEncaFacElecTxtDTO>();

				listaEcabezado.addAll(getInfoPagosTxtDao.getInfoFacPagosEncabezado(fac));

				if (listaEcabezado.size() == 0) {
					return especMsFacPagos;

				}
				System.out.println("2-  Genera el IDs () ..");
				String nomIdFolio = Utils.generaIdTxt() + count.toString();
				listaEcabezado.get(0).setFolio(nomIdFolio);

				especMsFacPagos.setCabecera(listaEcabezado.get(0));
				getFacturaPagosFinal.append(GeneraStringFacturas.facturaCabecera(listaEcabezado.get(0)).toString());

				System.out.println("3-  Llama   Detalle (EspecOrdLineDetCfdTxtDTO) ..");
				List<EspecOrdLineDetCfdTxtDTO> especOrdLineDet = new ArrayList<EspecOrdLineDetCfdTxtDTO>();
				especOrdLineDet = getInfoPagosTxtDao.getInfoFacPagosCompleDetalle(fac);
				especMsFacPagos.setComplemento(especOrdLineDet);
				getFacturaPagosFinal.append(GeneraStringComplemento.facturaComplemento(especOrdLineDet));

				System.out.println("4-  Llama   comercio exterior (ListaAuxComplePagoTxtDTO)  ..");
				List<EstrucSecAuxComplePagoTxtDTO> listaAuxComplePago = new ArrayList<EstrucSecAuxComplePagoTxtDTO>();
				listaAuxComplePago = getInfoPagosTxtDao.getListaAuxPagosComplePago(fac);
				especMsFacPagos.setAuxComplePago(listaAuxComplePago);
				getFacturaPagosFinal.append(GenerarStringAuxComplePago.facturaAuxPagosComplePago(listaAuxComplePago));
				count++;

			}

			File file = new File(nomArchivo + ".txt");
			flwriter = new FileWriter(file);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			bfwriter = new BufferedWriter(flwriter);
			bfwriter.write(getFacturaPagosFinal.toString());

			bfwriter.close();

			FileInputStream test = new FileInputStream(file);
			System.out.println("Archivo creado satisfactoriamente..");
			// Se envia archivo al SFTP
			SFTPSend.SFTPSendTXT_2(nomArchivo + ".txt", test);
			System.out.println("Se ha enviado satisfactoriamente..");

		} catch (Exception e) {
			System.out.println("Error Service  " + e);

		} finally {
			if (flwriter != null) {
				try {// cierra el flujo principal
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return especMsFacPagos;
	}

}
