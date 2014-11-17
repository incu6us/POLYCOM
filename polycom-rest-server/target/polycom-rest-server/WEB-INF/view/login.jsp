<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>SMPP Advanced Messaging Interface</title>
<link rel="stylesheet"
	href='<c:url value="/static/css/login/style.css"></c:url>'>
<!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body>
	<center>
		<center style="margin-top: 5%;">
			<img src='<c:url value="/static/images/logo.jpeg"/>' alt="logo" />
		</center>

		<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
			<font color="red"> Your login attempt was not successful due
				to <br />
			<br /> <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />.
			</font>
		</c:if>

		<table style="">
			<tr>
				<td><span>
						<form method="post" class="login"
							action="<c:url value="/j_spring_security_check" />">
							<p>
								<label for="login">Login:</label> <input type="text"
									name="username" id="login">
							</p>

							<p>
								<label for="password">Password:</label> <input type="password"
									name="password" id="password">
							</p>

							<p class="login-submit">
								<button type="submit" class="login-button">Login</button>
							</p>
						</form>
				</span></td>
			</tr>
		</table>
	</center>
	<center></center>
	<footer> 
	</footer>
</body>
</html>
