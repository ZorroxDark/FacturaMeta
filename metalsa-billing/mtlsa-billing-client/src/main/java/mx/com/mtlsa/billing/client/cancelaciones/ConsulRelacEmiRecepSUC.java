
package mx.com.mtlsa.billing.client.cancelaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsulRelacEmiRecepSUC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsulRelacEmiRecepSUC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cRFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cTipoRFC" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cCFDI_UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ConsulRelacEmiRecepSUC", propOrder = {
    "crfc",
    "cTipoRFC",
    "ccfdiuuid",
    "cToken"
})
public class ConsulRelacEmiRecepSUC {

    @XmlElement(name = "cRFC")
    protected String crfc;
    protected int cTipoRFC;
    @XmlElement(name = "cCFDI_UUID")
    protected String ccfdiuuid;
    protected String cToken;

    /**
     * Obtiene el valor de la propiedad crfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRFC() {
        return crfc;
    }

    /**
     * Define el valor de la propiedad crfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRFC(String value) {
        this.crfc = value;
    }

    /**
     * Obtiene el valor de la propiedad cTipoRFC.
     * 
     */
    public int getCTipoRFC() {
        return cTipoRFC;
    }

    /**
     * Define el valor de la propiedad cTipoRFC.
     * 
     */
    public void setCTipoRFC(int value) {
        this.cTipoRFC = value;
    }

    /**
     * Obtiene el valor de la propiedad ccfdiuuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCFDIUUID() {
        return ccfdiuuid;
    }

    /**
     * Define el valor de la propiedad ccfdiuuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCFDIUUID(String value) {
        this.ccfdiuuid = value;
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
