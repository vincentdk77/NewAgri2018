package com.sinosoft.pms.core.kernel.entity;

import com.sinosoft.framework.core.dao.BasePKImpl;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-09-15 09:19:57.041 
 * 条款文档表主键操作对象
 */
public class PrpDclauseContentKey extends BasePKImpl{
	private static final long serialVersionUID = 1L;
	public PrpDclauseContentKey(){}
	public PrpDclauseContentKey(String clauseCode,java.lang.Integer serialNo){
		this.clauseCode = clauseCode;
		this.serialNo = serialNo;
	}
	/** 属性条款代码/条款代码 */
	private String clauseCode ;
	/** 属性单证要素代码/单证要素代码 */
	private java.lang.Integer serialNo ;
	/**
	 * 属性条款代码/条款代码的getter方法
	 */
	public String getClauseCode() {
    		return clauseCode;
	}
	/**
	 * 属性条款代码/条款代码的setter方法
	 */
	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	} 
	/**
	 * 属性单证要素代码/单证要素代码的getter方法
	 */
	public java.lang.Integer getSerialNo() {
    		return serialNo;
	}
	/**
	 * 属性单证要素代码/单证要素代码的setter方法
	 */
	public void setSerialNo(java.lang.Integer serialNo) {
		this.serialNo = serialNo;
	} 
}