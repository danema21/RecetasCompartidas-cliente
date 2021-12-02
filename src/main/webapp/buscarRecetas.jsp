<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@page import="publicadores.DtReceta"%>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Buscar Recetas</title>
		
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
	
		.form-control-borderless {
		    border: none;
		}
		
		.form-control-borderless:hover, .form-control-borderless:active, .form-control-borderless:focus {
		    border: none;
		    outline: none;
		    box-shadow: none;
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
		
		@media(max-width: 599px){
			.card{
				width: 80%;
			}
		}
		
		@media(min-width: 600px){
			.card{
				width: 18rem;
			}
		}
		
		.card-img-top{
			height: 180px;
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
		
			<div class="row justify-content-center w-100 mb-5">
                <div class="col-12 col-md-10 col-lg-8">
                    <form action="ConsultaReceta" method="post" class="card card-sm w-100 bg-white" style="margin: 0px !important">
                        <div class="card-body row no-gutters align-items-center p-2">
                            <div class="col-auto">
                                <i class="fas fa-search h2 text-muted"></i>
                            </div>
                            <!--end of col-->
                            <div class="col">
                                <input name="nombreBuscado" class="form-control form-control-lg form-control-borderless" type="search" placeholder="Buscar...">
                            </div>
                            <!--end of col-->
                            <div class="col-auto">
                                <button class="btn btn-md" type="submit">Buscar</button>
                            </div>
                            <!--end of col-->
                        </div>
                    </form>
                </div>
                <!--end of col-->
            </div>
		
			<%DtReceta[] dtRecetas = (DtReceta[])request.getAttribute("recetas");%>
			<%if(dtRecetas != null){%>
				<%DtReceta[] dtrOrdenMasNuevo = new DtReceta[dtRecetas.length];
				int index = 0;%>
				<%for(int i = dtRecetas.length; i > 0; i--) {
					dtrOrdenMasNuevo[index] = dtRecetas[i-1];
					index++;
				}%>
				
				<%for(DtReceta dtr : dtrOrdenMasNuevo){%>
					<div class="card">
						<img src=<%=dtr.getImagen() %> class="card-img-top" alt="...">
						<div class="card-body">
					    	<h5 class="card-title"><b><%=dtr.getNombre() %></b></h5>
					        <h6 class="card-subtitle"><i>por <%=dtr.getAutor() %></i></h6>
						</div>
						<div class="card-footer">
							<form action="ConsultaReceta" method="post">
								<input value="<%=dtr.getNombre()%>" name="inputNombreReceta" class="form-control" style="opacity: 0"></input>
								<a href="#" onclick="this.parentNode.submit()" class="btn mr-2"><i class="fas fa-link"></i> Ver Receta</a>
							</form>
						</div>
					</div>
				<%}%>
				<%if(dtRecetas.length == 0){%>
					<div class="card">
						<div class="card-body">
							<%String busqueda = (String) request.getAttribute("nombreBuscadoServlet");
							if(busqueda == null){ %>
								<h3>Aun no hay recetas en el sistema</h3>
							<%}else{ %>
					    		<h3>No se logró encontrar recetas que empiezen con <b style="color: orange">'<%=(String)request.getAttribute("nombreBuscadoServlet") %>'.</b></h3>
							<%} %>
						</div>
					</div>
				<%}%>
			<%}%>
		</div>
		
		<script type="text/javascript" src="js/navbarScript.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$("#buscarRecetas").addClass('active');
				setTimeout(function(){ test(); });
			});
		</script>
		
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
	</body>
</html>