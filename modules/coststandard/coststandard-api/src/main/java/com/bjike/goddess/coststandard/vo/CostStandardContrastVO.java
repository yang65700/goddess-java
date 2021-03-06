package com.bjike.goddess.coststandard.vo;

/**
 * 费用标准对比表现层对象
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-05-24 11:15 ]
 * @Description: [ 费用标准对比表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class CostStandardContrastVO {

    /**
     * id
     */
    private String id;

    /**
     * 费用标准id
     */
    private String standardId;

    /**
     * 名称
     */
    private String name;

    /**
     * 地区
     */
    private String area;

    /**
     * 标准
     */
    private String standardName;

    /**
     * 适用部门或项目组
     */
    private String department;

    /**
     * 资金准备
     */
    private Double plan;

    /**
     * 实际
     */
    private Double actual;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPlan() {
        return plan;
    }

    public String getStandardId() {
        return standardId;
    }

    public void setStandardId(String standardId) {
        this.standardId = standardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPlan(Double plan) {
        this.plan = plan;
    }

    public Double getActual() {
        return actual;
    }

    public void setActual(Double actual) {
        this.actual = actual;
    }
}