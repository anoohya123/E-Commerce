<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.top{

width:100%;
height:50px;

background-color:yellow;
color:black;
position:relative;
text-align:center;

}
</style>
</head>
<body>
<div class="top">
	<c:forEach items="${list1}" var="list1">
		 Image:<img src="data:image/jpg;base64,${list1.base64}"/>
		<br>
		<a href="${pageContext.request.contextPath}/commerce2/${list1.prod_list}"> <c:out
				value="${list1.prod_list}">
			</c:out>
		</a>
		<br>
		<c:out value="${list1.prize}">${list1.prize}</c:out>
		<br>

	</c:forEach>
	</div>
</body>
</html>