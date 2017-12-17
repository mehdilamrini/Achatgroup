<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"	
<html>



<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>Profil</title>
</head>

<script type="text/javascript">
	function up() {
		
		this.document.monF.action = "update.action"
		this.document.monF.submit();

	}
</script>



<body>


	<form name="monF" method="post">





		<table border="1" bordercolor="black">
			<caption>Profil</caption>

			<tbody>



				<tr>
					<td>Nom</td>
					<td><input type="text" value="${sessionScope.nom}"  name="userBean.nom"></td>

				</tr>

				<tr>
					<td>Prenom:</td>
					<td colspan=2><input type="text" value="${sessionScope.prenom}" name="userBean.prenom"></td>

				</tr>


				<tr>
					<td>Date de naissance:</td>
					<td colspan=2><input type="date" value="${sessionScope.date_naissance}" name="userBean.dt"></td>

				</tr>


				<tr>
					<td>Email:</td>
					<td colspan=2><input type="text" value="${sessionScope.email}" name="userBean.email"></td>

				</tr>


				<tr>
					<td colspan=3><input type="submit" value="Modifier" onclick="up()" /></td>

				</tr>








			</tbody>

		</table>



	</form>




</body>





</html>