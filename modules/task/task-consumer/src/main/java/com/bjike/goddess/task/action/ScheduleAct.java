package com.bjike.goddess.task.action;

import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.task.api.ScheduleAPI;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目进度
 *
 * @Author: [liguiqin]
 * @Date: [2017-09-19 11:06]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@DefaultProperties
@RestController
@RequestMapping("schedule")
public class ScheduleAct {

    @Autowired
    private ScheduleAPI scheduleAPI;

    /**
     * 一个项目所有详情
     * @param projectId
     * @return
     * @throws ActException
     */
    @GetMapping("v1/detail/{projectId}")
    public String detail(@PathVariable String projectId) throws ActException {
        try {
            String result = scheduleAPI.detail(projectId);
            return result;
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }


}