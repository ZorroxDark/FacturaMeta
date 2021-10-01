
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
 *         &lt;element name="getCFDI2Result" type="{http://edixcfdisecure.ekomercio.com/}WSRespuestaTimbrado" minOccurs="0"/&gt;
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
    "getCFDI2Result"
})
@XmlRootElement(name = "getCFDI2Response")
public class GetCFDI2Response {

    protected WSRespuestaTimbrado getCFDI2Result;

    /**
     * Obtiene el valor de la propiedad getCFDI2Result.
     * 
     * @return
     *     possible object is
     *     {@link WSRespuestaTimbrado }
     *     
     */
    public WSRespuestaTimbrado getGetCFDI2Result() {
        return getCFDI2Result;
    }

    /**
     * Define el valor de la propiedad getCFDI2Result.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRespuestaTimbrado }
     *     
     */
    public void setGetCFDI2Result(WSRespuestaTimbrado value) {
        this.getCFDI2Result = value;
    }

}
