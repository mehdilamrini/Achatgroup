<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <!--  % response.setHeader("Refresh", "5;url=Mvc_2/vues/sujet.jsp"); %-->

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accueil</title>
</head>
<body>

 <script type="text/javascript">
function logout(){
	this.document.monF.action="logout.action";
	this.document.monF.submit();
	
}





function suj(){
	this.document.monF.action="selectsujet.action";
	this.document.monF.submit();
	
}

function adh(){
	this.document.monF.action="listerall.action";
	this.document.monF.submit();
	
}



</script>

<form name="monF" method="get" >

    <h2 align="center">Welcome <i>${sessionScope.nom}</i>, you have logged in successfully!</h2>
    
    <h3><a href="<%=application.getContextPath()%>/vues/sujet.jsp">Créer un sujet</a></h3>
    <h3><a href="<%=application.getContextPath()%>/vues/profil.jsp" >Mon profil</a></h3>
    
    <tr>
	<td colspan=3><input type="submit" value="Logout" onclick="logout()" />
	</td>
	</tr>
	
	
	 
	
	
	  <tr>
	<td colspan=3><input type="submit" value="Mes sujets" onclick="suj()" />
	</td>
	</tr>
	
	<tr>
	<td colspan=3><input type="submit" value="Adherer à un sujet" onclick="adh()" />
	</td>
	</tr>
	
	
        
    </form>
</body>
</html>

