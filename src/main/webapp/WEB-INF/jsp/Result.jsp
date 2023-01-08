<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@page import="com.flames.model.*"%>
<%@page import="com.flames.service.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result of Flames</title>
</head>
<body style="background-color: lavender">
	<h1 align="center">	Flames gives, ${maleName} and ${femaleName} be <span style="color: red; font-style: italic;">${res}</span></h1>
		<%
			String res = (String) request.getAttribute("login");
			if (res.equalsIgnoreCase("F")) {
		%>
		<center>
			<img alt="Img" src="/resources/images/Friends.jpeg">
		</center>
		<%
			}
			if (res.equalsIgnoreCase("L")) {
		%>
		<center>
			<img alt="Img" src="/resources/images/Love.jpeg" wid>
		</center>
		<%
			}
			if (res.equalsIgnoreCase("A")) {
		%>
		<center>
			<img alt="Img" src="/resources/images/Affection.jpeg">
		</center>
		<%
			}
			if (res.equalsIgnoreCase("M")) {
		%>
		<center>
			<img alt="Img" src="/resources/images/Marriage.jpeg">
		</center>
		<%
			}
			if (res.equalsIgnoreCase("E")) {
		%>
		<center>
			<img alt="Img" src="/resources/images/Enemy.jpeg">
		</center>
		<%
			}
			if (res.equalsIgnoreCase("S")) {
		%>
		<center>
			<img alt="Img" src="/resources/images/Friends.jpeg">
		</center>
		<%
			}
		%>
	
</body>
</html>