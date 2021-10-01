
package mx.com.mtlsa.billing.client.edixcfdisecure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsRespuestaConsultaAcuses_DIAN complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsRespuestaConsultaAcuses_DIAN"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cCufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cNIT_Emisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cEstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cXMLAcuse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsRespuestaConsultaAcuses_DIAN", propOrder = {
    "cCufe",
    "cnitEmisor",
    "cInvoiceNumber",
    "cTipoDocumento",
    "cEstatus",
    "cMensaje",
    "cxmlAcuse"
})
public class ClsRespuestaConsultaAcusesDIAN {

    protected String cCufe;
    @XmlElement(name = "cNIT_Emisor")
    protected String cnitEmisor;
    protected String cInvoiceNumber;
    protected String cTipoDocumento;
    protected String cEstatus;
    protected String cMensaje;
    @XmlElement(name = "cXMLAcuse")
    protected String cxmlAcuse;

    /**
     * Obtiene el valor de la propiedad cCufe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCufe() {
        return cCufe;
    }

    /**
     * Define el valor de la propiedad cCufe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCufe(String value) {
        this.cCufe = value;
    }

    /**
     * Obtiene el valor de la propiedad cnitEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNITEmisor() {
        return cnitEmisor;
    }

    /**
     * Define el valor de la propiedad cnitEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNITEmisor(String value) {
        this.cnitEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad cInvoiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCInvoiceNumber() {
        return cInvoiceNumber;
    }

    /**
     * Define el valor de la propiedad cInvoiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCInvoiceNumber(String value) {
        this.cInvoiceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad cTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTipoDocumento() {
        return cTipoDocumento;
    }

    /**
     * Define el valor de la propiedad cTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTipoDocumento(String value) {
        this.cTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad cEstatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEstatus() {
        return cEstatus;
    }

    /**
     * Define el valor de la propiedad cEstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEstatus(String value) {
        this.cEstatus = value;
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
     * Obtiene el valor de la propiedad cxmlAcuse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCXMLAcuse() {
        return cxmlAcuse;
    }

    /**
     * Define el valor de la propiedad cxmlAcuse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCXMLAcuse(String value) {
        this.cxmlAcuse = value;
    }

}
