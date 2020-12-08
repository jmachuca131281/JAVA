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
		<form action="datos.jsp" method="get">
			<div>
				Nombre:
				<input	type="text" name="inpName" value="">
				CI:
				<input type="text" name="inpCi" value="">
				<input type="submit" value="Enviar">
			</div>
		</form>
    </body>
</html>
