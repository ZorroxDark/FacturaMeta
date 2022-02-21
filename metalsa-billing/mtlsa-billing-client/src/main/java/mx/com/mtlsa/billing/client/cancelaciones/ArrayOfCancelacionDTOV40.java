
package mx.com.mtlsa.billing.client.cancelaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCancelacionDTO_V40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCancelacionDTO_V40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelacionDTO_V40" type="{http://tempuri.org/}CancelacionDTO_V40" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCancelacionDTO_V40", propOrder = {
    "cancelacionDTOV40"
})
public class ArrayOfCancelacionDTOV40 {

    @XmlElement(name = "CancelacionDTO_V40", nillable = true)
    protected List<CancelacionDTOV40> cancelacionDTOV40;

    /**
     * Gets the value of the cancelacionDTOV40 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelacionDTOV40 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelacionDTOV40().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelacionDTOV40 }
     * 
     * 
     */
    public List<CancelacionDTOV40> getCancelacionDTOV40() {
        if (cancelacionDTOV40 == null) {
            cancelacionDTOV40 = new ArrayList<CancelacionDTOV40>();
        }
        return this.cancelacionDTOV40;
    }

}
