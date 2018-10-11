package com.sinosoft.agriclaim.api.jobmanage.dto;

import com.sinosoft.framework.dto.BaseRequest;

import java.io.Serializable;
/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-08 05:42:38.981 
 * 班表管理从表Api操作对象
 */
public class PrpLJobManagerTimeDto extends BaseRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 属性外键，保存主表的主键/外键，保存主表的主键 */
	private String fid ;		
	/** 属性上午/下午(0-AM,1-PM)/上午/下午(0-AM,1-PM) */
	private String dateType ;		
	/** 属性具体日期/具体日期 */
	private String time ;

	private boolean  checkFlag ;

	public boolean getCheckFlag() {
		return checkFlag;
	}

	public void setCheckFlag( boolean checkFlag) {
		this.checkFlag = checkFlag;
	}



	/**
	 * 属性外键，保存主表的主键/外键，保存主表的主键的getter方法
	 */
	public String getFid() {
		return fid;
	}
	/**
	 * 属性外键，保存主表的主键/外键，保存主表的主键的setter方法
	 */
	public void setFid(String fid) {
		this.fid = fid;
	}	
	/**
	 * 属性上午/下午(0-AM,1-PM)/上午/下午(0-AM,1-PM)的getter方法
	 */
	public String getDateType() {
		return dateType;
	}
	/**
	 * 属性上午/下午(0-AM,1-PM)/上午/下午(0-AM,1-PM)的setter方法
	 */
	public void setDateType(String dateType) {
		this.dateType = dateType;
	}	
	/**
	 * 属性具体日期/具体日期的getter方法
	 */
	public String getTime () {
		return time ;
	}
	/**
	 * 属性具体日期/具体日期的setter方法
	 */
	public void setTime (String time ) {
		this.time  = time ;
	}	
}
