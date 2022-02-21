
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
 *         &lt;element name="CancelarDocumentoFirmadoSUCV40Result" type="{http://tempuri.org/}RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTO_V40" minOccurs="0"/&gt;
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
    "cancelarDocumentoFirmadoSUCV40Result"
})
@XmlRootElement(name = "CancelarDocumentoFirmadoSUCV40Response")
public class CancelarDocumentoFirmadoSUCV40Response {

    @XmlElement(name = "CancelarDocumentoFirmadoSUCV40Result")
    protected RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40 cancelarDocumentoFirmadoSUCV40Result;

    /**
     * Obtiene el valor de la propiedad cancelarDocumentoFirmadoSUCV40Result.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40 }
     *     
     */
    public RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40 getCancelarDocumentoFirmadoSUCV40Result() {
        return cancelarDocumentoFirmadoSUCV40Result;
    }

    /**
     * Define el valor de la propiedad cancelarDocumentoFirmadoSUCV40Result.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40 }
     *     
     */
    public void setCancelarDocumentoFirmadoSUCV40Result(RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40 value) {
        this.cancelarDocumentoFirmadoSUCV40Result = value;
    }

}
