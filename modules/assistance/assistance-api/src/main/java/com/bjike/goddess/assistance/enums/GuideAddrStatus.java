package com.bjike.goddess.assistance.enums;

/**
 * 导航栏类型
 *
 * @Author: [tanghaixiang]
 * @Date: [2017-03-20 19:57]
 * @Description: [导航栏类型]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public enum GuideAddrStatus {

    /**
     * 列表
     */
    LIST(0),
    /**
     * 添加
     */
    ADD(1),
    /**
     * 编辑
     */
    EDIT(2),
    /**
     * 综合部审核
     */
    RESOURCEAUDIT(3),
    /**
     * 删除
     */
    DELETE(4),
    /**
     * 汇总
     */
    COLLECT(5),
    /**
     * 查看
     */
    SEE(6),
    /**
     * 财务审核
     */
    FINACEAUDIT(7),
    /**
     * 总经办审核
     */
    MANAGEAUDIT(8);

    private int code;

    GuideAddrStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

}