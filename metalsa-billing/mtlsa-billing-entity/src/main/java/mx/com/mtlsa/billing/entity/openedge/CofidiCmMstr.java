package mx.com.mtlsa.billing.entity.openedge;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the "cofidi_cm_mstr" database table.
 * 
 */
@Entity
@Table(name="cofidi_cm_mstr")
@NamedQuery(name="CofidiCmMstr.findAll", query="SELECT c FROM CofidiCmMstr c")
public class CofidiCmMstr implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CofidiCmMstrPK id;

	@Column(name="cm__chr01")
	private String cmChr01;

	@Column(name="cm__chr02")
	private String cmChr02;

	@Column(name="cm__chr03")
	private String cmChr03;

	@Column(name="cm__chr04")
	private String cmChr04;

	@Column(name="cm__chr05")
	private String cmChr05;

	@Column(name="cm__chr06")
	private String cmChr06;

	@Column(name="cm__chr07")
	private String cmChr07;

	@Column(name="cm__chr08")
	private String cmChr08;

	@Column(name="cm__chr09")
	private String cmChr09;

	@Column(name="cm__chr10")
	private String cmChr10;

	@Column(name="cm__dec01")
	private BigDecimal cmDec01;

	@Column(name="cm__dec02")
	private BigDecimal cmDec02;

	@Temporal(TemporalType.DATE)
	@Column(name="cm__dte01")
	private Date cmDte01;

	@Temporal(TemporalType.DATE)
	@Column(name="cm__dte02")
	private Date cmDte02;

	@Column(name="cm__log01")
	private boolean cmLog01;

	@Column(name="cm__qad04")
	private String cmQad04;

	@Column(name="cm__qad06")
	private boolean cmQad06;

	@Column(name="cm__qadc01")
	private String cmQadc01;

	@Column(name="cm__qadc02")
	private String cmQadc02;

	@Column(name="cm__qadc03")
	private String cmQadc03;

	@Column(name="cm__qadc04")
	private String cmQadc04;

	@Column(name="cm__qadc05")
	private String cmQadc05;

	@Column(name="cm__qadc06")
	private String cmQadc06;

	@Column(name="cm__qadc07")
	private String cmQadc07;

	@Column(name="cm__qadd01")
	private BigDecimal cmQadd01;

	@Column(name="cm__qadd02")
	private BigDecimal cmQadd02;

	@Column(name="cm__qadi01")
	private int cmQadi01;

	@Column(name="cm__qadi02")
	private int cmQadi02;

	@Column(name="cm__qadi03")
	private int cmQadi03;

	@Column(name="cm__qadi04")
	private int cmQadi04;

	@Column(name="cm__qadl01")
	private boolean cmQadl01;

	@Column(name="cm__qadl02")
	private boolean cmQadl02;

	@Column(name="cm__qadl03")
	private boolean cmQadl03;

	@Column(name="cm__qadl04")
	private boolean cmQadl04;

	@Temporal(TemporalType.DATE)
	@Column(name="cm__qadt01")
	private Date cmQadt01;

	@Temporal(TemporalType.DATE)
	@Column(name="cm__qadt02")
	private Date cmQadt02;

	@Column(name="cm_ar_acct")
	private String cmArAcct;

	@Column(name="cm_ar_cc")
	private String cmArCc;

	@Column(name="cm_ar_sub")
	private String cmArSub;

	@Column(name="cm_avg_pay")
	private int cmAvgPay;

	@Column(name="cm_balance")
	private BigDecimal cmBalance;

	@Column(name="cm_bank")
	private String cmBank;

	@Column(name="cm_bill")
	private String cmBill;

	@Column(name="cm_btb_cr")
	private boolean cmBtbCr;

	@Column(name="cm_btb_mthd")
	private boolean cmBtbMthd;

	@Column(name="cm_btb_type")
	private String cmBtbType;

	@Column(name="cm_class")
	private String cmClass;

	@Column(name="cm_coll_mthd")
	private String cmCollMthd;

	@Column(name="cm_conrep_logic")
	private String cmConrepLogic;

	@Column(name="cm_cr_hold")
	private boolean cmCrHold;

	@Column(name="cm_cr_limit")
	private BigDecimal cmCrLimit;

	@Column(name="cm_cr_rating")
	private String cmCrRating;

	@Temporal(TemporalType.DATE)
	@Column(name="cm_cr_review")
	private Date cmCrReview;

	@Column(name="cm_cr_terms")
	private String cmCrTerms;

	@Temporal(TemporalType.DATE)
	@Column(name="cm_cr_update")
	private Date cmCrUpdate;

	@Column(name="cm_curr")
	private String cmCurr;

	@Column(name="cm_db")
	private String cmDb;

	@Column(name="cm_disc_comb")
	private String cmDiscComb;

	@Column(name="cm_disc_pct")
	private BigDecimal cmDiscPct;

	@Column(name="cm_drft_apv")
	private boolean cmDrftApv;

	@Column(name="cm_drft_bal")
	private BigDecimal cmDrftBal;

	@Column(name="cm_drft_disc")
	private boolean cmDrftDisc;

	@Column(name="cm_drft_max")
	private BigDecimal cmDrftMax;

	@Column(name="cm_drft_min")
	private BigDecimal cmDrftMin;

	@Column(name="cm_dun")
	private boolean cmDun;

	@Column(name="cm_ex_ratetype")
	private String cmExRatetype;

	@Column(name="cm_fin")
	private boolean cmFin;

	@Temporal(TemporalType.DATE)
	@Column(name="cm_fin_date")
	private Date cmFinDate;

	@Column(name="cm_fix_pr")
	private boolean cmFixPr;

	@Column(name="cm_fr_list")
	private String cmFrList;

	@Column(name="cm_fr_min_wt")
	private BigDecimal cmFrMinWt;

	@Column(name="cm_fr_terms")
	private String cmFrTerms;

	@Column(name="cm_fst_id")
	private String cmFstId;

	@Column(name="cm_high_cr")
	private BigDecimal cmHighCr;

	@Temporal(TemporalType.DATE)
	@Column(name="cm_high_date")
	private Date cmHighDate;

	@Column(name="cm_internal")
	private boolean cmInternal;

	@Column(name="cm_invoices")
	private int cmInvoices;

	@Column(name="cm_lang")
	private String cmLang;

	@Column(name="cm_lc_bal")
	private BigDecimal cmLcBal;

	@Temporal(TemporalType.DATE)
	@Column(name="cm_mod_date")
	private Date cmModDate;

	@Column(name="cm_partial")
	private boolean cmPartial;

	@Temporal(TemporalType.DATE)
	@Column(name="cm_pay_date")
	private Date cmPayDate;

	@Column(name="cm_pay_method")
	private String cmPayMethod;

	@Column(name="cm_po_reqd")
	private boolean cmPoReqd;

	@Column(name="cm_pr_list")
	private String cmPrList;

	@Column(name="cm_pr_list2")
	private String cmPrList2;

	@Column(name="cm_promo")
	private String cmPromo;

	@Column(name="cm_pst")
	private boolean cmPst;

	@Column(name="cm_pst_id")
	private String cmPstId;

	@Column(name="cm_region")
	private String cmRegion;

	@Column(name="cm_resale")
	private String cmResale;

	@Column(name="cm_rmks")
	private String cmRmks;

	@Temporal(TemporalType.DATE)
	@Column(name="cm_sale_date")
	private Date cmSaleDate;

	@Column(name="cm_scurr")
	private String cmScurr;

	@Column(name="cm_serv_terms")
	private String cmServTerms;

	@Column(name="cm_ship")
	private String cmShip;

	@Column(name="cm_ship_lt")
	private int cmShipLt;

	@Column(name="cm_shipvia")
	private String cmShipvia;

	@Column(name="cm_sic")
	private String cmSic;

	@Column(name="cm_site")
	private String cmSite;

	@Column(name="cm_slspsn")
	private String cmSlspsn;

	@Column(name="cm_sort")
	private String cmSort;

	@Column(name="cm_stmt")
	private boolean cmStmt;

	@Column(name="cm_stmt_cyc")
	private String cmStmtCyc;

	@Column(name="cm_submit_prop")
	private boolean cmSubmitProp;

	@Column(name="cm_svc_list")
	private String cmSvcList;

	@Column(name="cm_tax_in")
	private boolean cmTaxIn;

	@Column(name="cm_taxable")
	private boolean cmTaxable;

	@Column(name="cm_taxc")
	private String cmTaxc;

	@Column(name="cm_type")
	private String cmType;

	@Column(name="cm_user1")
	private String cmUser1;

	@Column(name="cm_user2")
	private String cmUser2;

	@Column(name="cm_userid")
	private String cmUserid;

	@Column(name="cm_xslspsn")
	private String cmXslspsn;

	@Column(name="cm_xslspsn2")
	private String cmXslspsn2;

	@Column(name="oid_cofidi_cm_mstr")
	private BigDecimal oidCofidiCmMstr;

	public CofidiCmMstr() {
	}

	public CofidiCmMstrPK getId() {
		return this.id;
	}

	public void setId(CofidiCmMstrPK id) {
		this.id = id;
	}

	public String getCmChr01() {
		return this.cmChr01;
	}

	public void setCmChr01(String cmChr01) {
		this.cmChr01 = cmChr01;
	}

	public String getCmChr02() {
		return this.cmChr02;
	}

	public void setCmChr02(String cmChr02) {
		this.cmChr02 = cmChr02;
	}

	public String getCmChr03() {
		return this.cmChr03;
	}

	public void setCmChr03(String cmChr03) {
		this.cmChr03 = cmChr03;
	}

	public String getCmChr04() {
		return this.cmChr04;
	}

	public void setCmChr04(String cmChr04) {
		this.cmChr04 = cmChr04;
	}

	public String getCmChr05() {
		return this.cmChr05;
	}

	public void setCmChr05(String cmChr05) {
		this.cmChr05 = cmChr05;
	}

	public String getCmChr06() {
		return this.cmChr06;
	}

	public void setCmChr06(String cmChr06) {
		this.cmChr06 = cmChr06;
	}

	public String getCmChr07() {
		return this.cmChr07;
	}

	public void setCmChr07(String cmChr07) {
		this.cmChr07 = cmChr07;
	}

	public String getCmChr08() {
		return this.cmChr08;
	}

	public void setCmChr08(String cmChr08) {
		this.cmChr08 = cmChr08;
	}

	public String getCmChr09() {
		return this.cmChr09;
	}

	public void setCmChr09(String cmChr09) {
		this.cmChr09 = cmChr09;
	}

	public String getCmChr10() {
		return this.cmChr10;
	}

	public void setCmChr10(String cmChr10) {
		this.cmChr10 = cmChr10;
	}

	public BigDecimal getCmDec01() {
		return this.cmDec01;
	}

	public void setCmDec01(BigDecimal cmDec01) {
		this.cmDec01 = cmDec01;
	}

	public BigDecimal getCmDec02() {
		return this.cmDec02;
	}

	public void setCmDec02(BigDecimal cmDec02) {
		this.cmDec02 = cmDec02;
	}

	public Date getCmDte01() {
		return this.cmDte01;
	}

	public void setCmDte01(Date cmDte01) {
		this.cmDte01 = cmDte01;
	}

	public Date getCmDte02() {
		return this.cmDte02;
	}

	public void setCmDte02(Date cmDte02) {
		this.cmDte02 = cmDte02;
	}

	public boolean getCmLog01() {
		return this.cmLog01;
	}

	public void setCmLog01(boolean cmLog01) {
		this.cmLog01 = cmLog01;
	}

	public String getCmQad04() {
		return this.cmQad04;
	}

	public void setCmQad04(String cmQad04) {
		this.cmQad04 = cmQad04;
	}

	public boolean getCmQad06() {
		return this.cmQad06;
	}

	public void setCmQad06(boolean cmQad06) {
		this.cmQad06 = cmQad06;
	}

	public String getCmQadc01() {
		return this.cmQadc01;
	}

	public void setCmQadc01(String cmQadc01) {
		this.cmQadc01 = cmQadc01;
	}

	public String getCmQadc02() {
		return this.cmQadc02;
	}

	public void setCmQadc02(String cmQadc02) {
		this.cmQadc02 = cmQadc02;
	}

	public String getCmQadc03() {
		return this.cmQadc03;
	}

	public void setCmQadc03(String cmQadc03) {
		this.cmQadc03 = cmQadc03;
	}

	public String getCmQadc04() {
		return this.cmQadc04;
	}

	public void setCmQadc04(String cmQadc04) {
		this.cmQadc04 = cmQadc04;
	}

	public String getCmQadc05() {
		return this.cmQadc05;
	}

	public void setCmQadc05(String cmQadc05) {
		this.cmQadc05 = cmQadc05;
	}

	public String getCmQadc06() {
		return this.cmQadc06;
	}

	public void setCmQadc06(String cmQadc06) {
		this.cmQadc06 = cmQadc06;
	}

	public String getCmQadc07() {
		return this.cmQadc07;
	}

	public void setCmQadc07(String cmQadc07) {
		this.cmQadc07 = cmQadc07;
	}

	public BigDecimal getCmQadd01() {
		return this.cmQadd01;
	}

	public void setCmQadd01(BigDecimal cmQadd01) {
		this.cmQadd01 = cmQadd01;
	}

	public BigDecimal getCmQadd02() {
		return this.cmQadd02;
	}

	public void setCmQadd02(BigDecimal cmQadd02) {
		this.cmQadd02 = cmQadd02;
	}

	public int getCmQadi01() {
		return this.cmQadi01;
	}

	public void setCmQadi01(int cmQadi01) {
		this.cmQadi01 = cmQadi01;
	}

	public int getCmQadi02() {
		return this.cmQadi02;
	}

	public void setCmQadi02(int cmQadi02) {
		this.cmQadi02 = cmQadi02;
	}

	public int getCmQadi03() {
		return this.cmQadi03;
	}

	public void setCmQadi03(int cmQadi03) {
		this.cmQadi03 = cmQadi03;
	}

	public int getCmQadi04() {
		return this.cmQadi04;
	}

	public void setCmQadi04(int cmQadi04) {
		this.cmQadi04 = cmQadi04;
	}

	public boolean getCmQadl01() {
		return this.cmQadl01;
	}

	public void setCmQadl01(boolean cmQadl01) {
		this.cmQadl01 = cmQadl01;
	}

	public boolean getCmQadl02() {
		return this.cmQadl02;
	}

	public void setCmQadl02(boolean cmQadl02) {
		this.cmQadl02 = cmQadl02;
	}

	public boolean getCmQadl03() {
		return this.cmQadl03;
	}

	public void setCmQadl03(boolean cmQadl03) {
		this.cmQadl03 = cmQadl03;
	}

	public boolean getCmQadl04() {
		return this.cmQadl04;
	}

	public void setCmQadl04(boolean cmQadl04) {
		this.cmQadl04 = cmQadl04;
	}

	public Date getCmQadt01() {
		return this.cmQadt01;
	}

	public void setCmQadt01(Date cmQadt01) {
		this.cmQadt01 = cmQadt01;
	}

	public Date getCmQadt02() {
		return this.cmQadt02;
	}

	public void setCmQadt02(Date cmQadt02) {
		this.cmQadt02 = cmQadt02;
	}

	public String getCmArAcct() {
		return this.cmArAcct;
	}

	public void setCmArAcct(String cmArAcct) {
		this.cmArAcct = cmArAcct;
	}

	public String getCmArCc() {
		return this.cmArCc;
	}

	public void setCmArCc(String cmArCc) {
		this.cmArCc = cmArCc;
	}

	public String getCmArSub() {
		return this.cmArSub;
	}

	public void setCmArSub(String cmArSub) {
		this.cmArSub = cmArSub;
	}

	public int getCmAvgPay() {
		return this.cmAvgPay;
	}

	public void setCmAvgPay(int cmAvgPay) {
		this.cmAvgPay = cmAvgPay;
	}

	public BigDecimal getCmBalance() {
		return this.cmBalance;
	}

	public void setCmBalance(BigDecimal cmBalance) {
		this.cmBalance = cmBalance;
	}

	public String getCmBank() {
		return this.cmBank;
	}

	public void setCmBank(String cmBank) {
		this.cmBank = cmBank;
	}

	public String getCmBill() {
		return this.cmBill;
	}

	public void setCmBill(String cmBill) {
		this.cmBill = cmBill;
	}

	public boolean getCmBtbCr() {
		return this.cmBtbCr;
	}

	public void setCmBtbCr(boolean cmBtbCr) {
		this.cmBtbCr = cmBtbCr;
	}

	public boolean getCmBtbMthd() {
		return this.cmBtbMthd;
	}

	public void setCmBtbMthd(boolean cmBtbMthd) {
		this.cmBtbMthd = cmBtbMthd;
	}

	public String getCmBtbType() {
		return this.cmBtbType;
	}

	public void setCmBtbType(String cmBtbType) {
		this.cmBtbType = cmBtbType;
	}

	public String getCmClass() {
		return this.cmClass;
	}

	public void setCmClass(String cmClass) {
		this.cmClass = cmClass;
	}

	public String getCmCollMthd() {
		return this.cmCollMthd;
	}

	public void setCmCollMthd(String cmCollMthd) {
		this.cmCollMthd = cmCollMthd;
	}

	public String getCmConrepLogic() {
		return this.cmConrepLogic;
	}

	public void setCmConrepLogic(String cmConrepLogic) {
		this.cmConrepLogic = cmConrepLogic;
	}

	public boolean getCmCrHold() {
		return this.cmCrHold;
	}

	public void setCmCrHold(boolean cmCrHold) {
		this.cmCrHold = cmCrHold;
	}

	public BigDecimal getCmCrLimit() {
		return this.cmCrLimit;
	}

	public void setCmCrLimit(BigDecimal cmCrLimit) {
		this.cmCrLimit = cmCrLimit;
	}

	public String getCmCrRating() {
		return this.cmCrRating;
	}

	public void setCmCrRating(String cmCrRating) {
		this.cmCrRating = cmCrRating;
	}

	public Date getCmCrReview() {
		return this.cmCrReview;
	}

	public void setCmCrReview(Date cmCrReview) {
		this.cmCrReview = cmCrReview;
	}

	public String getCmCrTerms() {
		return this.cmCrTerms;
	}

	public void setCmCrTerms(String cmCrTerms) {
		this.cmCrTerms = cmCrTerms;
	}

	public Date getCmCrUpdate() {
		return this.cmCrUpdate;
	}

	public void setCmCrUpdate(Date cmCrUpdate) {
		this.cmCrUpdate = cmCrUpdate;
	}

	public String getCmCurr() {
		return this.cmCurr;
	}

	public void setCmCurr(String cmCurr) {
		this.cmCurr = cmCurr;
	}

	public String getCmDb() {
		return this.cmDb;
	}

	public void setCmDb(String cmDb) {
		this.cmDb = cmDb;
	}

	public String getCmDiscComb() {
		return this.cmDiscComb;
	}

	public void setCmDiscComb(String cmDiscComb) {
		this.cmDiscComb = cmDiscComb;
	}

	public BigDecimal getCmDiscPct() {
		return this.cmDiscPct;
	}

	public void setCmDiscPct(BigDecimal cmDiscPct) {
		this.cmDiscPct = cmDiscPct;
	}

	public boolean getCmDrftApv() {
		return this.cmDrftApv;
	}

	public void setCmDrftApv(boolean cmDrftApv) {
		this.cmDrftApv = cmDrftApv;
	}

	public BigDecimal getCmDrftBal() {
		return this.cmDrftBal;
	}

	public void setCmDrftBal(BigDecimal cmDrftBal) {
		this.cmDrftBal = cmDrftBal;
	}

	public boolean getCmDrftDisc() {
		return this.cmDrftDisc;
	}

	public void setCmDrftDisc(boolean cmDrftDisc) {
		this.cmDrftDisc = cmDrftDisc;
	}

	public BigDecimal getCmDrftMax() {
		return this.cmDrftMax;
	}

	public void setCmDrftMax(BigDecimal cmDrftMax) {
		this.cmDrftMax = cmDrftMax;
	}

	public BigDecimal getCmDrftMin() {
		return this.cmDrftMin;
	}

	public void setCmDrftMin(BigDecimal cmDrftMin) {
		this.cmDrftMin = cmDrftMin;
	}

	public boolean getCmDun() {
		return this.cmDun;
	}

	public void setCmDun(boolean cmDun) {
		this.cmDun = cmDun;
	}

	public String getCmExRatetype() {
		return this.cmExRatetype;
	}

	public void setCmExRatetype(String cmExRatetype) {
		this.cmExRatetype = cmExRatetype;
	}

	public boolean getCmFin() {
		return this.cmFin;
	}

	public void setCmFin(boolean cmFin) {
		this.cmFin = cmFin;
	}

	public Date getCmFinDate() {
		return this.cmFinDate;
	}

	public void setCmFinDate(Date cmFinDate) {
		this.cmFinDate = cmFinDate;
	}

	public boolean getCmFixPr() {
		return this.cmFixPr;
	}

	public void setCmFixPr(boolean cmFixPr) {
		this.cmFixPr = cmFixPr;
	}

	public String getCmFrList() {
		return this.cmFrList;
	}

	public void setCmFrList(String cmFrList) {
		this.cmFrList = cmFrList;
	}

	public BigDecimal getCmFrMinWt() {
		return this.cmFrMinWt;
	}

	public void setCmFrMinWt(BigDecimal cmFrMinWt) {
		this.cmFrMinWt = cmFrMinWt;
	}

	public String getCmFrTerms() {
		return this.cmFrTerms;
	}

	public void setCmFrTerms(String cmFrTerms) {
		this.cmFrTerms = cmFrTerms;
	}

	public String getCmFstId() {
		return this.cmFstId;
	}

	public void setCmFstId(String cmFstId) {
		this.cmFstId = cmFstId;
	}

	public BigDecimal getCmHighCr() {
		return this.cmHighCr;
	}

	public void setCmHighCr(BigDecimal cmHighCr) {
		this.cmHighCr = cmHighCr;
	}

	public Date getCmHighDate() {
		return this.cmHighDate;
	}

	public void setCmHighDate(Date cmHighDate) {
		this.cmHighDate = cmHighDate;
	}

	public boolean getCmInternal() {
		return this.cmInternal;
	}

	public void setCmInternal(boolean cmInternal) {
		this.cmInternal = cmInternal;
	}

	public int getCmInvoices() {
		return this.cmInvoices;
	}

	public void setCmInvoices(int cmInvoices) {
		this.cmInvoices = cmInvoices;
	}

	public String getCmLang() {
		return this.cmLang;
	}

	public void setCmLang(String cmLang) {
		this.cmLang = cmLang;
	}

	public BigDecimal getCmLcBal() {
		return this.cmLcBal;
	}

	public void setCmLcBal(BigDecimal cmLcBal) {
		this.cmLcBal = cmLcBal;
	}

	public Date getCmModDate() {
		return this.cmModDate;
	}

	public void setCmModDate(Date cmModDate) {
		this.cmModDate = cmModDate;
	}

	public boolean getCmPartial() {
		return this.cmPartial;
	}

	public void setCmPartial(boolean cmPartial) {
		this.cmPartial = cmPartial;
	}

	public Date getCmPayDate() {
		return this.cmPayDate;
	}

	public void setCmPayDate(Date cmPayDate) {
		this.cmPayDate = cmPayDate;
	}

	public String getCmPayMethod() {
		return this.cmPayMethod;
	}

	public void setCmPayMethod(String cmPayMethod) {
		this.cmPayMethod = cmPayMethod;
	}

	public boolean getCmPoReqd() {
		return this.cmPoReqd;
	}

	public void setCmPoReqd(boolean cmPoReqd) {
		this.cmPoReqd = cmPoReqd;
	}

	public String getCmPrList() {
		return this.cmPrList;
	}

	public void setCmPrList(String cmPrList) {
		this.cmPrList = cmPrList;
	}

	public String getCmPrList2() {
		return this.cmPrList2;
	}

	public void setCmPrList2(String cmPrList2) {
		this.cmPrList2 = cmPrList2;
	}

	public String getCmPromo() {
		return this.cmPromo;
	}

	public void setCmPromo(String cmPromo) {
		this.cmPromo = cmPromo;
	}

	public boolean getCmPst() {
		return this.cmPst;
	}

	public void setCmPst(boolean cmPst) {
		this.cmPst = cmPst;
	}

	public String getCmPstId() {
		return this.cmPstId;
	}

	public void setCmPstId(String cmPstId) {
		this.cmPstId = cmPstId;
	}

	public String getCmRegion() {
		return this.cmRegion;
	}

	public void setCmRegion(String cmRegion) {
		this.cmRegion = cmRegion;
	}

	public String getCmResale() {
		return this.cmResale;
	}

	public void setCmResale(String cmResale) {
		this.cmResale = cmResale;
	}

	public String getCmRmks() {
		return this.cmRmks;
	}

	public void setCmRmks(String cmRmks) {
		this.cmRmks = cmRmks;
	}

	public Date getCmSaleDate() {
		return this.cmSaleDate;
	}

	public void setCmSaleDate(Date cmSaleDate) {
		this.cmSaleDate = cmSaleDate;
	}

	public String getCmScurr() {
		return this.cmScurr;
	}

	public void setCmScurr(String cmScurr) {
		this.cmScurr = cmScurr;
	}

	public String getCmServTerms() {
		return this.cmServTerms;
	}

	public void setCmServTerms(String cmServTerms) {
		this.cmServTerms = cmServTerms;
	}

	public String getCmShip() {
		return this.cmShip;
	}

	public void setCmShip(String cmShip) {
		this.cmShip = cmShip;
	}

	public int getCmShipLt() {
		return this.cmShipLt;
	}

	public void setCmShipLt(int cmShipLt) {
		this.cmShipLt = cmShipLt;
	}

	public String getCmShipvia() {
		return this.cmShipvia;
	}

	public void setCmShipvia(String cmShipvia) {
		this.cmShipvia = cmShipvia;
	}

	public String getCmSic() {
		return this.cmSic;
	}

	public void setCmSic(String cmSic) {
		this.cmSic = cmSic;
	}

	public String getCmSite() {
		return this.cmSite;
	}

	public void setCmSite(String cmSite) {
		this.cmSite = cmSite;
	}

	public String getCmSlspsn() {
		return this.cmSlspsn;
	}

	public void setCmSlspsn(String cmSlspsn) {
		this.cmSlspsn = cmSlspsn;
	}

	public String getCmSort() {
		return this.cmSort;
	}

	public void setCmSort(String cmSort) {
		this.cmSort = cmSort;
	}

	public boolean getCmStmt() {
		return this.cmStmt;
	}

	public void setCmStmt(boolean cmStmt) {
		this.cmStmt = cmStmt;
	}

	public String getCmStmtCyc() {
		return this.cmStmtCyc;
	}

	public void setCmStmtCyc(String cmStmtCyc) {
		this.cmStmtCyc = cmStmtCyc;
	}

	public boolean getCmSubmitProp() {
		return this.cmSubmitProp;
	}

	public void setCmSubmitProp(boolean cmSubmitProp) {
		this.cmSubmitProp = cmSubmitProp;
	}

	public String getCmSvcList() {
		return this.cmSvcList;
	}

	public void setCmSvcList(String cmSvcList) {
		this.cmSvcList = cmSvcList;
	}

	public boolean getCmTaxIn() {
		return this.cmTaxIn;
	}

	public void setCmTaxIn(boolean cmTaxIn) {
		this.cmTaxIn = cmTaxIn;
	}

	public boolean getCmTaxable() {
		return this.cmTaxable;
	}

	public void setCmTaxable(boolean cmTaxable) {
		this.cmTaxable = cmTaxable;
	}

	public String getCmTaxc() {
		return this.cmTaxc;
	}

	public void setCmTaxc(String cmTaxc) {
		this.cmTaxc = cmTaxc;
	}

	public String getCmType() {
		return this.cmType;
	}

	public void setCmType(String cmType) {
		this.cmType = cmType;
	}

	public String getCmUser1() {
		return this.cmUser1;
	}

	public void setCmUser1(String cmUser1) {
		this.cmUser1 = cmUser1;
	}

	public String getCmUser2() {
		return this.cmUser2;
	}

	public void setCmUser2(String cmUser2) {
		this.cmUser2 = cmUser2;
	}

	public String getCmUserid() {
		return this.cmUserid;
	}

	public void setCmUserid(String cmUserid) {
		this.cmUserid = cmUserid;
	}

	public String getCmXslspsn() {
		return this.cmXslspsn;
	}

	public void setCmXslspsn(String cmXslspsn) {
		this.cmXslspsn = cmXslspsn;
	}

	public String getCmXslspsn2() {
		return this.cmXslspsn2;
	}

	public void setCmXslspsn2(String cmXslspsn2) {
		this.cmXslspsn2 = cmXslspsn2;
	}

	public BigDecimal getOidCofidiCmMstr() {
		return this.oidCofidiCmMstr;
	}

	public void setOidCofidiCmMstr(BigDecimal oidCofidiCmMstr) {
		this.oidCofidiCmMstr = oidCofidiCmMstr;
	}

}