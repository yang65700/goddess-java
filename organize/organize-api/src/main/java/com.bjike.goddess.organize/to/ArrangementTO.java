package com.bjike.goddess.organize.to;

import com.bjike.goddess.common.api.to.BaseTO;
import com.bjike.goddess.common.api.type.Status;

/**
 * 岗位层级展示对象
 *
 * @Author: [dengjunren]
 * @Date: [17-3-8 上午10:03]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike.goddess.organize.entity]
 */
public class ArrangementTO  extends BaseTO {


    /**
     * 编号
     */
    private String serialNumber;

    /**
     * 层级
     */
    private String arrangement;

    /**
     * 描述
     */
    private String description;

    /**
     * 使用状态
     */
    private Status status;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 上级层级ID
     */
    private String paren_id;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getArrangement() {
        return arrangement;
    }

    public void setArrangement(String arrangement) {
        this.arrangement = arrangement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getParen_id() {
        return paren_id;
    }

    public void setParen_id(String paren_id) {
        this.paren_id = paren_id;
    }
}
