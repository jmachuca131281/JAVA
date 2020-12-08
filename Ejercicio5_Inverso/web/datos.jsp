<%-- 
    Document   : datos
    Created on : Nov 2, 2019, 10:26:56 PM
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
		Su nombre es:
		<%
			String nombre = request.getParameter("inpName");
			String cedula = request.getParameter("inpCi");
			out.println("Sus datos son:" + nombre + "," + cedula);
		%>
    </body>
</html>
