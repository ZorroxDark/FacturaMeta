
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
 *         &lt;element name="acuseDIAN_VerificacionResult" type="{http://edixcfdisecure.ekomercio.com/}ArrayOfClsRespuestaConsultaAcuses_DIAN" minOccurs="0"/&gt;
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
    "acuseDIANVerificacionResult"
})
@XmlRootElement(name = "acuseDIAN_VerificacionResponse")
public class AcuseDIANVerificacionResponse {

    @XmlElement(name = "acuseDIAN_VerificacionResult")
    protected ArrayOfClsRespuestaConsultaAcusesDIAN acuseDIANVerificacionResult;

    /**
     * Obtiene el valor de la propiedad acuseDIANVerificacionResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsRespuestaConsultaAcusesDIAN }
     *     
     */
    public ArrayOfClsRespuestaConsultaAcusesDIAN getAcuseDIANVerificacionResult() {
        return acuseDIANVerificacionResult;
    }

    /**
     * Define el valor de la propiedad acuseDIANVerificacionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsRespuestaConsultaAcusesDIAN }
     *     
     */
    public void setAcuseDIANVerificacionResult(ArrayOfClsRespuestaConsultaAcusesDIAN value) {
        this.acuseDIANVerificacionResult = value;
    }

}
