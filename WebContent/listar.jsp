<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<title>Lista de Produtos</title>
</head>
<body>

	<c:import url="cabecalho.jsp" />


	<jsp:useBean id="dao"
		class="io.github.fabiodamas.Cap1_BaseDados.Estoque.ProdutoDao" />
	<table border="1">
		<tr>
			<th>Código</th>
			<th>Nome</th>
			<th>E-mail</th>
			<th>Data de Criação</th>
		</tr>
		<c:forEach var="produto" items="${dao.lista}" varStatus="id">
			<tr bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }">
				<td>${produto.id}</td>
				<td>${produto.nome}</td>
				<td><c:if test="${not empty produto.emailFabricante}">
						<a href="mailto:${produto.emailFabricante}">${produto.emailFabricante}</a>
					</c:if> <c:if test="${empty produto.emailFabricante}">
                          E-mail não informado
                      </c:if></td>
				<td><fmt:formatDate value="${produto.dataCriacao}"
						pattern="dd/MM/yyyy" /></td>
			</tr>

		</c:forEach>
	</table>

	<c:import url="rodape.jsp" />
</body>
</html>