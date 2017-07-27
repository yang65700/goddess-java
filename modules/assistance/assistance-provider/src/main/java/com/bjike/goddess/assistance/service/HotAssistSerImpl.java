package com.bjike.goddess.assistance.service;

import com.bjike.goddess.assistance.bo.HotAssistBO;
import com.bjike.goddess.assistance.dto.HotAssistDTO;
import com.bjike.goddess.assistance.entity.HotAssist;
import com.bjike.goddess.assistance.enums.GuideAddrStatus;
import com.bjike.goddess.assistance.to.GuidePermissionTO;
import com.bjike.goddess.assistance.to.HotAssistTO;
import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.provider.utils.RpcTransmit;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.user.api.UserAPI;
import com.bjike.goddess.user.bo.UserBO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 高温补助业务实现
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-04-14 10:52 ]
 * @Description: [ 高温补助业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "assistanceSerCache")
@Service
public class HotAssistSerImpl extends ServiceImpl<HotAssist, HotAssistDTO> implements HotAssistSer {
    @Autowired
    private UserAPI userAPI;
    @Autowired
    private CusPermissionSer cusPermissionSer;

    /**
     * 核对查看权限（部门级别）
     */
    private void checkSeeIdentity() throws SerException {
        Boolean flag = false;
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);
        String userName = userBO.getUsername();
        if (!"admin".equals(userName.toLowerCase())) {
            flag = cusPermissionSer.getCusPermission("1");
            if (!flag) {
                throw new SerException("您不是相应部门的人员，不可以操作");
            }
        }
        RpcTransmit.transmitUserToken(userToken);
    }

    /**
     * 核对添加修改删除审核权限（岗位级别）
     */
    private void checkAddIdentity() throws SerException {
        Boolean flag = false;
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);
        String userName = userBO.getUsername();
        if (!"admin".equals(userName.toLowerCase())) {
            flag = cusPermissionSer.busCusPermission("2");
            if (!flag) {
                throw new SerException("您不是相应部门的人员，不可以操作");
            }
        }
        RpcTransmit.transmitUserToken(userToken);
    }

    /**
     * 核对查看权限（部门级别）
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
     * 核对添加修改删除审核权限（岗位级别）
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

    @Override
    public Boolean sonPermission() throws SerException {
        String userToken = RpcTransmit.getUserToken();
        Boolean flagSee = guideSeeIdentity();
        RpcTransmit.transmitUserToken(userToken);
        Boolean flagAdd = guideAddIdentity();
        if (flagSee || flagAdd) {
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
            case COLLECT:
                flag = guideSeeIdentity();
                break;
            case SEE:
                flag = guideSeeIdentity();
                break;
            default:
                flag = true;
                break;
        }

        RpcTransmit.transmitUserToken(userToken);
        return flag;
    }

    @Override
    public Long countHotAssist(HotAssistDTO hotAssistDTO) throws SerException {
        if( StringUtils.isNotBlank(hotAssistDTO.getArea() )){
            hotAssistDTO.getConditions().add(Restrict.eq("area",hotAssistDTO.getArea() ));
        }
        if( StringUtils.isNotBlank(hotAssistDTO.getProjectGroup() )){
            hotAssistDTO.getConditions().add(Restrict.eq("projectGroup",hotAssistDTO.getProjectGroup() ));
        }
        hotAssistDTO.getSorts().add("createTime=desc");
        Long count = super.count(hotAssistDTO);
        return count;
    }

    @Override
    public HotAssistBO getOneById(String id) throws SerException {
        if (StringUtils.isBlank(id)){
            throw new SerException("id不能为空");
        }
        HotAssist hotAssist = super.findById(id);

        return BeanTransform.copyProperties(hotAssist, HotAssistBO.class);
    }

    @Override
    public List<HotAssistBO> listHotAssist(HotAssistDTO hotAssistDTO) throws SerException {
        checkSeeIdentity();
        if( StringUtils.isNotBlank(hotAssistDTO.getArea() )){
            hotAssistDTO.getConditions().add(Restrict.eq("area",hotAssistDTO.getArea() ));
        }
        if( StringUtils.isNotBlank(hotAssistDTO.getProjectGroup() )){
            hotAssistDTO.getConditions().add(Restrict.eq("projectGroup",hotAssistDTO.getProjectGroup() ));
        }
        hotAssistDTO.getSorts().add("createTime=desc");
        List<HotAssist> list = super.findByCis(hotAssistDTO,true);

        return BeanTransform.copyProperties(list, HotAssistBO.class );
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public HotAssistBO addHotAssist(HotAssistTO hotAssistTO) throws SerException {
        checkAddIdentity();
        HotAssist hotAssist = BeanTransform.copyProperties(hotAssistTO,HotAssist.class,true);

        hotAssist.setCreateTime(LocalDateTime.now());
        super.save( hotAssist );
        return BeanTransform.copyProperties(hotAssist, HotAssistBO.class);
    }


    @Transactional(rollbackFor = SerException.class)
    @Override
    public HotAssistBO editHotAssist(HotAssistTO hotAssistTO) throws SerException {
        checkAddIdentity();
        HotAssist hotAssist = BeanTransform.copyProperties(hotAssistTO,HotAssist.class,true);
        HotAssist rs = super.findById( hotAssistTO.getId() );

        rs.setEmpName( hotAssist.getEmpName() );
        rs.setRemark( hotAssist.getRemark() );
        rs.setModifyTime(LocalDateTime.now());
        super.update( rs );
        return BeanTransform.copyProperties(rs, HotAssistBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void deleteHotAssist(String id) throws SerException {
        checkAddIdentity();
        if (StringUtils.isBlank(id)){
            throw new SerException("id不能为空");
        }
        super.remove( id );
    }

    @Override
    public List<HotAssistBO> collectByArea(HotAssistDTO hotAssistDTO) throws SerException {
        //地区不为空  高温补贴金额(6.9元/天)
        checkSeeIdentity();
        String [] fields = new String[]{"area","projectGroup","projectName","assistStartTime","assistEndTime",
                "salaryStartTime","salaryEndTime","outTime","empName","empNumber","jobPosition","outCarNumber","outDriver",
                "moneyCondition","thingCondtion" ,"counts" , "assistMoney"};
        String sql = "";
        List<HotAssist> list = new ArrayList<>();
        if ( StringUtils.isNotBlank( hotAssistDTO.getArea()) ){
            sql = "select area, projectGroup , projectName, assistStartTime , assistEndTime "+
                    " salaryStartTime , salaryEndTime , outTime , empName , empNumber , jobPosition , outCarNumber , outDriver "+
                    " moneyCondition , thingCondtion , count(area) as counts  , count(area)*6.9 as assistMoney   " +
                    " from assistance_hotassist where area ='"+hotAssistDTO.getArea()+"' " +
                    " ";
            list = super.findBySql( sql , HotAssist.class,fields );
        }else{
            fields = new String[]{ "area", "counts" , "assistMoney"};
            sql = "select area ,count(*) as counts , count(*)*6.9 as  assistMoney from assistance_hotassist group by area ";
            list = super.findBySql( sql , HotAssist.class,fields );
        }
        return BeanTransform.copyProperties(list,HotAssistBO.class);
    }

    @Override
    public List<HotAssistBO> collectByProGroup(HotAssistDTO hotAssistDTO) throws SerException {
        //项目组不为空
        checkSeeIdentity();
        String [] fields = new String[]{"area","projectGroup","projectName","assistStartTime","assistEndTime",
                "salaryStartTime","salaryEndTime","outTime","empName","empNumber","jobPosition","outCarNumber","outDriver",
                "moneyCondition","thingCondtion" ,"counts" , "assistMoney"};
        String sql = "";
        List<HotAssist> list = new ArrayList<>();
        if ( StringUtils.isNotBlank( hotAssistDTO.getArea()) ){
            sql = "select area, projectGroup , projectName, assistStartTime , assistEndTime "+
                    " salaryStartTime , salaryEndTime , outTime , empName , empNumber , jobPosition , outCarNumber , outDriver "+
                    " moneyCondition , thingCondtion , count(projectGroup) as counts  , count(projectGroup)*6.9 as assistMoney   " +
                    " from assistance_hotassist where projectGroup ='"+hotAssistDTO.getProjectGroup()+"' " +
                    " ";
            list = super.findBySql( sql , HotAssist.class,fields );
        }else{
            fields = new String[]{ "projectGroup", "counts" , "assistMoney"};
            sql = "select projectGroup ,count(*) as counts , count(*)*6.9 as  assistMoney from assistance_hotassist group by projectGroup ";
            list = super.findBySql( sql , HotAssist.class,fields );
        }
        return BeanTransform.copyProperties(list,HotAssistBO.class);
    }

    
}