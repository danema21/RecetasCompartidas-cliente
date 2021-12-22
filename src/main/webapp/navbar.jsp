<nav class="navbar navbar-expand-custom navbar-mainbg sticky-top">
    <a class="navbar-brand navbar-logo" href="#">Recetas Compartidas</a>
    <button class="navbar-toggler" type="button" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <i class="fas fa-bars text-white"></i>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
    
    	<form action="ConsultarNovedades" method="post" id="formMenuPrincipal"></form>
    	<form action="ConsultaReceta" method="post" id="formBuscarRecetas"></form>
        <form action="RegistrarReceta" method="post" id="formPublicarReceta"></form>
        <form action="AdministrarUsuarios" method="post" id="formAdministrarUsuarios"></form>
        
        <ul class="navbar-nav ml-auto">
            <div class="hori-selector"><div class="left"></div><div class="right"></div></div>
            <li id="menuPrincipal" class="nav-item">
                <a href="#" onclick="setTimeout(function(){document.getElementById('formMenuPrincipal').submit()}, 800)" class="nav-link" href="javascript:void(0);"><i class="fas fa-home"></i>Menu Principal</a>
            </li>
            <li id="buscarRecetas" class="nav-item">
                <a onclick="setTimeout(function(){document.getElementById('formBuscarRecetas').submit()}, 800)" class="nav-link" href="javascript:void(0);"><i class="fas fa-search"></i>Buscar Recetas</a>
            </li>
            <li id="publicarReceta" class="nav-item">
                <a onclick="setTimeout(function(){location.href='publicarReceta.jsp'}, 800)" class="nav-link" href="javascript:void(0);"><i class="fas fa-plus"></i>Publicar Receta</a>
            </li>
            <li id="miPerfil" class="nav-item">
                <a onclick="setTimeout(function(){document.getElementById('formAdministrarUsuarios').submit()}, 800)" class="nav-link" href="javascript:void(0);"><i class="fas fa-user-alt"></i>Mi Perfil</a>
            </li>
        </ul>
    </div>
</nav>