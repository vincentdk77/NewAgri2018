package com.sinosoft.pms.core.kernel.service.impl;

import com.sinosoft.pms.api.kernel.dto.PrpDriskNoDto;
import com.sinosoft.pms.core.kernel.dao.PrpDriskNoDao;
import com.sinosoft.pms.core.kernel.entity.PrpDriskNo;
import com.sinosoft.pms.core.kernel.entity.PrpDriskNoKey;
import com.sinosoft.pms.core.kernel.service.PrpDriskNoService;
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
 * @description 产品临时代码表Core接口实现
 */
@Service
public class PrpDriskNoServiceImpl extends BaseServiceImpl implements PrpDriskNoService {
	/** log日志 */
    private static final Logger LOGGER = LoggerFactory.getLogger(PrpDriskNoServiceImpl.class);
    
    @Autowired
    private PrpDriskNoDao prpDriskNoDao;

    /**
     *@description 新增
     *@param
     */
    public void save(PrpDriskNoDto prpDriskNoDto) {
        PrpDriskNo prpDriskNo = this.convert(prpDriskNoDto, PrpDriskNo.class);
        prpDriskNoDao.save(prpDriskNo);
    }
    /**
     *@description 删除
     *@param
     */
    public void remove(String id) {
        PrpDriskNoKey prpDriskNoKey = new PrpDriskNoKey(id);
        prpDriskNoDao.delete(prpDriskNoKey);
    }
    /**
     *@description 修改
     *@param
     */
    public void modify(PrpDriskNoDto prpDriskNoDto) {
        PrpDriskNo prpDriskNo = this.convert(prpDriskNoDto, PrpDriskNo.class);
        prpDriskNoDao.save(prpDriskNo);
    }
    /**
     *@description 按主键查询实体
     *@param 
     */
    public PrpDriskNoDto queryByPK(String id) {
        PrpDriskNoKey prpDriskNoKey = new PrpDriskNoKey(id);
        PrpDriskNo prpDriskNo = prpDriskNoDao.findOne(prpDriskNoKey);
        return this.convert(prpDriskNo,PrpDriskNoDto.class);
    }
}