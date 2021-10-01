
package mx.com.mtlsa.billing.client.edixcfdisecure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Emision complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Emision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Acuse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Misc10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombre_Aduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fecha_Pedimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pedimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Efecto_Comprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Num_ContraRecibo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Num_OrdenCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="anoAprobacion1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigo_errorcadena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RFC_Receptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Addenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FacturaXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Es_Vigente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Monto_Impuestos" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Monto_Total" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Num_Aprobacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnoAprobacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Serie_Certificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Receptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntidadId_Receptor" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FacturaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FechaAcuse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Emision", propOrder = {
    "acuse",
    "misc10",
    "nombreAduana",
    "fechaPedimento",
    "pedimento",
    "efectoComprobante",
    "numContraRecibo",
    "numOrdenCompra",
    "anoAprobacion1",
    "codigoErrorcadena",
    "rfcReceptor",
    "estatus",
    "notas",
    "addenda",
    "facturaXML",
    "esVigente",
    "estado",
    "montoImpuestos",
    "montoTotal",
    "fecha",
    "numAprobacion",
    "anoAprobacion",
    "folio",
    "serieCertificado",
    "receptor",
    "entidadIdReceptor",
    "facturaId",
    "fechaAcuse",
    "uuid"
})
public class Emision {

    @XmlElement(name = "Acuse")
    protected String acuse;
    @XmlElement(name = "Misc10")
    protected String misc10;
    @XmlElement(name = "Nombre_Aduana")
    protected String nombreAduana;
    @XmlElement(name = "Fecha_Pedimento")
    protected String fechaPedimento;
    @XmlElement(name = "Pedimento")
    protected String pedimento;
    @XmlElement(name = "Efecto_Comprobante")
    protected String efectoComprobante;
    @XmlElement(name = "Num_ContraRecibo")
    protected String numContraRecibo;
    @XmlElement(name = "Num_OrdenCompra")
    protected String numOrdenCompra;
    protected String anoAprobacion1;
    @XmlElement(name = "codigo_errorcadena")
    protected String codigoErrorcadena;
    @XmlElement(name = "RFC_Receptor")
    protected String rfcReceptor;
    @XmlElement(name = "Estatus")
    protected String estatus;
    @XmlElement(name = "Notas")
    protected String notas;
    @XmlElement(name = "Addenda")
    protected String addenda;
    @XmlElement(name = "FacturaXML")
    protected String facturaXML;
    @XmlElement(name = "Es_Vigente")
    protected int esVigente;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "Monto_Impuestos")
    protected double montoImpuestos;
    @XmlElement(name = "Monto_Total")
    protected double montoTotal;
    @XmlElement(name = "Fecha")
    protected String fecha;
    @XmlElement(name = "Num_Aprobacion")
    protected String numAprobacion;
    @XmlElement(name = "AnoAprobacion")
    protected String anoAprobacion;
    @XmlElement(name = "Folio")
    protected String folio;
    @XmlElement(name = "Serie_Certificado")
    protected String serieCertificado;
    @XmlElement(name = "Receptor")
    protected String receptor;
    @XmlElement(name = "EntidadId_Receptor")
    protected long entidadIdReceptor;
    @XmlElement(name = "FacturaId")
    protected long facturaId;
    @XmlElement(name = "FechaAcuse")
    protected String fechaAcuse;
    @XmlElement(name = "UUID")
    protected String uuid;

    /**
     * Obtiene el valor de la propiedad acuse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcuse() {
        return acuse;
    }

    /**
     * Define el valor de la propiedad acuse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcuse(String value) {
        this.acuse = value;
    }

    /**
     * Obtiene el valor de la propiedad misc10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMisc10() {
        return misc10;
    }

    /**
     * Define el valor de la propiedad misc10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMisc10(String value) {
        this.misc10 = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAduana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAduana() {
        return nombreAduana;
    }

    /**
     * Define el valor de la propiedad nombreAduana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAduana(String value) {
        this.nombreAduana = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPedimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPedimento() {
        return fechaPedimento;
    }

    /**
     * Define el valor de la propiedad fechaPedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPedimento(String value) {
        this.fechaPedimento = value;
    }

    /**
     * Obtiene el valor de la propiedad pedimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPedimento() {
        return pedimento;
    }

    /**
     * Define el valor de la propiedad pedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPedimento(String value) {
        this.pedimento = value;
    }

    /**
     * Obtiene el valor de la propiedad efectoComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfectoComprobante() {
        return efectoComprobante;
    }

    /**
     * Define el valor de la propiedad efectoComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfectoComprobante(String value) {
        this.efectoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad numContraRecibo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumContraRecibo() {
        return numContraRecibo;
    }

    /**
     * Define el valor de la propiedad numContraRecibo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumContraRecibo(String value) {
        this.numContraRecibo = value;
    }

    /**
     * Obtiene el valor de la propiedad numOrdenCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOrdenCompra() {
        return numOrdenCompra;
    }

    /**
     * Define el valor de la propiedad numOrdenCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOrdenCompra(String value) {
        this.numOrdenCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad anoAprobacion1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoAprobacion1() {
        return anoAprobacion1;
    }

    /**
     * Define el valor de la propiedad anoAprobacion1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoAprobacion1(String value) {
        this.anoAprobacion1 = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoErrorcadena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoErrorcadena() {
        return codigoErrorcadena;
    }

    /**
     * Define el valor de la propiedad codigoErrorcadena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoErrorcadena(String value) {
        this.codigoErrorcadena = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCReceptor() {
        return rfcReceptor;
    }

    /**
     * Define el valor de la propiedad rfcReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCReceptor(String value) {
        this.rfcReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad estatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * Define el valor de la propiedad estatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatus(String value) {
        this.estatus = value;
    }

    /**
     * Obtiene el valor de la propiedad notas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotas() {
        return notas;
    }

    /**
     * Define el valor de la propiedad notas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotas(String value) {
        this.notas = value;
    }

    /**
     * Obtiene el valor de la propiedad addenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddenda() {
        return addenda;
    }

    /**
     * Define el valor de la propiedad addenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddenda(String value) {
        this.addenda = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturaXML() {
        return facturaXML;
    }

    /**
     * Define el valor de la propiedad facturaXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturaXML(String value) {
        this.facturaXML = value;
    }

    /**
     * Obtiene el valor de la propiedad esVigente.
     * 
     */
    public int getEsVigente() {
        return esVigente;
    }

    /**
     * Define el valor de la propiedad esVigente.
     * 
     */
    public void setEsVigente(int value) {
        this.esVigente = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad montoImpuestos.
     * 
     */
    public double getMontoImpuestos() {
        return montoImpuestos;
    }

    /**
     * Define el valor de la propiedad montoImpuestos.
     * 
     */
    public void setMontoImpuestos(double value) {
        this.montoImpuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotal.
     * 
     */
    public double getMontoTotal() {
        return montoTotal;
    }

    /**
     * Define el valor de la propiedad montoTotal.
     * 
     */
    public void setMontoTotal(double value) {
        this.montoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad numAprobacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAprobacion() {
        return numAprobacion;
    }

    /**
     * Define el valor de la propiedad numAprobacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAprobacion(String value) {
        this.numAprobacion = value;
    }

    /**
     * Obtiene el valor de la propiedad anoAprobacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoAprobacion() {
        return anoAprobacion;
    }

    /**
     * Define el valor de la propiedad anoAprobacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoAprobacion(String value) {
        this.anoAprobacion = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad serieCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieCertificado() {
        return serieCertificado;
    }

    /**
     * Define el valor de la propiedad serieCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieCertificado(String value) {
        this.serieCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceptor(String value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadIdReceptor.
     * 
     */
    public long getEntidadIdReceptor() {
        return entidadIdReceptor;
    }

    /**
     * Define el valor de la propiedad entidadIdReceptor.
     * 
     */
    public void setEntidadIdReceptor(long value) {
        this.entidadIdReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaId.
     * 
     */
    public long getFacturaId() {
        return facturaId;
    }

    /**
     * Define el valor de la propiedad facturaId.
     * 
     */
    public void setFacturaId(long value) {
        this.facturaId = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAcuse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAcuse() {
        return fechaAcuse;
    }

    /**
     * Define el valor de la propiedad fechaAcuse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAcuse(String value) {
        this.fechaAcuse = value;
    }

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

}
