
package mx.com.mtlsa.billing.client.cancelaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfSolicitudCancelacionFirmadaDTO_V40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSolicitudCancelacionFirmadaDTO_V40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SolicitudCancelacionFirmadaDTO_V40" type="{http://tempuri.org/}SolicitudCancelacionFirmadaDTO_V40" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSolicitudCancelacionFirmadaDTO_V40", propOrder = {
    "solicitudCancelacionFirmadaDTOV40"
})
public class ArrayOfSolicitudCancelacionFirmadaDTOV40 {

    @XmlElement(name = "SolicitudCancelacionFirmadaDTO_V40", nillable = true)
    protected List<SolicitudCancelacionFirmadaDTOV40> solicitudCancelacionFirmadaDTOV40;

    /**
     * Gets the value of the solicitudCancelacionFirmadaDTOV40 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solicitudCancelacionFirmadaDTOV40 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolicitudCancelacionFirmadaDTOV40().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolicitudCancelacionFirmadaDTOV40 }
     * 
     * 
     */
    public List<SolicitudCancelacionFirmadaDTOV40> getSolicitudCancelacionFirmadaDTOV40() {
        if (solicitudCancelacionFirmadaDTOV40 == null) {
            solicitudCancelacionFirmadaDTOV40 = new ArrayList<SolicitudCancelacionFirmadaDTOV40>();
        }
        return this.solicitudCancelacionFirmadaDTOV40;
    }

}
