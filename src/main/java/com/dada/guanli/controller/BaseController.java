package com.dada.guanli.controller;

import com.dada.guanli.error.BusinessException;
import com.dada.guanli.error.EmBusinessError;
import com.dada.guanli.response.CommonReturnType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lenovo
 * @create 2019-03-13 15:44
 * @desc
 **/
public class BaseController {
    public static final String CONTENT_TYPE_FORMED="application/json;charset=UTF-8;";

    //定义exceptionhandler解决未被controller层吸收的exception
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handlerException(HttpServletRequest request, Exception ex) {
        Map<String, Object> responseData = new HashMap<>();
        if (ex instanceof BusinessException) {
            BusinessException businessException = (BusinessException) ex;
            responseData.put("code", businessException.getErrCode());
            responseData.put("Msg", businessException.getErrMsg());
        } else {
            responseData.put("code", EmBusinessError.UNKNOWN_ERROR.getErrCode());
            responseData.put("Msg", EmBusinessError.UNKNOWN_ERROR.getErrMsg());
        }
        return CommonReturnType.create(responseData, "fail");
    }
}
