
package mx.com.mtlsa.billing.client.edixcfdisecure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="SAT_ValidarCertificadoPropiosMediosFechaDocResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="nValidacionCertificado" type="{http://edixcfdisecure.ekomercio.com/}EnValidacionCertificado"/&gt;
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
    "satValidarCertificadoPropiosMediosFechaDocResult",
    "nValidacionCertificado",
    "cMensaje"
})
@XmlRootElement(name = "SAT_ValidarCertificadoPropiosMediosFechaDocResponse")
public class SATValidarCertificadoPropiosMediosFechaDocResponse {

    @XmlElement(name = "SAT_ValidarCertificadoPropiosMediosFechaDocResult")
    protected boolean satValidarCertificadoPropiosMediosFechaDocResult;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnValidacionCertificado nValidacionCertificado;
    protected String cMensaje;

    /**
     * Obtiene el valor de la propiedad satValidarCertificadoPropiosMediosFechaDocResult.
     * 
     */
    public boolean isSATValidarCertificadoPropiosMediosFechaDocResult() {
        return satValidarCertificadoPropiosMediosFechaDocResult;
    }

    /**
     * Define el valor de la propiedad satValidarCertificadoPropiosMediosFechaDocResult.
     * 
     */
    public void setSATValidarCertificadoPropiosMediosFechaDocResult(boolean value) {
        this.satValidarCertificadoPropiosMediosFechaDocResult = value;
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

}
