package mx.com.mtlsa.billing.entity.openedge;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "cofidi_tx2d_det" database table.
 * 
 */
@Embeddable
public class CofidiTx2dDetPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="tx2d_domain")
	private String tx2dDomain;

	@Column(name="tx2d_ref")
	private String tx2dRef;

	@Column(name="tx2d_nbr")
	private String tx2dNbr;

	@Column(name="tx2d_line")
	private int tx2dLine;

	@Column(name="tx2d_trl")
	private String tx2dTrl;

	@Column(name="tx2d_tr_type")
	private String tx2dTrType;

	@Column(name="tx2d_tax_code")
	private String tx2dTaxCode;

	public CofidiTx2dDetPK() {
	}
	public String getTx2dDomain() {
		return this.tx2dDomain;
	}
	public void setTx2dDomain(String tx2dDomain) {
		this.tx2dDomain = tx2dDomain;
	}
	public String getTx2dRef() {
		return this.tx2dRef;
	}
	public void setTx2dRef(String tx2dRef) {
		this.tx2dRef = tx2dRef;
	}
	public String getTx2dNbr() {
		return this.tx2dNbr;
	}
	public void setTx2dNbr(String tx2dNbr) {
		this.tx2dNbr = tx2dNbr;
	}
	public int getTx2dLine() {
		return this.tx2dLine;
	}
	public void setTx2dLine(int tx2dLine) {
		this.tx2dLine = tx2dLine;
	}
	public String getTx2dTrl() {
		return this.tx2dTrl;
	}
	public void setTx2dTrl(String tx2dTrl) {
		this.tx2dTrl = tx2dTrl;
	}
	public String getTx2dTrType() {
		return this.tx2dTrType;
	}
	public void setTx2dTrType(String tx2dTrType) {
		this.tx2dTrType = tx2dTrType;
	}
	public String getTx2dTaxCode() {
		return this.tx2dTaxCode;
	}
	public void setTx2dTaxCode(String tx2dTaxCode) {
		this.tx2dTaxCode = tx2dTaxCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CofidiTx2dDetPK)) {
			return false;
		}
		CofidiTx2dDetPK castOther = (CofidiTx2dDetPK)other;
		return 
			this.tx2dDomain.equals(castOther.tx2dDomain)
			&& this.tx2dRef.equals(castOther.tx2dRef)
			&& this.tx2dNbr.equals(castOther.tx2dNbr)
			&& (this.tx2dLine == castOther.tx2dLine)
			&& this.tx2dTrl.equals(castOther.tx2dTrl)
			&& this.tx2dTrType.equals(castOther.tx2dTrType)
			&& this.tx2dTaxCode.equals(castOther.tx2dTaxCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tx2dDomain.hashCode();
		hash = hash * prime + this.tx2dRef.hashCode();
		hash = hash * prime + this.tx2dNbr.hashCode();
		hash = hash * prime + this.tx2dLine;
		hash = hash * prime + this.tx2dTrl.hashCode();
		hash = hash * prime + this.tx2dTrType.hashCode();
		hash = hash * prime + this.tx2dTaxCode.hashCode();
		
		return hash;
	}
}