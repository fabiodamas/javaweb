<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/reset.css" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css" />
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

</head>
<body>
	<nav class="top-bar" data-topbar role="navigation">
	
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
	
	<c:url value="img/logo.png"  var="logo" />
	
	<img src="${logo}" align="left"/> 
	
	<div class="d-flex justify-content-end"><h1> <a href="#" style="text-decoration: none;"> &nbsp  Gerenciador de contatos</a> </h1></div>

	</nav>
	
	<hr/>