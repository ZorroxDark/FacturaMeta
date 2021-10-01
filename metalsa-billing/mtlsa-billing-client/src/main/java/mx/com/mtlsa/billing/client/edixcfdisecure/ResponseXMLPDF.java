
package mx.com.mtlsa.billing.client.edixcfdisecure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponseXMLPDF complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseXMLPDF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DoctoXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DoctoPDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseXMLPDF", propOrder = {
    "doctoXML",
    "doctoPDF"
})
public class ResponseXMLPDF {

    @XmlElement(name = "DoctoXML")
    protected String doctoXML;
    @XmlElement(name = "DoctoPDF")
    protected String doctoPDF;

    /**
     * Obtiene el valor de la propiedad doctoXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctoXML() {
        return doctoXML;
    }

    /**
     * Define el valor de la propiedad doctoXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctoXML(String value) {
        this.doctoXML = value;
    }

    /**
     * Obtiene el valor de la propiedad doctoPDF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctoPDF() {
        return doctoPDF;
    }

    /**
     * Define el valor de la propiedad doctoPDF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctoPDF(String value) {
        this.doctoPDF = value;
    }

}
