
package mx.com.mtlsa.billing.client.edixcfdisecure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Art69B complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Art69B"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NombreContribuyente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SituacionContribuyente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaPublicacionDOF_Definitivos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaPublicacionDOF_Desvirtuados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaPublicacionDOF_Favorables" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaPublicacionDOF_Presuntos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaPublicacionSAT_Definitivos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaPublicacionSAT_Desvirtuados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaPublicacionSAT_Favorables" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaPublicacionSAT_Presuntos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Num_FechaOficioGlobal_Definitivos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Num_FechaOficioGlobal_Desvirtuados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Num_FechaOficioGlobal_Favorables" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Num_FechaOficioGlobal_Favorables02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Num_FechaOficioGlobal_Presencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Num_FechaOficioGlobal_Presincion02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Art69B", propOrder = {
    "nombreContribuyente",
    "situacionContribuyente",
    "fechaPublicacionDOFDefinitivos",
    "fechaPublicacionDOFDesvirtuados",
    "fechaPublicacionDOFFavorables",
    "fechaPublicacionDOFPresuntos",
    "fechaPublicacionSATDefinitivos",
    "fechaPublicacionSATDesvirtuados",
    "fechaPublicacionSATFavorables",
    "fechaPublicacionSATPresuntos",
    "numFechaOficioGlobalDefinitivos",
    "numFechaOficioGlobalDesvirtuados",
    "numFechaOficioGlobalFavorables",
    "numFechaOficioGlobalFavorables02",
    "numFechaOficioGlobalPresencion",
    "numFechaOficioGlobalPresincion02"
})
public class Art69B {

    @XmlElement(name = "NombreContribuyente")
    protected String nombreContribuyente;
    @XmlElement(name = "SituacionContribuyente")
    protected String situacionContribuyente;
    @XmlElement(name = "FechaPublicacionDOF_Definitivos")
    protected String fechaPublicacionDOFDefinitivos;
    @XmlElement(name = "FechaPublicacionDOF_Desvirtuados")
    protected String fechaPublicacionDOFDesvirtuados;
    @XmlElement(name = "FechaPublicacionDOF_Favorables")
    protected String fechaPublicacionDOFFavorables;
    @XmlElement(name = "FechaPublicacionDOF_Presuntos")
    protected String fechaPublicacionDOFPresuntos;
    @XmlElement(name = "FechaPublicacionSAT_Definitivos")
    protected String fechaPublicacionSATDefinitivos;
    @XmlElement(name = "FechaPublicacionSAT_Desvirtuados")
    protected String fechaPublicacionSATDesvirtuados;
    @XmlElement(name = "FechaPublicacionSAT_Favorables")
    protected String fechaPublicacionSATFavorables;
    @XmlElement(name = "FechaPublicacionSAT_Presuntos")
    protected String fechaPublicacionSATPresuntos;
    @XmlElement(name = "Num_FechaOficioGlobal_Definitivos")
    protected String numFechaOficioGlobalDefinitivos;
    @XmlElement(name = "Num_FechaOficioGlobal_Desvirtuados")
    protected String numFechaOficioGlobalDesvirtuados;
    @XmlElement(name = "Num_FechaOficioGlobal_Favorables")
    protected String numFechaOficioGlobalFavorables;
    @XmlElement(name = "Num_FechaOficioGlobal_Favorables02")
    protected String numFechaOficioGlobalFavorables02;
    @XmlElement(name = "Num_FechaOficioGlobal_Presencion")
    protected String numFechaOficioGlobalPresencion;
    @XmlElement(name = "Num_FechaOficioGlobal_Presincion02")
    protected String numFechaOficioGlobalPresincion02;

