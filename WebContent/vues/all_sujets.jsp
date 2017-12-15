<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"	
<html>



<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>Mes sujets</title>
</head>




<body>

	<script type="text/javascript">
		function adh() {
			this.document.monF.action = "adherersujet.action";
			this.document.monF.submit();
		}
	</script>


	<script type="text/javascript">
		function details() {

			this.document.monF.action = "detailsujet.action";
			this.document.monF.method = "post";
			this.document.monF.submit();
		}
	</script>






	<s:form name="monF" method="post">


		<table border="0" bordercolor="black">
			<select name="id_sujet">

				<s:iterator value="arr">
					<option value="<s:property value="id_sujet"/>"><s:property value="id_sujet"/></option>
				</s:iterator>

			</select>





			<tr>
				<td><s:submit value="Adherer" onclick="adh()" /></td>
				<td><s:submit value="Voir Détails" onclick="details()" /></td>
			</tr>
		</table>




		<table border="1" bordercolor="black">
			<caption>Sujet</caption>




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



					<tr>
						<td colspan=2><a
							href="<%=application.getContextPath()%>/vues/commenter.jsp?id_sujet=<s:property value="id_sujet"/>">Commenter
						</a></td>

					</tr>






				</s:iterator>

			</tbody>
		</table>
	</s:form>



</body>





</html>