<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"	
<html>

<!--  %@taglib prefix="html" uri="/META-INF/tlds/struts-html.tld" %-->
<%@ taglib prefix="s" uri="/struts-tags"%>


<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>ACCUEIL</title>
</head>

<script type="text/javascript">
	function login() {
		this.document.monF.action = "login.action";
		this.document.monF.submit();

	}


	function adh(){
		this.document.monF.action="listerall.action";
		this.document.monF.submit();
		
	}
		
</script>


<body>


	<form name="monF" method="post">

		<!--  input type="hidden" name="userBean.id_utilisateurs" -->


		<table border="1" bordercolor="black">
			<caption>Se connecter</caption>

			<tbody>


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
					<td colspan=3><input type="submit" value="Se connecter"
						onclick="login()" /> <a
						href="<%=application.getContextPath()%>/vues/signin.jsp">Créer
							un Compte</a></td>
				</tr>



				
				
				
				

			</tbody>

		</table>



	</form>


			


</body>





</html>