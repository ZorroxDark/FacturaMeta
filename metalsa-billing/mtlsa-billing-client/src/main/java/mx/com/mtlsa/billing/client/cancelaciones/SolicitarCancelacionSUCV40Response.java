
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
 *         &lt;element name="SolicitarCancelacionSUCV40Result" type="{http://tempuri.org/}RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTO_V40" minOccurs="0"/&gt;
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
    "solicitarCancelacionSUCV40Result"
})
@XmlRootElement(name = "SolicitarCancelacionSUCV40Response")
public class SolicitarCancelacionSUCV40Response {

    @XmlElement(name = "SolicitarCancelacionSUCV40Result")
    protected RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40 solicitarCancelacionSUCV40Result;

    /**
     * Obtiene el valor de la propiedad solicitarCancelacionSUCV40Result.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40 }
     *     
     */
    public RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40 getSolicitarCancelacionSUCV40Result() {
        return solicitarCancelacionSUCV40Result;
    }

    /**
     * Define el valor de la propiedad solicitarCancelacionSUCV40Result.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40 }
     *     
     */
    public void setSolicitarCancelacionSUCV40Result(RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTOV40 value) {
        this.solicitarCancelacionSUCV40Result = value;
    }

}
