package com.wml.ssm.manage.pojo;

import org.apache.commons.lang3.StringUtils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

public class SysExceptionLog {
    public SysExceptionLog() {}

    public SysExceptionLog(Exception e){
        this.setUserId(1);
        this.setUserName("foobar");
        this.setCreateTime(new Date());
        this.setType(e.getMessage());
        this.setContent(StringUtils.left(this.getExStr(e), 500));
    }

    /**
     * 将异常打印转为String
     * @param ex
     * @return
     */
    private String  getExStr(Exception ex){
        StringWriter sw = new StringWriter();
        ex.printStackTrace(new PrintWriter(sw, true));
        return sw.toString();
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_exception_log.id
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_exception_log.user_id
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_exception_log.user_name
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_exception_log.type
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_exception_log.content
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_exception_log.create_time
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_exception_log.id
     *
     * @return the value of sys_exception_log.id
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_exception_log.id
     *
     * @param id the value for sys_exception_log.id
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_exception_log.user_id
     *
     * @return the value of sys_exception_log.user_id
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_exception_log.user_id
     *
     * @param userId the value for sys_exception_log.user_id
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_exception_log.user_name
     *
     * @return the value of sys_exception_log.user_name
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_exception_log.user_name
     *
     * @param userName the value for sys_exception_log.user_name
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_exception_log.type
     *
     * @return the value of sys_exception_log.type
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_exception_log.type
     *
     * @param type the value for sys_exception_log.type
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_exception_log.content
     *
     * @return the value of sys_exception_log.content
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_exception_log.content
     *
     * @param content the value for sys_exception_log.content
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_exception_log.create_time
     *
     * @return the value of sys_exception_log.create_time
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_exception_log.create_time
     *
     * @param createTime the value for sys_exception_log.create_time
     *
     * @mbg.generated Thu Dec 14 17:08:34 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}