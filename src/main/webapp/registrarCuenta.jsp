<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Registrar Cuenta</title>
		
		<!-- BOOTSTRAP -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
		
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
	
		@media only screen and (max-width: 599px) {
			html,body{
				background-image: url(img/fondoMobile.jpg);
				background-size: cover;
				background-repeat: no-repeat;
				background-position: center;
				background-attachment: fixed;
				height: 100%;
				font-family: 'Numans', sans-serif;
			}
		}
		
		@media only screen and (min-width: 600px){
			html,body{
				background-image: url(img/fondoDesktop.jpg);
				background-size: cover;
				background-repeat: no-repeat;
				background-position: center;
				background-attachment: fixed;
				height: 100%;
				font-family: 'Numans', sans-serif;
			}
		} 
		
		.container{
			height: 100%;
			align-content: center;
		}
		
		.card{
			height: 630px;
			margin-top: auto;
			margin-bottom: auto;
			width: 400px;
			background-color: rgba(0,0,0,0.5) !important;
		}
		
		.card-header h1{
			color: white;
		}
		
		.input-group-prepend span{
			whidth: 50px;
			height: 100%;
			background-color: #FFC312;
			color: black;
			border: 0 !important;
		}
		
		input:focus{
			outline: 0 0 0 0 !important;
			box-shadow: 0 0 0 0 !important;
			caret-color: orange;
		}
		
		.remember{
			color: white;
		}
		
		.remember label{
			whidth: 20px;
			height: 20px;
			margin-left: 15px;
			margin-right: 5px;
		}
		
		.remember input{
			margin-right: 10px;
		}
		
		.login_btn{
			color: black;
			background-color: #FFC312;
			width: 50%;
		}
		
		.login_btn:hover{
			color: black;
			background-color: white;
		}
		
		.links{
			color: white;
		}
		
		.links a{
			margin-left: 4px;
			color: orange;
		}
		
		.links a:hover{
			color: white;
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
	</style>
	<body>
		<div class="container">
			<div class="d-flex justify-content-center h-100">
				<div class="card">
					<div class="card-header">
						<h1>Ingrese sus datos</h1>
					</div>
					<div class="card-body">
						<form action="RegistrarUsuario" method="post">
							<div class="picture-container mb-4">
						        <div class="picture d-flex mb-2">
						            <img src="img/defaultUserIcon.jpg" class="picture-src" id="wizardPicturePreview" title="">
						            <input accept="image/*" name="inputPerfil" type="file" id="wizard-picture" class="form-control">
						        </div>
						        <h6 id="imgFooter" class="labelPefil">Editar foto de perfil</h6>
						    </div>
							
							<div class="input-group form-group mb-3">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-pen"></i></span>
								</div>
								<input name="inputIdUsuario" type="text" class="form-control" placeholder="nombre de usuario" required="required">
							</div>
							<div class="input-group form-group mb-3">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-pen"></i></span>
								</div>
								<input name="inputNombre" type="text" class="form-control" placeholder="nombre" required="required">
							</div>
							<div class="input-group form-group mb-3">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-pen"></i></span>
								</div>
								<input name="inputApellido"type="text" class="form-control" placeholder="apellido" required="required">
							</div>
							<div class="input-group form-group mb-3">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fas fa-key"></i></span>
								</div>
								<input name="inputPassword"type="password" class="form-control" placeholder="password" required="required">
							</div>
							<div class="input-group form-group mb-3">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fas fa-key"></i></span>
								</div>
								<input name="inputConfPassword" type="password" class="form-control" placeholder="confirmacion de password" required="required">
							</div>
							<div class="form-group mt-4 d-flex justify-content-center">
								<input type="submit" value="Crear cuenta" class="btn float-right login_btn">
							</div>
						</form>
					</div>
					<div class="card-footer">
						<div class="d-flex justify-content-center links">
							Ya tienes una cuenta?<a href="index.jsp">Inicia sesion</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript">
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