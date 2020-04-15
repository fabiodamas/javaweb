<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
          

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>jQuery UI Datepicker - Default functionality</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css" />
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
</head>
<body>

	<p></p>

	<form action="adicionaContato">
		Nome: <input type="text" name="nome" /> 
		<br/>
		 
		E-mail: <input type="text" name="email" />
		<br/>
		
		Endereço: <input type="text" name="endereco" /> 
		<br/>
		
		Data Nascimento:   <caelum:campoData id="dataNascimento" /> 
		<br/>
		
		<input type="submit" value="Gravar" />
	</form>

</body>
</html>