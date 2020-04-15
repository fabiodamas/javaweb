
<%@ attribute name="id" required="true"%>

<input type="text" id="${id}" name="${id}" />

<script>
	$(function() {
		$("#${id}").datepicker();
	});
</script>
