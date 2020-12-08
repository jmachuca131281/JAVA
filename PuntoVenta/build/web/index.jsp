<%-- 
    Document   : index
    Created on : Nov 4, 2019, 9:47:42 AM
    Author     : jm
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
		<%
			ArrayList al = new ArrayList();
			al.add("papa");
			al.add("tomate");
			al.add("lechuga");
			al.add("Cebolla");
		%>
		<%
			ArrayList alImp = new ArrayList();
			alImp.add("19");
			alImp.add("14");
			alImp.add("0");
			alImp.add("22");
		%>
		<h4>Welcome to point of sale</h4>
		Producto:
		<select>
			<%
				for (int i = 0; i < al.size(); i++) {
					String option = (String) al.get(i);
			%>
			<option value="<%= option%>"><%= option%></option>
			<%}%>
		</select><br>
		Precio:
		<input type="text" name="precio" value=""><br>
		Cantidad:
		<input type="text" name="cantidad" value=""><br>
		Impuesto:
		<select>
			<%
				for (int i = 0; i < alImp.size(); i++) {
					String option = (String) alImp.get(i);
			%>	
			<option value="<%= option %>"><%= option %></option>
			<%}%>
		</select><br>
		<input type="submit" name="facturar" value="Facturar">
		<input type="reset">
    </body>
</html>
