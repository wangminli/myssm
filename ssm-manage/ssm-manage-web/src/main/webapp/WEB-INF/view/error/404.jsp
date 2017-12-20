<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<!-- 头部引用 -->
<body>
	<div id="wrapper">

		<!-- 左侧菜单  end -->
		<div id="page-wrapper" class="gray-bg">
			<!-- 页面header信息  start  -->
			<!-- 页面header信息  end  -->
			<!-------------------- 页面标题  start  -------------------------->
			<!-- 内容区  start -->
			<div class="middle-box text-center animated fadeInDown">
				<h1>404</h1>
				<h3 class="font-bold">找不到网页</h3>
				<div class="error-desc">
					对不起，网页地址未找到。请核实您的URL地址，或者点击按钮回到首页
						<a type="button" href="<c:url value='/login/index'/>" class="btn btn-primary">返回首页</a>
				</div>
			</div>
			<!-- 内容区  end -->

		</div>
	</div>
</body>
</html>