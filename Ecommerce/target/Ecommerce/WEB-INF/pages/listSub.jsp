<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${list2}" var="list2">
		<c:out value="${list2.prod_list}">${list2.prod_list}</c:out>
		<br>
    Image:<c:out value="${list2.image}">${list2.image}</c:out>
		<br>

		<c:out value="${list2.description}">${list2.description}</c:out>"
	 <c:out value="${list2.prize}">${list2.prize}</c:out>
		<br>
		<c:out value="${list2.quantity}">${list2.quantity}</c:out>
		<br>

	</c:forEach>
</body>
</html>