package com.bjike.goddess.foreigntax.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 税金管理记账凭证记录
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-10-17 04:23 ]
 * @Description: [ 税金管理记账凭证记录 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "foreigntax_taxvoucher")
public class TaxVoucher extends BaseEntity {

    /**
     * 时间
     */
    @Column(name = "taxTime",  columnDefinition = "VARCHAR(255)   COMMENT '时间'")
    private String taxTime;

    /**
     * 记账凭证id
     */
    @Column(name = "voucherId",  columnDefinition = "VARCHAR(255)   COMMENT '记账凭证id'")
    private String voucherId;

    /**
     * 应缴金额
     */
    @Column(name = "totalMoney",  columnDefinition = "DECIMAL(10,2)   COMMENT '应缴金额'")
    private Double totalMoney;


    public String getTaxTime() {
        return taxTime;
    }

    public void setTaxTime(String taxTime) {
        this.taxTime = taxTime;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }
}