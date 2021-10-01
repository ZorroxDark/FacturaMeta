
package mx.com.mtlsa.billing.client.edixcfdisecure;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlMixed;
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
 *         &lt;element name="procesarTextoPlanoToXMLResult" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "procesarTextoPlanoToXMLResult"
})
@XmlRootElement(name = "procesarTextoPlanoToXMLResponse")
public class ProcesarTextoPlanoToXMLResponse {

    protected ProcesarTextoPlanoToXMLResponse.ProcesarTextoPlanoToXMLResult procesarTextoPlanoToXMLResult;

    /**
     * Obtiene el valor de la propiedad procesarTextoPlanoToXMLResult.
     * 
     * @return
     *     possible object is
     *     {@link ProcesarTextoPlanoToXMLResponse.ProcesarTextoPlanoToXMLResult }
     *     
     */
    public ProcesarTextoPlanoToXMLResponse.ProcesarTextoPlanoToXMLResult getProcesarTextoPlanoToXMLResult() {
        return procesarTextoPlanoToXMLResult;
    }

    /**
     * Define el valor de la propiedad procesarTextoPlanoToXMLResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcesarTextoPlanoToXMLResponse.ProcesarTextoPlanoToXMLResult }
     *     
     */
    public void setProcesarTextoPlanoToXMLResult(ProcesarTextoPlanoToXMLResponse.ProcesarTextoPlanoToXMLResult value) {
        this.procesarTextoPlanoToXMLResult = value;
    }


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
     *         &lt;any/&gt;
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
        "content"
    })
    public static class ProcesarTextoPlanoToXMLResult {

        @XmlMixed
        @XmlAnyElement(lax = true)
        protected List<Object> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link String }
         * 
         * 
         */
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<Object>();
            }
            return this.content;
        }

    }

}
