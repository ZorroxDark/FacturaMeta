package mx.com.mtlsa.billing.entity.openedge;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the "cofidi_ih_hist" database table.
 * 
 */
@Entity
@Table(name="cofidi_ih_hist")
@NamedQuery(name="CofidiIhHist.findAll", query="SELECT c FROM CofidiIhHist c")
public class CofidiIhHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CofidiIhHistPK id;

	@Column(name="ih__chr01")
	private String ihChr01;

	@Column(name="ih__chr02")
	private String ihChr02;

	@Column(name="ih__chr03")
	private String ihChr03;

	@Column(name="ih__chr04")
	private String ihChr04;

	@Column(name="ih__chr05")
	private String ihChr05;

	@Column(name="ih__chr06")
	private String ihChr06;

	@Column(name="ih__chr07")
	private String ihChr07;

	@Column(name="ih__chr08")
	private String ihChr08;

	@Column(name="ih__chr09")
	private String ihChr09;

	@Column(name="ih__chr10")
	private String ihChr10;

	@Column(name="ih__dec01")
	private BigDecimal ihDec01;

	@Column(name="ih__dec02")
	private BigDecimal ihDec02;

	@Temporal(TemporalType.DATE)
	@Column(name="ih__dte01")
	private Date ihDte01;

	@Temporal(TemporalType.DATE)
	@Column(name="ih__dte02")
	private Date ihDte02;

	@Column(name="ih__log01")
	private boolean ihLog01;

	@Column(name="ih__qad01")
	private BigDecimal ihQad01;

	@Column(name="ih__qad02")
	private BigDecimal ihQad02;

	@Column(name="ih__qad03")
	private BigDecimal ihQad03;

	@Column(name="ih__qad04")
	private int ihQad04;

	@Column(name="ih__qad05")
	private String ihQad05;

	@Column(name="ih__qadc01")
	private String ihQadc01;

	@Column(name="ih__qadc02")
	private String ihQadc02;

	@Column(name="ih__qadc03")
	private String ihQadc03;

	@Column(name="ih__qadc04")
	private String ihQadc04;

	@Column(name="ih__qadc05")
	private String ihQadc05;

	@Column(name="ih__qadd01")
	private BigDecimal ihQadd01;

	@Column(name="ih__qadd02")
	private BigDecimal ihQadd02;

	@Column(name="ih__qadd03")
	private BigDecimal ihQadd03;

	@Column(name="ih__qadi01")
	private int ihQadi01;

	@Column(name="ih__qadi02")
	private int ihQadi02;

	@Column(name="ih__qadi03")
	private int ihQadi03;

	@Column(name="ih__qadl01")
	private boolean ihQadl01;

	@Column(name="ih__qadl02")
	private boolean ihQadl02;

	@Column(name="ih__qadl03")
	private boolean ihQadl03;

	@Temporal(TemporalType.DATE)
	@Column(name="ih__qadt01")
	private Date ihQadt01;

	@Temporal(TemporalType.DATE)
	@Column(name="ih__qadt02")
	private Date ihQadt02;

	@Temporal(TemporalType.DATE)
	@Column(name="ih__qadt03")
	private Date ihQadt03;

	@Column(name="ih_ar_acct")
	private String ihArAcct;

	@Column(name="ih_ar_cc")
	private String ihArCc;

	@Column(name="ih_ar_sub")
	private String ihArSub;

	@Column(name="ih_bank")
	private String ihBank;

	@Column(name="ih_bill")
	private String ihBill;

	@Column(name="ih_bol")
	private String ihBol;

	@Column(name="ih_ca_nbr")
	private String ihCaNbr;

	@Column(name="ih_cartons")
	private int ihCartons;

	@Column(name="ih_channel")
	private String ihChannel;

	@Column(name="ih_cmtindx")
	private int ihCmtindx;

	@Temporal(TemporalType.DATE)
	@Column(name="ih_cncl_date")
	private Date ihCnclDate;

	@Column(name="ih_comm_pct")
	private String ihCommPct;

	@Temporal(TemporalType.DATE)
	@Column(name="ih_conf_date")
	private Date ihConfDate;

	@Column(name="ih_conrep")
	private String ihConrep;

	@Column(name="ih_cr_card")
	private String ihCrCard;

	@Column(name="ih_cr_init")
	private String ihCrInit;

	@Column(name="ih_cr_terms")
	private String ihCrTerms;

	@Column(name="ih_credit")
	private boolean ihCredit;

	@Column(name="ih_crprlist")
	private String ihCrprlist;

	@Column(name="ih_curr")
	private String ihCurr;

	@Column(name="ih_cust")
	private String ihCust;

	@Column(name="ih_cust_po")
	private String ihCustPo;

	@Column(name="ih_custref_val")
	private boolean ihCustrefVal;

	@Column(name="ih_disc_pct")
	private BigDecimal ihDiscPct;

	@Column(name="ih_div")
	private String ihDiv;

	@Temporal(TemporalType.DATE)
	@Column(name="ih_due_date")
	private Date ihDueDate;

	@Column(name="ih_ent_ex")
	private BigDecimal ihEntEx;

	@Column(name="ih_ex_rate")
	private BigDecimal ihExRate;

	@Column(name="ih_ex_rate2")
	private BigDecimal ihExRate2;

	@Column(name="ih_ex_ratetype")
	private String ihExRatetype;

	@Column(name="ih_export_batch")
	private int ihExportBatch;

	@Temporal(TemporalType.DATE)
	@Column(name="ih_export_date")
	private Date ihExportDate;

	@Column(name="ih_export_time")
	private int ihExportTime;

	@Column(name="ih_exru_seq")
	private int ihExruSeq;

	@Column(name="ih_fcg_code")
	private String ihFcgCode;

	@Column(name="ih_fix_pr")
	private boolean ihFixPr;

	@Column(name="ih_fix_rate")
	private boolean ihFixRate;

	@Column(name="ih_fob")
	private String ihFob;

	@Column(name="ih_fr_list")
	private String ihFrList;

	@Column(name="ih_fr_min_wt")
	private BigDecimal ihFrMinWt;

	@Column(name="ih_fr_terms")
	private String ihFrTerms;

	@Column(name="ih_fsm_type")
	private String ihFsmType;

	@Column(name="ih_fst_id")
	private String ihFstId;

	@Column(name="ih_inv_cr")
	private String ihInvCr;

	@Temporal(TemporalType.DATE)
	@Column(name="ih_inv_date")
	private Date ihInvDate;

	@Column(name="ih_inv_mthd")
	private String ihInvMthd;

	@Column(name="ih_invoiced")
	private boolean ihInvoiced;

	@Column(name="ih_lang")
	private String ihLang;

	@Temporal(TemporalType.DATE)
	@Column(name="ih_mod_date")
	private Date ihModDate;

	@Temporal(TemporalType.DATE)
	@Column(name="ih_ord_date")
	private Date ihOrdDate;

	@Column(name="ih_partial")
	private boolean ihPartial;

	@Column(name="ih_po")
	private String ihPo;

	@Column(name="ih_pr_list")
	private String ihPrList;

	@Column(name="ih_pr_list2")
	private String ihPrList2;

	@Column(name="ih_prep_tax")
	private BigDecimal ihPrepTax;

	@Column(name="ih_prepaid")
	private BigDecimal ihPrepaid;

	@Temporal(TemporalType.DATE)
	@Column(name="ih_priced_dt")
	private Date ihPricedDt;

	@Temporal(TemporalType.DATE)
	@Column(name="ih_pricing_dt")
	private Date ihPricingDt;

	@Column(name="ih_primary")
	private boolean ihPrimary;

	@Column(name="ih_print_bl")
	private boolean ihPrintBl;

	@Column(name="ih_print_pl")
	private boolean ihPrintPl;

	@Column(name="ih_print_so")
	private boolean ihPrintSo;

	@Column(name="ih_project")
	private String ihProject;

	@Column(name="ih_pst")
	private boolean ihPst;

	@Column(name="ih_pst_id")
	private String ihPstId;

	@Column(name="ih_pst_pct")
	private BigDecimal ihPstPct;

	@Column(name="ih_quote")
	private String ihQuote;

	@Temporal(TemporalType.DATE)
	@Column(name="ih_req_date")
	private Date ihReqDate;

	@Column(name="ih_rev")
	private int ihRev;

	@Column(name="ih_rmks")
	private String ihRmks;

	@Column(name="ih_rstk_pct")
	private BigDecimal ihRstkPct;

	@Column(name="ih_sa_nbr")
	private String ihSaNbr;

	@Column(name="ih_sch_mthd")
	private String ihSchMthd;

	@Column(name="ih_sched")
	private boolean ihSched;

	@Column(name="ih_secondary")
	private boolean ihSecondary;

	@Column(name="ih_ship")
	private String ihShip;

	@Temporal(TemporalType.DATE)
	@Column(name="ih_ship_date")
	private Date ihShipDate;

	@Column(name="ih_ship_eng")
	private boolean ihShipEng;

	@Column(name="ih_ship_po")
	private String ihShipPo;

	@Column(name="ih_shipvia")
	private String ihShipvia;

	@Column(name="ih_site")
	private String ihSite;

	@Column(name="ih_size")
	private BigDecimal ihSize;

	@Column(name="ih_size_um")
	private String ihSizeUm;

	@Column(name="ih_slspsn")
	private String ihSlspsn;

	@Column(name="ih_source")
	private String ihSource;

	@Column(name="ih_stat")
	private String ihStat;

	@Temporal(TemporalType.DATE)
	@Column(name="ih_tax_date")
	private Date ihTaxDate;

	@Column(name="ih_tax_env")
	private String ihTaxEnv;

	@Column(name="ih_tax_pct")
	private String ihTaxPct;

	@Column(name="ih_tax_usage")
	private String ihTaxUsage;

	@Column(name="ih_taxable")
	private boolean ihTaxable;

	@Column(name="ih_taxc")
	private String ihTaxc;

	@Column(name="ih_to_inv")
	private boolean ihToInv;

	@Column(name="ih_trl1_amt")
	private BigDecimal ihTrl1Amt;

	@Column(name="ih_trl1_cd")
	private String ihTrl1Cd;

	@Column(name="ih_trl2_amt")
	private BigDecimal ihTrl2Amt;

	@Column(name="ih_trl2_cd")
	private String ihTrl2Cd;

	@Column(name="ih_trl3_amt")
	private BigDecimal ihTrl3Amt;

	@Column(name="ih_trl3_cd")
	private String ihTrl3Cd;

	@Column(name="ih_type")
	private String ihType;

	@Column(name="ih_user1")
	private String ihUser1;

	@Column(name="ih_user2")
	private String ihUser2;

	@Column(name="ih_userid")
	private String ihUserid;

	@Column(name="ih_weight")
	private BigDecimal ihWeight;

	@Column(name="ih_weight_um")
	private String ihWeightUm;

	@Column(name="ih_xcomm_pct")
	private String ihXcommPct;

	@Column(name="ih_xslspsn")
	private String ihXslspsn;

	@Column(name="oid_cofidi_ih_hist")
	private BigDecimal oidCofidiIhHist;

	public CofidiIhHist() {
	}

	public CofidiIhHistPK getId() {
		return this.id;
	}

	public void setId(CofidiIhHistPK id) {
		this.id = id;
	}

	public String getIhChr01() {
		return this.ihChr01;
	}

	public void setIhChr01(String ihChr01) {
		this.ihChr01 = ihChr01;
	}

	public String getIhChr02() {
		return this.ihChr02;
	}

	public void setIhChr02(String ihChr02) {
		this.ihChr02 = ihChr02;
	}

	public String getIhChr03() {
		return this.ihChr03;
	}

	public void setIhChr03(String ihChr03) {
		this.ihChr03 = ihChr03;
	}

	public String getIhChr04() {
		return this.ihChr04;
	}

	public void setIhChr04(String ihChr04) {
		this.ihChr04 = ihChr04;
	}

	public String getIhChr05() {
		return this.ihChr05;
	}

	public void setIhChr05(String ihChr05) {
		this.ihChr05 = ihChr05;
	}

	public String getIhChr06() {
		return this.ihChr06;
	}

	public void setIhChr06(String ihChr06) {
		this.ihChr06 = ihChr06;
	}

	public String getIhChr07() {
		return this.ihChr07;
	}

	public void setIhChr07(String ihChr07) {
		this.ihChr07 = ihChr07;
	}

	public String getIhChr08() {
		return this.ihChr08;
	}

	public void setIhChr08(String ihChr08) {
		this.ihChr08 = ihChr08;
	}

	public String getIhChr09() {
		return this.ihChr09;
	}

	public void setIhChr09(String ihChr09) {
		this.ihChr09 = ihChr09;
	}

	public String getIhChr10() {
		return this.ihChr10;
	}

	public void setIhChr10(String ihChr10) {
		this.ihChr10 = ihChr10;
	}

	public BigDecimal getIhDec01() {
		return this.ihDec01;
	}

	public void setIhDec01(BigDecimal ihDec01) {
		this.ihDec01 = ihDec01;
	}

	public BigDecimal getIhDec02() {
		return this.ihDec02;
	}

	public void setIhDec02(BigDecimal ihDec02) {
		this.ihDec02 = ihDec02;
	}

	public Date getIhDte01() {
		return this.ihDte01;
	}

	public void setIhDte01(Date ihDte01) {
		this.ihDte01 = ihDte01;
	}

	public Date getIhDte02() {
		return this.ihDte02;
	}

	public void setIhDte02(Date ihDte02) {
		this.ihDte02 = ihDte02;
	}

	public boolean getIhLog01() {
		return this.ihLog01;
	}

	public void setIhLog01(boolean ihLog01) {
		this.ihLog01 = ihLog01;
	}

	public BigDecimal getIhQad01() {
		return this.ihQad01;
	}

	public void setIhQad01(BigDecimal ihQad01) {
		this.ihQad01 = ihQad01;
	}

	public BigDecimal getIhQad02() {
		return this.ihQad02;
	}

	public void setIhQad02(BigDecimal ihQad02) {
		this.ihQad02 = ihQad02;
	}

	public BigDecimal getIhQad03() {
		return this.ihQad03;
	}

	public void setIhQad03(BigDecimal ihQad03) {
		this.ihQad03 = ihQad03;
	}

	public int getIhQad04() {
		return this.ihQad04;
	}

	public void setIhQad04(int ihQad04) {
		this.ihQad04 = ihQad04;
	}

	public String getIhQad05() {
		return this.ihQad05;
	}

	public void setIhQad05(String ihQad05) {
		this.ihQad05 = ihQad05;
	}

	public String getIhQadc01() {
		return this.ihQadc01;
	}

	public void setIhQadc01(String ihQadc01) {
		this.ihQadc01 = ihQadc01;
	}

	public String getIhQadc02() {
		return this.ihQadc02;
	}

	public void setIhQadc02(String ihQadc02) {
		this.ihQadc02 = ihQadc02;
	}

	public String getIhQadc03() {
		return this.ihQadc03;
	}

	public void setIhQadc03(String ihQadc03) {
		this.ihQadc03 = ihQadc03;
	}

	public String getIhQadc04() {
		return this.ihQadc04;
	}

	public void setIhQadc04(String ihQadc04) {
		this.ihQadc04 = ihQadc04;
	}

	public String getIhQadc05() {
		return this.ihQadc05;
	}

	public void setIhQadc05(String ihQadc05) {
		this.ihQadc05 = ihQadc05;
	}

	public BigDecimal getIhQadd01() {
		return this.ihQadd01;
	}

	public void setIhQadd01(BigDecimal ihQadd01) {
		this.ihQadd01 = ihQadd01;
	}

	public BigDecimal getIhQadd02() {
		return this.ihQadd02;
	}

	public void setIhQadd02(BigDecimal ihQadd02) {
		this.ihQadd02 = ihQadd02;
	}

	public BigDecimal getIhQadd03() {
		return this.ihQadd03;
	}

	public void setIhQadd03(BigDecimal ihQadd03) {
		this.ihQadd03 = ihQadd03;
	}

	public int getIhQadi01() {
		return this.ihQadi01;
	}

	public void setIhQadi01(int ihQadi01) {
		this.ihQadi01 = ihQadi01;
	}

	public int getIhQadi02() {
		return this.ihQadi02;
	}

	public void setIhQadi02(int ihQadi02) {
		this.ihQadi02 = ihQadi02;
	}

	public int getIhQadi03() {
		return this.ihQadi03;
	}

	public void setIhQadi03(int ihQadi03) {
		this.ihQadi03 = ihQadi03;
	}

	public boolean getIhQadl01() {
		return this.ihQadl01;
	}

	public void setIhQadl01(boolean ihQadl01) {
		this.ihQadl01 = ihQadl01;
	}

	public boolean getIhQadl02() {
		return this.ihQadl02;
	}

	public void setIhQadl02(boolean ihQadl02) {
		this.ihQadl02 = ihQadl02;
	}

	public boolean getIhQadl03() {
		return this.ihQadl03;
	}

	public void setIhQadl03(boolean ihQadl03) {
		this.ihQadl03 = ihQadl03;
	}

	public Date getIhQadt01() {
		return this.ihQadt01;
	}

	public void setIhQadt01(Date ihQadt01) {
		this.ihQadt01 = ihQadt01;
	}

	public Date getIhQadt02() {
		return this.ihQadt02;
	}

	public void setIhQadt02(Date ihQadt02) {
		this.ihQadt02 = ihQadt02;
	}

	public Date getIhQadt03() {
		return this.ihQadt03;
	}

	public void setIhQadt03(Date ihQadt03) {
		this.ihQadt03 = ihQadt03;
	}

	public String getIhArAcct() {
		return this.ihArAcct;
	}

	public void setIhArAcct(String ihArAcct) {
		this.ihArAcct = ihArAcct;
	}

	public String getIhArCc() {
		return this.ihArCc;
	}

	public void setIhArCc(String ihArCc) {
		this.ihArCc = ihArCc;
	}

	public String getIhArSub() {
		return this.ihArSub;
	}

	public void setIhArSub(String ihArSub) {
		this.ihArSub = ihArSub;
	}

	public String getIhBank() {
		return this.ihBank;
	}

	public void setIhBank(String ihBank) {
		this.ihBank = ihBank;
	}

	public String getIhBill() {
		return this.ihBill;
	}

	public void setIhBill(String ihBill) {
		this.ihBill = ihBill;
	}

	public String getIhBol() {
		return this.ihBol;
	}

	public void setIhBol(String ihBol) {
		this.ihBol = ihBol;
	}

	public String getIhCaNbr() {
		return this.ihCaNbr;
	}

	public void setIhCaNbr(String ihCaNbr) {
		this.ihCaNbr = ihCaNbr;
	}

	public int getIhCartons() {
		return this.ihCartons;
	}

	public void setIhCartons(int ihCartons) {
		this.ihCartons = ihCartons;
	}

	public String getIhChannel() {
		return this.ihChannel;
	}

	public void setIhChannel(String ihChannel) {
		this.ihChannel = ihChannel;
	}

	public int getIhCmtindx() {
		return this.ihCmtindx;
	}

	public void setIhCmtindx(int ihCmtindx) {
		this.ihCmtindx = ihCmtindx;
	}

	public Date getIhCnclDate() {
		return this.ihCnclDate;
	}

	public void setIhCnclDate(Date ihCnclDate) {
		this.ihCnclDate = ihCnclDate;
	}

	public String getIhCommPct() {
		return this.ihCommPct;
	}

	public void setIhCommPct(String ihCommPct) {
		this.ihCommPct = ihCommPct;
	}

	public Date getIhConfDate() {
		return this.ihConfDate;
	}

	public void setIhConfDate(Date ihConfDate) {
		this.ihConfDate = ihConfDate;
	}

	public String getIhConrep() {
		return this.ihConrep;
	}

	public void setIhConrep(String ihConrep) {
		this.ihConrep = ihConrep;
	}

	public String getIhCrCard() {
		return this.ihCrCard;
	}

	public void setIhCrCard(String ihCrCard) {
		this.ihCrCard = ihCrCard;
	}

	public String getIhCrInit() {
		return this.ihCrInit;
	}

	public void setIhCrInit(String ihCrInit) {
		this.ihCrInit = ihCrInit;
	}

	public String getIhCrTerms() {
		return this.ihCrTerms;
	}

	public void setIhCrTerms(String ihCrTerms) {
		this.ihCrTerms = ihCrTerms;
	}

	public boolean getIhCredit() {
		return this.ihCredit;
	}

	public void setIhCredit(boolean ihCredit) {
		this.ihCredit = ihCredit;
	}

	public String getIhCrprlist() {
		return this.ihCrprlist;
	}

	public void setIhCrprlist(String ihCrprlist) {
		this.ihCrprlist = ihCrprlist;
	}

	public String getIhCurr() {
		return this.ihCurr;
	}

	public void setIhCurr(String ihCurr) {
		this.ihCurr = ihCurr;
	}

	public String getIhCust() {
		return this.ihCust;
	}

	public void setIhCust(String ihCust) {
		this.ihCust = ihCust;
	}

	public String getIhCustPo() {
		return this.ihCustPo;
	}

	public void setIhCustPo(String ihCustPo) {
		this.ihCustPo = ihCustPo;
	}

	public boolean getIhCustrefVal() {
		return this.ihCustrefVal;
	}

	public void setIhCustrefVal(boolean ihCustrefVal) {
		this.ihCustrefVal = ihCustrefVal;
	}

	public BigDecimal getIhDiscPct() {
		return this.ihDiscPct;
	}

	public void setIhDiscPct(BigDecimal ihDiscPct) {
		this.ihDiscPct = ihDiscPct;
	}

	public String getIhDiv() {
		return this.ihDiv;
	}

	public void setIhDiv(String ihDiv) {
		this.ihDiv = ihDiv;
	}

	public Date getIhDueDate() {
		return this.ihDueDate;
	}

	public void setIhDueDate(Date ihDueDate) {
		this.ihDueDate = ihDueDate;
	}

	public BigDecimal getIhEntEx() {
		return this.ihEntEx;
	}

	public void setIhEntEx(BigDecimal ihEntEx) {
		this.ihEntEx = ihEntEx;
	}

	public BigDecimal getIhExRate() {
		return this.ihExRate;
	}

	public void setIhExRate(BigDecimal ihExRate) {
		this.ihExRate = ihExRate;
	}

	public BigDecimal getIhExRate2() {
		return this.ihExRate2;
	}

	public void setIhExRate2(BigDecimal ihExRate2) {
		this.ihExRate2 = ihExRate2;
	}

	public String getIhExRatetype() {
		return this.ihExRatetype;
	}

	public void setIhExRatetype(String ihExRatetype) {
		this.ihExRatetype = ihExRatetype;
	}

	public int getIhExportBatch() {
		return this.ihExportBatch;
	}

	public void setIhExportBatch(int ihExportBatch) {
		this.ihExportBatch = ihExportBatch;
	}

	public Date getIhExportDate() {
		return this.ihExportDate;
	}

	public void setIhExportDate(Date ihExportDate) {
		this.ihExportDate = ihExportDate;
	}

	public int getIhExportTime() {
		return this.ihExportTime;
	}

	public void setIhExportTime(int ihExportTime) {
		this.ihExportTime = ihExportTime;
	}

	public int getIhExruSeq() {
		return this.ihExruSeq;
	}

	public void setIhExruSeq(int ihExruSeq) {
		this.ihExruSeq = ihExruSeq;
	}

	public String getIhFcgCode() {
		return this.ihFcgCode;
	}

	public void setIhFcgCode(String ihFcgCode) {
		this.ihFcgCode = ihFcgCode;
	}

	public boolean getIhFixPr() {
		return this.ihFixPr;
	}

	public void setIhFixPr(boolean ihFixPr) {
		this.ihFixPr = ihFixPr;
	}

	public boolean getIhFixRate() {
		return this.ihFixRate;
	}

	public void setIhFixRate(boolean ihFixRate) {
		this.ihFixRate = ihFixRate;
	}

	public String getIhFob() {
		return this.ihFob;
	}

	public void setIhFob(String ihFob) {
		this.ihFob = ihFob;
	}

	public String getIhFrList() {
		return this.ihFrList;
	}

	public void setIhFrList(String ihFrList) {
		this.ihFrList = ihFrList;
	}

	public BigDecimal getIhFrMinWt() {
		return this.ihFrMinWt;
	}

	public void setIhFrMinWt(BigDecimal ihFrMinWt) {
		this.ihFrMinWt = ihFrMinWt;
	}

	public String getIhFrTerms() {
		return this.ihFrTerms;
	}

	public void setIhFrTerms(String ihFrTerms) {
		this.ihFrTerms = ihFrTerms;
	}

	public String getIhFsmType() {
		return this.ihFsmType;
	}

	public void setIhFsmType(String ihFsmType) {
		this.ihFsmType = ihFsmType;
	}

	public String getIhFstId() {
		return this.ihFstId;
	}

	public void setIhFstId(String ihFstId) {
		this.ihFstId = ihFstId;
	}

	public String getIhInvCr() {
		return this.ihInvCr;
	}

	public void setIhInvCr(String ihInvCr) {
		this.ihInvCr = ihInvCr;
	}

	public Date getIhInvDate() {
		return this.ihInvDate;
	}

	public void setIhInvDate(Date ihInvDate) {
		this.ihInvDate = ihInvDate;
	}

	public String getIhInvMthd() {
		return this.ihInvMthd;
	}

	public void setIhInvMthd(String ihInvMthd) {
		this.ihInvMthd = ihInvMthd;
	}

	public boolean getIhInvoiced() {
		return this.ihInvoiced;
	}

	public void setIhInvoiced(boolean ihInvoiced) {
		this.ihInvoiced = ihInvoiced;
	}

	public String getIhLang() {
		return this.ihLang;
	}

	public void setIhLang(String ihLang) {
		this.ihLang = ihLang;
	}

	public Date getIhModDate() {
		return this.ihModDate;
	}

	public void setIhModDate(Date ihModDate) {
		this.ihModDate = ihModDate;
	}

	public Date getIhOrdDate() {
		return this.ihOrdDate;
	}

	public void setIhOrdDate(Date ihOrdDate) {
		this.ihOrdDate = ihOrdDate;
	}

	public boolean getIhPartial() {
		return this.ihPartial;
	}

	public void setIhPartial(boolean ihPartial) {
		this.ihPartial = ihPartial;
	}

	public String getIhPo() {
		return this.ihPo;
	}

	public void setIhPo(String ihPo) {
		this.ihPo = ihPo;
	}

	public String getIhPrList() {
		return this.ihPrList;
	}

	public void setIhPrList(String ihPrList) {
		this.ihPrList = ihPrList;
	}

	public String getIhPrList2() {
		return this.ihPrList2;
	}

	public void setIhPrList2(String ihPrList2) {
		this.ihPrList2 = ihPrList2;
	}

	public BigDecimal getIhPrepTax() {
		return this.ihPrepTax;
	}

	public void setIhPrepTax(BigDecimal ihPrepTax) {
		this.ihPrepTax = ihPrepTax;
	}

	public BigDecimal getIhPrepaid() {
		return this.ihPrepaid;
	}

	public void setIhPrepaid(BigDecimal ihPrepaid) {
		this.ihPrepaid = ihPrepaid;
	}

	public Date getIhPricedDt() {
		return this.ihPricedDt;
	}

	public void setIhPricedDt(Date ihPricedDt) {
		this.ihPricedDt = ihPricedDt;
	}

	public Date getIhPricingDt() {
		return this.ihPricingDt;
	}

	public void setIhPricingDt(Date ihPricingDt) {
		this.ihPricingDt = ihPricingDt;
	}

	public boolean getIhPrimary() {
		return this.ihPrimary;
	}

	public void setIhPrimary(boolean ihPrimary) {
		this.ihPrimary = ihPrimary;
	}

	public boolean getIhPrintBl() {
		return this.ihPrintBl;
	}

	public void setIhPrintBl(boolean ihPrintBl) {
		this.ihPrintBl = ihPrintBl;
	}

	public boolean getIhPrintPl() {
		return this.ihPrintPl;
	}

	public void setIhPrintPl(boolean ihPrintPl) {
		this.ihPrintPl = ihPrintPl;
	}

	public boolean getIhPrintSo() {
		return this.ihPrintSo;
	}

	public void setIhPrintSo(boolean ihPrintSo) {
		this.ihPrintSo = ihPrintSo;
	}

	public String getIhProject() {
		return this.ihProject;
	}

	public void setIhProject(String ihProject) {
		this.ihProject = ihProject;
	}

	public boolean getIhPst() {
		return this.ihPst;
	}

	public void setIhPst(boolean ihPst) {
		this.ihPst = ihPst;
	}

	public String getIhPstId() {
		return this.ihPstId;
	}

	public void setIhPstId(String ihPstId) {
		this.ihPstId = ihPstId;
	}

	public BigDecimal getIhPstPct() {
		return this.ihPstPct;
	}

	public void setIhPstPct(BigDecimal ihPstPct) {
		this.ihPstPct = ihPstPct;
	}

	public String getIhQuote() {
		return this.ihQuote;
	}

	public void setIhQuote(String ihQuote) {
		this.ihQuote = ihQuote;
	}

	public Date getIhReqDate() {
		return this.ihReqDate;
	}

	public void setIhReqDate(Date ihReqDate) {
		this.ihReqDate = ihReqDate;
	}

	public int getIhRev() {
		return this.ihRev;
	}

	public void setIhRev(int ihRev) {
		this.ihRev = ihRev;
	}

	public String getIhRmks() {
		return this.ihRmks;
	}

	public void setIhRmks(String ihRmks) {
		this.ihRmks = ihRmks;
	}

	public BigDecimal getIhRstkPct() {
		return this.ihRstkPct;
	}

	public void setIhRstkPct(BigDecimal ihRstkPct) {
		this.ihRstkPct = ihRstkPct;
	}

	public String getIhSaNbr() {
		return this.ihSaNbr;
	}

	public void setIhSaNbr(String ihSaNbr) {
		this.ihSaNbr = ihSaNbr;
	}

	public String getIhSchMthd() {
		return this.ihSchMthd;
	}

	public void setIhSchMthd(String ihSchMthd) {
		this.ihSchMthd = ihSchMthd;
	}

	public boolean getIhSched() {
		return this.ihSched;
	}

	public void setIhSched(boolean ihSched) {
		this.ihSched = ihSched;
	}

	public boolean getIhSecondary() {
		return this.ihSecondary;
	}

	public void setIhSecondary(boolean ihSecondary) {
		this.ihSecondary = ihSecondary;
	}

	public String getIhShip() {
		return this.ihShip;
	}

	public void setIhShip(String ihShip) {
		this.ihShip = ihShip;
	}

	public Date getIhShipDate() {
		return this.ihShipDate;
	}

	public void setIhShipDate(Date ihShipDate) {
		this.ihShipDate = ihShipDate;
	}

	public boolean getIhShipEng() {
		return this.ihShipEng;
	}

	public void setIhShipEng(boolean ihShipEng) {
		this.ihShipEng = ihShipEng;
	}

	public String getIhShipPo() {
		return this.ihShipPo;
	}

	public void setIhShipPo(String ihShipPo) {
		this.ihShipPo = ihShipPo;
	}

	public String getIhShipvia() {
		return this.ihShipvia;
	}

	public void setIhShipvia(String ihShipvia) {
		this.ihShipvia = ihShipvia;
	}

	public String getIhSite() {
		return this.ihSite;
	}

	public void setIhSite(String ihSite) {
		this.ihSite = ihSite;
	}

	public BigDecimal getIhSize() {
		return this.ihSize;
	}

	public void setIhSize(BigDecimal ihSize) {
		this.ihSize = ihSize;
	}

	public String getIhSizeUm() {
		return this.ihSizeUm;
	}

	public void setIhSizeUm(String ihSizeUm) {
		this.ihSizeUm = ihSizeUm;
	}

	public String getIhSlspsn() {
		return this.ihSlspsn;
	}

	public void setIhSlspsn(String ihSlspsn) {
		this.ihSlspsn = ihSlspsn;
	}

	public String getIhSource() {
		return this.ihSource;
	}

	public void setIhSource(String ihSource) {
		this.ihSource = ihSource;
	}

	public String getIhStat() {
		return this.ihStat;
	}

	public void setIhStat(String ihStat) {
		this.ihStat = ihStat;
	}

	public Date getIhTaxDate() {
		return this.ihTaxDate;
	}

	public void setIhTaxDate(Date ihTaxDate) {
		this.ihTaxDate = ihTaxDate;
	}

	public String getIhTaxEnv() {
		return this.ihTaxEnv;
	}

	public void setIhTaxEnv(String ihTaxEnv) {
		this.ihTaxEnv = ihTaxEnv;
	}

	public String getIhTaxPct() {
		return this.ihTaxPct;
	}

	public void setIhTaxPct(String ihTaxPct) {
		this.ihTaxPct = ihTaxPct;
	}

	public String getIhTaxUsage() {
		return this.ihTaxUsage;
	}

	public void setIhTaxUsage(String ihTaxUsage) {
		this.ihTaxUsage = ihTaxUsage;
	}

	public boolean getIhTaxable() {
		return this.ihTaxable;
	}

	public void setIhTaxable(boolean ihTaxable) {
		this.ihTaxable = ihTaxable;
	}

	public String getIhTaxc() {
		return this.ihTaxc;
	}

	public void setIhTaxc(String ihTaxc) {
		this.ihTaxc = ihTaxc;
	}

	public boolean getIhToInv() {
		return this.ihToInv;
	}

	public void setIhToInv(boolean ihToInv) {
		this.ihToInv = ihToInv;
	}

	public BigDecimal getIhTrl1Amt() {
		return this.ihTrl1Amt;
	}

	public void setIhTrl1Amt(BigDecimal ihTrl1Amt) {
		this.ihTrl1Amt = ihTrl1Amt;
	}

	public String getIhTrl1Cd() {
		return this.ihTrl1Cd;
	}

	public void setIhTrl1Cd(String ihTrl1Cd) {
		this.ihTrl1Cd = ihTrl1Cd;
	}

	public BigDecimal getIhTrl2Amt() {
		return this.ihTrl2Amt;
	}

	public void setIhTrl2Amt(BigDecimal ihTrl2Amt) {
		this.ihTrl2Amt = ihTrl2Amt;
	}

	public String getIhTrl2Cd() {
		return this.ihTrl2Cd;
	}

	public void setIhTrl2Cd(String ihTrl2Cd) {
		this.ihTrl2Cd = ihTrl2Cd;
	}

	public BigDecimal getIhTrl3Amt() {
		return this.ihTrl3Amt;
	}

	public void setIhTrl3Amt(BigDecimal ihTrl3Amt) {
		this.ihTrl3Amt = ihTrl3Amt;
	}

	public String getIhTrl3Cd() {
		return this.ihTrl3Cd;
	}

	public void setIhTrl3Cd(String ihTrl3Cd) {
		this.ihTrl3Cd = ihTrl3Cd;
	}

	public String getIhType() {
		return this.ihType;
	}

	public void setIhType(String ihType) {
		this.ihType = ihType;
	}

	public String getIhUser1() {
		return this.ihUser1;
	}

	public void setIhUser1(String ihUser1) {
		this.ihUser1 = ihUser1;
	}

	public String getIhUser2() {
		return this.ihUser2;
	}

	public void setIhUser2(String ihUser2) {
		this.ihUser2 = ihUser2;
	}

	public String getIhUserid() {
		return this.ihUserid;
	}

	public void setIhUserid(String ihUserid) {
		this.ihUserid = ihUserid;
	}

	public BigDecimal getIhWeight() {
		return this.ihWeight;
	}

	public void setIhWeight(BigDecimal ihWeight) {
		this.ihWeight = ihWeight;
	}

	public String getIhWeightUm() {
		return this.ihWeightUm;
	}

	public void setIhWeightUm(String ihWeightUm) {
		this.ihWeightUm = ihWeightUm;
	}

	public String getIhXcommPct() {
		return this.ihXcommPct;
	}

	public void setIhXcommPct(String ihXcommPct) {
		this.ihXcommPct = ihXcommPct;
	}

	public String getIhXslspsn() {
		return this.ihXslspsn;
	}

	public void setIhXslspsn(String ihXslspsn) {
		this.ihXslspsn = ihXslspsn;
	}

	public BigDecimal getOidCofidiIhHist() {
		return this.oidCofidiIhHist;
	}

	public void setOidCofidiIhHist(BigDecimal oidCofidiIhHist) {
		this.oidCofidiIhHist = oidCofidiIhHist;
	}

}