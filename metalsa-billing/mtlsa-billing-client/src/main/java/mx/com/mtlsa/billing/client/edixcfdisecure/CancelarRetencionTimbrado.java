
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
 *         &lt;element name="cRFCEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cLlavePrivada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lEjecucionAsincronica" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "cuuid",
    "cLlavePrivada",
    "cCertificado",
    "lEjecucionAsincronica"
})
@XmlRootElement(name = "CancelarRetencionTimbrado")
public class CancelarRetencionTimbrado {

    @XmlElement(name = "cRFCEmisor")
    protected String crfcEmisor;
    @XmlElement(name = "cUUID")
    protected String cuuid;
    protected String cLlavePrivada;
    protected String cCertificado;
    protected boolean lEjecucionAsincronica;

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
     * Obtiene el valor de la propiedad cLlavePrivada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLlavePrivada() {
        return cLlavePrivada;
    }

    /**
     * Define el valor de la propiedad cLlavePrivada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLlavePrivada(String value) {
        this.cLlavePrivada = value;
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
     * Obtiene el valor de la propiedad lEjecucionAsincronica.
     * 
     */
    public boolean isLEjecucionAsincronica() {
        return lEjecucionAsincronica;
    }

    /**
     * Define el valor de la propiedad lEjecucionAsincronica.
     * 
     */
    public void setLEjecucionAsincronica(boolean value) {
        this.lEjecucionAsincronica = value;
    }

}
