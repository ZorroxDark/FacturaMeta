
package mx.com.mtlsa.billing.client.cancelaciones;

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
 *         &lt;element name="CancelarDocumentoTimbradoSPResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cancelarDocumentoTimbradoSPResult"
})
@XmlRootElement(name = "CancelarDocumentoTimbradoSPResponse")
public class CancelarDocumentoTimbradoSPResponse {

    @XmlElement(name = "CancelarDocumentoTimbradoSPResult")
    protected String cancelarDocumentoTimbradoSPResult;

    /**
     * Obtiene el valor de la propiedad cancelarDocumentoTimbradoSPResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelarDocumentoTimbradoSPResult() {
        return cancelarDocumentoTimbradoSPResult;
    }

    /**
     * Define el valor de la propiedad cancelarDocumentoTimbradoSPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelarDocumentoTimbradoSPResult(String value) {
        this.cancelarDocumentoTimbradoSPResult = value;
    }

}
