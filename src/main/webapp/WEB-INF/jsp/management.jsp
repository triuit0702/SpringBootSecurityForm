<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<table>
			<tr>
				<th>Id</th>
				<th>Full Name</th>
				<th>User Name</th>
			</tr>
			<c:forEach items="${listUser}" var="user">
				<tr>
					<td>${user.id}</td>
					<td>${user.fullname}</td>
					<td>${user.username}</td>
				</tr>
			</c:forEach>
			
		</table>
	</div>
</body>
</html>