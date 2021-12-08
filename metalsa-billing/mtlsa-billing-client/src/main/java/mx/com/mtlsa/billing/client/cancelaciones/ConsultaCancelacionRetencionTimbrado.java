
package mx.com.mtlsa.billing.client.cancelaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cRFCEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cFolioSeguimientoSAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "crfcEmisor",
    "cFolioSeguimientoSAT"
})
@XmlRootElement(name = "ConsultaCancelacionRetencionTimbrado")
public class ConsultaCancelacionRetencionTimbrado {

    @XmlElement(name = "cRFCEmisor")
    protected String crfcEmisor;
    protected String cFolioSeguimientoSAT;

    /**
     * Obtiene el valor de la propiedad crfcEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRFCEmisor() {
        return crfcEmisor;
    }

    /**
     * Define el valor de la propiedad crfcEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRFCEmisor(String value) {
        this.crfcEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad cFolioSeguimientoSAT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFolioSeguimientoSAT() {
        return cFolioSeguimientoSAT;
    }

    /**
     * Define el valor de la propiedad cFolioSeguimientoSAT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFolioSeguimientoSAT(String value) {
        this.cFolioSeguimientoSAT = value;
    }

}
