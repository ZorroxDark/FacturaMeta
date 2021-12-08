
package mx.com.mtlsa.billing.client.cancelaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfRelacionados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRelacionados"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Relacionados" type="{http://tempuri.org/}Relacionados" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRelacionados", propOrder = {
    "relacionados"
})
public class ArrayOfRelacionados {

    @XmlElement(name = "Relacionados", nillable = true)
    protected List<Relacionados> relacionados;

    /**
     * Gets the value of the relacionados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relacionados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelacionados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Relacionados }
     * 
     * 
     */
    public List<Relacionados> getRelacionados() {
        if (relacionados == null) {
            relacionados = new ArrayList<Relacionados>();
        }
        return this.relacionados;
    }

}
