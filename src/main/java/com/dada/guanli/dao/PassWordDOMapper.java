package com.dada.guanli.dao;

import com.dada.guanli.dataobject.PassWordDO;

public interface PassWordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password_hou
     *
     * @mbg.generated Sat Jun 01 23:15:48 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password_hou
     *
     * @mbg.generated Sat Jun 01 23:15:48 CST 2019
     */
    int insert(PassWordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password_hou
     *
     * @mbg.generated Sat Jun 01 23:15:48 CST 2019
     */
    int insertSelective(PassWordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password_hou
     *
     * @mbg.generated Sat Jun 01 23:15:48 CST 2019
     */
    PassWordDO selectByPrimaryKey(Integer id);
    PassWordDO selectByUserId(Integer userHouId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password_hou
     *
     * @mbg.generated Sat Jun 01 23:15:48 CST 2019
     */
    int updateByPrimaryKeySelective(PassWordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password_hou
     *
     * @mbg.generated Sat Jun 01 23:15:48 CST 2019
     */
    int updateByPrimaryKey(PassWordDO record);
    int updatePassword(String password, Integer userHouId);


}