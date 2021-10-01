package mx.com.mtlsa.billing.entity.openedge;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "cofidi_ar_mstr" database table.
 * 
 */
@Embeddable
public class CofidiArMstrPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ar_domain")
	private String arDomain;

	@Column(name="ar_nbr")
	private String arNbr;

	public CofidiArMstrPK() {
	}
	public String getArDomain() {
		return this.arDomain;
	}
	public void setArDomain(String arDomain) {
		this.arDomain = arDomain;
	}
	public String getArNbr() {
		return this.arNbr;
	}
	public void setArNbr(String arNbr) {
		this.arNbr = arNbr;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CofidiArMstrPK)) {
			return false;
		}
		CofidiArMstrPK castOther = (CofidiArMstrPK)other;
		return 
			this.arDomain.equals(castOther.arDomain)
			&& this.arNbr.equals(castOther.arNbr);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.arDomain.hashCode();
		hash = hash * prime + this.arNbr.hashCode();
		
		return hash;
	}
}