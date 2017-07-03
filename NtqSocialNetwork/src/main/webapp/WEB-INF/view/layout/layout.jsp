<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<tiles:insertAttribute name="resources" />
</head>
<body>
	<div id="wrapper">
		<tiles:insertAttribute name="header" />
		<div id="page-content">
			<tiles:insertAttribute name="body" />
		</div>
	</div>
</body>
</html>