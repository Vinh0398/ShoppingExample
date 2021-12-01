<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<form method="post">
	<input type="hidden" name="${_csrf.parameterName}"
		value="${_csrf.token}" />
	<p>
		<input type="email" class="form-control" placeholder="Email"
			name="email">
	</p>
	<p>
		<input class="form-control" placeholder="Username" type="text"
			name="username">
	</p>
	<p>
		<input class="form-control" placeholder="Password" type="password"
			name="password">
	</p>
	<p>
		<input type="number" class="form-control" placeholder="Số Điện Thoại"
			name="tel">
	</p>
	<p>
		<input type="text" class="form-control" placeholder="Địa Chỉ"
			name="address">
	</p>
	<p>
		<select name="gender">
			<option value="0">Nam</option>
			<option value="1">Nữ</option>
			<option value="2">Khác</option>
		</select>
	</p>
	<p>
		<button class="btn btn-primary btn-lg">Đăng Kí</button>
	</p>
	<p class="center">
		<a href="${pageContext.request.contextPath}/author/logon.html">Đăng
			Nhập</a>
	</p>
	<p class="center">
		<a href="${pageContext.request.contextPath}/author/forgot.html">Forgot
			Password?</a>
	</p>
</form>