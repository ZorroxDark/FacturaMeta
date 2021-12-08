
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
 *         &lt;element name="ValidarUUIDSUCResult" type="{http://tempuri.org/}RespuestaDTOOfListOfRespuestaDTOOfString" minOccurs="0"/&gt;
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
    "validarUUIDSUCResult"
})
@XmlRootElement(name = "ValidarUUIDSUCResponse")
public class ValidarUUIDSUCResponse {

    @XmlElement(name = "ValidarUUIDSUCResult")
    protected RespuestaDTOOfListOfRespuestaDTOOfString validarUUIDSUCResult;

    /**
     * Obtiene el valor de la propiedad validarUUIDSUCResult.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTOOfListOfRespuestaDTOOfString }
     *     
     */
    public RespuestaDTOOfListOfRespuestaDTOOfString getValidarUUIDSUCResult() {
        return validarUUIDSUCResult;
    }

    /**
     * Define el valor de la propiedad validarUUIDSUCResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTOOfListOfRespuestaDTOOfString }
     *     
     */
    public void setValidarUUIDSUCResult(RespuestaDTOOfListOfRespuestaDTOOfString value) {
        this.validarUUIDSUCResult = value;
    }

}
