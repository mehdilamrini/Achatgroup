<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"	
<html>

<!--  %@taglib prefix="html" uri="/META-INF/tlds/struts-html.tld" %-->
<%@ taglib prefix="s" uri="/struts-tags" %>


<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>ACCUEIL</title>
</head>

<script type="text/javascript">


function Sign(){
	this.document.monF.action="signin.action";
	this.document.monF.submit();
	
}



</script>


<body>
 
<!--  >p> <html:errors  property="name.obligatoire "/> </p>
<p> <html:errors  property="prenom.obligatoire "/> </p>
<p> <html:errors  property="cin.taille"/></p>
<p> <html:errors  property="cin.lettre"/></p>
<p> <html:errors  property="tel.taille"/></p>
<p> <html:errors  property="tel.chiffres"/></p>
<p> <html:errors  property="mail.forme"/></p-->



<form name="monF" method="get">



<table border="1" bordercolor="black">
<caption>Se connecter</caption>

<tbody>

<tr>
<td>Nom:</td>
<td colspan=2><input type="text" name="userBean.nom" /> </td>

</tr>

<tr>
<td>Prenom:</td>
<td colspan=2><input type="text" name="userBean.prenom" /> </td>

</tr>


<tr>
<td>Date de naissance:</td>
<td colspan=2><input type="date" name="userBean.date_naissance" /> </td>
</tr>



<tr>
<td>Email:</td>
<td colspan=2><input type="text" name="userBean.email" /> </td>

</tr>

<tr>
<td>Password: </td>
<td colspan=2><input type="password" name="userBean.password" /></td>

<tr>

<tr>


</tr>

<tr>
<td colspan=3><input type="submit" value="Créer mon Compte" onclick="Sign()" />
</td>
</tr>






</tbody>

</table>



</form>





</body>





</html>