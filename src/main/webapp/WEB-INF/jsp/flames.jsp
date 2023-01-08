<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flames</title>
</head>
<body style="background-color: #e8d6b4;">
	<h1>
		<center>FLAMES</center>
	</h1>
	<center>
		<form:form action="result" method="post"
			modelAttribute="flameAttribute">
			<table>
				<tr>
					<td>Male Name:</td>
					<td><sf:input path="maleName" type="text" id="maleName"
							name="maleName" /></td>
				</tr>
				<tr>
					<td>Female Name:</td>
					<td><sf:input path="femaleName" type="text" id="femaleName"
							name="femaleName" /></td>
				</tr>

			</table>
			<center>
				<input type="submit" name="submit" id="submit" value="Flames" />
			</center>
		</form:form>
	</center>
</body>
</html>
