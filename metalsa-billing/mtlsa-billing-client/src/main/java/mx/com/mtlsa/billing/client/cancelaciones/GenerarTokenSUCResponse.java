
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
 *         &lt;element name="GenerarTokenSUCResult" type="{http://tempuri.org/}RespuestaDTOOfString" minOccurs="0"/&gt;
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
    "generarTokenSUCResult"
})
@XmlRootElement(name = "GenerarTokenSUCResponse")
public class GenerarTokenSUCResponse {

    @XmlElement(name = "GenerarTokenSUCResult")
    protected RespuestaDTOOfString generarTokenSUCResult;

    /**
     * Obtiene el valor de la propiedad generarTokenSUCResult.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTOOfString }
     *     
     */
    public RespuestaDTOOfString getGenerarTokenSUCResult() {
        return generarTokenSUCResult;
    }

    /**
     * Define el valor de la propiedad generarTokenSUCResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTOOfString }
     *     
     */
    public void setGenerarTokenSUCResult(RespuestaDTOOfString value) {
        this.generarTokenSUCResult = value;
    }

}
