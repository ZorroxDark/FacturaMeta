
package mx.com.mtlsa.billing.client.edixcfdisecure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ListaNegraDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListaNegraDetalle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstaArt69" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="oArt69B" type="{http://edixcfdisecure.ekomercio.com/}Art69B" minOccurs="0"/&gt;
 *         &lt;element name="EstaArt69_B" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="oArt69" type="{http://edixcfdisecure.ekomercio.com/}Art69" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaNegraDetalle", propOrder = {
    "rfc",
    "estaArt69",
    "oArt69B",
    "estaArt69B",
    "oArt69"
})
public class ListaNegraDetalle {

    @XmlElement(name = "RFC")
    protected String rfc;
    @XmlElement(name = "EstaArt69")
    protected boolean estaArt69;
    protected Art69B oArt69B;
    @XmlElement(name = "EstaArt69_B")
    protected boolean estaArt69B;
    protected Art69 oArt69;

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFC(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad estaArt69.
     * 
     */
    public boolean isEstaArt69() {
        return estaArt69;
    }

    /**
     * Define el valor de la propiedad estaArt69.
     * 
     */
    public void setEstaArt69(boolean value) {
        this.estaArt69 = value;
    }

    /**
     * Obtiene el valor de la propiedad oArt69B.
     * 
     * @return
     *     possible object is
     *     {@link Art69B }
     *     
     */
    public Art69B getOArt69B() {
        return oArt69B;
    }

    /**
     * Define el valor de la propiedad oArt69B.
     * 
     * @param value
     *     allowed object is
     *     {@link Art69B }
     *     
     */
    public void setOArt69B(Art69B value) {
        this.oArt69B = value;
    }

    /**
     * Obtiene el valor de la propiedad estaArt69B.
     * 
     */
    public boolean isEstaArt69B() {
        return estaArt69B;
    }

    /**
     * Define el valor de la propiedad estaArt69B.
     * 
     */
    public void setEstaArt69B(boolean value) {
        this.estaArt69B = value;
    }

    /**
     * Obtiene el valor de la propiedad oArt69.
     * 
     * @return
     *     possible object is
     *     {@link Art69 }
     *     
     */
    public Art69 getOArt69() {
        return oArt69;
    }

    /**
     * Define el valor de la propiedad oArt69.
     * 
     * @param value
     *     allowed object is
     *     {@link Art69 }
     *     
     */
    public void setOArt69(Art69 value) {
        this.oArt69 = value;
    }

}
