
package mx.com.mtlsa.billing.client.cancelaciones;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSCFDICancelacionSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSCFDICancelacionSoap {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "HelloWorld", action = "http://tempuri.org/HelloWorld")
    @WebResult(name = "HelloWorldResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "HelloWorld", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.HelloWorld")
    @ResponseWrapper(localName = "HelloWorldResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.HelloWorldResponse")
    public String helloWorld();

    /**
     * 
     * @param cRFCEmisor
     * @param cUUID
     * @param cToken
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfString
     */
    @WebMethod(operationName = "ConsultarAcuseSolicitudSUC", action = "http://tempuri.org/ConsultarAcuseSolicitudSUC")
    @WebResult(name = "ConsultarAcuseSolicitudSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultarAcuseSolicitudSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultarAcuseSolicitudSUC")
    @ResponseWrapper(localName = "ConsultarAcuseSolicitudSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultarAcuseSolicitudSUCResponse")
    public RespuestaDTOOfString consultarAcuseSolicitudSUC(
        @WebParam(name = "cRFCEmisor", targetNamespace = "http://tempuri.org/")
        String cRFCEmisor,
        @WebParam(name = "cUUID", targetNamespace = "http://tempuri.org/")
        String cUUID,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param cXMLRespuestaFirmadoB64
     * @param cToken
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfString
     */
    @WebMethod(operationName = "AceptarRechazarReceptorFirmadoSUC", action = "http://tempuri.org/AceptarRechazarReceptorFirmadoSUC")
    @WebResult(name = "AceptarRechazarReceptorFirmadoSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AceptarRechazarReceptorFirmadoSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.AceptarRechazarReceptorFirmadoSUC")
    @ResponseWrapper(localName = "AceptarRechazarReceptorFirmadoSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.AceptarRechazarReceptorFirmadoSUCResponse")
    public RespuestaDTOOfString aceptarRechazarReceptorFirmadoSUC(
        @WebParam(name = "cXMLRespuestaFirmadoB64", targetNamespace = "http://tempuri.org/")
        String cXMLRespuestaFirmadoB64,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param cRFCReceptor
     * @param cToken
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfCancelacionDTO
     */
    @WebMethod(operationName = "ConsultarCancelacionesMultiReceptorSUC", action = "http://tempuri.org/ConsultarCancelacionesMultiReceptorSUC")
    @WebResult(name = "ConsultarCancelacionesMultiReceptorSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultarCancelacionesMultiReceptorSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultarCancelacionesMultiReceptorSUC")
    @ResponseWrapper(localName = "ConsultarCancelacionesMultiReceptorSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultarCancelacionesMultiReceptorSUCResponse")
    public RespuestaDTOOfListOfCancelacionDTO consultarCancelacionesMultiReceptorSUC(
        @WebParam(name = "cRFC_Receptor", targetNamespace = "http://tempuri.org/")
        String cRFCReceptor,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param cToken
     * @param oRequestAceptarRechazarReceptorSUC
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.ArrayOfAceptarRechazarResult
     */
    @WebMethod(operationName = "AceptarRechazarReceptorSUC", action = "http://tempuri.org/AceptarRechazarReceptorSUC")
    @WebResult(name = "AceptarRechazarReceptorSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AceptarRechazarReceptorSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.AceptarRechazarReceptorSUC")
    @ResponseWrapper(localName = "AceptarRechazarReceptorSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.AceptarRechazarReceptorSUCResponse")
    public ArrayOfAceptarRechazarResult aceptarRechazarReceptorSUC(
        @WebParam(name = "oRequestAceptarRechazarReceptorSUC", targetNamespace = "http://tempuri.org/")
        ArrayOfRequestAceptarRechazarReceptorSUC oRequestAceptarRechazarReceptorSUC,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param cToken
     * @param oRequestAceptarRechazarReceptorSUC
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfString
     */
    @WebMethod(operationName = "AceptarRechazarCFDIReceptorSUC", action = "http://tempuri.org/AceptarRechazarCFDIReceptorSUC")
    @WebResult(name = "AceptarRechazarCFDIReceptorSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AceptarRechazarCFDIReceptorSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.AceptarRechazarCFDIReceptorSUC")
    @ResponseWrapper(localName = "AceptarRechazarCFDIReceptorSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.AceptarRechazarCFDIReceptorSUCResponse")
    public RespuestaDTOOfString aceptarRechazarCFDIReceptorSUC(
        @WebParam(name = "oRequestAceptarRechazarReceptorSUC", targetNamespace = "http://tempuri.org/")
        RequestAceptarRechazarReceptorSUC oRequestAceptarRechazarReceptorSUC,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param cToken
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfCancelacionDTO
     */
    @WebMethod(operationName = "ConsultarCancelacionesReceptorSUC", action = "http://tempuri.org/ConsultarCancelacionesReceptorSUC")
    @WebResult(name = "ConsultarCancelacionesReceptorSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultarCancelacionesReceptorSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultarCancelacionesReceptorSUC")
    @ResponseWrapper(localName = "ConsultarCancelacionesReceptorSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultarCancelacionesReceptorSUCResponse")
    public RespuestaDTOOfListOfCancelacionDTO consultarCancelacionesReceptorSUC(
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param oListUUID
     * @param cToken
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfRespuestaDTOOfString
     */
    @WebMethod(operationName = "ValidarUUIDSUC", action = "http://tempuri.org/ValidarUUIDSUC")
    @WebResult(name = "ValidarUUIDSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ValidarUUIDSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ValidarUUIDSUC")
    @ResponseWrapper(localName = "ValidarUUIDSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ValidarUUIDSUCResponse")
    public RespuestaDTOOfListOfRespuestaDTOOfString validarUUIDSUC(
        @WebParam(name = "oListUUID", targetNamespace = "http://tempuri.org/")
        ArrayOfValidarUUIDS oListUUID,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param cToken
     * @param cCFDIUUID
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfRelacionados
     */
    @WebMethod(operationName = "ConsultarRelacionadosSUC", action = "http://tempuri.org/ConsultarRelacionadosSUC")
    @WebResult(name = "ConsultarRelacionadosSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultarRelacionadosSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultarRelacionadosSUC")
    @ResponseWrapper(localName = "ConsultarRelacionadosSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultarRelacionadosSUCResponse")
    public RespuestaDTOOfListOfRelacionados consultarRelacionadosSUC(
        @WebParam(name = "cCFDI_UUID", targetNamespace = "http://tempuri.org/")
        String cCFDIUUID,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param consulRelacEmiRecepSUC
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfRelacionados
     */
    @WebMethod(operationName = "ConsultarRelacionadosEmisorReceptorSUC", action = "http://tempuri.org/ConsultarRelacionadosEmisorReceptorSUC")
    @WebResult(name = "ConsultarRelacionadosEmisorReceptorSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultarRelacionadosEmisorReceptorSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultarRelacionadosEmisorReceptorSUC")
    @ResponseWrapper(localName = "ConsultarRelacionadosEmisorReceptorSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultarRelacionadosEmisorReceptorSUCResponse")
    public RespuestaDTOOfListOfRelacionados consultarRelacionadosEmisorReceptorSUC(
        @WebParam(name = "_ConsulRelacEmiRecepSUC", targetNamespace = "http://tempuri.org/")
        ConsulRelacEmiRecepSUC consulRelacEmiRecepSUC);

    /**
     * 
     * @param cRFCEmisor
     * @param cSolicitudFirmada
     * @param oListaSolicitudCancelacion
     * @param cToken
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTO
     */
    @WebMethod(operationName = "CancelarDocumentoFirmadoSUC", action = "http://tempuri.org/CancelarDocumentoFirmadoSUC")
    @WebResult(name = "CancelarDocumentoFirmadoSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CancelarDocumentoFirmadoSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.CancelarDocumentoFirmadoSUC")
    @ResponseWrapper(localName = "CancelarDocumentoFirmadoSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.CancelarDocumentoFirmadoSUCResponse")
    public RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTO cancelarDocumentoFirmadoSUC(
        @WebParam(name = "cRFCEmisor", targetNamespace = "http://tempuri.org/")
        String cRFCEmisor,
        @WebParam(name = "cSolicitudFirmada", targetNamespace = "http://tempuri.org/")
        String cSolicitudFirmada,
        @WebParam(name = "oListaSolicitudCancelacion", targetNamespace = "http://tempuri.org/")
        ArrayOfSolicitudCancelacionFirmadaDTO oListaSolicitudCancelacion,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param cPasswordUsuario
     * @param cUsuario
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfString
     */
    @WebMethod(operationName = "LoginExternoSUC", action = "http://tempuri.org/LoginExternoSUC")
    @WebResult(name = "LoginExternoSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "LoginExternoSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.LoginExternoSUC")
    @ResponseWrapper(localName = "LoginExternoSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.LoginExternoSUCResponse")
    public RespuestaDTOOfString loginExternoSUC(
        @WebParam(name = "cUsuario", targetNamespace = "http://tempuri.org/")
        String cUsuario,
        @WebParam(name = "cPasswordUsuario", targetNamespace = "http://tempuri.org/")
        String cPasswordUsuario);

    /**
     * 
     * @param cPasswordUsuario
     * @param cRFCEmisor
     * @param cUsuario
     * @param cAlias
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfString
     */
    @WebMethod(operationName = "GenerarTokenSUC", action = "http://tempuri.org/GenerarTokenSUC")
    @WebResult(name = "GenerarTokenSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GenerarTokenSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.GenerarTokenSUC")
    @ResponseWrapper(localName = "GenerarTokenSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.GenerarTokenSUCResponse")
    public RespuestaDTOOfString generarTokenSUC(
        @WebParam(name = "cUsuario", targetNamespace = "http://tempuri.org/")
        String cUsuario,
        @WebParam(name = "cPasswordUsuario", targetNamespace = "http://tempuri.org/")
        String cPasswordUsuario,
        @WebParam(name = "cRFCEmisor", targetNamespace = "http://tempuri.org/")
        String cRFCEmisor,
        @WebParam(name = "cAlias", targetNamespace = "http://tempuri.org/")
        String cAlias);

    /**
     * 
     * @param cPasswordUsuario
     * @param cRFCEmisor
     * @param cCertificado
     * @param cUsuario
     * @param cPasswordCertificado
     * @param cLLave
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfString
     */
    @WebMethod(operationName = "GuardarCertificadoSUC", action = "http://tempuri.org/GuardarCertificadoSUC")
    @WebResult(name = "GuardarCertificadoSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GuardarCertificadoSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.GuardarCertificadoSUC")
    @ResponseWrapper(localName = "GuardarCertificadoSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.GuardarCertificadoSUCResponse")
    public RespuestaDTOOfString guardarCertificadoSUC(
        @WebParam(name = "cUsuario", targetNamespace = "http://tempuri.org/")
        String cUsuario,
        @WebParam(name = "cPasswordUsuario", targetNamespace = "http://tempuri.org/")
        String cPasswordUsuario,
        @WebParam(name = "cRFCEmisor", targetNamespace = "http://tempuri.org/")
        String cRFCEmisor,
        @WebParam(name = "cCertificado", targetNamespace = "http://tempuri.org/")
        String cCertificado,
        @WebParam(name = "cLLave", targetNamespace = "http://tempuri.org/")
        String cLLave,
        @WebParam(name = "cPasswordCertificado", targetNamespace = "http://tempuri.org/")
        String cPasswordCertificado);

    /**
     * 
     * @param oListaSolicitudCancelacion
     * @param cToken
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTO
     */
    @WebMethod(operationName = "SolicitarCancelacionSUC", action = "http://tempuri.org/SolicitarCancelacionSUC")
    @WebResult(name = "SolicitarCancelacionSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SolicitarCancelacionSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.SolicitarCancelacionSUC")
    @ResponseWrapper(localName = "SolicitarCancelacionSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.SolicitarCancelacionSUCResponse")
    public RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTO solicitarCancelacionSUC(
        @WebParam(name = "oListaSolicitudCancelacion", targetNamespace = "http://tempuri.org/")
        ArrayOfSolicitudCancelacionDTO oListaSolicitudCancelacion,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param oListaSolicitudCancelacion
     * @param cToken
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTO
     */
    @WebMethod(operationName = "SolicitarCancelacionValidacionSUC", action = "http://tempuri.org/SolicitarCancelacionValidacionSUC")
    @WebResult(name = "SolicitarCancelacionValidacionSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SolicitarCancelacionValidacionSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.SolicitarCancelacionValidacionSUC")
    @ResponseWrapper(localName = "SolicitarCancelacionValidacionSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.SolicitarCancelacionValidacionSUCResponse")
    public RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTO solicitarCancelacionValidacionSUC(
        @WebParam(name = "oListaSolicitudCancelacion", targetNamespace = "http://tempuri.org/")
        ArrayOfSolicitudCancelacionDTO oListaSolicitudCancelacion,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param oListUUID
     * @param cToken
     * @param dFechaInicio
     * @param dFechaFin
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfCancelacionDTO
     */
    @WebMethod(operationName = "ConsultaCancelacionSUC", action = "http://tempuri.org/ConsultaCancelacionSUC")
    @WebResult(name = "ConsultaCancelacionSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaCancelacionSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultaCancelacionSUC")
    @ResponseWrapper(localName = "ConsultaCancelacionSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultaCancelacionSUCResponse")
    public RespuestaDTOOfListOfCancelacionDTO consultaCancelacionSUC(
        @WebParam(name = "oListUUID", targetNamespace = "http://tempuri.org/")
        ArrayOfString oListUUID,
        @WebParam(name = "dFechaInicio", targetNamespace = "http://tempuri.org/")
        XMLGregorianCalendar dFechaInicio,
        @WebParam(name = "dFechaFin", targetNamespace = "http://tempuri.org/")
        XMLGregorianCalendar dFechaFin,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param cLlavePrivada
     * @param lEjecucionAsincronica
     * @param cRFCEmisor
     * @param cUUID
     * @param cCertificado
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CancelarRetencionTimbrado", action = "http://tempuri.org/CancelarRetencionTimbrado")
    @WebResult(name = "CancelarRetencionTimbradoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CancelarRetencionTimbrado", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.CancelarRetencionTimbrado")
    @ResponseWrapper(localName = "CancelarRetencionTimbradoResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.CancelarRetencionTimbradoResponse")
    public String cancelarRetencionTimbrado(
        @WebParam(name = "cRFCEmisor", targetNamespace = "http://tempuri.org/")
        String cRFCEmisor,
        @WebParam(name = "cUUID", targetNamespace = "http://tempuri.org/")
        String cUUID,
        @WebParam(name = "cLlavePrivada", targetNamespace = "http://tempuri.org/")
        String cLlavePrivada,
        @WebParam(name = "cCertificado", targetNamespace = "http://tempuri.org/")
        String cCertificado,
        @WebParam(name = "lEjecucionAsincronica", targetNamespace = "http://tempuri.org/")
        boolean lEjecucionAsincronica);

    /**
     * 
     * @param cLlavePrivada
     * @param cRFCAdquiriente
     * @param cUUID
     * @param cCertificado
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CancelarDocumentoTimbradoSP", action = "http://tempuri.org/CancelarDocumentoTimbradoSP")
    @WebResult(name = "CancelarDocumentoTimbradoSPResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CancelarDocumentoTimbradoSP", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.CancelarDocumentoTimbradoSP")
    @ResponseWrapper(localName = "CancelarDocumentoTimbradoSPResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.CancelarDocumentoTimbradoSPResponse")
    public String cancelarDocumentoTimbradoSP(
        @WebParam(name = "cRFCAdquiriente", targetNamespace = "http://tempuri.org/")
        String cRFCAdquiriente,
        @WebParam(name = "cUUID", targetNamespace = "http://tempuri.org/")
        String cUUID,
        @WebParam(name = "cLlavePrivada", targetNamespace = "http://tempuri.org/")
        String cLlavePrivada,
        @WebParam(name = "cCertificado", targetNamespace = "http://tempuri.org/")
        String cCertificado);

    /**
     * 
     * @param cRFCEmisor
     * @param cFolioSeguimientoSAT
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultaCancelacionRetencionTimbrado", action = "http://tempuri.org/ConsultaCancelacionRetencionTimbrado")
    @WebResult(name = "ConsultaCancelacionRetencionTimbradoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaCancelacionRetencionTimbrado", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultaCancelacionRetencionTimbrado")
    @ResponseWrapper(localName = "ConsultaCancelacionRetencionTimbradoResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultaCancelacionRetencionTimbradoResponse")
    public String consultaCancelacionRetencionTimbrado(
        @WebParam(name = "cRFCEmisor", targetNamespace = "http://tempuri.org/")
        String cRFCEmisor,
        @WebParam(name = "cFolioSeguimientoSAT", targetNamespace = "http://tempuri.org/")
        String cFolioSeguimientoSAT);

    /**
     * 
     * @param cUuid
     * @param cToken
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfUuidObjResponse
     */
    @WebMethod(operationName = "ConsultarXmlSolicitudSUC", action = "http://tempuri.org/ConsultarXmlSolicitudSUC")
    @WebResult(name = "ConsultarXmlSolicitudSUCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultarXmlSolicitudSUC", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultarXmlSolicitudSUC")
    @ResponseWrapper(localName = "ConsultarXmlSolicitudSUCResponse", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultarXmlSolicitudSUCResponse")
    public RespuestaDTOOfUuidObjResponse consultarXmlSolicitudSUC(
        @WebParam(name = "cUuid", targetNamespace = "http://tempuri.org/")
        String cUuid,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param cRFCEmisor
     * @param cSolicitudFirmada
     * @param oListaSolicitudCancelacion
     * @param cToken
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40
     */
    @WebMethod(operationName = "CancelarDocumentoFirmadoSUCV40", action = "http://tempuri.org/CancelarDocumentoFirmadoSUCV40")
    @WebResult(name = "CancelarDocumentoFirmadoSUCV40Result", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CancelarDocumentoFirmadoSUCV40", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.CancelarDocumentoFirmadoSUCV40")
    @ResponseWrapper(localName = "CancelarDocumentoFirmadoSUCV40Response", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.CancelarDocumentoFirmadoSUCV40Response")
    public RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40 cancelarDocumentoFirmadoSUCV40(
        @WebParam(name = "cRFCEmisor", targetNamespace = "http://tempuri.org/")
        String cRFCEmisor,
        @WebParam(name = "cSolicitudFirmada", targetNamespace = "http://tempuri.org/")
        String cSolicitudFirmada,
        @WebParam(name = "oListaSolicitudCancelacion", targetNamespace = "http://tempuri.org/")
        ArrayOfSolicitudCancelacionFirmadaDTOV40 oListaSolicitudCancelacion,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param oListUUID
     * @param cToken
     * @param dFechaInicio
     * @param dFechaFin
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfCancelacionDTOV40
     */
    @WebMethod(operationName = "ConsultaCancelacionSUCV40", action = "http://tempuri.org/ConsultaCancelacionSUCV40")
    @WebResult(name = "ConsultaCancelacionSUCV40Result", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaCancelacionSUCV40", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultaCancelacionSUCV40")
    @ResponseWrapper(localName = "ConsultaCancelacionSUCV40Response", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ConsultaCancelacionSUCV40Response")
    public RespuestaDTOOfListOfCancelacionDTOV40 consultaCancelacionSUCV40(
        @WebParam(name = "oListUUID", targetNamespace = "http://tempuri.org/")
        ArrayOfString oListUUID,
        @WebParam(name = "dFechaInicio", targetNamespace = "http://tempuri.org/")
        XMLGregorianCalendar dFechaInicio,
        @WebParam(name = "dFechaFin", targetNamespace = "http://tempuri.org/")
        XMLGregorianCalendar dFechaFin,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param oListaSolicitudCancelacion
     * @param cToken
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40
     */
    @WebMethod(operationName = "SolicitarCancelacionSUCV40", action = "http://tempuri.org/SolicitarCancelacionSUCV40")
    @WebResult(name = "SolicitarCancelacionSUCV40Result", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SolicitarCancelacionSUCV40", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.SolicitarCancelacionSUCV40")
    @ResponseWrapper(localName = "SolicitarCancelacionSUCV40Response", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.SolicitarCancelacionSUCV40Response")
    public RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40 solicitarCancelacionSUCV40(
        @WebParam(name = "oListaSolicitudCancelacion", targetNamespace = "http://tempuri.org/")
        ArrayOfSolicitudCancelacionDTOV40 oListaSolicitudCancelacion,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

    /**
     * 
     * @param oListUUID
     * @param cToken
     * @return
     *     returns mx.com.mtlsa.billing.client.cancelaciones.RespuestaDTOOfListOfRespuestaDTOOfContenidoDato
     */
    @WebMethod(operationName = "ValidarUUIDSUCV40", action = "http://tempuri.org/ValidarUUIDSUCV40")
    @WebResult(name = "ValidarUUIDSUCV40Result", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ValidarUUIDSUCV40", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ValidarUUIDSUCV40")
    @ResponseWrapper(localName = "ValidarUUIDSUCV40Response", targetNamespace = "http://tempuri.org/", className = "mx.com.mtlsa.billing.client.cancelaciones.ValidarUUIDSUCV40Response")
    public RespuestaDTOOfListOfRespuestaDTOOfContenidoDato validarUUIDSUCV40(
        @WebParam(name = "oListUUID", targetNamespace = "http://tempuri.org/")
        ArrayOfValidarUUIDSV40 oListUUID,
        @WebParam(name = "cToken", targetNamespace = "http://tempuri.org/")
        String cToken);

}
