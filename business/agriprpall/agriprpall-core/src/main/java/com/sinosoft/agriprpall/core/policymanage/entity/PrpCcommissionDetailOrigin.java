package com.sinosoft.agriprpall.core.policymanage.entity;

import com.sinosoft.framework.core.dao.BaseEntityImpl;
import javax.persistence.*;
import java.util.Date;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-05 01:01:20.710 
 * PrpCcommissionDetailorigin实体操作对象
 */
@Entity
@Table(name = "PrpCcommissionDetailOrigin")
@IdClass(PrpCcommissionDetailOriginKey.class)
public class PrpCcommissionDetailOrigin extends BaseEntityImpl{

	private static final long serialVersionUID = 1L;
	/** 属性保单号/保单号 */
	@Id
	@Column(name = "policyNo")
	private String policyNo ;/** 属性序列号/序列号 */
	@Id
	@Column(name = "serialNo")
	private java.lang.Integer serialNo ;	


	/** 属性agreeMentno/agreeMentno */
	@Column(name = "agreementNo")
	private String agreementNo ;
	/** 属性customerGroupCode/customerGroupCode */
	@Column(name = "customerGroupCode")
	private String customerGroupCode ;
	/** 属性costType/costType */
	@Column(name = "costType")
	private String costType ;
	/** 属性payNo/payNo */
	@Column(name = "payNo")
	private java.lang.Integer payNo ;
	/** 属性险种/险种 */
	@Column(name = "riskCode")
	private String riskCode ;
	/** 属性clauseCode/clauseCode */
	@Column(name = "clauseCode")
	private String clauseCode ;
	/** 属性kindCode/kindCode */
	@Column(name = "kindCode")
	private String kindCode ;
	/** 属性sumPremium/sumPremium */
	@Column(name = "sumPremium")
	private java.lang.Double sumPremium ;
	/** 属性costRate/costRate */
	@Column(name = "costRate")
	private java.lang.Double costRate ;
	/** 属性costRateUpper/costRateUpper */
	@Column(name = "costRateUpper")
	private java.lang.Double costRateUpper ;
	/** 属性adjustFlag/adjustFlag */
	@Column(name = "adjustFlag")
	private String adjustFlag ;
	/** 属性upperFlag/upperFlag */
	@Column(name = "upperFlag")
	private String upperFlag ;
	/** 属性auditRate/auditRate */
	@Column(name = "auditRate")
	private java.lang.Double auditRate ;
	/** 属性auditFlag/auditFlag */
	@Column(name = "auditFlag")
	private String auditFlag ;
	/** 属性coinsRate/coinsRate */
	@Column(name = "coinsRate")
	private java.lang.Double coinsRate ;
	/** 属性coinsDeduct/coinsDeduct */
	@Column(name = "coinsDeduct")
	private String coinsDeduct ;
	/** 属性currency/currency */
	@Column(name = "currency")
	private String currency ;
	/** 属性costFee/costFee */
	@Column(name = "costFee")
	private java.lang.Double costFee ;
	/** 属性conFigCode/conFigCode */
	@Column(name = "configCode")
	private String configCode ;
	/** 属性amortizeFlag/amortizeFlag */
	@Column(name = "amortizeFlag")
	private String amortizeFlag ;
	/** 属性clauseKindFlag/clauseKindFlag */
	@Column(name = "clauseKindFlag")
	private String clauseKindFlag ;
	/** 属性备注/备注 */
	@Column(name = "remark")
	private String remark ;
	/** 属性标志/标志 */
	@Column(name = "flag")
	private String flag ;
	/** 属性插入时间/插入时间 */
	@Column(name = "insertTimeForHis")
	private java.util.Date insertTimeForHis ;
	/** 属性更新时间/更新时间 */
	@Column(name = "operateTimeForHis")
	private java.util.Date operateTimeForHis ;
	/** 属性costFeeorg/costFeeorg */
	@Column(name = "costFeeOrg")
	private java.lang.Double costFeeOrg ;
	/**
	 * 属性保单号/保单号的getter方法
	 */
	public String getPolicyNo() {
		return policyNo;
	}
	/**
	 * 属性保单号/保单号的setter方法
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	} 	
	/**
	 * 属性序列号/序列号的getter方法
	 */
	public java.lang.Integer getSerialNo() {
		return serialNo;
	}
	/**
	 * 属性序列号/序列号的setter方法
	 */
	public void setSerialNo(java.lang.Integer serialNo) {
		this.serialNo = serialNo;
	} 	
	/**
	 * 属性agreeMentno/agreeMentno的getter方法
	 */
	public String getAgreementNo() {
		return agreementNo;
	}
	/**
	 * 属性agreeMentno/agreeMentno的setter方法
	 */
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	} 	
	/**
	 * 属性customerGroupCode/customerGroupCode的getter方法
	 */
	public String getCustomerGroupCode() {
		return customerGroupCode;
	}
	/**
	 * 属性customerGroupCode/customerGroupCode的setter方法
	 */
	public void setCustomerGroupCode(String customerGroupCode) {
		this.customerGroupCode = customerGroupCode;
	} 	
	/**
	 * 属性costType/costType的getter方法
	 */
	public String getCostType() {
		return costType;
	}
	/**
	 * 属性costType/costType的setter方法
	 */
	public void setCostType(String costType) {
		this.costType = costType;
	} 	
	/**
	 * 属性payNo/payNo的getter方法
	 */
	public java.lang.Integer getPayNo() {
		return payNo;
	}
	/**
	 * 属性payNo/payNo的setter方法
	 */
	public void setPayNo(java.lang.Integer payNo) {
		this.payNo = payNo;
	} 	
	/**
	 * 属性险种/险种的getter方法
	 */
	public String getRiskCode() {
		return riskCode;
	}
	/**
	 * 属性险种/险种的setter方法
	 */
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	} 	
	/**
	 * 属性clauseCode/clauseCode的getter方法
	 */
	public String getClauseCode() {
		return clauseCode;
	}
	/**
	 * 属性clauseCode/clauseCode的setter方法
	 */
	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	} 	
	/**
	 * 属性kindCode/kindCode的getter方法
	 */
	public String getKindCode() {
		return kindCode;
	}
	/**
	 * 属性kindCode/kindCode的setter方法
	 */
	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	} 	
	/**
	 * 属性sumPremium/sumPremium的getter方法
	 */
	public java.lang.Double getSumPremium() {
		return sumPremium;
	}
	/**
	 * 属性sumPremium/sumPremium的setter方法
	 */
	public void setSumPremium(java.lang.Double sumPremium) {
		this.sumPremium = sumPremium;
	} 	
	/**
	 * 属性costRate/costRate的getter方法
	 */
	public java.lang.Double getCostRate() {
		return costRate;
	}
	/**
	 * 属性costRate/costRate的setter方法
	 */
	public void setCostRate(java.lang.Double costRate) {
		this.costRate = costRate;
	} 	
	/**
	 * 属性costRateUpper/costRateUpper的getter方法
	 */
	public java.lang.Double getCostRateUpper() {
		return costRateUpper;
	}
	/**
	 * 属性costRateUpper/costRateUpper的setter方法
	 */
	public void setCostRateUpper(java.lang.Double costRateUpper) {
		this.costRateUpper = costRateUpper;
	} 	
	/**
	 * 属性adjustFlag/adjustFlag的getter方法
	 */
	public String getAdjustFlag() {
		return adjustFlag;
	}
	/**
	 * 属性adjustFlag/adjustFlag的setter方法
	 */
	public void setAdjustFlag(String adjustFlag) {
		this.adjustFlag = adjustFlag;
	} 	
	/**
	 * 属性upperFlag/upperFlag的getter方法
	 */
	public String getUpperFlag() {
		return upperFlag;
	}
	/**
	 * 属性upperFlag/upperFlag的setter方法
	 */
	public void setUpperFlag(String upperFlag) {
		this.upperFlag = upperFlag;
	} 	
	/**
	 * 属性auditRate/auditRate的getter方法
	 */
	public java.lang.Double getAuditRate() {
		return auditRate;
	}
	/**
	 * 属性auditRate/auditRate的setter方法
	 */
	public void setAuditRate(java.lang.Double auditRate) {
		this.auditRate = auditRate;
	} 	
	/**
	 * 属性auditFlag/auditFlag的getter方法
	 */
	public String getAuditFlag() {
		return auditFlag;
	}
	/**
	 * 属性auditFlag/auditFlag的setter方法
	 */
	public void setAuditFlag(String auditFlag) {
		this.auditFlag = auditFlag;
	} 	
	/**
	 * 属性coinsRate/coinsRate的getter方法
	 */
	public java.lang.Double getCoinsRate() {
		return coinsRate;
	}
	/**
	 * 属性coinsRate/coinsRate的setter方法
	 */
	public void setCoinsRate(java.lang.Double coinsRate) {
		this.coinsRate = coinsRate;
	} 	
	/**
	 * 属性coinsDeduct/coinsDeduct的getter方法
	 */
	public String getCoinsDeduct() {
		return coinsDeduct;
	}
	/**
	 * 属性coinsDeduct/coinsDeduct的setter方法
	 */
	public void setCoinsDeduct(String coinsDeduct) {
		this.coinsDeduct = coinsDeduct;
	} 	
	/**
	 * 属性currency/currency的getter方法
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * 属性currency/currency的setter方法
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	} 	
	/**
	 * 属性costFee/costFee的getter方法
	 */
	public java.lang.Double getCostFee() {
		return costFee;
	}
	/**
	 * 属性costFee/costFee的setter方法
	 */
	public void setCostFee(java.lang.Double costFee) {
		this.costFee = costFee;
	} 	
	/**
	 * 属性conFigCode/conFigCode的getter方法
	 */
	public String getConfigCode() {
		return configCode;
	}
	/**
	 * 属性conFigCode/conFigCode的setter方法
	 */
	public void setConfigCode(String configCode) {
		this.configCode = configCode;
	} 	
	/**
	 * 属性amortizeFlag/amortizeFlag的getter方法
	 */
	public String getAmortizeFlag() {
		return amortizeFlag;
	}
	/**
	 * 属性amortizeFlag/amortizeFlag的setter方法
	 */
	public void setAmortizeFlag(String amortizeFlag) {
		this.amortizeFlag = amortizeFlag;
	} 	
	/**
	 * 属性clauseKindFlag/clauseKindFlag的getter方法
	 */
	public String getClauseKindFlag() {
		return clauseKindFlag;
	}
	/**
	 * 属性clauseKindFlag/clauseKindFlag的setter方法
	 */
	public void setClauseKindFlag(String clauseKindFlag) {
		this.clauseKindFlag = clauseKindFlag;
	} 	
	/**
	 * 属性备注/备注的getter方法
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 属性备注/备注的setter方法
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	} 	
	/**
	 * 属性标志/标志的getter方法
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * 属性标志/标志的setter方法
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	} 	
	/**
	 * 属性插入时间/插入时间的getter方法
	 */
	public java.util.Date getInsertTimeForHis() {
		return insertTimeForHis;
	}
	/**
	 * 属性插入时间/插入时间的setter方法
	 */
	public void setInsertTimeForHis(java.util.Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	} 	
	/**
	 * 属性更新时间/更新时间的getter方法
	 */
	public java.util.Date getOperateTimeForHis() {
		return operateTimeForHis;
	}
	/**
	 * 属性更新时间/更新时间的setter方法
	 */
	public void setOperateTimeForHis(java.util.Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	} 	
	/**
	 * 属性costFeeorg/costFeeorg的getter方法
	 */
	public java.lang.Double getCostFeeOrg() {
		return costFeeOrg;
	}
	/**
	 * 属性costFeeorg/costFeeorg的setter方法
	 */
	public void setCostFeeOrg(java.lang.Double costFeeOrg) {
		this.costFeeOrg = costFeeOrg;
	} 	
}