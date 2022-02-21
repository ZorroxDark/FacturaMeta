
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
 *         &lt;element name="oListUUID" type="{http://tempuri.org/}ArrayOfValidarUUIDS_V40" minOccurs="0"/&gt;
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
    "oListUUID",
    "cToken"
})
@XmlRootElement(name = "ValidarUUIDSUCV40")
public class ValidarUUIDSUCV40 {

    protected ArrayOfValidarUUIDSV40 oListUUID;
    protected String cToken;

    /**
     * Obtiene el valor de la propiedad oListUUID.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidarUUIDSV40 }
     *     
     */
    public ArrayOfValidarUUIDSV40 getOListUUID() {
        return oListUUID;
    }

    /**
     * Define el valor de la propiedad oListUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidarUUIDSV40 }
     *     
     */
    public void setOListUUID(ArrayOfValidarUUIDSV40 value) {
        this.oListUUID = value;
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
