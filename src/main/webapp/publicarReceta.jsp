<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Publicar Receta</title>
		
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
			height: 420px;
			margin-top: 40px;
			width: 300px;
			background-color: rgba(0,0,0,0.5) !important;
		}
		
		.picture-container{
			position: relative;
			cursor: pointer;
			text-align: center;
			width: 100%;
			margin: auto;
		}
		
		.picture{
			background-color: #999999;
			border: 2px solid #CCCCCC;
			color: #FFFFFF;
			width: 100%;
			height: 200px;
			margin: auto;
			overflow: hidden;
			transition: all 0.2s;
			-webkit-transition: all 0.2s;
		}
		
		.picture:hover{
			border-color: skyblue;
		}
		
		.picture-src{
			width: 100%;
		}
		
		.picture input{
			position: absolute;
			width: 260px;
			height: 200px;
			margin: auto;
			opacity: 0;
		}
		
		/* Style the input fields */
		input {
		  padding: 10px;
		  width: 100%;
		  font-size: 17px;
		  font-family: Raleway;
		  border: 1px solid #aaaaaa;
		}
		
		/* Hide all steps by default: */
		.tab {
		  display: none;
		}
		
		/* Make circles that indicate the steps of the form: */
		.step {
		  height: 15px;
		  width: 15px;
		  margin: 0 2px;
		  background-color: #bbbbbb;
		  border: none;
		  border-radius: 50%;
		  display: inline-block;
		  opacity: 0.5;
		}
		
		/* Mark the active step: */
		.step.active {
		  opacity: 1;
		}
		
		/* Mark the steps that are finished and valid: */
		.step.finish {
		  background-color: orange;
		}
		
		/* next and prev buttons */
		#nextBtn{
			width: 100px;
			background-color: orange;
			color: white;
			text-decoration: none;
			transition: all .4s ease;
			margin-left: 5px;
			box-shadow: none;
		}
		
		#prevBtn{
			width: 100px;
			background-color: orange;
			color: white;
			text-decoration: none;
			transition: all .4s ease;
			margin-left: 5px;
			box-shadow: none;
		}
		
		@media (min-width: 500px){
			#nextBtn:hover{
				background-color: white;
				color: black;
			}
			
			#prevBtn:hover{
				background-color: white;
				color: black;
			}
		}
		
		.tab .form-control{
			box-shadow: none;
		}
	</style>
	
	<body>
		<%@include file="navbar.jsp" %>
		
		<div class="container">
			<%if(request.getAttribute("mensaje") != null){ %>
				<h2 class="text-danger text-center" style="background-color: rgba(0,0,0, 0.5)"><%=(String)request.getAttribute("mensaje") %></h2>
			<%} %>
			<div class="d-flex justify-content-center h-100">
				<div class="card">
					<div class="card-header">
						<h2 class="text-white text-center">Publicar Receta</h2>
					</div>
					<div class="card-body">
						<form id="regForm" action="RegistrarReceta" method="post">
							<div class="tab">
								<div class="picture-container mb-1">
									<div class="picture d-flex mb-2">
							            <img src="img/defaultRecipeImg.png" class="picture-src" id="wizardPicturePreview" title="">
							            <input accept="image/*" name="inputPerfil" type="file" id="wizard-picture" class="form-control">
							        </div>
						        </div>
						        <div class="card-title text-white text-center">Elejir una imagen para el platillo(opcional)</div>
					        </div>
					        
					        <div class="tab">
					        	<div class="card-title text-white text-center">Ingrese un nombre para el platillo</div>
					        	<input name="inputNombre" type="text" placeholder="nombre del platillo..." class="form-control mb-4">
					        </div>
					        
					        <div class="tab">
					        	<div class="card-title text-white text-center">Ingrese los ingredientes a ser utilizados</div>
					        	<textarea name="inputIngredientes" placeholder="Escriba los ingredientes aqui..." form="regForm" class="form-control mb-4" style="resize: none; height: 150px;"></textarea>
					        </div>
					        
					        <div class="tab">
					        	<div class="card-title text-white text-center">Describa los pasos a seguir(en lo posible separe los pasos con un punto)</div>
					        	<textarea name="inputProcedimiento" placeholder="Escriba el proceso aqui..." form="regForm" class="form-control mb-4" style="resize: none; height: 150px;"></textarea>
					        </div>
					        
					        <div style="overflow:auto;">
							  	<div style="float:right;">
							    	<button class="btn" type="button" id="prevBtn" onclick="nextPrev(-1)">Previous</button>
							    	<button class="btn" type="button" id="nextBtn" onclick="nextPrev(1)">Next</button>
							  	</div>
							</div>
							
							<div style="position: absolute; bottom:0px; left: 110px;">
							  	<span class="step"></span>
							  	<span class="step"></span>
							  	<span class="step"></span>
							  	<span class="step"></span>
							</div>
				        </form>
					</div>
				</div>
			</div>
		</div>
		
		<script type="text/javascript" src="js/navbarScript.js"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			$("#publicarReceta").addClass('active');
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
		
		var currentTab = 0; // Current tab is set to be the first tab (0)
		showTab(currentTab); // Display the current tab

		function showTab(n) {
		  // This function will display the specified tab of the form ...
		  var x = document.getElementsByClassName("tab");
		  x[n].style.display = "block";
		  // ... and fix the Previous/Next buttons:
		  if (n == 0) {
		    document.getElementById("prevBtn").style.display = "none";
		  } else {
		    document.getElementById("prevBtn").style.display = "inline";
		  }
		  if (n == (x.length - 1)) {
		    document.getElementById("nextBtn").innerHTML = "Submit";
		  } else {
		    document.getElementById("nextBtn").innerHTML = "Next";
		  }
		  // ... and run a function that displays the correct step indicator:
		  fixStepIndicator(n)
		}

		function nextPrev(n) {
		  // This function will figure out which tab to display
		  var x = document.getElementsByClassName("tab");
		  // Exit the function if any field in the current tab is invalid:
		  validateForm();
		  // Hide the current tab:
		  x[currentTab].style.display = "none";
		  // Increase or decrease the current tab by 1:
		  currentTab = currentTab + n;
		  // if you have reached the end of the form... :
		  if (currentTab >= x.length) {
		    //...the form gets submitted:
		    currentTab -= x.length;
		    document.getElementById("regForm").submit();
		    return false;
		  }
		  // Otherwise, display the correct tab:
		  showTab(currentTab);
		}

		function validateForm() {
		  // This function deals with validation of the form fields
		  var x, y, i, valid = true;
		  x = document.getElementsByClassName("tab");
		  y = x[currentTab].getElementsByClassName("form-control");
		  // A loop that checks every input field in the current tab:
		  for (i = 0; i < y.length; i++) {
		    // If a field is empty...
		    if (y[i].value == "") {
		      // add an "invalid" class to the field:
		      y[i].className += " invalid";
		      // and set the current valid status to false:
		      valid = false;
		    }
		  }
		  // If the valid status is true, mark the step as finished and valid:
		  if (valid) {
		    document.getElementsByClassName("step")[currentTab].className += " finish";
		  }
		  return valid; // return the valid status
		}

		function fixStepIndicator(n) {
		  // This function removes the "active" class of all steps...
		  var i, x = document.getElementsByClassName("step");
		  for (i = 0; i < x.length; i++) {
		    x[i].className = x[i].className.replace(" active", "");
		  }
		  //... and adds the "active" class to the current step:
		  x[n].className += " active";
		}
		
		</script>
		
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
	</body>
</html>