<%-- 
    Document   : datos
    Created on : Oct 27, 2019, 5:12:53 PM
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
    <center>
        <h3>La Factura</h3> 
        <%
            String s = request.getParameter("comida");
            out.println("Su compra es: " + s);
        %>

        <h4>Datos de la factura</h4>
        <%
            int x = 0;
            String pro = request.getParameter("comida");
            int cantidad = Integer.parseInt(request.getParameter("Cantidad"));
            int precio = Integer.parseInt(request.getParameter("Precio"));
            x = cantidad * precio;
            out.println("Su compra es: " + x);
        %>
    </center>
</body>
</html>
