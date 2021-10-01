
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
 *         &lt;element name="RecuperarCFDIByMisc30Result" type="{http://edixcfdisecure.ekomercio.com/}Result" minOccurs="0"/&gt;
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
    "recuperarCFDIByMisc30Result"
})
@XmlRootElement(name = "RecuperarCFDIByMisc30Response")
public class RecuperarCFDIByMisc30Response {

    @XmlElement(name = "RecuperarCFDIByMisc30Result")
    protected Result recuperarCFDIByMisc30Result;

    /**
     * Obtiene el valor de la propiedad recuperarCFDIByMisc30Result.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getRecuperarCFDIByMisc30Result() {
        return recuperarCFDIByMisc30Result;
    }

    /**
     * Define el valor de la propiedad recuperarCFDIByMisc30Result.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setRecuperarCFDIByMisc30Result(Result value) {
        this.recuperarCFDIByMisc30Result = value;
    }

}
