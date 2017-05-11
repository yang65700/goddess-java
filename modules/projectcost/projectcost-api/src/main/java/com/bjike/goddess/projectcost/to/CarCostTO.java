package com.bjike.goddess.projectcost.to;

import com.bjike.goddess.common.api.to.BaseTO;

/**
 * 车辆费用
 *
 * @Author: [ 邓钧仁 ]
 * @Date: [ 2017-05-04 05:14 ]
 * @Description: [ 车辆费用 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class CarCostTO extends BaseTO {

    /**
     * 地区
     */
    private String area;

    /**
     * 项目组
     */
    private String project;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 月份
     */
    private Integer month;

    /**
     * 目标车次
     */
    private Integer targetDegree;

    /**
     * 实际车次
     */
    private Integer actualDegree;

    /**
     * 单价
     */
    private Double univalent;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getTargetDegree() {
        return targetDegree;
    }

    public void setTargetDegree(Integer targetDegree) {
        this.targetDegree = targetDegree;
    }

    public Integer getActualDegree() {
        return actualDegree;
    }

    public void setActualDegree(Integer actualDegree) {
        this.actualDegree = actualDegree;
    }

    public Double getUnivalent() {
        return univalent;
    }

    public void setUnivalent(Double univalent) {
        this.univalent = univalent;
    }

}