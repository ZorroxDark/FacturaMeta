
package mx.com.mtlsa.billing.client.cancelaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfValidarUUIDS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfValidarUUIDS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidarUUIDS" type="{http://tempuri.org/}ValidarUUIDS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfValidarUUIDS", propOrder = {
    "validarUUIDS"
})
public class ArrayOfValidarUUIDS {

    @XmlElement(name = "ValidarUUIDS", nillable = true)
    protected List<ValidarUUIDS> validarUUIDS;

    /**
     * Gets the value of the validarUUIDS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validarUUIDS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidarUUIDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidarUUIDS }
     * 
     * 
     */
    public List<ValidarUUIDS> getValidarUUIDS() {
        if (validarUUIDS == null) {
            validarUUIDS = new ArrayList<ValidarUUIDS>();
        }
        return this.validarUUIDS;
    }

}
