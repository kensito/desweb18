<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="pt">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="./css/bootstrap.min.css" />

<title>Olimpiadas</title>
</head>
<body>
	<!-- Import do Menu. -->
	<c:import url="Menu.jsp" />

	<div class="container">
		<div class="jumbotron">
			<h2>Bem vindo a Olimpíadas USJT</h2>
			<p>Aluno: Douglas Coelho Carvalho <br/> RA: 201518493</p>
			<p>Estão disponíveis abaixo as opções para acesso.</p>
			<p>
				<a type="button" class="btn btn-primary btn-md" href="#" role="button">Ver Países</a>
				<a type="button" class="btn btn-warning btn-md" href="#" role="button">Ver Modalidades</a>
				<a type="button" class="btn btn-danger btn-md" href="#" role="button">Ver Quadro de Medalhas</a>
			</p>
		</div>
	</div>

	<script src="./js/jquery.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
</body>

</html>