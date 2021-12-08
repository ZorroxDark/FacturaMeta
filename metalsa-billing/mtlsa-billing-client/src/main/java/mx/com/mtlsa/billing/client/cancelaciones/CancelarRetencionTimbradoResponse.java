
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
 *         &lt;element name="CancelarRetencionTimbradoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cancelarRetencionTimbradoResult"
})
@XmlRootElement(name = "CancelarRetencionTimbradoResponse")
public class CancelarRetencionTimbradoResponse {

    @XmlElement(name = "CancelarRetencionTimbradoResult")
    protected String cancelarRetencionTimbradoResult;

    /**
     * Obtiene el valor de la propiedad cancelarRetencionTimbradoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelarRetencionTimbradoResult() {
        return cancelarRetencionTimbradoResult;
    }

    /**
     * Define el valor de la propiedad cancelarRetencionTimbradoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelarRetencionTimbradoResult(String value) {
        this.cancelarRetencionTimbradoResult = value;
    }

}
