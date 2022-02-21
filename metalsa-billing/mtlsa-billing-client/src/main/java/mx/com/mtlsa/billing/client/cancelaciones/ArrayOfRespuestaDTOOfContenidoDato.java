
package mx.com.mtlsa.billing.client.cancelaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfRespuestaDTOOfContenidoDato complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRespuestaDTOOfContenidoDato"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RespuestaDTOOfContenidoDato" type="{http://tempuri.org/}RespuestaDTOOfContenidoDato" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRespuestaDTOOfContenidoDato", propOrder = {
    "respuestaDTOOfContenidoDato"
})
public class ArrayOfRespuestaDTOOfContenidoDato {

    @XmlElement(name = "RespuestaDTOOfContenidoDato", nillable = true)
    protected List<RespuestaDTOOfContenidoDato> respuestaDTOOfContenidoDato;

    /**
     * Gets the value of the respuestaDTOOfContenidoDato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respuestaDTOOfContenidoDato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespuestaDTOOfContenidoDato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RespuestaDTOOfContenidoDato }
     * 
     * 
     */
    public List<RespuestaDTOOfContenidoDato> getRespuestaDTOOfContenidoDato() {
        if (respuestaDTOOfContenidoDato == null) {
            respuestaDTOOfContenidoDato = new ArrayList<RespuestaDTOOfContenidoDato>();
        }
        return this.respuestaDTOOfContenidoDato;
    }

}
