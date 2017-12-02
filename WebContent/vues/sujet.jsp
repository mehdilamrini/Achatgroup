<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"	
<html>

<!--  %@taglib prefix="html" uri="/META-INF/tlds/struts-html.tld" %-->
<%@ taglib prefix="s" uri="/struts-tags" %>



<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>Créer un Sujet</title>
</head>

<script type="text/javascript">


function suj() {
	this.document.monF.action="sujet.action";
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
<caption>Veuillez saisir toutes les informations</caption>

<tbody>


<!--  % String hidden = request.getParameter("userBean.id_utilisateurs"); %-->

<!--  %=hidden %-->

<tr>
<td>Titre:</td>
<td colspan=2><input type="text" name="sujetBean.titre" /> </td>

</tr>

<tr>
<td>Prix initial:</td>
<td colspan=2><input type="text" name="sujetBean.prix_initial" /> </td>

</tr>

<tr>
<td>Prix final:</td>
<td colspan=2><input type="text" name="sujetBean.prix_final" /> </td>

</tr>



<tr>
<td>Date d'expiration :</td>
<td colspan=2><input type="date" name="sujetBean.dt" /> </td>
</tr>


<tr>
<td>rubrique:</td>
<td colspan=2><input type="text" name="sujetBean.rubrique" /> </td>
</tr>


<tr>
<td>Description: </td>
<td colspan=2><input type="password" name="sujetBean.description" /></td>
<tr>
<tr>


</tr>
<tr>
<td colspan=3><input type="submit" value="Créer sujet" onclick="suj()" />
</td>
</tr>






</tbody>

</table>



</form>





</body>





</html>