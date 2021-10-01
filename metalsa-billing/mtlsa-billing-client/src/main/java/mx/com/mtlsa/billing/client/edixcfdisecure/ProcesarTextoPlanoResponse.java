
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
 *         &lt;element name="procesarTextoPlanoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "procesarTextoPlanoResult"
})
@XmlRootElement(name = "procesarTextoPlanoResponse")
public class ProcesarTextoPlanoResponse {

    protected String procesarTextoPlanoResult;

    /**
     * Obtiene el valor de la propiedad procesarTextoPlanoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcesarTextoPlanoResult() {
        return procesarTextoPlanoResult;
    }

    /**
     * Define el valor de la propiedad procesarTextoPlanoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcesarTextoPlanoResult(String value) {
        this.procesarTextoPlanoResult = value;
    }

}
