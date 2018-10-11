package com.sinosoft.dms.api.dict.dto;

import java.io.Serializable;
import java.util.Date;

import com.sinosoft.framework.dto.BaseRequest;
/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-05 01:01:56.447 
 * 兑换率表Api操作对象
 */
public class PrpDexchDto extends BaseRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 属性汇率日期/汇率日期 */
	private java.util.Date exchDate ;		
	/** 属性基准/基准 */
	private java.lang.Integer base ;		
	/** 属性基准币别/基准币别 */
	private String baseCurrency ;		
	/** 属性兑换币别/兑换币别 */
	private String exchCurrency ;		
	/** 属性兑换汇率/兑换汇率 */
	private java.lang.Double exchRate ;		
	/** 属性效力状态(0失效/1有效)/效力状态(0失效/1有效) */
	private String validStatus ;		
	/** 属性标志字段/标志字段 */
	private String flag ;		
	/** 属性inValidDate/inValidDate */
	private java.util.Date invalidDate ;		
	/** 属性validDate/validDate */
	private java.util.Date validDate ;		
	/** 属性新车购置价/新车购置价 */
	private java.lang.Integer buyPrice ;		
	/** 属性车船税/车船税 */
	private java.lang.Integer cashPrice ;		
	/** 属性实际价值/实际价值 */
	private java.lang.Integer salePrice ;		
	/** 属性修改人/修改人 */
	private String update_By ;
	/** 属性修改时间/修改时间 */
	private java.util.Date update_Date ;
	/**
	 * 属性汇率日期/汇率日期的getter方法
	 */
	public java.util.Date getExchDate() {
		return exchDate;
	}
	/**
	 * 属性汇率日期/汇率日期的setter方法
	 */
	public void setExchDate(java.util.Date exchDate) {
		this.exchDate = exchDate;
	}	
	/**
	 * 属性基准/基准的getter方法
	 */
	public java.lang.Integer getBase() {
		return base;
	}
	/**
	 * 属性基准/基准的setter方法
	 */
	public void setBase(java.lang.Integer base) {
		this.base = base;
	}	
	/**
	 * 属性基准币别/基准币别的getter方法
	 */
	public String getBaseCurrency() {
		return baseCurrency;
	}
	/**
	 * 属性基准币别/基准币别的setter方法
	 */
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}	
	/**
	 * 属性兑换币别/兑换币别的getter方法
	 */
	public String getExchCurrency() {
		return exchCurrency;
	}
	/**
	 * 属性兑换币别/兑换币别的setter方法
	 */
	public void setExchCurrency(String exchCurrency) {
		this.exchCurrency = exchCurrency;
	}	
	/**
	 * 属性兑换汇率/兑换汇率的getter方法
	 */
	public java.lang.Double getExchRate() {
		return exchRate;
	}
	/**
	 * 属性兑换汇率/兑换汇率的setter方法
	 */
	public void setExchRate(java.lang.Double exchRate) {
		this.exchRate = exchRate;
	}	
	/**
	 * 属性效力状态(0失效/1有效)/效力状态(0失效/1有效)的getter方法
	 */
	public String getValidStatus() {
		return validStatus;
	}
	/**
	 * 属性效力状态(0失效/1有效)/效力状态(0失效/1有效)的setter方法
	 */
	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
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
	 * 属性inValidDate/inValidDate的getter方法
	 */
	public java.util.Date getInvalidDate() {
		return invalidDate;
	}
	/**
	 * 属性inValidDate/inValidDate的setter方法
	 */
	public void setInvalidDate(java.util.Date invalidDate) {
		this.invalidDate = invalidDate;
	}	
	/**
	 * 属性validDate/validDate的getter方法
	 */
	public java.util.Date getValidDate() {
		return validDate;
	}
	/**
	 * 属性validDate/validDate的setter方法
	 */
	public void setValidDate(java.util.Date validDate) {
		this.validDate = validDate;
	}	
	/**
	 * 属性新车购置价/新车购置价的getter方法
	 */
	public java.lang.Integer getBuyPrice() {
		return buyPrice;
	}
	/**
	 * 属性新车购置价/新车购置价的setter方法
	 */
	public void setBuyPrice(java.lang.Integer buyPrice) {
		this.buyPrice = buyPrice;
	}	
	/**
	 * 属性车船税/车船税的getter方法
	 */
	public java.lang.Integer getCashPrice() {
		return cashPrice;
	}
	/**
	 * 属性车船税/车船税的setter方法
	 */
	public void setCashPrice(java.lang.Integer cashPrice) {
		this.cashPrice = cashPrice;
	}

	public String getUpdate_By() {
		return update_By;
	}

	public void setUpdate_By(String update_By) {
		this.update_By = update_By;
	}

	public Date getUpdate_Date() {
		return update_Date;
	}

	public void setUpdate_Date(Date update_Date) {
		this.update_Date = update_Date;
	}

	/**
	 * 属性实际价值/实际价值的getter方法
	 */
	public java.lang.Integer getSalePrice() {
		return salePrice;
	}
	/**
	 * 属性实际价值/实际价值的setter方法
	 */
	public void setSalePrice(java.lang.Integer salePrice) {
		this.salePrice = salePrice;
	}	

}
