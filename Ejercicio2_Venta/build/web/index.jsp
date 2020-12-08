<%-- 
    Document   : index
    Created on : Nov 3, 2019, 9:18:21 AM
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
			Producto:
			<input type="text" name="producto" value=""><br>
			Cantidad:
			<input type="text" name="cantidad" value=""><br>
			IVA:
			<select name="impuesto">
				<option value="19">19</option>
				<option value="14">14</option>
				<option value="0">0</option>
			</select><br>
			Subtotal:
			<input type="text" name="subtotal" value=""><br>
			Total:
			<input type="text" name="total" value=""><br>
			<input type="submit" value="Facturar">
		</form>
    </body>
</html>
