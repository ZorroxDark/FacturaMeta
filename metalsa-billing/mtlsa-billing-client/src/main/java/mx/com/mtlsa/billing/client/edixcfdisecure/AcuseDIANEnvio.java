
package mx.com.mtlsa.billing.client.edixcfdisecure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="oBuscaAcuseDIAN" type="{http://edixcfdisecure.ekomercio.com/}ArrayOfClsListaConsultaAcuses_DIAN" minOccurs="0"/&gt;
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
    "oBuscaAcuseDIAN"
})
@XmlRootElement(name = "acuseDIAN_Envio")
public class AcuseDIANEnvio {

    protected ArrayOfClsListaConsultaAcusesDIAN oBuscaAcuseDIAN;

    /**
     * Obtiene el valor de la propiedad oBuscaAcuseDIAN.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsListaConsultaAcusesDIAN }
     *     
     */
    public ArrayOfClsListaConsultaAcusesDIAN getOBuscaAcuseDIAN() {
        return oBuscaAcuseDIAN;
    }

    /**
     * Define el valor de la propiedad oBuscaAcuseDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsListaConsultaAcusesDIAN }
     *     
     */
    public void setOBuscaAcuseDIAN(ArrayOfClsListaConsultaAcusesDIAN value) {
        this.oBuscaAcuseDIAN = value;
    }

}
