package com.bjike.goddess.customerplatform.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.provider.utils.RpcTransmit;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.customerplatform.bo.OwnerBO;
import com.bjike.goddess.customerplatform.dto.OwnerDTO;
import com.bjike.goddess.customerplatform.entity.Owner;
import com.bjike.goddess.customerplatform.enums.GuideAddrStatus;
import com.bjike.goddess.customerplatform.to.GuidePermissionTO;
import com.bjike.goddess.customerplatform.to.OwnerTO;
import com.bjike.goddess.user.api.UserAPI;
import com.bjike.goddess.user.bo.UserBO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 业主业务实现
 *
 * @Author: [ zhuangkaiqin ]
 * @Date: [ 2017-12-30 11:27 ]
 * @Description: [ 业主业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "customerplatformSerCache")
@Service
public class OwnerSerImpl extends ServiceImpl<Owner, OwnerDTO> implements OwnerSer {
    @Autowired
    private UserAPI userAPI;
    @Autowired
    private CusPermissionSer cusPermissionSer;

    @Override
    public Boolean sonPermission() throws SerException {
        String userToken = RpcTransmit.getUserToken();
        Boolean flagSee = guideSeeIdentity();
        RpcTransmit.transmitUserToken(userToken);
        Boolean flagAdd = guideAddIdentity();
        if( flagSee || flagAdd ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        String userToken = RpcTransmit.getUserToken();
        GuideAddrStatus guideAddrStatus = guidePermissionTO.getGuideAddrStatus();
        Boolean flag = true;
        switch (guideAddrStatus) {
            case LIST:
                flag = guideSeeIdentity();
                break;
            case ADD:
                flag = guideAddIdentity();
                break;
            case EDIT:
                flag = guideAddIdentity();
                break;
            case AUDIT:
                flag = guideAddIdentity();
                break;
            case DELETE:
                flag = guideAddIdentity();
                break;
            case CONGEL:
                flag = guideAddIdentity();
                break;
            case THAW:
                flag = guideAddIdentity();
                break;
            case COLLECT:
                flag = guideAddIdentity();
                break;
            case IMPORT:
                flag = guideAddIdentity();
                break;
            case EXPORT:
                flag = guideAddIdentity();
                break;
            case UPLOAD:
                flag = guideAddIdentity();
                break;
            case DOWNLOAD:
                flag = guideAddIdentity();
                break;
            case SEE:
                flag = guideSeeIdentity();
                break;
            case SEEFILE:
                flag = guideSeeIdentity();
                break;
            default:
                flag = true;
                break;
        }
        return flag;
    }

    /**
     * 导航栏核对查看权限（部门级别）
     */
    private Boolean guideSeeIdentity() throws SerException {
        Boolean flag = false;
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);
        String userName = userBO.getUsername();
        if (!"admin".equals(userName.toLowerCase())) {
            flag = cusPermissionSer.getCusPermission("1");
        } else {
            flag = true;
        }
        return flag;
    }

    /**
     * 导航栏核对添加修改删除审核权限（岗位级别）
     */
    private Boolean guideAddIdentity() throws SerException {
        Boolean flag = false;
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);
        String userName = userBO.getUsername();
        if (!"admin".equals(userName.toLowerCase())) {
            flag = cusPermissionSer.busCusPermission("2");
        } else {
            flag = true;
        }
        return flag;
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void save(OwnerTO to) throws SerException {
        Owner entity = BeanTransform.copyProperties(to, Owner.class, true);
        super.save(entity);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void update(OwnerTO to) throws SerException {
        Owner entity = super.findById(to.getId());
        if (null == entity) {
            throw new SerException("目标数据对象不能为空");
        }
        BeanUtils.copyProperties(to, entity, "id", "createTime");
        entity.setModifyTime(LocalDateTime.now());
        super.update(entity);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void delete(String id) throws SerException {
        Owner entity = super.findById(id);
        if (null == entity) {
            throw new SerException("目标数据对象不能为空");
        }
        super.remove(id);
    }

    @Override
    public List<OwnerBO> maps(OwnerDTO dto) throws SerException {
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);

        List<Owner> owners = super.findByCis(dto);
        List<OwnerBO> ownerBOs = BeanTransform.copyProperties(owners, OwnerBO.class, false);
        if (null != ownerBOs && ownerBOs.size() > 0) {
            for(OwnerBO bo : ownerBOs){
                // TODO: 18-1-5 判断是否是vip
                Boolean tar = false;
                if (!tar) {
                    bo.setPhone(transPhone(bo.getPhone()));
                }
            }
        }
        return ownerBOs;
    }

    @Override
    public OwnerBO getById(String id) throws SerException {
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);

        Owner entity = super.findById(id);
        if (null == entity) {
            throw new SerException("目标数据对象不能为空");
        }
        OwnerBO bo = BeanTransform.copyProperties(entity, OwnerBO.class);
        // TODO: 18-1-5 判断是否是vip
        Boolean tar = false;
        if (!tar) {
            bo.setPhone(transPhone(bo.getPhone()));
        }
        return bo;
    }

    @Override
    public Long getTotal(OwnerDTO dto) throws SerException {
        return super.count(dto);
    }

    private String transPhone(String phone) throws SerException {
        phone = phone.replaceAll("(\\d{3})\\d{5}(\\d{3})", "$1****$2");
        return phone;
    }
}