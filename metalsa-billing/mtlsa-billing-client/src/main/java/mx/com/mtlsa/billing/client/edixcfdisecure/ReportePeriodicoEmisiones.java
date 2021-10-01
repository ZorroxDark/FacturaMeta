
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
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rfcemisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechainicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechafinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rfcreceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="folioinicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foliofinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cRetVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cContenidoCSV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "usuario",
    "password",
    "rfcemisor",
    "fechainicial",
    "fechafinal",
    "rfcreceptor",
    "serie",
    "folioinicial",
    "foliofinal",
    "cRetVal",
    "cContenidoCSV"
})
@XmlRootElement(name = "reportePeriodicoEmisiones")
public class ReportePeriodicoEmisiones {

    protected String usuario;
    protected String password;
    protected String rfcemisor;
    protected String fechainicial;
    protected String fechafinal;
    protected String rfcreceptor;
    protected String serie;
    protected String folioinicial;
    protected String foliofinal;
    protected String cRetVal;
    protected String cContenidoCSV;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcemisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcemisor() {
        return rfcemisor;
    }

    /**
     * Define el valor de la propiedad rfcemisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcemisor(String value) {
        this.rfcemisor = value;
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

    /**
     * Obtiene el valor de la propiedad rfcreceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcreceptor() {
        return rfcreceptor;
    }

    /**
     * Define el valor de la propiedad rfcreceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcreceptor(String value) {
        this.rfcreceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad folioinicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioinicial() {
        return folioinicial;
    }

    /**
     * Define el valor de la propiedad folioinicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioinicial(String value) {
        this.folioinicial = value;
    }

    /**
     * Obtiene el valor de la propiedad foliofinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoliofinal() {
        return foliofinal;
    }

    /**
     * Define el valor de la propiedad foliofinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoliofinal(String value) {
        this.foliofinal = value;
    }

    /**
     * Obtiene el valor de la propiedad cRetVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRetVal() {
        return cRetVal;
    }

    /**
     * Define el valor de la propiedad cRetVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRetVal(String value) {
        this.cRetVal = value;
    }

    /**
     * Obtiene el valor de la propiedad cContenidoCSV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCContenidoCSV() {
        return cContenidoCSV;
    }

    /**
     * Define el valor de la propiedad cContenidoCSV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCContenidoCSV(String value) {
        this.cContenidoCSV = value;
    }

}
