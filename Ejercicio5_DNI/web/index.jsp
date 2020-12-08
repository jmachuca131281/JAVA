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
             if (request.getParameter("dni") != null && request.getParameter("dni") != ""){
                    String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
                    int n = Integer.parseInt(request.getParameter("dni"));
                    String r = letras[n%23];
                    out.println("<p><span class='titulo'>Numero DNI: </span>" + n + "<br><span class='titulo'>Letra DNI: </span>" + r);
                    out.println("<br/><br/><a href='Ej1.6.jsp'>Volver a calcular letra</a></p>");
             }
             else{
       %>
       <h1>Generador letra DNI</h1>
       <form action="datos.jsp" method="post">
             <label>Dni (Sin letra): </label><input type="text" name="dni">
             <input type="submit" name="enviar">
       </form>
       <%
             }
       %>
    </body>
</html>
