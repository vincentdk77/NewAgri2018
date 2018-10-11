package com.sinosoft.txnlist.api.gisinsurelist.dto;

import com.sinosoft.framework.dto.BaseRequest;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 预投保清单农户标的表Dto
 *
 * @Author: 何伟东
 * @Date: 2018/1/15 16:18
 */
public class GisFarmerItemForPremiumDto extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private int sequenceNo;

    private String itemType;

    private String itemName;
    /**
     * 属性标的清单编号/标的清单编号
     */

    private String itemListCode;


    /**
     * 属性农户代码/农户代码
     */
    private String fCode;

    private String fName;

    /**
     * 属性投保数量/投保数量
     */
    private Double insureCount;

    /**
     * 属性序列号/序列号
     */
    private Integer serialNo;

    /**
     * 属性标的代码/标的代码
     */
    private String itemCode;
    /**
     * 属性清单编号/清单编号
     */
    private String insureListCode;

    /** 属性证件号码/证件号码 */
    private String fIdCard ;
    /** 属性联系手机号码/联系手机号码 */
    private String fPhone ;
    /** 属性开户银行名称/开户银行名称 */
    private String bankName ;
    private String accountName ;
    /** 属性开户账号/开户账号 */
    private String accountNo ;
    /** 属性投保总面积/投标总数量/投保总面积/投标总数量 */
    private Double insureArea ;
    /*行业类别*/
    private String industryCategory;
    /*贷款合同编号*/
    private String loanContractNo;
    /*贷款银行代码*/
    private String loanBankAccount;
    /*贷款金额*/
    private Double loadAmount;
    /*担保人*/
    private String guarantor;
    /*贷款期限*/
    private Date loanPeriod;
    /*贷款用途*/
    private String loanUse;
    private List<GisManFieldListDto> gisManFieldListDtoList;

    public String getIndustryCategory() {
        return industryCategory;
    }

    public void setIndustryCategory(String industryCategory) {
        this.industryCategory = industryCategory;
    }

    public String getLoanContractNo() {
        return loanContractNo;
    }

    public void setLoanContractNo(String loanContractNo) {
        this.loanContractNo = loanContractNo;
    }

    public String getLoanBankAccount() {
        return loanBankAccount;
    }

    public void setLoanBankAccount(String loanBankAccount) {
        this.loanBankAccount = loanBankAccount;
    }

    public Double getLoadAmount() {
        return loadAmount;
    }

    public void setLoadAmount(Double loadAmount) {
        this.loadAmount = loadAmount;
    }

    public String getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor;
    }

    public Date getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Date loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public String getLoanUse() {
        return loanUse;
    }

    public void setLoanUse(String loanUse) {
        this.loanUse = loanUse;
    }

    public List<GisManFieldListDto> getGisManFieldListDtoList() {
        return gisManFieldListDtoList;
    }

    public void setGisManFieldListDtoList(List<GisManFieldListDto> gisManFieldListDtoList) {
        this.gisManFieldListDtoList = gisManFieldListDtoList;
    }

    public int getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(int sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getInsureListCode() {
        return insureListCode;
    }

    public void setInsureListCode(String insureListCode) {
        this.insureListCode = insureListCode;
    }

    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public String getfCode() {
        return fCode;
    }

    public void setfCode(String fCode) {
        this.fCode = fCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemListCode() {
        return itemListCode;
    }

    public void setItemListCode(String itemListCode) {
        this.itemListCode = itemListCode;
    }

    public Double getInsureCount() {
        return insureCount;
    }

    public void setInsureCount(Double insureCount) {
        this.insureCount = insureCount;
    }

    public String getfIdCard() {        return fIdCard;    }

    public void setfIdCard(String fIdCard) {        this.fIdCard = fIdCard;    }

    public String getfPhone() {        return fPhone;    }

    public void setfPhone(String fPhone) {        this.fPhone = fPhone;    }

    public String getBankName() {        return bankName;    }

    public void setBankName(String bankName) {        this.bankName = bankName;    }
    public String getAccountName() {        return accountName;    }

    public void setAccountName(String accountName) {        this.accountName = accountName;    }

    public String getAccountNo() {        return accountNo;    }
    public void setAccountNo(String accountNo) {        this.accountNo = accountNo;    }

    public Double getInsureArea() {        return insureArea;    }

    public void setInsureArea(Double insureArea) {        this.insureArea = insureArea;    }
}
