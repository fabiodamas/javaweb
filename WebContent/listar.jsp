<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="dao"
		class="io.github.fabiodamas.Cap1_BaseDados.Estoque.ProdutoDao" />

    <table border="1" >

		<c:forEach var="contato" items="${dao.lista}">
			<tr>
				<td>${contato.id}</td>
				<td>${contato.nome}</td>
			</tr>
		</c:forEach>
	</table>

 </body>
</html>