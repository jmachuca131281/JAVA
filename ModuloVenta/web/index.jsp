<%-- 
    Document   : index
    Created on : Oct 27, 2019, 5:12:41 PM
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
        <div style="background-color: grey">
            <h1 style="color:white">Calculadora</h1>
            <form action="datos.jsp" method="get">
                <select name="comida">
                    <option value="tomate">Tomate</option>
                    <option value="lechuga">Lechuga</option>
                    <option value="cafe">Cafe</option>
                    <option value="pan">Pan</obr><br>
                </select><br><br>
                Precio:<br>
                <input type="text" name="Precio" value="">
                <br>
                Cantidad:<br>
                <input type="text" name="Cantidad" value="">
                <br><br>
                <input type="submit" value="Enviar"> 
            </form>
        </div>
    </body>
</html>
