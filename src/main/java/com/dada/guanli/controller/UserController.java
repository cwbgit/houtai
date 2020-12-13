package com.dada.guanli.controller;

import com.dada.guanli.error.BusinessException;
import com.dada.guanli.error.EmBusinessError;
import com.dada.guanli.response.CommonReturnType;
import com.dada.guanli.service.UserService;
import com.dada.guanli.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static com.dada.guanli.controller.BaseController.CONTENT_TYPE_FORMED;

/**
 * @author lenovo
 * @create 2019-06-01 22:34
 * @desc
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    //用户登陆接口

    /**
     *
     * @param userModel zhanghao password
     * @return
     * @throws BusinessException
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @RequestMapping(value = "/login", method = {RequestMethod.POST}, consumes = {CONTENT_TYPE_FORMED})
    @ResponseBody
    public CommonReturnType login(@RequestBody UserModel userModel) throws BusinessException, UnsupportedEncodingException, NoSuchAlgorithmException {
        if (userModel == null) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }
        //用户登陆服务，用来校验用户登录是否合法
        userModel = userService.validateLogin(userModel.getZhanghao(), this.EncodeByMd5(userModel.getPassword()));
        return CommonReturnType.create(null);
    }

    //用户修改密码

    /**
     *
     * @param userModel zhanghao password
     * @return
     * @throws BusinessException
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @RequestMapping(value = "/updatepassword", method = {RequestMethod.POST}, consumes = {CONTENT_TYPE_FORMED})
    @ResponseBody
    public CommonReturnType updataPasswordPS(@RequestBody UserModel userModel) throws BusinessException, UnsupportedEncodingException, NoSuchAlgorithmException {
        if (userModel == null) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }
        //用户修改密码验证
        userModel.setPassword(this.EncodeByMd5(userModel.getPassword()));
        userModel = userService.validateUpdatePS(userModel);
        return CommonReturnType.create(userModel);
    }



    public String EncodeByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密字符串
        String newstr = base64en.encode(md5.digest(str.getBytes("UTF-8")));
        return newstr;
    }
}
