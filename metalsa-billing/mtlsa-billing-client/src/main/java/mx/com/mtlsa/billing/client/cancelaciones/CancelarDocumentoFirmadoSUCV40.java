
package mx.com.mtlsa.billing.client.cancelaciones;

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
 *         &lt;element name="cSolicitudFirmada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oListaSolicitudCancelacion" type="{http://tempuri.org/}ArrayOfSolicitudCancelacionFirmadaDTO_V40" minOccurs="0"/&gt;
 *         &lt;element name="cToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cSolicitudFirmada",
    "oListaSolicitudCancelacion",
    "cToken"
})
@XmlRootElement(name = "CancelarDocumentoFirmadoSUCV40")
public class CancelarDocumentoFirmadoSUCV40 {

    @XmlElement(name = "cRFCEmisor")
    protected String crfcEmisor;
    protected String cSolicitudFirmada;
    protected ArrayOfSolicitudCancelacionFirmadaDTOV40 oListaSolicitudCancelacion;
    protected String cToken;

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
     * Obtiene el valor de la propiedad cSolicitudFirmada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSolicitudFirmada() {
        return cSolicitudFirmada;
    }

    /**
     * Define el valor de la propiedad cSolicitudFirmada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSolicitudFirmada(String value) {
        this.cSolicitudFirmada = value;
    }

    /**
     * Obtiene el valor de la propiedad oListaSolicitudCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSolicitudCancelacionFirmadaDTOV40 }
     *     
     */
    public ArrayOfSolicitudCancelacionFirmadaDTOV40 getOListaSolicitudCancelacion() {
        return oListaSolicitudCancelacion;
    }

    /**
     * Define el valor de la propiedad oListaSolicitudCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSolicitudCancelacionFirmadaDTOV40 }
     *     
     */
    public void setOListaSolicitudCancelacion(ArrayOfSolicitudCancelacionFirmadaDTOV40 value) {
        this.oListaSolicitudCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCToken() {
        return cToken;
    }

    /**
     * Define el valor de la propiedad cToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCToken(String value) {
        this.cToken = value;
    }

}
