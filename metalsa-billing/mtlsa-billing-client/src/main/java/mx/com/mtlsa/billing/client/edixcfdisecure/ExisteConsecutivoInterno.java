
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
 *         &lt;element name="cConsecutivoInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cConsecutivoInterno",
    "cErrorMensaje"
})
@XmlRootElement(name = "existeConsecutivoInterno")
public class ExisteConsecutivoInterno {

    protected String cConsecutivoInterno;
    protected String cErrorMensaje;

    /**
     * Obtiene el valor de la propiedad cConsecutivoInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCConsecutivoInterno() {
        return cConsecutivoInterno;
    }

    /**
     * Define el valor de la propiedad cConsecutivoInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCConsecutivoInterno(String value) {
        this.cConsecutivoInterno = value;
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
