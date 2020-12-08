<%-- 
    Document   : index.jsp
    Created on : 21-oct-2019, 9:20:13
    Author     : SOFTWARE
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
				Digito 1:<br>
				<input type="text" name="d1" value="">
				<br>
				Digito 2:<br>
				<input type="text" name="d2" value="">
				<br>                        
				<p>Por favor seleciones su operaciòn:</p>
				<input type="radio" name="gender" value="multiplicar"> Multiplicar<br>
				<input type="radio" name="gender" value="dividir"> Dividir<br>
				<input type="radio" name="gender" value="restar"> Restar<br>  
				<input type="radio" name="gender" value="sumar"> Sumar<br><br>  
				<input type="submit" value="Enviar">
			</form>
        </div>
    </body>
</html>
