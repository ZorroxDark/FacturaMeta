
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
 *         &lt;element name="getTimbrePDFResult" type="{http://edixcfdisecure.ekomercio.com/}ResponseXMLPDF" minOccurs="0"/&gt;
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
    "getTimbrePDFResult"
})
@XmlRootElement(name = "getTimbrePDFResponse")
public class GetTimbrePDFResponse {

    protected ResponseXMLPDF getTimbrePDFResult;

    /**
     * Obtiene el valor de la propiedad getTimbrePDFResult.
     * 
     * @return
     *     possible object is
     *     {@link ResponseXMLPDF }
     *     
     */
    public ResponseXMLPDF getGetTimbrePDFResult() {
        return getTimbrePDFResult;
    }

    /**
     * Define el valor de la propiedad getTimbrePDFResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseXMLPDF }
     *     
     */
    public void setGetTimbrePDFResult(ResponseXMLPDF value) {
        this.getTimbrePDFResult = value;
    }

}
