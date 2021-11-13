package mx.com.mtsla.billing.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.com.mtlsa.billing.dto.request.txt.FacturaRequest;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdEncaFacElecTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineDetCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.EstrucSecAuxComplePagoTxtDTO;
import mx.com.mtsla.billing.dao.GetInfoComplePagosTxtDao;
import mx.com.mtsla.billing.dao.map.MapEspecOrdEncaFacElecTxtDTO;
import mx.com.mtsla.billing.dao.map.MapEspecOrdLineDetCfdTxtDTO;
import mx.com.mtsla.billing.dao.map.MapEstrucSecAuxComplePagoTxtDTO;

@Stateless
public class GetInfoComplePagosTxtImpl implements GetInfoComplePagosTxtDao{
	
	@PersistenceContext(unitName = "jdbc/mtlsa_COFIDI_SSQL")
	private EntityManager em;

	private Query query;
	
	
	@SuppressWarnings("finally")
	@Override
	public List<EspecOrdEncaFacElecTxtDTO> getInfoComplementoPagosEncabezado(FacturaRequest request) {
		
		List<EspecOrdEncaFacElecTxtDTO> respuesta = new ArrayList<EspecOrdEncaFacElecTxtDTO>();

		try {
			
			System.out.println("CREA OBJETO getInfoComplementoPagosEncabezado  ..");

			StringBuilder qlString = new StringBuilder();
			
			qlString.append(" select   \n");
			qlString.append(" enc.NoDocumento Folio,  \n");
			qlString.append(" emp.RazonSocial Nombre_Emisor,  \n");
			qlString.append(" emp.RFC RFC_Emisor,  \n");
			qlString.append(" dir_emi.Calle Dom_Emisor_calle,  \n");
			qlString.append(" dir_emi.Numero Dom_Emisor_noExterior,  \n");
			qlString.append(" null Dom_Emisor_noInterior,  \n");
			qlString.append(" dir_emi.Colonia Dom_Emisor_colonia,  \n");
			qlString.append(" dir_emi.Localidad Dom_Emisor_localidad,  \n");
			qlString.append(" dir_emi.ReferenciaDireccion Dom_Emisor_referencia,  \n");
			qlString.append(" dir_emi.Delegacion Dom_Emisor_municipio,  \n");
			qlString.append(" dir_emi.Estado Dom_Emisor_estado,  \n");
			qlString.append(" dir_emi.Pais Dom_Emisor_pais,  \n");
			qlString.append(" dir_emi.CP Dom_Emisor_codigoPostal,  \n");
			qlString.append(" dir_emi_tel.Telefono,  \n");
			qlString.append(" dir_exp.Calle Dom_Sucursal_calle,  \n");
			qlString.append(" dir_exp.Numero Dom_Sucursal_noExterior,  \n");
			qlString.append(" null Dom_Sucursal_noInterior,  \n");
			qlString.append(" dir_exp.Colonia Dom_Sucursal_colonia,  \n");
			qlString.append(" dir_exp.Localidad Dom_Sucursal_localidad,  \n");
			qlString.append(" dir_exp.ReferenciaDireccion Dom_Sucursal_referencia,  \n");
			qlString.append(" dir_exp.Delegacion Dom_Sucursal_municipio,  \n");
			qlString.append(" dir_exp.Estado Dom_Sucursal_estado,  \n");
			qlString.append(" dir_exp.Pais Dom_Sucursal_pais,  \n");
			qlString.append(" dir_exp.CP Dom_Sucursal_codigoPostal,  \n");
			qlString.append(" null Tel_Sucursal,  \n");
			qlString.append(" emp.VersionCFD Version,  \n");
			qlString.append(" null Serie_Comprobante,  \n");
			qlString.append(" null Numero_Aprobacion,  \n");
			qlString.append(" null FormaPago,  \n");
			qlString.append(" CONVERT(varchar,CURRENT_TIMESTAMP,23) Fecha,  \n");
			qlString.append(" CONVERT(varchar,CURRENT_TIMESTAMP,24) Hora,  \n");
			qlString.append(" dir_exp.Calle Dom_LugarExpide_calle,  \n");
			qlString.append(" dir_exp.Numero Dom_LugarExpide_noExterior,  \n");
			qlString.append(" null Dom_LugarExpide_noInterior,  \n");
			qlString.append(" dir_exp.Colonia Dom_LugarExpide_colonia,  \n");
			qlString.append(" dir_exp.Localidad Dom_LugarExpide_localidad,  \n");
			qlString.append(" dir_exp.ReferenciaDireccion Dom_LugarExpide_referencia,  \n");
			qlString.append(" dir_exp.Delegacion Dom_LugarExpide_municipio,  \n");
			qlString.append(" dir_exp.Estado Dom_LugarExpide_estado,  \n");
			qlString.append(" dir_exp.Pais Dom_LugarExpide_pais,  \n");
			qlString.append(" dir_exp.CP Dom_LugarExpide_codigoPostal,  \n");
			qlString.append(" soc_com.RazonSocial Nombre_Receptor,  \n");
			qlString.append(" soc_com.RFC RFC_Receptor,  \n");
			qlString.append(" soc_com_dir.Calle Dom_Receptor_calle,  \n");
			qlString.append(" soc_com_dir.Numero Dom_Receptor_noExterior,  \n");
			qlString.append(" null Dom_Receptor_noInterior,  \n");
			qlString.append(" soc_com_dir.Colonia Dom_Receptor_colonia,  \n");
			qlString.append(" soc_com_dir.Localidad Dom_Receptor_localidad,  \n");
			qlString.append(" soc_com_dir.ReferenciaDireccion Dom_Receptor_referencia,  \n");
			qlString.append(" soc_com_dir.Delegacion Dom_Receptor_municipio,  \n");
			qlString.append(" soc_com_dir.Estado Dom_Receptor_estado,  \n");
			qlString.append(" soc_com_dir.Pais Dom_Receptor_pais,  \n");
			qlString.append(" soc_com_dir.CP Dom_Receptor_codigoPostal,  \n");
			qlString.append(" 0 Monto_SubTotal,  \n");
			qlString.append(" 0 Monto_Impuestos,  \n");
			qlString.append(" 0 Monto_Total,  \n");
			qlString.append(" 1 Estado,  --Valor Fijo  \n");
			qlString.append(" 'FA' TipoCFD,  \n");
			qlString.append(" null notas, --Comentarios de factura  \n");
			qlString.append(" null notas02,  \n");
			qlString.append(" (SELECT rtrim(email) + ';' AS 'data()' FROM CLI_ATEBCOFIDI.dbo.Contactos where empresa=enc.Empresa and Cliente=enc.Cliente  FOR XML PATH('')) Notas03,  \n");
			qlString.append(" null TradingPartner_Prov, \n");
			qlString.append(" null Calif_TradingPartner_Prov, \n");
			qlString.append(" null EAN_Proveedor, \n");
			qlString.append(" null Numero_Factura, \n");
			qlString.append(" null Numero_OrdenCompra, \n");
			qlString.append(" null Fecha_OrdenCompra, \n");
			qlString.append(" null Numero_Proveedor, \n");
			qlString.append(" null EAN_Tienda, \n");
			qlString.append(" null Numero_Tienda, \n");
			qlString.append(" null Nombre_Tienda, \n");
			qlString.append(" null Dom_Tienda_calle, \n");
			qlString.append(" null Dom_Tienda_noExterior, \n");
			qlString.append(" null Dom_Tienda_noInterior, \n");
			qlString.append(" null Dom_Tienda_colonia, \n");
			qlString.append(" null Dom_Tienda_localidad, \n");
			qlString.append(" null Dom_Tienda_referencia, \n");
			qlString.append(" null Dom_Tienda_municipio, \n");
			qlString.append(" null Dom_Tienda_estado, \n");
			qlString.append(" null Dom_Tienda_pais, \n");
			qlString.append(" null Dom_Tienda_codigoPostal, \n");
			qlString.append(" null RFC_Tienda, \n");
			qlString.append(" 'XXX' Cod_Moneda, \n");
			qlString.append(" null Dias_Pago,  \n");
			qlString.append(" null Porc_Desc_ProntoPago, \n");
			qlString.append(" null Monto_Desc_ProntoPago, \n");
			qlString.append(" null Cod_Descuento, \n");
			qlString.append(" null Porc_Descuento, \n");
			qlString.append(" null Monto_Descuento, \n");
			qlString.append(" null Cantidad_LineasFactura, \n");
			qlString.append(" null Fecha_Vencimiento, \n");
			qlString.append(" null Cod_Zona, \n");
			qlString.append(" null Numero_Receptor, \n");
			qlString.append(" null Cod_Vendedor, \n");
			qlString.append(" null Nombre_Vendedor, \n");
			qlString.append(" null Via_Embarque, \n");
			qlString.append(" null Condiciones_Pago, \n");
			qlString.append(" null Numero_Pedido, \n");
			qlString.append(" null Fecha_Pedido, \n");
			qlString.append(" enc.TotalMonto , \n");
			qlString.append(" null Cantidad_unidades, \n");
			qlString.append(" null Cantidad_empaques, \n");
			qlString.append(" null EAN_Receptor, \n");
			qlString.append(" null EAN_LugarExpide, \n");
			qlString.append(" null IEPS_Id, \n");
			qlString.append(" null Estatus, \n");
			qlString.append(" null Numero_Emisor, \n");
			qlString.append(" null Monto_Merma, \n");
			qlString.append(" null Monto_SubTotal_ApIVA, \n");
			qlString.append(" null Transportista, \n");
			qlString.append(" null Numero_Solicitud, \n");
			qlString.append(" null Desc_Moneda, \n");
			qlString.append(" 'misc01', --misc01  \n");
			qlString.append(" null Flete, --misc02 \n");
			qlString.append(" null Autorizacion, --misc03, \n");
			qlString.append(" null Cliente, --misc04 \n");
			qlString.append(" null FechaLarga, --misc05 \n");
			qlString.append(" null Misc06, \n");
			qlString.append(" null Misc07, \n");
			qlString.append(" null Misc08, \n");
			qlString.append(" null Misc09, \n");
			qlString.append(" null Misc10, \n");
			qlString.append(" null clavePedimento, --misc11  \n");
			qlString.append(" null TipoOperacion, --misc12 \n");
			qlString.append(" null certificadoOrigen, --misc13 \n");
			qlString.append(" null NumCertificadoOrigen, --misc14 \n");
			qlString.append(" null Misc15, \n");
			qlString.append(" null Misc16, \n");
			qlString.append(" null Misc17, \n");
			qlString.append(" null Misc18, \n");
			qlString.append(" null NumeroExportadorConfiable, --misc19 \n");
			qlString.append(" '[CPG]' cpg, --misc20 \n");
			qlString.append(" null Subdivision, --misc21 \n");
			qlString.append(" null misc22, \n");
			qlString.append(" null tipoCambioUSD, --misc23 \n");
			qlString.append(" null totalUSD, --misc24 \n");
			qlString.append(" null Marca, --misc25 \n");
			qlString.append(" null modelo, --misc26 \n");
			qlString.append(" null submodelo, --misc27 \n");
			qlString.append(" null misc28, \n");
			qlString.append(" null misc29, \n");
			qlString.append(" null misc30, \n");
			qlString.append(" null TaxID_Receptor, --misc31 \n");
			qlString.append(" 'P01' UsoCFDI, --misc32 \n");
			qlString.append(" null Misc33, \n");
			qlString.append(" null Misc34, \n");
			qlString.append(" null Misc35, \n");
			qlString.append(" null Misc36, \n");
			qlString.append(" null Misc37, \n");
			qlString.append(" null Misc38, \n");
			qlString.append(" null Misc39, \n");
			qlString.append(" null Misc40, \n");
			qlString.append(" null Misc41, \n");
			qlString.append(" null Misc42, \n");
			qlString.append(" null Misc43, \n");
			qlString.append(" null Misc44, \n");
			qlString.append(" null Misc45, \n");
			qlString.append(" null Misc46, \n");
			qlString.append(" null Misc47, \n");
			qlString.append(" null Misc48, \n");
			qlString.append(" null Misc49, \n");
			qlString.append(" null Misc50, \n");
			qlString.append(" null Porc_IVA,  \n");
			qlString.append(" null Monto_IEPS,   \n");
			qlString.append(" null Document_Status, \n");
			qlString.append(" null Delivery_Date, \n");
			qlString.append(" (SELECT TOP 1 rtrim(Regimen) FROM CLI_ATEBCOFIDI.dbo.EmpresaRF where empresa=enc.Empresa) RegimenFiscal, \n");
			qlString.append(" null Reference_Identification, \n");
			qlString.append(" null Num_contrarecibo, \n");
			qlString.append(" null Fecha_Num_contrarecibo, \n");
			qlString.append(" null Contacto_Compras, \n");
			qlString.append(" null Customs_gln, \n");
			qlString.append(" null Alternate_identification_gln, \n");
			qlString.append(" null Nombre_Aduana, \n");
			qlString.append(" null Nombre_Aduana_Ciudad, \n");
			qlString.append(" null Func_Divisa, \n");
			qlString.append(" null Tasa_Divisa, \n");
			qlString.append(" null Terminos, \n");
			qlString.append(" null Ref_Termino_Tiempo_Pago, \n");
			qlString.append(" dir_exp.CP LugarExpedicion, \n");
			qlString.append(" null Indicador_Cargo_Descuento, \n");
			qlString.append(" null Inf_Cargo_Descuento, \n");
			qlString.append(" null Tipo_Especial_de_Servicio, \n");
			qlString.append(" null Porcentaje_no_aplicado, \n");
			qlString.append(" null Identificador_Cargo_Descuento, \n");
			qlString.append(" null Monto_Total_Descuentos, \n");
			qlString.append(" null Monto_Total_Pagar, \n");
			qlString.append(" null Ano_Aprobacion, \n");
			qlString.append(" null Motivo_Descuento, \n");
			qlString.append(" null Metodo_Pago, \n");
			qlString.append(" 'P' Efecto_Comprobante, \n");
			qlString.append(" null Monto_TotalImp_Retenidos, \n");
			qlString.append(" null Monto_TotalImp_Traslados \n");
			qlString.append(" from CLI_ATEBCOFIDI.dbo.CFDPagos enc	\n");
			qlString.append(" inner join CLI_ATEBCOFIDI.dbo.empresa emp on enc.Empresa=emp.empresa \n");
			qlString.append(" left join CLI_ATEBCOFIDI.dbo.Direccion dir_emi on enc.Empresa=dir_emi.empresa and dir_emi.id='DE' AND dir_emi.TipoDireccion='F' \n");
			qlString.append(" left join CLI_ATEBCOFIDI.dbo.Contactos dir_emi_con on enc.Empresa=dir_emi_con.Empresa and dir_emi_con.cliente='DE' \n"); 
			qlString.append(" left join  CLI_ATEBCOFIDI.dbo.telefono dir_emi_tel on dir_emi_con.Empresa=dir_emi_tel.Empresa and dir_emi_con.Cliente=dir_emi_tel.Cliente and dir_emi_con.Contacto=dir_emi_tel.Contacto and dir_emi_tel.TipoTelefono='O' \n");
			qlString.append(" left join CLI_ATEBCOFIDI.dbo.Direccion dir_exp on enc.Empresa=dir_exp.empresa and dir_exp.id='DE' AND dir_exp.TipoDireccion='X' \n");
			qlString.append(" left join CLI_ATEBCOFIDI.dbo.SocioComercial soc_com on soc_com.Empresa=enc.Empresa and soc_com.Cliente=enc.Cliente \n");
			qlString.append(" left join CLI_ATEBCOFIDI.dbo.Direccion soc_com_dir on soc_com_dir.Empresa=enc.Empresa and soc_com_dir.id=enc.Cliente AND soc_com_dir.TipoDireccion='F' \n");
			qlString.append(" 	where  \n");
			qlString.append("  enc.Empresa='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and enc.NoDocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
			
			
			System.out.println("Query Pagos: {}" + qlString);
			query = em.createNativeQuery(qlString.toString());


			List<Object[]> objectLista = query.getResultList();
			
			
			if(objectLista != null) {
				
				respuesta = MapEspecOrdEncaFacElecTxtDTO.especOrdEncaFacElecTxtDTO(objectLista);
				
			}
			

		} catch (Exception e) {
			System.out.println("Error Encabezado " + e);
			
		}finally {
			
			
			return respuesta;

		}
		
		
	}
	
	
	@SuppressWarnings("finally")
	@Override
	public List<EspecOrdLineDetCfdTxtDTO> getInfoComplementoPagosCompleDetalle(FacturaRequest request) {
		// TODO Auto-generated method stub
		
		List<EspecOrdLineDetCfdTxtDTO> respuesta = new ArrayList<EspecOrdLineDetCfdTxtDTO>();
		

		try {
			System.out.println("CREA OBJETO getInfoComplementoPagosCompleDetalle  ..");

			StringBuilder qlString = new StringBuilder();
			qlString.append(" select   \n");
			qlString.append(" 'Pago' Linea_Descripcion,  \n");
			qlString.append(" '1' Linea_Cantidad,  \n");
			qlString.append(" 'ACT' Linea_Unidad,  \n");
			qlString.append(" '0' Linea_PrecioUnitario,  \n");
			qlString.append(" '0' Linea_Importe,  \n");
			qlString.append(" null Linea_Aduana_NumDoc,  \n");
			qlString.append(" null Linea_Aduana_FechaDoc,  \n");
			qlString.append(" null Linea_Aduana_Nombre,  \n");
			qlString.append(" null Linea_CuentaPredial_Numero,  \n");
			qlString.append(" null fraccionarancelaria,  \n");
			qlString.append(" null Linea_Notas,  \n");
			qlString.append(" null Linea_Cod_UPC,  \n");
			qlString.append(" null Linea_Piezas_Empaque,  \n");
			qlString.append(" null Linea_Cod_DUN,  \n");
			qlString.append(" null Linea_Cod_Barras,  \n");
			qlString.append(" '84111506' Linea_Cod_Articulo,  \n");
			qlString.append(" null Linea_Cod_Desc,  \n");
			qlString.append(" null Linea_Porc_Desc,  \n");
			qlString.append(" null Linea_Monto_Desc,  \n");
			qlString.append(" null Linea_PrecioUnitario_SinDesc,  \n");
			qlString.append(" null Linea_Cant_Empaques_Fac,  \n");
			qlString.append(" null Linea_Cant_Empaques_Emb,  \n");
			qlString.append(" null Linea_Porc_IVA,  \n");
			qlString.append(" null Linea_Monto_IVA,  \n");
			qlString.append(" null Linea_Porc_IEPS,  \n");
			qlString.append(" null Linea_Monto_IEPS,  \n");
			qlString.append(" null Linea_PrecioUnitario_ConImp,  \n");
			qlString.append(" null Linea_Importe_ConImp,  \n");
			qlString.append(" null Linea_Frontera,  \n");
			qlString.append(" null Línea_PaisOrigen,  \n");
			qlString.append(" null Linea_EAN_Aduana,  \n");
			qlString.append(" null Linea_Misc01,  \n");
			qlString.append(" null Linea_Misc02,  \n");
			qlString.append(" null Linea_Misc03,  \n");
			qlString.append(" null Linea_Misc04,  \n");
			qlString.append(" null Linea_Misc05,  \n");
			qlString.append(" null Linea_Misc06,  \n");
			qlString.append(" null Linea_Misc07,  \n");
			qlString.append(" null Linea_Misc08,  \n");
			qlString.append(" null Linea_Misc09,  \n");
			qlString.append(" null Linea_Misc10,  \n");
			qlString.append(" null Linea_Misc11,  \n");
			qlString.append(" null Linea_Misc12,  \n");
			qlString.append(" null Linea_Misc13,  \n");
			qlString.append(" null Linea_Misc14,  \n");
			qlString.append(" null Linea_Misc15,  \n");
			qlString.append(" null Linea_Misc16,  \n");
			qlString.append(" null Linea_Misc17,  \n");
			qlString.append(" null Linea_Misc18,  \n");
			qlString.append(" null Linea_Misc19,  \n");
			qlString.append(" null Linea_Misc20,  \n");
			qlString.append(" null Linea_Misc21,  \n");
			qlString.append(" null Linea_Misc22,  \n");
			qlString.append(" null Linea_Misc23,  \n");
			qlString.append(" null Linea_Misc24,  \n");
			qlString.append(" null Linea_Misc25,  \n");
			qlString.append(" null Linea_Misc26,  \n");
			qlString.append(" null Linea_Misc27,  \n");
			qlString.append(" null Linea_Misc28,  \n");
			qlString.append(" null Linea_Misc29,  \n");
			qlString.append(" null Linea_Misc30,  \n");
			qlString.append(" null Linea_Misc31,  \n");
			qlString.append(" null Linea_Misc32,  \n");
			qlString.append(" null Linea_Misc33,  \n");
			qlString.append(" null Linea_Misc34,  \n");
			qlString.append(" null Linea_Misc35,  \n");
			qlString.append(" null Linea_Misc36,  \n");
			qlString.append(" null Linea_Misc37,  \n");
			qlString.append(" null Linea_Misc38,  \n");
			qlString.append(" null Linea_Misc39,  \n");
			qlString.append(" null Linea_Misc40,  \n");
			qlString.append(" null Linea_Misc41,  \n");
			qlString.append(" null Linea_Misc42,  \n");
			qlString.append(" null Linea_Misc43,  \n");
			qlString.append(" null Linea_Misc44,  \n");
			qlString.append(" null Linea_Misc45,  \n");
			qlString.append(" null Linea_Misc46,  \n");
			qlString.append(" null Linea_Misc47,  \n");
			qlString.append(" null Linea_Misc48,  \n");
			qlString.append(" null Linea_Misc49,  \n");
			qlString.append(" null Linea_Misc50,  \n");
			qlString.append(" null Linea_MedicionSecundaria,  \n");
			qlString.append(" null Linea_TipoIdent_Adicional,  \n");
			qlString.append(" null Linea_DescripIdioma,  \n");
			qlString.append(" null Linea_Cant_Adicional,  \n");
			qlString.append(" null Linea_Cant_Adicional_Tipo,  \n");
			qlString.append(" null Linea_Tipo_Referencia,  \n");
			qlString.append(" null Linea_Calif_NumIdentidad,  \n");
			qlString.append(" null Linea_TipoEmpaquetado,  \n");
			qlString.append(" null Linea_Metodo_Pago,  \n");
			qlString.append(" null Linea_Numero_Lote,  \n");
			qlString.append(" null Linea_Fecha_ProdLote,  \n");
			qlString.append(" null Linea_Ind_CargoDescuento,  \n");
			qlString.append(" null Linea_Inf_CargoDescuento,  \n");
			qlString.append(" null Línea_Secuencia_Calculo,  \n");
			qlString.append(" null Linea_Tipo_ServiciosEsp,  \n");
			qlString.append(" null Linea_Ident_Impuesto,  \n");
			qlString.append(" null Linea_Cod_EAN,  \n");
			qlString.append(" null Linea_NoIdentificacion  \n");
			qlString.append(" from   \n");
			qlString.append(" CLI_ATEBCOFIDI.dbo.cfdpagos pago  \n");
			qlString.append(" where   \n");
			qlString.append("  pago.empresa='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and pago.nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
				
					
			System.out.println("Query Pagos: {}" + qlString);
			query = em.createNativeQuery(qlString.toString());


			List<Object[]> objectLista = query.getResultList();
			
			
			if(objectLista != null) {
				
				respuesta = MapEspecOrdLineDetCfdTxtDTO.especOrdLinePagosDetalle(objectLista);
				
				
			}
		
		}catch (Exception e) {
			System.out.println("Error CompleDetalle " + e);
			
		}finally {
			
			
			return respuesta;

		}
		
	}
	
	
	
	@SuppressWarnings("finally")
	@Override
	public List<EstrucSecAuxComplePagoTxtDTO> getListaAuxPagosComplePago(FacturaRequest request) {
		// TODO Auto-generated method stub
		
		List<EstrucSecAuxComplePagoTxtDTO> listaAuxComplePago = new ArrayList<EstrucSecAuxComplePagoTxtDTO>(); 
		
		try {
			
			System.out.println("ENTRA a getListaAuxComplePagoTxtDTO  ..");

			StringBuilder qlString = new StringBuilder();
			qlString.append(" select * from (  \n");
			qlString.append(" select  \n");
			qlString.append(" 'CPG' Tipo, \n");
			qlString.append(" 'Pagos' DescTipo, \n");
			qlString.append(" p.folio ClavePago, \n");
			qlString.append(" '1.0' Version, \n");
			qlString.append(" CONVERT(varchar,p.fechaPago ,23)+'T12:00:00' FechaPago, --aaaa-mm-ddThh:mm:ss \n");
			qlString.append(" p.formaDePagoP FormaDePagoP,  \n");
			qlString.append(" p.monedaP MonedaP,  \n");
			qlString.append(" p.tipoCambioP TipoCambioP,  \n");
			qlString.append(" cast(p.monto as varchar) Monto,  \n");
			qlString.append(" p.numOperacion NumOperacion,  \n");
			qlString.append(" null RfcEmisorCtaOrd,   \n");
			qlString.append(" null NomBancoOrdExt,  \n");
			qlString.append(" null DetalleAux_Misc11, \n");
			qlString.append(" null DetalleAux_Misc12, \n");
			qlString.append(" null DetalleAux_Misc13, \n");
			qlString.append(" null DetalleAux_Misc14,  \n");
			qlString.append(" null DetalleAux_Misc15, \n");
			qlString.append(" null DetalleAux_Misc16 \n");
			qlString.append(" from  \n");
			qlString.append(" CLI_ATEBCOFIDI.dbo.CFDPagos pago inner join CLI_ATEBCOFIDI.dbo.cfdpago p on pago.pagoId=p.pagoId \n");
			qlString.append(" where  \n");
			
			qlString.append("  pago.Empresa='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and pago.NoDocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
			
			qlString.append(" union all \n");
			qlString.append(" select  \n");
			qlString.append(" 'CPG' Tipo, \n");
			qlString.append(" 'Pago' DescTipo, \n");
			qlString.append(" p.folio ClavePago, \n");
			qlString.append(" p.ctaOrdenante CtaOrdenante, \n");
			qlString.append(" p.rfcEmisorCtaBen, \n");
			qlString.append(" p.ctaBeneficiario,  \n");
			qlString.append(" p.tipoCadPago,  \n");
			qlString.append(" p.certPago,  \n");
			qlString.append(" p.cadPago,  \n");
			qlString.append(" p.selloPago,  \n");
			qlString.append(" null DetalleAux_Misc09,   \n");
			qlString.append(" null DetalleAux_Misc10,  \n");
			qlString.append(" null DetalleAux_Misc11, \n");
			qlString.append(" null DetalleAux_Misc12, \n");
			qlString.append(" null DetalleAux_Misc13, \n");
			qlString.append(" null DetalleAux_Misc14,  \n");
			qlString.append(" null DetalleAux_Misc15, \n");
			qlString.append(" null DetalleAux_Misc16 \n");
			qlString.append(" from  \n");
			qlString.append(" CLI_ATEBCOFIDI.dbo.CFDPago pagos inner join CLI_ATEBCOFIDI.dbo.cfdpago p on pagos.pagoId=p.pagoId \n");
			qlString.append(" where  \n");
			
			qlString.append(" pagos.Empresa='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and pagos.NoDocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
			
			qlString.append(" union all \n");
			qlString.append(" select  \n");
			qlString.append(" 'CPG' Tipo, \n");
			qlString.append(" 'DoctoRelacionado' DescTipo, \n");
			qlString.append(" docto.noDocumento ClavePago, \n");
			qlString.append(" docto.idDocumento, \n");
			qlString.append(" docto.serie,  \n");
			qlString.append(" docto.folio, \n");
			qlString.append(" docto.monedaDR, \n");
			qlString.append(" case when docto.monedaDR!=p.monedaP then docto.tipoCambioDR else null end tipoCambioDR, \n");
			qlString.append(" docto.metodoDePagoDR, \n");
			qlString.append(" docto.numParcialidad, \n");
			qlString.append(" cast(cast(round(docto.impSaldoAnt,2,1) as decimal(18,2)) as varchar) impSaldoAnt, \n");
			qlString.append(" cast(cast(round(docto.impPagado,2,1) as decimal(18,2)) as varchar) impPagado, \n");
			qlString.append(" cast(cast(round(docto.impSaldoInsoluto,2,1) as decimal(18,2)) as varchar) impSaldoInsoluto, \n");
			qlString.append(" null DetalleAux_Misc12, \n");
			qlString.append(" null DetalleAux_Misc13, \n");
			qlString.append(" null DetalleAux_Misc14,  \n");
			qlString.append(" null DetalleAux_Misc15, \n");
			qlString.append(" null DetalleAux_Misc16 \n");
			qlString.append(" from  \n");
			qlString.append(" CLI_ATEBCOFIDI.dbo.CFDPagoDoctoRelacionado docto inner join CLI_ATEBCOFIDI.dbo.cfdpago p on docto.noDocumento=p.noDocumento inner join CLI_ATEBCOFIDI.dbo.CFDPagos pago on pago.pagoId=p.pagoId  \n");
			qlString.append(" where  \n");
		
			qlString.append(" docto.Empresa='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and pago.NoDocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
			
			qlString.append(" ) tt order by 3,2 desc,4 \n");
			
			
			System.out.println("Query getListaAuxPagosComplePago: {}" + qlString);
			
			
			query = em.createNativeQuery(qlString.toString());
			List<Object[]> objectListaEncabezado = query.getResultList();
			
			
			if(objectListaEncabezado != null) {
				
				listaAuxComplePago.addAll(MapEstrucSecAuxComplePagoTxtDTO.estrucSecAuxPagosComplePago(objectListaEncabezado));
				
			}
			
			
		}catch (Exception e) {
				System.out.println("Error getListaAuxComplePagoTxtDTO" + e);
						
		}finally {
						
			return listaAuxComplePago;

		}
		
		
	}
	
	

}
