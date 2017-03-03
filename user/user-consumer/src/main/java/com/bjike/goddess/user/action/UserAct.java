package com.bjike.goddess.user.action;

import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.user.dto.UserDTO;
import com.bjike.goddess.user.service.UserAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户操作
 *
 * @Author: [liguiqin]
 * @Date: [2017-01-14 15:47]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@RestController
@RequestMapping("user")
public class UserAct {

    @Autowired
    private UserAPI userAPI;

    /**
     * 手机号码是否存在
     * @param phone 手机号码
     * @return
     * @throws ActException
     */
    @GetMapping("existPhone/{phone}")
    public ActResult existPhone(@PathVariable String phone) throws ActException {
        try {
            Boolean result = (null != userAPI.findByPhone(phone));
            return ActResult.initialize(result);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 用户名是否存在
     * @param username 用户名
     * @return
     * @throws ActException
     */
    @GetMapping("existUsername/{username}")
    public ActResult existUsername(@PathVariable String username) throws ActException {

        try {
            Boolean result = (null != userAPI.findByUsername(username));
            return ActResult.initialize(result);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }


}