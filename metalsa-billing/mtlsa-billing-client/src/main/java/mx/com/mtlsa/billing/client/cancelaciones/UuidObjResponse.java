
package mx.com.mtlsa.billing.client.cancelaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para UuidObjResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UuidObjResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CFDI_UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaAcuse" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UuidObjResponse", propOrder = {
    "cfdiuuid",
    "docXML",
    "fechaAcuse"
})
public class UuidObjResponse {

    @XmlElement(name = "CFDI_UUID")
    protected String cfdiuuid;
    @XmlElement(name = "DocXML")
    protected String docXML;
    @XmlElement(name = "FechaAcuse", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAcuse;

    /**
     * Obtiene el valor de la propiedad cfdiuuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFDIUUID() {
        return cfdiuuid;
    }

    /**
     * Define el valor de la propiedad cfdiuuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFDIUUID(String value) {
        this.cfdiuuid = value;
    }

    /**
     * Obtiene el valor de la propiedad docXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocXML() {
        return docXML;
    }

    /**
     * Define el valor de la propiedad docXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocXML(String value) {
        this.docXML = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAcuse.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAcuse() {
        return fechaAcuse;
    }

    /**
     * Define el valor de la propiedad fechaAcuse.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAcuse(XMLGregorianCalendar value) {
        this.fechaAcuse = value;
    }

}
