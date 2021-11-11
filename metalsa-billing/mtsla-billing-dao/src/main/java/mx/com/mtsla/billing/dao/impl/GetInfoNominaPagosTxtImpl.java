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
import mx.com.mtsla.billing.dao.GetInfoNominaPagosTxtDao;
import mx.com.mtsla.billing.dao.map.MapEspecOrdEncaFacElecTxtDTO;
import mx.com.mtsla.billing.dao.map.MapEspecOrdLineDetCfdTxtDTO;
import mx.com.mtsla.billing.dao.map.MapEstrucSecAuxComplePagoTxtDTO;

@Stateless
public class GetInfoNominaPagosTxtImpl implements GetInfoNominaPagosTxtDao{
	
	@PersistenceContext(unitName = "jdbc/mtlsa_COFIDI_SSQL")
	private EntityManager em;

	private Query query;
	
	
	@SuppressWarnings("finally")
	@Override
	public List<EspecOrdEncaFacElecTxtDTO> getInfoNominaPagosEncabezado(FacturaRequest request) {
		
		List<EspecOrdEncaFacElecTxtDTO> respuesta = new ArrayList<EspecOrdEncaFacElecTxtDTO>();

		try {
			
			System.out.println("CREA OBJETO getInfoNominaPagosEncabezado  ..");

			StringBuilder qlString = new StringBuilder();
			qlString.append(" select  \n");
			//qlString.append("	--FORMAT (CURRENT_TIMESTAMP, 'yyyyMMddhhmmsss') \n");
			qlString.append("	enc.Referencia Folio,  \n");
			qlString.append("	emp.RazonSocial Nombre_Emisor,  \n");
			qlString.append("	emp.RFC RFC_Emisor,  \n");
			qlString.append("	dir_emi.Calle Dom_Emisor_calle,  \n");
			qlString.append("	dir_emi.Numero Dom_Emisor_noExterior,  \n");
			qlString.append("	null Dom_Emisor_noInterior,  \n");
			qlString.append("	dir_emi.Colonia Dom_Emisor_colonia,  \n");
			qlString.append("	dir_emi.Localidad Dom_Emisor_localidad,  \n");
			qlString.append("	dir_emi.ReferenciaDireccion Dom_Emisor_referencia,  \n");
			qlString.append("	dir_emi.Delegacion Dom_Emisor_municipio,  \n");
			qlString.append("	dir_emi.Estado Dom_Emisor_estado,  \n");
			qlString.append("	dir_emi.Pais Dom_Emisor_pais,  \n");
			qlString.append("	dir_emi.CP Dom_Emisor_codigoPostal,  \n");
			qlString.append("	dir_emi_tel.Telefono,  \n");
			qlString.append("	dir_exp.Calle Dom_Sucursal_calle,  \n");
			qlString.append("	dir_exp.Numero Dom_Sucursal_noExterior,  \n");
			qlString.append("	null Dom_Sucursal_noInterior,  \n");
			qlString.append("	dir_exp.Colonia Dom_Sucursal_colonia,  \n");
			qlString.append("	dir_exp.Localidad Dom_Sucursal_localidad,  \n");
			qlString.append("	dir_exp.ReferenciaDireccion Dom_Sucursal_referencia,  \n");
			qlString.append("	dir_exp.Delegacion Dom_Sucursal_municipio,  \n");
			qlString.append("	dir_exp.Estado Dom_Sucursal_estado,  \n");
			qlString.append("	dir_exp.Pais Dom_Sucursal_pais,  \n");
			qlString.append("	dir_exp.CP Dom_Sucursal_codigoPostal,  \n");
			qlString.append("	null Tel_Sucursal,  \n");
			qlString.append("	emp.VersionCFD Version,  \n");
			qlString.append("	null Serie_Comprobante,  \n");
			qlString.append("	null Numero_Aprobacion,  \n");
			qlString.append("	'99' FormaPago,  \n");
			qlString.append("	cast(CONVERT(varchar,CURRENT_TIMESTAMP,23) as varchar) Fecha,  \n");
			qlString.append("	cast(CONVERT(varchar,CURRENT_TIMESTAMP,24) as varchar) Hora,  \n");
			qlString.append("	dir_exp.Calle Dom_LugarExpide_calle,  \n");
			qlString.append("	dir_exp.Numero Dom_LugarExpide_noExterior,  \n");
			qlString.append("	null Dom_LugarExpide_noInterior,  \n");
			qlString.append("	dir_exp.Colonia Dom_LugarExpide_colonia,  \n");
			qlString.append("	dir_exp.Localidad Dom_LugarExpide_localidad,  \n");
			qlString.append("	dir_exp.ReferenciaDireccion Dom_LugarExpide_referencia,  \n");
			qlString.append("	dir_exp.Delegacion Dom_LugarExpide_municipio,  \n");
			qlString.append("	dir_exp.Estado Dom_LugarExpide_estado,  \n");
			qlString.append("	dir_exp.Pais Dom_LugarExpide_pais,  \n");
			qlString.append("	dir_exp.CP Dom_LugarExpide_codigoPostal,  \n");
			qlString.append("	enc.RazonSocial Nombre_Receptor,  \n");
			qlString.append("	enc.RFC RFC_Receptor,  \n");
			qlString.append("	enc.Calle Dom_Receptor_calle,  \n");
			qlString.append("	enc.Numero Dom_Receptor_noExterior,  \n");
			qlString.append("	null Dom_Receptor_noInterior,  \n");
			qlString.append("	enc.Colonia Dom_Receptor_colonia,  \n");
			qlString.append("	enc.Localidad Dom_Receptor_localidad,  \n");
			qlString.append("	enc.ReferenciaDireccion Dom_Receptor_referencia,  \n");
			qlString.append("	enc.Delegacion Dom_Receptor_municipio,  \n");
			qlString.append("	enc.Estado Dom_Receptor_estado,  \n");
			qlString.append("	enc.Pais Dom_Receptor_pais,  \n");
			qlString.append("	enc.CP Dom_Receptor_codigoPostal,  \n");
			qlString.append("	enc.SubTotal Monto_SubTotal,  \n");
			qlString.append("	isnull(enc.Impuesto,0) Monto_Impuestos,  \n");
			qlString.append("	enc.Monto Monto_Total,  \n");
			qlString.append("	1 Estado,  --Valor Fijo  \n");
			qlString.append("	'NM' TipoCFD,  \n");
			qlString.append("	null notas,   \n");
			qlString.append("	null notas02,  \n");
			qlString.append("	null Notas03,  \n");
			qlString.append("	null TradingPartner_Prov,  \n");
			qlString.append("	null Calif_TradingPartner_Prov,  \n");
			qlString.append("	null EAN_Proveedor,  \n");
			qlString.append("	null Numero_Factura,  \n");
			qlString.append("	null Numero_OrdenCompra,  \n");
			qlString.append("	null Fecha_OrdenCompra,  \n");
			qlString.append("	null Numero_Proveedor,  \n");
			qlString.append("	null EAN_Tienda,  \n");
			qlString.append("	null Numero_Tienda,  \n");
			qlString.append("	null Nombre_Tienda,  \n");
			qlString.append("	null Dom_Tienda_calle,  \n");
			qlString.append("	null Dom_Tienda_noExterior,  \n");
			qlString.append("	null Dom_Tienda_noInterior,  \n");
			qlString.append("	null Dom_Tienda_colonia,  \n");
			qlString.append("	null Dom_Tienda_localidad,  \n");
			qlString.append("	null Dom_Tienda_referencia,  \n");
			qlString.append("	null Dom_Tienda_municipio,  \n");
			qlString.append("	null Dom_Tienda_estado,  \n");
			qlString.append("	null Dom_Tienda_pais,  \n");
			qlString.append("	null Dom_Tienda_codigoPostal,  \n");
			qlString.append("	null RFC_Tienda,  \n");
			qlString.append("	'MXN' Cod_Moneda,  \n");
			qlString.append("	null Dias_Pago,   \n");
			qlString.append("	null Porc_Desc_ProntoPago,  \n");
			qlString.append("	null Monto_Desc_ProntoPago,  \n");
			qlString.append("	null Cod_Descuento,  \n");
			qlString.append("	null Porc_Descuento,  \n");
			qlString.append("	cast(cast(round(nom_enc.TotalDeducciones,2,1) as decimal(18,2)) as varchar) Monto_Descuento,  \n");
			qlString.append("	null Cantidad_LineasFactura,  \n");
			qlString.append("	null Fecha_Vencimiento,  \n");
			qlString.append("	null Cod_Zona,  \n");
			qlString.append("	null Numero_Receptor,  \n");
			qlString.append("	null Cod_Vendedor,  \n");
			qlString.append("	null Nombre_Vendedor,  \n");
			qlString.append("	null Via_Embarque,  \n");
			qlString.append("	null Condiciones_Pago,  \n");
			qlString.append("	null Numero_Pedido,  \n");
			qlString.append("	null Fecha_Pedido,  \n");
			qlString.append("	null Letras_Monto_Total,  \n");
			qlString.append("	null Cantidad_unidades,  \n");
			qlString.append("	null Cantidad_empaques,  \n");
			qlString.append("	null EAN_Receptor,  \n");
			qlString.append("	null EAN_LugarExpide,  \n");
			qlString.append("	null IEPS_Id,  \n");
			qlString.append("	null Estatus,  \n");
			qlString.append("	null Numero_Emisor,  \n");
			qlString.append("	null Monto_Merma,  \n");
			qlString.append("	null Monto_SubTotal_ApIVA,  \n");
			qlString.append("	null Transportista,  \n");
			qlString.append("	null Numero_Solicitud,  \n");
			qlString.append("	null Desc_Moneda,  \n");
			qlString.append("	0 FaltasJustificadas, --misc01  \n");
			qlString.append("	0 FaltasInjustificadas, --misc02  \n");
			qlString.append("	null misc03,  \n");
			qlString.append("	null misc04,  \n");
			qlString.append("	null misc05,  \n");
			qlString.append("	null Misc06,  \n");
			qlString.append("	null Misc07,  \n");
			qlString.append("	null Misc08,  \n");
			qlString.append("	null Misc09,  \n");
			qlString.append("	null Misc10,  \n");
			qlString.append("	null misc11,  \n");
			qlString.append("	null misc12,  \n");
			qlString.append("	null misc13,  \n");
			qlString.append("	null misc14,  \n");
			qlString.append("	null Misc15,  \n");
			qlString.append("	null Misc16,  \n");
			qlString.append("	null Misc17,  \n");
			qlString.append("	null Misc18,  \n");
			qlString.append("	null misc19,  \n");
			qlString.append("	null misc20,  \n");
			qlString.append("	null misc21,  \n");
			qlString.append("	null misc22,  \n");
			qlString.append("	null misc23,  \n");
			qlString.append("	null misc24,  \n");
			qlString.append("	null misc25,  \n");
			qlString.append("	null misc26,  \n");
			qlString.append("	null misc27,  \n");
			qlString.append("	null misc28,  \n");
			qlString.append("	null misc29,  \n");
			qlString.append("	enc.NoDocumento misc30,  \n");
			qlString.append("	null misc31,  \n");
			qlString.append("	'P01' misc32,  \n");
			qlString.append("	null Misc33,  \n");
			qlString.append("	null Misc34,  \n");
			qlString.append("	null Misc35,  \n");
			qlString.append("	null Misc36,  \n");
			qlString.append("	null Misc37,  \n");
			qlString.append("	null Misc38,  \n");
			qlString.append("	null Misc39,  \n");
			qlString.append("	null Misc40,  \n");
			qlString.append("	null Misc41,  \n");
			qlString.append("	null Misc42,  \n");
			qlString.append("	null Misc43,  \n");
			qlString.append("	null Misc44,  \n");
			qlString.append("	null Misc45,  \n");
			qlString.append("	null Misc46,  \n");
			qlString.append("	null Misc47,  \n");
			qlString.append("	null Misc48,  \n");
			qlString.append("	null Misc49,  \n");
			qlString.append("	null Misc50,  \n");
			qlString.append("	null Porc_IVA,  \n");
			qlString.append("	null Monto_IEPS,  \n");
			qlString.append("	'ORIGINAL' Document_Status,  \n");
			qlString.append("	null Delivery_Date,  \n");
			qlString.append("	(SELECT top 1 rtrim(Regimen) FROM NOMCOFIDI.dbo.EmpresaRF where empresa=enc.Empresa) RegimenFiscal,  \n");
			qlString.append("	null Num_CtaPago,  \n");
			qlString.append("	null Num_contrarecibo,  \n");
			qlString.append("	null Fecha_Num_contrarecibo,  \n");
			qlString.append("	null Contacto_Compras,  \n");
			qlString.append("	null Customs_gln,  \n");
			qlString.append("	null Alternate_identification_gln,  \n");
			qlString.append("	null Nombre_Aduana,  \n");
			qlString.append("	null Nombre_Aduana_Ciudad,  \n");
			qlString.append("	null Func_Divisa,  \n");
			qlString.append("	null Tasa_Divisa,  \n");
			qlString.append("	null Ref_Tiempo_Pago,  \n");
			qlString.append("	null Ref_Termino_Tiempo_Pago,  \n");
			qlString.append("	dir_exp.CP LugarExpedicion,  \n");
			qlString.append("	null SerieFolioFiscalOrig,  \n");
			qlString.append("	null Tipo_Especial_de_Servicio,  \n");
			qlString.append("	null FechaFolioFiscalOrig,  \n");
			qlString.append("	null Porcentaje_no_aplicado,  \n");
			qlString.append("	null MontoFolioFiscalOrig,  \n");
			qlString.append("	null Monto_Total_Descuentos,  \n");
			qlString.append("	null Monto_Total_Pagar,  \n");
			qlString.append("	null Ano_Aprobacion,  \n");
			qlString.append("	null Motivo_Descuento,  \n");
			qlString.append("	'PUE' Metodo_Pago,  \n");
			qlString.append("	'N' Efecto_Comprobante,  \n");
			qlString.append("	enc.Impuesto Monto_TotalImp_Retenidos,  \n");
			qlString.append("	enc.Retencion Monto_TotalImp_Traslados  \n");
			qlString.append(" from   \n");
			qlString.append("	IntegraNomina.dbo.cfdenc enc  \n");
			qlString.append("	inner join NOMCOFIDI.dbo.empresa emp on enc.Empresa=emp.empresa  \n");
			qlString.append("	inner join NOMCOFIDI.dbo.Direccion dir_emi on enc.Empresa=dir_emi.empresa and dir_emi.id='DE' AND dir_emi.TipoDireccion='F'  \n");
			qlString.append("	left join NOMCOFIDI.dbo.Contactos dir_emi_con on enc.Empresa=dir_emi_con.Empresa and dir_emi_con.cliente='DE'  \n");
			qlString.append("	left join  NOMCOFIDI.dbo.telefono dir_emi_tel on dir_emi_con.Empresa=dir_emi_tel.Empresa and dir_emi_con.Cliente=dir_emi_tel.Cliente and dir_emi_con.Contacto=dir_emi_tel.Contacto and dir_emi_tel.TipoTelefono='O'  \n");
			qlString.append("	left join NOMCOFIDI.dbo.Direccion dir_exp on enc.Empresa=dir_exp.empresa and dir_exp.id='DE' AND dir_exp.TipoDireccion='X'  \n");
			qlString.append("	left join NOMCOFIDI.dbo.CFDNominaEnc nom_enc on nom_enc.Empresa=enc.Empresa and nom_enc.NoDocumento=enc.NoDocumento  \n");
			qlString.append(" 	where  \n");
			qlString.append("  enc.Empresa='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and enc.NoDocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
			
			
			System.out.println("Query Nomina Pagos: {}" + qlString);
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
	public List<EspecOrdLineDetCfdTxtDTO> getInfoNominaPagosCompleDetalle(FacturaRequest request) {
		// TODO Auto-generated method stub
		
		List<EspecOrdLineDetCfdTxtDTO> respuesta = new ArrayList<EspecOrdLineDetCfdTxtDTO>();
		

		try {
			System.out.println("CREA OBJETO getInfoNominaPagosCompleDetalle  ..");

			StringBuilder qlString = new StringBuilder();
			qlString.append(" select  \n");
			qlString.append(" 'Pago de nómina' Linea_Descripcion,  \n");
			qlString.append(" cast(cast(round(det.cantidad,2,1) as decimal(18,2)) as varchar) Linea_Cantidad,  \n");
			qlString.append(" 'ACT' Linea_Unidad,  \n");
			qlString.append(" cast(cast(round(det.precio,2,1) as decimal(18,2)) as varchar) Linea_PrecioUnitario,  \n");
			qlString.append(" cast(cast(round(det.importe,2,1) as decimal(18,2)) as varchar) Linea_Importe,  \n");
			qlString.append(" null Linea_Aduana_NumDoc,  \n");
			qlString.append(" null Linea_Aduana_FechaDoc,  \n");
			qlString.append(" null Linea_Aduana_Nombre,  \n");
			qlString.append(" null Linea_CuentaPredial_Numero,  \n");
			qlString.append(" (case when (select top 1 fraccionarancelaria from CLI_ATEBCOFIDI.dbo.Productos where Producto=det.Producto and Empresa=det.Empresa) is null and enc.tipodocumento in('01','04') then '8708999999' else (select top 1 fraccionarancelaria from CLI_ATEBCOFIDI.dbo.Productos where Producto=det.Producto and Empresa=det.Empresa) end ) fraccionarancelaria,  \n");
			qlString.append(" null Linea_Notas,  \n");
			qlString.append(" null Linea_Cod_UPC,  \n");
			qlString.append(" null Linea_Piezas_Empaque,  \n");
			qlString.append(" null Linea_Cod_DUN,  \n");
			qlString.append(" null Linea_Cod_Barras,  \n");
			qlString.append(" '84111505' Linea_Cod_Articulo,  \n");
			qlString.append(" null Linea_Cod_Desc,  \n");
			qlString.append(" null Linea_Porc_Desc,  \n");
			qlString.append(" cast(cast(round(nom_enc.TotalDeducciones,2,1) as decimal(18,2)) as varchar) Linea_Monto_Desc,  \n");
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
			qlString.append(" det.producto Linea_NoIdentificacion  \n");
			qlString.append(" from   \n");
			qlString.append(" IntegraNomina.dbo.cfddet det   \n");
			qlString.append(" inner join IntegraNomina.dbo.cfdenc enc on enc.Empresa=det.Empresa and enc.NoDocumento=det.NoDocumento  \n");
			qlString.append(" left join IntegraNomina.dbo.CFDNominaEnc nom_enc on nom_enc.Empresa=det.Empresa and nom_enc.NoDocumento=det.NoDocumento   \n");
			
			
			qlString.append(" where   \n");
			qlString.append("  det.empresa='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and det.nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
				
					
			System.out.println("Query Nomina Pagos: {}" + qlString);
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
	public List<EstrucSecAuxComplePagoTxtDTO> getListaAuxPagosNominaPago(FacturaRequest request) {
		// TODO Auto-generated method stub
		
		List<EstrucSecAuxComplePagoTxtDTO> listaAuxComplePago = new ArrayList<EstrucSecAuxComplePagoTxtDTO>(); 
		
		try {
			
			System.out.println("ENTRA a getListaAuxNominaPagoTxtDTO  ..");

			StringBuilder qlString = new StringBuilder();
			
			qlString.append(" select  \n");
			qlString.append(" 'NM' DetalleAux_Tipo,  \n");
			qlString.append(" 'Encabezado' DetalleAux_DescTipo, \n");
			qlString.append(" cast('1.2' as varchar) DetalleAux_Misc01, \n");
			qlString.append(" 'O' DetalleAux_Misc02, \n");
			qlString.append(" convert(varchar, nom_enc.FechaPago, 23) DetalleAux_Misc03, \n");
			qlString.append(" convert(varchar, nom_enc.FechaInicialPago, 23) DetalleAux_Misc04, \n");
			qlString.append(" convert(varchar, nom_enc.FechaFinalPago, 23) DetalleAux_Misc05, \n");
			qlString.append(" cast(cast(round(nom_enc.NumDiasPagados,2,1) as decimal(18,0)) as varchar) DetalleAux_Misc06, \n");
			qlString.append(" cast(cast(round(nom_enc.TotalPercepciones,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc07, \n");
			qlString.append(" cast(cast(round(nom_enc.TotalDeducciones,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc08, \n");
			qlString.append(" cast(cast(round(nom_enc.TotalOtrosPagos,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc09, \n");
			qlString.append(" cast(cast(round(nom_enc.SalarioDiarioIntegrado*30 ,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc10, \n");
			qlString.append(" null DetalleAux_Misc11, \n");
			qlString.append(" null DetalleAux_Misc12, \n");
			qlString.append(" null DetalleAux_Misc13, \n");
			qlString.append(" null DetalleAux_Misc14, \n");
			qlString.append(" null DetalleAux_Misc15, \n");
			qlString.append(" null DetalleAux_Misc16 \n");
			qlString.append(" from IntegraNomina.dbo.CFDNominaEnc nom_enc \n");
			qlString.append(" where \n");
			//nom_enc.empresa = @EMPRESA
			//and nom_enc.nodocumento= @NODOCUMENTO
			qlString.append("  nom_enc.empresa ='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and nom_enc.nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n"); 
			
			qlString.append(" union all \n");
			qlString.append(" select  \n");
			qlString.append(" 'NM' DetalleAux_Tipo,  \n");
			qlString.append(" 'Emisor' DetalleAux_DescTipo, \n");
			qlString.append(" nom_emp.CURP DetalleAux_Misc01, \n");
			qlString.append(" nom_enc.RegistroPatronal DetalleAux_Misc02, \n");
			qlString.append(" nom_enc.RfcPatronOrigen DetalleAux_Misc03, \n");
			qlString.append(" nom_enc.OrigenRecurso DetalleAux_Misc04, \n");
			qlString.append(" cast(nom_enc.MontoRecursoPropio as varchar) DetalleAux_Misc05, \n");
			qlString.append(" null DetalleAux_Misc06, \n");
			qlString.append(" null DetalleAux_Misc07, \n");
			qlString.append(" null DetalleAux_Misc08, \n");
			qlString.append(" null DetalleAux_Misc09, \n");
			qlString.append(" null DetalleAux_Misc10, \n");
			qlString.append(" null DetalleAux_Misc11, \n");
			qlString.append(" null DetalleAux_Misc12, \n");
			qlString.append(" null DetalleAux_Misc13, \n");
			qlString.append(" null DetalleAux_Misc14, \n");
			qlString.append(" null DetalleAux_Misc15, \n");
			qlString.append(" null DetalleAux_Misc16 \n");
			qlString.append(" from IntegraNomina.dbo.CFDNominaEnc nom_enc inner join NOMCOFIDI.dbo.empresa nom_emp on nom_enc.Empresa=nom_emp.Empresa \n");
			qlString.append(" where  \n");
			//nom_enc.empresa = @EMPRESA
			//and nom_enc.nodocumento= @NODOCUMENTO
			qlString.append("  nom_enc.empresa ='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and nom_enc.nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n"); 
			
			qlString.append(" union all \n");
			qlString.append(" select  \n");
			qlString.append(" 'NM' DetalleAux_Tipo,  \n");
			qlString.append(" 'Receptor1' DetalleAux_DescTipo, \n");
			qlString.append(" nom_enc.CURP DetalleAux_Misc01, \n");
			qlString.append(" nom_enc.NumSeguridadSocial DetalleAux_Misc02, \n");
			qlString.append(" convert(varchar, nom_enc.FechaInicioRelLaboral,23) DetalleAux_Misc03, \n");
			qlString.append(" 'P'+cast(((DATEDIFF(DAY,nom_enc.FechaInicioRelLaboral,nom_enc.FechaFinalPago)+1)/7) as varchar)+'W' DetalleAux_Misc04, \n");
			qlString.append(" nom_enc.TipoContrato DetalleAux_Misc05, \n");
			qlString.append(" nom_enc.Sindicalizado DetalleAux_Misc06, \n");
			qlString.append(" cast(nom_enc.TipoJornada as varchar) DetalleAux_Misc07, \n");
			qlString.append(" cast(nom_enc.TipoRegimen as varchar) DetalleAux_Misc08, \n");
			qlString.append(" nom_enc.NumEmpleado DetalleAux_Misc09, \n");
			qlString.append(" nom_enc.Departamento DetalleAux_Misc10, \n");
			qlString.append(" nom_enc.Puesto DetalleAux_Misc11, \n");
			qlString.append(" nom_enc.RiesgoPuesto DetalleAux_Misc12, \n");
			qlString.append(" nom_enc.PeriodicidadPago DetalleAux_Misc13, \n");
			qlString.append(" nom_enc.Banco DetalleAux_Misc14, \n");
			qlString.append(" nom_enc.CLABE DetalleAux_Misc15, \n");
			qlString.append(" null DetalleAux_Misc16 \n");
			qlString.append(" from IntegraNomina.dbo.CFDNominaEnc nom_enc \n");
			qlString.append(" where  \n");
			//nom_enc.empresa = @EMPRESA
			//and nom_enc.nodocumento= @NODOCUMENTO
			qlString.append("  nom_enc.empresa ='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and nom_enc.nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n"); 
			 
			qlString.append(" union all \n");
			qlString.append(" select  \n");
			qlString.append(" 'NM' DetalleAux_Tipo,   \n");
			qlString.append(" 'Receptor2' DetalleAux_DescTipo,  \n");
			qlString.append(" cast(cast(round(nom_enc.SalarioBaseCotApor,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc01,  \n");
			qlString.append(" cast(cast(round(nom_enc.SalarioDiarioIntegrado,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc02,  \n");
			qlString.append(" nom_enc.ClaveEntFed DetalleAux_Misc03,  \n");
			qlString.append(" null DetalleAux_Misc04,  \n");
			qlString.append(" null DetalleAux_Misc05,  \n");
			qlString.append(" null DetalleAux_Misc06,  \n");
			qlString.append(" null DetalleAux_Misc07,  \n");
			qlString.append(" null DetalleAux_Misc08,  \n");
			qlString.append(" null DetalleAux_Misc09,  \n");
			qlString.append(" null DetalleAux_Misc10,  \n");
			qlString.append(" null DetalleAux_Misc11,  \n");
			qlString.append(" null DetalleAux_Misc12,  \n");
			qlString.append(" null DetalleAux_Misc13,  \n");
			qlString.append(" null DetalleAux_Misc14,  \n");
			qlString.append(" null DetalleAux_Misc15,  \n");
			qlString.append(" null DetalleAux_Misc16  \n");
			qlString.append(" from IntegraNomina.dbo.CFDNominaEnc nom_enc  \n");
			qlString.append(" where   \n");
			// nom_enc.empresa = @EMPRESA
			// and nom_enc.nodocumento= @NODOCUMENTO
			qlString.append("  nom_enc.empresa ='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and nom_enc.nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
			
			qlString.append(" union all  \n");
			qlString.append(" select   \n");
			qlString.append(" 'NM' DetalleAux_Tipo,   \n");
			qlString.append(" 'Percepciones' DetalleAux_DescTipo,  \n");
			qlString.append(" cast(cast(round(nom_enc.TotalSueldos,2,1) as decimal(18,2)) as varchar)  DetalleAux_Misc01,  \n");
			qlString.append(" CASE WHEN nom_enc.TotalSeparacionIndemnizacion=0 THEN NULL ELSE cast(cast(round(nom_enc.TotalSeparacionIndemnizacion,2,1) as decimal(18,2)) as varchar) END DetalleAux_Misc02,  \n");
			qlString.append(" CASE WHEN nom_enc.TotalJubilacionPensionRetiro=0 THEN NULL ELSE cast(cast(round(nom_enc.TotalJubilacionPensionRetiro,2,1) as decimal(18,2)) as varchar) END DetalleAux_Misc03,  \n");
			qlString.append(" cast(cast(round(nom_enc.TotalGravado,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc04,  \n");
			qlString.append(" cast(cast(round(nom_enc.TotalExento,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc05,  \n");
			qlString.append(" null DetalleAux_Misc06,  \n");
			qlString.append(" null DetalleAux_Misc07,  \n");
			qlString.append(" null DetalleAux_Misc08,  \n");
			qlString.append(" null DetalleAux_Misc09,  \n");
			qlString.append(" null DetalleAux_Misc10,  \n");
			qlString.append(" null DetalleAux_Misc11,  \n");
			qlString.append(" null DetalleAux_Misc12,  \n");
			qlString.append(" null DetalleAux_Misc13,  \n");
			qlString.append(" null DetalleAux_Misc14,  \n");
			qlString.append(" null DetalleAux_Misc15,  \n");
			qlString.append(" null DetalleAux_Misc16  \n");
			qlString.append(" from IntegraNomina.dbo.CFDNominaEnc nom_enc  \n");
			qlString.append(" where  \n");
			//nom_enc.empresa = @EMPRESA
			//and nom_enc.nodocumento= @NODOCUMENTO
			qlString.append("  nom_enc.empresa ='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and nom_enc.nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
			
			//where empresa=@empresa and NoDocumento=@NODOCUMENTO)>0  \n");
			qlString.append(" and (select count(*) from IntegraNomina.dbo.CFDNominaPercepcion where empresa='");
			qlString.append(request.getEmpresa().trim()); 
			qlString.append("' ");
			qlString.append(" and NoDocumento=");
			qlString.append(request.getNumDoc().trim());
			qlString.append(" )>0  \n");
			
			qlString.append(" union all \n");
			qlString.append(" select  \n");
			qlString.append(" 'NM' DetalleAux_Tipo,  \n");
			qlString.append(" 'Percepcion' DetalleAux_DescTipo, \n");
			qlString.append(" cast(right( '00' + cast( nom_per.TipoPercepcion AS varchar(3)), 3 )  as varchar) DetalleAux_Misc01, \n");
			qlString.append(" nom_per.Clave DetalleAux_Misc02, \n");
			qlString.append(" nom_per.Concepto DetalleAux_Misc03, \n");
			qlString.append(" cast(cast(round(nom_per.ImporteGravado,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc04, \n");
			qlString.append(" cast(cast(round(nom_per.ImporteExento,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc05, \n");
			qlString.append(" cast(cast(round(nom_per.ValorMercado,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc06, \n");
			qlString.append(" cast(cast(round(nom_per.PrecioalOtorgarse,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc07, \n");
			qlString.append(" (case when nom_per.Customfield='0' or TipoPercepcion='19' then null else nom_per.Customfield end)+' d' DetalleAux_Misc08, --Base \n");
			qlString.append(" cast(nom_per.Consecutivo as varchar) DetalleAux_Misc09, --posicion \n");
			qlString.append(" null DetalleAux_Misc10, \n");
			qlString.append(" null DetalleAux_Misc11, \n");
			qlString.append(" null DetalleAux_Misc12, \n");
			qlString.append(" null DetalleAux_Misc13, \n");
			qlString.append(" null DetalleAux_Misc14, \n");
			qlString.append(" null DetalleAux_Misc15, \n");
			qlString.append(" null DetalleAux_Misc16  \n");
			qlString.append(" from IntegraNomina.dbo.CFDNominaPercepcion nom_per \n");
			qlString.append(" where   \n");
			//nom_per.empresa = @EMPRESA
			//and nom_per.nodocumento= @NODOCUMENTO
			qlString.append("  nom_per.empresa ='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and nom_per.nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
			
			qlString.append(" union all  \n");
			qlString.append(" select   \n");
			qlString.append(" 'NM' DetalleAux_Tipo,   \n");
			qlString.append(" 'HorasExtra' DetalleAux_DescTipo,  \n");
			qlString.append(" --cast(right( '00' + cast( nom_hextra.Consecutivo AS varchar(3)), 3 )  as varchar)   \n");
			
			//qlString.append(" (select top 1 clave from IntegraNomina.dbo.CFDNominaPercepcion where NoDocumento=@NODOCUMENTO and TipoPercepcion='19') DetalleAux_Misc01,  \n");
			qlString.append(" (select top 1 clave from IntegraNomina.dbo.CFDNominaPercepcion where NoDocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("'  and TipoPercepcion='19') DetalleAux_Misc01,  \n");
			
			qlString.append(" cast(nom_hextra.Dias as varchar) DetalleAux_Misc02,  \n");
			qlString.append(" cast(nom_hextra.TipoHoras as varchar) DetalleAux_Misc03,  \n");
			qlString.append(" cast(nom_hextra.HorasExtra as varchar) DetalleAux_Misc04,  \n");
			qlString.append(" cast(cast(round(nom_hextra.ImportePagado,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc05,  \n");
			qlString.append(" case when nom_hextra.TipoHoras='01' then 'Doble' when nom_hextra.TipoHoras='02' then 'Triple' else 'Simple' end  DetalleAux_Misc06,  -- TipoHoraDesc  \n");
			qlString.append(" nom_hextra.HorasExtra+' h' DetalleAux_Misc07,  --Base  \n");
			qlString.append(" null DetalleAux_Misc08,  \n");
			qlString.append(" null DetalleAux_Misc09,  \n");
			qlString.append(" null DetalleAux_Misc10,  \n");
			qlString.append(" null DetalleAux_Misc11,  \n");
			qlString.append(" null DetalleAux_Misc12,  \n");
			qlString.append(" null DetalleAux_Misc13,  \n");
			qlString.append(" null DetalleAux_Misc14,  \n");
			qlString.append(" null DetalleAux_Misc15,  \n");
			qlString.append(" null DetalleAux_Misc16  \n");
			qlString.append(" from IntegraNomina.dbo.CFDNominaHorasExtra nom_hextra  \n");
			qlString.append(" where \n");
			// nom_hextra.empresa = @EMPRESA
			// and nom_hextra.nodocumento= @NODOCUMENTO
			qlString.append("  nom_hextra.empresa ='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and nom_hextra.nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
			
			qlString.append(" union all  \n");
			qlString.append(" select   \n");
			qlString.append(" 'NM' DetalleAux_Tipo,   \n");
			qlString.append(" 'Deducciones' DetalleAux_DescTipo,  \n");
			qlString.append(" cast(cast(round(nom_enc.TotalOtrasDeducciones,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc01,  \n");
			qlString.append(" cast(cast(round(nom_enc.TotalImpuestosRetenidos,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc02,  \n");
			qlString.append(" null DetalleAux_Misc03,  \n");
			qlString.append(" null DetalleAux_Misc04,  \n");
			qlString.append(" null DetalleAux_Misc05,  \n");
			qlString.append(" null DetalleAux_Misc06,  \n");
			qlString.append(" null DetalleAux_Misc07,  \n");
			qlString.append(" null DetalleAux_Misc08,  \n");
			qlString.append(" null DetalleAux_Misc09,  \n");
			qlString.append(" null DetalleAux_Misc10,  \n");
			qlString.append(" null DetalleAux_Misc11,  \n");
			qlString.append(" null DetalleAux_Misc12,  \n");
			qlString.append(" null DetalleAux_Misc13,  \n");
			qlString.append(" null DetalleAux_Misc14,  \n");
			qlString.append(" null DetalleAux_Misc15,  \n");
			qlString.append(" null DetalleAux_Misc16  \n");
			qlString.append(" from IntegraNomina.dbo.CFDNominaEnc nom_enc  \n");
			qlString.append(" where   \n");
			//nom_enc.empresa = @EMPRESA
			//and nom_enc.nodocumento= @NODOCUMENTO
			qlString.append("  nom_enc.empresa ='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and nom_enc.nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
				
			//qlString.append(" and (select count(*) from IntegraNomina.dbo.CFDNominaDeduccion where empresa=@empresa and NoDocumento=@NODOCUMENTO)>0  \n");
			qlString.append(" and (select count(*) from IntegraNomina.dbo.CFDNominaDeduccion where empresa='");
			qlString.append(request.getEmpresa().trim()); 
			qlString.append("' ");
			qlString.append(" and NoDocumento=");
			qlString.append(request.getNumDoc().trim());
			qlString.append(" )>0  \n");
			
			
			qlString.append(" union all \n");
			qlString.append(" select  \n");
			qlString.append(" 'NM' DetalleAux_Tipo,  \n");
			qlString.append(" 'Deduccion' DetalleAux_DescTipo, \n");
			qlString.append(" cast(right( '00' + cast( nom_ded.TipoDeduccion AS varchar(3)), 3 )  as varchar) DetalleAux_Misc01, \n");
			qlString.append(" nom_ded.Clave DetalleAux_Misc02, \n");
			qlString.append(" nom_ded.Concepto DetalleAux_Misc03, \n");
			qlString.append(" cast(cast(round(nom_ded.ImporteExento,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc04, \n");
			qlString.append(" 'SALDO' DetalleAux_Misc05, --posicion \n");
			qlString.append(" cast(nom_ded.Consecutivo as varchar) DetalleAux_Misc06, \n");
			qlString.append(" null DetalleAux_Misc07, \n");
			qlString.append(" null DetalleAux_Misc08, \n");
			qlString.append(" null DetalleAux_Misc09, \n");
			qlString.append(" null DetalleAux_Misc10, \n");
			qlString.append(" null DetalleAux_Misc11, \n");
			qlString.append(" null DetalleAux_Misc12, \n");
			qlString.append(" null DetalleAux_Misc13, \n");
			qlString.append(" null DetalleAux_Misc14, \n");
			qlString.append(" null DetalleAux_Misc15, \n");
			qlString.append(" null DetalleAux_Misc16  \n");
			qlString.append(" from IntegraNomina.dbo.CFDNominaDeduccion nom_ded \n");
			qlString.append(" where  \n");
			//nom_ded.empresa = @EMPRESA
			//and nom_ded.nodocumento= @NODOCUMENTO
			qlString.append("  nom_ded.empresa ='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and nom_ded.nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
				
			qlString.append(" union all \n");
			qlString.append(" select  \n");
			qlString.append(" 'NM' DetalleAux_Tipo,  \n");
			qlString.append(" 'OtrosPagos' DetalleAux_DescTipo, \n");
			
			//qlString.append(" cast(cast(round((select sum(subsidiocausado) from IntegraNomina.dbo.CFDNominaOtrosPagos where empresa=@empresa and nodocumento=@nodocumento),2,1) as decimal(18,2)) as varchar) DetalleAux_Misc01, \n");
			qlString.append(" cast(cast(round((select sum(subsidiocausado) from IntegraNomina.dbo.CFDNominaOtrosPagos where empresa='");
			qlString.append(request.getEmpresa().trim()); 
			qlString.append("' ");
			qlString.append(" and nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' ),2,1) as decimal(18,2)) as varchar) DetalleAux_Misc01, \n");
			
			
			
			//qlString.append(" case when (select sum(SaldoAFavor) from IntegraNomina.dbo.CFDNominaOtrosPagos where empresa=@empresa and nodocumento=@nodocumento)>0 then cast(cast(round((select sum(SaldoAFavor) from IntegraNomina.dbo.CFDNominaOtrosPagos where empresa=@empresa and nodocumento=@nodocumento),2,1) as decimal(18,2)) as varchar) else null end DetalleAux_Misc02, \n");
			qlString.append(" case when (select sum(SaldoAFavor) from IntegraNomina.dbo.CFDNominaOtrosPagos where empresa='");
			qlString.append(request.getEmpresa().trim()); 
			qlString.append("' ");
			qlString.append(" and nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' )>0 then cast(cast(round((select sum(SaldoAFavor) from IntegraNomina.dbo.CFDNominaOtrosPagos where empresa='");
			qlString.append(request.getEmpresa().trim()); 
			qlString.append("' ");
			qlString.append(" and nodocumento=");
			qlString.append(request.getNumDoc().trim());
			qlString.append(" ),2,1) as decimal(18,2)) as varchar) else null end DetalleAux_Misc02, \n");
			
			
			//qlString.append(" case when (select sum(SaldoAFavor) from IntegraNomina.dbo.CFDNominaOtrosPagos where empresa=@empresa and nodocumento=@nodocumento)>0 then cast(year(nom_otr.FechaPago) as varchar)  else null end DetalleAux_Misc03,  \n");
			qlString.append(" case when (select sum(SaldoAFavor) from IntegraNomina.dbo.CFDNominaOtrosPagos where empresa='");
			qlString.append(request.getEmpresa().trim()); 
			qlString.append("' ");
			qlString.append(" and nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("'  )>0 then cast(year(nom_otr.FechaPago) as varchar)  else null end DetalleAux_Misc03,  \n");
			
			
			//qlString.append(" case when (select sum(RemanenteSalFav) from IntegraNomina.dbo.CFDNominaOtrosPagos where empresa=@empresa and nodocumento=@nodocumento)>0 then cast(cast(round((select sum(RemanenteSalFav) from IntegraNomina.dbo.CFDNominaOtrosPagos where empresa=@empresa and nodocumento=@nodocumento),2,1) as decimal(18,2)) as varchar)  else null end DetalleAux_Misc04, \n");
			qlString.append(" case when (select sum(RemanenteSalFav) from IntegraNomina.dbo.CFDNominaOtrosPagos where empresa='");
			qlString.append(request.getEmpresa().trim()); 
			qlString.append("' ");
			qlString.append(" and nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' )>0 then cast(cast(round((select sum(RemanenteSalFav) from IntegraNomina.dbo.CFDNominaOtrosPagos where empresa='");
			qlString.append(request.getEmpresa().trim()); 
			qlString.append("' ");
			qlString.append(" and nodocumento=");
			qlString.append(request.getNumDoc().trim());
			qlString.append(" ),2,1) as decimal(18,2)) as varchar)  else null end DetalleAux_Misc04, \n");
			
			qlString.append(" null DetalleAux_Misc05, \n");
			qlString.append(" null DetalleAux_Misc06, \n");
			qlString.append(" null DetalleAux_Misc07, \n");
			qlString.append(" null DetalleAux_Misc08, \n");
			qlString.append(" null DetalleAux_Misc09, \n");
			qlString.append(" null DetalleAux_Misc10, \n");
			qlString.append(" null DetalleAux_Misc11, \n");
			qlString.append(" null DetalleAux_Misc12, \n");
			qlString.append(" null DetalleAux_Misc13, \n");
			qlString.append(" null DetalleAux_Misc14, \n");
			qlString.append(" null DetalleAux_Misc15, \n");
			qlString.append(" null DetalleAux_Misc16  \n");
			qlString.append(" from IntegraNomina.dbo.CFDNominaEnc nom_otr \n");
			qlString.append(" where  \n");
			//nom_otr.empresa = @EMPRESA
			//and nom_otr.nodocumento= @NODOCUMENTO
			qlString.append("  nom_otr.empresa ='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and nom_otr.nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
				
			//qlString.append(" and (select count(*) from IntegraNomina.dbo.CFDNominaOtrosPagos where empresa=@empresa and NoDocumento=@NODOCUMENTO)>0  \n");
			qlString.append(" and (select count(*) from IntegraNomina.dbo.CFDNominaOtrosPagos where empresa='");
			qlString.append(request.getEmpresa().trim()); 
			qlString.append("' ");
			qlString.append(" and NoDocumento=");
			qlString.append(request.getNumDoc().trim());
			qlString.append(" )>0  \n");
			
			qlString.append(" union all  \n");
			qlString.append(" select  \n");
			qlString.append(" 'NM' DetalleAux_Tipo,   \n");
			qlString.append(" 'OtroPago' DetalleAux_DescTipo,  \n");
			qlString.append(" cast(right( '00' + cast( nom_otro.TipoOtroPago AS varchar(3)), 3 )  as varchar) DetalleAux_Misc01,  \n");
			qlString.append(" nom_otro.Clave DetalleAux_Misc02,  \n");
			qlString.append(" nom_otro.Concepto DetalleAux_Misc03,  \n");
			qlString.append(" cast(cast(round(nom_otro.Importe,2,1) as decimal(18,2)) as varchar) DetalleAux_Misc04,  \n");
			qlString.append(" cast(nom_otro.Consecutivo as varchar) DetalleAux_Misc05, --posicion  \n");
			qlString.append(" null DetalleAux_Misc06,  \n");
			qlString.append(" null DetalleAux_Misc07,  \n");
			qlString.append(" null DetalleAux_Misc08,  \n");
			qlString.append(" null DetalleAux_Misc09,  \n");
			qlString.append(" null DetalleAux_Misc10,  \n");
			qlString.append(" null DetalleAux_Misc11,  \n");
			qlString.append(" null DetalleAux_Misc12,  \n");
			qlString.append(" null DetalleAux_Misc13,  \n");
			qlString.append(" null DetalleAux_Misc14,  \n");
			qlString.append(" null DetalleAux_Misc15,  \n");
			qlString.append(" null DetalleAux_Misc16  \n");
			qlString.append(" from IntegraNomina.dbo.CFDNominaOtrosPagos nom_otro  \n");
			qlString.append(" where   \n");
			//nom_otro.empresa = @EMPRESA
			//and nom_otro.nodocumento= @NODOCUMENTO
			qlString.append("  nom_otro.empresa ='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and nom_otro.nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
			
			
			System.out.println("Query getListaAuxPagosNominaPago: {}" + qlString);
			
			
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
