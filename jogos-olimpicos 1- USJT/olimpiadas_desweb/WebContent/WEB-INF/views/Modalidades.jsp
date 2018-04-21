<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
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

	<section class="tabela-modalidades">
		<div class="container">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3>
						<span class="glyphicon glyphicon-book"></span> Pa�ses
					</h3>
				</div>
				<div class="panel-body">
					<div class="col-lg-6 col-md-6 col-sm-6">
						<p>
							<div class="alert alert-info" role="alert">
								<span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
								Lista de Modalidades Ol�mpicas cadastradas no sistema
							</div>
						</p>
					</div>
				</div>
	
				<!-- Table -->
				<table class="table">
					<thead>
						<tr>
							<th>#</th>
							<th>Nome</th>
							<th>Tipo</th>
							<th>Fun��es</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="modalidade" items="${ modalidades }">
							<tr>
								<td>${ modalidade.id }</td>
								<td>${ modalidade.nome }</td>
								<td>${ modalidade.tipo }</td>
								<td>
									<button type="button" class="btn btn-warning">Consultar</button>
									<button type="button" class="btn btn-danger">Excluir</button>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</section>

	<script src="./js/jquery.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
</body>
</html>