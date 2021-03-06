package com.bjike.goddess.attainment.vo;

/**
 * 调研表问题表现层对象
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-04-06 11:23 ]
 * @Description: [ 调研表问题表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class SurveyQuestionnaireVO {

    /**
     * id
     */
    private String id;

    /**
     * 调研实施id
     */
    private String actualizeId;

    /**
     * 问题
     */
    private String questionnaireName;

    /**
     * 单选多选
     */
    private Boolean multiple;

    /**
     * 题号
     */
    private Integer num;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActualizeId() {
        return actualizeId;
    }

    public void setActualizeId(String actualizeId) {
        this.actualizeId = actualizeId;
    }

    public String getQuestionnaireName() {
        return questionnaireName;
    }

    public void setQuestionnaireName(String questionnaireName) {
        this.questionnaireName = questionnaireName;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public void setMultiple(Boolean multiple) {
        this.multiple = multiple;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}