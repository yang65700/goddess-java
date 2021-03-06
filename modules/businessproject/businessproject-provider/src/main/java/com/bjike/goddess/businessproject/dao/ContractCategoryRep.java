package com.bjike.goddess.businessproject.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.businessproject.dto.ContractCategoryDTO;
import com.bjike.goddess.businessproject.entity.ContractCategory;

/**
* 商务项目合同类型持久化接口, 继承基类可使用ｊｐａ命名查询
* @Author:			[ tanghaixiang ]
* @Date:			[  2017-03-21 04:24 ]
* @Description:	[ 商务项目合同类型持久化接口, 继承基类可使用ｊｐａ命名查询 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface ContractCategoryRep extends JpaRep<ContractCategory ,ContractCategoryDTO> { 

 }