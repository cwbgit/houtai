package com.dada.guanli.dataobject;

public class UserDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_hou.id
     *
     * @mbg.generated Sat Jun 01 23:15:48 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_hou.zhanghao
     *
     * @mbg.generated Sat Jun 01 23:15:48 CST 2019
     */
    private String zhanghao;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_hou.id
     *
     * @return the value of user_hou.id
     *
     * @mbg.generated Sat Jun 01 23:15:48 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_hou.id
     *
     * @param id the value for user_hou.id
     *
     * @mbg.generated Sat Jun 01 23:15:48 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_hou.zhanghao
     *
     * @return the value of user_hou.zhanghao
     *
     * @mbg.generated Sat Jun 01 23:15:48 CST 2019
     */
    public String getZhanghao() {
        return zhanghao;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_hou.zhanghao
     *
     * @param zhanghao the value for user_hou.zhanghao
     *
     * @mbg.generated Sat Jun 01 23:15:48 CST 2019
     */
    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao == null ? null : zhanghao.trim();
    }
}