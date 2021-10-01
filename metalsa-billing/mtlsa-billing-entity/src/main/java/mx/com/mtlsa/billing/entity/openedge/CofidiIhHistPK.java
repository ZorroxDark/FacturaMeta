package mx.com.mtlsa.billing.entity.openedge;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "cofidi_ih_hist" database table.
 * 
 */
@Embeddable
public class CofidiIhHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ih_domain")
	private String ihDomain;

	@Column(name="ih_inv_nbr")
	private String ihInvNbr;

	@Column(name="ih_nbr")
	private String ihNbr;

	public CofidiIhHistPK() {
	}
	public String getIhDomain() {
		return this.ihDomain;
	}
	public void setIhDomain(String ihDomain) {
		this.ihDomain = ihDomain;
	}
	public String getIhInvNbr() {
		return this.ihInvNbr;
	}
	public void setIhInvNbr(String ihInvNbr) {
		this.ihInvNbr = ihInvNbr;
	}
	public String getIhNbr() {
		return this.ihNbr;
	}
	public void setIhNbr(String ihNbr) {
		this.ihNbr = ihNbr;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CofidiIhHistPK)) {
			return false;
		}
		CofidiIhHistPK castOther = (CofidiIhHistPK)other;
		return 
			this.ihDomain.equals(castOther.ihDomain)
			&& this.ihInvNbr.equals(castOther.ihInvNbr)
			&& this.ihNbr.equals(castOther.ihNbr);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ihDomain.hashCode();
		hash = hash * prime + this.ihInvNbr.hashCode();
		hash = hash * prime + this.ihNbr.hashCode();
		
		return hash;
	}
}