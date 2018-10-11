package com.sinosoft.dms.core.bill.utils;


import com.sinosoft.dms.core.common.enums.DmsErrorEnum;
import com.sinosoft.framework.core.utils.StringUtils;

import org.springframework.stereotype.Service;

/**
* @description （单号生成入参参数校验）
* @author dongyingchun
* @date 2016年9月14日下午2:50:10
*/
@Service
public class BillRequestDataCheck {
	
	
	/**
	* @description （校验存入参数的准确性）
	* @param riskCode  险种
	* @param comCode  机构编码(需要大雨6位，截取3,6位)
	* @return
	* @author dongyingchun
	* @throws Exception 
	* @date 2016年9月14日下午2:52:03
	*/
	public final static void checkDataValid(String riskCode, String comCode) throws Exception{
		//判断险种位四位  //判断机构编码大于6位
		if(riskCode.length() != 3 || comCode.length() < 7){
//			billDto.setResultCode(DmsErrorEnum.DMS_ERROR_1003.getCode());
//			billDto.setResultCode(DmsErrorEnum.DMS_ERROR_1003.getName());
//			return billDto;
			throw new Exception("错误代码："+DmsErrorEnum.DMS_ERROR_1003.getCode()+" 错误原因："+DmsErrorEnum.DMS_ERROR_1003.getName());
		}
	}
	
	
	/**
	 * 校验获取客户编码入参正确性
	 * @param billType
	 * @return
	 */
	public final static void checkCustomValid(String billType) throws Exception{
		//判断险种位四位  //判断机构编码大于6位
		if(",customerCode_1,customerCode_2,".indexOf(billType) == -1){
//			billDto.setResultCode(DmsErrorEnum.DMS_ERROR_1004.getCode());
//			billDto.setResultCode(DmsErrorEnum.DMS_ERROR_1004.getName());
//			return billDto;
			throw new Exception("错误代码："+DmsErrorEnum.DMS_ERROR_1004.getCode()+" 错误原因："+DmsErrorEnum.DMS_ERROR_1004.getName());
		}
	}
	
	
	/**
	 * 校验传入的单号前缀是否可用
	 * @param perfix
	 * @return
	 */
	public final static void checkPerfix(String perfix) throws Exception{
		if(!StringUtils.isEmpty(perfix) && perfix.length() == 1){
			return;
		}else{
			throw new Exception("错误代码："+DmsErrorEnum.DMS_ERROR_1005.getCode()+" 错误原因："+DmsErrorEnum.DMS_ERROR_1005.getName());
		}
	}
}
