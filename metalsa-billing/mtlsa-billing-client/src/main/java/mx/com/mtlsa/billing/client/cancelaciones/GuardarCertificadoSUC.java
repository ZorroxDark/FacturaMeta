
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
 *         &lt;element name="cUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cPasswordUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cRFCEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cLLave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cPasswordCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cPasswordUsuario",
    "crfcEmisor",
    "cCertificado",
    "clLave",
    "cPasswordCertificado"
})
@XmlRootElement(name = "GuardarCertificadoSUC")
public class GuardarCertificadoSUC {

    protected String cUsuario;
    protected String cPasswordUsuario;
    @XmlElement(name = "cRFCEmisor")
    protected String crfcEmisor;
    protected String cCertificado;
    @XmlElement(name = "cLLave")
    protected String clLave;
    protected String cPasswordCertificado;

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

    /**
     * Obtiene el valor de la propiedad crfcEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRFCEmisor() {
        return crfcEmisor;
    }

    /**
     * Define el valor de la propiedad crfcEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRFCEmisor(String value) {
        this.crfcEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad cCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCertificado() {
        return cCertificado;
    }

    /**
     * Define el valor de la propiedad cCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCertificado(String value) {
        this.cCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad clLave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLLave() {
        return clLave;
    }

    /**
     * Define el valor de la propiedad clLave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLLave(String value) {
        this.clLave = value;
    }

    /**
     * Obtiene el valor de la propiedad cPasswordCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPasswordCertificado() {
        return cPasswordCertificado;
    }

    /**
     * Define el valor de la propiedad cPasswordCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPasswordCertificado(String value) {
        this.cPasswordCertificado = value;
    }

}
