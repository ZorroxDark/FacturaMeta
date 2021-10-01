
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
 *         &lt;element name="oSerie" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="nFolio" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nAnoAprob" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nNumAprob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "oSerie",
    "nFolio",
    "nAnoAprob",
    "nNumAprob",
    "cMensaje"
})
@XmlRootElement(name = "SAT_ConsecutivoDentroRango")
public class SATConsecutivoDentroRango {

    @XmlElement(name = "cRFC")
    protected String crfc;
    protected Object oSerie;
    protected long nFolio;
    protected long nAnoAprob;
    protected String nNumAprob;
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
     * Obtiene el valor de la propiedad oSerie.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOSerie() {
        return oSerie;
    }

    /**
     * Define el valor de la propiedad oSerie.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOSerie(Object value) {
        this.oSerie = value;
    }

    /**
     * Obtiene el valor de la propiedad nFolio.
     * 
     */
    public long getNFolio() {
        return nFolio;
    }

    /**
     * Define el valor de la propiedad nFolio.
     * 
     */
    public void setNFolio(long value) {
        this.nFolio = value;
    }

    /**
     * Obtiene el valor de la propiedad nAnoAprob.
     * 
     */
    public long getNAnoAprob() {
        return nAnoAprob;
    }

    /**
     * Define el valor de la propiedad nAnoAprob.
     * 
     */
    public void setNAnoAprob(long value) {
        this.nAnoAprob = value;
    }

    /**
     * Obtiene el valor de la propiedad nNumAprob.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNNumAprob() {
        return nNumAprob;
    }

    /**
     * Define el valor de la propiedad nNumAprob.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNNumAprob(String value) {
        this.nNumAprob = value;
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
