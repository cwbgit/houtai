package com.dada.guanli.error;

public enum EmBusinessError implements CommonError{
    //通用错误类型10001
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    UNKNOWN_ERROR(11000,"未知错误"),

    //20000开头为用户信息相关错误定义

    USER_NOT_EXIST(20001,"用户不存在"),
    USER_LOGIN_FALL(20002,"密码错误"),
    USER_ERROR_EMPTY(20003,"注册信息为空"),
    USER_IDNUMBER_FALL(20004,"身份证错误"),
    USER_BANKCARD_FALL(20005,"银行卡错误"),
    USER_FQDKSQ_FALL(20006,"分期贷款申请未通过"),
    USER_MXDKSQ_FALL(20007,"免息贷款申请未通过"),
    USER_MXED_FALL(20008,"免息额度不足"),
    USER_FQED_FALL(20009,"分期额度不足"),
    USER_MXDAYS_FALL(20010,"免息天数不足"),
    USER_MXDKSQ_EXIST(20011,"该手机号已申请免息贷款"),
    USER_FQDKSQ_EXIST(20012,"该手机号已申请分期贷款"),
    USER_PERSONAL_EMPTY(20013,"身份信息未认证"),
    USER_WORK_EMPTY(20014,"工作信息未认证"),
    USER_HOME_EMPTY(20015,"家庭信息未认证"),
    USER_MXEDSQ_FALL(20016,"免息贷款必须满额申请"),
    USER_DHJBSQ_EXIST(20017,"该手机号已申请贷还借呗"),
    USER_DHWLDSQ_EXIST(20018,"该手机号已申请贷还微粒贷"),
    USER_DHDKSQ_FALL(20019,"代还贷款申请未通过"),



    //30000开头为手机号信息相关错误定义
    PHONE_PARAMETER_EXIST(30001,"手机号已存在"),
    //40000开头为邀请码信息相关错误定义
    INVITATION_PARAMETER_EXIST(40001,"邀请码已存在"),
    INVITATION_PARAMETER_EMPTY(40002,"邀请码为空"),
    INVITATION_PARAMETER_FALL(40003,"邀请码错误"),
    ;

    private EmBusinessError(int errCode,String errMsg){
        this.errCode = errCode;
        this.errMsg = errMsg;

    }
    private int errCode;
    private String errMsg;
    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
