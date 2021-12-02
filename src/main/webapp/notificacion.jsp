<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Error</title>
		
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
			color: red;
			text-align: center;
		}
		
		.card-body h2{
			color: white;
			text-align: center;
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
		<div class="container">
			<div class="d-flex justify-content-center h-100">
				<div class="card">
					<div class="card-header">
						<h1>ERROR!</h1>
					</div>
					<div class="card-body">
						<h2><%=(String)request.getAttribute("mensaje") %></h2>
					</div>
					<div class="card-footer">
						<div class="d-flex justify-content-center links">
							<a href="javascript:history.back()">Volver a intentar</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
	</body>
</html>