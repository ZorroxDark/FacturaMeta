
package mx.com.mtlsa.billing.client.edixcfdisecure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="cRFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cNumeroCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dFechaFAK" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="cMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "crfc",
    "cNumeroCertificado",
    "dFechaFAK",
    "cMensaje"
})
@XmlRootElement(name = "SAT_ValidarListaBlanca")
public class SATValidarListaBlanca {

    @XmlElement(name = "cRFC")
    protected String crfc;
    protected String cNumeroCertificado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dFechaFAK;
    protected String cMensaje;

    /**
     * Obtiene el valor de la propiedad crfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRFC() {
        return crfc;
    }

    /**
     * Define el valor de la propiedad crfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRFC(String value) {
        this.crfc = value;
    }

    /**
     * Obtiene el valor de la propiedad cNumeroCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNumeroCertificado() {
        return cNumeroCertificado;
    }

    /**
     * Define el valor de la propiedad cNumeroCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNumeroCertificado(String value) {
        this.cNumeroCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad dFechaFAK.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDFechaFAK() {
        return dFechaFAK;
    }

    /**
     * Define el valor de la propiedad dFechaFAK.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDFechaFAK(XMLGregorianCalendar value) {
        this.dFechaFAK = value;
    }

    /**
     * Obtiene el valor de la propiedad cMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMensaje() {
        return cMensaje;
    }

    /**
     * Define el valor de la propiedad cMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMensaje(String value) {
        this.cMensaje = value;
    }

}
