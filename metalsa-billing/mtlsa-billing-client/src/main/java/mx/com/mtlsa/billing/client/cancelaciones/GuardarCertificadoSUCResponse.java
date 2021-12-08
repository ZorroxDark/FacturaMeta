
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
 *         &lt;element name="GuardarCertificadoSUCResult" type="{http://tempuri.org/}RespuestaDTOOfString" minOccurs="0"/&gt;
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
    "guardarCertificadoSUCResult"
})
@XmlRootElement(name = "GuardarCertificadoSUCResponse")
public class GuardarCertificadoSUCResponse {

    @XmlElement(name = "GuardarCertificadoSUCResult")
    protected RespuestaDTOOfString guardarCertificadoSUCResult;

    /**
     * Obtiene el valor de la propiedad guardarCertificadoSUCResult.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTOOfString }
     *     
     */
    public RespuestaDTOOfString getGuardarCertificadoSUCResult() {
        return guardarCertificadoSUCResult;
    }

    /**
     * Define el valor de la propiedad guardarCertificadoSUCResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTOOfString }
     *     
     */
    public void setGuardarCertificadoSUCResult(RespuestaDTOOfString value) {
        this.guardarCertificadoSUCResult = value;
    }

}
