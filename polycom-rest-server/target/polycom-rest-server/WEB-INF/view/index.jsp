<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="java.util.Arrays"%>
<%@ page import="org.springframework.context.annotation.Import"%>
<%@ page import="org.springframework.security.core.Authentication" %>
<%@ page import="org.springframework.security.core.GrantedAuthority" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page import="java.util.Collection" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

<!--  <link rel="stylesheet" href='<c:url value="/static/css/login/style.css"></c:url>'>-->

<!-- jQuery -->
<script src='<c:url value="/static/js/control/jquery.min.js"></c:url>'></script>

<!-- Bootstrap -->
<link rel="stylesheet"
	href='<c:url value="/static/css/control/bootstrap.min.css"></c:url>' />
<script
	src='<c:url value="/static/js/control/bootstrap.min.js"></c:url>'></script>
	
<!-- Data table -->
<script class='jsbin' src='<c:url value="/static/js/control/jquery.dataTables.min.js"></c:url>'></script>
<link rel="stylesheet"
	href='<c:url value="/static/css/control/jquery.dataTables.css"></c:url>' />

<title>Test Index page</title>

</head>
<body>




</body>
</html>