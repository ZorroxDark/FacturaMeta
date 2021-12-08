
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
 *         &lt;element name="ConsultarRelacionadosSUCResult" type="{http://tempuri.org/}RespuestaDTOOfListOfRelacionados" minOccurs="0"/&gt;
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
    "consultarRelacionadosSUCResult"
})
@XmlRootElement(name = "ConsultarRelacionadosSUCResponse")
public class ConsultarRelacionadosSUCResponse {

    @XmlElement(name = "ConsultarRelacionadosSUCResult")
    protected RespuestaDTOOfListOfRelacionados consultarRelacionadosSUCResult;

    /**
     * Obtiene el valor de la propiedad consultarRelacionadosSUCResult.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTOOfListOfRelacionados }
     *     
     */
    public RespuestaDTOOfListOfRelacionados getConsultarRelacionadosSUCResult() {
        return consultarRelacionadosSUCResult;
    }

    /**
     * Define el valor de la propiedad consultarRelacionadosSUCResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTOOfListOfRelacionados }
     *     
     */
    public void setConsultarRelacionadosSUCResult(RespuestaDTOOfListOfRelacionados value) {
        this.consultarRelacionadosSUCResult = value;
    }

}
