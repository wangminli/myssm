<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ include file="/WEB-INF/view/common/tagPage.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>首页</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
</head>
<body>


<h2>
    <a href="http://www.wangminli.com" target="_blank">Hello WangMinLi</a>
</h2>

<br>

<a href="/sysUserController/showUserToJspById/1" target="_blank">查询用户信息并跳转到一个JSP页面</a>

<br>
<a href="/sysUserController/testDynamicDataSource" target="_blank">多数据源测试，查询贷款表数据库</a>
<br>
<a href="/sysUserController/testResultBean" target="_blank">测试ResultBean</a>
<br>

<a href="/sysUserController/showUserToJSONById/1" target="_blank">查询用户信息并直接输出JSON数据</a>
<%--推送信息--%>
<a href="/mq/sendMq" target="_blank">发送mq消息</a><br>
<a href="/mq/receiveMq" target="_blank">接收mq消息</a><br>
<a href="/exception/setExceptionList" target="_blank">制造一个异常</a><br>
<a href="/exception/getExceptionList" target="_blank">异常页显示</a><br>
<a href="/uploadFile/input-product" target="_blank">文件上传组件</a><br>

</body>
</html>
