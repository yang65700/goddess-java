package com.bjike.goddess.housepay.dto;

import com.bjike.goddess.common.api.dto.BaseDTO;

/**
 * 资金准备审核表数据传输对象
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-05-12 05:32 ]
 * @Description: [ 资金准备审核表数据传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class MoneyReadyDTO extends BaseDTO {
    private String startTime;
    private String endTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}