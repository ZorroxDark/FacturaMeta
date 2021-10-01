package mx.com.mtlsa.billing.entity.openedge;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "cofidi_code_mstr" database table.
 * 
 */
@Entity
@Table(name="cofidi_code_mstr")
@NamedQuery(name="CofidiCodeMstr.findAll", query="SELECT c FROM CofidiCodeMstr c")
public class CofidiCodeMstr implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CofidiCodeMstrPK id;

	@Column(name="code__qadc01")
	private String codeQadc01;

	@Column(name="code_cmmt")
	private String codeCmmt;

	@Column(name="code_desc")
	private String codeDesc;

	@Column(name="code_user1")
	private String codeUser1;

	@Column(name="code_user2")
	private String codeUser2;

	@Column(name="oid_cofidi_code_mstr")
	private BigDecimal oidCofidiCodeMstr;

	public CofidiCodeMstr() {
	}

	public CofidiCodeMstrPK getId() {
		return this.id;
	}

	public void setId(CofidiCodeMstrPK id) {
		this.id = id;
	}

	public String getCodeQadc01() {
		return this.codeQadc01;
	}

	public void setCodeQadc01(String codeQadc01) {
		this.codeQadc01 = codeQadc01;
	}

	public String getCodeCmmt() {
		return this.codeCmmt;
	}

	public void setCodeCmmt(String codeCmmt) {
		this.codeCmmt = codeCmmt;
	}

	public String getCodeDesc() {
		return this.codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	public String getCodeUser1() {
		return this.codeUser1;
	}

	public void setCodeUser1(String codeUser1) {
		this.codeUser1 = codeUser1;
	}

	public String getCodeUser2() {
		return this.codeUser2;
	}

	public void setCodeUser2(String codeUser2) {
		this.codeUser2 = codeUser2;
	}

	public BigDecimal getOidCofidiCodeMstr() {
		return this.oidCofidiCodeMstr;
	}

	public void setOidCofidiCodeMstr(BigDecimal oidCofidiCodeMstr) {
		this.oidCofidiCodeMstr = oidCofidiCodeMstr;
	}

}