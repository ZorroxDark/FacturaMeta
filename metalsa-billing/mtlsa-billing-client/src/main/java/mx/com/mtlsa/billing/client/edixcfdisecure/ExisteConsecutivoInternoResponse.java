
package mx.com.mtlsa.billing.client.edixcfdisecure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="existeConsecutivoInternoResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cErrorMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "existeConsecutivoInternoResult",
    "cErrorMensaje"
})
@XmlRootElement(name = "existeConsecutivoInternoResponse")
public class ExisteConsecutivoInternoResponse {

    protected boolean existeConsecutivoInternoResult;
    protected String cErrorMensaje;

    /**
     * Obtiene el valor de la propiedad existeConsecutivoInternoResult.
     * 
     */
    public boolean isExisteConsecutivoInternoResult() {
        return existeConsecutivoInternoResult;
    }

    /**
     * Define el valor de la propiedad existeConsecutivoInternoResult.
     * 
     */
    public void setExisteConsecutivoInternoResult(boolean value) {
        this.existeConsecutivoInternoResult = value;
    }

    /**
     * Obtiene el valor de la propiedad cErrorMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCErrorMensaje() {
        return cErrorMensaje;
    }

    /**
     * Define el valor de la propiedad cErrorMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCErrorMensaje(String value) {
        this.cErrorMensaje = value;
    }

}
