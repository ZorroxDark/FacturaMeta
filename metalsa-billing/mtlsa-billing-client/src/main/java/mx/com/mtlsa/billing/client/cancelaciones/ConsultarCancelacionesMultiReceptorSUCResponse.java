
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
 *         &lt;element name="ConsultarCancelacionesMultiReceptorSUCResult" type="{http://tempuri.org/}RespuestaDTOOfListOfCancelacionDTO" minOccurs="0"/&gt;
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
    "consultarCancelacionesMultiReceptorSUCResult"
})
@XmlRootElement(name = "ConsultarCancelacionesMultiReceptorSUCResponse")
public class ConsultarCancelacionesMultiReceptorSUCResponse {

    @XmlElement(name = "ConsultarCancelacionesMultiReceptorSUCResult")
    protected RespuestaDTOOfListOfCancelacionDTO consultarCancelacionesMultiReceptorSUCResult;

    /**
     * Obtiene el valor de la propiedad consultarCancelacionesMultiReceptorSUCResult.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTOOfListOfCancelacionDTO }
     *     
     */
    public RespuestaDTOOfListOfCancelacionDTO getConsultarCancelacionesMultiReceptorSUCResult() {
        return consultarCancelacionesMultiReceptorSUCResult;
    }

    /**
     * Define el valor de la propiedad consultarCancelacionesMultiReceptorSUCResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTOOfListOfCancelacionDTO }
     *     
     */
    public void setConsultarCancelacionesMultiReceptorSUCResult(RespuestaDTOOfListOfCancelacionDTO value) {
        this.consultarCancelacionesMultiReceptorSUCResult = value;
    }

}
