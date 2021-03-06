package com.sinosoft.dms.api.dict;

import com.sinosoft.dms.api.DMSConstant;
import com.sinosoft.dms.api.dict.dto.PrpCountryCodeDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-10-28 10:28:12.446 
 * @description prpCountryCodeApi接口
 */
@FeignClient(name = DMSConstant.DMS_SERVICE_NAME, path = PrpCountryCodeApi.PATH)
public interface PrpCountryCodeApi {

    public static final String PATH = "prpCountryCode";

    /**
     *@description 新增
     *@param
     */
    @RequestMapping(value = "save",method = {RequestMethod.POST})
    void save(PrpCountryCodeDto prpCountryCodeDto);

    /**
     *@description 删除
     *@param
     */
    @RequestMapping(value = "remove",method = {RequestMethod.POST})
    void remove(String codeCode);
    /**
     *@description 修改
     *@param
     */
    @RequestMapping(value = "modify",method = {RequestMethod.POST})
    void modify(PrpCountryCodeDto prpCountryCodeDto);
    /**
     *@description 按主键查询实体
     *@param 
     */
    @RequestMapping(value = "queryByPK",method = {RequestMethod.POST})
    PrpCountryCodeDto queryByPK(String codeCode);
    /**
     * codeType和feildExt查询归属机构信息
     * @author: 王保良
     * @date: 2017/11/16 17:46
     * @param map 中的codeType 代码种类
     * @param map 中的feildExt 上级区域代码
     * @return 返回的是满足条件的PrpDcode实体类对象
     * @throws Exception
     */
    @RequestMapping(value = "queryAreasProvinceInfo",method = {RequestMethod.POST})
    public List<PrpCountryCodeDto> queryAreasProvinceInfo(@RequestBody Map<String, String> map);
    /**
     * @description 按CodeCode查询实体
     * @param codeCode 代码
     * @return PrpCountryCodeDto
     * @author 王心洋
     * @time 2018-01-04
     */
    @RequestMapping(value = "queryByCodeCode",method = {RequestMethod.POST})
    PrpCountryCodeDto queryByCodeCode(@RequestParam("codeCode") String codeCode);
}