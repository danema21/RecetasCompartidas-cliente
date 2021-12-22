<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="publicadores.DtReceta"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Ver Receta</title>
		
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
			align-content: center;
		}
		
		.card-group{
			margin-top: auto;
			margin-bottom: auto;
			width: 100%;
		}
		
		@media(max-width: 579px){
			.card-group{
				width: 100%;
			}
			
			.card{
				margin-bottom: 0px !important;
			}
		}
		
		.card{
			background-color: rgba(0,0,0, 0.5);
			color: white;
		}
		
		#ingredientes{
			height: 50px;
			overflow: auto;
		}
		
		#proceso{
			height: 100px;
			overflow: auto;
		}
		
		#btn-volver{
			background-color: orange;
			color: white;
			text-decoration: none;
			transition: all .4s ease;
			box-shadow: none;
			float: right;
		}
		
		#btn-volver:hover{
			background-color: white;
			color: black;
		}
		
		.btn-danger{
			margin-left: 5px;
			margin-bottom: 5px;
		}
		
		#pasoHablado{
			background-color: rgb(255, 100, 100);
		}
	</style>
	
	<body>
		<%DtReceta info = (DtReceta)request.getAttribute("informacionReceta"); %>
		
		<div class="container">
			<div class="d-flex justify-content-center h-100">
				<div class="card-group">
				  	<div class="card">
				    	<img src=<%=info.getImagen() %> class="card-img" alt="...">
				 	</div>
				  	<div class="card">
				    	<div class="card-title text-center">
				      		<h1 class="card-text"><i><%=info.getNombre() %></i></h1>
				    	</div>
				    	
				    	<div class="card-body">
				    		<h2 class="card-text">Ingredientes:</h2>
				    		<div id="ingredientes">
				    			<%=info.getIngredientes() %>
				    		</div>
				    		
				    		<h2 class="card-text">Proceso:</h2>
				    		<div id="proceso">
				    			<%=info.getDescripionDelProceso() %>
				    		</div>
				    	</div>
				    	
				    	<div id="grupo-botones" class="card-footer">
				    		<a id="btn-hablar" class="btn btn-danger" onclick="textToAudio()">
						  		Asistente de voz
							</a> 
							<a id="btn-volver" class="btn" onclick="history.back()">
						  		Volver
							</a>
				    	</div>
				  	</div>
				</div>
			</div>
		</div>
		
		<script>
			var pasoActual = -1;
			
			function agregarBotones(){
				let botones = $('#grupo-botones');
				botones.append($('<a id="btn-atras" class="btn btn-danger" onclick="audioAtras()">Atras</a>'));
				botones.append($('<a id="btn-siguiente" class="btn btn-danger" onclick="audioSiguiente()">Siguiente</a>'));
			}
			
			function quitarAgregados(){
				$('#btn-atras').remove();
				$('#btn-siguiente').remove();
				$('#pasoHablado').remove();
			}
			
			function audioAtras(){
				if(pasoActual > 0){
					pasoActual--;
					let msg = document.getElementById("proceso").innerHTML;
	        		let msgArr = msg.split('.');
	        		let body = $('.card-body');
	        		$('#pasoHablado').html("Paso " + pasoActual + ": " + msgArr[pasoActual]);
				}
			}
			
			function audioSiguiente(){
				let msg = document.getElementById("proceso").innerHTML;
        		let msgArr = msg.split('.');
        		let body = $('.card-body');
        		
        		if(pasoActual < msgArr.length-2){
        			pasoActual++;
        			$('#pasoHablado').html("Paso " + pasoActual + ": " + msgArr[pasoActual]);
        		}else if(pasoActual == msgArr.length-2){
        			pasoActual++;
        			$('#pasoHablado').html("Fin");
        		}
			}
		
            function textToAudio() {
            	if(pasoActual == -1){
            		document.getElementById("btn-hablar").innerHTML = "Play";
            		agregarBotones();
            		pasoActual++;
            		let msg = document.getElementById("proceso").innerHTML;
            		let msgArr = msg.split('.');
            		let body = $('.card-body');
            		body.append($('<p id="pasoHablado"></p>'));
            		$('#pasoHablado').html("Paso " + pasoActual + ": " + msgArr[0]);
            	}else{
  					let msg = document.getElementById("proceso").innerHTML;
	                let msgArr = msg.split('.');
	                
	                if(pasoActual >= msgArr.length-1){
	                	pasoActual = -1;
	                	quitarAgregados();
	                	document.getElementById("btn-hablar").innerHTML = "Asistente de voz";
	                }else{
		                msg = msgArr[pasoActual];
		                
		                let speech = new SpeechSynthesisUtterance();
		                speech.lang = "es-ES";
		                
		                speech.text = msg;
		                speech.volume = 1;
		                speech.rate = 0.5;
		                speech.pitch = 1.5;
		                
		                window.speechSynthesis.speak(speech);
		                if(pasoActual >= msgArr.length-1){
		                	pasoActual = -1;
		                	quitarAgregados();
		                	document.getElementById("btn-hablar").innerHTML = "Asistente de voz";
		                }
	                }
            	}
            }
		</script>
	
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
	</body>
</html>