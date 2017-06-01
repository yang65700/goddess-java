package com.bjike.goddess.projectissuehandle.to;

import com.bjike.goddess.common.api.to.BaseTO;
import com.bjike.goddess.projectissuehandle.enums.ProPermissionType;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 问题权限配置
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-05-26 05:43 ]
 * @Description: [ 问题权限配置 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class ProPermissionTO extends BaseTO {


    /**
     * 辅助id
     */
    private String idFlag;

    /**
     * 描述
     */
    @NotBlank(message = "描述不能为空")
    private String description;

    /**
     * 操作对象数组
     */
    private String[] operators;

    /**
     * 操作对象
     */
    private String operator;
    /**
     * 类型
     */
    private ProPermissionType type;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;


    public String getIdFlag() {
        return idFlag;
    }

    public void setIdFlag(String idFlag) {
        this.idFlag = idFlag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getOperators() {
        return operators;
    }

    public void setOperators(String[] operators) {
        this.operators = operators;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ProPermissionType getType() {
        return type;
    }

    public void setType(ProPermissionType type) {
        this.type = type;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }
}