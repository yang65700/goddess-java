package com.bjike.goddess.checkhost.action.checkhost;

import com.bjike.goddess.checkhost.api.HostApplyAPI;
import com.bjike.goddess.checkhost.bo.HostApplyBO;
import com.bjike.goddess.checkhost.dto.HostApplyDTO;
import com.bjike.goddess.checkhost.to.HostApplyTO;
import com.bjike.goddess.checkhost.vo.HostApplyVO;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 离宿申请
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-04-11 04:51 ]
 * @Description: [ 离宿申请 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("hostapply")
public class HostApplyAction {
    @Autowired
    private HostApplyAPI hostApplyAPI;
    /**
     * 获取离宿申请
     *
     * @param hostApplyDTO 离宿申请dto
     * @return class HostApplyVO
     * @des 获取所有离宿申请
     * @version v1
     */
    @GetMapping("v1/listHostApply")
    public Result findListHostApply(HostApplyDTO hostApplyDTO) throws ActException {
        try {
            List<HostApplyVO> hostApplyVOS = BeanTransform.copyProperties
                    (hostApplyAPI.findListHostApply(hostApplyDTO),HostApplyVO.class);
            return ActResult.initialize(hostApplyVOS);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 添加离宿申请
     *
     * @param hostApplyTO 离宿申请数据to
     * @return class HostApplyVO
     * @des 添加离宿申请
     * @version v1
     */
    @PostMapping("v1/add")
    public Result addHostApply(@Validated HostApplyTO hostApplyTO) throws ActException {
        try {
            HostApplyBO hostApplyBO = hostApplyAPI.insertHostApply(hostApplyTO);
            return ActResult.initialize(hostApplyBO);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 编辑离宿申请
     *
     * @param hostApplyTO 离宿申请数据to
     * @return class HostApplyVO
     * @des 编辑离宿申请
     * @version v1
     */
    @PostMapping("v1/edit")
    public Result editHostApply(@Validated HostApplyTO hostApplyTO) throws ActException {
        try {
            HostApplyBO hostApplyBO = hostApplyAPI.editHostApply(hostApplyTO);
            return ActResult.initialize(hostApplyBO);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 删除离宿申请
     *
     * @param id 用户id
     * @des 根据用户id删除离宿申请记录
     * @version v1
     */
    @DeleteMapping("v1/delete/{id}")
    public Result removeHostApply(@PathVariable String id) throws ActException {
        try {
            hostApplyAPI.removeHostApply(id);
            return new ActResult("delete success");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }
    /**
     * 审核
     *
     * @param hostApplyTO 离宿申请数据bo
     * @return class HostApplyVO
     * @des 审核离宿申请
     * @version v1
     */
    @PostMapping("v1/audit")
    public Result auditHostApply(@Validated HostApplyTO hostApplyTO) throws ActException {
        try {
            HostApplyBO hostApplyBO = hostApplyAPI.auditHostApply(hostApplyTO);
            return ActResult.initialize(BeanTransform.copyProperties(hostApplyBO, HostApplyVO.class, true));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

}