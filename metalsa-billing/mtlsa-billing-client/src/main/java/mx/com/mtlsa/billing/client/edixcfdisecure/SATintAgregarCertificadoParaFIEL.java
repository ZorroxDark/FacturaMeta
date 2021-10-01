
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
 *         &lt;element name="cRFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cNumCert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cFechaIni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cFechaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cNumCert",
    "cFechaIni",
    "cFechaFin"
})
@XmlRootElement(name = "SATint_AgregarCertificadoParaFIEL")
public class SATintAgregarCertificadoParaFIEL {

    @XmlElement(name = "cRFC")
    protected String crfc;
    protected String cNumCert;
    protected String cFechaIni;
    protected String cFechaFin;

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
     * Obtiene el valor de la propiedad cNumCert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNumCert() {
        return cNumCert;
    }

    /**
     * Define el valor de la propiedad cNumCert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNumCert(String value) {
        this.cNumCert = value;
    }

    /**
     * Obtiene el valor de la propiedad cFechaIni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFechaIni() {
        return cFechaIni;
    }

    /**
     * Define el valor de la propiedad cFechaIni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFechaIni(String value) {
        this.cFechaIni = value;
    }

    /**
     * Obtiene el valor de la propiedad cFechaFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFechaFin() {
        return cFechaFin;
    }

    /**
     * Define el valor de la propiedad cFechaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFechaFin(String value) {
        this.cFechaFin = value;
    }

}
