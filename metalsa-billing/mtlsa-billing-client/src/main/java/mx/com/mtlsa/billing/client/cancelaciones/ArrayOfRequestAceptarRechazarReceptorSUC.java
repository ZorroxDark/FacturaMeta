
package mx.com.mtlsa.billing.client.cancelaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfRequestAceptarRechazarReceptorSUC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRequestAceptarRechazarReceptorSUC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestAceptarRechazarReceptorSUC" type="{http://tempuri.org/}RequestAceptarRechazarReceptorSUC" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRequestAceptarRechazarReceptorSUC", propOrder = {
    "requestAceptarRechazarReceptorSUC"
})
public class ArrayOfRequestAceptarRechazarReceptorSUC {

    @XmlElement(name = "RequestAceptarRechazarReceptorSUC", nillable = true)
    protected List<RequestAceptarRechazarReceptorSUC> requestAceptarRechazarReceptorSUC;

    /**
     * Gets the value of the requestAceptarRechazarReceptorSUC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestAceptarRechazarReceptorSUC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestAceptarRechazarReceptorSUC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestAceptarRechazarReceptorSUC }
     * 
     * 
     */
    public List<RequestAceptarRechazarReceptorSUC> getRequestAceptarRechazarReceptorSUC() {
        if (requestAceptarRechazarReceptorSUC == null) {
            requestAceptarRechazarReceptorSUC = new ArrayList<RequestAceptarRechazarReceptorSUC>();
        }
        return this.requestAceptarRechazarReceptorSUC;
    }

}
