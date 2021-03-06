package com.bjike.goddess.lendreimbursement.to;

import com.bjike.goddess.common.api.to.BaseTO;
import com.bjike.goddess.lendreimbursement.enums.LendStatus;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * 申请借款
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-04-06 10:01 ]
 * @Description: [ 申请借款 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class ApplyLendTO extends BaseTO {

    public interface TESTAddAndEdit{}
    public interface TESTChargeAudit{}
    public interface TESTFinaceAudit{}
    public interface TESTManageAudit{}
    public interface TESTReturnMoney{}
    public interface TESTCheckReturnMoney{}
    public interface TESTReturnSend{}

    /**
     * 预计借款日期
     */
    @NotBlank(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="预计借款日期不能为空，日期格式未年-月-日" )
    private String estimateLendDate;

    /**
     * 借款人
     */
    @NotBlank(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="借款人不能为空" )
    private String lender;

    /**
     * 负责人
     */
    @NotBlank(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="负责人不能为空" )
    private String charger;

    /**
     * 地区
     */
    @NotBlank(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="地区不能为空" )
    private String area;

    /**
     * 项目组
     */
    @NotBlank(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="项目组不能为空" )
    private String projectGroup;

    /**
     * 项目名称
     */
    @NotBlank(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="项目名称不能为空" )
    private String projectName;

    /**
     * 参与人员
     */
    private String attender;

    /**
     * 借款方式
     */
    @NotBlank(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="借款方式不能为空" )
    private String lendWay;

    /**
     * 一级科目
     */
    @NotBlank(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="一级科目不能为空" )
    private String firstSubject;

    /**
     * 二级科目
     */
    @NotBlank(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="二级科目不能为空" )
    private String secondSubject;

    /**
     * 三级科目
     */
    @NotBlank(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="三级科目不能为空" )
    private String thirdSubject;

    /**
     * 说明
     */
    @NotBlank(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="说明不能为空" )
    private String explains;

    /**
     * 是否补写(是或否)
     */
    @NotBlank(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="是否补写不能为空,填是或否" )
    private String writeUp;

    /**
     * 补写情况
     */
    private String writeUpCondition;

    /**
     * 借款事由
     */
    @NotBlank(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="借款事由不能为空" )
    private String lendReson;

    /**
     * 金额
     */
    @NotNull(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="金额不能为空" )
    private Double money;

    /**
     * 是否有发票(是或否)
     */
    @NotBlank(groups = {ApplyLendTO.TESTAddAndEdit.class},message ="是否有发票不能为空,填是或否" )
    private String invoice;

    /**
     * 无发票备注
     */
    private String noInvoiceRemark;

    /**
     * 商品链接
     */
    private String goodsLink;

    /**
     * 备注
     */
    private String remark;

    /**
     * 填单人
     */
    private String fillSingler;

    /**
     * 借款日期
     */
    private String lendDate;

    /**
     * 负责人审核意见
     */
    private String chargerOpinion;

    /**
     * 负责人是否通过(是或否)
     */
    @NotBlank(groups = {ApplyLendTO.TESTChargeAudit.class},message ="负责人是否通过不能为空" )
    private String chargerPass;

    /**
     * 财务运营部
     */
    private String finacer;

    /**
     * 财务运营部审核意见
     */
    private String fincerOpinion;

    /**
     * 财务运营部是否通过(是或否)
     */
    @NotBlank(groups = {ApplyLendTO.TESTFinaceAudit.class},message ="财务运营部是否通过不能为空" )
    private String fincerPass;

    /**
     * 总经办
     */
    private String manager;

    /**
     * 总经办审核意见
     */
    private String managerOpinion;

    /**
     * 总经办是否通过(是或否)
     */
    @NotBlank(groups = {ApplyLendTO.TESTManageAudit.class},message ="总经办是否通过不能为空" )
    private String managerPass;

    /**
     * 代理审核备注
     */
    private String proxyAuditRemark;

    /**
     * 是否付款
     */
    private String payCondition;

    /**
     * 付款人
     */
    private String payer;

    /**
     * 付款日期
     */
    private String payDate;

    /**
     * 支付来源
     */
    private String payOrigin;

    /**
     * 单据数量
     */
    @NotNull(groups = {ApplyLendTO.TESTReturnSend.class},message ="单据数量不能为空,且为数字" )
    private Double documentQuantity;

    /**
     * 是否收到单据(是或否)
     */
    private String documentCondition;

    /**
     * 报销金额
     */
    @NotNull(groups = {ApplyLendTO.TESTReturnMoney.class},message ="预计借款日期不能为空，且为数字double" )
    private Double reimMoney;

    /**
     * 借款金额
     */
    @NotNull(groups = {ApplyLendTO.TESTReturnMoney.class},message ="借款金额不能为空，且为数字double" )
    private Double lendMoney;

    /**
     * 退回金额
     */
    @NotNull(groups = {ApplyLendTO.TESTReturnMoney.class},message ="退回金额不能为空，且为数字double" )
    private Double returnMoney;

    /**
     * 退回日期
     */
    @NotBlank(groups = {ApplyLendTO.TESTReturnMoney.class},message ="退回日期不能为空，日期格式未年-月-日" )
    private String returnDate;

    /**
     * 归还方式
     */
    @NotBlank(groups = {ApplyLendTO.TESTReturnMoney.class},message ="归还方式不能为空" )
    private String returnWays;

    /**
     * 归还账户
     */
    private String returnAccount;

    /**
     * 寄件人
     */
    private String sender;

    /**
     * 寄件日期
     */
    @NotBlank(groups = {ApplyLendTO.TESTReturnSend.class},message ="寄件日期不能为空" )
    private String sendDate;

    /**
     * 寄件情况
     */
    private String sendCondition;

    /**
     * 收件地址
     */
    @NotBlank(groups = {ApplyLendTO.TESTReturnSend.class},message ="收件地址不能为空" )
    private String receiveAddr;

    /**
     * 收票人
     */
    private String ticketer;

    /**
     * 收票日期
     */
    private String ticketDate;

    /**
     * 收票情况(是/否)
     */
    private String ticketCondition;

    /**
     * 是否已收票(是或否)
     */
    private String receiveTicket;

    /**
     * 核对人
     */
    private String checker;

    /**
     * 核对日期
     */
    private String checkDate;

    /**
     * 核对内容
     */
    @NotBlank(groups = {ApplyLendTO.TESTCheckReturnMoney.class} , message = "核对内容不能为空")
    private String checkcontent;

    /**
     * 状态
     */
    private LendStatus lendStatus;

    /**
     * 是否已收款（是/否）
     */
    private String receivePay;

    /**
     * 申请单有误状态标识
     */
    private Integer lendError;


    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;

    public String getEstimateLendDate() {
        return estimateLendDate;
    }

    public void setEstimateLendDate(String estimateLendDate) {
        this.estimateLendDate = estimateLendDate;
    }

    public String getLender() {
        return lender;
    }

    public void setLender(String lender) {
        this.lender = lender;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProjectGroup() {
        return projectGroup;
    }

    public void setProjectGroup(String projectGroup) {
        this.projectGroup = projectGroup;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAttender() {
        return attender;
    }

    public void setAttender(String attender) {
        this.attender = attender;
    }

    public String getLendWay() {
        return lendWay;
    }

    public void setLendWay(String lendWay) {
        this.lendWay = lendWay;
    }

    public String getFirstSubject() {
        return firstSubject;
    }

    public void setFirstSubject(String firstSubject) {
        this.firstSubject = firstSubject;
    }

    public String getSecondSubject() {
        return secondSubject;
    }

    public void setSecondSubject(String secondSubject) {
        this.secondSubject = secondSubject;
    }

    public String getThirdSubject() {
        return thirdSubject;
    }

    public void setThirdSubject(String thirdSubject) {
        this.thirdSubject = thirdSubject;
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains;
    }

    public String getWriteUp() {
        return writeUp;
    }

    public void setWriteUp(String writeUp) {
        this.writeUp = writeUp;
    }

    public String getWriteUpCondition() {
        return writeUpCondition;
    }

    public void setWriteUpCondition(String writeUpCondition) {
        this.writeUpCondition = writeUpCondition;
    }

    public String getLendReson() {
        return lendReson;
    }

    public void setLendReson(String lendReson) {
        this.lendReson = lendReson;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getNoInvoiceRemark() {
        return noInvoiceRemark;
    }

    public void setNoInvoiceRemark(String noInvoiceRemark) {
        this.noInvoiceRemark = noInvoiceRemark;
    }

    public String getGoodsLink() {
        return goodsLink;
    }

    public void setGoodsLink(String goodsLink) {
        this.goodsLink = goodsLink;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFillSingler() {
        return fillSingler;
    }

    public void setFillSingler(String fillSingler) {
        this.fillSingler = fillSingler;
    }

    public String getLendDate() {
        return lendDate;
    }

    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }

    public String getChargerOpinion() {
        return chargerOpinion;
    }

    public void setChargerOpinion(String chargerOpinion) {
        this.chargerOpinion = chargerOpinion;
    }

    public String getChargerPass() {
        return chargerPass;
    }

    public void setChargerPass(String chargerPass) {
        this.chargerPass = chargerPass;
    }

    public String getFinacer() {
        return finacer;
    }

    public void setFinacer(String finacer) {
        this.finacer = finacer;
    }

    public String getFincerOpinion() {
        return fincerOpinion;
    }

    public void setFincerOpinion(String fincerOpinion) {
        this.fincerOpinion = fincerOpinion;
    }

    public String getFincerPass() {
        return fincerPass;
    }

    public void setFincerPass(String fincerPass) {
        this.fincerPass = fincerPass;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getManagerOpinion() {
        return managerOpinion;
    }

    public void setManagerOpinion(String managerOpinion) {
        this.managerOpinion = managerOpinion;
    }

    public String getManagerPass() {
        return managerPass;
    }

    public void setManagerPass(String managerPass) {
        this.managerPass = managerPass;
    }

    public String getProxyAuditRemark() {
        return proxyAuditRemark;
    }

    public void setProxyAuditRemark(String proxyAuditRemark) {
        this.proxyAuditRemark = proxyAuditRemark;
    }

    public String getPayCondition() {
        return payCondition;
    }

    public void setPayCondition(String payCondition) {
        this.payCondition = payCondition;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getPayOrigin() {
        return payOrigin;
    }

    public void setPayOrigin(String payOrigin) {
        this.payOrigin = payOrigin;
    }

    public Double getDocumentQuantity() {
        return documentQuantity;
    }

    public void setDocumentQuantity(Double documentQuantity) {
        this.documentQuantity = documentQuantity;
    }

    public String getDocumentCondition() {
        return documentCondition;
    }

    public void setDocumentCondition(String documentCondition) {
        this.documentCondition = documentCondition;
    }

    public Double getReimMoney() {
        return reimMoney;
    }

    public void setReimMoney(Double reimMoney) {
        this.reimMoney = reimMoney;
    }

    public Double getLendMoney() {
        return lendMoney;
    }

    public void setLendMoney(Double lendMoney) {
        this.lendMoney = lendMoney;
    }

    public Double getReturnMoney() {
        return returnMoney;
    }

    public void setReturnMoney(Double returnMoney) {
        this.returnMoney = returnMoney;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnWays() {
        return returnWays;
    }

    public void setReturnWays(String returnWays) {
        this.returnWays = returnWays;
    }

    public String getReturnAccount() {
        return returnAccount;
    }

    public void setReturnAccount(String returnAccount) {
        this.returnAccount = returnAccount;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getSendCondition() {
        return sendCondition;
    }

    public void setSendCondition(String sendCondition) {
        this.sendCondition = sendCondition;
    }

    public String getReceiveAddr() {
        return receiveAddr;
    }

    public void setReceiveAddr(String receiveAddr) {
        this.receiveAddr = receiveAddr;
    }

    public String getTicketer() {
        return ticketer;
    }

    public void setTicketer(String ticketer) {
        this.ticketer = ticketer;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getTicketCondition() {
        return ticketCondition;
    }

    public void setTicketCondition(String ticketCondition) {
        this.ticketCondition = ticketCondition;
    }

    public String getReceiveTicket() {
        return receiveTicket;
    }

    public void setReceiveTicket(String receiveTicket) {
        this.receiveTicket = receiveTicket;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }

    public String getCheckcontent() {
        return checkcontent;
    }

    public void setCheckcontent(String checkcontent) {
        this.checkcontent = checkcontent;
    }

    public LendStatus getLendStatus() {
        return lendStatus;
    }

    public void setLendStatus(LendStatus lendStatus) {
        this.lendStatus = lendStatus;
    }

    public String getReceivePay() {
        return receivePay;
    }

    public void setReceivePay(String receivePay) {
        this.receivePay = receivePay;
    }

    public Integer getLendError() {
        return lendError;
    }

    public void setLendError(Integer lendError) {
        this.lendError = lendError;
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