
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
 *         &lt;element name="ConsultarRelacionadosEmisorReceptorSUCResult" type="{http://tempuri.org/}RespuestaDTOOfListOfRelacionados" minOccurs="0"/&gt;
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
    "consultarRelacionadosEmisorReceptorSUCResult"
})
@XmlRootElement(name = "ConsultarRelacionadosEmisorReceptorSUCResponse")
public class ConsultarRelacionadosEmisorReceptorSUCResponse {

    @XmlElement(name = "ConsultarRelacionadosEmisorReceptorSUCResult")
    protected RespuestaDTOOfListOfRelacionados consultarRelacionadosEmisorReceptorSUCResult;

    /**
     * Obtiene el valor de la propiedad consultarRelacionadosEmisorReceptorSUCResult.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTOOfListOfRelacionados }
     *     
     */
    public RespuestaDTOOfListOfRelacionados getConsultarRelacionadosEmisorReceptorSUCResult() {
        return consultarRelacionadosEmisorReceptorSUCResult;
    }

    /**
     * Define el valor de la propiedad consultarRelacionadosEmisorReceptorSUCResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTOOfListOfRelacionados }
     *     
     */
    public void setConsultarRelacionadosEmisorReceptorSUCResult(RespuestaDTOOfListOfRelacionados value) {
        this.consultarRelacionadosEmisorReceptorSUCResult = value;
    }

}
