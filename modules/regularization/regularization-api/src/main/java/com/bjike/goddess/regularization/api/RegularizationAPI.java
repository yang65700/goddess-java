package com.bjike.goddess.regularization.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.regularization.bo.ManagementScoreBO;
import com.bjike.goddess.regularization.bo.RegularizationBO;
import com.bjike.goddess.regularization.dto.RegularizationDTO;
import com.bjike.goddess.regularization.to.ManagementScoreTO;
import com.bjike.goddess.regularization.to.PlanModuleSupplyTO;
import com.bjike.goddess.regularization.to.RegularizationTO;
import com.bjike.goddess.regularization.to.ZjbApprovalTO;

import java.util.List;

/**
 * 员工转正业务接口
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-04-15 05:43 ]
 * @Description: [  ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface RegularizationAPI {

    /**
     * 根据id查询员工转正
     *
     * @param id 员工转正唯一标识
     * @return class RegularizationBO
     * @throws SerException
     */
    RegularizationBO findById(String id) throws SerException;

    /**
     * 计算总条数
     *
     * @param dto 员工转正dto
     * @throws SerException
     */
    Long count(RegularizationDTO dto) throws SerException;

    /**
     * 分页查询员工转正
     *
     * @return class RegularizationBO
     * @throws SerException
     */
    List<RegularizationBO> list(RegularizationDTO dto) throws SerException;

    /**
     * 保存员工转正
     *
     * @param to 员工转正to
     * @return class RegularizationBO
     * @throws SerException
     */
    RegularizationBO save(RegularizationTO to) throws SerException;

    /**
     * 根据id删除员工转正
     *
     * @param id 员工转正唯一标识
     * @throws SerException
     */
    void remove(String id) throws SerException;

    /**
     * 更新员工转正
     *
     * @param to 员工转正to
     * @throws SerException
     */
    void update(RegularizationTO to) throws SerException;

    /**
     * 管理层评分
     *
     * @param id 员工转正唯一标识
     * @param to 管理层评分to
     * @throws SerException
     */
    void manageScore(String id, ManagementScoreTO to) throws SerException;

    /**
     * 查看管理层评分
     *
     * @param id 员工转正唯一标识
     * @return class ManagementScoreBO
     * @throws SerException
     */
    List<ManagementScoreBO> checkManageScore(String id) throws SerException;

    /**
     * 决策层评价
     *
     * @param id 员工转正唯一标识
     * @param decisionLevelEvaluate 决策层评价
     * @param decisionLevelRank 决策层评分等级
     * @param decisionLevelScore 决策层具体评分
     * @throws SerException
     */
    void decisionLevelEvaluate(String id, String decisionLevelEvaluate, String decisionLevelRank, Integer decisionLevelScore) throws SerException;

    /**
     * 规划模块补充
     *
     * @param to 规划模块补充to
     * @throws SerException
     */
    void planModuleSupply(PlanModuleSupplyTO to) throws SerException;

    /**
     * 预算模块补充
     *
     * @param id 员工转正唯一标识
     * @param budgetPositiveComment 预算模块转正意见
     * @throws SerException
     */
    void budgetModuleSupply(String id, String budgetPositiveComment) throws SerException;

    /**
     * 总经办审批
     *
     * @param to 总经办审批to
     * @throws SerException
     */
    void zjbApproval(ZjbApprovalTO to) throws SerException;
}