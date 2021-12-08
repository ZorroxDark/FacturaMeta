
package mx.com.mtlsa.billing.client.cancelaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsultarXmlSolicitudSUCResult" type="{http://tempuri.org/}RespuestaDTOOfUuidObjResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultarXmlSolicitudSUCResult"
})
@XmlRootElement(name = "ConsultarXmlSolicitudSUCResponse")
public class ConsultarXmlSolicitudSUCResponse {

    @XmlElement(name = "ConsultarXmlSolicitudSUCResult")
    protected RespuestaDTOOfUuidObjResponse consultarXmlSolicitudSUCResult;

    /**
     * Obtiene el valor de la propiedad consultarXmlSolicitudSUCResult.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTOOfUuidObjResponse }
     *     
     */
    public RespuestaDTOOfUuidObjResponse getConsultarXmlSolicitudSUCResult() {
        return consultarXmlSolicitudSUCResult;
    }

    /**
     * Define el valor de la propiedad consultarXmlSolicitudSUCResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTOOfUuidObjResponse }
     *     
     */
    public void setConsultarXmlSolicitudSUCResult(RespuestaDTOOfUuidObjResponse value) {
        this.consultarXmlSolicitudSUCResult = value;
    }

}
