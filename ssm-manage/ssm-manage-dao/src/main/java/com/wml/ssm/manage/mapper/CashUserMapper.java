package com.wml.ssm.manage.mapper;

import com.wml.ssm.manage.pojo.CashUser;

public interface CashUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_user
     *
     * @mbg.generated
     */
    int insert(CashUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_user
     *
     * @mbg.generated
     */
    int insertSelective(CashUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_user
     *
     * @mbg.generated
     */
    CashUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CashUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cash_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CashUser record);
}