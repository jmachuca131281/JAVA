<%-- 
    Document   : index
    Created on : Nov 12, 2019, 8:17:45 PM
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
        <form action="proceso.jsp" method="get">
			<h1>Hello World!</h1>
			Nombre:<input type="text" name="txtName"><br>
			Apellido<input type="text" name="txtApellido"><br>
			<input type="submit" value="Enviar">
		</form>
    </body>
</html>
