package com.bjike.goddess.user.api.rbac;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.user.bo.rbac.PermissionBO;
import com.bjike.goddess.user.bo.rbac.PermissionTreeBO;
import com.bjike.goddess.user.service.rbac.PermissionSer;
import com.bjike.goddess.user.to.rbac.PermissionTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 对外提供权限资源接口实现
 *
 * @Author: [liguiqin]
 * @Date: [2017-03-11 14:20]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@Service("permissionApiImpl")
public class PermissionApiImpl implements PermissionAPI {
    @Autowired
    private PermissionSer permissionSer;

    @Override
    public List<PermissionTreeBO> treeData(String id) throws SerException {
        return permissionSer.treeData(id);
    }

    @Override
    public PermissionBO save(PermissionTO permissionTO) throws SerException {
        return permissionSer.save(permissionTO);
    }

    @Override
    public void remove(String id) throws SerException {
        permissionSer.remove(id);
    }
}
