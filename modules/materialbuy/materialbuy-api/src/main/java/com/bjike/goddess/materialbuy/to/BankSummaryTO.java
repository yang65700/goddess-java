package com.bjike.goddess.materialbuy.to;

import com.bjike.goddess.common.api.to.BaseTO;

import java.time.LocalDate;

/**
 * 对银行流水汇总
 *
 * @Author: [ yangruizhen ]
 * @Date: [ 2018-04-02 02:21 ]
 * @Description: [ 对银行流水汇总 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class BankSummaryTO extends BaseTO {

    /**
     * 银行名称
     */

    private String bankName;

    /**
     * 日期；Long
     */

    private LocalDate theDateOf;

    /**
     * 本月发生额
     */


    private Long amountOfThisMonth;

    /**
     * 收入贷方金额
     */
    private Long incomeCreditAmount;

    /**
     * 支出借方金额
     */

    private Long expenseDebitAmount;
    /**
     * 余额
     */
    private Long theBalanceOf;

    private LocalDate theStartTime;

    public Long getIncomeCreditAmount() {
        return incomeCreditAmount;
    }

    public void setIncomeCreditAmount(Long incomeCreditAmount) {
        this.incomeCreditAmount = incomeCreditAmount;
    }

    public Long getExpenseDebitAmount() {
        return expenseDebitAmount;
    }

    public void setExpenseDebitAmount(Long expenseDebitAmount) {
        this.expenseDebitAmount = expenseDebitAmount;
    }

    public Long getTheBalanceOf() {
        return theBalanceOf;
    }

    public void setTheBalanceOf(Long theBalanceOf) {
        this.theBalanceOf = theBalanceOf;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public LocalDate getTheDateOf() {
        return theDateOf;
    }

    public void setTheDateOf(LocalDate theDateOf) {
        this.theDateOf = theDateOf;
    }

    public Long getAmountOfThisMonth() {
        return amountOfThisMonth;
    }

    public void setAmountOfThisMonth(Long amountOfThisMonth) {
        this.amountOfThisMonth = amountOfThisMonth;
    }

}