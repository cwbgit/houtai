package com.dada.guanli.service;

import com.dada.guanli.error.BusinessException;
import com.dada.guanli.service.model.UserModel;

/**
 * @author lenovo
 * @create 2019-06-02 0:04
 * @desc
 **/
public interface UserService {
    UserModel validateLogin(String zhanghao, String password) throws BusinessException;

    UserModel validateUpdatePS(UserModel userModel) throws BusinessException;
}
