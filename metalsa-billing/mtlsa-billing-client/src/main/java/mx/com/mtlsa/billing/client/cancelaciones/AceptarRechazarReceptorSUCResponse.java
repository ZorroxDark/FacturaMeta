
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
 *         &lt;element name="AceptarRechazarReceptorSUCResult" type="{http://tempuri.org/}ArrayOfAceptarRechazarResult" minOccurs="0"/&gt;
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
    "aceptarRechazarReceptorSUCResult"
})
@XmlRootElement(name = "AceptarRechazarReceptorSUCResponse")
public class AceptarRechazarReceptorSUCResponse {

    @XmlElement(name = "AceptarRechazarReceptorSUCResult")
    protected ArrayOfAceptarRechazarResult aceptarRechazarReceptorSUCResult;

    /**
     * Obtiene el valor de la propiedad aceptarRechazarReceptorSUCResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAceptarRechazarResult }
     *     
     */
    public ArrayOfAceptarRechazarResult getAceptarRechazarReceptorSUCResult() {
        return aceptarRechazarReceptorSUCResult;
    }

    /**
     * Define el valor de la propiedad aceptarRechazarReceptorSUCResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAceptarRechazarResult }
     *     
     */
    public void setAceptarRechazarReceptorSUCResult(ArrayOfAceptarRechazarResult value) {
        this.aceptarRechazarReceptorSUCResult = value;
    }

}
