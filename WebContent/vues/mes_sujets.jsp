<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"	
<html>



<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>Mes sujets</title>
</head>




<body>

	<script type="text/javascript">
		function del() {
			 //var element = this.document.getElementById("id").value;
			this.document.monF.action = "deletesujet.action";
			this.document.monF.submit();
		}
	</script>

















	<form name="monF" method="post">

		<select name="id_sujet">

			<s:iterator value="arr">
			
				<option value="<s:property value="id_sujet"/>"><s:property value="id_sujet"/></option>
			
			</s:iterator>
			
			<s:submit value="Supprimer" onclick="del()" />


		</select>



		<table border="1" bordercolor="black">
			<caption>Mes sujets</caption>



			<tbody>

				<s:iterator value="arr">



					<tr>
						<td>Id</td>
						<td colspan=2><s:property value="id_sujet" /></td>



					</tr>


					<tr>
						<td>Titre</td>
						<td colspan=2><s:property value="titre" /></td>

					</tr>

					<tr>
						<td>Date expiration</td>

						<td colspan=2><s:property value="date_expiration" /></td>

					</tr>

					<tr>
						<td>Rubrique</td>
						<td colspan=2><s:property value="rubrique" /></td>

					</tr>

					<tr>

						<td>prix_initial</td>
						<td colspan=2><s:property value="prix_initial" /></td>

					</tr>

					<tr>
						<td>prix_final</td>
						<td colspan=2><s:property value="prix_final" /></td>

					</tr>

					<tr>
						<td>Nombre finaux d'utilisateurs</td>

						<td colspan=2><s:property value="nb_utilisateurs" /></td>

					</tr>

					<tr>
						<td>description</td>
						<td colspan=2><s:property value="description" /></td>

					</tr>
					
					<tr>
						<td>Validation</td>
						<td colspan=2><s:property value="validation" /></td>

					</tr>








				</s:iterator>

			</tbody>
		</table>
	</form>

</body>





</html>