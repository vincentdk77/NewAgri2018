package com.sinosoft.agriprpall.api.proposalmanage.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sinosoft.framework.dto.BaseRequest;

import java.io.Serializable;
/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-10-18 08:03:36.446 
 * 收费计划表Api操作对象
 */
public class PrpTplanDto extends BaseRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 属性投保单号码/投保单号码 */
	private String proposalNo ;		
	/** 属性批单号码/批单号码 */
	private String endorseNo ;		
	/** 属性交费次数序号/交费次数序号 */
	private Integer serialNo ;
	/** 属性交费期次/交费期次 */
	private Integer payNo ;
	/** 属性交费原因/交费原因 */
	private String payReason ;		
	/** 属性计划交费截止日期/计划交费截止日期 */
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private java.util.Date planDate ;		
	/** 属性币别/币别 */
	private String currency ;		
	/** 属性应交费金额/应交费金额 */
	private Double planFee ;
	/** 属性拖欠金额/拖欠金额 */
	private Double delinquentFee ;
	/** 属性标志字段/标志字段 */
	private String flag ;		
	/** 属性planstartFate/planStartDate */
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private java.util.Date planStartDate;
	/** 属性planRate/planRate */
	private Double planRate ;
	/** 属性签单币种/签单币种 */
	private String currency2 ;		
	/** 属性签单币种与本位币种的兑换率/签单币种与本位币种的兑换率 */
	private Double exchangeRateCNY ;
	/** 属性签单币种下的费用/签单币种下的费用 */
	private Double planFee2 ;
	/** 属性总不含税保费/总不含税保费 */
	private Double noTaxPremium ;
	/** 属性总税额/总税额 */
	private Double taxFee ;

	private Double payreFee;

	private String payReasonName;


	public Double getPayreFee() {
		return payreFee;
	}

	public void setPayreFee(Double payreFee) {
		this.payreFee = payreFee;
	}

	public String getPayReasonName() {
		return payReasonName;
	}

	public void setPayReasonName(String payReasonName) {
		this.payReasonName = payReasonName;
	}

	/**
	 * 属性投保单号码/投保单号码的getter方法
	 */
	public String getProposalNo() {
		return proposalNo;
	}
	/**
	 * 属性投保单号码/投保单号码的setter方法
	 */
	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}	
	/**
	 * 属性批单号码/批单号码的getter方法
	 */
	public String getEndorseNo() {
		return endorseNo;
	}
	/**
	 * 属性批单号码/批单号码的setter方法
	 */
	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}	
	/**
	 * 属性交费次数序号/交费次数序号的getter方法
	 */
	public Integer getSerialNo() {
		return serialNo;
	}
	/**
	 * 属性交费次数序号/交费次数序号的setter方法
	 */
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}	
	/**
	 * 属性交费期次/交费期次的getter方法
	 */
	public Integer getPayNo() {
		return payNo;
	}
	/**
	 * 属性交费期次/交费期次的setter方法
	 */
	public void setPayNo(Integer payNo) {
		this.payNo = payNo;
	}	
	/**
	 * 属性交费原因/交费原因的getter方法
	 */
	public String getPayReason() {
		return payReason;
	}
	/**
	 * 属性交费原因/交费原因的setter方法
	 */
	public void setPayReason(String payReason) {
		this.payReason = payReason;
	}	
	/**
	 * 属性计划交费截止日期/计划交费截止日期的getter方法
	 */
	public java.util.Date getPlanDate() {
		return planDate;
	}
	/**
	 * 属性计划交费截止日期/计划交费截止日期的setter方法
	 */
	public void setPlanDate(java.util.Date planDate) {
		this.planDate = planDate;
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
	 * 属性应交费金额/应交费金额的getter方法
	 */
	public Double getPlanFee() {
		return planFee;
	}
	/**
	 * 属性应交费金额/应交费金额的setter方法
	 */
	public void setPlanFee(Double planFee) {
		this.planFee = planFee;
	}	
	/**
	 * 属性拖欠金额/拖欠金额的getter方法
	 */
	public Double getDelinquentFee() {
		return delinquentFee;
	}
	/**
	 * 属性拖欠金额/拖欠金额的setter方法
	 */
	public void setDelinquentFee(Double delinquentFee) {
		this.delinquentFee = delinquentFee;
	}	
	/**
	 * 属性标志字段/标志字段的getter方法
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * 属性标志字段/标志字段的setter方法
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}	
	/**
	 * 属性planstartFate/planstartFate的getter方法
	 */
	public java.util.Date getPlanStartDate() {
		return planStartDate;
	}
	/**
	 * 属性planstartFate/planstartFate的setter方法
	 */
	public void setPlanStartDate(java.util.Date planStartDate) {
		this.planStartDate = planStartDate;
	}	
	/**
	 * 属性planRate/planRate的getter方法
	 */
	public Double getPlanRate() {
		return planRate;
	}
	/**
	 * 属性planRate/planRate的setter方法
	 */
	public void setPlanRate(Double planRate) {
		this.planRate = planRate;
	}	
	/**
	 * 属性签单币种/签单币种的getter方法
	 */
	public String getCurrency2() {
		return currency2;
	}
	/**
	 * 属性签单币种/签单币种的setter方法
	 */
	public void setCurrency2(String currency2) {
		this.currency2 = currency2;
	}

	public Double getExchangeRateCNY() {
		return exchangeRateCNY;
	}

	public void setExchangeRateCNY(Double exchangeRateCNY) {
		this.exchangeRateCNY = exchangeRateCNY;
	}

	/**
	 * 属性签单币种下的费用/签单币种下的费用的getter方法
	 */
	public Double getPlanFee2() {
		return planFee2;
	}
	/**
	 * 属性签单币种下的费用/签单币种下的费用的setter方法
	 */
	public void setPlanFee2(Double planFee2) {
		this.planFee2 = planFee2;
	}	
	/**
	 * 属性总不含税保费/总不含税保费的getter方法
	 */
	public Double getNoTaxPremium() {
		return noTaxPremium;
	}
	/**
	 * 属性总不含税保费/总不含税保费的setter方法
	 */
	public void setNoTaxPremium(Double noTaxPremium) {
		this.noTaxPremium = noTaxPremium;
	}	
	/**
	 * 属性总税额/总税额的getter方法
	 */
	public Double getTaxFee() {
		return taxFee;
	}
	/**
	 * 属性总税额/总税额的setter方法
	 */
	public void setTaxFee(Double taxFee) {
		this.taxFee = taxFee;
	}	
}
