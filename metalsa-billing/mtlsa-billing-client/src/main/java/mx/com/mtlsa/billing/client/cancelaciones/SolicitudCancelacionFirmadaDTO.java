
package mx.com.mtlsa.billing.client.cancelaciones;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SolicitudCancelacionFirmadaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SolicitudCancelacionFirmadaDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CFDI_UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RFCReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MontoTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitudCancelacionFirmadaDTO", propOrder = {
    "cfdiuuid",
    "rfcReceptor",
    "montoTotal"
})
public class SolicitudCancelacionFirmadaDTO {

    @XmlElement(name = "CFDI_UUID")
    protected String cfdiuuid;
    @XmlElement(name = "RFCReceptor")
    protected String rfcReceptor;
    @XmlElement(name = "MontoTotal", required = true)
    protected BigDecimal montoTotal;

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
     * Obtiene el valor de la propiedad rfcReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCReceptor() {
        return rfcReceptor;
    }

    /**
     * Define el valor de la propiedad rfcReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCReceptor(String value) {
        this.rfcReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    /**
     * Define el valor de la propiedad montoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTotal(BigDecimal value) {
        this.montoTotal = value;
    }

}
