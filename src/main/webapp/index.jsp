<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Iniciar Sesion</title>
		
		<!-- BOOTSTRAP -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
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
		
		@media only screen and (min-width: 500px){
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
			align-content: center
		}
		
		.card{
			height: 370px;
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
	</style>
	<body>
		<%String userId = null;
		Cookie[] cks = request.getCookies();
		boolean cookieEsta = false;
		if(cks != null){
			for(int i = 0; i < cks.length; i++){
				Cookie ck = cks[i];
				if(ck.getName().equals("userId")){
					userId = ck.getValue();
					cookieEsta = true;
				}
			}
		}%>
	
		<div class="container">
			<div class="d-flex justify-content-center h-100">
				<div class="card">
					<div class="card-header">
						<h1>Iniciar Sesion</h1>
					</div>
					<div class="card-body">
						<form action="IniciarSesion" method="post">
							<div class="input-group form-group mb-3">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-user"></i></span>
								</div>
								<%if(cookieEsta) {%>
									<input name="inputIdUsuario" value=<%=userId %> type="text" class="form-control" placeholder="nombre de usuario" required="required">
								<%}else{ %>
									<input name="inputIdUsuario" type="text" class="form-control" placeholder="nombre de usuario" required="required">
								<%} %>
							</div>
							<div class="input-group form-group mb-3">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fas fa-key"></i></span>
								</div>
								<input name="inputPassword" type="password" class="form-control" placeholder="password" required="required">
							</div>
							<div class="row align-items-center remember">
								<%if(cookieEsta){ %>
									<label><input id="chkConCk" name="inputCheckboxConCookie" type="checkbox" value="on" onclick="checkRecordar()" checked="checked"/>Recordar nombre de usuario</label>
								<%}else{ %>
									<label><input id="chkSinCk" name="inputCheckboxSinCookie" type="checkbox" value="on" onclick="checkRecordar()" checked="checked"/>Recordar nombre de usuario</label>
								<%} %>
							</div>
							<div class="form-group mt-4 d-flex justify-content-center">
								<input type="submit" value="Ingresar" class="btn float-right login_btn">
							</div>
						</form>
					</div>
					<div class="card-footer">
						<div class="d-flex justify-content-center links">
							Aun no tienes una cuenta?<a href="registrarCuenta.jsp">Registrate aqui</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<script type="text/javascript">
			function checkRecordar(){
				if(document.getElementById("chkSinCk").value == "off" || document.getElementById("chkConCk").value == "off"){
					document.getElementById("chkSinCk").value = "on";
					document.getElementById("chkConCk").value = "on";
					
				}else if(document.getElementById("chkSinCk").value = "on" || document.getElementById("chkConCk").value = "on"){
					document.getElementById("chkSinCk").value = "off";
					document.getElementById("chkConCk").value = "off";
				}
			}
		</script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
	</body>
</html>