    /**
     * Obtiene el valor de la propiedad nombreContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreContribuyente() {
        return nombreContribuyente;
    }

    /**
     * Define el valor de la propiedad nombreContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreContribuyente(String value) {
        this.nombreContribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad situacionContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacionContribuyente() {
        return situacionContribuyente;
    }

    /**
     * Define el valor de la propiedad situacionContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacionContribuyente(String value) {
        this.situacionContribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicacionDOFDefinitivos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPublicacionDOFDefinitivos() {
        return fechaPublicacionDOFDefinitivos;
    }

    /**
     * Define el valor de la propiedad fechaPublicacionDOFDefinitivos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPublicacionDOFDefinitivos(String value) {
        this.fechaPublicacionDOFDefinitivos = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicacionDOFDesvirtuados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPublicacionDOFDesvirtuados() {
        return fechaPublicacionDOFDesvirtuados;
    }

    /**
     * Define el valor de la propiedad fechaPublicacionDOFDesvirtuados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPublicacionDOFDesvirtuados(String value) {
        this.fechaPublicacionDOFDesvirtuados = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicacionDOFFavorables.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPublicacionDOFFavorables() {
        return fechaPublicacionDOFFavorables;
    }

    /**
     * Define el valor de la propiedad fechaPublicacionDOFFavorables.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPublicacionDOFFavorables(String value) {
        this.fechaPublicacionDOFFavorables = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicacionDOFPresuntos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPublicacionDOFPresuntos() {
        return fechaPublicacionDOFPresuntos;
    }

    /**
     * Define el valor de la propiedad fechaPublicacionDOFPresuntos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPublicacionDOFPresuntos(String value) {
        this.fechaPublicacionDOFPresuntos = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicacionSATDefinitivos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPublicacionSATDefinitivos() {
        return fechaPublicacionSATDefinitivos;
    }

    /**
     * Define el valor de la propiedad fechaPublicacionSATDefinitivos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPublicacionSATDefinitivos(String value) {
        this.fechaPublicacionSATDefinitivos = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicacionSATDesvirtuados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPublicacionSATDesvirtuados() {
        return fechaPublicacionSATDesvirtuados;
    }

    /**
     * Define el valor de la propiedad fechaPublicacionSATDesvirtuados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPublicacionSATDesvirtuados(String value) {
        this.fechaPublicacionSATDesvirtuados = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicacionSATFavorables.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPublicacionSATFavorables() {
        return fechaPublicacionSATFavorables;
    }

    /**
     * Define el valor de la propiedad fechaPublicacionSATFavorables.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPublicacionSATFavorables(String value) {
        this.fechaPublicacionSATFavorables = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicacionSATPresuntos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPublicacionSATPresuntos() {
        return fechaPublicacionSATPresuntos;
    }

    /**
     * Define el valor de la propiedad fechaPublicacionSATPresuntos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPublicacionSATPresuntos(String value) {
        this.fechaPublicacionSATPresuntos = value;
    }

    /**
     * Obtiene el valor de la propiedad numFechaOficioGlobalDefinitivos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFechaOficioGlobalDefinitivos() {
        return numFechaOficioGlobalDefinitivos;
    }

    /**
     * Define el valor de la propiedad numFechaOficioGlobalDefinitivos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFechaOficioGlobalDefinitivos(String value) {
        this.numFechaOficioGlobalDefinitivos = value;
    }

    /**
     * Obtiene el valor de la propiedad numFechaOficioGlobalDesvirtuados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFechaOficioGlobalDesvirtuados() {
        return numFechaOficioGlobalDesvirtuados;
    }

    /**
     * Define el valor de la propiedad numFechaOficioGlobalDesvirtuados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFechaOficioGlobalDesvirtuados(String value) {
        this.numFechaOficioGlobalDesvirtuados = value;
    }

    /**
     * Obtiene el valor de la propiedad numFechaOficioGlobalFavorables.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFechaOficioGlobalFavorables() {
        return numFechaOficioGlobalFavorables;
    }

    /**
     * Define el valor de la propiedad numFechaOficioGlobalFavorables.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFechaOficioGlobalFavorables(String value) {
        this.numFechaOficioGlobalFavorables = value;
    }

    /**
     * Obtiene el valor de la propiedad numFechaOficioGlobalFavorables02.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFechaOficioGlobalFavorables02() {
        return numFechaOficioGlobalFavorables02;
    }

    /**
     * Define el valor de la propiedad numFechaOficioGlobalFavorables02.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFechaOficioGlobalFavorables02(String value) {
        this.numFechaOficioGlobalFavorables02 = value;
    }

    /**
     * Obtiene el valor de la propiedad numFechaOficioGlobalPresencion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFechaOficioGlobalPresencion() {
        return numFechaOficioGlobalPresencion;
    }

    /**
     * Define el valor de la propiedad numFechaOficioGlobalPresencion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFechaOficioGlobalPresencion(String value) {
        this.numFechaOficioGlobalPresencion = value;
    }

    /**
     * Obtiene el valor de la propiedad numFechaOficioGlobalPresincion02.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFechaOficioGlobalPresincion02() {
        return numFechaOficioGlobalPresincion02;
    }

    /**
     * Define el valor de la propiedad numFechaOficioGlobalPresincion02.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFechaOficioGlobalPresincion02(String value) {
        this.numFechaOficioGlobalPresincion02 = value;
    }

}
