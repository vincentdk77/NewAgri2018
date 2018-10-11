package com.sinosoft.pms.core.kernel.service.impl;

import com.sinosoft.pms.api.kernel.dto.PrpDclauseEngageDto;
import com.sinosoft.pms.core.kernel.dao.PrpDclauseEngageDao;
import com.sinosoft.pms.core.kernel.entity.PrpDclauseEngage;
import com.sinosoft.pms.core.kernel.entity.PrpDclauseEngageKey;
import com.sinosoft.pms.core.kernel.service.PrpDclauseEngageService;
import com.sinosoft.framework.core.dao.support.Specifications;
import com.sinosoft.framework.core.service.impl.BaseServiceImpl;
import com.sinosoft.framework.dto.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-08-22 03:00:50.124 
 * @description 条款特别约定表Core接口实现
 */
@Service
public class PrpDclauseEngageServiceImpl extends BaseServiceImpl implements PrpDclauseEngageService {
	/** log日志 */
    private static final Logger LOGGER = LoggerFactory.getLogger(PrpDclauseEngageServiceImpl.class);
    
    @Autowired
    private PrpDclauseEngageDao prpDclauseEngageDao;

    /**
     *@description 新增
     *@param
     */
    public void save(PrpDclauseEngageDto prpDclauseEngageDto) {
        PrpDclauseEngage prpDclauseEngage = this.convert(prpDclauseEngageDto, PrpDclauseEngage.class);
        prpDclauseEngageDao.save(prpDclauseEngage);
    }
    /**
     *@description 删除
     *@param
     */
    public void remove(String clauseCode,String engageCode) {
        PrpDclauseEngageKey prpDclauseEngageKey = new PrpDclauseEngageKey(clauseCode,engageCode);
        prpDclauseEngageDao.delete(prpDclauseEngageKey);
    }
    /**
     *@description 修改
     *@param
     */
    public void modify(PrpDclauseEngageDto prpDclauseEngageDto) {
        PrpDclauseEngage prpDclauseEngage = this.convert(prpDclauseEngageDto, PrpDclauseEngage.class);
        prpDclauseEngageDao.save(prpDclauseEngage);
    }
    /**
     *@description 按主键查询实体
     *@param 
     */
    public PrpDclauseEngageDto queryByPK(String clauseCode,String engageCode) {
        PrpDclauseEngageKey prpDclauseEngageKey = new PrpDclauseEngageKey(clauseCode,engageCode);
        PrpDclauseEngage prpDclauseEngage = prpDclauseEngageDao.findOne(prpDclauseEngageKey);
        return this.convert(prpDclauseEngage,PrpDclauseEngageDto.class);
    }
}