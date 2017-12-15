<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"	
<html>



<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>Profil</title>
</head>

<script type="text/javascript">
	function Sign() {
		this.document.monF.action = "signin.action";
		this.document.monF.submit();

	}
</script>

<jsp:useBean id="userBean"
	class="achatcollectif.presentation.actions.LoginAction"  scope="application" />

<body>


	<form name="monF" method="post">





		<table border="1" bordercolor="black">
			<caption>Profil</caption>

			<tbody>



				<tr>
					<td>Nom</td>
					<td><jsp:getProperty property="nom" name="userBean"/></td>

				</tr>
				
				<tr>
					<td>Prenom:</td>
					<td colspan=2><jsp:getProperty property="prenom" name="userBean"/></td>

				</tr>


				<tr>
					<td>Date de naissance:</td>
					<td colspan=2><jsp:getProperty property="date_naissance" name="userBean"/></td>

				</tr>


				<tr>
					<td>Email:</td>
					<td colspan=2><jsp:getProperty property="email" name="userBean"/></td>

				</tr>





			</tbody>

		</table>



	</form>




</body>





</html>