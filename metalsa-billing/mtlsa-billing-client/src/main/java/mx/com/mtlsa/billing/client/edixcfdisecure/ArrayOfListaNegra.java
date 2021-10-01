
package mx.com.mtlsa.billing.client.edixcfdisecure;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfListaNegra complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfListaNegra"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListaNegra" type="{http://edixcfdisecure.ekomercio.com/}ListaNegra" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfListaNegra", propOrder = {
    "listaNegra"
})
public class ArrayOfListaNegra {

    @XmlElement(name = "ListaNegra", nillable = true)
    protected List<ListaNegra> listaNegra;

    /**
     * Gets the value of the listaNegra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaNegra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaNegra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListaNegra }
     * 
     * 
     */
    public List<ListaNegra> getListaNegra() {
        if (listaNegra == null) {
            listaNegra = new ArrayList<ListaNegra>();
        }
        return this.listaNegra;
    }

}
