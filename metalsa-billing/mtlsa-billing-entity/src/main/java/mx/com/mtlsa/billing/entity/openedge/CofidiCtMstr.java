package mx.com.mtlsa.billing.entity.openedge;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the "cofidi_ct_mstr" database table.
 * 
 */
@Entity
@Table(name="cofidi_ct_mstr")
@NamedQuery(name="CofidiCtMstr.findAll", query="SELECT c FROM CofidiCtMstr c")
public class CofidiCtMstr implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CofidiCtMstrPK id;

	@Column(name="ct__qadc01")
	private String ctQadc01;

	@Temporal(TemporalType.DATE)
	@Column(name="ct_base_date")
	private Date ctBaseDate;

	@Column(name="ct_base_days")
	private int ctBaseDays;

	@Column(name="ct_dating")
	private boolean ctDating;

	@Column(name="ct_desc")
	private String ctDesc;

	@Temporal(TemporalType.DATE)
	@Column(name="ct_disc_date")
	private Date ctDiscDate;

	@Column(name="ct_disc_days")
	private BigDecimal ctDiscDays;

	@Column(name="ct_disc_pct")
	private BigDecimal ctDiscPct;

	@Temporal(TemporalType.DATE)
	@Column(name="ct_due_date")
	private Date ctDueDate;

	@Column(name="ct_due_days")
	private BigDecimal ctDueDays;

	@Column(name="ct_due_inv")
	private int ctDueInv;

	@Column(name="ct_from_inv")
	private int ctFromInv;

	@Column(name="ct_grace_days")
	private int ctGraceDays;

	@Column(name="ct_late_int")
	private BigDecimal ctLateInt;

	@Column(name="ct_min_days")
	private int ctMinDays;

	@Temporal(TemporalType.DATE)
	@Column(name="ct_mod_date")
	private Date ctModDate;

	@Column(name="ct_mtd_disc")
	private boolean ctMtdDisc;

	@Column(name="ct_mtd_due")
	private boolean ctMtdDue;

	@Column(name="ct_terms_int")
	private BigDecimal ctTermsInt;

	@Column(name="ct_user1")
	private String ctUser1;

	@Column(name="ct_user2")
	private String ctUser2;

	@Column(name="ct_userid")
	private String ctUserid;

	@Column(name="ct_xdue_inv")
	private boolean ctXdueInv;

	@Column(name="ct_xfrom_inv")
	private boolean ctXfromInv;

	@Column(name="oid_cofidi_ct_mstr")
	private BigDecimal oidCofidiCtMstr;

	public CofidiCtMstr() {
	}

	public CofidiCtMstrPK getId() {
		return this.id;
	}

	public void setId(CofidiCtMstrPK id) {
		this.id = id;
	}

	public String getCtQadc01() {
		return this.ctQadc01;
	}

	public void setCtQadc01(String ctQadc01) {
		this.ctQadc01 = ctQadc01;
	}

	public Date getCtBaseDate() {
		return this.ctBaseDate;
	}

	public void setCtBaseDate(Date ctBaseDate) {
		this.ctBaseDate = ctBaseDate;
	}

	public int getCtBaseDays() {
		return this.ctBaseDays;
	}

	public void setCtBaseDays(int ctBaseDays) {
		this.ctBaseDays = ctBaseDays;
	}

	public boolean getCtDating() {
		return this.ctDating;
	}

	public void setCtDating(boolean ctDating) {
		this.ctDating = ctDating;
	}

	public String getCtDesc() {
		return this.ctDesc;
	}

	public void setCtDesc(String ctDesc) {
		this.ctDesc = ctDesc;
	}

	public Date getCtDiscDate() {
		return this.ctDiscDate;
	}

	public void setCtDiscDate(Date ctDiscDate) {
		this.ctDiscDate = ctDiscDate;
	}

	public BigDecimal getCtDiscDays() {
		return this.ctDiscDays;
	}

	public void setCtDiscDays(BigDecimal ctDiscDays) {
		this.ctDiscDays = ctDiscDays;
	}

	public BigDecimal getCtDiscPct() {
		return this.ctDiscPct;
	}

	public void setCtDiscPct(BigDecimal ctDiscPct) {
		this.ctDiscPct = ctDiscPct;
	}

	public Date getCtDueDate() {
		return this.ctDueDate;
	}

	public void setCtDueDate(Date ctDueDate) {
		this.ctDueDate = ctDueDate;
	}

	public BigDecimal getCtDueDays() {
		return this.ctDueDays;
	}

	public void setCtDueDays(BigDecimal ctDueDays) {
		this.ctDueDays = ctDueDays;
	}

	public int getCtDueInv() {
		return this.ctDueInv;
	}

	public void setCtDueInv(int ctDueInv) {
		this.ctDueInv = ctDueInv;
	}

	public int getCtFromInv() {
		return this.ctFromInv;
	}

	public void setCtFromInv(int ctFromInv) {
		this.ctFromInv = ctFromInv;
	}

	public int getCtGraceDays() {
		return this.ctGraceDays;
	}

	public void setCtGraceDays(int ctGraceDays) {
		this.ctGraceDays = ctGraceDays;
	}

	public BigDecimal getCtLateInt() {
		return this.ctLateInt;
	}

	public void setCtLateInt(BigDecimal ctLateInt) {
		this.ctLateInt = ctLateInt;
	}

	public int getCtMinDays() {
		return this.ctMinDays;
	}

	public void setCtMinDays(int ctMinDays) {
		this.ctMinDays = ctMinDays;
	}

	public Date getCtModDate() {
		return this.ctModDate;
	}

	public void setCtModDate(Date ctModDate) {
		this.ctModDate = ctModDate;
	}

	public boolean getCtMtdDisc() {
		return this.ctMtdDisc;
	}

	public void setCtMtdDisc(boolean ctMtdDisc) {
		this.ctMtdDisc = ctMtdDisc;
	}

	public boolean getCtMtdDue() {
		return this.ctMtdDue;
	}

	public void setCtMtdDue(boolean ctMtdDue) {
		this.ctMtdDue = ctMtdDue;
	}

	public BigDecimal getCtTermsInt() {
		return this.ctTermsInt;
	}

	public void setCtTermsInt(BigDecimal ctTermsInt) {
		this.ctTermsInt = ctTermsInt;
	}

	public String getCtUser1() {
		return this.ctUser1;
	}

	public void setCtUser1(String ctUser1) {
		this.ctUser1 = ctUser1;
	}

	public String getCtUser2() {
		return this.ctUser2;
	}

	public void setCtUser2(String ctUser2) {
		this.ctUser2 = ctUser2;
	}

	public String getCtUserid() {
		return this.ctUserid;
	}

	public void setCtUserid(String ctUserid) {
		this.ctUserid = ctUserid;
	}

	public boolean getCtXdueInv() {
		return this.ctXdueInv;
	}

	public void setCtXdueInv(boolean ctXdueInv) {
		this.ctXdueInv = ctXdueInv;
	}

	public boolean getCtXfromInv() {
		return this.ctXfromInv;
	}

	public void setCtXfromInv(boolean ctXfromInv) {
		this.ctXfromInv = ctXfromInv;
	}

	public BigDecimal getOidCofidiCtMstr() {
		return this.oidCofidiCtMstr;
	}

	public void setOidCofidiCtMstr(BigDecimal oidCofidiCtMstr) {
		this.oidCofidiCtMstr = oidCofidiCtMstr;
	}

}