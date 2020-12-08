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
			int numero = 2;
			int suma = 0;
			for (int i = 0; i <= 100; i++){
				out.println(numero);
				suma = suma + numero;
				numero = numero + 2;
			}
			
			out.println("<p>Suma total: " + suma + "</p>");		
		%>
    </body>
</html>
