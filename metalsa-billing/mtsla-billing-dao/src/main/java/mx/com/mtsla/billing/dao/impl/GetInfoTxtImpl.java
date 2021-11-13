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
import mx.com.mtlsa.billing.dto.response.txt.EspecOrdLineImpuestoCfdTxtDTO;
import mx.com.mtlsa.billing.dto.response.txt.ListaAuxComplePagoTxtDTO;
import mx.com.mtsla.billing.dao.GetInfoTxtDao;
import mx.com.mtsla.billing.dao.map.MapEspecOrdEncaFacElecTxtDTO;
import mx.com.mtsla.billing.dao.map.MapEspecOrdLineDetCfdTxtDTO;
import mx.com.mtsla.billing.dao.map.MapEspecOrdLineImpuesto;
import mx.com.mtsla.billing.dao.map.MapEstrucSecAuxComplePagoTxtDTO;

@Stateless
public class GetInfoTxtImpl implements GetInfoTxtDao {

	@PersistenceContext(unitName = "jdbc/mtlsa_COFIDI_SSQL")
	private EntityManager em;

	private Query query;

	@SuppressWarnings("finally")
	@Override
	public List<EspecOrdEncaFacElecTxtDTO> getInfoFacEncabezado(FacturaRequest request) {
		
		List<EspecOrdEncaFacElecTxtDTO> respuesta = new ArrayList<EspecOrdEncaFacElecTxtDTO>();

		try {
			
			System.out.println("CREA OBJETO getInfoFacEncabezado  ..");

			StringBuilder qlString = new StringBuilder();
			qlString.append(" select    \n");
			qlString.append(" 	enc.NoDocumento Folio,  \n");
			qlString.append(" 	emp.RazonSocial Nombre_Emisor,  \n");
			qlString.append(" 	emp.RFC RFC_Emisor,  \n");
			qlString.append(" 	dir_emi.Calle Dom_Emisor_calle,  \n");
			qlString.append(" 	dir_emi.Numero Dom_Emisor_noExterior,  \n");
			qlString.append(" 	null Dom_Emisor_noInterior,  \n");
			qlString.append(" 	dir_emi.Colonia Dom_Emisor_colonia,  \n");
			qlString.append(" 	dir_emi.Localidad Dom_Emisor_localidad,  \n");
			qlString.append(" 	dir_emi.ReferenciaDireccion Dom_Emisor_referencia,  \n");
			qlString.append(" 	dir_emi.Delegacion Dom_Emisor_municipio,  \n");
			qlString.append(" 	dir_emi.Estado Dom_Emisor_estado,  \n");
			qlString.append(" 	dir_emi.Pais Dom_Emisor_pais,  \n");
			qlString.append(" 	dir_emi.CP Dom_Emisor_codigoPostal,  \n");
			qlString.append(" 	dir_emi_tel.Telefono,  \n");
			qlString.append(" 	dir_exp.Calle Dom_Sucursal_calle,  \n");
			qlString.append(" 	dir_exp.Numero Dom_Sucursal_noExterior,  \n");
			qlString.append(" 	null Dom_Sucursal_noInterior,  \n");
			qlString.append(" 	dir_exp.Colonia Dom_Sucursal_colonia,  \n");
			qlString.append(" 	dir_exp.Localidad Dom_Sucursal_localidad,  \n");
			qlString.append(" 	dir_exp.ReferenciaDireccion Dom_Sucursal_referencia,  \n");
			qlString.append(" 	dir_exp.Delegacion Dom_Sucursal_municipio,  \n");
			qlString.append(" 	dir_exp.Estado Dom_Sucursal_estado,  \n");
			qlString.append(" 	dir_exp.Pais Dom_Sucursal_pais,  \n");
			qlString.append(" 	dir_exp.CP Dom_Sucursal_codigoPostal,  \n");
			qlString.append(" 	null Tel_Sucursal,  \n");
			qlString.append(" 	emp.VersionCFD Version,  \n");
			qlString.append(" 	null Serie_Comprobante,  \n");
			qlString.append(" 	null Numero_Aprobacion,  \n");
			qlString.append(" 	emp.MetodoPago FormaPago,  \n");
			qlString.append(" 	CONVERT(varchar,CURRENT_TIMESTAMP,23) Fecha,  \n");
			qlString.append(" 	CONVERT(varchar,CURRENT_TIMESTAMP,24) Hora,  \n");
			qlString.append(" 	dir_exp.Calle Dom_LugarExpide_calle,  \n");
			qlString.append(" 	dir_exp.Numero Dom_LugarExpide_noExterior,  \n");
			qlString.append(" 	null Dom_LugarExpide_noInterior,  \n");
			qlString.append(" 	dir_exp.Colonia Dom_LugarExpide_colonia,  \n");
			qlString.append(" 	dir_exp.Localidad Dom_LugarExpide_localidad,  \n");
			qlString.append(" 	dir_exp.ReferenciaDireccion Dom_LugarExpide_referencia,  \n");
			qlString.append(" 	dir_exp.Delegacion Dom_LugarExpide_municipio,  \n");
			qlString.append(" 	dir_exp.Estado Dom_LugarExpide_estado,  \n");
			qlString.append(" 	dir_exp.Pais Dom_LugarExpide_pais,  \n");
			qlString.append(" 	dir_exp.CP Dom_LugarExpide_codigoPostal,  \n");
			qlString.append(" 	soc_com.RazonSocial Nombre_Receptor,  \n");
			qlString.append(" 	soc_com.RFC RFC_Receptor,  \n");
			qlString.append(" 	soc_com_dir.Calle Dom_Receptor_calle,  \n");
			qlString.append(" 	soc_com_dir.Numero Dom_Receptor_noExterior,  \n");
			qlString.append(" 	null Dom_Receptor_noInterior,  \n");
			qlString.append(" 	soc_com_dir.Colonia Dom_Receptor_colonia,  \n");
			qlString.append(" 	soc_com_dir.Localidad Dom_Receptor_localidad,  \n");
			qlString.append(" 	soc_com_dir.ReferenciaDireccion Dom_Receptor_referencia,  \n");
			qlString.append(" 	soc_com_dir.Delegacion Dom_Receptor_municipio,  \n");
			qlString.append(" 	soc_com_dir.Estado Dom_Receptor_estado,  \n");
			qlString.append(" 	soc_com_dir.Pais Dom_Receptor_pais,  \n");
			qlString.append(" 	soc_com_dir.CP Dom_Receptor_codigoPostal,  \n");
			qlString.append(" 	enc.SubTotal Monto_SubTotal,  \n");
			qlString.append(" 	enc.Impuesto Monto_Impuestos,  \n");
			qlString.append(" 	enc.Monto Monto_Total,  \n");
			qlString.append(" 	1 Estado,  --Valor Fijo   \n");
			qlString.append(
					" 	(case when enc.TipoDocumento='01' then 'FA' when enc.TipoDocumento='02' then 'NC' when enc.TipoDocumento='03' then 'NA' when enc.TipoDocumento='04' then 'CP' else '' end    ) TipoCFD,   \n");
			qlString.append(
					" 	(SELECT rtrim(nota) + ', ' AS 'data()' FROM CLI_ATEBCOFIDI.dbo.ADDEA5 where empresa=enc.empresa and NoDocumento=enc.NoDocumento  FOR XML PATH('') ) notas, --Comentarios de factura  \n");
			qlString.append(" 	enc.customfield12 notas02,  \n");
			qlString.append(
					" 	(SELECT rtrim(email) + ';' AS 'data()' FROM CLI_ATEBCOFIDI.dbo.Contactos where empresa=enc.Empresa and Cliente=enc.Cliente  FOR XML PATH('')) Notas03,  \n");
			qlString.append(" 	null TradingPartner_Prov,  \n");
			qlString.append(" 	null Calif_TradingPartner_Prov,  \n");
			qlString.append(" 	null EAN_Proveedor,  \n");
			qlString.append(" 	enc.NoDocumento Numero_Factura,  \n");
			qlString.append(" 	null Numero_OrdenCompra,  \n");
			qlString.append(" 	null Fecha_OrdenCompra,  \n");
			qlString.append(" 	customfield01 Numero_Proveedor,  \n");
			qlString.append(" 	null EAN_Tienda,  \n");
			qlString.append(" 	dir_shipto.Codigo Numero_Tienda,  \n");
			qlString.append(" 	dir_shipto.Nombre Nombre_Tienda,  \n");
			qlString.append(" 	dir_shipto.Calle Dom_Tienda_calle,  \n");
			qlString.append(" 	dir_shipto.Numero Dom_Tienda_noExterior,  \n");
			qlString.append(" 	dir_shipto.NumeroInt Dom_Tienda_noInterior,  \n");
			qlString.append(" 	dir_shipto.Colonia Dom_Tienda_colonia,  \n");
			qlString.append(" 	dir_shipto.Localidad Dom_Tienda_localidad,  \n");
			qlString.append(" 	dir_shipto.ReferenciaDireccion Dom_Tienda_referencia,  \n");
			qlString.append(" 	dir_shipto.Delegacion Dom_Tienda_municipio,  \n");
			qlString.append(" 	dir_shipto.Estado Dom_Tienda_estado,  \n");
			qlString.append(" 	dir_shipto.Pais Dom_Tienda_pais,  \n");
			qlString.append(" 	dir_shipto.CP Dom_Tienda_codigoPostal,  \n");
			qlString.append(" 	soc_com.RFC RFC_Tienda,  \n");
			qlString.append("	enc.Moneda Cod_Moneda,  \n");
			qlString.append("	enc.Diasvencimiento Dias_Pago,   \n");
			qlString.append("	0 Porc_Desc_ProntoPago,  \n");
			qlString.append("	0 Monto_Desc_ProntoPago,  \n");
			qlString.append("	0 Cod_Descuento,  \n");
			qlString.append("	0 Porc_Descuento,  \n");
			qlString.append("	0 Monto_Descuento,  \n");
			qlString.append(
					"	(select count(*) from CLI_IntegraCOFIDI.dbo.cfddet where empresa=enc.Empresa and NoDocumento=enc.NoDocumento) Cantidad_LineasFactura,  \n");
			qlString.append("	null Fecha_Vencimiento,  \n");
			qlString.append("	null Cod_Zona,  \n");
			qlString.append("	null Numero_Receptor,  \n");
			qlString.append("	null Cod_Vendedor,  \n");
			qlString.append("	null Nombre_Vendedor,  \n");
			qlString.append(
					"	(select top 1 BillOfLading from CLI_IntegraCOFIDI.dbo.CFDDet where empresa=enc.Empresa and NoDocumento=enc.NoDocumento) Via_Embarque,  \n");
			qlString.append("	enc.CustomField10 Condiciones_Pago,  \n");
			qlString.append("	null Numero_Pedido,  \n");
			qlString.append("	null Fecha_Pedido,  \n");
			qlString.append("	enc.customfield15 Letras_Monto_Total,  \n");
			qlString.append(
					"	(select SUM(Cantidad) from CLI_IntegraCOFIDI.dbo.cfddet where empresa=enc.Empresa and NoDocumento=enc.NoDocumento and UnidadMedida!='SER') Cantidad_unidades,  \n");
			qlString.append("	enc.customfield09 Cantidad_empaques,  \n");
			qlString.append("	null EAN_Receptor,  \n");
			qlString.append("	null EAN_LugarExpide,  \n");
			qlString.append("	null IEPS_Id,  \n");
			qlString.append("	null Estatus,  \n");
			qlString.append("	null Numero_Emisor,  \n");
			qlString.append("	null Monto_Merma,  \n");
			qlString.append("	enc.SubTotal Monto_SubTotal_ApIVA,  \n");
			qlString.append("	enc.customfield06 Transportista,  \n");
			qlString.append("	null Numero_Solicitud,  \n");
			qlString.append("	enc.moneda Desc_Moneda,  \n");
			qlString.append("	enc.customfield07 Plataforma, --misc01  \n");
			qlString.append("	enc.CustomField04 Flete, --misc02  \n");
			qlString.append("	enc.CustomField05 Autorizacion, --misc03,  \n");
			qlString.append("	enc.Cliente Cliente, --misc04  \n");
			qlString.append("	Convert(varchar(50),CURRENT_TIMESTAMP,121) FechaLarga, --misc05  \n");
			qlString.append("	enc.CustomField08 Misc06,  \n");
			qlString.append("	dir_emi_con.Comentarios Misc07,  \n");
			qlString.append("	null Misc08,  \n");
			qlString.append("	null Misc09,  \n");
			qlString.append("	null Misc10,  \n");
			qlString.append("	dir_emi.claveDePedimento clavePedimento, --misc11   \n");
			qlString.append("	'2' TipoOperacion, --misc12  \n");
			qlString.append(
					"	isnull(case when soc_com.NombreCertificado='' then 0 else soc_com.NombreCertificado end ,0) certificadoOrigen, --misc13  \n");
			qlString.append("	soc_com_dir.NumCertificadoOrigen, --misc14  \n");
			qlString.append("	null Misc15,  \n");
			qlString.append("	null Misc16,  \n");
			qlString.append("	null Misc17,  \n");
			qlString.append("	null Misc18,  \n");
			qlString.append("	soc_com_dir.NumeroExportadorConfiable, --misc19  \n");
			qlString.append(
					"	(case when enc.FechaEmision>='2018-01-01' and soc_com_dir.claveDePedimento='A1' AND soc_com_dir.TipoDireccion='F' and dir_shipto.Pais NOT LIKE 'M%' and enc.nodocumento not like 'PROMO%' and enc.nodocumento not like 'IFSAC%' and enc.nodocumento not like 'IESAC%' and enc.nodocumento not like 'CFSAC%' and enc.nodocumento not like 'ROYSAC%' and enc.nodocumento not like 'BR%' and enc.TipoDocumento in('01','04') AND enc.customfield22 !='NO CCE' and (dir_shipto.Sufijo!='9-110-B'  or dir_shipto.Sufijo is null) /* FCA US LLC Excluir Warren para generarla sin complemento */ and not(enc.TipoDocumento='04' and enc.cliente='38557' and enc.NoDocumento LIKE 'TC%') and (select count(*) from CLI_IntegraCOFIDI.DBO.cfddet where empresa=enc.Empresa and NoDocumento=enc.nodocumento and descripcion not like 'Acero%')>0 then '[EM]' else '' end) cce, --misc20    \n");
			qlString.append("	0 Subdivision, --misc21  \n");
			qlString.append("	null misc22,  \n");
			qlString.append(
					"	(case when enc.TipoCambio=0 then 1 else enc.tipocambio end) tipoCambioUSD, --misc23  \n");
			qlString.append(
					"	round((enc.Monto/isnull(case when enc.TipoCambio=0 then 1 else enc.tipocambio end,1)),2) totalUSD, --misc24  \n");
			qlString.append(
					"	replace(replace(replace(substring(soc_com.razonsocial,1,20),'.',''),'(',''),')','') Marca, --misc25  \n");
			qlString.append("	null modelo, --misc26  \n");
			qlString.append("	null submodelo, --misc27  \n");
			qlString.append("	null misc28,  \n");
			qlString.append("	null misc29,  \n");
			qlString.append("	enc.NoDocumento misc30,  \n");
			qlString.append(
					"	case when soc_com.tin is null then replace(replace(REPLACE(replace(soc_com.NoProveedor,' ',''),'-',''),'TAXID',''),':','') else soc_com.tin end TaxID_Receptor, --misc31  \n");
			qlString.append("	soc_com_dir.incoterm, --misc32  \n");
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
			qlString.append(
					"	(select top 1 floor(PorcentajeImpuesto) from CLI_IntegraCOFIDI.dbo.CFDEncImpuesto where empresa=enc.empresa and NoDocumento=enc.nodocumento and ImpuestoTrasladado='IVA') Porc_IVA,  \n");
			qlString.append("	0 Monto_IEPS,  \n");
			qlString.append("	'ORIGINAL' Document_Status,  \n");
			qlString.append("	null Delivery_Date,  \n");
			qlString.append(
					"	(SELECT rtrim(Regimen) + ',' AS 'data()' FROM CLI_ATEBCOFIDI.dbo.EmpresaRF where empresa=enc.Empresa FOR XML PATH('')) RegimenFiscal,  \n");
			qlString.append("	null Reference_Identification,  \n");
			qlString.append("	null Num_contrarecibo,  \n");
			qlString.append("	null Fecha_Num_contrarecibo,  \n");
			qlString.append("	null Contacto_Compras,  \n");
			qlString.append("	null Customs_gln,  \n");
			qlString.append("	null Alternate_identification_gln,  \n");
			qlString.append("	null Nombre_Aduana,  \n");
			qlString.append("	null Nombre_Aduana_Ciudad,  \n");
			qlString.append("	null Func_Divisa,  \n");
			qlString.append("	(case when enc.TipoCambio=0 then 1 else enc.tipocambio end) Tasa_Divisa,  \n");
			qlString.append("	enc.customfield10 Terminos,  \n");
			qlString.append("	null Ref_Termino_Tiempo_Pago,  \n");
			qlString.append("	null Descuento_Tipo,  \n");
			qlString.append("	null Indicador_Cargo_Descuento,  \n");
			qlString.append("	null Inf_Cargo_Descuento,  \n");
			qlString.append("	null Tipo_Especial_de_Servicio,  \n");
			qlString.append("	null Porcentaje_no_aplicado,  \n");
			qlString.append("	null Identificador_Cargo_Descuento,  \n");
			qlString.append("	null Monto_Total_Descuentos,  \n");
			qlString.append("	null Monto_Total_Pagar,  \n");
			qlString.append("	null Ano_Aprobacion,  \n");
			qlString.append("	null Motivo_Descuento,  \n");
			qlString.append("	enc.formapago Metodo_Pago,  \n");
			qlString.append(
					"	(case when enc.TipoDocumento='01' then 'ingreso' when enc.TipoDocumento='02' then 'egreso' when enc.TipoDocumento='03' then 'ingreso' when enc.TipoDocumento='04' then 'traslado' else '' end) Efecto_Comprobante,  \n");
			qlString.append("	enc.Impuesto Monto_TotalImp_Retenidos,  \n");
			qlString.append("	enc.Retencion Monto_TotalImp_Traslados  \n");
			qlString.append(" from   \n");
			qlString.append("	CLI_IntegraCOFIDI.dbo.cfdenc enc  \n");
			qlString.append("	inner join CLI_ATEBCOFIDI.dbo.empresa emp on enc.Empresa=emp.empresa  \n");
			qlString.append(
					"	inner join CLI_ATEBCOFIDI.dbo.Direccion dir_emi on enc.Empresa=dir_emi.empresa and dir_emi.id='DE' AND dir_emi.TipoDireccion='F'  \n");
			qlString.append(
					"	left join CLI_ATEBCOFIDI.dbo.Contactos dir_emi_con on enc.Empresa=dir_emi_con.Empresa and dir_emi_con.cliente='DE'  \n");
			qlString.append(
					"	left join  CLI_ATEBCOFIDI.dbo.telefono dir_emi_tel on dir_emi_con.Empresa=dir_emi_tel.Empresa and dir_emi_con.Cliente=dir_emi_tel.Cliente and dir_emi_con.Contacto=dir_emi_tel.Contacto and dir_emi_tel.TipoTelefono='O'  \n");
			qlString.append(
					"	inner join CLI_ATEBCOFIDI.dbo.Direccion dir_exp on enc.Empresa=dir_exp.empresa and dir_exp.id='DE' AND dir_exp.TipoDireccion='X'  \n");
			qlString.append(
					"	inner join CLI_ATEBCOFIDI.dbo.SocioComercial soc_com on soc_com.Empresa=enc.Empresa and soc_com.Cliente=enc.Cliente  \n");
			qlString.append(
					"	inner join CLI_ATEBCOFIDI.dbo.Direccion soc_com_dir on soc_com_dir.Empresa=enc.Empresa and soc_com_dir.id=enc.Cliente and soc_com_dir.TipoDireccion='F'  \n");
			qlString.append(
					"	left join CLI_IntegraCOFIDI.dbo.ADDEA2 dir_shipto on dir_shipto.Empresa=enc.Empresa and dir_shipto.NoDocumento=enc.NoDocumento  \n");
			qlString.append(" where   \n");
			qlString.append(" --year(enc.FechaEmision)=2021 AND MONTH(ENC.FechaEmision)>7  \n");
			//qlString.append(" 		 enc.Empresa=@EMPRESA  \n");
			qlString.append("  enc.Empresa='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and enc.NoDocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
			//qlString.append(" 		--and enc.cliente='2043'  \n");
			//qlString.append(" 	and enc.NoDocumento=@NODOCUMENTO  \n");

			System.out.println("Query: {}" + qlString);
			query = em.createNativeQuery(qlString.toString());


			List<Object[]> objectLista = query.getResultList();
			
			
			if(objectLista != null) {
				
				respuesta = MapEspecOrdEncaFacElecTxtDTO.especOrdEncaFacElecTxtDTO(objectLista);
				
			}
			
		

			

		} catch (Exception e) {
			System.out.println("Error getInfoFacEncabezado " + e);
			
		}finally {
			
			
			return respuesta;

		}
		
		
	}
	


	@SuppressWarnings("finally")
	@Override
	public List<EspecOrdLineDetCfdTxtDTO> getInfoFacCompleDetalle(FacturaRequest request) {
		// TODO Auto-generated method stub
		
		List<EspecOrdLineDetCfdTxtDTO> respuesta = new ArrayList<EspecOrdLineDetCfdTxtDTO>();
		

		try {
			System.out.println("CREA OBJETO getInfoFacCompleDetalle  ..");

			StringBuilder qlString = new StringBuilder();
			qlString.append("	select  \n");
			qlString.append("	 	det.descripcion Linea_Descripcion, \n");
			qlString.append("		det.cantidad Linea_Cantidad, \n");
			qlString.append("		det.ClaveUnidad Linea_Unidad, \n");
			qlString.append("		det.precio Linea_PrecioUnitario, \n");
			qlString.append("		det.importe Linea_Importe, \n");
			qlString.append("		null Linea_Aduana_NumDoc, \n");
			qlString.append("		null Linea_Aduana_FechaDoc, \n");
			qlString.append("		null Linea_Aduana_Nombre, \n");
			qlString.append("		null Linea_CuentaPredial_Numero, \n");
			qlString.append("		(case when (select top 1 fraccionarancelaria from CLI_ATEBCOFIDI.dbo.Productos where Producto=det.Producto and Empresa=det.Empresa) is null and enc.tipodocumento in('01','04') then '8708999999' else (select top 1 fraccionarancelaria from CLI_ATEBCOFIDI.dbo.Productos where Producto=det.Producto and Empresa=det.Empresa) end ) fraccionarancelaria,   \n");
			qlString.append("		null Linea_Notas, \n");
			qlString.append("		null Linea_Cod_UPC, \n");
			qlString.append("		null Linea_Piezas_Empaque, \n");
			qlString.append("		null Linea_Cod_DUN, \n");
			qlString.append("		null Linea_Cod_Barras, \n");
			qlString.append("		det.ClaveProdServ Linea_Cod_Articulo, \n");
			qlString.append("		null Linea_Cod_Desc, \n");
			qlString.append("		null Linea_Porc_Desc, \n");
			qlString.append("		null Linea_Monto_Desc, \n");
			qlString.append("		det.precio Linea_PrecioUnitario_SinDesc, \n");
			qlString.append("		null Linea_Cant_Empaques_Fac, \n");
			qlString.append("		null Linea_Cant_Empaques_Emb, \n");
			qlString.append("		det.impuestoporcentaje Linea_Porc_IVA, \n");
			qlString.append("		det.impuesto Linea_Monto_IVA, \n");
			qlString.append("		null Linea_Porc_IEPS, \n");
			qlString.append("		null Linea_Monto_IEPS, \n");
			qlString.append("		null Linea_PrecioUnitario_ConImp, \n");
			qlString.append("		null Linea_Importe_ConImp, \n");
			qlString.append("		null Linea_Frontera, \n");
			qlString.append("		null Línea_PaisOrigen, \n");
			qlString.append("		null Linea_EAN_Aduana, \n");
			qlString.append("		null Linea_Misc01, \n");
			qlString.append("		null Linea_Misc02, \n");
			qlString.append("		null Linea_Misc03, \n");
			qlString.append("		null Linea_Misc04, \n");
			qlString.append("		null Linea_Misc05, \n");
			qlString.append("		null Linea_Misc06, \n");
			qlString.append("		null Linea_Misc07, \n");
			qlString.append("		null Linea_Misc08, \n");
			qlString.append("		null Linea_Misc09, \n");
			qlString.append("		null Linea_Misc10, \n");
			qlString.append("		null Linea_Misc11, \n");
			qlString.append("		null Linea_Misc12, \n");
			qlString.append("		det.Cantidad CantidadAduana, --Linea_Misc13  \n");
			qlString.append("		det.ClaveUnidad ClaveAduana, --Linea_Misc14 \n");
			qlString.append("		case when UnidadMedida!='SER' then det.precio*enc.TipoCambio else 0 end precioDolares, --Linea_Misc15 \n");
			qlString.append("		case when UnidadMedida!='SER' then det.precio*enc.TipoCambio*det.Cantidad else 0 end valorDolares, --Linea_Misc16  \n");
			qlString.append("		null Marca, --Linea_Misc17 \n");
			qlString.append("		null Modelo, --Linea_Misc18 \n");
			qlString.append("		null SubModelo, --Linea_Misc19 \n");
			qlString.append("		null Serie, --Linea_Misc20 \n");
			qlString.append("		det.OrdenCompra, --Linea_Misc21 \n");
			qlString.append("		det.FechaOrdenCompra, --Linea_Misc22 \n");
			qlString.append("		det.FechaEmbarque, --Linea_Misc23 \n");
			qlString.append("		det.BillOfLading, --Linea_Misc24 \n");
			qlString.append("		det.packingList, --Linea_Misc25 \n");
			qlString.append("		det.UMPeso, --Linea_Misc26 \n");
			qlString.append("		det.Peso, --Linea_Misc27 \n");
			qlString.append("		det.ProductoCliente, --Linea_Misc28 \n");
			qlString.append("		det.unidadmedida, --Linea_Misc29 \n");
			qlString.append("		det.Consecutivo, --Linea_Misc30 \n");
			qlString.append("		null Linea_Misc31, \n");
			qlString.append("		null Linea_Misc32, \n");
			qlString.append("		null Linea_Misc33, \n");
			qlString.append("		null Linea_Misc34, \n");
			qlString.append("		null Linea_Misc35, \n");
			qlString.append("		null Linea_Misc36, \n");
			qlString.append("		null Linea_Misc37, \n");
			qlString.append("		null Linea_Misc38, \n");
			qlString.append("		null Linea_Misc39, \n");
			qlString.append("		null Linea_Misc40, \n");
			qlString.append("		null Linea_Misc41, \n");
			qlString.append("		null Linea_Misc42, \n");
			qlString.append("		null Linea_Misc43, \n");
			qlString.append("		null Linea_Misc44, \n");
			qlString.append("		null Linea_Misc45, \n");
			qlString.append("		null Linea_Misc46, \n");
			qlString.append("		null Linea_Misc47, \n");
			qlString.append("		null Linea_Misc48, \n");
			qlString.append("		null Linea_Misc49, \n");
			qlString.append("		null Linea_Misc50, \n");
			qlString.append("		null Linea_MedicionSecundaria, \n");
			qlString.append("		null Linea_TipoIdent_Adicional, \n");
			qlString.append("		'ES' Linea_DescripIdioma, \n");
			qlString.append("		null Linea_Cant_Adicional, \n");
			qlString.append("		null Linea_Cant_Adicional_Tipo, \n");
			qlString.append("		null Linea_Tipo_Referencia, \n");
			qlString.append("		null Linea_Calif_NumIdentidad, \n");
			qlString.append("		null Linea_TipoEmpaquetado, \n");
			qlString.append("		null Linea_Metodo_Pago, \n");
			qlString.append("		null Linea_Numero_Lote, \n");
			qlString.append("		null Linea_Fecha_ProdLote, \n");
			qlString.append("		null Linea_Ind_CargoDescuento, \n");
			qlString.append("		null Linea_Inf_CargoDescuento, \n");
			qlString.append("		null Línea_Secuencia_Calculo, \n");
			qlString.append("		null Linea_Tipo_ServiciosEsp, \n");
			qlString.append("		null Linea_Ident_Impuesto, \n");
			qlString.append("		null Linea_Cod_EAN, \n");
			qlString.append("		det.producto Linea_NoIdentificacion, \n");
			qlString.append("		(case when impuesto.PorcentajeImpuesto is not null then '/Impuesto' else null end) Variacion_Modo, \n");
			qlString.append("		(case when impuesto.PorcentajeImpuesto is not null then 'TR' else null end) Variacion_Tipo, \n");
			qlString.append("		(case when impuesto.PorcentajeImpuesto is not null then '002' else null end) Variacion_Tipo2, \n");
			qlString.append("		(case when impuesto.PorcentajeImpuesto is not null then det.importe*(impuesto.PorcentajeImpuesto/100) else null end) Variacion_Porcentaje, \n");
			qlString.append("		(case when impuesto.PorcentajeImpuesto is not null then round((impuesto.PorcentajeImpuesto/100),2) else null end) Var_Porcentaje2, \n");
			qlString.append("		(case when impuesto.PorcentajeImpuesto is not null then 'Tasa' else null end) Var_Porcentaje3, \n");
			qlString.append("		(case when retencion.PorcentajeImpuesto is not null then '/Impuesto' else null end) Variacion_ModoRET, \n");
			qlString.append("		(case when retencion.PorcentajeImpuesto is not null then 'RE' else null end) Variacion_TipoRET, \n");
			qlString.append("		(case when retencion.PorcentajeImpuesto is not null then '002' else null end) Variacion_Tipo2RET, \n");
			qlString.append("		(case when retencion.PorcentajeImpuesto is not null then det.importe*(retencion.PorcentajeImpuesto/100) else null end) Variacion_PorcentajeRET, \n");
			qlString.append("		(case when retencion.PorcentajeImpuesto is not null then round((retencion.PorcentajeImpuesto/100),2) else null end) Var_Porcentaje2RET, \n");
			qlString.append("		(case when retencion.PorcentajeImpuesto is not null then 'Tasa' else null end) Var_Porcentaje3RET \n");
			qlString.append("	from  \n");
			qlString.append("		CLI_IntegraCOFIDI.dbo.cfddet det \n");
			qlString.append("		inner join CLI_IntegraCOFIDI.dbo.cfdenc enc on enc.Empresa=det.Empresa and enc.NoDocumento=det.NoDocumento \n");
			qlString.append("		left join CLI_IntegraCOFIDI.dbo.CFDEncImpuesto impuesto on impuesto.Empresa=det.Empresa and impuesto.NoDocumento=det.NoDocumento and impuesto.ImpuestoTrasladado='IVA' \n");
			qlString.append("		left join CLI_IntegraCOFIDI.dbo.CFDEncImpuesto retencion on retencion.Empresa=det.Empresa and retencion.NoDocumento=det.NoDocumento and retencion.ImpuestoRetenido='IVA' \n");
			qlString.append("	where  \n");
			qlString.append("  det.empresa='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and det.nodocumento='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
			//qlString.append("		det.empresa = @EMPRESA \n");
			//qlString.append("		and det.nodocumento= @NODOCUMENTO \n");
			
				
					
			System.out.println("Query: {}" + qlString);
			query = em.createNativeQuery(qlString.toString());


			List<Object[]> objectLista = query.getResultList();
			
			
			if(objectLista != null) {
				
				respuesta = MapEspecOrdLineDetCfdTxtDTO.especOrdLineDetalle(objectLista);
				
				
			}
		
		}catch (Exception e) {
			System.out.println("Error getInfoFacCompleDetalle " + e);
			
		}finally {
			
			
			return respuesta;

		}
		
	}
	
	

	@SuppressWarnings("finally")
	@Override
	public List<EspecOrdLineImpuestoCfdTxtDTO> getInfoFacImpuetos(FacturaRequest request) {
		// TODO Auto-generated method stub
		List<EspecOrdLineImpuestoCfdTxtDTO> respuesta = new ArrayList<EspecOrdLineImpuestoCfdTxtDTO>();

				
		try {
			
			System.out.println("CREA OBJETO getInfoFacImpuetos  ..");
			
			StringBuilder qlString = new StringBuilder();
			qlString.append(" select \n");
			qlString.append(" case when ImpuestoTrasladado='IVA' THEN 'TR' when ImpuestoRetenido='IVA' then 'RE' else 'TR' end Impuesto_TipoImpuesto, \n");
			qlString.append(" case when ImpuestoTrasladado='IVA' THEN '002' when ImpuestoRetenido='IVA' then '002' else '002' end Impuesto_Descripcion, \n");
			qlString.append(" MontoImpuesto Impuesto_Monto_Importe, \n");
			qlString.append(" round((PorcentajeImpuesto/100),2) Impuesto_Tasa, \n");
			qlString.append(" 'Tasa' TipoFactor \n");
			qlString.append(" from CLI_IntegraCOFIDI.dbo.CFDEncImpuesto imp \n");
			qlString.append(" where \n");
			qlString.append("  imp.Empresa='");
			qlString.append(request.getEmpresa().trim());
			qlString.append("' \n");
			qlString.append(" 	and imp.NoDocumento ='");
			qlString.append(request.getNumDoc().trim());
			qlString.append("' \n");
			//qlString.append(" imp.Empresa=@EMPRESA \n");
			//qlString.append(" and imp.NoDocumento = @NODOCUMENTO \n");
			
			System.out.println("Query: {}" + qlString);
			query = em.createNativeQuery(qlString.toString());


			List<Object[]> objectLista = query.getResultList();
			
			
			if(objectLista != null) {
				
				respuesta = MapEspecOrdLineImpuesto.especOrdLineImpuesto(objectLista);
				
			}
			
		}catch (Exception e) {
			System.out.println("Error getInfoFacImpuetos " + e);
					
		}finally {
					
			return respuesta;

		}
	}
	
	

	@SuppressWarnings("finally")
	@Override
	public ListaAuxComplePagoTxtDTO getListaAuxComplePago(FacturaRequest request) {
		// TODO Auto-generated method stub
		
		ListaAuxComplePagoTxtDTO listaAuxComplePago = new ListaAuxComplePagoTxtDTO(); 
		
		try {
			
			System.out.println("ENTRA a getListaAuxComplePagoTxtDTO  ..");

			StringBuilder qlEncabezado = new StringBuilder();
			qlEncabezado.append(" select  \n");
			qlEncabezado.append(" (case when enc.FechaEmision>='2018-01-01' and soc_com_dir.claveDePedimento='A1' AND soc_com_dir.TipoDireccion='F' and dir_shipto.Pais NOT LIKE 'M%' and enc.nodocumento not like 'PROMO%' and enc.nodocumento not like 'IFSAC%' and enc.nodocumento not like 'IESAC%' and enc.nodocumento not like 'CFSAC%' and enc.nodocumento not like 'ROYSAC%' and enc.nodocumento not like 'BR%' and enc.TipoDocumento in('01','04') AND enc.customfield22 !='NO CCE' and (dir_shipto.Sufijo!='9-110-B'  or dir_shipto.Sufijo is null) /* FCA US LLC Excluir Warren para generarla sin complemento */ and not(enc.TipoDocumento='04' and enc.cliente='38557' and enc.NoDocumento LIKE 'TC%') and (select count(*) from CLI_IntegraCOFIDI.DBO.cfddet where empresa=enc.Empresa and NoDocumento=enc.nodocumento and descripcion not like 'Acero%')>0 then 'EM' else '' end) DetalleAux_Tipo,   \n");
			qlEncabezado.append(" 'Encabezado' DetalleAux_DescTipo,  \n");
			qlEncabezado.append(" '1.1' DetalleAux_Misc01, --Version Encabezado  \n");
			qlEncabezado.append(" '2' DetalleAux_Misc02, --TipoOperacion  \n");
			qlEncabezado.append(" dir_emi.claveDePedimento DetalleAux_Misc03,  --claveDePedimento  \n");
			qlEncabezado.append(" isnull(case when soc_com.NombreCertificado='' then '0' else soc_com.NombreCertificado end ,'0') DetalleAux_Misc04, --certificadoOrigen,   \n");
			qlEncabezado.append(" soc_com_dir.NumCertificadoOrigen DetalleAux_Misc05, --numCertificadoOrigen  \n");
			qlEncabezado.append(" soc_com_dir.NumeroExportadorConfiable DetalleAux_Misc06, --numeroExportadorConfiable  \n");
			qlEncabezado.append(" '0' DetalleAux_Misc07, --subdivision  \n");
			qlEncabezado.append(" null DetalleAux_Misc08, --observaciones  \n");
			qlEncabezado.append(" cast(enc.TipoCambio as varchar) DetalleAux_Misc09,  --tipoCambioUSD  \n");
			qlEncabezado.append(" cast(round((enc.Monto/isnull(case when enc.TipoCambio=0 then 1 else enc.tipocambio end,1)),2) as varchar) DetalleAux_Misc10,  --totalUSD  \n");
			qlEncabezado.append(" null DetalleAux_Misc11,  --Emisor_CURP  \n");
			qlEncabezado.append(" null DetalleAux_Misc12, --Receptor_CURP  \n");
			qlEncabezado.append(" case when soc_com.tin is null then replace(replace(REPLACE(replace(soc_com.NoProveedor,' ',''),'-',''),'TAXID',''),':','') else soc_com.tin end DetalleAux_Misc13, --Receptor_NumRegIdTrib  \n");
			qlEncabezado.append(" soc_com_dir.incoterm DetalleAux_Misc14, --Incoterm  \n");
			qlEncabezado.append(" null DetalleAux_Misc15,  \n");
			qlEncabezado.append(" null DetalleAux_Misc16  \n");
			qlEncabezado.append(" from   \n");
			qlEncabezado.append(" CLI_IntegraCOFIDI.dbo.cfdenc enc  \n");
			qlEncabezado.append(" inner join CLI_ATEBCOFIDI.dbo.Direccion soc_com_dir on soc_com_dir.Empresa=enc.Empresa and soc_com_dir.id=enc.Cliente AND soc_com_dir.TipoDireccion='F'  \n");
			qlEncabezado.append(" left join CLI_IntegraCOFIDI.dbo.ADDEA2 dir_shipto on dir_shipto.Empresa=enc.Empresa and dir_shipto.NoDocumento=enc.NoDocumento  \n");
			qlEncabezado.append(" inner join CLI_ATEBCOFIDI.dbo.Direccion dir_emi on enc.Empresa=dir_emi.empresa and dir_emi.id='DE' AND dir_emi.TipoDireccion='F'  \n");
			qlEncabezado.append(" inner join CLI_ATEBCOFIDI.dbo.SocioComercial soc_com on soc_com.Empresa=enc.Empresa and soc_com.Cliente=enc.Cliente  \n");
			qlEncabezado.append(" where   \n");
			qlEncabezado.append(" year(enc.FechaEmision)=2021  \n");
			qlEncabezado.append(" and enc.FechaEmision>='2018-01-01' and soc_com_dir.claveDePedimento='A1' AND soc_com_dir.TipoDireccion='F' and dir_shipto.Pais NOT LIKE 'M%' and enc.nodocumento not like 'PROMO%' and enc.nodocumento not like 'IFSAC%' and enc.nodocumento not like 'IESAC%' and enc.nodocumento not like 'CFSAC%' and enc.nodocumento not like 'ROYSAC%' and enc.nodocumento not like 'BR%' and enc.TipoDocumento in('01','04') AND enc.customfield22 !='NO CCE' and (dir_shipto.Sufijo!='9-110-B'  or dir_shipto.Sufijo is null) /* FCA US LLC Excluir Warren para generarla sin complemento */ and not(enc.TipoDocumento='04' and enc.cliente='38557' and enc.NoDocumento LIKE 'TC%') and (select count(*) from CLI_IntegraCOFIDI.DBO.cfddet where empresa=enc.Empresa and NoDocumento=enc.nodocumento and descripcion not like 'Acero%')>0  \n");
			qlEncabezado.append("  and enc.Empresa='");
			qlEncabezado.append(request.getEmpresa().trim());
			qlEncabezado.append("' \n");
			qlEncabezado.append(" 	and enc.NoDocumento='");
			qlEncabezado.append(request.getNumDoc().trim());
			qlEncabezado.append("' \n");
			
		
			
			
			StringBuilder qlDestinatario = new StringBuilder();
			qlDestinatario.append(" select  \n");
			qlDestinatario.append(" (case when enc.FechaEmision>='2018-01-01' and soc_com_dir.claveDePedimento='A1' AND soc_com_dir.TipoDireccion='F' and dir_shipto.Pais NOT LIKE 'M%' and enc.nodocumento not like 'PROMO%' and enc.nodocumento not like 'IFSAC%' and enc.nodocumento not like 'IESAC%' and enc.nodocumento not like 'CFSAC%' and enc.nodocumento not like 'ROYSAC%' and enc.nodocumento not like 'BR%' and enc.TipoDocumento in('01','04') AND enc.customfield22 !='NO CCE' and (dir_shipto.Sufijo!='9-110-B'  or dir_shipto.Sufijo is null) /* FCA US LLC Excluir Warren para generarla sin complemento */ and not(enc.TipoDocumento='04' and enc.cliente='38557' and enc.NoDocumento LIKE 'TC%') and (select count(*) from CLI_IntegraCOFIDI.DBO.cfddet where empresa=enc.Empresa and NoDocumento=enc.nodocumento and descripcion not like 'Acero%')>0 then 'EM' else '' end) DetalleAux_Tipo, \n");
			qlDestinatario.append(" 'Destinatario' DetalleAux_DescTipo, \n");
			qlDestinatario.append(" case when soc_com.tin is null then replace(replace(REPLACE(replace(soc_com.NoProveedor,' ',''),'-',''),'TAXID',''),':','') else soc_com.tin end DetalleAux_Misc01, --NumRegIdTrib \n");
			qlDestinatario.append(" soc_com.RFC DetalleAux_Misc02, --RFC \n");
			qlDestinatario.append(" null DetalleAux_Misc03,  --CURP \n");
			qlDestinatario.append(" soc_com.RazonSocial DetalleAux_Misc04, --nombre,  \n");
			qlDestinatario.append(" soc_com_dir.Calle DetalleAux_Misc05, --calle \n");
			qlDestinatario.append(" soc_com_dir.Numero DetalleAux_Misc06, --numero Exterior \n");
			qlDestinatario.append(" soc_com_dir.NumeroInt DetalleAux_Misc07, --numero Interior \n");
			qlDestinatario.append(" soc_com_dir.coloniaSAT DetalleAux_Misc08, --colonia \n");
			qlDestinatario.append(" soc_com_dir.Localidad DetalleAux_Misc09,  --localidad \n");
			qlDestinatario.append(" soc_com_dir.ReferenciaDireccion DetalleAux_Misc10,  --referencia \n");
			qlDestinatario.append(" soc_com_dir.Delegacion DetalleAux_Misc11,  --municipio \n");
			qlDestinatario.append(" soc_com_dir.Estado DetalleAux_Misc12, --estado \n");
			qlDestinatario.append(" soc_com_dir.Pais DetalleAux_Misc13, --país \n");
			qlDestinatario.append(" soc_com_dir.CP DetalleAux_Misc14, --código Postal \n");
			qlDestinatario.append(" null DetalleAux_Misc15, \n");
			qlDestinatario.append(" null DetalleAux_Misc16 \n");
			qlDestinatario.append(" from  \n");
			qlDestinatario.append(" CLI_IntegraCOFIDI.dbo.cfdenc enc \n");
			qlDestinatario.append(" inner join CLI_ATEBCOFIDI.dbo.Direccion soc_com_dir on soc_com_dir.Empresa=enc.Empresa and soc_com_dir.id=enc.Cliente AND soc_com_dir.TipoDireccion='F' \n");
			qlDestinatario.append(" left join CLI_IntegraCOFIDI.dbo.ADDEA2 dir_shipto on dir_shipto.Empresa=enc.Empresa and dir_shipto.NoDocumento=enc.NoDocumento \n");
			qlDestinatario.append(" inner join CLI_ATEBCOFIDI.dbo.Direccion dir_emi on enc.Empresa=dir_emi.empresa and dir_emi.id='DE' AND dir_emi.TipoDireccion='F' \n");
			qlDestinatario.append(" inner join CLI_ATEBCOFIDI.dbo.SocioComercial soc_com on soc_com.Empresa=enc.Empresa and soc_com.Cliente=enc.Cliente \n");
			qlDestinatario.append(" where  \n");
			qlDestinatario.append(" 	year(enc.FechaEmision)=2021 \n");
			qlDestinatario.append(" and enc.FechaEmision>='2018-01-01' and soc_com_dir.claveDePedimento='A1' AND soc_com_dir.TipoDireccion='F' and dir_shipto.Pais NOT LIKE 'M%' and enc.nodocumento not like 'PROMO%' and enc.nodocumento not like 'IFSAC%' and enc.nodocumento not like 'IESAC%' and enc.nodocumento not like 'CFSAC%' and enc.nodocumento not like 'ROYSAC%' and enc.nodocumento not like 'BR%' and enc.TipoDocumento in('01','04') AND enc.customfield22 !='NO CCE' and (dir_shipto.Sufijo!='9-110-B'  or dir_shipto.Sufijo is null) /* FCA US LLC Excluir Warren para generarla sin complemento */ and not(enc.TipoDocumento='04' and enc.cliente='38557' and enc.NoDocumento LIKE 'TC%') and (select count(*) from CLI_IntegraCOFIDI.DBO.cfddet where empresa=enc.Empresa and NoDocumento=enc.nodocumento and descripcion not like 'Acero%')>0 \n");
			qlDestinatario.append("  and enc.Empresa='");
			qlDestinatario.append(request.getEmpresa().trim());
			qlDestinatario.append("' \n");
			qlDestinatario.append(" 	and enc.NoDocumento='");
			qlDestinatario.append(request.getNumDoc().trim());
			qlDestinatario.append("' \n");
			
			
			
			StringBuilder qlDomEmisor = new StringBuilder();
			qlDomEmisor.append(" select   \n");
			qlDomEmisor.append(" (case when enc.FechaEmision>='2018-01-01' and soc_com_dir.claveDePedimento='A1' AND soc_com_dir.TipoDireccion='F' and dir_shipto.Pais NOT LIKE 'M%' and enc.nodocumento not like 'PROMO%' and enc.nodocumento not like 'IFSAC%' and enc.nodocumento not like 'IESAC%' and enc.nodocumento not like 'CFSAC%' and enc.nodocumento not like 'ROYSAC%' and enc.nodocumento not like 'BR%' and enc.TipoDocumento in('01','04') AND enc.customfield22 !='NO CCE' and (dir_shipto.Sufijo!='9-110-B'  or dir_shipto.Sufijo is null) /* FCA US LLC Excluir Warren para generarla sin complemento */ and not(enc.TipoDocumento='04' and enc.cliente='38557' and enc.NoDocumento LIKE 'TC%') and (select count(*) from CLI_IntegraCOFIDI.DBO.cfddet where empresa=enc.Empresa and NoDocumento=enc.nodocumento and descripcion not like 'Acero%')>0 then 'EM' else '' end) DetalleAux_Tipo,  \n");
			qlDomEmisor.append(" 'Dom_Emisor' DetalleAux_DescTipo,  \n");
			qlDomEmisor.append(" dir_emi.Calle DetalleAux_Misc01, --Calle  \n");
			qlDomEmisor.append(" dir_emi.Numero DetalleAux_Misc02, --Numero Exterior  \n");
			qlDomEmisor.append(" dir_emi.NumeroInt DetalleAux_Misc03,  --Numero Interior  \n");
			qlDomEmisor.append(" dir_emi.coloniaSAT DetalleAux_Misc04, --Colonia,   \n");
			qlDomEmisor.append(" dir_emi.Localidad DetalleAux_Misc05, --Localidad  \n");
			qlDomEmisor.append(" dir_emi.ReferenciaDireccion DetalleAux_Misc06, --Referencia  \n");
			qlDomEmisor.append(" dir_emi.Delegacion DetalleAux_Misc07, --Municipio  \n");
			qlDomEmisor.append(" dir_emi.Estado DetalleAux_Misc08, --Estado  \n");
			qlDomEmisor.append(" dir_emi.Pais DetalleAux_Misc09,  --País  \n");
			qlDomEmisor.append(" dir_emi.CP DetalleAux_Misc10,  --Código Postal  \n");
			qlDomEmisor.append(" null DetalleAux_Misc11,    \n");
			qlDomEmisor.append(" null DetalleAux_Misc12,   \n");
			qlDomEmisor.append(" null DetalleAux_Misc13,   \n");
			qlDomEmisor.append(" null DetalleAux_Misc14,   \n");
			qlDomEmisor.append(" null DetalleAux_Misc15,  \n");
			qlDomEmisor.append(" null DetalleAux_Misc16  \n");
			qlDomEmisor.append(" from   \n");
			qlDomEmisor.append(" CLI_IntegraCOFIDI.dbo.cfdenc enc  \n");
			qlDomEmisor.append(" inner join CLI_ATEBCOFIDI.dbo.Direccion soc_com_dir on soc_com_dir.Empresa=enc.Empresa and soc_com_dir.id=enc.Cliente AND soc_com_dir.TipoDireccion='F'  \n");
			qlDomEmisor.append(" left join CLI_IntegraCOFIDI.dbo.ADDEA2 dir_shipto on dir_shipto.Empresa=enc.Empresa and dir_shipto.NoDocumento=enc.NoDocumento  \n");
			qlDomEmisor.append(" inner join CLI_ATEBCOFIDI.dbo.Direccion dir_emi on enc.Empresa=dir_emi.empresa and dir_emi.id='DE' AND dir_emi.TipoDireccion='F'  \n");
			qlDomEmisor.append(" inner join CLI_ATEBCOFIDI.dbo.SocioComercial soc_com on soc_com.Empresa=enc.Empresa and soc_com.Cliente=enc.Cliente  \n");
			qlDomEmisor.append(" where   \n");
			qlDomEmisor.append(" year(enc.FechaEmision)=2021  \n");
			qlDomEmisor.append(" and enc.FechaEmision>='2018-01-01' and soc_com_dir.claveDePedimento='A1' AND soc_com_dir.TipoDireccion='F' and dir_shipto.Pais NOT LIKE 'M%' and enc.nodocumento not like 'PROMO%' and enc.nodocumento not like 'IFSAC%' and enc.nodocumento not like 'IESAC%' and enc.nodocumento not like 'CFSAC%' and enc.nodocumento not like 'ROYSAC%' and enc.nodocumento not like 'BR%' and enc.TipoDocumento in('01','04') AND enc.customfield22 !='NO CCE' and (dir_shipto.Sufijo!='9-110-B'  or dir_shipto.Sufijo is null) /* FCA US LLC Excluir Warren para generarla sin complemento */ and not(enc.TipoDocumento='04' and enc.cliente='38557' and enc.NoDocumento LIKE 'TC%') and (select count(*) from CLI_IntegraCOFIDI.DBO.cfddet where empresa=enc.Empresa and NoDocumento=enc.nodocumento and descripcion not like 'Acero%')>0  \n");
			qlDomEmisor.append("  and enc.Empresa='");
			qlDomEmisor.append(request.getEmpresa().trim());
			qlDomEmisor.append("' \n");
			qlDomEmisor.append(" 	and enc.NoDocumento='");
			qlDomEmisor.append(request.getNumDoc().trim());
			qlDomEmisor.append("' \n");
			
			StringBuilder qlDomReceptor = new StringBuilder();
			qlDomReceptor.append(" select  \n");
			qlDomReceptor.append(" (case when enc.FechaEmision>='2018-01-01' and soc_com_dir.claveDePedimento='A1' AND soc_com_dir.TipoDireccion='F' and dir_shipto.Pais NOT LIKE 'M%' and enc.nodocumento not like 'PROMO%' and enc.nodocumento not like 'IFSAC%' and enc.nodocumento not like 'IESAC%' and enc.nodocumento not like 'CFSAC%' and enc.nodocumento not like 'ROYSAC%' and enc.nodocumento not like 'BR%' and enc.TipoDocumento in('01','04') AND enc.customfield22 !='NO CCE' and (dir_shipto.Sufijo!='9-110-B'  or dir_shipto.Sufijo is null) /* FCA US LLC Excluir Warren para generarla sin complemento */ and not(enc.TipoDocumento='04' and enc.cliente='38557' and enc.NoDocumento LIKE 'TC%') and (select count(*) from CLI_IntegraCOFIDI.DBO.cfddet where empresa=enc.Empresa and NoDocumento=enc.nodocumento and descripcion not like 'Acero%')>0 then 'EM' else '' end) DetalleAux_Tipo, \n");
			qlDomReceptor.append(" 'Dom_Receptor' DetalleAux_DescTipo, \n");
			qlDomReceptor.append(" soc_com_dir.Calle DetalleAux_Misc01, --Calle \n");
			qlDomReceptor.append(" soc_com_dir.Numero DetalleAux_Misc02, --Numero Exterior \n");
			qlDomReceptor.append(" soc_com_dir.NumeroInt DetalleAux_Misc03,  --Numero Interior \n");
			qlDomReceptor.append(" soc_com_dir.coloniaSAT DetalleAux_Misc04, --Colonia,  \n");
			qlDomReceptor.append(" soc_com_dir.Localidad DetalleAux_Misc05, --Localidad \n");
			qlDomReceptor.append(" soc_com_dir.ReferenciaDireccion DetalleAux_Misc06, --Referencia \n");
			qlDomReceptor.append(" soc_com_dir.Delegacion DetalleAux_Misc07, --Municipio \n");
			qlDomReceptor.append(" soc_com_dir.Estado DetalleAux_Misc08, --Estado \n");
			qlDomReceptor.append(" soc_com_dir.Pais DetalleAux_Misc09,  --País \n");
			qlDomReceptor.append(" soc_com_dir.CP DetalleAux_Misc10,  --Código Postal \n");
			qlDomReceptor.append(" null DetalleAux_Misc11,   \n");
			qlDomReceptor.append(" null DetalleAux_Misc12,  \n");
			qlDomReceptor.append(" null DetalleAux_Misc13,  \n");
			qlDomReceptor.append(" null DetalleAux_Misc14,  \n");
			qlDomReceptor.append(" null DetalleAux_Misc15, \n");
			qlDomReceptor.append(" null DetalleAux_Misc16 \n");
			qlDomReceptor.append(" from  \n");
			qlDomReceptor.append(" CLI_IntegraCOFIDI.dbo.cfdenc enc \n");
			qlDomReceptor.append(" inner join CLI_ATEBCOFIDI.dbo.Direccion soc_com_dir on soc_com_dir.Empresa=enc.Empresa and soc_com_dir.id=enc.Cliente AND soc_com_dir.TipoDireccion='F' \n");
			qlDomReceptor.append(" left join CLI_IntegraCOFIDI.dbo.ADDEA2 dir_shipto on dir_shipto.Empresa=enc.Empresa and dir_shipto.NoDocumento=enc.NoDocumento \n");
			qlDomReceptor.append(" inner join CLI_ATEBCOFIDI.dbo.Direccion dir_emi on enc.Empresa=dir_emi.empresa and dir_emi.id='DE' AND dir_emi.TipoDireccion='F' \n");
			qlDomReceptor.append(" inner join CLI_ATEBCOFIDI.dbo.SocioComercial soc_com on soc_com.Empresa=enc.Empresa and soc_com.Cliente=enc.Cliente \n");
			qlDomReceptor.append(" where  \n");
			qlDomReceptor.append(" year(enc.FechaEmision)=2021 \n");
			qlDomReceptor.append(" and enc.FechaEmision>='2018-01-01' and soc_com_dir.claveDePedimento='A1' AND soc_com_dir.TipoDireccion='F' and dir_shipto.Pais NOT LIKE 'M%' and enc.nodocumento not like 'PROMO%' and enc.nodocumento not like 'IFSAC%' and enc.nodocumento not like 'IESAC%' and enc.nodocumento not like 'CFSAC%' and enc.nodocumento not like 'ROYSAC%' and enc.nodocumento not like 'BR%' and enc.TipoDocumento in('01','04') AND enc.customfield22 !='NO CCE' and (dir_shipto.Sufijo!='9-110-B'  or dir_shipto.Sufijo is null) /* FCA US LLC Excluir Warren para generarla sin complemento */ and not(enc.TipoDocumento='04' and enc.cliente='38557' and enc.NoDocumento LIKE 'TC%') and (select count(*) from CLI_IntegraCOFIDI.DBO.cfddet where empresa=enc.Empresa and NoDocumento=enc.nodocumento and descripcion not like 'Acero%')>0 \n");
			qlDomReceptor.append("  and enc.Empresa='");
			qlDomReceptor.append(request.getEmpresa().trim());
			qlDomReceptor.append("' \n");
			qlDomReceptor.append(" 	and enc.NoDocumento='");
			qlDomReceptor.append(request.getNumDoc().trim());
			qlDomReceptor.append("' \n");
			
			StringBuilder qlTxtLeyeda = new StringBuilder();
			qlTxtLeyeda.append("select  \n");
			qlTxtLeyeda.append("'LF' DetalleAux_Tipo, \n");
			qlTxtLeyeda.append("'textoLeyenda' DetalleAux_DescTipo, \n");
			qlTxtLeyeda.append("'IMMEX' DetalleAux_Misc01, \n");
			qlTxtLeyeda.append("case  \n");
			qlTxtLeyeda.append("	when enc.cliente='1500' then \n");
			qlTxtLeyeda.append("		'5.2.6 Fraccion II'  \n");
			qlTxtLeyeda.append("	when enc.cliente='2023' then \n");
			qlTxtLeyeda.append("		'5.2.6 Fraccion I'  \n");
			qlTxtLeyeda.append("	when enc.cliente='2043' then \n");
			qlTxtLeyeda.append("		'4.3.1' \n");
			qlTxtLeyeda.append("	else '' \n");
			qlTxtLeyeda.append("  end DetalleAux_Misc02, \n");
			qlTxtLeyeda.append("  case  \n");
			qlTxtLeyeda.append("	when enc.cliente='1500' then \n");
			qlTxtLeyeda.append("		'IMMEX de Metalsa (3108-2006), IMMEX del cliente (326-SAT-57812), Esta operación se efectúa en los términos de las reglas 5.2.6 fracción II, 5.2.7 y 4.3.21 de las RGCE'  \n");
			qlTxtLeyeda.append("	when enc.cliente='2023' then \n");
			qlTxtLeyeda.append("		'IMMEX de Metalsa (3108-2006), IMMEX del cliente (510-2013), Esta operación se efectúa en los términos de las reglas 5.2.6 fracción I, 5.2.7 y 4.3.21 de las RGCE'  \n");
			qlTxtLeyeda.append("	when enc.cliente='2043' then \n");
			qlTxtLeyeda.append("		'En la manufactura de este producto se utilizaron materiales importados temporalmente al amparo del Programa IMMEX No. 3108-2006 La presente operación se efectúa en los términos de lo dispuesto en la regla 4.3.11 de las Reglas Generales de Comercio Exterior vigentes. La transferencia de mercancía se realiza de METALSA S.A DE C.V. con RFC MET920131CN5 con programa IMMEX número 3108-2006 a FCA Mexico S.A. de C.V.' \n");
			qlTxtLeyeda.append("	else '' \n");
			qlTxtLeyeda.append("  end DetalleAux_Misc03, \n");
			qlTxtLeyeda.append("  null DetalleAux_Misc04,  \n");
			qlTxtLeyeda.append("  null DetalleAux_Misc05,  \n");
			qlTxtLeyeda.append("  null DetalleAux_Misc06,  \n");
			qlTxtLeyeda.append("  null DetalleAux_Misc07,  \n");
			qlTxtLeyeda.append("  null DetalleAux_Misc08,  \n");
			qlTxtLeyeda.append("  null DetalleAux_Misc09,   \n");
			qlTxtLeyeda.append("  null DetalleAux_Misc10,  \n");
			qlTxtLeyeda.append("  null DetalleAux_Misc11, \n");
			qlTxtLeyeda.append("  null DetalleAux_Misc12, \n");
			qlTxtLeyeda.append("  null DetalleAux_Misc13, \n");
			qlTxtLeyeda.append("  null DetalleAux_Misc14,  \n");
			qlTxtLeyeda.append("  null DetalleAux_Misc15, \n");
			qlTxtLeyeda.append("  null DetalleAux_Misc16 \n");
			qlTxtLeyeda.append("  from  \n");
			qlTxtLeyeda.append("  CLI_IntegraCOFIDI.dbo.cfdenc enc \n");
			qlTxtLeyeda.append("  where  \n");
			qlTxtLeyeda.append("  year(enc.FechaEmision)=2021 \n");
			qlTxtLeyeda.append("  and enc.cliente in('2043','1500','2023') \n");
			qlTxtLeyeda.append("  and enc.Empresa='");
			qlTxtLeyeda.append(request.getEmpresa().trim());
			qlTxtLeyeda.append("' \n");
			qlTxtLeyeda.append(" 	and enc.NoDocumento='");
			qlTxtLeyeda.append(request.getNumDoc().trim());
			qlTxtLeyeda.append("' \n");
			
			
			System.out.println("Query qlEncabezado: {}" + qlEncabezado);
			System.out.println("Query qlDestinatario: {}" + qlDestinatario);
			System.out.println("Query qlDomEmisor: {}" + qlDomEmisor);
			System.out.println("Query qlDomReceptor: {}" + qlDomReceptor);
			System.out.println("Query qlTxtLeyeda: {}" + qlTxtLeyeda);
			
			
			
			query = em.createNativeQuery(qlEncabezado.toString());
			List<Object[]> objectListaEncabezado = query.getResultList();
			
			
			if(objectListaEncabezado.size() > 0) {
				listaAuxComplePago.setEncabezado(MapEstrucSecAuxComplePagoTxtDTO.estrucSecAuxComplePago(objectListaEncabezado));
			}else {
				listaAuxComplePago.setEncabezado(null);
			}
			
			query = em.createNativeQuery(qlDestinatario.toString());
			List<Object[]> objectListaDestinatario = query.getResultList();
			
			
			if(objectListaDestinatario.size() > 0) {
				listaAuxComplePago.setDestinatario(MapEstrucSecAuxComplePagoTxtDTO.estrucSecAuxComplePago(objectListaDestinatario));
			}else {
				listaAuxComplePago.setDestinatario(null);
			}
			
			query = em.createNativeQuery(qlDomEmisor.toString());
			List<Object[]> objectListaDomEmisor = query.getResultList();
			
			
			if(objectListaDomEmisor.size() > 0) {
				listaAuxComplePago.setDomEmisor(MapEstrucSecAuxComplePagoTxtDTO.estrucSecAuxComplePago(objectListaDestinatario));
			}else {
				listaAuxComplePago.setDomEmisor(null);
			}
			
			query = em.createNativeQuery(qlDomReceptor.toString());
			List<Object[]> objectListaDomReceptor= query.getResultList();
			
			
			if(objectListaDomReceptor.size() > 0) {
				listaAuxComplePago.setDomReceptor(MapEstrucSecAuxComplePagoTxtDTO.estrucSecAuxComplePago(objectListaDomReceptor));
			}else {
				listaAuxComplePago.setDomReceptor(null);
			}
			
			query = em.createNativeQuery(qlTxtLeyeda.toString());
			List<Object[]> objectListaTxtLeyeda= query.getResultList();
			
			
			if(objectListaTxtLeyeda.size() > 0) {
				listaAuxComplePago.setTxtLeyeda(MapEstrucSecAuxComplePagoTxtDTO.estrucSecAuxComplePago(objectListaTxtLeyeda));
			}else {
				listaAuxComplePago.setTxtLeyeda(null);
			}
			
			
			
		}catch (Exception e) {
				System.out.println("Error getListaAuxComplePagoTxtDTO" + e);
						
		}finally {
						
			return listaAuxComplePago;

		}
		
		
	}
	
	
	
	
}
