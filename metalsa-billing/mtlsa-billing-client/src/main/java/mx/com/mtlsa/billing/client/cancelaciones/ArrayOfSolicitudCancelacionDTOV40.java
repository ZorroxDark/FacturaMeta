
package mx.com.mtlsa.billing.client.cancelaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfSolicitudCancelacionDTO_V40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSolicitudCancelacionDTO_V40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SolicitudCancelacionDTO_V40" type="{http://tempuri.org/}SolicitudCancelacionDTO_V40" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSolicitudCancelacionDTO_V40", propOrder = {
    "solicitudCancelacionDTOV40"
})
public class ArrayOfSolicitudCancelacionDTOV40 {

    @XmlElement(name = "SolicitudCancelacionDTO_V40", nillable = true)
    protected List<SolicitudCancelacionDTOV40> solicitudCancelacionDTOV40;

    /**
     * Gets the value of the solicitudCancelacionDTOV40 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solicitudCancelacionDTOV40 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolicitudCancelacionDTOV40().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolicitudCancelacionDTOV40 }
     * 
     * 
     */
    public List<SolicitudCancelacionDTOV40> getSolicitudCancelacionDTOV40() {
        if (solicitudCancelacionDTOV40 == null) {
            solicitudCancelacionDTOV40 = new ArrayList<SolicitudCancelacionDTOV40>();
        }
        return this.solicitudCancelacionDTOV40;
    }

}
