<%@page import="publicadores.DtNotificacion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="publicadores.DtNotificacion"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Menu Principal</title>
		
		<!-- BOOTSTRAP -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
	
		<!-- CSS STYLES -->
		<link rel="stylesheet" href="css/navbarStyle.css">
	
		<!-- JQUERY -->
		<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
	</head>
	<style>
		body {
		  overflow: overlay;
		}
	
		::-webkit-scrollbar {
		  width: 10px;
		  height: 10px;
		}
		
		::-webkit-scrollbar-thumb {
		  background: rgba(0, 0, 0, 0.5);
		}
		
		::-webkit-scrollbar-track {
		  background: rgba(0, 0, 0, 0.0);
		}
		
		.container{
			justify-content: center;
			flex-wrap: wrap;
			margin-top: 40px;
		}
		
		.card{
			background-color: rgba(0,0,0, 0.5);
			color: rgba(250, 250, 250, 0.8);
			margin: 1rem;
			text-align: center;
		}
		
		.card.usuario{
			flex-direction: row; 
			color: white;
			background-color: rgba(0,0,0, 0.5);
		}
		
		@media(max-width: 599px){
			.card{
				width: 80%;
			}
			
			.card-img{
				width: 25%;
				height: 50%;
			}
		}
		
		@media(min-width: 600px){
			.card{
				width: 18rem;
			}
			
			.card-img{
				width: 25%;
				height: auto;
			}
		}
		
		
		
		.btn{
			color: orange;
			border: 5px solid;
			text-decoration: none;
			transition: all .4s ease;
			width: 100%;
		}
		
		.btn:hover, .btn:focus{
			color: white;
			border: 5px solid #fff !important;
			box-shadow: #222 1px 0 10px;
		}
	</style>
	<body>
		<%@include file="navbar.jsp" %>
		
		<div class="container d-flex">
			<%DtNotificacion[] dtNotificaciones = (DtNotificacion[])request.getAttribute("notificaciones");
			if(dtNotificaciones.length > 0){
				
				DtNotificacion[] dtnOrdenMasNuevo = new DtNotificacion[dtNotificaciones.length];
				int index = 0; 
				for(int i = dtNotificaciones.length; i > 0; i--) {
					dtnOrdenMasNuevo[index] = dtNotificaciones[i-1];
					index++;
				}
				
				for(DtNotificacion dtn : dtnOrdenMasNuevo){%>
					<div class="card usuario mb-4 p-2 w-100">
						<img class="card-img" src="<%=dtn.getImagenDeReceta()%>" alt="Card image">
						<div class="card-body w-75">
						    <h4 class="card-title"><b><%=dtn.getAutorDeReceta() %></b></h4>
						    <p class="card-text">publicó: <%=dtn.getNombreReceta() %> el <i><%=dtn.getFechaDePublicacion() %></i></p>
					    
					    	<div class="card-footer">
					    		<form action="ConsultaReceta" method="post">
					    			<input value="<%=dtn.getNombreReceta()%>" name="inputNombreReceta" class="form-control" style="opacity: 0"></input>
									<a href="#" onclick="this.parentNode.submit();" class="btn mr-2"><i class="fas fa-link"></i> Ver Receta</a>
					    		</form>
					    	</div>
					    </div>
					</div>
				<%} %>
			<%}else{ %>
				<div class="card">
					<div class="card-body">
						<h3>Nadie a publicado nada por el momento</h3>
					</div>
				</div>
			<%} %>
		</div>
		
		<script type="text/javascript" src="js/navbarScript.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$("#menuPrincipal").addClass('active');
				setTimeout(function(){ test(); });
			});
		</script>
		
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
	</body>
</html>