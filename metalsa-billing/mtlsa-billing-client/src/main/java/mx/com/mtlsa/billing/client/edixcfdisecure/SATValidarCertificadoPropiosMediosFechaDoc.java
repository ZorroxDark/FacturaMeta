
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
 *         &lt;element name="cCertificadoBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nValidacionCertificado" type="{http://edixcfdisecure.ekomercio.com/}EnValidacionCertificado"/&gt;
 *         &lt;element name="cMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dFechaDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
    "cCertificadoBase64",
    "nValidacionCertificado",
    "cMensaje",
    "dFechaDocumento"
})
@XmlRootElement(name = "SAT_ValidarCertificadoPropiosMediosFechaDoc")
public class SATValidarCertificadoPropiosMediosFechaDoc {

    @XmlElement(name = "cRFC")
    protected String crfc;
    protected String cNumeroCertificado;
    protected String cCertificadoBase64;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnValidacionCertificado nValidacionCertificado;
    protected String cMensaje;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dFechaDocumento;

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
     * Obtiene el valor de la propiedad cCertificadoBase64.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCertificadoBase64() {
        return cCertificadoBase64;
    }

    /**
     * Define el valor de la propiedad cCertificadoBase64.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCertificadoBase64(String value) {
        this.cCertificadoBase64 = value;
    }

    /**
     * Obtiene el valor de la propiedad nValidacionCertificado.
     * 
     * @return
     *     possible object is
     *     {@link EnValidacionCertificado }
     *     
     */
    public EnValidacionCertificado getNValidacionCertificado() {
        return nValidacionCertificado;
    }

    /**
     * Define el valor de la propiedad nValidacionCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link EnValidacionCertificado }
     *     
     */
    public void setNValidacionCertificado(EnValidacionCertificado value) {
        this.nValidacionCertificado = value;
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

    /**
     * Obtiene el valor de la propiedad dFechaDocumento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDFechaDocumento() {
        return dFechaDocumento;
    }

    /**
     * Define el valor de la propiedad dFechaDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDFechaDocumento(XMLGregorianCalendar value) {
        this.dFechaDocumento = value;
    }

}
