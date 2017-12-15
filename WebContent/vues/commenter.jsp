<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"	
<html>

<!--  %@taglib prefix="html" uri="/META-INF/tlds/struts-html.tld" %-->
<%@ taglib prefix="s" uri="/struts-tags" %>



<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>Commenter</title>
</head>

<script type="text/javascript">


function comm() {
	this.document.monF.action="commenter.action";
	this.document.monF.submit();
	
}



</script>


<body>
 



<form name="monF" method="post">



<table border="1" bordercolor="black">
<caption>Veuillez saisir votre commentaire</caption>

<tbody>





<tr>

<td colspan=2><textarea name="com.commentaire" >Enter text here...</textarea> </td>

<tr>
<td><input type="hidden" name="com.id_sujet" value="<%= request.getParameter("id_sujet")%>"></td>
<tr>

	
	
</tr>

<tr>
<td colspan=3><input type="submit" value="Commenter" onclick="comm()" />
</td>
</tr>






</tbody>

</table>



</form>





</body>





</html>