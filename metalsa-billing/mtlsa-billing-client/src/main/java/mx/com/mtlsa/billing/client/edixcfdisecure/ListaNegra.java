
package mx.com.mtlsa.billing.client.edixcfdisecure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ListaNegra complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListaNegra"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstaArt69" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EstaArt69_B" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaNegra", propOrder = {
    "rfc",
    "estaArt69",
    "estaArt69B"
})
public class ListaNegra {

    @XmlElement(name = "RFC")
    protected String rfc;
    @XmlElement(name = "EstaArt69")
    protected boolean estaArt69;
    @XmlElement(name = "EstaArt69_B")
    protected boolean estaArt69B;

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

}
