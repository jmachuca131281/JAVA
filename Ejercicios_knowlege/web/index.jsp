<%-- 
    Document   : index
    Created on : Nov 2, 2019, 10:26:46 PM
    Author     : jm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
		<p>
			<span>Navegador actual:<%= request.getHeader("user-agent") %> </span><br>
			<span>IP del servidor: <%= request.getRemoteAddr() %> </span><br>
			<span>Nombre del servidor: <%= request.getRemoteHost() %> </span><br>
			<span>Servidor intalado: <%= application.getServerInfo() %> </span><br>
			<span>IP del cliente: <%= request.getLocalAddr() %> </span><br>
		</p>
    </body>
</html>
