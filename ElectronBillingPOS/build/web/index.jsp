<%-- 
    Document   : index
    Created on : Nov 14, 2019, 8:32:14 PM
    Author     : jm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>Electron</title>
		<!-- Bootstrap CSS CDN -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<!-- Our Custom CSS -->
		<link rel="stylesheet" href="style4.css">
    </head>
	<body>
         <div class="wrapper"><!-- Sidebar Holder -->
            <nav id="sidebar">
                <div class="sidebar-header">
                    <h3>Electron Billing POS</h3>
                    <strong>EBP</strong>
                </div>
                <ul class="list-unstyled components">
                    <li class="active">
                        <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false"><i class="glyphicon glyphicon-home"></i>Catálogos</a>
                        <ul class="collapse list-unstyled" id="homeSubmenu">
                            <li><a href="#">Clientes</a></li>
                            <li><a href="#">Productos</a></li>
                            <li><a href="#">Unidad de medidas</a></li>
                            <li><a href="#">Establecimientos</a></li>
                            <li><a href="#">Usuarios</a></li>
                        </ul>
                    </li>                   
					<li>
                        <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false"><i class="glyphicon glyphicon-duplicate"></i>Emisión</a>
						<ul class="collapse list-unstyled" id="pageSubmenu">
                            <li><a href="#">Crear</a></li>
                            <li><a href="#">Generadas</a></li>
                            <li><a href="#">Rechazadas</a></li>
                        </ul>
					</li>
					<li>
                        <a><i class="glyphicon glyphicon-duplicate"></i>Configuración</a>
                        <ul class="collapse list-unstyled" id="pageSubmenu">
                            <li><a href="#">Datos fiscales</a></li>
                            <li><a href="#">Personalizar</a></li>
                            <li><a href="#">Cambiar contraseñas</a></li>
                        </ul>
                    </li>
                   
                </ul>
            </nav>
            <!-- Page Content Holder -->
            <div id="content">
                <nav class="navbar navbar-default">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <button type="button" id="sidebarCollapse" class="btn btn-info navbar-btn">
                                <i class="glyphicon glyphicon-align-left"></i>
                                <span>Toggle Sidebar</span>
                            </button>
                        </div>
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav navbar-right">
                                <li><a href="#">Page</a></li>
                                <li><a href="#">Page</a></li>
                                <li><a href="#">Page</a></li>
                                <li><a href="#">Page</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
        </div>
        <!-- jQuery CDN -->
         <script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
         <!-- Bootstrap Js CDN -->
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
         <script type="text/javascript">
             $(document).ready(function () {
                 $('#sidebarCollapse').on('click', function () {
                     $('#sidebar').toggleClass('active');
                 });
             });
         </script>
	</body>
</html>										
