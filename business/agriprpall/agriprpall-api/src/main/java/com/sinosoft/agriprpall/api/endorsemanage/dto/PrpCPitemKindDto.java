package com.sinosoft.agriprpall.api.endorsemanage.dto;

import java.io.Serializable;
import java.util.Date;

import com.sinosoft.framework.dto.BaseRequest;
/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-10-24 03:06:48.016 
 * 标的子险信息Api操作对象
 */
public class PrpCPitemKindDto extends BaseRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 属性保单号码/保单号码 */
	private String policyNo ;		
	/** 属性险种代码 /险种代码  */
	private String riskCode ;		
	/** 属性序号/序号 */
	private Integer itemKindNo ;
	/** 属性分户序号/分户序号 */
	private Integer familyNo ;
	/** 属性分户名称(仅用于集体家财险)--** 集装箱体保险时为集装箱编号/分户名称(仅用于集体家财险)--** 集装箱体保险时为集装箱编号 */
	private String familyName ;		
	/** 属性rationType/rationType */
	private String rationType ;		
	/** 属性险别代码  /险别代码   */
	private String kindCode ;		
	/** 属性险别名称/险别名称 */
	private String kindName ;		
	/** 属性标的序号/标的序号 */
	private Integer itemNo ;
	/** 属性标的项目类别代码 /标的项目类别代码  */
	private String itemCode ;		
	/** 属性标的项目明细名称/标的项目明细名称 */
	private String itemDetailName ;		
	/** 属性投保方式代码--** 金牛险:--** PrpDration.RationType--** 养殖险: 何价投保--** 车险：玻璃类别/投保方式代码--** 金牛险:--** PrpDration.RationType--** 养殖险: 何价投保--** 车险：玻璃类别 */
	private String modeCode ;		
	/** 属性 投保方式名称--** 金牛险:--** PrpDration.RationName--** 养殖险: 何价投保/ 投保方式名称--** 金牛险:--** PrpDration.RationName--** 养殖险: 何价投保 */
	private String modeName ;		
	/** 属性起保日期/起保日期 */
	private Date startDate ;
	/** 属性起保小时/起保小时 */
	private Integer startHour ;
	/** 属性终保日期1/终保日期1 */
	private Date endDate ;
	/** 属性终保日期/终保日期 */
	private Integer endHour ;
	/** 属性规格型号/规格型号 */
	private String model ;		
	/** 属性购买日期/购买日期 */
	private Date buyDate ;
	/** 属性地址序号/地址序号 */
	private Integer addressNo ;
	/** 属性是否计算保额标志(Y/N)/是否计算保额标志(Y/N) */
	private String calculateFlag ;		
	/** 属性币别/币别 */
	private String currency ;		
	/** 属性单位保险金额（赔偿限额）--** 约定单价(元/公斤)(种植险)--** 林木实有密度(林木险)/单位保险金额（赔偿限额）--** 约定单价(元/公斤)(种植险)--** 林木实有密度(林木险) */
	private Double unitAmount ;
	/** 属性--** 数量(人数/产品数量/户数)--** 牲畜数量(养殖)--** 投保面积(亩)(林木险)/--** 数量(人数/产品数量/户数)--** 牲畜数量(养殖)--** 投保面积(亩)(林木险) */
	private Double quantity ;
	/** 属性数量单位/数量单位 */
	private String unit ;		
	/** 属性保险价值--** 保险产量(公斤/亩)(种植险)/保险价值--** 保险产量(公斤/亩)(种植险) */
	private Double value ;
	/** 属性保险金额/赔偿限额/保险金额/赔偿限额 */
	private Double amount ;
	/** 属性适应费率期数/适应费率期数 */
	private Integer ratePeriod ;
	/** 属性费率/费率 */
	private Double rate ;
	/** 属性短期费率标志--** (1.月比例/2.日比例)/短期费率标志--** (1.月比例/2.日比例) */
	private String shortRateFlag ;		
	/** 属性短期费率/短期费率 */
	private Double shortRate ;
	/** 属性基准保费/基准保费 */
	private Double basePremium ;
	/** 属性标准保费/标准保费 */
	private Double benchmarkPremium ;
	/** 属性折扣率/折扣率 */
	private Double discount ;
	/** 属性保费调整比率(%)/保费调整比率(%) */
	private Double adjustRate ;
	/** 属性保费/储金/保费/储金 */
	private Double premium ;
	/** 属性免赔率/免赔率 */
	private Double deductibleRate ;
	/** 属性免赔额(%)/免赔额(%) */
	private Double deductible ;
	/** 属性标志字段--**[2] 位为主险/附加险志--** 1:主险 2:附加险3:其他--**[3]-[4]位等于费率类型--**（RateTypeFlag）--**[6]法定三者标志（1）/标志字段--**[2] 位为主险/附加险志--** 1:主险 2:附加险3:其他--**[3]-[4]位等于费率类型--**（RateTypeFlag）--**[6]法定三者标志（1） */
	private String flag ;		
	/** 属性地区费率因子: 0-不浮动, 1-上浮30%/地区费率因子: 0-不浮动, 1-上浮30% */
	private String regionRate ;		
	/** 属性饮酒费率因子：饮酒驾驶违法次数/饮酒费率因子：饮酒驾驶违法次数 */
	private Integer drinkRate ;
	/** 属性醉酒费率因子：醉酒驾驶违法次数/醉酒费率因子：醉酒驾驶违法次数 */
	private Integer drunkRate ;
	/** 属性肉牛类型（3221肉牛险专用0122附加险借用0123附加险借用:玻璃类型）/肉牛类型（3221肉牛险专用0122附加险借用0123附加险借用:玻璃类型） */
	private String cattleType ;		
	/** 属性每次事故每人赔偿限额 0122,0123附加险用到/每次事故每人赔偿限额 0122,0123附加险用到 */
	private Double unitPersonLimitAmount ;
	/** 属性每人赔偿限额0123用到/每人赔偿限额0123用到 */
	private Double unitPersonAmount ;
	/** 属性日额：每人日额（元）2714,0123用/日额：每人日额（元）2714,0123用 */
	private Double unitDayAmountSub ;
	/** 属性天数：2714附加险专用0123附加险借用/天数：2714附加险专用0123附加险借用 */
	private Integer daySub ;
	/** 属性人员类别2606险种用到/人员类别2606险种用到 */
	private String personType ;		
	/** 属性triggerPoint/triggerPoint */
	private Double triggerPoint ;
	/** 属性totallOssratio/totallOssratio */
	private Double totalLossRatio ;
	/** 属性诉讼费限额/诉讼费限额 */
	private Double lawsuitAmount ;
	/** 属性病床数/病床数 */
	private Integer bedNum ;
	/** 属性每张床位保险费/每张床位保险费 */
	private Double bedPremium ;
	/** 属性医疗机构保费/医疗机构保费 */
	private Double hospitalPremium ;
	/** 属性各类医务人员人数/各类医务人员人数 */
	private Integer kindWorkerNum ;
	/** 属性各类医务人员每人保费/各类医务人员每人保费 */
	private Double kindWorkerPremium ;
	/** 属性临床手术科室医师人数/临床手术科室医师人数 */
	private Integer clinicNum ;
	/** 属性临床手术科室医师每人保费/临床手术科室医师每人保费 */
	private Double clinicPremium ;
	/** 属性临床非手术科室医师人数/临床非手术科室医师人数 */
	private Integer nClinicNum ;
	/** 属性临床非手术科室医师每人保费/临床非手术科室医师每人保费 */
	private Double nClinicPremium ;
	/** 属性医技科室人数/医技科室人数 */
	private Integer roomNum ;
	/** 属性医技科室每人保费/医技科室每人保费 */
	private Double roomPremium ;
	/** 属性护士人数/护士人数 */
	private Integer nurseNum ;
	/** 属性护士每人保费/护士每人保费 */
	private Double nursePremium ;
	/** 属性医务人员保费/医务人员保费 */
	private Double workerPremium ;
	/** 属性医务人员人数/医务人员人数 */
	private Integer workerNum ;
	/** 属性大病医疗保险新生儿数量/大病医疗保险新生儿数量 */
	private Double quantityNewborn ;
	/** 属性大病医疗保险新生儿是否收费标志/大病医疗保险新生儿是否收费标志 */
	private String chargeNewbornFlag ;
	/** 属性单位保费/单位保费 */
	private Double unitPremium ;
	/** 属性住院病人手术人次/住院病人手术人次 */
	private Integer operationNum ;
	/** 属性住院病人手术人次基准保险费/住院病人手术人次基准保险费 */
	private Double operationPremium ;
	/** 属性医疗机构类别系数/医疗机构类别系数 */
	private Double medicalRate ;
	/** 属性岗位系数/岗位系数 */
	private Double postRate ;
	/** 属性deductibleValue/deductibleValue */
	private Double deductibleValue ;
	/** 属性deductibleDiscount/deductibleDiscount */
	private Double deductibleDiscount ;
	/** 属性kindBenchMarkPremiumm/kindBenchMarkPremiumm */
	private Double kindBenchmarkPremiumm ;
	/** 属性guestAmount/guestAmount */
	private Double guestAmount ;
	/** 属性driverAmount/driverAmount */
	private Double driverAmount ;
	/** 属性thirdPeopleAmount/thirdPeopleAmount */
	private Double thirdPeopleAmount ;
	/** 属性isSpecGlass/isSpecGlass */
	private String isSpecGlass ;		
	/** 属性kindPremiumm/kindPremiumm */
	private Double kindPremiumm ;
	/** 属性treeBurst/treeBurst */
	private String treeBurst ;		
	/** 属性treeHigh/treeHigh */
	private String treeHigh ;		
	/** 属性treeKindName/treeKindName */
	private String treeKindName ;		
	/** 属性growTime/growTime */
	private String growTime ;		
	/** 属性latitude/latitude */
	private String latitude ;		
	/** 属性longitude/longitude */
	private String longitude ;		
	/** 属性insuranceType/insuranceType */
	private String insuranceType ;		
	/** 属性unitHarvest/unitHarvest */
	private String unitHarvest ;		
	/** 属性harvest/harvest */
	private String harvest ;		
	/** 属性unitOtherAmount/unitOtherAmount */
	private String unitOtherAmount ;		
	/** 属性agreePrice/agreePrice */
	private String agreePrice ;		
	/** 属性realInputDate/realInputDate */
	private String realInputDate ;		
	/** 属性structureNo/structureNo */
	private Integer structureNo ;
	/** 属性specialCharge/specialCharge */
	private Double specialCharge ;
	/** 属性stabilityFund/stabilityFund */
	private Double stabilityFund ;
	/** 属性stabilityFundRate/stabilityFundRate */
	private Double stabilityFundRate ;
	/** 属性storageRate/storageRate */
	private String storageRate ;
	/** 属性clauseCode/clauseCode */
	private String clauseCode ;		
	/** 属性currency3/currency3 */
	private String currency2 ;		
	/** 属性deductibleType/deductibleType */
	private String deductibleType ;		
	/** 属性discountCharge/discountCharge */
	private Double discountCharge ;
	/** 属性endorType/endorType */
	private String endorType ;		
	/** 属性exchangeRate3/exchangeRate3 */
	private Double exchangeRate2 ;
	/** 属性exchangeRateCny/exchangeRateCny */
	private Double exchangeRateCNY ;
	/** 属性insuredValueType/insuredValueType */
	private String insuredValueType ;		
	/** 属性insuredValueTypeName/insuredValueTypeName */
	private String insuredValueTypeName ;		
	/** 属性lastPurePremium/lastPurePremium */
	private Double lastPurePremium ;
	/** 属性lowerRate/lowerRate */
	private String lowerRate ;		
	/** 属性manageCharge/manageCharge */
	private Double manageCharge ;
	/** 属性motorRate/motorRate */
	private Double motorRate ;
	/** 属性newEndCate/newEndDate */
	private Date newEndDate ;
	/** 属性newStartDate/newStartDate */
	private Date newStartDate ;
	/** 属性premium3/premium3 */
	private Double premium2 ;
	/** 属性premiumCny/premiumCny */
	private Double premiumCNY ;
	/** 属性productCode/productCode */
	private String productCode ;		
	/** 属性profitScale/profitScale */
	private Double profitScale ;
	/** 属性purePremium/purePremium */
	private Double purePremium ;
	/** 属性rateType/rateType */
	private String rateType ;		
	/** 属性rateValidDate/rateValidDate */
	private String rateValidDate ;		
	/** 属性reliefFund/reliefFund */
	private Double reliefFund ;
	/** 属性reliefFundRate/reliefFundRate */
	private Double reliefFundRate ;
	/** 属性replyNo/replyNo */
	private String replyNo ;		
	/** 属性不含税保费/不含税保费 */
	private Double noTaxPremium ;
	/** 属性应/免税标识，1-应税，2-免税/应/免税标识，1-应税，2-免税 */
	private String taxFlag ;		
	/** 属性税率/税率 */
	private Double taxRate ;
	/** 属性税额/税额 */
	private Double taxFee ;
	/** 属性保费计算方式/保费计算方式 */
	private String premiumCalMethod ;		
	/** 属性林木用途/林木用途 */
	private String forestUse ;		
			
			
			
			
	/**
	 * 属性保单号码/保单号码的getter方法
	 */
	public String getPolicyNo() {
		return policyNo;
	}
	/**
	 * 属性保单号码/保单号码的setter方法
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}	
	/**
	 * 属性险种代码 /险种代码 的getter方法
	 */
	public String getRiskCode() {
		return riskCode;
	}
	/**
	 * 属性险种代码 /险种代码 的setter方法
	 */
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}	
	/**
	 * 属性序号/序号的getter方法
	 */
	public Integer getItemKindNo() {
		return itemKindNo;
	}
	/**
	 * 属性序号/序号的setter方法
	 */
	public void setItemKindNo(Integer itemKindNo) {
		this.itemKindNo = itemKindNo;
	}	
	/**
	 * 属性分户序号/分户序号的getter方法
	 */
	public Integer getFamilyNo() {
		return familyNo;
	}
	/**
	 * 属性分户序号/分户序号的setter方法
	 */
	public void setFamilyNo(Integer familyNo) {
		this.familyNo = familyNo;
	}	
	/**
	 * 属性分户名称(仅用于集体家财险)--** 集装箱体保险时为集装箱编号/分户名称(仅用于集体家财险)--** 集装箱体保险时为集装箱编号的getter方法
	 */
	public String getFamilyName() {
		return familyName;
	}
	/**
	 * 属性分户名称(仅用于集体家财险)--** 集装箱体保险时为集装箱编号/分户名称(仅用于集体家财险)--** 集装箱体保险时为集装箱编号的setter方法
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}	
	/**
	 * 属性rationType/rationType的getter方法
	 */
	public String getRationType() {
		return rationType;
	}
	/**
	 * 属性rationType/rationType的setter方法
	 */
	public void setRationType(String rationType) {
		this.rationType = rationType;
	}	
	/**
	 * 属性险别代码  /险别代码  的getter方法
	 */
	public String getKindCode() {
		return kindCode;
	}
	/**
	 * 属性险别代码  /险别代码  的setter方法
	 */
	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}	
	/**
	 * 属性险别名称/险别名称的getter方法
	 */
	public String getKindName() {
		return kindName;
	}
	/**
	 * 属性险别名称/险别名称的setter方法
	 */
	public void setKindName(String kindName) {
		this.kindName = kindName;
	}	
	/**
	 * 属性标的序号/标的序号的getter方法
	 */
	public Integer getItemNo() {
		return itemNo;
	}
	/**
	 * 属性标的序号/标的序号的setter方法
	 */
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}	
	/**
	 * 属性标的项目类别代码 /标的项目类别代码 的getter方法
	 */
	public String getItemCode() {
		return itemCode;
	}
	/**
	 * 属性标的项目类别代码 /标的项目类别代码 的setter方法
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}	
	/**
	 * 属性标的项目明细名称/标的项目明细名称的getter方法
	 */
	public String getItemDetailName() {
		return itemDetailName;
	}
	/**
	 * 属性标的项目明细名称/标的项目明细名称的setter方法
	 */
	public void setItemDetailName(String itemDetailName) {
		this.itemDetailName = itemDetailName;
	}	
	/**
	 * 属性投保方式代码--** 金牛险:--** PrpDration.RationType--** 养殖险: 何价投保--** 车险：玻璃类别/投保方式代码--** 金牛险:--** PrpDration.RationType--** 养殖险: 何价投保--** 车险：玻璃类别的getter方法
	 */
	public String getModeCode() {
		return modeCode;
	}
	/**
	 * 属性投保方式代码--** 金牛险:--** PrpDration.RationType--** 养殖险: 何价投保--** 车险：玻璃类别/投保方式代码--** 金牛险:--** PrpDration.RationType--** 养殖险: 何价投保--** 车险：玻璃类别的setter方法
	 */
	public void setModeCode(String modeCode) {
		this.modeCode = modeCode;
	}	
	/**
	 * 属性 投保方式名称--** 金牛险:--** PrpDration.RationName--** 养殖险: 何价投保/ 投保方式名称--** 金牛险:--** PrpDration.RationName--** 养殖险: 何价投保的getter方法
	 */
	public String getModeName() {
		return modeName;
	}
	/**
	 * 属性 投保方式名称--** 金牛险:--** PrpDration.RationName--** 养殖险: 何价投保/ 投保方式名称--** 金牛险:--** PrpDration.RationName--** 养殖险: 何价投保的setter方法
	 */
	public void setModeName(String modeName) {
		this.modeName = modeName;
	}	
	/**
	 * 属性起保日期/起保日期的getter方法
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * 属性起保日期/起保日期的setter方法
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}	
	/**
	 * 属性起保小时/起保小时的getter方法
	 */
	public Integer getStartHour() {
		return startHour;
	}
	/**
	 * 属性起保小时/起保小时的setter方法
	 */
	public void setStartHour(Integer startHour) {
		this.startHour = startHour;
	}	
	/**
	 * 属性终保日期1/终保日期1的getter方法
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * 属性终保日期1/终保日期1的setter方法
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}	
	/**
	 * 属性终保日期/终保日期的getter方法
	 */
	public Integer getEndHour() {
		return endHour;
	}
	/**
	 * 属性终保日期/终保日期的setter方法
	 */
	public void setEndHour(Integer endHour) {
		this.endHour = endHour;
	}	
	/**
	 * 属性规格型号/规格型号的getter方法
	 */
	public String getModel() {
		return model;
	}
	/**
	 * 属性规格型号/规格型号的setter方法
	 */
	public void setModel(String model) {
		this.model = model;
	}	
	/**
	 * 属性购买日期/购买日期的getter方法
	 */
	public Date getBuyDate() {
		return buyDate;
	}
	/**
	 * 属性购买日期/购买日期的setter方法
	 */
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}	
	/**
	 * 属性地址序号/地址序号的getter方法
	 */
	public Integer getAddressNo() {
		return addressNo;
	}
	/**
	 * 属性地址序号/地址序号的setter方法
	 */
	public void setAddressNo(Integer addressNo) {
		this.addressNo = addressNo;
	}	
	/**
	 * 属性是否计算保额标志(Y/N)/是否计算保额标志(Y/N)的getter方法
	 */
	public String getCalculateFlag() {
		return calculateFlag;
	}
	/**
	 * 属性是否计算保额标志(Y/N)/是否计算保额标志(Y/N)的setter方法
	 */
	public void setCalculateFlag(String calculateFlag) {
		this.calculateFlag = calculateFlag;
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
	 * 属性单位保险金额（赔偿限额）--** 约定单价(元/公斤)(种植险)--** 林木实有密度(林木险)/单位保险金额（赔偿限额）--** 约定单价(元/公斤)(种植险)--** 林木实有密度(林木险)的getter方法
	 */
	public Double getUnitAmount() {
		return unitAmount;
	}
	/**
	 * 属性单位保险金额（赔偿限额）--** 约定单价(元/公斤)(种植险)--** 林木实有密度(林木险)/单位保险金额（赔偿限额）--** 约定单价(元/公斤)(种植险)--** 林木实有密度(林木险)的setter方法
	 */
	public void setUnitAmount(Double unitAmount) {
		this.unitAmount = unitAmount;
	}	
	/**
	 * 属性--** 数量(人数/产品数量/户数)--** 牲畜数量(养殖)--** 投保面积(亩)(林木险)/--** 数量(人数/产品数量/户数)--** 牲畜数量(养殖)--** 投保面积(亩)(林木险)的getter方法
	 */
	public Double getQuantity() {
		return quantity;
	}
	/**
	 * 属性--** 数量(人数/产品数量/户数)--** 牲畜数量(养殖)--** 投保面积(亩)(林木险)/--** 数量(人数/产品数量/户数)--** 牲畜数量(养殖)--** 投保面积(亩)(林木险)的setter方法
	 */
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}	
	/**
	 * 属性数量单位/数量单位的getter方法
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * 属性数量单位/数量单位的setter方法
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}	
	/**
	 * 属性保险价值--** 保险产量(公斤/亩)(种植险)/保险价值--** 保险产量(公斤/亩)(种植险)的getter方法
	 */
	public Double getValue() {
		return value;
	}
	/**
	 * 属性保险价值--** 保险产量(公斤/亩)(种植险)/保险价值--** 保险产量(公斤/亩)(种植险)的setter方法
	 */
	public void setValue(Double value) {
		this.value = value;
	}	
	/**
	 * 属性保险金额/赔偿限额/保险金额/赔偿限额的getter方法
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * 属性保险金额/赔偿限额/保险金额/赔偿限额的setter方法
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}	
	/**
	 * 属性适应费率期数/适应费率期数的getter方法
	 */
	public Integer getRatePeriod() {
		return ratePeriod;
	}
	/**
	 * 属性适应费率期数/适应费率期数的setter方法
	 */
	public void setRatePeriod(Integer ratePeriod) {
		this.ratePeriod = ratePeriod;
	}	
	/**
	 * 属性费率/费率的getter方法
	 */
	public Double getRate() {
		return rate;
	}
	/**
	 * 属性费率/费率的setter方法
	 */
	public void setRate(Double rate) {
		this.rate = rate;
	}	
	/**
	 * 属性短期费率标志--** (1.月比例/2.日比例)/短期费率标志--** (1.月比例/2.日比例)的getter方法
	 */
	public String getShortRateFlag() {
		return shortRateFlag;
	}
	/**
	 * 属性短期费率标志--** (1.月比例/2.日比例)/短期费率标志--** (1.月比例/2.日比例)的setter方法
	 */
	public void setShortRateFlag(String shortRateFlag) {
		this.shortRateFlag = shortRateFlag;
	}	
	/**
	 * 属性短期费率/短期费率的getter方法
	 */
	public Double getShortRate() {
		return shortRate;
	}
	/**
	 * 属性短期费率/短期费率的setter方法
	 */
	public void setShortRate(Double shortRate) {
		this.shortRate = shortRate;
	}	
	/**
	 * 属性基准保费/基准保费的getter方法
	 */
	public Double getBasePremium() {
		return basePremium;
	}
	/**
	 * 属性基准保费/基准保费的setter方法
	 */
	public void setBasePremium(Double basePremium) {
		this.basePremium = basePremium;
	}	

	/**
	 * 属性折扣率/折扣率的getter方法
	 */
	public Double getDiscount() {
		return discount;
	}
	/**
	 * 属性折扣率/折扣率的setter方法
	 */
	public void setDiscount(Double discount) {
		this.discount = discount;
	}	
	/**
	 * 属性保费调整比率(%)/保费调整比率(%)的getter方法
	 */
	public Double getAdjustRate() {
		return adjustRate;
	}
	/**
	 * 属性保费调整比率(%)/保费调整比率(%)的setter方法
	 */
	public void setAdjustRate(Double adjustRate) {
		this.adjustRate = adjustRate;
	}	
	/**
	 * 属性保费/储金/保费/储金的getter方法
	 */
	public Double getPremium() {
		return premium;
	}
	/**
	 * 属性保费/储金/保费/储金的setter方法
	 */
	public void setPremium(Double premium) {
		this.premium = premium;
	}	
	/**
	 * 属性免赔率/免赔率的getter方法
	 */
	public Double getDeductibleRate() {
		return deductibleRate;
	}
	/**
	 * 属性免赔率/免赔率的setter方法
	 */
	public void setDeductibleRate(Double deductibleRate) {
		this.deductibleRate = deductibleRate;
	}	
	/**
	 * 属性免赔额(%)/免赔额(%)的getter方法
	 */
	public Double getDeductible() {
		return deductible;
	}
	/**
	 * 属性免赔额(%)/免赔额(%)的setter方法
	 */
	public void setDeductible(Double deductible) {
		this.deductible = deductible;
	}	
	/**
	 * 属性标志字段--**[2] 位为主险/附加险志--** 1:主险 2:附加险3:其他--**[3]-[4]位等于费率类型--**（RateTypeFlag）--**[6]法定三者标志（1）/标志字段--**[2] 位为主险/附加险志--** 1:主险 2:附加险3:其他--**[3]-[4]位等于费率类型--**（RateTypeFlag）--**[6]法定三者标志（1）的getter方法
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * 属性标志字段--**[2] 位为主险/附加险志--** 1:主险 2:附加险3:其他--**[3]-[4]位等于费率类型--**（RateTypeFlag）--**[6]法定三者标志（1）/标志字段--**[2] 位为主险/附加险志--** 1:主险 2:附加险3:其他--**[3]-[4]位等于费率类型--**（RateTypeFlag）--**[6]法定三者标志（1）的setter方法
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}	
	/**
	 * 属性地区费率因子: 0-不浮动, 1-上浮30%/地区费率因子: 0-不浮动, 1-上浮30%的getter方法
	 */
	public String getRegionRate() {
		return regionRate;
	}
	/**
	 * 属性地区费率因子: 0-不浮动, 1-上浮30%/地区费率因子: 0-不浮动, 1-上浮30%的setter方法
	 */
	public void setRegionRate(String regionRate) {
		this.regionRate = regionRate;
	}	
	/**
	 * 属性饮酒费率因子：饮酒驾驶违法次数/饮酒费率因子：饮酒驾驶违法次数的getter方法
	 */
	public Integer getDrinkRate() {
		return drinkRate;
	}
	/**
	 * 属性饮酒费率因子：饮酒驾驶违法次数/饮酒费率因子：饮酒驾驶违法次数的setter方法
	 */
	public void setDrinkRate(Integer drinkRate) {
		this.drinkRate = drinkRate;
	}	
	/**
	 * 属性醉酒费率因子：醉酒驾驶违法次数/醉酒费率因子：醉酒驾驶违法次数的getter方法
	 */
	public Integer getDrunkRate() {
		return drunkRate;
	}
	/**
	 * 属性醉酒费率因子：醉酒驾驶违法次数/醉酒费率因子：醉酒驾驶违法次数的setter方法
	 */
	public void setDrunkRate(Integer drunkRate) {
		this.drunkRate = drunkRate;
	}	
	/**
	 * 属性肉牛类型（3221肉牛险专用0122附加险借用0123附加险借用:玻璃类型）/肉牛类型（3221肉牛险专用0122附加险借用0123附加险借用:玻璃类型）的getter方法
	 */
	public String getCattleType() {
		return cattleType;
	}
	/**
	 * 属性肉牛类型（3221肉牛险专用0122附加险借用0123附加险借用:玻璃类型）/肉牛类型（3221肉牛险专用0122附加险借用0123附加险借用:玻璃类型）的setter方法
	 */
	public void setCattleType(String cattleType) {
		this.cattleType = cattleType;
	}	
	/**
	 * 属性每次事故每人赔偿限额 0122,0123附加险用到/每次事故每人赔偿限额 0122,0123附加险用到的getter方法
	 */
	public Double getUnitPersonLimitAmount() {
		return unitPersonLimitAmount;
	}
	/**
	 * 属性每次事故每人赔偿限额 0122,0123附加险用到/每次事故每人赔偿限额 0122,0123附加险用到的setter方法
	 */
	public void setUnitPersonLimitAmount(Double unitPersonLimitAmount) {
		this.unitPersonLimitAmount = unitPersonLimitAmount;
	}	
	/**
	 * 属性每人赔偿限额0123用到/每人赔偿限额0123用到的getter方法
	 */
	public Double getUnitPersonAmount() {
		return unitPersonAmount;
	}
	/**
	 * 属性每人赔偿限额0123用到/每人赔偿限额0123用到的setter方法
	 */
	public void setUnitPersonAmount(Double unitPersonAmount) {
		this.unitPersonAmount = unitPersonAmount;
	}	
	/**
	 * 属性日额：每人日额（元）2714,0123用/日额：每人日额（元）2714,0123用的getter方法
	 */
	public Double getUnitDayAmountSub() {
		return unitDayAmountSub;
	}
	/**
	 * 属性日额：每人日额（元）2714,0123用/日额：每人日额（元）2714,0123用的setter方法
	 */
	public void setUnitDayAmountSub(Double unitDayAmountSub) {
		this.unitDayAmountSub = unitDayAmountSub;
	}	
	/**
	 * 属性天数：2714附加险专用0123附加险借用/天数：2714附加险专用0123附加险借用的getter方法
	 */
	public Integer getDaySub() {
		return daySub;
	}
	/**
	 * 属性天数：2714附加险专用0123附加险借用/天数：2714附加险专用0123附加险借用的setter方法
	 */
	public void setDaySub(Integer daySub) {
		this.daySub = daySub;
	}	
	/**
	 * 属性人员类别2606险种用到/人员类别2606险种用到的getter方法
	 */
	public String getPersonType() {
		return personType;
	}
	/**
	 * 属性人员类别2606险种用到/人员类别2606险种用到的setter方法
	 */
	public void setPersonType(String personType) {
		this.personType = personType;
	}	
	/**
	 * 属性triggerPoint/triggerPoint的getter方法
	 */
	public Double getTriggerPoint() {
		return triggerPoint;
	}
	/**
	 * 属性triggerPoint/triggerPoint的setter方法
	 */
	public void setTriggerPoint(Double triggerPoint) {
		this.triggerPoint = triggerPoint;
	}	

	/**
	 * 属性病床数/病床数的getter方法
	 */
	public Integer getBedNum() {
		return bedNum;
	}
	/**
	 * 属性病床数/病床数的setter方法
	 */
	public void setBedNum(Integer bedNum) {
		this.bedNum = bedNum;
	}	
	/**
	 * 属性每张床位保险费/每张床位保险费的getter方法
	 */
	public Double getBedPremium() {
		return bedPremium;
	}
	/**
	 * 属性每张床位保险费/每张床位保险费的setter方法
	 */
	public void setBedPremium(Double bedPremium) {
		this.bedPremium = bedPremium;
	}	
	/**
	 * 属性医疗机构保费/医疗机构保费的getter方法
	 */
	public Double getHospitalPremium() {
		return hospitalPremium;
	}
	/**
	 * 属性医疗机构保费/医疗机构保费的setter方法
	 */
	public void setHospitalPremium(Double hospitalPremium) {
		this.hospitalPremium = hospitalPremium;
	}	
	/**
	 * 属性各类医务人员人数/各类医务人员人数的getter方法
	 */
	public Integer getKindWorkerNum() {
		return kindWorkerNum;
	}
	/**
	 * 属性各类医务人员人数/各类医务人员人数的setter方法
	 */
	public void setKindWorkerNum(Integer kindWorkerNum) {
		this.kindWorkerNum = kindWorkerNum;
	}	
	/**
	 * 属性各类医务人员每人保费/各类医务人员每人保费的getter方法
	 */
	public Double getKindWorkerPremium() {
		return kindWorkerPremium;
	}
	/**
	 * 属性各类医务人员每人保费/各类医务人员每人保费的setter方法
	 */
	public void setKindWorkerPremium(Double kindWorkerPremium) {
		this.kindWorkerPremium = kindWorkerPremium;
	}	
	/**
	 * 属性临床手术科室医师人数/临床手术科室医师人数的getter方法
	 */
	public Integer getClinicNum() {
		return clinicNum;
	}
	/**
	 * 属性临床手术科室医师人数/临床手术科室医师人数的setter方法
	 */
	public void setClinicNum(Integer clinicNum) {
		this.clinicNum = clinicNum;
	}	
	/**
	 * 属性临床手术科室医师每人保费/临床手术科室医师每人保费的getter方法
	 */
	public Double getClinicPremium() {
		return clinicPremium;
	}
	/**
	 * 属性临床手术科室医师每人保费/临床手术科室医师每人保费的setter方法
	 */
	public void setClinicPremium(Double clinicPremium) {
		this.clinicPremium = clinicPremium;
	}	

	/**
	 * 属性医技科室人数/医技科室人数的getter方法
	 */
	public Integer getRoomNum() {
		return roomNum;
	}
	/**
	 * 属性医技科室人数/医技科室人数的setter方法
	 */
	public void setRoomNum(Integer roomNum) {
		this.roomNum = roomNum;
	}	
	/**
	 * 属性医技科室每人保费/医技科室每人保费的getter方法
	 */
	public Double getRoomPremium() {
		return roomPremium;
	}
	/**
	 * 属性医技科室每人保费/医技科室每人保费的setter方法
	 */
	public void setRoomPremium(Double roomPremium) {
		this.roomPremium = roomPremium;
	}	
	/**
	 * 属性护士人数/护士人数的getter方法
	 */
	public Integer getNurseNum() {
		return nurseNum;
	}
	/**
	 * 属性护士人数/护士人数的setter方法
	 */
	public void setNurseNum(Integer nurseNum) {
		this.nurseNum = nurseNum;
	}	
	/**
	 * 属性护士每人保费/护士每人保费的getter方法
	 */
	public Double getNursePremium() {
		return nursePremium;
	}
	/**
	 * 属性护士每人保费/护士每人保费的setter方法
	 */
	public void setNursePremium(Double nursePremium) {
		this.nursePremium = nursePremium;
	}	
	/**
	 * 属性医务人员保费/医务人员保费的getter方法
	 */
	public Double getWorkerPremium() {
		return workerPremium;
	}
	/**
	 * 属性医务人员保费/医务人员保费的setter方法
	 */
	public void setWorkerPremium(Double workerPremium) {
		this.workerPremium = workerPremium;
	}	
	/**
	 * 属性医务人员人数/医务人员人数的getter方法
	 */
	public Integer getWorkerNum() {
		return workerNum;
	}
	/**
	 * 属性医务人员人数/医务人员人数的setter方法
	 */
	public void setWorkerNum(Integer workerNum) {
		this.workerNum = workerNum;
	}

	public Double getQuantityNewborn() {
		return quantityNewborn;
	}

	public void setQuantityNewborn(Double quantityNewborn) {
		this.quantityNewborn = quantityNewborn;
	}

	public String getChargeNewbornFlag() {
		return chargeNewbornFlag;
	}

	public void setChargeNewbornFlag(String chargeNewbornFlag) {
		this.chargeNewbornFlag = chargeNewbornFlag;
	}

	/**
	 * 属性单位保费/单位保费的getter方法
	 */
	public Double getUnitPremium() {
		return unitPremium;
	}
	/**
	 * 属性单位保费/单位保费的setter方法
	 */
	public void setUnitPremium(Double unitPremium) {
		this.unitPremium = unitPremium;
	}	
	/**
	 * 属性住院病人手术人次/住院病人手术人次的getter方法
	 */
	public Integer getOperationNum() {
		return operationNum;
	}
	/**
	 * 属性住院病人手术人次/住院病人手术人次的setter方法
	 */
	public void setOperationNum(Integer operationNum) {
		this.operationNum = operationNum;
	}	
	/**
	 * 属性住院病人手术人次基准保险费/住院病人手术人次基准保险费的getter方法
	 */
	public Double getOperationPremium() {
		return operationPremium;
	}
	/**
	 * 属性住院病人手术人次基准保险费/住院病人手术人次基准保险费的setter方法
	 */
	public void setOperationPremium(Double operationPremium) {
		this.operationPremium = operationPremium;
	}	
	/**
	 * 属性医疗机构类别系数/医疗机构类别系数的getter方法
	 */
	public Double getMedicalRate() {
		return medicalRate;
	}
	/**
	 * 属性医疗机构类别系数/医疗机构类别系数的setter方法
	 */
	public void setMedicalRate(Double medicalRate) {
		this.medicalRate = medicalRate;
	}	
	/**
	 * 属性岗位系数/岗位系数的getter方法
	 */
	public Double getPostRate() {
		return postRate;
	}
	/**
	 * 属性岗位系数/岗位系数的setter方法
	 */
	public void setPostRate(Double postRate) {
		this.postRate = postRate;
	}	
	/**
	 * 属性deductibleValue/deductibleValue的getter方法
	 */
	public Double getDeductibleValue() {
		return deductibleValue;
	}
	/**
	 * 属性deductibleValue/deductibleValue的setter方法
	 */
	public void setDeductibleValue(Double deductibleValue) {
		this.deductibleValue = deductibleValue;
	}	
	/**
	 * 属性deductibleDiscount/deductibleDiscount的getter方法
	 */
	public Double getDeductibleDiscount() {
		return deductibleDiscount;
	}
	/**
	 * 属性deductibleDiscount/deductibleDiscount的setter方法
	 */
	public void setDeductibleDiscount(Double deductibleDiscount) {
		this.deductibleDiscount = deductibleDiscount;
	}	

	/**
	 * 属性guestAmount/guestAmount的getter方法
	 */
	public Double getGuestAmount() {
		return guestAmount;
	}
	/**
	 * 属性guestAmount/guestAmount的setter方法
	 */
	public void setGuestAmount(Double guestAmount) {
		this.guestAmount = guestAmount;
	}	
	/**
	 * 属性driverAmount/driverAmount的getter方法
	 */
	public Double getDriverAmount() {
		return driverAmount;
	}
	/**
	 * 属性driverAmount/driverAmount的setter方法
	 */
	public void setDriverAmount(Double driverAmount) {
		this.driverAmount = driverAmount;
	}	
	/**
	 * 属性thirdPeopleAmount/thirdPeopleAmount的getter方法
	 */
	public Double getThirdPeopleAmount() {
		return thirdPeopleAmount;
	}
	/**
	 * 属性thirdPeopleAmount/thirdPeopleAmount的setter方法
	 */
	public void setThirdPeopleAmount(Double thirdPeopleAmount) {
		this.thirdPeopleAmount = thirdPeopleAmount;
	}	
	/**
	 * 属性isSpecGlass/isSpecGlass的getter方法
	 */
	public String getIsSpecGlass() {
		return isSpecGlass;
	}
	/**
	 * 属性isSpecGlass/isSpecGlass的setter方法
	 */
	public void setIsSpecGlass(String isSpecGlass) {
		this.isSpecGlass = isSpecGlass;
	}	
	/**
	 * 属性kindPremiumm/kindPremiumm的getter方法
	 */
	public Double getKindPremiumm() {
		return kindPremiumm;
	}
	/**
	 * 属性kindPremiumm/kindPremiumm的setter方法
	 */
	public void setKindPremiumm(Double kindPremiumm) {
		this.kindPremiumm = kindPremiumm;
	}	
	/**
	 * 属性treeBurst/treeBurst的getter方法
	 */
	public String getTreeBurst() {
		return treeBurst;
	}
	/**
	 * 属性treeBurst/treeBurst的setter方法
	 */
	public void setTreeBurst(String treeBurst) {
		this.treeBurst = treeBurst;
	}	
	/**
	 * 属性treeHigh/treeHigh的getter方法
	 */
	public String getTreeHigh() {
		return treeHigh;
	}
	/**
	 * 属性treeHigh/treeHigh的setter方法
	 */
	public void setTreeHigh(String treeHigh) {
		this.treeHigh = treeHigh;
	}	
	/**
	 * 属性treeKindName/treeKindName的getter方法
	 */
	public String getTreeKindName() {
		return treeKindName;
	}
	/**
	 * 属性treeKindName/treeKindName的setter方法
	 */
	public void setTreeKindName(String treeKindName) {
		this.treeKindName = treeKindName;
	}	
	/**
	 * 属性growTime/growTime的getter方法
	 */
	public String getGrowTime() {
		return growTime;
	}
	/**
	 * 属性growTime/growTime的setter方法
	 */
	public void setGrowTime(String growTime) {
		this.growTime = growTime;
	}	
	/**
	 * 属性latitude/latitude的getter方法
	 */
	public String getLatitude() {
		return latitude;
	}
	/**
	 * 属性latitude/latitude的setter方法
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}	
	/**
	 * 属性longitude/longitude的getter方法
	 */
	public String getLongitude() {
		return longitude;
	}
	/**
	 * 属性longitude/longitude的setter方法
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}	
	/**
	 * 属性insuranceType/insuranceType的getter方法
	 */
	public String getInsuranceType() {
		return insuranceType;
	}
	/**
	 * 属性insuranceType/insuranceType的setter方法
	 */
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}	
	/**
	 * 属性unitHarvest/unitHarvest的getter方法
	 */
	public String getUnitHarvest() {
		return unitHarvest;
	}
	/**
	 * 属性unitHarvest/unitHarvest的setter方法
	 */
	public void setUnitHarvest(String unitHarvest) {
		this.unitHarvest = unitHarvest;
	}	
	/**
	 * 属性harvest/harvest的getter方法
	 */
	public String getHarvest() {
		return harvest;
	}
	/**
	 * 属性harvest/harvest的setter方法
	 */
	public void setHarvest(String harvest) {
		this.harvest = harvest;
	}	
	/**
	 * 属性unitOtherAmount/unitOtherAmount的getter方法
	 */
	public String getUnitOtherAmount() {
		return unitOtherAmount;
	}
	/**
	 * 属性unitOtherAmount/unitOtherAmount的setter方法
	 */
	public void setUnitOtherAmount(String unitOtherAmount) {
		this.unitOtherAmount = unitOtherAmount;
	}	
	/**
	 * 属性agreePrice/agreePrice的getter方法
	 */
	public String getAgreePrice() {
		return agreePrice;
	}
	/**
	 * 属性agreePrice/agreePrice的setter方法
	 */
	public void setAgreePrice(String agreePrice) {
		this.agreePrice = agreePrice;
	}	
	/**
	 * 属性realInputDate/realInputDate的getter方法
	 */
	public String getRealInputDate() {
		return realInputDate;
	}
	/**
	 * 属性realInputDate/realInputDate的setter方法
	 */
	public void setRealInputDate(String realInputDate) {
		this.realInputDate = realInputDate;
	}	
	/**
	 * 属性structureNo/structureNo的getter方法
	 */
	public Integer getStructureNo() {
		return structureNo;
	}
	/**
	 * 属性structureNo/structureNo的setter方法
	 */
	public void setStructureNo(Integer structureNo) {
		this.structureNo = structureNo;
	}	
	/**
	 * 属性specialCharge/specialCharge的getter方法
	 */
	public Double getSpecialCharge() {
		return specialCharge;
	}
	/**
	 * 属性specialCharge/specialCharge的setter方法
	 */
	public void setSpecialCharge(Double specialCharge) {
		this.specialCharge = specialCharge;
	}	
	/**
	 * 属性stabilityFund/stabilityFund的getter方法
	 */
	public Double getStabilityFund() {
		return stabilityFund;
	}
	/**
	 * 属性stabilityFund/stabilityFund的setter方法
	 */
	public void setStabilityFund(Double stabilityFund) {
		this.stabilityFund = stabilityFund;
	}	
	/**
	 * 属性stabilityFundRate/stabilityFundRate的getter方法
	 */
	public Double getStabilityFundRate() {
		return stabilityFundRate;
	}
	/**
	 * 属性stabilityFundRate/stabilityFundRate的setter方法
	 */
	public void setStabilityFundRate(Double stabilityFundRate) {
		this.stabilityFundRate = stabilityFundRate;
	}	
	/**
	 * 属性storageRate/storageRate的getter方法
	 */
	public String getStorageRate() {
		return storageRate;
	}

	public void setStorageRate(String storageRate) {
		this.storageRate = storageRate;
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
	 * 属性currency3/currency3的getter方法
	 */
	public String getCurrency2() {
		return currency2;
	}
	/**
	 * 属性currency3/currency3的setter方法
	 */
	public void setCurrency2(String currency2) {
		this.currency2 = currency2;
	}	
	/**
	 * 属性deductibleType/deductibleType的getter方法
	 */
	public String getDeductibleType() {
		return deductibleType;
	}
	/**
	 * 属性deductibleType/deductibleType的setter方法
	 */
	public void setDeductibleType(String deductibleType) {
		this.deductibleType = deductibleType;
	}	
	/**
	 * 属性discountCharge/discountCharge的getter方法
	 */
	public Double getDiscountCharge() {
		return discountCharge;
	}
	/**
	 * 属性discountCharge/discountCharge的setter方法
	 */
	public void setDiscountCharge(Double discountCharge) {
		this.discountCharge = discountCharge;
	}	
	/**
	 * 属性endorType/endorType的getter方法
	 */
	public String getEndorType() {
		return endorType;
	}
	/**
	 * 属性endorType/endorType的setter方法
	 */
	public void setEndorType(String endorType) {
		this.endorType = endorType;
	}	
	/**
	 * 属性exchangeRate3/exchangeRate3的getter方法
	 */
	public Double getExchangeRate2() {
		return exchangeRate2;
	}
	/**
	 * 属性exchangeRate3/exchangeRate3的setter方法
	 */
	public void setExchangeRate2(Double exchangeRate2) {
		this.exchangeRate2 = exchangeRate2;
	}	

	/**
	 * 属性insuredValueType/insuredValueType的getter方法
	 */
	public String getInsuredValueType() {
		return insuredValueType;
	}
	/**
	 * 属性insuredValueType/insuredValueType的setter方法
	 */
	public void setInsuredValueType(String insuredValueType) {
		this.insuredValueType = insuredValueType;
	}	
	/**
	 * 属性insuredValueTypeName/insuredValueTypeName的getter方法
	 */
	public String getInsuredValueTypeName() {
		return insuredValueTypeName;
	}
	/**
	 * 属性insuredValueTypeName/insuredValueTypeName的setter方法
	 */
	public void setInsuredValueTypeName(String insuredValueTypeName) {
		this.insuredValueTypeName = insuredValueTypeName;
	}	
	/**
	 * 属性lastPurePremium/lastPurePremium的getter方法
	 */
	public Double getLastPurePremium() {
		return lastPurePremium;
	}
	/**
	 * 属性lastPurePremium/lastPurePremium的setter方法
	 */
	public void setLastPurePremium(Double lastPurePremium) {
		this.lastPurePremium = lastPurePremium;
	}	
	/**
	 * 属性lowerRate/lowerRate的getter方法
	 */
	public String getLowerRate() {
		return lowerRate;
	}
	/**
	 * 属性lowerRate/lowerRate的setter方法
	 */
	public void setLowerRate(String lowerRate) {
		this.lowerRate = lowerRate;
	}	
	/**
	 * 属性manageCharge/manageCharge的getter方法
	 */
	public Double getManageCharge() {
		return manageCharge;
	}
	/**
	 * 属性manageCharge/manageCharge的setter方法
	 */
	public void setManageCharge(Double manageCharge) {
		this.manageCharge = manageCharge;
	}	
	/**
	 * 属性motorRate/motorRate的getter方法
	 */
	public Double getMotorRate() {
		return motorRate;
	}
	/**
	 * 属性motorRate/motorRate的setter方法
	 */
	public void setMotorRate(Double motorRate) {
		this.motorRate = motorRate;
	}

	public Date getNewEndDate() {
		return newEndDate;
	}

	public void setNewEndDate(Date newEndDate) {
		this.newEndDate = newEndDate;
	}

	/**
	 * 属性newStartDate/newStartDate的getter方法
	 */
	public Date getNewStartDate() {
		return newStartDate;
	}
	/**
	 * 属性newStartDate/newStartDate的setter方法
	 */
	public void setNewStartDate(Date newStartDate) {
		this.newStartDate = newStartDate;
	}	
	/**
	 * 属性premium3/premium3的getter方法
	 */
	public Double getPremium2() {
		return premium2;
	}
	/**
	 * 属性premium3/premium3的setter方法
	 */
	public void setPremium2(Double premium2) {
		this.premium2 = premium2;
	}	

	/**
	 * 属性productCode/productCode的getter方法
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * 属性productCode/productCode的setter方法
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}	
	/**
	 * 属性profitScale/profitScale的getter方法
	 */
	public Double getProfitScale() {
		return profitScale;
	}
	/**
	 * 属性profitScale/profitScale的setter方法
	 */
	public void setProfitScale(Double profitScale) {
		this.profitScale = profitScale;
	}	
	/**
	 * 属性purePremium/purePremium的getter方法
	 */
	public Double getPurePremium() {
		return purePremium;
	}
	/**
	 * 属性purePremium/purePremium的setter方法
	 */
	public void setPurePremium(Double purePremium) {
		this.purePremium = purePremium;
	}	
	/**
	 * 属性rateType/rateType的getter方法
	 */
	public String getRateType() {
		return rateType;
	}
	/**
	 * 属性rateType/rateType的setter方法
	 */
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}	
	/**
	 * 属性rateValidDate/rateValidDate的getter方法
	 */
	public String getRateValidDate() {
		return rateValidDate;
	}
	/**
	 * 属性rateValidDate/rateValidDate的setter方法
	 */
	public void setRateValidDate(String rateValidDate) {
		this.rateValidDate = rateValidDate;
	}	
	/**
	 * 属性reliefFund/reliefFund的getter方法
	 */
	public Double getReliefFund() {
		return reliefFund;
	}
	/**
	 * 属性reliefFund/reliefFund的setter方法
	 */
	public void setReliefFund(Double reliefFund) {
		this.reliefFund = reliefFund;
	}	
	/**
	 * 属性reliefFundRate/reliefFundRate的getter方法
	 */
	public Double getReliefFundRate() {
		return reliefFundRate;
	}
	/**
	 * 属性reliefFundRate/reliefFundRate的setter方法
	 */
	public void setReliefFundRate(Double reliefFundRate) {
		this.reliefFundRate = reliefFundRate;
	}	
	/**
	 * 属性replyNo/replyNo的getter方法
	 */
	public String getReplyNo() {
		return replyNo;
	}
	/**
	 * 属性replyNo/replyNo的setter方法
	 */
	public void setReplyNo(String replyNo) {
		this.replyNo = replyNo;
	}	
	/**
	 * 属性不含税保费/不含税保费的getter方法
	 */
	public Double getNoTaxPremium() {
		return noTaxPremium;
	}
	/**
	 * 属性不含税保费/不含税保费的setter方法
	 */
	public void setNoTaxPremium(Double noTaxPremium) {
		this.noTaxPremium = noTaxPremium;
	}	
	/**
	 * 属性应/免税标识，1-应税，2-免税/应/免税标识，1-应税，2-免税的getter方法
	 */
	public String getTaxFlag() {
		return taxFlag;
	}
	/**
	 * 属性应/免税标识，1-应税，2-免税/应/免税标识，1-应税，2-免税的setter方法
	 */
	public void setTaxFlag(String taxFlag) {
		this.taxFlag = taxFlag;
	}	
	/**
	 * 属性税率/税率的getter方法
	 */
	public Double getTaxRate() {
		return taxRate;
	}
	/**
	 * 属性税率/税率的setter方法
	 */
	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}	
	/**
	 * 属性税额/税额的getter方法
	 */
	public Double getTaxFee() {
		return taxFee;
	}
	/**
	 * 属性税额/税额的setter方法
	 */
	public void setTaxFee(Double taxFee) {
		this.taxFee = taxFee;
	}	
	/**
	 * 属性保费计算方式/保费计算方式的getter方法
	 */
	public String getPremiumCalMethod() {
		return premiumCalMethod;
	}
	/**
	 * 属性保费计算方式/保费计算方式的setter方法
	 */
	public void setPremiumCalMethod(String premiumCalMethod) {
		this.premiumCalMethod = premiumCalMethod;
	}	
	/**
	 * 属性林木用途/林木用途的getter方法
	 */
	public String getForestUse() {
		return forestUse;
	}
	/**
	 * 属性林木用途/林木用途的setter方法
	 */
	public void setForestUse(String forestUse) {
		this.forestUse = forestUse;
	}


	public Double getBenchmarkPremium() {
		return benchmarkPremium;
	}

	public void setBenchmarkPremium(Double benchmarkPremium) {
		this.benchmarkPremium = benchmarkPremium;
	}

	public Double getTotalLossRatio() {
		return totalLossRatio;
	}

	public void setTotalLossRatio(Double totalLossRatio) {
		this.totalLossRatio = totalLossRatio;
	}

	public Double getLawsuitAmount() {
		return lawsuitAmount;
	}

	public void setLawsuitAmount(Double lawsuitAmount) {
		this.lawsuitAmount = lawsuitAmount;
	}

	public Integer getnClinicNum() {
		return nClinicNum;
	}

	public void setnClinicNum(Integer nClinicNum) {
		this.nClinicNum = nClinicNum;
	}

	public Double getnClinicPremium() {
		return nClinicPremium;
	}

	public void setnClinicPremium(Double nClinicPremium) {
		this.nClinicPremium = nClinicPremium;
	}

	public Double getKindBenchmarkPremiumm() {
		return kindBenchmarkPremiumm;
	}

	public void setKindBenchmarkPremiumm(Double kindBenchmarkPremiumm) {
		this.kindBenchmarkPremiumm = kindBenchmarkPremiumm;
	}

	public Double getExchangeRateCNY() {
		return exchangeRateCNY;
	}

	public void setExchangeRateCNY(Double exchangeRateCNY) {
		this.exchangeRateCNY = exchangeRateCNY;
	}

	public Double getPremiumCNY() {
		return premiumCNY;
	}

	public void setPremiumCNY(Double premiumCNY) {
		this.premiumCNY = premiumCNY;
	}
}
