package com.bjike.goddess.bonus.action.bonus;

import com.bjike.goddess.bonus.api.DisciplineRecordAPI;
import com.bjike.goddess.bonus.dto.DisciplineRecordDTO;
import com.bjike.goddess.bonus.to.CollectFilterTO;
import com.bjike.goddess.bonus.to.DisciplineRecordTO;
import com.bjike.goddess.bonus.vo.*;
import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.interceptor.login.LoginAuth;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 奖罚记录
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-04-10 11:54 ]
 * @Description: [ 奖罚记录 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("disciplinerecord")
public class DisciplineRecordAct {

    @Autowired
    private DisciplineRecordAPI disciplineRecordAPI;


    /**
     * 保存
     *
     * @param to 奖罚记录传输对象
     * @return class DisciplineRecordVO
     * @version v1
     */
    @LoginAuth
    @PostMapping("v1/save")
    public Result save(@Validated(ADD.class) DisciplineRecordTO to, BindingResult result) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.save(to), DisciplineRecordVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 奖励
     *
     * @param to 奖罚记录传输对象
     * @return class DisciplineRecordVO
     * @version v1
     */
    @PostMapping("v1/reward")
    public Result reward(@Validated(ADD.class) DisciplineRecordTO to, BindingResult result) throws ActException {
        try {
            to.setStatus(Boolean.TRUE);
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.save(to), DisciplineRecordVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 处罚
     *
     * @param to 奖罚记录传输对象
     * @return class DisciplineRecordVO
     * @version v1
     */
    @PostMapping("v1/push")
    public Result push(@Validated(ADD.class) DisciplineRecordTO to, BindingResult result) throws ActException {
        try {
            to.setStatus(Boolean.FALSE);
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.save(to), DisciplineRecordVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 修改
     *
     * @param to 奖罚记录传输对象
     * @return class DisciplineRecordVO
     * @version v1
     */
    @LoginAuth
    @PutMapping("v1/update/{id}")
    public Result update(@Validated(EDIT.class) DisciplineRecordTO to, BindingResult result) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.update(to), DisciplineRecordVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 删除
     *
     * @param id 奖罚记录传输对象
     * @return class DisciplineRecordVO
     * @version v1
     */
    @LoginAuth
    @DeleteMapping("v1/delete/{id}")
    public Result delete(@PathVariable String id) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.delete(id), DisciplineRecordVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 项目组奖励排名
     *
     * @param to 汇总过滤条件传输对象
     * @return class DisciplineRecordRankVO
     * @version v1
     */
    @GetMapping("v1/projectRewardRank")
    public Result projectRewardRank(CollectFilterTO to) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.projectRewardRank(to), DisciplineRecordRankVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 项目组处罚排名
     *
     * @param to 汇总过滤条件传输对象
     * @return class DisciplineRecordRankVO
     * @version v1
     */
    @GetMapping("v1/projectPushRank")
    public Result projectPushRank(CollectFilterTO to) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.projectPushRank(to), DisciplineRecordRankVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 个人奖励排名
     *
     * @param to 汇总过滤条件传输对象
     * @return class DisciplineRecordRankVO
     * @version v1
     */
    @GetMapping("v1/personalRewardRank")
    public Result personalRewardRank(CollectFilterTO to) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.personalRewardRank(to), DisciplineRecordRankVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 个人处罚排名
     *
     * @param to 汇总过滤条件传输对象
     * @return class DisciplineRecordRankVO
     * @version v1
     */
    @GetMapping("v1/personalPushRank")
    public Result personalPushRank(CollectFilterTO to) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.personalPushRank(to), DisciplineRecordRankVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 奖罚明细汇总
     *
     * @param to 汇总过滤条件传输对象
     * @return class DisciplineRecordDetailVO
     * @version v1
     */
    @GetMapping("v1/disciplineDetailCollect")
    public Result disciplineDetailCollect(CollectFilterTO to) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.disciplineDetailCollect(to), DisciplineRecordDetailVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 奖罚人数汇总
     *
     * @param to 汇总过滤条件传输对象
     * @return class DisciplineRecordQuantityVO
     * @version v1
     */
    @GetMapping("v1/disciplineQuantityCollect")
    public Result disciplineQuantityCollect(CollectFilterTO to) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.disciplineQuantityCollect(to), DisciplineRecordQuantityVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 奖罚分数汇总
     *
     * @param to 汇总过滤条件传输对象
     * @return class DisciplineRecordScoreVO
     * @version v1
     */
    @GetMapping("v1/disciplineScoreCollect")
    public Result disciplineScoreCollect(CollectFilterTO to) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.disciplineScoreCollect(to), DisciplineRecordScoreVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 根据过滤条件查询奖罚记录
     *
     * @param to 过滤条件传输对象
     * @return class DisciplineRecordVO
     * @version v1
     */
    @GetMapping("v1/findByFilter")
    public Result findByFilter(CollectFilterTO to) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.findByFilter(to), DisciplineRecordVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }


    /**
     * 奖励列表
     *
     * @param dto 奖罚记录数据传输对象
     * @return class DisciplineRecordVO
     * @version v1
     */
    @GetMapping("v1/reward/maps")
    public Result rewardMaps(DisciplineRecordDTO dto, HttpServletRequest request) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.rewardMaps(dto), DisciplineRecordVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 处罚列表
     *
     * @param dto 奖罚记录数据传输对象
     * @return class DisciplineRecordVO
     * @version v1
     */
    @GetMapping("v1/push/maps")
    public Result pushMaps(DisciplineRecordDTO dto, HttpServletRequest request) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.pushMaps(dto), DisciplineRecordVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 根据id获取奖罚记录
     *
     * @param id 奖罚记录数据id
     * @return class DisciplineRecordVO
     * @version v1
     */
    @GetMapping("v1/findById/{id}")
    public Result getById(@PathVariable String id) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(disciplineRecordAPI.getById(id), DisciplineRecordVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 获取奖励总条数
     *
     * @version v1
     */
    @GetMapping("v1/reward/total")
    public Result getRewardTotal() throws ActException {
        try {
            return ActResult.initialize(disciplineRecordAPI.getRewardTotal());
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 获取处罚总条数
     *
     * @version v1
     */
    @GetMapping("v1/push/total")
    public Result getPushTotal() throws ActException {
        try {
            return ActResult.initialize(disciplineRecordAPI.getPushTotal());
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

}