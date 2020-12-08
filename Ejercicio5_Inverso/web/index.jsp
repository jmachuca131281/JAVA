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
		<%
			if(request.getParameter("cadena") != null && request.getParameter("cadena") != ""){
				String cadena = request.getParameter("cadena");
				String resultado = new StringBuilder(cadena).reverse().toString();
				out.print("Cadena previa: " + request.getParameter("cadena") + ". Cadena revertida:" + resultado);
			}else{
		%>
			<form action="index.jsp" method="post">
				<input type="text" name="cadena">
				<input type="submit" name="enviar">
			</form>
			<%}%>
    </body>
</html>
