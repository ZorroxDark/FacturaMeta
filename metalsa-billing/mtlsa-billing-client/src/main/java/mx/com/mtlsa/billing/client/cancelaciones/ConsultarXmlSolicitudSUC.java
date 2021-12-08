
package mx.com.mtlsa.billing.client.cancelaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="cUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cUuid",
    "cToken"
})
@XmlRootElement(name = "ConsultarXmlSolicitudSUC")
public class ConsultarXmlSolicitudSUC {

    protected String cUuid;
    protected String cToken;

    /**
     * Obtiene el valor de la propiedad cUuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUuid() {
        return cUuid;
    }

    /**
     * Define el valor de la propiedad cUuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUuid(String value) {
        this.cUuid = value;
    }

    /**
     * Obtiene el valor de la propiedad cToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCToken() {
        return cToken;
    }

    /**
     * Define el valor de la propiedad cToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCToken(String value) {
        this.cToken = value;
    }

}
