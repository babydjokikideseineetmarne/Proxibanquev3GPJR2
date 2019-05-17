<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des Clients</title>
</head>
<body>
	Voici la liste de vos clients:
<!-- Creer un tableau dans leqsuel mettre la liste -->
<c:forEach items="${client}" var="c"> 
		<p />${c.id} ${c.name} ${c.nickname} ${c.address} ${c.postalcode} ${c.city} ${c.number} </br>
	 
	</c:forEach>


	<p />
	<form method="post" action="ServletCreateClient">
		<input type="submit" value="Creer" />
	</form>
	<input type="submit" value="Supprimer" />
	<input type="submit" value="Editer" />
	<br />
	<input type="submit" value="Comptes clients" />
	<input type="submit" value="Virement" />

</body>
</html>