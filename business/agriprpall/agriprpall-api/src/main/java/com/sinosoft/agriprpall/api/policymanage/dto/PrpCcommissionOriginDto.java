package com.sinosoft.agriprpall.api.policymanage.dto;

import java.io.Serializable;

import com.sinosoft.framework.dto.BaseRequest;
/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-05 01:01:20.710 
 * PrpCcommissionOriginApi操作对象
 */
public class PrpCcommissionOriginDto extends BaseRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 属性保单号/保单号 */
	private String policyNo ;		
	/** 属性协议号/协议号 */
	private String agreementNo ;		
	/** 属性客户群代码/客户群代码 */
	private String customerGroupCode ;		
	/** 属性费用类型/费用类型 */
	private String costType ;		
	/** 属性险种/险种 */
	private String riskCode ;		
	/** 属性总保费/总保费 */
	private java.lang.Double sumPremium ;		
	/** 属性费用比例/费用比例 */
	private java.lang.Double costRate ;		
	/** 属性费用默认上限/费用默认上限 */
	private java.lang.Double costRateUpper ;		
	/** 属性是否允许调整/是否允许调整 */
	private String adjustFlag ;		
	/** 属性是否可超上限 /是否可超上限  */
	private String upperFlag ;		
	/** 属性核保辅助绝对上限/核保辅助绝对上限 */
	private java.lang.Double auditRate ;		
	/** 属性超上限人工核保/超上限人工核保 */
	private String auditFlag ;		
	/** 属性共保份额/共保份额 */
	private java.lang.Double coinsRate ;		
	/** 属性分保扣除/分保扣除 */
	private String coinsDeduct ;		
	/** 属性币别/币别 */
	private String currency ;		
	/** 属性费用金额 /费用金额  */
	private java.lang.Double costFee ;		
	/** 属性费用拆分方案代码/费用拆分方案代码 */
	private String configCode ;		
	/** 属性是否分期/是否分期 */
	private String amortizeFlag ;		
	/** 属性跟单维度 /跟单维度  */
	private String clauseKindFlag ;		
	/** 属性备注/备注 */
	private String remark ;		
	/** 属性标志/标志 */
	private String flag ;		
	/** 属性插入时间/插入时间 */
	private java.util.Date insertTimeForHis ;		
	/** 属性更新时间/更新时间 */
	private java.util.Date operateTimeForHis ;		
	/** 属性计划代码/计划代码 */
	private String planCode ;		
	/** 属性销管费用金额--佣金上限/销管费用金额--佣金上限 */
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
	 * 属性协议号/协议号的getter方法
	 */
	public String getAgreementNo() {
		return agreementNo;
	}
	/**
	 * 属性协议号/协议号的setter方法
	 */
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}	
	/**
	 * 属性客户群代码/客户群代码的getter方法
	 */
	public String getCustomerGroupCode() {
		return customerGroupCode;
	}
	/**
	 * 属性客户群代码/客户群代码的setter方法
	 */
	public void setCustomerGroupCode(String customerGroupCode) {
		this.customerGroupCode = customerGroupCode;
	}	
	/**
	 * 属性费用类型/费用类型的getter方法
	 */
	public String getCostType() {
		return costType;
	}
	/**
	 * 属性费用类型/费用类型的setter方法
	 */
	public void setCostType(String costType) {
		this.costType = costType;
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
	 * 属性总保费/总保费的getter方法
	 */
	public java.lang.Double getSumPremium() {
		return sumPremium;
	}
	/**
	 * 属性总保费/总保费的setter方法
	 */
	public void setSumPremium(java.lang.Double sumPremium) {
		this.sumPremium = sumPremium;
	}	
	/**
	 * 属性费用比例/费用比例的getter方法
	 */
	public java.lang.Double getCostRate() {
		return costRate;
	}
	/**
	 * 属性费用比例/费用比例的setter方法
	 */
	public void setCostRate(java.lang.Double costRate) {
		this.costRate = costRate;
	}	
	/**
	 * 属性费用默认上限/费用默认上限的getter方法
	 */
	public java.lang.Double getCostRateUpper() {
		return costRateUpper;
	}
	/**
	 * 属性费用默认上限/费用默认上限的setter方法
	 */
	public void setCostRateUpper(java.lang.Double costRateUpper) {
		this.costRateUpper = costRateUpper;
	}	
	/**
	 * 属性是否允许调整/是否允许调整的getter方法
	 */
	public String getAdjustFlag() {
		return adjustFlag;
	}
	/**
	 * 属性是否允许调整/是否允许调整的setter方法
	 */
	public void setAdjustFlag(String adjustFlag) {
		this.adjustFlag = adjustFlag;
	}	
	/**
	 * 属性是否可超上限 /是否可超上限 的getter方法
	 */
	public String getUpperFlag() {
		return upperFlag;
	}
	/**
	 * 属性是否可超上限 /是否可超上限 的setter方法
	 */
	public void setUpperFlag(String upperFlag) {
		this.upperFlag = upperFlag;
	}	
	/**
	 * 属性核保辅助绝对上限/核保辅助绝对上限的getter方法
	 */
	public java.lang.Double getAuditRate() {
		return auditRate;
	}
	/**
	 * 属性核保辅助绝对上限/核保辅助绝对上限的setter方法
	 */
	public void setAuditRate(java.lang.Double auditRate) {
		this.auditRate = auditRate;
	}	
	/**
	 * 属性超上限人工核保/超上限人工核保的getter方法
	 */
	public String getAuditFlag() {
		return auditFlag;
	}
	/**
	 * 属性超上限人工核保/超上限人工核保的setter方法
	 */
	public void setAuditFlag(String auditFlag) {
		this.auditFlag = auditFlag;
	}	
	/**
	 * 属性共保份额/共保份额的getter方法
	 */
	public java.lang.Double getCoinsRate() {
		return coinsRate;
	}
	/**
	 * 属性共保份额/共保份额的setter方法
	 */
	public void setCoinsRate(java.lang.Double coinsRate) {
		this.coinsRate = coinsRate;
	}	
	/**
	 * 属性分保扣除/分保扣除的getter方法
	 */
	public String getCoinsDeduct() {
		return coinsDeduct;
	}
	/**
	 * 属性分保扣除/分保扣除的setter方法
	 */
	public void setCoinsDeduct(String coinsDeduct) {
		this.coinsDeduct = coinsDeduct;
	}	
	/**
	 * 属性币别/币别的getter方法
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * 属性币别/币别的setter方法
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}	
	/**
	 * 属性费用金额 /费用金额 的getter方法
	 */
	public java.lang.Double getCostFee() {
		return costFee;
	}
	/**
	 * 属性费用金额 /费用金额 的setter方法
	 */
	public void setCostFee(java.lang.Double costFee) {
		this.costFee = costFee;
	}	
	/**
	 * 属性费用拆分方案代码/费用拆分方案代码的getter方法
	 */
	public String getConfigCode() {
		return configCode;
	}
	/**
	 * 属性费用拆分方案代码/费用拆分方案代码的setter方法
	 */
	public void setConfigCode(String configCode) {
		this.configCode = configCode;
	}	
	/**
	 * 属性是否分期/是否分期的getter方法
	 */
	public String getAmortizeFlag() {
		return amortizeFlag;
	}
	/**
	 * 属性是否分期/是否分期的setter方法
	 */
	public void setAmortizeFlag(String amortizeFlag) {
		this.amortizeFlag = amortizeFlag;
	}	
	/**
	 * 属性跟单维度 /跟单维度 的getter方法
	 */
	public String getClauseKindFlag() {
		return clauseKindFlag;
	}
	/**
	 * 属性跟单维度 /跟单维度 的setter方法
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
	 * 属性计划代码/计划代码的getter方法
	 */
	public String getPlanCode() {
		return planCode;
	}
	/**
	 * 属性计划代码/计划代码的setter方法
	 */
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}	
	/**
	 * 属性销管费用金额--佣金上限/销管费用金额--佣金上限的getter方法
	 */
	public java.lang.Double getCostFeeOrg() {
		return costFeeOrg;
	}
	/**
	 * 属性销管费用金额--佣金上限/销管费用金额--佣金上限的setter方法
	 */
	public void setCostFeeOrg(java.lang.Double costFeeOrg) {
		this.costFeeOrg = costFeeOrg;
	}	
}
