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
	<table>
		<c:forEach items="${list2}" var="list2">

			<tr>
				<td><img src="data:image/jpg;base64,${list2.base64}" /></td>
			</tr>
			<tr>
				<td><c:out value="${list2.prod_list}">${list2.prod_list}</c:out></td>
			</tr>
			<tr>
				<td><c:out value="${list2.description}">${list2.description}</c:out>
				<td>
			</tr>
			<tr>
				<td>Price: <c:out value="${list2.prize}">${list2.prize}</c:out></td>
			</tr>
			<tr>
				<td>
					<form action="cart">
						<button>Add to Cart</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>