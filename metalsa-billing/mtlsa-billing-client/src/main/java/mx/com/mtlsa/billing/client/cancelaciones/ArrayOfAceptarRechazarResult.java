
package mx.com.mtlsa.billing.client.cancelaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfAceptarRechazarResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAceptarRechazarResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AceptarRechazarResult" type="{http://tempuri.org/}AceptarRechazarResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAceptarRechazarResult", propOrder = {
    "aceptarRechazarResult"
})
public class ArrayOfAceptarRechazarResult {

    @XmlElement(name = "AceptarRechazarResult", nillable = true)
    protected List<AceptarRechazarResult> aceptarRechazarResult;

    /**
     * Gets the value of the aceptarRechazarResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aceptarRechazarResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAceptarRechazarResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AceptarRechazarResult }
     * 
     * 
     */
    public List<AceptarRechazarResult> getAceptarRechazarResult() {
        if (aceptarRechazarResult == null) {
            aceptarRechazarResult = new ArrayList<AceptarRechazarResult>();
        }
        return this.aceptarRechazarResult;
    }

}
