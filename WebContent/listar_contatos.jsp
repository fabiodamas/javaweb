<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

	<c:import url="cabecalho.jsp" />

    <a href="formulario.html">Adicionar</a>

	<jsp:useBean id="dao"
		class="io.github.fabiodamas.Cap1_BaseDados.ContatoDao" />
	<table class="table table-hover table-striped">
		<tr>
			<th scope="col">Código</th>
			<th scope="col">Nome</th>
			<th scope="col">E-mail</th>
			<th scope="col">Endereço</th>
			<th scope="col">Data de Nascimento</th>
			<th scope="col"></th>			
		</tr>
		<c:forEach var="contato" items="${dao.lista}" varStatus="id">
			<!-- bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }" -->
			<tr>
				<td>${contato.id}</td>
				<td>${contato.nome}</td>
				<td><c:if test="${not empty contato.email}">
						<a href="mailto:${contato.email}">${contato.email}</a>
					</c:if> <c:if test="${empty contato.email}">
                          E-mail não informado
                      </c:if></td>
				<td>${contato.endereco}</td>
				<td><fmt:formatDate
						value="${contato.ConvertidoDataNascimento() }"
						pattern="dd/MM/yyyy" /></td>

				<td><a href="/edit?id=<c:out value='${contato.id}' />">Editar</a>
					| <a href="/delete?id=<c:out value='${contato.id}' />">Apagar</a>
				</td>
				
			</tr>

		</c:forEach>
	</table>

	<c:import url="rodape.jsp" />
</body>
</html>