<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8">
<tiles:insertAttribute name="resource" />
</head>
<body>
     <!-- Header Form Login -->
     <tiles:insertAttribute name="header"/>
     <!-- Center Form Create Account -->
     <tiles:insertAttribute name="center"/>
</body>
</html>