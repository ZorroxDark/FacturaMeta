
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
 *         &lt;element name="ValidarUUIDSUCV40Result" type="{http://tempuri.org/}RespuestaDTOOfListOfRespuestaDTOOfContenidoDato" minOccurs="0"/&gt;
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
    "validarUUIDSUCV40Result"
})
@XmlRootElement(name = "ValidarUUIDSUCV40Response")
public class ValidarUUIDSUCV40Response {

    @XmlElement(name = "ValidarUUIDSUCV40Result")
    protected RespuestaDTOOfListOfRespuestaDTOOfContenidoDato validarUUIDSUCV40Result;

    /**
     * Obtiene el valor de la propiedad validarUUIDSUCV40Result.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTOOfListOfRespuestaDTOOfContenidoDato }
     *     
     */
    public RespuestaDTOOfListOfRespuestaDTOOfContenidoDato getValidarUUIDSUCV40Result() {
        return validarUUIDSUCV40Result;
    }

    /**
     * Define el valor de la propiedad validarUUIDSUCV40Result.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTOOfListOfRespuestaDTOOfContenidoDato }
     *     
     */
    public void setValidarUUIDSUCV40Result(RespuestaDTOOfListOfRespuestaDTOOfContenidoDato value) {
        this.validarUUIDSUCV40Result = value;
    }

}
