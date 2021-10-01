
package mx.com.mtlsa.billing.client.edixcfdisecure;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnValidacionCertificado.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EnValidacionCertificado"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ok"/&gt;
 *     &lt;enumeration value="NoExiste"/&gt;
 *     &lt;enumeration value="Cancelado"/&gt;
 *     &lt;enumeration value="Revocado"/&gt;
 *     &lt;enumeration value="NoVigente"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnValidacionCertificado")
@XmlEnum
public enum EnValidacionCertificado {

    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("NoExiste")
    NO_EXISTE("NoExiste"),
    @XmlEnumValue("Cancelado")
    CANCELADO("Cancelado"),
    @XmlEnumValue("Revocado")
    REVOCADO("Revocado"),
    @XmlEnumValue("NoVigente")
    NO_VIGENTE("NoVigente");
    private final String value;

    EnValidacionCertificado(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnValidacionCertificado fromValue(String v) {
        for (EnValidacionCertificado c: EnValidacionCertificado.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
