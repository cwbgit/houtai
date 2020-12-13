package com.dada.guanli.service.model;

/**
 * @author lenovo
 * @create 2019-06-02 0:06
 * @desc
 **/
public class UserModel {
    private Integer id;
    private String zhanghao;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZhanghao() {
        return zhanghao;
    }

    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
