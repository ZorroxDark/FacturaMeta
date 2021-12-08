
package mx.com.mtlsa.billing.client.cancelaciones;

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
 *         &lt;element name="cUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cPasswordUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cUsuario",
    "cPasswordUsuario"
})
@XmlRootElement(name = "LoginExternoSUC")
public class LoginExternoSUC {

    protected String cUsuario;
    protected String cPasswordUsuario;

    /**
     * Obtiene el valor de la propiedad cUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUsuario() {
        return cUsuario;
    }

    /**
     * Define el valor de la propiedad cUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUsuario(String value) {
        this.cUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad cPasswordUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPasswordUsuario() {
        return cPasswordUsuario;
    }

    /**
     * Define el valor de la propiedad cPasswordUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPasswordUsuario(String value) {
        this.cPasswordUsuario = value;
    }

}
