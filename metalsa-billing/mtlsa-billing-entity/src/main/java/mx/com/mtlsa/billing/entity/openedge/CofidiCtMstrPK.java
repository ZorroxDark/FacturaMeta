package mx.com.mtlsa.billing.entity.openedge;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "cofidi_ct_mstr" database table.
 * 
 */
@Embeddable
public class CofidiCtMstrPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ct_domain")
	private String ctDomain;

	@Column(name="ct_code")
	private String ctCode;

	public CofidiCtMstrPK() {
	}
	public String getCtDomain() {
		return this.ctDomain;
	}
	public void setCtDomain(String ctDomain) {
		this.ctDomain = ctDomain;
	}
	public String getCtCode() {
		return this.ctCode;
	}
	public void setCtCode(String ctCode) {
		this.ctCode = ctCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CofidiCtMstrPK)) {
			return false;
		}
		CofidiCtMstrPK castOther = (CofidiCtMstrPK)other;
		return 
			this.ctDomain.equals(castOther.ctDomain)
			&& this.ctCode.equals(castOther.ctCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ctDomain.hashCode();
		hash = hash * prime + this.ctCode.hashCode();
		
		return hash;
	}
}