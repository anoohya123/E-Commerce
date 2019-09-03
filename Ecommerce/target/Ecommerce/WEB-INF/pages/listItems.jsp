<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


</head>
<body>
	<div class="top">
		<%-- <c:forEach items="${list}" var="list1">
    <tr>
        <td>ID: <c:out value="${list1.id}"/></td>
        <td>Content: <c:out value="${list1.content}"/></td>  
    </tr>
</c:forEach>
	<p>${list}</p> --%>
		<c:forEach items="${list}" var="list">
			<a href="${pageContext.request.contextPath}/commerce1/${list.product_type}">${list.product_type}</a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</c:forEach>
	</div>

	<div class="middle1">
		<img src="shirt.jpg" alt="Trousers"><a href="" />
	</div>
	<div class="middle2">
		<img src="shirt.jpg" alt="T-Shirt"><a href="" />
	</div>
	<div class="middle3">
		<img src="shirt.jpg" alt="shorts"><a href="" />
	</div>
	<div class="middle4">
		<img src="shirt.jpg" alt="Jeans"><a href="" />
	</div>
	<div class="middle5">
		<img src="shirt.jpg" alt="faded Jeans""><a href="" />
	</div>
	<div class="middle6">
		<img src="shirt.jpg" alt="Trousers"><a href="" />
	</div>
	<div class="middle7">
		<img src="shirt.jpg" alt="Shirt"><a href="" />
	</div>
</body>


</html>