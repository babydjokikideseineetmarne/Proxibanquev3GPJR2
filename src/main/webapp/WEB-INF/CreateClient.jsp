<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creer un client</title>
</head>
<body>
	<h1>Rentrez les informations pour créer un nouveau client</h1>
	<form method="post" action="ServletValidationCreaClient">
	<input type="text" name="name" placeholder="nom" />
	</br>
	<input type="text" name="nickname" placeholder="prenom" />
	</br>
	<input type="text" name="address" placeholder="adresse" />
	</br>
	<input type="text" name="number" placeholder="numero" />
	</br>
	<input type="email" name="email" placeholder="mail" />
	</br>
	<input type="submit" value="valider" />
</form>
</body>
</html>