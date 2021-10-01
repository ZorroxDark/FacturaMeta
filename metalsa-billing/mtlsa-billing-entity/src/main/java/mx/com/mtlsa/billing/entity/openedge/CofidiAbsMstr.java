package mx.com.mtlsa.billing.entity.openedge;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the "cofidi_abs_mstr" database table.
 * 
 */
@Entity
@Table(name="cofidi_abs_mstr")
@NamedQuery(name="CofidiAbsMstr.findAll", query="SELECT c FROM CofidiAbsMstr c")
public class CofidiAbsMstr implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CofidiAbsMstrPK id;

	@Column(name="abs__chr01")
	private String absChr01;

	@Column(name="abs__chr02")
	private String absChr02;

	@Column(name="abs__chr03")
	private String absChr03;

	@Column(name="abs__chr04")
	private String absChr04;

	@Column(name="abs__chr05")
	private String absChr05;

	@Column(name="abs__chr06")
	private String absChr06;

	@Column(name="abs__chr07")
	private String absChr07;

	@Column(name="abs__chr08")
	private String absChr08;

	@Column(name="abs__chr09")
	private String absChr09;

	@Column(name="abs__chr10")
	private String absChr10;

	@Column(name="abs__dec01")
	private BigDecimal absDec01;

	@Column(name="abs__dec02")
	private BigDecimal absDec02;

	@Column(name="abs__dec03")
	private BigDecimal absDec03;

	@Column(name="abs__dec04")
	private BigDecimal absDec04;

	@Column(name="abs__dec05")
	private BigDecimal absDec05;

	@Column(name="abs__dec06")
	private BigDecimal absDec06;

	@Column(name="abs__dec07")
	private BigDecimal absDec07;

	@Column(name="abs__dec08")
	private BigDecimal absDec08;

	@Column(name="abs__dec09")
	private BigDecimal absDec09;

	@Column(name="abs__dec10")
	private BigDecimal absDec10;

	@Column(name="abs__qad01")
	private String absQad01;

	@Column(name="abs__qad02")
	private String absQad02;

	@Column(name="abs__qad03")
	private String absQad03;

	@Column(name="abs__qad04")
	private String absQad04;

	@Column(name="abs__qad05")
	private String absQad05;

	@Column(name="abs__qad06")
	private String absQad06;

	@Column(name="abs__qad07")
	private String absQad07;

	@Column(name="abs__qad08")
	private String absQad08;

	@Column(name="abs__qad09")
	private String absQad09;

	@Column(name="abs__qad10")
	private String absQad10;

	@Column(name="abs__qadc01")
	private String absQadc01;

	@Column(name="abs__qadd01")
	private BigDecimal absQadd01;

	@Column(name="abs_act_fcst")
	private BigDecimal absActFcst;

	@Temporal(TemporalType.DATE)
	@Column(name="abs_apr_date")
	private Date absAprDate;

	@Column(name="abs_apr_time")
	private int absAprTime;

	@Column(name="abs_apr_userid")
	private String absAprUserid;

	@Temporal(TemporalType.DATE)
	@Column(name="abs_arr_date")
	private Date absArrDate;

	@Column(name="abs_arr_time")
	private int absArrTime;

	@Temporal(TemporalType.DATE)
	@Column(name="abs_asn_crt_date")
	private Date absAsnCrtDate;

	@Column(name="abs_asn_crt_time")
	private int absAsnCrtTime;

	@Temporal(TemporalType.DATE)
	@Column(name="abs_cancel_date")
	private Date absCancelDate;

	@Column(name="abs_canceled")
	private boolean absCanceled;

	@Column(name="abs_charge_type")
	private String absChargeType;

	@Column(name="abs_cmtindx")
	private int absCmtindx;

	@Column(name="abs_cons_ship")
	private String absConsShip;

	@Temporal(TemporalType.DATE)
	@Column(name="abs_crt_date")
	private Date absCrtDate;

	@Column(name="abs_crt_time")
	private int absCrtTime;

	@Column(name="abs_cum_qty")
	private BigDecimal absCumQty;

	@Column(name="abs_cust_ref")
	private String absCustRef;

	@Column(name="abs_dataset")
	private String absDataset;

	@Column(name="abs_desc")
	private String absDesc;

	@Column(name="abs_dim_um")
	private String absDimUm;

	@Column(name="abs_doc_data")
	private String absDocData;

	@Temporal(TemporalType.DATE)
	@Column(name="abs_eff_date")
	private Date absEffDate;

	@Column(name="abs_est_fcst")
	private BigDecimal absEstFcst;

	@Column(name="abs_export_batch")
	private int absExportBatch;

	@Temporal(TemporalType.DATE)
	@Column(name="abs_export_date")
	private Date absExportDate;

	@Column(name="abs_export_time")
	private int absExportTime;

	@Column(name="abs_fa_lot")
	private String absFaLot;

	@Column(name="abs_format")
	private String absFormat;

	@Column(name="abs_fr_class")
	private String absFrClass;

	@Column(name="abs_fr_curr")
	private String absFrCurr;

	@Column(name="abs_gwt")
	private BigDecimal absGwt;

	@Column(name="abs_inv_mov")
	private String absInvMov;

	@Column(name="abs_inv_nbr")
	private String absInvNbr;

	@Column(name="abs_item")
	private String absItem;

	@Column(name="abs_lang")
	private String absLang;

	@Column(name="abs_line")
	private String absLine;

	@Column(name="abs_loc")
	private String absLoc;

	@Column(name="abs_lotser")
	private String absLotser;

	@Column(name="abs_master_id")
	private String absMasterId;

	@Column(name="abs_master_shipfrom")
	private String absMasterShipfrom;

	@Column(name="abs_nr_id")
	private String absNrId;

	@Column(name="abs_nwt")
	private BigDecimal absNwt;

	@Column(name="abs_order")
	private String absOrder;

	@Column(name="abs_par_id")
	private String absParId;

	@Column(name="abs_preship_id")
	private String absPreshipId;

	@Column(name="abs_preship_nr_id")
	private String absPreshipNrId;

	@Column(name="abs_price")
	private BigDecimal absPrice;

	@Column(name="abs_qty")
	private BigDecimal absQty;

	@Column(name="abs_ref")
	private String absRef;

	@Column(name="abs_ship_qty")
	private BigDecimal absShipQty;

	@Column(name="abs_shipto")
	private String absShipto;

	@Temporal(TemporalType.DATE)
	@Column(name="abs_shp_date")
	private Date absShpDate;

	@Column(name="abs_shp_time")
	private int absShpTime;

	@Column(name="abs_site")
	private String absSite;

	@Column(name="abs_status")
	private String absStatus;

	@Column(name="abs_timezone")
	private String absTimezone;

	@Column(name="abs_trl_cmtindx")
	private int absTrlCmtindx;

	@Column(name="abs_type")
	private String absType;

	@Column(name="abs_user1")
	private String absUser1;

	@Column(name="abs_user2")
	private String absUser2;

	@Column(name="abs_vol")
	private BigDecimal absVol;

	@Column(name="abs_vol_um")
	private String absVolUm;

	@Column(name="abs_wt_um")
	private String absWtUm;

	@Column(name="oid_cofidi_abs_mstr")
	private BigDecimal oidCofidiAbsMstr;

	public CofidiAbsMstr() {
	}

	public CofidiAbsMstrPK getId() {
		return this.id;
	}

	public void setId(CofidiAbsMstrPK id) {
		this.id = id;
	}

	public String getAbsChr01() {
		return this.absChr01;
	}

	public void setAbsChr01(String absChr01) {
		this.absChr01 = absChr01;
	}

	public String getAbsChr02() {
		return this.absChr02;
	}

	public void setAbsChr02(String absChr02) {
		this.absChr02 = absChr02;
	}

	public String getAbsChr03() {
		return this.absChr03;
	}

	public void setAbsChr03(String absChr03) {
		this.absChr03 = absChr03;
	}

	public String getAbsChr04() {
		return this.absChr04;
	}

	public void setAbsChr04(String absChr04) {
		this.absChr04 = absChr04;
	}

	public String getAbsChr05() {
		return this.absChr05;
	}

	public void setAbsChr05(String absChr05) {
		this.absChr05 = absChr05;
	}

	public String getAbsChr06() {
		return this.absChr06;
	}

	public void setAbsChr06(String absChr06) {
		this.absChr06 = absChr06;
	}

	public String getAbsChr07() {
		return this.absChr07;
	}

	public void setAbsChr07(String absChr07) {
		this.absChr07 = absChr07;
	}

	public String getAbsChr08() {
		return this.absChr08;
	}

	public void setAbsChr08(String absChr08) {
		this.absChr08 = absChr08;
	}

	public String getAbsChr09() {
		return this.absChr09;
	}

	public void setAbsChr09(String absChr09) {
		this.absChr09 = absChr09;
	}

	public String getAbsChr10() {
		return this.absChr10;
	}

	public void setAbsChr10(String absChr10) {
		this.absChr10 = absChr10;
	}

	public BigDecimal getAbsDec01() {
		return this.absDec01;
	}

	public void setAbsDec01(BigDecimal absDec01) {
		this.absDec01 = absDec01;
	}

	public BigDecimal getAbsDec02() {
		return this.absDec02;
	}

	public void setAbsDec02(BigDecimal absDec02) {
		this.absDec02 = absDec02;
	}

	public BigDecimal getAbsDec03() {
		return this.absDec03;
	}

	public void setAbsDec03(BigDecimal absDec03) {
		this.absDec03 = absDec03;
	}

	public BigDecimal getAbsDec04() {
		return this.absDec04;
	}

	public void setAbsDec04(BigDecimal absDec04) {
		this.absDec04 = absDec04;
	}

	public BigDecimal getAbsDec05() {
		return this.absDec05;
	}

	public void setAbsDec05(BigDecimal absDec05) {
		this.absDec05 = absDec05;
	}

	public BigDecimal getAbsDec06() {
		return this.absDec06;
	}

	public void setAbsDec06(BigDecimal absDec06) {
		this.absDec06 = absDec06;
	}

	public BigDecimal getAbsDec07() {
		return this.absDec07;
	}

	public void setAbsDec07(BigDecimal absDec07) {
		this.absDec07 = absDec07;
	}

	public BigDecimal getAbsDec08() {
		return this.absDec08;
	}

	public void setAbsDec08(BigDecimal absDec08) {
		this.absDec08 = absDec08;
	}

	public BigDecimal getAbsDec09() {
		return this.absDec09;
	}

	public void setAbsDec09(BigDecimal absDec09) {
		this.absDec09 = absDec09;
	}

	public BigDecimal getAbsDec10() {
		return this.absDec10;
	}

	public void setAbsDec10(BigDecimal absDec10) {
		this.absDec10 = absDec10;
	}

	public String getAbsQad01() {
		return this.absQad01;
	}

	public void setAbsQad01(String absQad01) {
		this.absQad01 = absQad01;
	}

	public String getAbsQad02() {
		return this.absQad02;
	}

	public void setAbsQad02(String absQad02) {
		this.absQad02 = absQad02;
	}

	public String getAbsQad03() {
		return this.absQad03;
	}

	public void setAbsQad03(String absQad03) {
		this.absQad03 = absQad03;
	}

	public String getAbsQad04() {
		return this.absQad04;
	}

	public void setAbsQad04(String absQad04) {
		this.absQad04 = absQad04;
	}

	public String getAbsQad05() {
		return this.absQad05;
	}

	public void setAbsQad05(String absQad05) {
		this.absQad05 = absQad05;
	}

	public String getAbsQad06() {
		return this.absQad06;
	}

	public void setAbsQad06(String absQad06) {
		this.absQad06 = absQad06;
	}

	public String getAbsQad07() {
		return this.absQad07;
	}

	public void setAbsQad07(String absQad07) {
		this.absQad07 = absQad07;
	}

	public String getAbsQad08() {
		return this.absQad08;
	}

	public void setAbsQad08(String absQad08) {
		this.absQad08 = absQad08;
	}

	public String getAbsQad09() {
		return this.absQad09;
	}

	public void setAbsQad09(String absQad09) {
		this.absQad09 = absQad09;
	}

	public String getAbsQad10() {
		return this.absQad10;
	}

	public void setAbsQad10(String absQad10) {
		this.absQad10 = absQad10;
	}

	public String getAbsQadc01() {
		return this.absQadc01;
	}

	public void setAbsQadc01(String absQadc01) {
		this.absQadc01 = absQadc01;
	}

	public BigDecimal getAbsQadd01() {
		return this.absQadd01;
	}

	public void setAbsQadd01(BigDecimal absQadd01) {
		this.absQadd01 = absQadd01;
	}

	public BigDecimal getAbsActFcst() {
		return this.absActFcst;
	}

	public void setAbsActFcst(BigDecimal absActFcst) {
		this.absActFcst = absActFcst;
	}

	public Date getAbsAprDate() {
		return this.absAprDate;
	}

	public void setAbsAprDate(Date absAprDate) {
		this.absAprDate = absAprDate;
	}

	public int getAbsAprTime() {
		return this.absAprTime;
	}

	public void setAbsAprTime(int absAprTime) {
		this.absAprTime = absAprTime;
	}

	public String getAbsAprUserid() {
		return this.absAprUserid;
	}

	public void setAbsAprUserid(String absAprUserid) {
		this.absAprUserid = absAprUserid;
	}

	public Date getAbsArrDate() {
		return this.absArrDate;
	}

	public void setAbsArrDate(Date absArrDate) {
		this.absArrDate = absArrDate;
	}

	public int getAbsArrTime() {
		return this.absArrTime;
	}

	public void setAbsArrTime(int absArrTime) {
		this.absArrTime = absArrTime;
	}

	public Date getAbsAsnCrtDate() {
		return this.absAsnCrtDate;
	}

	public void setAbsAsnCrtDate(Date absAsnCrtDate) {
		this.absAsnCrtDate = absAsnCrtDate;
	}

	public int getAbsAsnCrtTime() {
		return this.absAsnCrtTime;
	}

	public void setAbsAsnCrtTime(int absAsnCrtTime) {
		this.absAsnCrtTime = absAsnCrtTime;
	}

	public Date getAbsCancelDate() {
		return this.absCancelDate;
	}

	public void setAbsCancelDate(Date absCancelDate) {
		this.absCancelDate = absCancelDate;
	}

	public boolean getAbsCanceled() {
		return this.absCanceled;
	}

	public void setAbsCanceled(boolean absCanceled) {
		this.absCanceled = absCanceled;
	}

	public String getAbsChargeType() {
		return this.absChargeType;
	}

	public void setAbsChargeType(String absChargeType) {
		this.absChargeType = absChargeType;
	}

	public int getAbsCmtindx() {
		return this.absCmtindx;
	}

	public void setAbsCmtindx(int absCmtindx) {
		this.absCmtindx = absCmtindx;
	}

	public String getAbsConsShip() {
		return this.absConsShip;
	}

	public void setAbsConsShip(String absConsShip) {
		this.absConsShip = absConsShip;
	}

	public Date getAbsCrtDate() {
		return this.absCrtDate;
	}

	public void setAbsCrtDate(Date absCrtDate) {
		this.absCrtDate = absCrtDate;
	}

	public int getAbsCrtTime() {
		return this.absCrtTime;
	}

	public void setAbsCrtTime(int absCrtTime) {
		this.absCrtTime = absCrtTime;
	}

	public BigDecimal getAbsCumQty() {
		return this.absCumQty;
	}

	public void setAbsCumQty(BigDecimal absCumQty) {
		this.absCumQty = absCumQty;
	}

	public String getAbsCustRef() {
		return this.absCustRef;
	}

	public void setAbsCustRef(String absCustRef) {
		this.absCustRef = absCustRef;
	}

	public String getAbsDataset() {
		return this.absDataset;
	}

	public void setAbsDataset(String absDataset) {
		this.absDataset = absDataset;
	}

	public String getAbsDesc() {
		return this.absDesc;
	}

	public void setAbsDesc(String absDesc) {
		this.absDesc = absDesc;
	}

	public String getAbsDimUm() {
		return this.absDimUm;
	}

	public void setAbsDimUm(String absDimUm) {
		this.absDimUm = absDimUm;
	}

	public String getAbsDocData() {
		return this.absDocData;
	}

	public void setAbsDocData(String absDocData) {
		this.absDocData = absDocData;
	}

	public Date getAbsEffDate() {
		return this.absEffDate;
	}

	public void setAbsEffDate(Date absEffDate) {
		this.absEffDate = absEffDate;
	}

	public BigDecimal getAbsEstFcst() {
		return this.absEstFcst;
	}

	public void setAbsEstFcst(BigDecimal absEstFcst) {
		this.absEstFcst = absEstFcst;
	}

	public int getAbsExportBatch() {
		return this.absExportBatch;
	}

	public void setAbsExportBatch(int absExportBatch) {
		this.absExportBatch = absExportBatch;
	}

	public Date getAbsExportDate() {
		return this.absExportDate;
	}

	public void setAbsExportDate(Date absExportDate) {
		this.absExportDate = absExportDate;
	}

	public int getAbsExportTime() {
		return this.absExportTime;
	}

	public void setAbsExportTime(int absExportTime) {
		this.absExportTime = absExportTime;
	}

	public String getAbsFaLot() {
		return this.absFaLot;
	}

	public void setAbsFaLot(String absFaLot) {
		this.absFaLot = absFaLot;
	}

	public String getAbsFormat() {
		return this.absFormat;
	}

	public void setAbsFormat(String absFormat) {
		this.absFormat = absFormat;
	}

	public String getAbsFrClass() {
		return this.absFrClass;
	}

	public void setAbsFrClass(String absFrClass) {
		this.absFrClass = absFrClass;
	}

	public String getAbsFrCurr() {
		return this.absFrCurr;
	}

	public void setAbsFrCurr(String absFrCurr) {
		this.absFrCurr = absFrCurr;
	}

	public BigDecimal getAbsGwt() {
		return this.absGwt;
	}

	public void setAbsGwt(BigDecimal absGwt) {
		this.absGwt = absGwt;
	}

	public String getAbsInvMov() {
		return this.absInvMov;
	}

	public void setAbsInvMov(String absInvMov) {
		this.absInvMov = absInvMov;
	}

	public String getAbsInvNbr() {
		return this.absInvNbr;
	}

	public void setAbsInvNbr(String absInvNbr) {
		this.absInvNbr = absInvNbr;
	}

	public String getAbsItem() {
		return this.absItem;
	}

	public void setAbsItem(String absItem) {
		this.absItem = absItem;
	}

	public String getAbsLang() {
		return this.absLang;
	}

	public void setAbsLang(String absLang) {
		this.absLang = absLang;
	}

	public String getAbsLine() {
		return this.absLine;
	}

	public void setAbsLine(String absLine) {
		this.absLine = absLine;
	}

	public String getAbsLoc() {
		return this.absLoc;
	}

	public void setAbsLoc(String absLoc) {
		this.absLoc = absLoc;
	}

	public String getAbsLotser() {
		return this.absLotser;
	}

	public void setAbsLotser(String absLotser) {
		this.absLotser = absLotser;
	}

	public String getAbsMasterId() {
		return this.absMasterId;
	}

	public void setAbsMasterId(String absMasterId) {
		this.absMasterId = absMasterId;
	}

	public String getAbsMasterShipfrom() {
		return this.absMasterShipfrom;
	}

	public void setAbsMasterShipfrom(String absMasterShipfrom) {
		this.absMasterShipfrom = absMasterShipfrom;
	}

	public String getAbsNrId() {
		return this.absNrId;
	}

	public void setAbsNrId(String absNrId) {
		this.absNrId = absNrId;
	}

	public BigDecimal getAbsNwt() {
		return this.absNwt;
	}

	public void setAbsNwt(BigDecimal absNwt) {
		this.absNwt = absNwt;
	}

	public String getAbsOrder() {
		return this.absOrder;
	}

	public void setAbsOrder(String absOrder) {
		this.absOrder = absOrder;
	}

	public String getAbsParId() {
		return this.absParId;
	}

	public void setAbsParId(String absParId) {
		this.absParId = absParId;
	}

	public String getAbsPreshipId() {
		return this.absPreshipId;
	}

	public void setAbsPreshipId(String absPreshipId) {
		this.absPreshipId = absPreshipId;
	}

	public String getAbsPreshipNrId() {
		return this.absPreshipNrId;
	}

	public void setAbsPreshipNrId(String absPreshipNrId) {
		this.absPreshipNrId = absPreshipNrId;
	}

	public BigDecimal getAbsPrice() {
		return this.absPrice;
	}

	public void setAbsPrice(BigDecimal absPrice) {
		this.absPrice = absPrice;
	}

	public BigDecimal getAbsQty() {
		return this.absQty;
	}

	public void setAbsQty(BigDecimal absQty) {
		this.absQty = absQty;
	}

	public String getAbsRef() {
		return this.absRef;
	}

	public void setAbsRef(String absRef) {
		this.absRef = absRef;
	}

	public BigDecimal getAbsShipQty() {
		return this.absShipQty;
	}

	public void setAbsShipQty(BigDecimal absShipQty) {
		this.absShipQty = absShipQty;
	}

	public String getAbsShipto() {
		return this.absShipto;
	}

	public void setAbsShipto(String absShipto) {
		this.absShipto = absShipto;
	}

	public Date getAbsShpDate() {
		return this.absShpDate;
	}

	public void setAbsShpDate(Date absShpDate) {
		this.absShpDate = absShpDate;
	}

	public int getAbsShpTime() {
		return this.absShpTime;
	}

	public void setAbsShpTime(int absShpTime) {
		this.absShpTime = absShpTime;
	}

	public String getAbsSite() {
		return this.absSite;
	}

	public void setAbsSite(String absSite) {
		this.absSite = absSite;
	}

	public String getAbsStatus() {
		return this.absStatus;
	}

	public void setAbsStatus(String absStatus) {
		this.absStatus = absStatus;
	}

	public String getAbsTimezone() {
		return this.absTimezone;
	}

	public void setAbsTimezone(String absTimezone) {
		this.absTimezone = absTimezone;
	}

	public int getAbsTrlCmtindx() {
		return this.absTrlCmtindx;
	}

	public void setAbsTrlCmtindx(int absTrlCmtindx) {
		this.absTrlCmtindx = absTrlCmtindx;
	}

	public String getAbsType() {
		return this.absType;
	}

	public void setAbsType(String absType) {
		this.absType = absType;
	}

	public String getAbsUser1() {
		return this.absUser1;
	}

	public void setAbsUser1(String absUser1) {
		this.absUser1 = absUser1;
	}

	public String getAbsUser2() {
		return this.absUser2;
	}

	public void setAbsUser2(String absUser2) {
		this.absUser2 = absUser2;
	}

	public BigDecimal getAbsVol() {
		return this.absVol;
	}

	public void setAbsVol(BigDecimal absVol) {
		this.absVol = absVol;
	}

	public String getAbsVolUm() {
		return this.absVolUm;
	}

	public void setAbsVolUm(String absVolUm) {
		this.absVolUm = absVolUm;
	}

	public String getAbsWtUm() {
		return this.absWtUm;
	}

	public void setAbsWtUm(String absWtUm) {
		this.absWtUm = absWtUm;
	}

	public BigDecimal getOidCofidiAbsMstr() {
		return this.oidCofidiAbsMstr;
	}

	public void setOidCofidiAbsMstr(BigDecimal oidCofidiAbsMstr) {
		this.oidCofidiAbsMstr = oidCofidiAbsMstr;
	}

}