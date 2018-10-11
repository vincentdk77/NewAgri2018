package com.sinosoft.txnlist.api.plantinginsurancelist.dto;

import com.sinosoft.framework.agri.core.excel.annotation.ExportConfig;
import com.sinosoft.framework.dto.BaseRequest;

import java.io.Serializable;
import java.util.Date;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time 2017-11-18 08:36:26.740
 * planting31endorchgdetailApi操作对象
 */
public class Planting31EndorChgDetailDto extends BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 序号
     */
    @ExportConfig(value = "序号", width = 50)
    private int serialNo;
    /**
     * 属性批单号/批单号
     */
    @ExportConfig(value = "批单号", width = 220)
    private String endorseNo;
    /**
     * 保单号
     */
    @ExportConfig(value = "保单号", width = 200)
    private String policyNo;
    /**
     * 属性保险起期/保险起期
     */
    private java.util.Date startDate;
    /**
     * 属性保险起期/保险起期
     */
    @ExportConfig(value = "保险起期", width = 130)
    private String startDateStr;
    /**
     * 属性保险止期/保险止期
     */
    private java.util.Date endDate;
    /**
     * 属性保险止期/保险止期
     */
    @ExportConfig(value = "保险止期", width = 130)
    private String endDateStr;
    /**
     * 属性农户代码（key）/农户代码（key）
     */
    @ExportConfig(value = "农户代码", width = 170)
    private String fCode;
    /**
     * 属性农户姓名/农户姓名
     */
    @ExportConfig(value = "农户姓名", width = 120)
    private String fName;
    /**
     * 属性农户身份证/农户身份证
     */
    @ExportConfig(value = "身份证号码", width = 170)
    private String fIdCard;
    /**
     * 属性直补卡号/银行卡号/直补卡号/银行卡号
     */
    @ExportConfig(value = "银行卡号", width = 210)
    private String zhiBuKa;
    /**
     * 属性联系电话号码/联系电话号码
     */
    @ExportConfig(value = "联系电话", width = 120)
    private String phone;
    /**
     * 属性投保面积/投保面积
     */
    @ExportConfig(value = "投保面积（亩）")
    private Double insureArea;
    /**
     * 属性险别序号（key）/险别名称
     */
    @ExportConfig(value = "险别")
    private String kindName;
    /**
     * 属性险别序号（key）/险别序号（key）
     */
    private String kindCode;
    /**
     * 属性标的名称
     */
    @ExportConfig(value = "标的")
    private String itemName;
    /**
     * 属性标的代码
     */
    private String itemCode;
    /**
     * 属性总保额/总保额
     */
    @ExportConfig(value = "总保额（元）")
    private Double sumAmount;
    /**
     * 属性总保费/总保费
     */
    @ExportConfig(value = "总保费（元）")
    private Double sumPremium;
    /**
     * 属性短期费率方式/短期费率方式
     */
    @ExportConfig(value = "短期费率方式")
    private String shortRateFlag;
    /**
     * 属性短期费率/短期费率
     */
    @ExportConfig(value = "短期费率")
    private Double shortRate;
    /**
     * 属性农民自缴保费/农民自缴保费
     */
    @ExportConfig(value = "自缴保费（元）")
    private Double fPremium;
    /**
     * 属性中央财政补贴/中央财政补贴
     */
    @ExportConfig(value = "中央财政补贴（元）")
    private Double centralPremium;
    /**
     * 属性省级财政补贴/省级财政补贴
     */
    @ExportConfig(value = "省级财政补贴（元）")
    private Double provincePremium;
    /**
     * 属性地市财政补贴/地市财政补贴
     */
    @ExportConfig(value = "地市财政补贴（元）")
    private Double cityPremium;
    /**
     * 属性县(区)财政补贴/县(区)财政补贴
     */
    @ExportConfig(value = "区县财政补贴（元）")
    private Double townPremium;
    /**
     * 属性其他来源补贴/其他来源补贴
     */
    @ExportConfig(value = "其他补贴（元）")
    private Double otherPremium;
    /**
     * 属性保额变化量/保额变化量
     */
    @ExportConfig(value = "变化保额（元）")
    private Double chgSumAmount;
    /**
     * 属性保费变化量/保费变化量
     */
    @ExportConfig(value = "变化保费（元）")
    private Double chgSumPremium;
    /**
     * 自缴保费变化量
     */
    @ExportConfig(value = "变化自缴保费（元）")
    private Double chgFPremium;
    /**
     * 中央财政补贴变化量
     */
    @ExportConfig(value = "变化中央财政补贴（元）")
    private Double chgCentralPremium;
    /**
     * 省级财政补贴变化量
     */
    @ExportConfig(value = "变化省级财政补贴（元）")
    private Double chgProvincePremium;
    /**
     * 地市财政补贴变化量
     */
    @ExportConfig(value = "变化地市财政补贴（元）")
    private Double chgCityPremium;
    /**
     * 区（县）财政变化量
     */
    @ExportConfig(value = "变化区县财政补贴（元）")
    private Double chgTownPremium;
    /**
     * 其他来源补贴变化量
     */
    @ExportConfig(value = "变化其他补贴（元）")
    private Double chgOtherPremium;
    /**
     * 属性修改标志位/修改标志位
     */
    @ExportConfig(value = "批改类型")
    private String flag;

    /**
     * 属性inusreListCode/inusreListCode
     */
    private String inusreListCode;
    /**
     * 属性indexCode/indexCode
     */
    private String indexCode;
    /**
     * 属性bank/bank
     */
    private String bank;
    /**
     * 属性classCode/classCode
     */
    private String classCode;
    /**
     * 属性riskCode/riskCode
     */
    private String riskCode;
    /**
     * 属性fareaCode/fareaCode
     */
    private String fareaCode;
    /**
     * 属性taxArea/taxArea
     */
    private Double taxArea;
    /**
     * 属性amount/amount
     */
    private Double amount;
    /**
     * 属性rate/rate
     */
    private Double rate;
    /**
     * 属性calculateFlag/calculateFlag
     */
    private String calculateFlag;
    /**
     * 属性opCode/opCode
     */
    private String opCode;
    /**
     * 属性opTime/opTime
     */
    private Date opTime;
    /**
     * 属性validity/validity
     */
    private String validity;
    /**
     * 属性remark/remark
     */
    private String remark;
    /**
     * 属性teamName/teamName
     */
    private String teamName;
    /**
     * 属性chgInsureArea/chgInsureArea
     */
    private Double chgInsureArea;
    /**
     * 属性fieldSource/fieldSource
     */
    private String fieldSource;
    /**
     * 属性mulchdate/mulchdate
     */
    private String mulchDate;
    /**
     * 属性mulchtype/mulchtype
     */
    private String mulchType;

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getEndorseNo() {
        return endorseNo;
    }

    public void setEndorseNo(String endorseNo) {
        this.endorseNo = endorseNo;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStartDateStr() {
        return startDateStr;
    }

    public void setStartDateStr(String startDateStr) {
        this.startDateStr = startDateStr;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEndDateStr() {
        return endDateStr;
    }

    public void setEndDateStr(String endDateStr) {
        this.endDateStr = endDateStr;
    }

    public String getfCode() {
        return fCode;
    }

    public void setfCode(String fCode) {
        this.fCode = fCode;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfIdCard() {
        return fIdCard;
    }

    public void setfIdCard(String fIdCard) {
        this.fIdCard = fIdCard;
    }

    public String getZhiBuKa() {
        return zhiBuKa;
    }

    public void setZhiBuKa(String zhiBuKa) {
        this.zhiBuKa = zhiBuKa;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getInsureArea() {
        return insureArea;
    }

    public void setInsureArea(Double insureArea) {
        this.insureArea = insureArea;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public String getKindCode() {
        return kindCode;
    }

    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Double getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(Double sumAmount) {
        this.sumAmount = sumAmount;
    }

    public Double getSumPremium() {
        return sumPremium;
    }

    public void setSumPremium(Double sumPremium) {
        this.sumPremium = sumPremium;
    }

    public String getShortRateFlag() {
        return shortRateFlag;
    }

    public void setShortRateFlag(String shortRateFlag) {
        this.shortRateFlag = shortRateFlag;
    }

    public Double getShortRate() {
        return shortRate;
    }

    public void setShortRate(Double shortRate) {
        this.shortRate = shortRate;
    }

    public Double getfPremium() {
        return fPremium;
    }

    public void setfPremium(Double fPremium) {
        this.fPremium = fPremium;
    }

    public Double getCentralPremium() {
        return centralPremium;
    }

    public void setCentralPremium(Double centralPremium) {
        this.centralPremium = centralPremium;
    }

    public Double getProvincePremium() {
        return provincePremium;
    }

    public void setProvincePremium(Double provincePremium) {
        this.provincePremium = provincePremium;
    }

    public Double getCityPremium() {
        return cityPremium;
    }

    public void setCityPremium(Double cityPremium) {
        this.cityPremium = cityPremium;
    }

    public Double getTownPremium() {
        return townPremium;
    }

    public void setTownPremium(Double townPremium) {
        this.townPremium = townPremium;
    }

    public Double getOtherPremium() {
        return otherPremium;
    }

    public void setOtherPremium(Double otherPremium) {
        this.otherPremium = otherPremium;
    }

    public Double getChgSumAmount() {
        return chgSumAmount;
    }

    public void setChgSumAmount(Double chgSumAmount) {
        this.chgSumAmount = chgSumAmount;
    }

    public Double getChgSumPremium() {
        return chgSumPremium;
    }

    public void setChgSumPremium(Double chgSumPremium) {
        this.chgSumPremium = chgSumPremium;
    }

    public Double getChgFPremium() {
        return chgFPremium;
    }

    public void setChgFPremium(Double chgFPremium) {
        this.chgFPremium = chgFPremium;
    }

    public Double getChgCentralPremium() {
        return chgCentralPremium;
    }

    public void setChgCentralPremium(Double chgCentralPremium) {
        this.chgCentralPremium = chgCentralPremium;
    }

    public Double getChgProvincePremium() {
        return chgProvincePremium;
    }

    public void setChgProvincePremium(Double chgProvincePremium) {
        this.chgProvincePremium = chgProvincePremium;
    }

    public Double getChgCityPremium() {
        return chgCityPremium;
    }

    public void setChgCityPremium(Double chgCityPremium) {
        this.chgCityPremium = chgCityPremium;
    }

    public Double getChgTownPremium() {
        return chgTownPremium;
    }

    public void setChgTownPremium(Double chgTownPremium) {
        this.chgTownPremium = chgTownPremium;
    }

    public Double getChgOtherPremium() {
        return chgOtherPremium;
    }

    public void setChgOtherPremium(Double chgOtherPremium) {
        this.chgOtherPremium = chgOtherPremium;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getInusreListCode() {
        return inusreListCode;
    }

    public void setInusreListCode(String inusreListCode) {
        this.inusreListCode = inusreListCode;
    }

    public String getIndexCode() {
        return indexCode;
    }

    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    public String getFareaCode() {
        return fareaCode;
    }

    public void setFareaCode(String fareaCode) {
        this.fareaCode = fareaCode;
    }

    public Double getTaxArea() {
        return taxArea;
    }

    public void setTaxArea(Double taxArea) {
        this.taxArea = taxArea;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getCalculateFlag() {
        return calculateFlag;
    }

    public void setCalculateFlag(String calculateFlag) {
        this.calculateFlag = calculateFlag;
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    public Date getOpTime() {
        return opTime;
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Double getChgInsureArea() {
        return chgInsureArea;
    }

    public void setChgInsureArea(Double chgInsureArea) {
        this.chgInsureArea = chgInsureArea;
    }

    public String getFieldSource() {
        return fieldSource;
    }

    public void setFieldSource(String fieldSource) {
        this.fieldSource = fieldSource;
    }

    public String getMulchDate() {
        return mulchDate;
    }

    public void setMulchDate(String mulchDate) {
        this.mulchDate = mulchDate;
    }

    public String getMulchType() {
        return mulchType;
    }

    public void setMulchType(String mulchType) {
        this.mulchType = mulchType;
    }
}
