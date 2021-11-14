<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="UTF-8">
<form method="post" class="form">
	<p>
		<label>Email</label> <input placeholder="Email"
			value="" type="email" name="email">
	</p>
	<p>
		<label>SĐT</label> <input type="tel" name="tel" value=""
			placeholder="Tel">
	</p>
	<p>
		<label>Địa Chỉ</label> <input type="text" name="address" value=""
			placeholder="Address">
	</p>
	<table class="table table-bordered">
		<tr>
			<th>Title</th>
			<th>Quantity</th>
			<th>Giá</th>
			<th>Hình Ảnh</th>
			<th>Xoá</th>
		</tr>
		<c:forEach items="${list}" var="o">
			<tr>
				<td>${o.title}</td>
				<td><input type="number" value="${o.quantity}" class="qty"></td>
				<td>${o.price}</td>
				<td><img width="70px"
					src="${pageContext.request.contextPath}/upload/${o.imageUrl}"></td>
				<td><img
					src="${pageContext.request.contextPath}/images/trash.png"></td>
			</tr>
		</c:forEach>
	</table>
	<p>
		<button class="btn btn-primary">Đặt Hàng</button>
</form>
