package com.sinosoft.dms.core.dict.dao;

import com.sinosoft.dms.core.dict.entity.UtiAdminProvince;
import com.sinosoft.dms.core.dict.entity.UtiAdminProvinceKey;
import com.sinosoft.framework.core.dao.JpaBaseDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-05 01:02:29.563 
 * UtiAdminProvinceDao数据操作对象
 */
@Repository
public interface UtiAdminProvinceDao extends JpaBaseDao<UtiAdminProvince,UtiAdminProvinceKey> {
}