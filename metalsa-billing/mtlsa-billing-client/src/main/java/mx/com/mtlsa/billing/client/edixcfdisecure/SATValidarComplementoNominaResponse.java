
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
 *         &lt;element name="SAT_ValidarComplementoNominaResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "satValidarComplementoNominaResult",
    "cMensaje"
})
@XmlRootElement(name = "SAT_ValidarComplementoNominaResponse")
public class SATValidarComplementoNominaResponse {

    @XmlElement(name = "SAT_ValidarComplementoNominaResult")
    protected boolean satValidarComplementoNominaResult;
    protected String cMensaje;

    /**
     * Obtiene el valor de la propiedad satValidarComplementoNominaResult.
     * 
     */
    public boolean isSATValidarComplementoNominaResult() {
        return satValidarComplementoNominaResult;
    }

    /**
     * Define el valor de la propiedad satValidarComplementoNominaResult.
     * 
     */
    public void setSATValidarComplementoNominaResult(boolean value) {
        this.satValidarComplementoNominaResult = value;
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
