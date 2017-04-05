package com.bjike.goddess.businessinteraction.service;

import com.bjike.goddess.businessinteraction.bo.LeavingMessageBO;
import com.bjike.goddess.businessinteraction.to.LeavingMessageTO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.businessinteraction.entity.LeavingMessage;
import com.bjike.goddess.businessinteraction.dto.LeavingMessageDTO;

import java.util.List;

/**
 * 留言业务接口
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-03-28 03:11 ]
 * @Description: [ 留言业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface LeavingMessageSer extends Ser<LeavingMessage, LeavingMessageDTO> {

    /**
     * 留言列表
     * @return class LeavingMessageBO
     */
    default List<LeavingMessageBO> listLeavingMessage(String interactionId ) throws SerException {return null;}
    /**
     *  添加
     * @param leavingMessageTO 留言信息
     * @return class LeavingMessageBO
     */
    default LeavingMessageBO addLeavingMessage(LeavingMessageTO leavingMessageTO) throws SerException { return null;}

    /**
     *  编辑
     * @param leavingMessageTO 留言信息
     * @return class LeavingMessageBO
     */
    default LeavingMessageBO editLeavingMessage(LeavingMessageTO leavingMessageTO) throws SerException { return null;}

    /**
     * 删除留言信息
     * @param id id
     */
    default void deleteLeavingMessage(String id ) throws SerException {return;};
}