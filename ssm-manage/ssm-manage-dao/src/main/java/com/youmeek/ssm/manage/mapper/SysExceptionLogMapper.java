package com.youmeek.ssm.manage.mapper;

import com.youmeek.ssm.manage.pojo.SysExceptionLog;

public interface SysExceptionLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_exception_log
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_exception_log
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    int insert(SysExceptionLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_exception_log
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    int insertSelective(SysExceptionLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_exception_log
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    SysExceptionLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_exception_log
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    int updateByPrimaryKeySelective(SysExceptionLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_exception_log
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    int updateByPrimaryKey(SysExceptionLog record);
}