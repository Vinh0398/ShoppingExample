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
		<input class="form-control" value="" placeholder="Username"
			type="text" name="username">
	</p>
	<p>
		<input class="form-control" value="" placeholder="Password"
			type="password" name="password">
	</p>
	<p>
		<label> <input type="checkbox" name="remember" value="1">
			Remember me
		</label>
	</p>
	<p>
		<button class="btn btn-primary btn-lg">Đăng Nhập</button>
	</p>
	<p class="center">
		<a href="${pageContext.request.contextPath}/author/register.html">Đăng
			Kí Tài Khoản</a>
	</p>
	<p class="center">
		<a href="${pageContext.request.contextPath}/auth/forgot.html">Forgot
			Password?</a>
	</p>
</form>