package com.bjike.goddess.oilcardmanage.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.oilcardmanage.bo.OilCardBasicBO;
import com.bjike.goddess.oilcardmanage.dto.OilCardBasicDTO;
import com.bjike.goddess.oilcardmanage.to.OilCardBasicTO;

import java.util.List;

/**
 * 油卡基本信息对外提供接口
 * @Author: [Jason]
 * @Date: [17-3-13 上午11:12]
 * @Package:[ com.bjike.goddess.com.bjike.goddess.oilcardmanage.api ]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public interface OilCardBasicAPI {

    /**
     * 新增油卡基本信息
     * @param to 油卡基本信息
     * @return   油卡基本信息
     * @throws SerException 新增业务异常
     */
    OilCardBasicBO saveOilCarBasic(OilCardBasicTO to) throws SerException;

    /**
     * 编辑油卡基本信息
     * @param to 油卡基本信息
     * @return   油卡基本信息
     * @throws SerException
     */
    OilCardBasicBO updateOilCardBasic(OilCardBasicTO to) throws SerException;

    /**
     * 冻结油卡基本信息
     * @param id 油卡信息记录Id
     * @throws SerException 冻结油卡记录业务异常
     */
    void freezeOilCardBasic(String id) throws SerException;

    /**
     * 解冻油卡基本信息
     * @param id 油卡信息记录Id
     * @throws SerException 解冻油卡记录业务异常
     */
    void breakFreeze(String id) throws SerException;

    /**
     * 删除油卡基本信息
     * @param id 删除信息记录Id
     * @throws SerException 删除油卡记录业务异常
     */
    void deleteOilCardBasic(String id) throws SerException;


    /**
     * 分页查询
     * @param dto 查询条件
     * @throws SerException 分页查询业务异常
     */
    List<OilCardBasicBO> pageList(OilCardBasicDTO dto) throws SerException;
}