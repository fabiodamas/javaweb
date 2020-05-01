<%@ attribute name="id" required="true"%>
<%@ attribute name="label" required="false"%>


<label>${label}</label>
<input type="text" id="${id}" name="${id}" />


	

<script>
	$(function() {
		$("#${id}").datepicker();
	});
</script>


