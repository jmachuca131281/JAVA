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
			if(request.getParameter("cifra") != null && request.getParameter("cifra") != ""){
				int cifra = Integer.parseInt(request.getParameter("cifra"));
				int falta, numInverso, resto;
				
				falta = cifra;
				numInverso = 0;
				resto = 0;
				
				while(falta != 0){
					resto = falta % 10;
					numInverso = numInverso*10 + resto;
					falta = falta / 10;
				}
				
				if(numInverso == cifra){
					out.println(cifra + "es capicua");
				}else{
					out.print(cifra + "no es capicua");
				}
				out.println("<br><a href='datos.jsp'>Volver atras</a>");
			}else{
			%>
				<div>
					<p>Cifras a cambiar</p>
					<form action="" method="post">
						<input type="text" name="cifra">
						<input type="submit" name="enviar">						
					</form>
				</div>
			<%}%>	
    </body>
</html>
