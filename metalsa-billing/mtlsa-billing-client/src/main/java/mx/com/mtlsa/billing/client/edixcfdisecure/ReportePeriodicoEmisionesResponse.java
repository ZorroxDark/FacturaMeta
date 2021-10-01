
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
 *         &lt;element name="reportePeriodicoEmisionesResult" type="{http://edixcfdisecure.ekomercio.com/}ArrayOfEmision" minOccurs="0"/&gt;
 *         &lt;element name="cRetVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cContenidoCSV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "reportePeriodicoEmisionesResult",
    "cRetVal",
    "cContenidoCSV"
})
@XmlRootElement(name = "reportePeriodicoEmisionesResponse")
public class ReportePeriodicoEmisionesResponse {

    protected ArrayOfEmision reportePeriodicoEmisionesResult;
    protected String cRetVal;
    protected String cContenidoCSV;

    /**
     * Obtiene el valor de la propiedad reportePeriodicoEmisionesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmision }
     *     
     */
    public ArrayOfEmision getReportePeriodicoEmisionesResult() {
        return reportePeriodicoEmisionesResult;
    }

    /**
     * Define el valor de la propiedad reportePeriodicoEmisionesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmision }
     *     
     */
    public void setReportePeriodicoEmisionesResult(ArrayOfEmision value) {
        this.reportePeriodicoEmisionesResult = value;
    }

    /**
     * Obtiene el valor de la propiedad cRetVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRetVal() {
        return cRetVal;
    }

    /**
     * Define el valor de la propiedad cRetVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRetVal(String value) {
        this.cRetVal = value;
    }

    /**
     * Obtiene el valor de la propiedad cContenidoCSV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCContenidoCSV() {
        return cContenidoCSV;
    }

    /**
     * Define el valor de la propiedad cContenidoCSV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCContenidoCSV(String value) {
        this.cContenidoCSV = value;
    }

}
