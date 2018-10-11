package com.sinosoft.agriclaim.core.prepaymanage.service;


import com.sinosoft.agriclaim.api.prepaymanage.dto.PrpLArrearageDto;
import com.sinosoft.framework.dto.PageInfo;

import java.util.List;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-08 05:44:02.119 
 * @description 逾款欠款清单表Core接口
 */
public interface PrpLArrearageService {

    /**
     *@description 新增
     *@param
     */
    void save(PrpLArrearageDto prpLArrearageDto);

    /**
     *@description 删除
     *@param
     */
    void remove(String policyNo,java.util.Date arrearageEndDate);
    /**
     *@description 修改
     *@param
     */
    void modify(PrpLArrearageDto prpLArrearageDto);
    /**
     *@description 按主键查询实体
     *@param 
     */
    PrpLArrearageDto queryByPK(String policyNo,java.util.Date arrearageEndDate);
}