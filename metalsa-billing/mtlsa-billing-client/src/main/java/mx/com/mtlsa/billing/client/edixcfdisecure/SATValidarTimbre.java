
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
 *         &lt;element name="cCadenaOriginalTimbre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cNumeroCertificadoPAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cSelloTimbre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cCadenaOriginalTimbre",
    "cNumeroCertificadoPAC",
    "cSelloTimbre",
    "cMensaje"
})
@XmlRootElement(name = "SAT_ValidarTimbre")
public class SATValidarTimbre {

    protected String cCadenaOriginalTimbre;
    protected String cNumeroCertificadoPAC;
    protected String cSelloTimbre;
    protected String cMensaje;

    /**
     * Obtiene el valor de la propiedad cCadenaOriginalTimbre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCadenaOriginalTimbre() {
        return cCadenaOriginalTimbre;
    }

    /**
     * Define el valor de la propiedad cCadenaOriginalTimbre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCadenaOriginalTimbre(String value) {
        this.cCadenaOriginalTimbre = value;
    }

    /**
     * Obtiene el valor de la propiedad cNumeroCertificadoPAC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNumeroCertificadoPAC() {
        return cNumeroCertificadoPAC;
    }

    /**
     * Define el valor de la propiedad cNumeroCertificadoPAC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNumeroCertificadoPAC(String value) {
        this.cNumeroCertificadoPAC = value;
    }

    /**
     * Obtiene el valor de la propiedad cSelloTimbre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSelloTimbre() {
        return cSelloTimbre;
    }

    /**
     * Define el valor de la propiedad cSelloTimbre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSelloTimbre(String value) {
        this.cSelloTimbre = value;
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
