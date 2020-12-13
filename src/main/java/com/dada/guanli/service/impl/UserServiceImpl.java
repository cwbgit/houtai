package com.dada.guanli.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.dada.guanli.dao.PassWordDOMapper;
import com.dada.guanli.dao.UserDOMapper;
import com.dada.guanli.dataobject.PassWordDO;
import com.dada.guanli.dataobject.UserDO;
import com.dada.guanli.error.BusinessException;
import com.dada.guanli.error.EmBusinessError;
import com.dada.guanli.service.UserService;
import com.dada.guanli.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 * @create 2019-06-02 0:09
 * @desc
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDOMapper userDOMapper;
    @Autowired
    private PassWordDOMapper passWordDOMapper;
    //登陆
    @Override
    public UserModel validateLogin(String zhanghao, String password) throws BusinessException {
        //通过用户的手机获取用户信息
        UserDO userDO = userDOMapper.selectByZhanghao(zhanghao);
        if (userDO == null) {
            throw new BusinessException(EmBusinessError.USER_LOGIN_FALL);
        }
        PassWordDO passwordDO = passWordDOMapper.selectByUserId(userDO.getId());
        UserModel userModel = convertFromDataObject(userDO, passwordDO);
        //比对用户信息内加密的密码是否与传输进来的密码相匹配
        if (!StringUtils.equals(password, userModel.getPassword())) {
            throw new BusinessException(EmBusinessError.USER_LOGIN_FALL);
        }
        return userModel;
    }
    //修改密码
    @Override
    public UserModel validateUpdatePS(UserModel userModel) throws BusinessException {
        //通过用户的账号获取用户信息
        UserDO userDO = userDOMapper.selectByZhanghao(userModel.getZhanghao());
        if (userDO == null) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }
        passWordDOMapper.updatePassword(userModel.getPassword(), userDO.getId());
        return userModel;
    }

    private UserModel convertFromDataObject(UserDO userDO, PassWordDO passwordDO) {
        if (userDO == null) {
            return null;
        }
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDO, userModel);
        if (passwordDO != null) {
            userModel.setPassword(passwordDO.getPassword());
        }
        return userModel;
    }
}
