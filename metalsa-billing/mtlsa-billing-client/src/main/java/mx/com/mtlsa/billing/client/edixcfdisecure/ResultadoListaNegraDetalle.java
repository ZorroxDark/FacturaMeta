
package mx.com.mtlsa.billing.client.edixcfdisecure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResultadoListaNegraDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResultadoListaNegraDetalle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oListaNegra" type="{http://edixcfdisecure.ekomercio.com/}ArrayOfListaNegraDetalle" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoListaNegraDetalle", propOrder = {
    "codigo",
    "mensaje",
    "oListaNegra"
})
public class ResultadoListaNegraDetalle {

    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "Mensaje")
    protected String mensaje;
    protected ArrayOfListaNegraDetalle oListaNegra;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad oListaNegra.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfListaNegraDetalle }
     *     
     */
    public ArrayOfListaNegraDetalle getOListaNegra() {
        return oListaNegra;
    }

    /**
     * Define el valor de la propiedad oListaNegra.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfListaNegraDetalle }
     *     
     */
    public void setOListaNegra(ArrayOfListaNegraDetalle value) {
        this.oListaNegra = value;
    }

}
