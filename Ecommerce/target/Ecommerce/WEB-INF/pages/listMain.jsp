<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
/* .top{

width:100%;
height:100px;

background-color:yellow;
color:black;

text-align:center;

} */
</style>
</head>
<body>
	<div class="top">
		<table>

			<c:forEach items="${list1}" var="list1">
				<tr>
					<td><img src="data:image/jpg;base64,${list1.base64}" /></td>
				</tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/commerce2/${list1.prod_list}">
							<c:out value="${list1.prod_list}">
							</c:out>
					</a></td>
				</tr>

				<tr>
					<td><c:out value="${list1.prize}">${list1.prize}</c:out></td>
				</tr>

				<tr>
					<td><form action="${pageContext.request.contextPath}/commerce2/cart1" method="get">
							<button>Add to Cart</button>
						</form></td>
				</tr> 
				
			</c:forEach>
		</table>
	</div>

</body>
</html>