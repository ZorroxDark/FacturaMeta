package mx.com.mtlsa.billing.entity.openedge;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the "cofidi_ar_mstr" database table.
 * 
 */
@Entity
@Table(name="cofidi_ar_mstr")
@NamedQuery(name="CofidiArMstr.findAll", query="SELECT c FROM CofidiArMstr c")
public class CofidiArMstr implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CofidiArMstrPK id;

	@Column(name="ar__chr01")
	private String arChr01;

	@Column(name="ar__chr02")
	private String arChr02;

	@Column(name="ar__chr03")
	private String arChr03;

	@Column(name="ar__chr04")
	private String arChr04;

	@Column(name="ar__chr05")
	private String arChr05;

	@Column(name="ar__dec01")
	private BigDecimal arDec01;

	@Column(name="ar__dec02")
	private BigDecimal arDec02;

	@Temporal(TemporalType.DATE)
	@Column(name="ar__dte01")
	private Date arDte01;

	@Temporal(TemporalType.DATE)
	@Column(name="ar__dte02")
	private Date arDte02;

	@Column(name="ar__log01")
	private boolean arLog01;

	@Column(name="ar__qad01")
	private String arQad01;

	@Column(name="ar__qad02")
	private String arQad02;

	@Column(name="ar__qad03")
	private boolean arQad03;

	@Column(name="ar_acct")
	private String arAcct;

	@Column(name="ar_amt")
	private BigDecimal arAmt;

	@Column(name="ar_amt_chg")
	private BigDecimal arAmtChg;

	@Column(name="ar_app_owner")
	private String arAppOwner;

	@Column(name="ar_applied")
	private BigDecimal arApplied;

	@Column(name="ar_bank")
	private String arBank;

	@Column(name="ar_base_amt")
	private BigDecimal arBaseAmt;

	@Column(name="ar_base_amt_chg")
	private BigDecimal arBaseAmtChg;

	@Column(name="ar_base_applied")
	private BigDecimal arBaseApplied;

	@Column(name="ar_base_comm_amt")
	private String arBaseCommAmt;

	@Column(name="ar_batch")
	private String arBatch;

	@Column(name="ar_bill")
	private String arBill;

	@Column(name="ar_cc")
	private String arCc;

	@Column(name="ar_check")
	private String arCheck;

	@Column(name="ar_cmtindx")
	private int arCmtindx;

	@Column(name="ar_coll_mthd")
	private String arCollMthd;

	@Column(name="ar_comm_amt")
	private String arCommAmt;

	@Column(name="ar_comm_pct")
	private String arCommPct;

	@Column(name="ar_contested")
	private boolean arContested;

	@Column(name="ar_cr_terms")
	private String arCrTerms;

	@Column(name="ar_curr")
	private String arCurr;

	@Column(name="ar_cust")
	private String arCust;

	@Column(name="ar_customer_bank")
	private String arCustomerBank;

	@Column(name="ar_customer_initiated")
	private boolean arCustomerInitiated;

	@Temporal(TemporalType.DATE)
	@Column(name="ar_date")
	private Date arDate;

	@Column(name="ar_dd_curr")
	private String arDdCurr;

	@Column(name="ar_dd_ex_rate")
	private BigDecimal arDdExRate;

	@Column(name="ar_dd_ex_rate2")
	private BigDecimal arDdExRate2;

	@Column(name="ar_dd_exru_seq")
	private int arDdExruSeq;

	@Column(name="ar_disc_acct")
	private String arDiscAcct;

	@Column(name="ar_disc_cc")
	private String arDiscCc;

	@Column(name="ar_disc_chg")
	private BigDecimal arDiscChg;

	@Temporal(TemporalType.DATE)
	@Column(name="ar_disc_date")
	private Date arDiscDate;

	@Column(name="ar_disc_sub")
	private String arDiscSub;

	@Column(name="ar_draft")
	private boolean arDraft;

	@Temporal(TemporalType.DATE)
	@Column(name="ar_draft_disc_date")
	private Date arDraftDiscDate;

	@Temporal(TemporalType.DATE)
	@Column(name="ar_draft_submit_date")
	private Date arDraftSubmitDate;

	@Column(name="ar_drft_sel")
	private boolean arDrftSel;

	@Temporal(TemporalType.DATE)
	@Column(name="ar_due_date")
	private Date arDueDate;

	@Column(name="ar_dun_level")
	private int arDunLevel;

	@Column(name="ar_dy_code")
	private String arDyCode;

	@Temporal(TemporalType.DATE)
	@Column(name="ar_effdate")
	private Date arEffdate;

	@Column(name="ar_ent_ex")
	private BigDecimal arEntEx;

	@Column(name="ar_entity")
	private String arEntity;

	@Column(name="ar_ex_rate")
	private BigDecimal arExRate;

	@Column(name="ar_ex_rate2")
	private BigDecimal arExRate2;

	@Column(name="ar_ex_ratetype")
	private String arExRatetype;

	@Temporal(TemporalType.DATE)
	@Column(name="ar_expt_date")
	private Date arExptDate;

	@Column(name="ar_exru_seq")
	private int arExruSeq;

	@Column(name="ar_fr_terms")
	private String arFrTerms;

	@Column(name="ar_fsm_type")
	private String arFsmType;

	@Column(name="ar_inv_cr")
	private String arInvCr;

	@Temporal(TemporalType.DATE)
	@Column(name="ar_ldue_date")
	private Date arLdueDate;

	@Column(name="ar_mrgn_amt")
	private BigDecimal arMrgnAmt;

	@Column(name="ar_open")
	private boolean arOpen;

	@Temporal(TemporalType.DATE)
	@Column(name="ar_paid_date")
	private Date arPaidDate;

	@Column(name="ar_pay_method")
	private String arPayMethod;

	@Column(name="ar_po")
	private String arPo;

	@Column(name="ar_prepayment")
	private boolean arPrepayment;

	@Column(name="ar_print")
	private boolean arPrint;

	@Temporal(TemporalType.DATE)
	@Column(name="ar_recon_date")
	private Date arReconDate;

	@Column(name="ar_sales_amt")
	private BigDecimal arSalesAmt;

	@Column(name="ar_ship")
	private String arShip;

	@Column(name="ar_shipfrom")
	private String arShipfrom;

	@Column(name="ar_slspsn")
	private String arSlspsn;

	@Column(name="ar_so_nbr")
	private String arSoNbr;

	@Column(name="ar_status")
	private String arStatus;

	@Column(name="ar_sub")
	private String arSub;

	@Temporal(TemporalType.DATE)
	@Column(name="ar_tax_date")
	private Date arTaxDate;

	@Column(name="ar_tax_env")
	private String arTaxEnv;

	@Column(name="ar_type")
	private String arType;

	@Column(name="ar_user1")
	private String arUser1;

	@Column(name="ar_user2")
	private String arUser2;

	@Column(name="ar_var_acct")
	private String arVarAcct;

	@Column(name="ar_var_cc")
	private String arVarCc;

	@Column(name="ar_var_sub")
	private String arVarSub;

	@Temporal(TemporalType.DATE)
	@Column(name="ar_void_date")
	private Date arVoidDate;

	@Column(name="ar_xcomm_pct")
	private String arXcommPct;

	@Column(name="ar_xslspsn1")
	private String arXslspsn1;

	@Column(name="ar_xslspsn2")
	private String arXslspsn2;

	@Column(name="oid_cofidi_ar_mstr")
	private BigDecimal oidCofidiArMstr;

	public CofidiArMstr() {
	}

	public CofidiArMstrPK getId() {
		return this.id;
	}

	public void setId(CofidiArMstrPK id) {
		this.id = id;
	}

	public String getArChr01() {
		return this.arChr01;
	}

	public void setArChr01(String arChr01) {
		this.arChr01 = arChr01;
	}

	public String getArChr02() {
		return this.arChr02;
	}

	public void setArChr02(String arChr02) {
		this.arChr02 = arChr02;
	}

	public String getArChr03() {
		return this.arChr03;
	}

	public void setArChr03(String arChr03) {
		this.arChr03 = arChr03;
	}

	public String getArChr04() {
		return this.arChr04;
	}

	public void setArChr04(String arChr04) {
		this.arChr04 = arChr04;
	}

	public String getArChr05() {
		return this.arChr05;
	}

	public void setArChr05(String arChr05) {
		this.arChr05 = arChr05;
	}

	public BigDecimal getArDec01() {
		return this.arDec01;
	}

	public void setArDec01(BigDecimal arDec01) {
		this.arDec01 = arDec01;
	}

	public BigDecimal getArDec02() {
		return this.arDec02;
	}

	public void setArDec02(BigDecimal arDec02) {
		this.arDec02 = arDec02;
	}

	public Date getArDte01() {
		return this.arDte01;
	}

	public void setArDte01(Date arDte01) {
		this.arDte01 = arDte01;
	}

	public Date getArDte02() {
		return this.arDte02;
	}

	public void setArDte02(Date arDte02) {
		this.arDte02 = arDte02;
	}

	public boolean getArLog01() {
		return this.arLog01;
	}

	public void setArLog01(boolean arLog01) {
		this.arLog01 = arLog01;
	}

	public String getArQad01() {
		return this.arQad01;
	}

	public void setArQad01(String arQad01) {
		this.arQad01 = arQad01;
	}

	public String getArQad02() {
		return this.arQad02;
	}

	public void setArQad02(String arQad02) {
		this.arQad02 = arQad02;
	}

	public boolean getArQad03() {
		return this.arQad03;
	}

	public void setArQad03(boolean arQad03) {
		this.arQad03 = arQad03;
	}

	public String getArAcct() {
		return this.arAcct;
	}

	public void setArAcct(String arAcct) {
		this.arAcct = arAcct;
	}

	public BigDecimal getArAmt() {
		return this.arAmt;
	}

	public void setArAmt(BigDecimal arAmt) {
		this.arAmt = arAmt;
	}

	public BigDecimal getArAmtChg() {
		return this.arAmtChg;
	}

	public void setArAmtChg(BigDecimal arAmtChg) {
		this.arAmtChg = arAmtChg;
	}

	public String getArAppOwner() {
		return this.arAppOwner;
	}

	public void setArAppOwner(String arAppOwner) {
		this.arAppOwner = arAppOwner;
	}

	public BigDecimal getArApplied() {
		return this.arApplied;
	}

	public void setArApplied(BigDecimal arApplied) {
		this.arApplied = arApplied;
	}

	public String getArBank() {
		return this.arBank;
	}

	public void setArBank(String arBank) {
		this.arBank = arBank;
	}

	public BigDecimal getArBaseAmt() {
		return this.arBaseAmt;
	}

	public void setArBaseAmt(BigDecimal arBaseAmt) {
		this.arBaseAmt = arBaseAmt;
	}

	public BigDecimal getArBaseAmtChg() {
		return this.arBaseAmtChg;
	}

	public void setArBaseAmtChg(BigDecimal arBaseAmtChg) {
		this.arBaseAmtChg = arBaseAmtChg;
	}

	public BigDecimal getArBaseApplied() {
		return this.arBaseApplied;
	}

	public void setArBaseApplied(BigDecimal arBaseApplied) {
		this.arBaseApplied = arBaseApplied;
	}

	public String getArBaseCommAmt() {
		return this.arBaseCommAmt;
	}

	public void setArBaseCommAmt(String arBaseCommAmt) {
		this.arBaseCommAmt = arBaseCommAmt;
	}

	public String getArBatch() {
		return this.arBatch;
	}

	public void setArBatch(String arBatch) {
		this.arBatch = arBatch;
	}

	public String getArBill() {
		return this.arBill;
	}

	public void setArBill(String arBill) {
		this.arBill = arBill;
	}

	public String getArCc() {
		return this.arCc;
	}

	public void setArCc(String arCc) {
		this.arCc = arCc;
	}

	public String getArCheck() {
		return this.arCheck;
	}

	public void setArCheck(String arCheck) {
		this.arCheck = arCheck;
	}

	public int getArCmtindx() {
		return this.arCmtindx;
	}

	public void setArCmtindx(int arCmtindx) {
		this.arCmtindx = arCmtindx;
	}

	public String getArCollMthd() {
		return this.arCollMthd;
	}

	public void setArCollMthd(String arCollMthd) {
		this.arCollMthd = arCollMthd;
	}

	public String getArCommAmt() {
		return this.arCommAmt;
	}

	public void setArCommAmt(String arCommAmt) {
		this.arCommAmt = arCommAmt;
	}

	public String getArCommPct() {
		return this.arCommPct;
	}

	public void setArCommPct(String arCommPct) {
		this.arCommPct = arCommPct;
	}

	public boolean getArContested() {
		return this.arContested;
	}

	public void setArContested(boolean arContested) {
		this.arContested = arContested;
	}

	public String getArCrTerms() {
		return this.arCrTerms;
	}

	public void setArCrTerms(String arCrTerms) {
		this.arCrTerms = arCrTerms;
	}

	public String getArCurr() {
		return this.arCurr;
	}

	public void setArCurr(String arCurr) {
		this.arCurr = arCurr;
	}

	public String getArCust() {
		return this.arCust;
	}

	public void setArCust(String arCust) {
		this.arCust = arCust;
	}

	public String getArCustomerBank() {
		return this.arCustomerBank;
	}

	public void setArCustomerBank(String arCustomerBank) {
		this.arCustomerBank = arCustomerBank;
	}

	public boolean getArCustomerInitiated() {
		return this.arCustomerInitiated;
	}

	public void setArCustomerInitiated(boolean arCustomerInitiated) {
		this.arCustomerInitiated = arCustomerInitiated;
	}

	public Date getArDate() {
		return this.arDate;
	}

	public void setArDate(Date arDate) {
		this.arDate = arDate;
	}

	public String getArDdCurr() {
		return this.arDdCurr;
	}

	public void setArDdCurr(String arDdCurr) {
		this.arDdCurr = arDdCurr;
	}

	public BigDecimal getArDdExRate() {
		return this.arDdExRate;
	}

	public void setArDdExRate(BigDecimal arDdExRate) {
		this.arDdExRate = arDdExRate;
	}

	public BigDecimal getArDdExRate2() {
		return this.arDdExRate2;
	}

	public void setArDdExRate2(BigDecimal arDdExRate2) {
		this.arDdExRate2 = arDdExRate2;
	}

	public int getArDdExruSeq() {
		return this.arDdExruSeq;
	}

	public void setArDdExruSeq(int arDdExruSeq) {
		this.arDdExruSeq = arDdExruSeq;
	}

	public String getArDiscAcct() {
		return this.arDiscAcct;
	}

	public void setArDiscAcct(String arDiscAcct) {
		this.arDiscAcct = arDiscAcct;
	}

	public String getArDiscCc() {
		return this.arDiscCc;
	}

	public void setArDiscCc(String arDiscCc) {
		this.arDiscCc = arDiscCc;
	}

	public BigDecimal getArDiscChg() {
		return this.arDiscChg;
	}

	public void setArDiscChg(BigDecimal arDiscChg) {
		this.arDiscChg = arDiscChg;
	}

	public Date getArDiscDate() {
		return this.arDiscDate;
	}

	public void setArDiscDate(Date arDiscDate) {
		this.arDiscDate = arDiscDate;
	}

	public String getArDiscSub() {
		return this.arDiscSub;
	}

	public void setArDiscSub(String arDiscSub) {
		this.arDiscSub = arDiscSub;
	}

	public boolean getArDraft() {
		return this.arDraft;
	}

	public void setArDraft(boolean arDraft) {
		this.arDraft = arDraft;
	}

	public Date getArDraftDiscDate() {
		return this.arDraftDiscDate;
	}

	public void setArDraftDiscDate(Date arDraftDiscDate) {
		this.arDraftDiscDate = arDraftDiscDate;
	}

	public Date getArDraftSubmitDate() {
		return this.arDraftSubmitDate;
	}

	public void setArDraftSubmitDate(Date arDraftSubmitDate) {
		this.arDraftSubmitDate = arDraftSubmitDate;
	}

	public boolean getArDrftSel() {
		return this.arDrftSel;
	}

	public void setArDrftSel(boolean arDrftSel) {
		this.arDrftSel = arDrftSel;
	}

	public Date getArDueDate() {
		return this.arDueDate;
	}

	public void setArDueDate(Date arDueDate) {
		this.arDueDate = arDueDate;
	}

	public int getArDunLevel() {
		return this.arDunLevel;
	}

	public void setArDunLevel(int arDunLevel) {
		this.arDunLevel = arDunLevel;
	}

	public String getArDyCode() {
		return this.arDyCode;
	}

	public void setArDyCode(String arDyCode) {
		this.arDyCode = arDyCode;
	}

	public Date getArEffdate() {
		return this.arEffdate;
	}

	public void setArEffdate(Date arEffdate) {
		this.arEffdate = arEffdate;
	}

	public BigDecimal getArEntEx() {
		return this.arEntEx;
	}

	public void setArEntEx(BigDecimal arEntEx) {
		this.arEntEx = arEntEx;
	}

	public String getArEntity() {
		return this.arEntity;
	}

	public void setArEntity(String arEntity) {
		this.arEntity = arEntity;
	}

	public BigDecimal getArExRate() {
		return this.arExRate;
	}

	public void setArExRate(BigDecimal arExRate) {
		this.arExRate = arExRate;
	}

	public BigDecimal getArExRate2() {
		return this.arExRate2;
	}

	public void setArExRate2(BigDecimal arExRate2) {
		this.arExRate2 = arExRate2;
	}

	public String getArExRatetype() {
		return this.arExRatetype;
	}

	public void setArExRatetype(String arExRatetype) {
		this.arExRatetype = arExRatetype;
	}

	public Date getArExptDate() {
		return this.arExptDate;
	}

	public void setArExptDate(Date arExptDate) {
		this.arExptDate = arExptDate;
	}

	public int getArExruSeq() {
		return this.arExruSeq;
	}

	public void setArExruSeq(int arExruSeq) {
		this.arExruSeq = arExruSeq;
	}

	public String getArFrTerms() {
		return this.arFrTerms;
	}

	public void setArFrTerms(String arFrTerms) {
		this.arFrTerms = arFrTerms;
	}

	public String getArFsmType() {
		return this.arFsmType;
	}

	public void setArFsmType(String arFsmType) {
		this.arFsmType = arFsmType;
	}

	public String getArInvCr() {
		return this.arInvCr;
	}

	public void setArInvCr(String arInvCr) {
		this.arInvCr = arInvCr;
	}

	public Date getArLdueDate() {
		return this.arLdueDate;
	}

	public void setArLdueDate(Date arLdueDate) {
		this.arLdueDate = arLdueDate;
	}

	public BigDecimal getArMrgnAmt() {
		return this.arMrgnAmt;
	}

	public void setArMrgnAmt(BigDecimal arMrgnAmt) {
		this.arMrgnAmt = arMrgnAmt;
	}

	public boolean getArOpen() {
		return this.arOpen;
	}

	public void setArOpen(boolean arOpen) {
		this.arOpen = arOpen;
	}

	public Date getArPaidDate() {
		return this.arPaidDate;
	}

	public void setArPaidDate(Date arPaidDate) {
		this.arPaidDate = arPaidDate;
	}

	public String getArPayMethod() {
		return this.arPayMethod;
	}

	public void setArPayMethod(String arPayMethod) {
		this.arPayMethod = arPayMethod;
	}

	public String getArPo() {
		return this.arPo;
	}

	public void setArPo(String arPo) {
		this.arPo = arPo;
	}

	public boolean getArPrepayment() {
		return this.arPrepayment;
	}

	public void setArPrepayment(boolean arPrepayment) {
		this.arPrepayment = arPrepayment;
	}

	public boolean getArPrint() {
		return this.arPrint;
	}

	public void setArPrint(boolean arPrint) {
		this.arPrint = arPrint;
	}

	public Date getArReconDate() {
		return this.arReconDate;
	}

	public void setArReconDate(Date arReconDate) {
		this.arReconDate = arReconDate;
	}

	public BigDecimal getArSalesAmt() {
		return this.arSalesAmt;
	}

	public void setArSalesAmt(BigDecimal arSalesAmt) {
		this.arSalesAmt = arSalesAmt;
	}

	public String getArShip() {
		return this.arShip;
	}

	public void setArShip(String arShip) {
		this.arShip = arShip;
	}

	public String getArShipfrom() {
		return this.arShipfrom;
	}

	public void setArShipfrom(String arShipfrom) {
		this.arShipfrom = arShipfrom;
	}

	public String getArSlspsn() {
		return this.arSlspsn;
	}

	public void setArSlspsn(String arSlspsn) {
		this.arSlspsn = arSlspsn;
	}

	public String getArSoNbr() {
		return this.arSoNbr;
	}

	public void setArSoNbr(String arSoNbr) {
		this.arSoNbr = arSoNbr;
	}

	public String getArStatus() {
		return this.arStatus;
	}

	public void setArStatus(String arStatus) {
		this.arStatus = arStatus;
	}

	public String getArSub() {
		return this.arSub;
	}

	public void setArSub(String arSub) {
		this.arSub = arSub;
	}

	public Date getArTaxDate() {
		return this.arTaxDate;
	}

	public void setArTaxDate(Date arTaxDate) {
		this.arTaxDate = arTaxDate;
	}

	public String getArTaxEnv() {
		return this.arTaxEnv;
	}

	public void setArTaxEnv(String arTaxEnv) {
		this.arTaxEnv = arTaxEnv;
	}

	public String getArType() {
		return this.arType;
	}

	public void setArType(String arType) {
		this.arType = arType;
	}

	public String getArUser1() {
		return this.arUser1;
	}

	public void setArUser1(String arUser1) {
		this.arUser1 = arUser1;
	}

	public String getArUser2() {
		return this.arUser2;
	}

	public void setArUser2(String arUser2) {
		this.arUser2 = arUser2;
	}

	public String getArVarAcct() {
		return this.arVarAcct;
	}

	public void setArVarAcct(String arVarAcct) {
		this.arVarAcct = arVarAcct;
	}

	public String getArVarCc() {
		return this.arVarCc;
	}

	public void setArVarCc(String arVarCc) {
		this.arVarCc = arVarCc;
	}

	public String getArVarSub() {
		return this.arVarSub;
	}

	public void setArVarSub(String arVarSub) {
		this.arVarSub = arVarSub;
	}

	public Date getArVoidDate() {
		return this.arVoidDate;
	}

	public void setArVoidDate(Date arVoidDate) {
		this.arVoidDate = arVoidDate;
	}

	public String getArXcommPct() {
		return this.arXcommPct;
	}

	public void setArXcommPct(String arXcommPct) {
		this.arXcommPct = arXcommPct;
	}

	public String getArXslspsn1() {
		return this.arXslspsn1;
	}

	public void setArXslspsn1(String arXslspsn1) {
		this.arXslspsn1 = arXslspsn1;
	}

	public String getArXslspsn2() {
		return this.arXslspsn2;
	}

	public void setArXslspsn2(String arXslspsn2) {
		this.arXslspsn2 = arXslspsn2;
	}

	public BigDecimal getOidCofidiArMstr() {
		return this.oidCofidiArMstr;
	}

	public void setOidCofidiArMstr(BigDecimal oidCofidiArMstr) {
		this.oidCofidiArMstr = oidCofidiArMstr;
	}

}