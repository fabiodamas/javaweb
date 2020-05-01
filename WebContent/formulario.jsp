<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:import url="cabecalho.jsp" />

<form action="adicionaContato">
	<div class="form-group row">
		<label for="nome" class="col-sm-2 col-form-label">Nome</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="nome" name="nome"
				placeholder="Nome">
		</div>
	</div>

	<div class="form-group row">
		<label for="email" class="col-sm-2 col-form-label">Email</label>
		<div class="col-sm-10">
			<input type="email" class="form-control" id="email" name="email"
				placeholder="E-mail">
		</div>
	</div>

	<div class="form-group row">
		<label for="endereco" class="col-sm-2 col-form-label">Endereço</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="endereco" name="endereco"
				placeholder="Endereço">
		</div>
	</div>

	<div class="form-group row">
		<label for="dataNascimento" class="col-sm-2 col-form-label">Data
			de Nascimento</label>
		<div class="col-sm-10">
			<input type="date" class="form-control" id="dataNascimento"
				name="dataNascimento" placeholder="Data de nascimento">
		</div>
	</div>


	<br />

	<button type="submit" class="btn btn-primary">Gravar</button>
</form>


<c:import url="rodape.jsp" />
