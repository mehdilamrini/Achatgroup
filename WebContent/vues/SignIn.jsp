<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"	
<html>

<!--  %@taglib prefix="html" uri="/META-INF/tlds/struts-html.tld" %-->
<%@ taglib prefix="s" uri="/struts-tags"%>



<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>Créer un Compte</title>
</head>

<script type="text/javascript">
	function Sign() {
		this.document.monF.action = "signin.action";
		this.document.monF.submit();

	}
</script>


<body>
	<form name="monF" method="post">
		<table border="1" bordercolor="black">
			<caption>Veuillez saisir toutes les informations</caption>

			<tbody>

				<tr>
					<td>Nom:</td>
					<td colspan=2><input type="text" name="userBean.nom" /></td>

				</tr>

				<tr>
					<td>Prenom:</td>
					<td colspan=2><input type="text" name="userBean.prenom" /></td>

				</tr>


				<tr>
					<td>Date de naissance:</td>
					<td colspan=2><input type="date" name="userBean.dt" /></td>

				</tr>


				<tr>
					<td>Email:</td>
					<td colspan=2><input type="text" name="userBean.email" /></td>

				</tr>

				<tr>
					<td>Password:</td>
					<td colspan=2><input type="password" name="userBean.password" /></td>
				<tr>
				<tr>


				</tr>

				<tr>
					<td colspan=3><input type="submit" value="Créer mon Compte"
						onclick="Sign()" /></td>
				</tr>

			</tbody>
		</table>



	</form>
</body>
</html>