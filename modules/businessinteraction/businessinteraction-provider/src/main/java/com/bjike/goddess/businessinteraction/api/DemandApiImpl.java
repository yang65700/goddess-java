package com.bjike.goddess.businessinteraction.api;

import com.bjike.goddess.businessinteraction.bo.DemandBO;
import com.bjike.goddess.businessinteraction.bo.DemandObjectBO;
import com.bjike.goddess.businessinteraction.dto.DemandDTO;
import com.bjike.goddess.businessinteraction.service.DemandSer;
import com.bjike.goddess.businessinteraction.to.DemandTO;
import com.bjike.goddess.businessinteraction.to.GuidePermissionTO;
import com.bjike.goddess.businessinteraction.to.SonPermissionObject;
import com.bjike.goddess.common.api.exception.SerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 互动平台需求描述业务接口实现
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-03-28 03:21 ]
 * @Description: [ 互动平台需求描述业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("demandApiImpl")
public class DemandApiImpl implements DemandAPI {

    @Autowired
    private DemandSer demandSer;

    @Override
    public Long countInter(DemandDTO demandDTO) throws SerException {
        return demandSer.countInter(demandDTO);
    }

    @Override
    public DemandBO getOneById(String id) throws SerException {
        return demandSer.getOneById(id);
    }

    @Override
    public List<DemandBO> listDemand(DemandDTO demandDTO) throws SerException {
        return demandSer.listDemand(demandDTO);
    }

    @Override
    public DemandBO addDemand(DemandTO demandTO) throws SerException {
        return demandSer.addDemand(demandTO);
    }

    @Override
    public DemandBO editDemand(DemandTO demandTO) throws SerException {
        return demandSer.editDemand(demandTO);
    }

    @Override
    public void deleteDemand(String id) throws SerException {
        demandSer.deleteDemand(id);
    }

    @Override
    public List<DemandBO> searchList(DemandDTO demandDTO) throws SerException {
        return demandSer.searchList(demandDTO);
    }

    @Override
    public List<DemandObjectBO> searchDemand(DemandDTO demandDTO) throws SerException {
        return demandSer.searchDemand(demandDTO);
    }

    @Override
    public List<SonPermissionObject> sonPermission() throws SerException {
        return demandSer.sonPermission();
    }

    @Override
    public Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        return demandSer.guidePermission(guidePermissionTO);
    }
}