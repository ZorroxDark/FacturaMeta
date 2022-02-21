
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
 *         &lt;element name="ConsultaCancelacionSUCV40Result" type="{http://tempuri.org/}RespuestaDTOOfListOfCancelacionDTO_V40" minOccurs="0"/&gt;
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
    "consultaCancelacionSUCV40Result"
})
@XmlRootElement(name = "ConsultaCancelacionSUCV40Response")
public class ConsultaCancelacionSUCV40Response {

    @XmlElement(name = "ConsultaCancelacionSUCV40Result")
    protected RespuestaDTOOfListOfCancelacionDTOV40 consultaCancelacionSUCV40Result;

    /**
     * Obtiene el valor de la propiedad consultaCancelacionSUCV40Result.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTOOfListOfCancelacionDTOV40 }
     *     
     */
    public RespuestaDTOOfListOfCancelacionDTOV40 getConsultaCancelacionSUCV40Result() {
        return consultaCancelacionSUCV40Result;
    }

    /**
     * Define el valor de la propiedad consultaCancelacionSUCV40Result.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTOOfListOfCancelacionDTOV40 }
     *     
     */
    public void setConsultaCancelacionSUCV40Result(RespuestaDTOOfListOfCancelacionDTOV40 value) {
        this.consultaCancelacionSUCV40Result = value;
    }

}
