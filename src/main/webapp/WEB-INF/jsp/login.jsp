<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%-- <c:set var="contextPath" value="${pageContext.request.contextPath}" /> --%>
<!DOCTYPE html>
<html>
<head>
	<title>Log in with your account</title>
	
 	<link href="/css/logins.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<div class="container">
	
		<c:if test="${not empty error}">
			<div>${error}</div>
		</c:if>
		<c:if test="${not empty message}">
			<div>${message}</div>
		</c:if>

		<form method="POST" action="/login">
			<h2>Login Here</h2>
			<input type="text" placeholder="Username" name="username" required> 
			<br /> 
			<input type="password" placeholder="Password" name="password" required>
			<button type="submit">Login</button>
			

			<p><a href="/registration">Register</a></p>
	

			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
      
    </div>

</body>
</html>