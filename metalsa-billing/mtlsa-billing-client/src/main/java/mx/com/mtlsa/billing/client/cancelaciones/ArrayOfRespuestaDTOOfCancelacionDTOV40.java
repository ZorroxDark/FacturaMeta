
package mx.com.mtlsa.billing.client.cancelaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfRespuestaDTOOfCancelacionDTO_V40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRespuestaDTOOfCancelacionDTO_V40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RespuestaDTOOfCancelacionDTO_V40" type="{http://tempuri.org/}RespuestaDTOOfCancelacionDTO_V40" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRespuestaDTOOfCancelacionDTO_V40", propOrder = {
    "respuestaDTOOfCancelacionDTOV40"
})
public class ArrayOfRespuestaDTOOfCancelacionDTOV40 {

    @XmlElement(name = "RespuestaDTOOfCancelacionDTO_V40", nillable = true)
    protected List<RespuestaDTOOfCancelacionDTOV40> respuestaDTOOfCancelacionDTOV40;

    /**
     * Gets the value of the respuestaDTOOfCancelacionDTOV40 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respuestaDTOOfCancelacionDTOV40 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespuestaDTOOfCancelacionDTOV40().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RespuestaDTOOfCancelacionDTOV40 }
     * 
     * 
     */
    public List<RespuestaDTOOfCancelacionDTOV40> getRespuestaDTOOfCancelacionDTOV40() {
        if (respuestaDTOOfCancelacionDTOV40 == null) {
            respuestaDTOOfCancelacionDTOV40 = new ArrayList<RespuestaDTOOfCancelacionDTOV40>();
        }
        return this.respuestaDTOOfCancelacionDTOV40;
    }

}
