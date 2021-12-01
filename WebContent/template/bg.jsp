<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Mini Shop</title>
<title><tiles:insertAttribute name="title" /></title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/css.css">
</head>
<body>
	<div class="title">
		<div class="container">
			<div class="brand">
				<a href="${pageContext.request.contextPath}">Mini Shop</a>
			</div>
		</div>
	</div>
	<div class="sidebar">

		<ul>
			<li><a href="${pageContext.request.contextPath}/home/index.html">Trang Chủ</a></li>
			<li><a
				href="${pageContext.request.contextPath}/upload/simple.html">Upload
					File</a></li>
			<li><a
				href="${pageContext.request.contextPath}/upload/multi.html">Multi
					Upload</a></li>
			<%-- <li><a href="${pageContext.request.contextPath}/sendemail.html">Send
					Email</a></li> --%>
			<li><a href="${pageContext.request.contextPath}/admin/author/index.html">Author</a></li>
		</ul>
	</div>
	<div class="main">
		<tiles:insertAttribute name="content" />
	</div>
</body>
</html>