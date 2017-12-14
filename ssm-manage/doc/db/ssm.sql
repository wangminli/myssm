/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50638
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50638
File Encoding         : 65001

Date: 2017-12-14 18:34:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_exception_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_exception_log`;
CREATE TABLE `sys_exception_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户主键',
  `user_name` varchar(255) NOT NULL,
  `type` varchar(128) DEFAULT NULL,
  `content` varchar(512) NOT NULL COMMENT '异常信息',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_exception_log
-- ----------------------------
INSERT INTO `sys_exception_log` VALUES ('1', '1', 'foobar', null, '/ by zero', '2017-12-14 16:37:52');
INSERT INTO `sys_exception_log` VALUES ('2', '1', 'foobar', null, '/ by zero', '2017-12-14 16:39:03');
INSERT INTO `sys_exception_log` VALUES ('3', '1', 'foobar', null, '/ by zero', '2017-12-14 16:40:57');
INSERT INTO `sys_exception_log` VALUES ('4', '1', 'foobar', null, '/ by zero', '2017-12-14 16:47:43');
INSERT INTO `sys_exception_log` VALUES ('5', '1', 'foobar', null, '/ by zero', '2017-12-14 16:47:59');
INSERT INTO `sys_exception_log` VALUES ('6', '1', 'foobar', null, 'java.lang.ArithmeticException: / by zero\r\n	at com.youmeek.ssm.manage.controller.SysUserController.showUser(SysUserController.java:33)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)', '2017-12-14 17:01:15');
INSERT INTO `sys_exception_log` VALUES ('7', '1', 'foobar', null, 'java.lang.ArithmeticException: / by zero\r\n	at com.youmeek.ssm.manage.controller.SysUserController.showUser(SysUserController.java:31)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n	at java.lang.reflect.Method.invoke(Method.java:498)\r\n	at org.springframework.web.method.support.InvocableHandlerMethod.invoke', '2017-12-14 17:05:23');
INSERT INTO `sys_exception_log` VALUES ('8', '1', 'foobar', '/ by zero', 'java.lang.ArithmeticException: / by zero\r\n	at com.youmeek.ssm.manage.controller.SysUserController.showUser(SysUserController.java:31)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n	at java.lang.reflect.Method.invoke(Method.java:498)\r\n	at org.springframework.web.method.support.InvocableHandlerMethod.invoke', '2017-12-14 17:09:23');
INSERT INTO `sys_exception_log` VALUES ('9', '1', 'foobar', '/ by zero', 'java.lang.ArithmeticException: / by zero\r\n	at com.youmeek.ssm.manage.controller.SysUserController.showUser(SysUserController.java:31)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n	at java.lang.reflect.Method.invoke(Method.java:498)\r\n	at org.springframework.web.method.support.InvocableHandlerMethod.invoke', '2017-12-14 18:01:59');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `sys_user_id` bigint(20) NOT NULL,
  `sys_user_login_name` varchar(50) NOT NULL,
  `sys_user_login_password` varchar(50) NOT NULL,
  `sys_user_status` varchar(1) NOT NULL,
  `sys_user_is_delete` varchar(1) NOT NULL,
  `sys_user_register_datetime` datetime NOT NULL,
  `sys_user_register_source` varchar(1) NOT NULL,
  `sys_user_type` varchar(1) NOT NULL,
  `sys_user_sex` varchar(1) NOT NULL,
  `sys_user_is_email_active` varchar(1) NOT NULL,
  `sys_user_is_mobile_active` varchar(1) NOT NULL,
  `sys_user_register_type` varchar(1) NOT NULL,
  `sys_user_pay_passwrod` varchar(50) DEFAULT NULL,
  `sys_user_icon` varchar(100) DEFAULT NULL,
  `sys_user_real_name` varchar(20) DEFAULT NULL,
  `sys_user_email` varchar(50) DEFAULT NULL,
  `sys_user_mobile` varchar(20) DEFAULT NULL,
  `sys_user_weibo_id` varchar(36) DEFAULT NULL,
  `sys_user_qq_id` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`sys_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'YouMeek1', 'e10adc3949ba59abbe56e057f20f883e', '0', 'N', '2016-02-24 00:12:23', '0', '0', '0', 'Y', 'Y', '0', 'e10adc3949ba59abbe56e057f20f883e', '', '张觉恩1', '363379441@qq.com', '13800000001', '', '');
INSERT INTO `sys_user` VALUES ('2', 'YouMeek2', 'e10adc3949ba59abbe56e057f20f883e', '0', 'N', '2016-02-24 00:12:23', '0', '0', '0', 'Y', 'Y', '0', 'e10adc3949ba59abbe56e057f20f883e', '', '张觉恩2', '363379442@qq.com', '13800000002', '', '');
INSERT INTO `sys_user` VALUES ('3', 'YouMeek3', 'e10adc3949ba59abbe56e057f20f883e', '0', 'N', '2016-02-24 00:12:23', '0', '0', '0', 'Y', 'Y', '0', 'e10adc3949ba59abbe56e057f20f883e', '', '张觉恩3', '363379443@qq.com', '13800000003', '', '');
INSERT INTO `sys_user` VALUES ('4', 'YouMeek4', 'e10adc3949ba59abbe56e057f20f883e', '0', 'N', '2016-02-24 00:12:23', '0', '0', '0', 'Y', 'Y', '0', 'e10adc3949ba59abbe56e057f20f883e', '', '张觉恩4', '363379444@qq.com', '13800000004', '', '');
INSERT INTO `sys_user` VALUES ('5', 'YouMeek5', 'e10adc3949ba59abbe56e057f20f883e', '0', 'N', '2016-02-24 00:12:23', '0', '0', '0', 'Y', 'Y', '0', 'e10adc3949ba59abbe56e057f20f883e', '', '张觉恩5', '363379445@qq.com', '13800000005', '', '');
