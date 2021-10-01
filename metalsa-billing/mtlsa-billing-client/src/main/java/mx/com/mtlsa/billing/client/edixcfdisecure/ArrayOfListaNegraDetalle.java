
package mx.com.mtlsa.billing.client.edixcfdisecure;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfListaNegraDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfListaNegraDetalle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListaNegraDetalle" type="{http://edixcfdisecure.ekomercio.com/}ListaNegraDetalle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfListaNegraDetalle", propOrder = {
    "listaNegraDetalle"
})
public class ArrayOfListaNegraDetalle {

    @XmlElement(name = "ListaNegraDetalle", nillable = true)
    protected List<ListaNegraDetalle> listaNegraDetalle;

    /**
     * Gets the value of the listaNegraDetalle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaNegraDetalle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaNegraDetalle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListaNegraDetalle }
     * 
     * 
     */
    public List<ListaNegraDetalle> getListaNegraDetalle() {
        if (listaNegraDetalle == null) {
            listaNegraDetalle = new ArrayList<ListaNegraDetalle>();
        }
        return this.listaNegraDetalle;
    }

}
