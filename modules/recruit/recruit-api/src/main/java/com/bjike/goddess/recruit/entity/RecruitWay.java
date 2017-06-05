package com.bjike.goddess.recruit.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 招聘渠道
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-04-08 05:10 ]
 * @Description: [  ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "recruit_recruitway")
public class RecruitWay extends BaseEntity {

    /**
     * 招聘渠道
     */
    @Column(nullable = false, columnDefinition = "VARCHAR(255) COMMENT '招聘渠道' ")
    private String recruitName;

    /**
     * 会员名
     */
    @Column(columnDefinition = "VARCHAR(255) COMMENT '会员名'")
    private String vipName;

    /**
     * 会员密码
     */
    @Column(columnDefinition = "VARCHAR(255) COMMENT '会员密码' ")
    private String vipPassword;

    /**
     * 用户名
     */
    @Column(columnDefinition = "VARCHAR(255) COMMENT '用户名' ")
    private String username;

    /**
     * 密码
     */
    @Column(columnDefinition = "VARCHAR(255) COMMENT '密码' ")
    private String password;

    /**
     * 渠道联系人
     */
    @Column(columnDefinition = "VARCHAR(255) COMMENT '渠道联系人' ")
    private String channelContact;

    /**
     * 渠道联系人的联系方式
     */
    @Column(columnDefinition = "VARCHAR(255) COMMENT '渠道联系人的联系方式' ")
    private String channelContactPhone;

    /**
     * 公司负责员工
     */
    @Column(columnDefinition = "VARCHAR(255) COMMENT '公司负责员工' ")
    private String firmPrincipal;

    /**
     * 使用的套餐和费用
     */
    @Column(columnDefinition = "VARCHAR(255) COMMENT '使用的套餐和费用' ")
    private String comboAndCharge;

    /**
     * 使用情况
     */
    @Column(columnDefinition = "VARCHAR(255) COMMENT '使用情况' ")
    private String situation;

    /**
     * 效果评价
     */
    @Column(columnDefinition = "VARCHAR(255) COMMENT '效果评价' ")
    private String effect;

    /**
     * 备注
     */
    @Column(columnDefinition = "VARCHAR(255) COMMENT '备注' ")
    private String remarks;

    public String getRecruitName() {
        return recruitName;
    }

    public void setRecruitName(String recruitName) {
        this.recruitName = recruitName;
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName;
    }

    public String getVipPassword() {
        return vipPassword;
    }

    public void setVipPassword(String vipPassword) {
        this.vipPassword = vipPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChannelContact() {
        return channelContact;
    }

    public void setChannelContact(String channelContact) {
        this.channelContact = channelContact;
    }

    public String getChannelContactPhone() {
        return channelContactPhone;
    }

    public void setChannelContactPhone(String channelContactPhone) {
        this.channelContactPhone = channelContactPhone;
    }

    public String getFirmPrincipal() {
        return firmPrincipal;
    }

    public void setFirmPrincipal(String firmPrincipal) {
        this.firmPrincipal = firmPrincipal;
    }

    public String getComboAndCharge() {
        return comboAndCharge;
    }

    public void setComboAndCharge(String comboAndCharge) {
        this.comboAndCharge = comboAndCharge;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}