
package mx.com.mtlsa.billing.client.cancelaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfRespuestaDTOOfCancelacionDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRespuestaDTOOfCancelacionDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RespuestaDTOOfCancelacionDTO" type="{http://tempuri.org/}RespuestaDTOOfCancelacionDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRespuestaDTOOfCancelacionDTO", propOrder = {
    "respuestaDTOOfCancelacionDTO"
})
public class ArrayOfRespuestaDTOOfCancelacionDTO {

    @XmlElement(name = "RespuestaDTOOfCancelacionDTO", nillable = true)
    protected List<RespuestaDTOOfCancelacionDTO> respuestaDTOOfCancelacionDTO;

    /**
     * Gets the value of the respuestaDTOOfCancelacionDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respuestaDTOOfCancelacionDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespuestaDTOOfCancelacionDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RespuestaDTOOfCancelacionDTO }
     * 
     * 
     */
    public List<RespuestaDTOOfCancelacionDTO> getRespuestaDTOOfCancelacionDTO() {
        if (respuestaDTOOfCancelacionDTO == null) {
            respuestaDTOOfCancelacionDTO = new ArrayList<RespuestaDTOOfCancelacionDTO>();
        }
        return this.respuestaDTOOfCancelacionDTO;
    }

}
