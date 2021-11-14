<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<form:form method="post" modelAttribute="obj" cssClass="form">
	<p>
		<label>Name</label>
		<form:input path="name" />
	</p>
	<p>
		<label>Parent</label>
		<form:select path="parent">
			<form:option value="">--Select Parent--</form:option>
			<form:options items="${map}" />
		</form:select>
	</p>
	<p>
		<button>Save</button>
	</p>
</form:form>