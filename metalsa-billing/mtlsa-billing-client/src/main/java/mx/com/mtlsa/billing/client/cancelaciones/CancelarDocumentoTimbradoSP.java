
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
 *         &lt;element name="cRFCAdquiriente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cLlavePrivada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "crfcAdquiriente",
    "cuuid",
    "cLlavePrivada",
    "cCertificado"
})
@XmlRootElement(name = "CancelarDocumentoTimbradoSP")
public class CancelarDocumentoTimbradoSP {

    @XmlElement(name = "cRFCAdquiriente")
    protected String crfcAdquiriente;
    @XmlElement(name = "cUUID")
    protected String cuuid;
    protected String cLlavePrivada;
    protected String cCertificado;

    /**
     * Obtiene el valor de la propiedad crfcAdquiriente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRFCAdquiriente() {
        return crfcAdquiriente;
    }

    /**
     * Define el valor de la propiedad crfcAdquiriente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRFCAdquiriente(String value) {
        this.crfcAdquiriente = value;
    }

    /**
     * Obtiene el valor de la propiedad cuuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUUID() {
        return cuuid;
    }

    /**
     * Define el valor de la propiedad cuuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUUID(String value) {
        this.cuuid = value;
    }

    /**
     * Obtiene el valor de la propiedad cLlavePrivada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLlavePrivada() {
        return cLlavePrivada;
    }

    /**
     * Define el valor de la propiedad cLlavePrivada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLlavePrivada(String value) {
        this.cLlavePrivada = value;
    }

    /**
     * Obtiene el valor de la propiedad cCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCertificado() {
        return cCertificado;
    }

    /**
     * Define el valor de la propiedad cCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCertificado(String value) {
        this.cCertificado = value;
    }

}
