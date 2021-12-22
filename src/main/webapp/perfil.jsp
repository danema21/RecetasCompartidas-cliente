<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="publicadores.DtUsuario"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Mi Perfil</title>
		
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
				height: 100%;
				align-content: center;
			}
			
			.card{
				height: 400px;
				margin-top: 40px;
				width: 300px;
				background-color: rgba(0,0,0,0.5) !important;
			}
			
			.card-header h2{
				color: white;
			}
			
			input:focus{
				outline: 0 0 0 0 !important;
				box-shadow: 0 0 0 0 !important;
				caret-color: orange;
			}
			
			.picture-container h6{
				color: white;
			}
			
			.picture-container{
				position: relative;
				cursor: pointer;
				text-align: center;
				width: 50%;
				margin: auto;
			}
			
			.picture{
				background-color: #999999;
				border: 4px solid #CCCCCC;
				color: #FFFFFF;
				border-radius: 50%;
				width: 120px;
				height: 120px;
				margin: auto;
				overflow: hidden;
				transition: all 0.2s;
				-webkit-transition: all 0.2s;
			}
			
			.picture:hover{
				border-color: #2CA8FF;
			}
			
			.picture-src{
				width: 100%;
			}
			
			.picture input{
				position: absolute;
				width: 110px;
				height: 110px;
				margin: auto;
				opacity: 0.0;
			}
			
			.btn{
				width: 100%;
				display: block;
				margin: auto;
				background-color: orange;
				color: white;
				text-decoration: none;
				transition: all .4s ease;
				box-shadow: none;
			}
			
			.btn:hover{
				background-color: white;
			}
		</style>
	
	<body>
		<!-- PARA HACER AHORA -->
		<%@include file="navbar.jsp" %>
		
		<div class="container">
			<div class="d-flex justify-content-center h-100">
				<div class="card-group">
					<div class="card">
						<div class="card-header text-center">
							<h2>Perfil</h2>
						</div>
						<div class="card-body">
							<form action="RegistrarUsuario" method="post">
								<div class="picture-container mb-4">
							        <div class="picture d-flex mb-2">
							            <img src="img/defaultUserIcon.jpg" class="picture-src" id="wizardPicturePreview" title="">
							            <input accept="image/*" name="inputPerfil" type="file" id="wizard-picture" class="form-control">
							        </div>
							        <h6 id="imgFooter" class="labelPefil"><%=session.getAttribute("idUsuario") %></h6>
							    </div>
							</form>
						</div>
						<div class="card-footer">
							<a class="btn" href="CerrarSesion">
							  	Cerrar Sesion
							</a>
						</div>
					</div>
					<div class="card">
						<div class="card-header text-center">
							<h2>Usuarios bloqueados</h2>
						</div>
						<div class="card-body">
						
						</div>
					</div>
					<div class="card">
						<div class="card-header text-center">
							<h2>Usuarios</h2>
						</div>
						<div class="card-body">
						
							<p style="color:white"><%=((DtUsuario[])request.getAttribute("usuarios"))[0].getIdDeUsuario() %></p>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<script type="text/javascript" src="js/navbarScript.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$("#miPerfil").addClass('active');
				setTimeout(function(){ test(); });
			});
			
			$(document).ready(function(){
				//prepara la previsualizacion para la imagen de perfil
				$("#wizard-picture").change(function(){
					readURL(this);
				});
			});
			
			function readURL(input){
				if(input.files && input.files[0]){
					const file = input.files[0];
					var pattern = /image-*/;
					
					if(file.type.match(pattern)){
						var reader = new FileReader();
						reader.onload = function(e){
							$('#wizardPicturePreview').attr('src', e.target.result).fadeIn('slow');
						}
						reader.readAsDataURL(input.files[0]);
					}else{
						$('#imgFooter').css({'color': 'red'});
						$('#imgFooter').text('Formato de imagen invalido');
						window.setTimeout(function(){
							$('#imgFooter').css({'color': 'white'});
							$('#imgFooter').text('Editar foto de perfil');
						}, 2000);
					}
				}
			}
		</script>
		
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
	</body>
</html>