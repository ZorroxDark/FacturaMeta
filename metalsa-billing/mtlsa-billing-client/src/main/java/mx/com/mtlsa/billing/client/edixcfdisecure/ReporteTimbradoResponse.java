
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
 *         &lt;element name="ReporteTimbradoResult" type="{http://edixcfdisecure.ekomercio.com/}ReporteTimbradoResult" minOccurs="0"/&gt;
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
    "reporteTimbradoResult"
})
@XmlRootElement(name = "ReporteTimbradoResponse")
public class ReporteTimbradoResponse {

    @XmlElement(name = "ReporteTimbradoResult")
    protected ReporteTimbradoResult reporteTimbradoResult;

    /**
     * Obtiene el valor de la propiedad reporteTimbradoResult.
     * 
     * @return
     *     possible object is
     *     {@link ReporteTimbradoResult }
     *     
     */
    public ReporteTimbradoResult getReporteTimbradoResult() {
        return reporteTimbradoResult;
    }

    /**
     * Define el valor de la propiedad reporteTimbradoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ReporteTimbradoResult }
     *     
     */
    public void setReporteTimbradoResult(ReporteTimbradoResult value) {
        this.reporteTimbradoResult = value;
    }

}
