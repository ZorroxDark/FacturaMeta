
package mx.com.mtlsa.billing.client.edixcfdisecure;

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
 *         &lt;element name="cPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cRFCEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cRFCReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cRazonSocialReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cSerie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechainicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechafinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cPassword",
    "crfcEmisor",
    "crfcReceptor",
    "cRazonSocialReceptor",
    "cSerie",
    "cFolio",
    "fechainicial",
    "fechafinal"
})
@XmlRootElement(name = "ReporteTimbrado")
public class ReporteTimbrado {

    protected String cUsuario;
    protected String cPassword;
    @XmlElement(name = "cRFCEmisor")
    protected String crfcEmisor;
    @XmlElement(name = "cRFCReceptor")
    protected String crfcReceptor;
    protected String cRazonSocialReceptor;
    protected String cSerie;
    protected String cFolio;
    protected String fechainicial;
    protected String fechafinal;

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
     * Obtiene el valor de la propiedad cPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPassword() {
        return cPassword;
    }

    /**
     * Define el valor de la propiedad cPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPassword(String value) {
        this.cPassword = value;
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
     * Obtiene el valor de la propiedad crfcReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRFCReceptor() {
        return crfcReceptor;
    }

    /**
     * Define el valor de la propiedad crfcReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRFCReceptor(String value) {
        this.crfcReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad cRazonSocialReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRazonSocialReceptor() {
        return cRazonSocialReceptor;
    }

    /**
     * Define el valor de la propiedad cRazonSocialReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRazonSocialReceptor(String value) {
        this.cRazonSocialReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad cSerie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSerie() {
        return cSerie;
    }

    /**
     * Define el valor de la propiedad cSerie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSerie(String value) {
        this.cSerie = value;
    }

    /**
     * Obtiene el valor de la propiedad cFolio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFolio() {
        return cFolio;
    }

    /**
     * Define el valor de la propiedad cFolio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFolio(String value) {
        this.cFolio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechainicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechainicial() {
        return fechainicial;
    }

    /**
     * Define el valor de la propiedad fechainicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechainicial(String value) {
        this.fechainicial = value;
    }

    /**
     * Obtiene el valor de la propiedad fechafinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechafinal() {
        return fechafinal;
    }

    /**
     * Define el valor de la propiedad fechafinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechafinal(String value) {
        this.fechafinal = value;
    }

}
