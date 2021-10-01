package mx.com.mtlsa.billing.entity.openedge;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the "cofidi_tx2d_det" database table.
 * 
 */
@Entity
@Table(name="cofidi_tx2d_det")
@NamedQuery(name="CofidiTx2dDet.findAll", query="SELECT c FROM CofidiTx2dDet c")
public class CofidiTx2dDet implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CofidiTx2dDetPK id;

	@Column(name="oid_cofidi_tx2d_det")
	private BigDecimal oidCofidiTx2dDet;

	@Column(name="tx2d__chr01")
	private String tx2dChr01;

	@Column(name="tx2d__chr02")
	private String tx2dChr02;

	@Column(name="tx2d__dec01")
	private BigDecimal tx2dDec01;

	@Column(name="tx2d__dec02")
	private BigDecimal tx2dDec02;

	@Temporal(TemporalType.DATE)
	@Column(name="tx2d__dte01")
	private Date tx2dDte01;

	@Column(name="tx2d__log01")
	private boolean tx2dLog01;

	@Column(name="tx2d__qad01")
	private String tx2dQad01;

	@Column(name="tx2d__qad02")
	private String tx2dQad02;

	@Column(name="tx2d__qad03")
	private boolean tx2dQad03;

	@Column(name="tx2d__qad04")
	private BigDecimal tx2dQad04;

	@Temporal(TemporalType.DATE)
	@Column(name="tx2d__qad05")
	private Date tx2dQad05;

	@Column(name="tx2d__qadd01")
	private String tx2dQadd01;

	@Column(name="tx2d__qadd02")
	private String tx2dQadd02;

	@Column(name="tx2d_abs_ret_amt")
	private BigDecimal tx2dAbsRetAmt;

	@Column(name="tx2d_by_line")
	private boolean tx2dByLine;

	@Column(name="tx2d_carrier")
	private String tx2dCarrier;

	@Column(name="tx2d_cur_abs_ret_amt")
	private BigDecimal tx2dCurAbsRetAmt;

	@Column(name="tx2d_cur_nontax_amt")
	private BigDecimal tx2dCurNontaxAmt;

	@Column(name="tx2d_cur_recov_amt")
	private BigDecimal tx2dCurRecovAmt;

	@Column(name="tx2d_cur_tax_amt")
	private BigDecimal tx2dCurTaxAmt;

	@Column(name="tx2d_curr")
	private String tx2dCurr;

	@Column(name="tx2d_edited")
	private boolean tx2dEdited;

	@Temporal(TemporalType.DATE)
	@Column(name="tx2d_effdate")
	private Date tx2dEffdate;

	@Column(name="tx2d_ent_abs_ret_amt")
	private BigDecimal tx2dEntAbsRetAmt;

	@Column(name="tx2d_ent_nontax_amt")
	private BigDecimal tx2dEntNontaxAmt;

	@Column(name="tx2d_ent_recov_amt")
	private BigDecimal tx2dEntRecovAmt;

	@Column(name="tx2d_ent_tax_amt")
	private BigDecimal tx2dEntTaxAmt;

	@Column(name="tx2d_line_site_ent")
	private String tx2dLineSiteEnt;

	@Column(name="tx2d_nontax_amt")
	private BigDecimal tx2dNontaxAmt;

	@Temporal(TemporalType.DATE)
	@Column(name="tx2d_posted_date")
	private Date tx2dPostedDate;

	@Column(name="tx2d_rcpt_tax_point")
	private boolean tx2dRcptTaxPoint;

	@Column(name="tx2d_recov_amt")
	private BigDecimal tx2dRecovAmt;

	@Column(name="tx2d_tax_amt")
	private BigDecimal tx2dTaxAmt;

	@Column(name="tx2d_tax_env")
	private String tx2dTaxEnv;

	@Column(name="tx2d_tax_in")
	private boolean tx2dTaxIn;

	@Column(name="tx2d_tax_type")
	private String tx2dTaxType;

	@Column(name="tx2d_tax_usage")
	private String tx2dTaxUsage;

	@Column(name="tx2d_taxable_amt")
	private BigDecimal tx2dTaxableAmt;

	@Column(name="tx2d_taxc")
	private String tx2dTaxc;

	@Column(name="tx2d_totamt")
	private BigDecimal tx2dTotamt;

	@Column(name="tx2d_tottax")
	private BigDecimal tx2dTottax;

	@Column(name="tx2d_trans_ent")
	private String tx2dTransEnt;

	@Column(name="tx2d_usage_tax_point")
	private boolean tx2dUsageTaxPoint;

	@Column(name="tx2d_user1")
	private String tx2dUser1;

	@Column(name="tx2d_user2")
	private String tx2dUser2;

	@Column(name="tx2d_zone_from")
	private String tx2dZoneFrom;

	@Column(name="tx2d_zone_to")
	private String tx2dZoneTo;

	public CofidiTx2dDet() {
	}

	public CofidiTx2dDetPK getId() {
		return this.id;
	}

	public void setId(CofidiTx2dDetPK id) {
		this.id = id;
	}

	public BigDecimal getOidCofidiTx2dDet() {
		return this.oidCofidiTx2dDet;
	}

	public void setOidCofidiTx2dDet(BigDecimal oidCofidiTx2dDet) {
		this.oidCofidiTx2dDet = oidCofidiTx2dDet;
	}

	public String getTx2dChr01() {
		return this.tx2dChr01;
	}

	public void setTx2dChr01(String tx2dChr01) {
		this.tx2dChr01 = tx2dChr01;
	}

	public String getTx2dChr02() {
		return this.tx2dChr02;
	}

	public void setTx2dChr02(String tx2dChr02) {
		this.tx2dChr02 = tx2dChr02;
	}

	public BigDecimal getTx2dDec01() {
		return this.tx2dDec01;
	}

	public void setTx2dDec01(BigDecimal tx2dDec01) {
		this.tx2dDec01 = tx2dDec01;
	}

	public BigDecimal getTx2dDec02() {
		return this.tx2dDec02;
	}

	public void setTx2dDec02(BigDecimal tx2dDec02) {
		this.tx2dDec02 = tx2dDec02;
	}

	public Date getTx2dDte01() {
		return this.tx2dDte01;
	}

	public void setTx2dDte01(Date tx2dDte01) {
		this.tx2dDte01 = tx2dDte01;
	}

	public boolean getTx2dLog01() {
		return this.tx2dLog01;
	}

	public void setTx2dLog01(boolean tx2dLog01) {
		this.tx2dLog01 = tx2dLog01;
	}

	public String getTx2dQad01() {
		return this.tx2dQad01;
	}

	public void setTx2dQad01(String tx2dQad01) {
		this.tx2dQad01 = tx2dQad01;
	}

	public String getTx2dQad02() {
		return this.tx2dQad02;
	}

	public void setTx2dQad02(String tx2dQad02) {
		this.tx2dQad02 = tx2dQad02;
	}

	public boolean getTx2dQad03() {
		return this.tx2dQad03;
	}

	public void setTx2dQad03(boolean tx2dQad03) {
		this.tx2dQad03 = tx2dQad03;
	}

	public BigDecimal getTx2dQad04() {
		return this.tx2dQad04;
	}

	public void setTx2dQad04(BigDecimal tx2dQad04) {
		this.tx2dQad04 = tx2dQad04;
	}

	public Date getTx2dQad05() {
		return this.tx2dQad05;
	}

	public void setTx2dQad05(Date tx2dQad05) {
		this.tx2dQad05 = tx2dQad05;
	}

	public String getTx2dQadd01() {
		return this.tx2dQadd01;
	}

	public void setTx2dQadd01(String tx2dQadd01) {
		this.tx2dQadd01 = tx2dQadd01;
	}

	public String getTx2dQadd02() {
		return this.tx2dQadd02;
	}

	public void setTx2dQadd02(String tx2dQadd02) {
		this.tx2dQadd02 = tx2dQadd02;
	}

	public BigDecimal getTx2dAbsRetAmt() {
		return this.tx2dAbsRetAmt;
	}

	public void setTx2dAbsRetAmt(BigDecimal tx2dAbsRetAmt) {
		this.tx2dAbsRetAmt = tx2dAbsRetAmt;
	}

	public boolean getTx2dByLine() {
		return this.tx2dByLine;
	}

	public void setTx2dByLine(boolean tx2dByLine) {
		this.tx2dByLine = tx2dByLine;
	}

	public String getTx2dCarrier() {
		return this.tx2dCarrier;
	}

	public void setTx2dCarrier(String tx2dCarrier) {
		this.tx2dCarrier = tx2dCarrier;
	}

	public BigDecimal getTx2dCurAbsRetAmt() {
		return this.tx2dCurAbsRetAmt;
	}

	public void setTx2dCurAbsRetAmt(BigDecimal tx2dCurAbsRetAmt) {
		this.tx2dCurAbsRetAmt = tx2dCurAbsRetAmt;
	}

	public BigDecimal getTx2dCurNontaxAmt() {
		return this.tx2dCurNontaxAmt;
	}

	public void setTx2dCurNontaxAmt(BigDecimal tx2dCurNontaxAmt) {
		this.tx2dCurNontaxAmt = tx2dCurNontaxAmt;
	}

	public BigDecimal getTx2dCurRecovAmt() {
		return this.tx2dCurRecovAmt;
	}

	public void setTx2dCurRecovAmt(BigDecimal tx2dCurRecovAmt) {
		this.tx2dCurRecovAmt = tx2dCurRecovAmt;
	}

	public BigDecimal getTx2dCurTaxAmt() {
		return this.tx2dCurTaxAmt;
	}

	public void setTx2dCurTaxAmt(BigDecimal tx2dCurTaxAmt) {
		this.tx2dCurTaxAmt = tx2dCurTaxAmt;
	}

	public String getTx2dCurr() {
		return this.tx2dCurr;
	}

	public void setTx2dCurr(String tx2dCurr) {
		this.tx2dCurr = tx2dCurr;
	}

	public boolean getTx2dEdited() {
		return this.tx2dEdited;
	}

	public void setTx2dEdited(boolean tx2dEdited) {
		this.tx2dEdited = tx2dEdited;
	}

	public Date getTx2dEffdate() {
		return this.tx2dEffdate;
	}

	public void setTx2dEffdate(Date tx2dEffdate) {
		this.tx2dEffdate = tx2dEffdate;
	}

	public BigDecimal getTx2dEntAbsRetAmt() {
		return this.tx2dEntAbsRetAmt;
	}

	public void setTx2dEntAbsRetAmt(BigDecimal tx2dEntAbsRetAmt) {
		this.tx2dEntAbsRetAmt = tx2dEntAbsRetAmt;
	}

	public BigDecimal getTx2dEntNontaxAmt() {
		return this.tx2dEntNontaxAmt;
	}

	public void setTx2dEntNontaxAmt(BigDecimal tx2dEntNontaxAmt) {
		this.tx2dEntNontaxAmt = tx2dEntNontaxAmt;
	}

	public BigDecimal getTx2dEntRecovAmt() {
		return this.tx2dEntRecovAmt;
	}

	public void setTx2dEntRecovAmt(BigDecimal tx2dEntRecovAmt) {
		this.tx2dEntRecovAmt = tx2dEntRecovAmt;
	}

	public BigDecimal getTx2dEntTaxAmt() {
		return this.tx2dEntTaxAmt;
	}

	public void setTx2dEntTaxAmt(BigDecimal tx2dEntTaxAmt) {
		this.tx2dEntTaxAmt = tx2dEntTaxAmt;
	}

	public String getTx2dLineSiteEnt() {
		return this.tx2dLineSiteEnt;
	}

	public void setTx2dLineSiteEnt(String tx2dLineSiteEnt) {
		this.tx2dLineSiteEnt = tx2dLineSiteEnt;
	}

	public BigDecimal getTx2dNontaxAmt() {
		return this.tx2dNontaxAmt;
	}

	public void setTx2dNontaxAmt(BigDecimal tx2dNontaxAmt) {
		this.tx2dNontaxAmt = tx2dNontaxAmt;
	}

	public Date getTx2dPostedDate() {
		return this.tx2dPostedDate;
	}

	public void setTx2dPostedDate(Date tx2dPostedDate) {
		this.tx2dPostedDate = tx2dPostedDate;
	}

	public boolean getTx2dRcptTaxPoint() {
		return this.tx2dRcptTaxPoint;
	}

	public void setTx2dRcptTaxPoint(boolean tx2dRcptTaxPoint) {
		this.tx2dRcptTaxPoint = tx2dRcptTaxPoint;
	}

	public BigDecimal getTx2dRecovAmt() {
		return this.tx2dRecovAmt;
	}

	public void setTx2dRecovAmt(BigDecimal tx2dRecovAmt) {
		this.tx2dRecovAmt = tx2dRecovAmt;
	}

	public BigDecimal getTx2dTaxAmt() {
		return this.tx2dTaxAmt;
	}

	public void setTx2dTaxAmt(BigDecimal tx2dTaxAmt) {
		this.tx2dTaxAmt = tx2dTaxAmt;
	}

	public String getTx2dTaxEnv() {
		return this.tx2dTaxEnv;
	}

	public void setTx2dTaxEnv(String tx2dTaxEnv) {
		this.tx2dTaxEnv = tx2dTaxEnv;
	}

	public boolean getTx2dTaxIn() {
		return this.tx2dTaxIn;
	}

	public void setTx2dTaxIn(boolean tx2dTaxIn) {
		this.tx2dTaxIn = tx2dTaxIn;
	}

	public String getTx2dTaxType() {
		return this.tx2dTaxType;
	}

	public void setTx2dTaxType(String tx2dTaxType) {
		this.tx2dTaxType = tx2dTaxType;
	}

	public String getTx2dTaxUsage() {
		return this.tx2dTaxUsage;
	}

	public void setTx2dTaxUsage(String tx2dTaxUsage) {
		this.tx2dTaxUsage = tx2dTaxUsage;
	}

	public BigDecimal getTx2dTaxableAmt() {
		return this.tx2dTaxableAmt;
	}

	public void setTx2dTaxableAmt(BigDecimal tx2dTaxableAmt) {
		this.tx2dTaxableAmt = tx2dTaxableAmt;
	}

	public String getTx2dTaxc() {
		return this.tx2dTaxc;
	}

	public void setTx2dTaxc(String tx2dTaxc) {
		this.tx2dTaxc = tx2dTaxc;
	}

	public BigDecimal getTx2dTotamt() {
		return this.tx2dTotamt;
	}

	public void setTx2dTotamt(BigDecimal tx2dTotamt) {
		this.tx2dTotamt = tx2dTotamt;
	}

	public BigDecimal getTx2dTottax() {
		return this.tx2dTottax;
	}

	public void setTx2dTottax(BigDecimal tx2dTottax) {
		this.tx2dTottax = tx2dTottax;
	}

	public String getTx2dTransEnt() {
		return this.tx2dTransEnt;
	}

	public void setTx2dTransEnt(String tx2dTransEnt) {
		this.tx2dTransEnt = tx2dTransEnt;
	}

	public boolean getTx2dUsageTaxPoint() {
		return this.tx2dUsageTaxPoint;
	}

	public void setTx2dUsageTaxPoint(boolean tx2dUsageTaxPoint) {
		this.tx2dUsageTaxPoint = tx2dUsageTaxPoint;
	}

	public String getTx2dUser1() {
		return this.tx2dUser1;
	}

	public void setTx2dUser1(String tx2dUser1) {
		this.tx2dUser1 = tx2dUser1;
	}

	public String getTx2dUser2() {
		return this.tx2dUser2;
	}

	public void setTx2dUser2(String tx2dUser2) {
		this.tx2dUser2 = tx2dUser2;
	}

	public String getTx2dZoneFrom() {
		return this.tx2dZoneFrom;
	}

	public void setTx2dZoneFrom(String tx2dZoneFrom) {
		this.tx2dZoneFrom = tx2dZoneFrom;
	}

	public String getTx2dZoneTo() {
		return this.tx2dZoneTo;
	}

	public void setTx2dZoneTo(String tx2dZoneTo) {
		this.tx2dZoneTo = tx2dZoneTo;
	}

}