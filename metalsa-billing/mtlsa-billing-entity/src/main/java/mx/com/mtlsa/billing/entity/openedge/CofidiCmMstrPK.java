package mx.com.mtlsa.billing.entity.openedge;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "cofidi_cm_mstr" database table.
 * 
 */
@Embeddable
public class CofidiCmMstrPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="cm_domain")
	private String cmDomain;

	@Column(name="cm_addr")
	private String cmAddr;

	public CofidiCmMstrPK() {
	}
	public String getCmDomain() {
		return this.cmDomain;
	}
	public void setCmDomain(String cmDomain) {
		this.cmDomain = cmDomain;
	}
	public String getCmAddr() {
		return this.cmAddr;
	}
	public void setCmAddr(String cmAddr) {
		this.cmAddr = cmAddr;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CofidiCmMstrPK)) {
			return false;
		}
		CofidiCmMstrPK castOther = (CofidiCmMstrPK)other;
		return 
			this.cmDomain.equals(castOther.cmDomain)
			&& this.cmAddr.equals(castOther.cmAddr);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cmDomain.hashCode();
		hash = hash * prime + this.cmAddr.hashCode();
		
		return hash;
	}
}