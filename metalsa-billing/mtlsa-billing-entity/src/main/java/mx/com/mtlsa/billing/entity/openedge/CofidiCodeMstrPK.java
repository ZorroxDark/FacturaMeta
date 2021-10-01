package mx.com.mtlsa.billing.entity.openedge;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "cofidi_code_mstr" database table.
 * 
 */
@Embeddable
public class CofidiCodeMstrPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="code_domain")
	private String codeDomain;

	@Column(name="code_fldname")
	private String codeFldname;

	@Column(name="code_value")
	private String codeValue;

	public CofidiCodeMstrPK() {
	}
	public String getCodeDomain() {
		return this.codeDomain;
	}
	public void setCodeDomain(String codeDomain) {
		this.codeDomain = codeDomain;
	}
	public String getCodeFldname() {
		return this.codeFldname;
	}
	public void setCodeFldname(String codeFldname) {
		this.codeFldname = codeFldname;
	}
	public String getCodeValue() {
		return this.codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CofidiCodeMstrPK)) {
			return false;
		}
		CofidiCodeMstrPK castOther = (CofidiCodeMstrPK)other;
		return 
			this.codeDomain.equals(castOther.codeDomain)
			&& this.codeFldname.equals(castOther.codeFldname)
			&& this.codeValue.equals(castOther.codeValue);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codeDomain.hashCode();
		hash = hash * prime + this.codeFldname.hashCode();
		hash = hash * prime + this.codeValue.hashCode();
		
		return hash;
	}
}