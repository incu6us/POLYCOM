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

<title>Polycom Test Page</title>

<script type="text/javascript">
    var getAddrBook = function() {
        $.ajax({
            url: "<c:url value='/rest/getAddress/all'></c:url>",
            type: 'GET',
            cache: false,
            success: function(data) {
                $('#addrBook').html(data);
                console.debug(html);
            }
        });
    };
    
    var getAddrBookByName = function() {
    	var pattern = $('#addrPattern').val();
        $.ajax({
            url: "<c:url value='/rest/getAddress/"+pattern+"'></c:url>",
            type: 'GET',
            cache: false,
            success: function(data) {
                $('#addrBook').html(data);
                console.debug(html);
            }
        });
    };

    var getDialByDir = function() {
    	var dirName = $('#dialDirName').val();
        $.ajax({
            url: "<c:url value='/rest/dial/byDirectoryName/"+dirName+"'></c:url>",
            type: 'GET',
            cache: false,
            success: function(data) {
                $('#addrBook').html(data);
                console.debug(html);
            }
        });
    };
    
    var getDialByPhone = function() {
    	var dirName = $('#dialphoneNumber').val();
        $.ajax({
            url: "<c:url value='/rest/dial/byPhone/"+dirName+"'></c:url>",
            type: 'GET',
            cache: false,
            success: function(data) {
                $('#addrBook').html(data);
                console.debug(html);
            }
        });
    };
</script>
</head>
<body>

<textarea rows="10" cols="150" id="addrBook" readonly="readonly"></textarea>
<br>
	<table class="table table-hover" style="width: 600px;">
		<tr>
			<td><label>Get All Addressed:</label></td>
			<td></td>
			<td><button onclick="getAddrBook();">getAllAddrBook</button></td>
		</tr>
		<tr>
			<td><label>Get Address By Pattern:</label></td>
			<td><input type="text" id="addrPattern"/></td>
			<td><button onclick="getAddrBookByName();">getAddrBook</button></td>
		</tr>
		<tr>
			<td><label>Dial By Address In Directory:</label></td>
			<td><input type="text" id="dialDirName"></td>
			<td><button onclick="getDialByDir();">dialByDirectoryName</button></td>
		</tr>
		<tr>
			<td><label>Dial By Address In Directory:</label></td>
			<td><input type="text" id="dialphoneNumber"></td>
			<td><button onclick="getDialByPhone();">dialByDirectoryName</button></td>
		</tr>
	</table>


</body>
</html>