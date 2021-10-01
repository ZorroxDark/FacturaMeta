package mx.com.mtlsa.billing.utils.txt;

import java.util.ArrayList;
import java.util.List;

import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineImpuestoCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EstrucSecAuxComplePagoTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.ListaAuxComplePagoTxtDTO;
import mx.com.mtlsa.billing.utils.Constantes;

public class GenerarStringAuxComplePago {
	
	public static StringBuilder facturaAuxComplePago(ListaAuxComplePagoTxtDTO auxComplePagoTxtDTO) {

		StringBuilder getAuxComplePago = new StringBuilder();
		try {
			
			List<EstrucSecAuxComplePagoTxtDTO> listaAuxComple = new ArrayList<EstrucSecAuxComplePagoTxtDTO>();
			listaAuxComple.add(auxComplePagoTxtDTO.getEncabezado());
			listaAuxComple.add(auxComplePagoTxtDTO.getDestinatario());
			listaAuxComple.add(auxComplePagoTxtDTO.getDomEmisor());
			listaAuxComple.add(auxComplePagoTxtDTO.getDomReceptor());
			listaAuxComple.add(auxComplePagoTxtDTO.getTxtLeyeda());
			
			
			getAuxComplePago.append(Constantes.SIG_NEG);
			
			for(EstrucSecAuxComplePagoTxtDTO auxComplePago:listaAuxComple) {
				
				
				
				getAuxComplePago.append(auxComplePago.getDetalleAuxTipo() != null ? auxComplePago.getDetalleAuxTipo() :"" );
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxDescTipo() != null ? auxComplePago.getDetalleAuxDescTipo() :"" );
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc01() != null ? auxComplePago.getDetalleAuxMisc01() :"" );
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc02() != null ? auxComplePago.getDetalleAuxMisc02() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc03()!= null ? auxComplePago.getDetalleAuxMisc03() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc04()!= null ? auxComplePago.getDetalleAuxMisc04() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc05()!= null ? auxComplePago.getDetalleAuxMisc05() :"");
				
				
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc06()!= null ? auxComplePago.getDetalleAuxMisc06() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc07()!= null ? auxComplePago.getDetalleAuxMisc07() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc08()!= null ? auxComplePago.getDetalleAuxMisc08() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc09()!= null ? auxComplePago.getDetalleAuxMisc09() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc10()!= null ? auxComplePago.getDetalleAuxMisc10() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc11()!= null ? auxComplePago.getDetalleAuxMisc11() :"");
				
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc12()!= null ? auxComplePago.getDetalleAuxMisc12() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc13()!= null ? auxComplePago.getDetalleAuxMisc13() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc14()!= null ? auxComplePago.getDetalleAuxMisc14() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc15()!= null ? auxComplePago.getDetalleAuxMisc15() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc16()!= null ? auxComplePago.getDetalleAuxMisc16() :"");
				
				getAuxComplePago.append(Constantes.SALTO_LINEA);
				
				
			}
			
			
			
		
		} catch (Exception e) {
			System.out.println("Error  generacion stringBuilder facturaAuxComplePago " + e);
		}
		
		return getAuxComplePago;
	}
	
	
	public static StringBuilder facturaAuxPagosComplePago(List<EstrucSecAuxComplePagoTxtDTO>  listaAuxComple) {

		StringBuilder getAuxComplePago = new StringBuilder();
		try {
			
			
			
			getAuxComplePago.append(Constantes.SIG_NEG);
			
			for(EstrucSecAuxComplePagoTxtDTO auxComplePago:listaAuxComple) {
				
				
				
				getAuxComplePago.append(auxComplePago.getDetalleAuxTipo() != null ? auxComplePago.getDetalleAuxTipo() :"" );
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxDescTipo() != null ? auxComplePago.getDetalleAuxDescTipo() :"" );
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc01() != null ? auxComplePago.getDetalleAuxMisc01() :"" );
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc02() != null ? auxComplePago.getDetalleAuxMisc02() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc03()!= null ? auxComplePago.getDetalleAuxMisc03() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc04()!= null ? auxComplePago.getDetalleAuxMisc04() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc05()!= null ? auxComplePago.getDetalleAuxMisc05() :"");
				
				
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc06()!= null ? auxComplePago.getDetalleAuxMisc06() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc07()!= null ? auxComplePago.getDetalleAuxMisc07() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc08()!= null ? auxComplePago.getDetalleAuxMisc08() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc09()!= null ? auxComplePago.getDetalleAuxMisc09() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc10()!= null ? auxComplePago.getDetalleAuxMisc10() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc11()!= null ? auxComplePago.getDetalleAuxMisc11() :"");
				
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc12()!= null ? auxComplePago.getDetalleAuxMisc12() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc13()!= null ? auxComplePago.getDetalleAuxMisc13() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc14()!= null ? auxComplePago.getDetalleAuxMisc14() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc15()!= null ? auxComplePago.getDetalleAuxMisc15() :"");
				getAuxComplePago.append(Constantes.PIPE);
				getAuxComplePago.append(auxComplePago.getDetalleAuxMisc16()!= null ? auxComplePago.getDetalleAuxMisc16() :"");
				
				getAuxComplePago.append(Constantes.SALTO_LINEA);
				
				
			}
			
			
			
		
		} catch (Exception e) {
			System.out.println("Error  generacion stringBuilder facturaAuxPagosComplePago " + e);
		}
		
		return getAuxComplePago;
	}

}
