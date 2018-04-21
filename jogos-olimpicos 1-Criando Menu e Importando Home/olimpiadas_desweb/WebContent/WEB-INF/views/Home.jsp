<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="pt">
 
	<head>
	    <meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<link rel="stylesheet" href="./css/bootstrap.min.css"/>
		
	    <title>Olimpiadas</title>
	</head>
	<body>
		<!-- Import do Menu. -->
		<c:import url="Menu.jsp" />
		
		<div class="container">
		    <h2>Olimpíadas</h2>
		    <form action="" method="get">
		        <p>Por favor, informe os dados abaixo.</p>
		            <div class="form-group">
		            	<label for="ano">Ano</label>
	                    <select name="ano" id="ano" class="form-control" >
		                    <c:forEach var="ano" items="${ anos }">
		                    		<option value="${ ano.ano }">${ ano.ano }</option>
		                    </c:forEach>
						</select>
		            </div>
		            
		      		<div class="form-group">
		                <label for="modalidade">Modalidade</label>
		                	<select name="modalidade" id="modalidade" class="form-control" >
			               	<c:forEach var="modalidade" items="${ modalidades }">
			               		<option value="${ modalidade.id }">${ modalidade.nome }</option>
			               	</c:forEach>
						</select>
		            </div>
		            
		            <div class="form-group">
		                <label for="pais">Pais</label>
	                	<select name="pais" id="pais" class="form-control" >
							<c:forEach var="pais" items="${ paises }">
								<option value="${ pais.id }">${ pais.nome }</option>
							</c:forEach>
						</select>
		            </div>
		        
		        <div class="form-group">
		            <button type="submit" class="btn btn-default">Enviar</button>
		        </div>
		        
		    </form>
	    </div>
	    
		<script src="./js/jquery.min.js"></script>
        <script src="./js/bootstrap.min.js"></script>
	</body>
 
</html>