package mx.com.mtlsa.billing.entity.openedge;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "cofidi_abs_mstr" database table.
 * 
 */
@Embeddable
public class CofidiAbsMstrPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="abs_domain")
	private String absDomain;

	@Column(name="abs_shipfrom")
	private String absShipfrom;

	@Column(name="abs_id")
	private String absId;

	public CofidiAbsMstrPK() {
	}
	public String getAbsDomain() {
		return this.absDomain;
	}
	public void setAbsDomain(String absDomain) {
		this.absDomain = absDomain;
	}
	public String getAbsShipfrom() {
		return this.absShipfrom;
	}
	public void setAbsShipfrom(String absShipfrom) {
		this.absShipfrom = absShipfrom;
	}
	public String getAbsId() {
		return this.absId;
	}
	public void setAbsId(String absId) {
		this.absId = absId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CofidiAbsMstrPK)) {
			return false;
		}
		CofidiAbsMstrPK castOther = (CofidiAbsMstrPK)other;
		return 
			this.absDomain.equals(castOther.absDomain)
			&& this.absShipfrom.equals(castOther.absShipfrom)
			&& this.absId.equals(castOther.absId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.absDomain.hashCode();
		hash = hash * prime + this.absShipfrom.hashCode();
		hash = hash * prime + this.absId.hashCode();
		
		return hash;
	}
}