
package mx.com.mtlsa.billing.client.edixcfdisecure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReporteTimbradoResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReporteTimbradoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorReporte" type="{http://edixcfdisecure.ekomercio.com/}ErrorReporteTimbrado" minOccurs="0"/&gt;
 *         &lt;element name="Reporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReporteTimbradoResult", propOrder = {
    "errorReporte",
    "reporte"
})
public class ReporteTimbradoResult {

    @XmlElement(name = "ErrorReporte")
    protected ErrorReporteTimbrado errorReporte;
    @XmlElement(name = "Reporte")
    protected String reporte;

    /**
     * Obtiene el valor de la propiedad errorReporte.
     * 
     * @return
     *     possible object is
     *     {@link ErrorReporteTimbrado }
     *     
     */
    public ErrorReporteTimbrado getErrorReporte() {
        return errorReporte;
    }

    /**
     * Define el valor de la propiedad errorReporte.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorReporteTimbrado }
     *     
     */
    public void setErrorReporte(ErrorReporteTimbrado value) {
        this.errorReporte = value;
    }

    /**
     * Obtiene el valor de la propiedad reporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporte() {
        return reporte;
    }

    /**
     * Define el valor de la propiedad reporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporte(String value) {
        this.reporte = value;
    }

}
