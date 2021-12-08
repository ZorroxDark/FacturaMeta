
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
 *         &lt;element name="SolicitarCancelacionValidacionSUCResult" type="{http://tempuri.org/}RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTO" minOccurs="0"/&gt;
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
    "solicitarCancelacionValidacionSUCResult"
})
@XmlRootElement(name = "SolicitarCancelacionValidacionSUCResponse")
public class SolicitarCancelacionValidacionSUCResponse {

    @XmlElement(name = "SolicitarCancelacionValidacionSUCResult")
    protected RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTO solicitarCancelacionValidacionSUCResult;

    /**
     * Obtiene el valor de la propiedad solicitarCancelacionValidacionSUCResult.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTO }
     *     
     */
    public RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTO getSolicitarCancelacionValidacionSUCResult() {
        return solicitarCancelacionValidacionSUCResult;
    }

    /**
     * Define el valor de la propiedad solicitarCancelacionValidacionSUCResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTO }
     *     
     */
    public void setSolicitarCancelacionValidacionSUCResult(RespuestaDTOOfListOfRespuestaDTOOfCancelacionDTO value) {
        this.solicitarCancelacionValidacionSUCResult = value;
    }

}
