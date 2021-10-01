
package mx.com.mtlsa.billing.client.edixcfdisecure;

import java.math.BigDecimal;
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
 *         &lt;element name="cRFCEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cRFCReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nMontoTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="cUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "crfcEmisor",
    "crfcReceptor",
    "nMontoTotal",
    "cuuid",
    "cMensaje"
})
@XmlRootElement(name = "SAT_ExisteTimbreSAT")
public class SATExisteTimbreSAT {

    @XmlElement(name = "cRFCEmisor")
    protected String crfcEmisor;
    @XmlElement(name = "cRFCReceptor")
    protected String crfcReceptor;
    @XmlElement(required = true)
    protected BigDecimal nMontoTotal;
    @XmlElement(name = "cUUID")
    protected String cuuid;
    protected String cMensaje;

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
     * Obtiene el valor de la propiedad nMontoTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNMontoTotal() {
        return nMontoTotal;
    }

    /**
     * Define el valor de la propiedad nMontoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNMontoTotal(BigDecimal value) {
        this.nMontoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad cuuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUUID() {
        return cuuid;
    }

    /**
     * Define el valor de la propiedad cuuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUUID(String value) {
        this.cuuid = value;
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
