package com.bjike.goddess.customer.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.customer.bo.CustomerDetailBO;
import com.bjike.goddess.customer.dto.CustomerDetailDTO;
import com.bjike.goddess.customer.to.CustomerDetailTO;
import com.bjike.goddess.customer.to.GuidePermissionTO;

import java.util.List;

/**
 * 客户详细信息业务接口
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-03-16T09:41:13.471 ]
 * @Description: [ 客户详细信息业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface CustomerDetailAPI {


    /**
     * 下拉导航权限
     */
    default Boolean sonPermission() throws SerException {
        return null;
    }
    /**
     * 导航权限
     */
    default Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        return null;
    }


    /**
     * 客户详细列表总条数
     */
    default Long countCustomerDetail(CustomerDetailDTO customerDetailDTO) throws SerException {
        return null;
    }
    /**
     * 客户详细列表
     * @return class CustomerDetailBO
     */
    default List<CustomerDetailBO> listCustomerDetail(CustomerDetailDTO customerDetailDTO) throws SerException {return null;}
    /**
     *  添加
     * @param customerDetailTO 客户详细信息
     * @return class CustomerDetailBO
     */
    default CustomerDetailBO addCustomerDetail(CustomerDetailTO customerDetailTO) throws SerException { return null;}

    /**
     *  编辑
     * @param customerDetailTO 客户详细信息
     * @return class CustomerDetailBO
     */
    default CustomerDetailBO editCustomerDetail(CustomerDetailTO customerDetailTO) throws SerException { return null;}

    /**
     * 删除详细
     * @param id id
     */
    default void deleteCustomerDetail(String id ) throws SerException {return;};
    /**
     * 客户详细
     * @return class CustomerDetailBO
     */
    default CustomerDetailBO getCustomerDetailById (String id ) throws SerException {return null;}


    /**
     * 根据客户编号查询
     * @return class CustomerDetailBO
     */
    default CustomerDetailBO getCustomerDetailByNum(String customerNum ) throws SerException {return null;}

    /**
     * 导出Excel
     * @param customerDetailDTO 地区和客户名
     * @throws SerException
     */
    byte[] exportInfo(CustomerDetailDTO customerDetailDTO ) throws SerException;

}