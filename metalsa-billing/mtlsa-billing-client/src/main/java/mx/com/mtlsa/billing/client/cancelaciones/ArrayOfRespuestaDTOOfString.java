
package mx.com.mtlsa.billing.client.cancelaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfRespuestaDTOOfString complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRespuestaDTOOfString"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RespuestaDTOOfString" type="{http://tempuri.org/}RespuestaDTOOfString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRespuestaDTOOfString", propOrder = {
    "respuestaDTOOfString"
})
public class ArrayOfRespuestaDTOOfString {

    @XmlElement(name = "RespuestaDTOOfString", nillable = true)
    protected List<RespuestaDTOOfString> respuestaDTOOfString;

    /**
     * Gets the value of the respuestaDTOOfString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respuestaDTOOfString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespuestaDTOOfString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RespuestaDTOOfString }
     * 
     * 
     */
    public List<RespuestaDTOOfString> getRespuestaDTOOfString() {
        if (respuestaDTOOfString == null) {
            respuestaDTOOfString = new ArrayList<RespuestaDTOOfString>();
        }
        return this.respuestaDTOOfString;
    }

}
