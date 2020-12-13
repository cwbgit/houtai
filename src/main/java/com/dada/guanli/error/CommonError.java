package com.dada.guanli.error;

/**
 * @author lenovo
 * @create 2019-03-13 14:22
 * @desc
 **/
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
