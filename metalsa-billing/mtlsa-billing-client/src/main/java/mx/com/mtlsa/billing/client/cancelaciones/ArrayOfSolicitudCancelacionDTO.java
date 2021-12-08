
package mx.com.mtlsa.billing.client.cancelaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfSolicitudCancelacionDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSolicitudCancelacionDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SolicitudCancelacionDTO" type="{http://tempuri.org/}SolicitudCancelacionDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSolicitudCancelacionDTO", propOrder = {
    "solicitudCancelacionDTO"
})
public class ArrayOfSolicitudCancelacionDTO {

    @XmlElement(name = "SolicitudCancelacionDTO", nillable = true)
    protected List<SolicitudCancelacionDTO> solicitudCancelacionDTO;

    /**
     * Gets the value of the solicitudCancelacionDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solicitudCancelacionDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolicitudCancelacionDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolicitudCancelacionDTO }
     * 
     * 
     */
    public List<SolicitudCancelacionDTO> getSolicitudCancelacionDTO() {
        if (solicitudCancelacionDTO == null) {
            solicitudCancelacionDTO = new ArrayList<SolicitudCancelacionDTO>();
        }
        return this.solicitudCancelacionDTO;
    }

}
