<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
<div>
	<div class="text-center animated fadeInDown">
		<h1>500</h1>
		<h3 class="font-bold">服务器错误</h3>
		<div class="error-desc">
			很抱歉，服务器发生异常<br/> 返回首页: <br/>
			<a href="<c:url value=''/>" class="btn btn-primary m-t">返回首页</a>
		</div>
	</div>

</div>
</body>
</html>