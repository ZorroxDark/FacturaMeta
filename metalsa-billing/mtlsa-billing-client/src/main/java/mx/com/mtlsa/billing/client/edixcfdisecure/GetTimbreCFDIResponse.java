
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
 *         &lt;element name="getTimbreCFDIResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getTimbreCFDIResult"
})
@XmlRootElement(name = "getTimbreCFDIResponse")
public class GetTimbreCFDIResponse {

    protected String getTimbreCFDIResult;

    /**
     * Obtiene el valor de la propiedad getTimbreCFDIResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetTimbreCFDIResult() {
        return getTimbreCFDIResult;
    }

    /**
     * Define el valor de la propiedad getTimbreCFDIResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetTimbreCFDIResult(String value) {
        this.getTimbreCFDIResult = value;
    }

}
