package com.bjike.goddess.intromanage.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.intromanage.bo.MainBusinessIntroBO;
import com.bjike.goddess.intromanage.dto.MainBusinessIntroDTO;
import com.bjike.goddess.intromanage.entity.MainBusinessIntro;
import com.bjike.goddess.intromanage.to.MainBusinessIntroTO;

import java.util.List;

/**
 * 主业介绍业务接口
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-03-27 05:41 ]
 * @Description: [  ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface MainBusinessIntroSer extends Ser<MainBusinessIntro, MainBusinessIntroDTO> {

    /**
     * 分页查询主业业务
     *
     * @return class MainBusinessIntroBO
     * @throws SerException
     */
    List<MainBusinessIntroBO> list(MainBusinessIntroDTO dto) throws SerException;

    /**
     * 保存主业业务
     *
     * @param to 主业业务to
     * @return class MainBusinessIntroBO
     * @throws SerException
     */
    MainBusinessIntroBO save(MainBusinessIntroTO to) throws SerException;

    /**
     * 根据id删除主业业务
     *
     * @param id 主业业务唯一标识
     * @throws SerException
     */
    void remove(String id) throws SerException;

    /**
     * 更新主业业务
     *
     * @param to 主业业务to
     * @throws SerException
     */
    void update(MainBusinessIntroTO to) throws SerException;

}