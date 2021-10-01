
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
 *         &lt;element name="getListaNegraDetalleResult" type="{http://edixcfdisecure.ekomercio.com/}ResultadoListaNegraDetalle" minOccurs="0"/&gt;
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
    "getListaNegraDetalleResult"
})
@XmlRootElement(name = "getListaNegraDetalleResponse")
public class GetListaNegraDetalleResponse {

    protected ResultadoListaNegraDetalle getListaNegraDetalleResult;

    /**
     * Obtiene el valor de la propiedad getListaNegraDetalleResult.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoListaNegraDetalle }
     *     
     */
    public ResultadoListaNegraDetalle getGetListaNegraDetalleResult() {
        return getListaNegraDetalleResult;
    }

    /**
     * Define el valor de la propiedad getListaNegraDetalleResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoListaNegraDetalle }
     *     
     */
    public void setGetListaNegraDetalleResult(ResultadoListaNegraDetalle value) {
        this.getListaNegraDetalleResult = value;
    }

}
