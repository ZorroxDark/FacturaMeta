
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
 *         &lt;element name="getListaNegraResult" type="{http://edixcfdisecure.ekomercio.com/}ResultadoListaNegra" minOccurs="0"/&gt;
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
    "getListaNegraResult"
})
@XmlRootElement(name = "getListaNegraResponse")
public class GetListaNegraResponse {

    protected ResultadoListaNegra getListaNegraResult;

    /**
     * Obtiene el valor de la propiedad getListaNegraResult.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoListaNegra }
     *     
     */
    public ResultadoListaNegra getGetListaNegraResult() {
        return getListaNegraResult;
    }

    /**
     * Define el valor de la propiedad getListaNegraResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoListaNegra }
     *     
     */
    public void setGetListaNegraResult(ResultadoListaNegra value) {
        this.getListaNegraResult = value;
    }

}
