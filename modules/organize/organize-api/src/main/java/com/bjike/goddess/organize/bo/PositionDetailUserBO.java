package com.bjike.goddess.organize.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

/**
 * 用户职位业务传输对象
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-04-14 02:33 ]
 * @Description: [ 用户职位业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class PositionDetailUserBO extends BaseBO {

    /**
     * 用户信息
     */
    private String userId;

    /**
     * 员工名称
     */
    private String username;

    /**
     * 员工编号
     */
    private String employeesNumber;

    /**
     * 职位
     */
    private String position;

    /**
     * 职位id
     */
    private String positionIds;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPositionIds() {
        return positionIds;
    }

    public void setPositionIds(String positionIds) {
        this.positionIds = positionIds;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(String employeesNumber) {
        this.employeesNumber = employeesNumber;
    }
}