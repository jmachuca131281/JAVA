<%-- 
    Document   : datos
    Created on : Nov 3, 2019, 9:18:32 AM
    Author     : jm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		<style>
			table, th, td {
				border: 1px solid black;
				border-collapse: collapse;
			}
			th, td {
				padding: 5px;
				text-align: left;
			}
			th{
				color: white;
				background-color: darkslateblue;
			}
		</style>
    </head>
    <body>
		<%
			String pro = request.getParameter("producto");
			String cant = request.getParameter("cantidad");
			String impuesto = request.getParameter("impuesto");
			String subtotal = request.getParameter("subtotal");
			String total = request.getParameter("total");
		%>
		<table style="width: 50%; border: 1px solid black">
			<tr>
				<th>Producto</th>
				<th>Cantidad</th>
				<th>IVA</th>
				<th>Subtotal</th>
				<th>Total</th>
			</tr>
			<tr>
				<td><%= pro%></td>
				<td><%= cant%></td>
				<td><%= impuesto%></td>
				<td><%= subtotal%></td>
				<td><%= total%></td>
			</tr>
		</table>
		<%--<%! int count = 10;%>
		<% out.println("The Number is " + count);%>--%>
		<%
			double num = Math.random();
			if (num > 0.95) {
		%>
		<h2>You'll have a luck day!</h2><p>(<%= num%>)</p>
		<%
		} else {
		%>
		<h2>Well, life goes on ... </h2><p>(<%= num%>)</p>
		<%
			}
		%>
		<a href="<%= request.getRequestURI()%>"><h3>Try Again</h3></a>


<%-- This is a ejercice with checkbox --%>
		
		<h3>Choose an author:</h3>
		<form method="get">
			<input type="checkbox" name="author" value="Tan Ah Teck">Tan
			<input type="checkbox" name="author" value="Mohd Ali">Ali
			<input type="checkbox" name="author" value="Kumar">Kumar
			<input type="submit" value="Query">
		</form>

		<%
			String[] authors = request.getParameterValues("author");
			if (authors != null) {
		%>
		<h3>You have selected author(s):</h3>
		<ul>
			<%
				for (int i = 0; i < authors.length; ++i) {
			%>
				<li><%= authors[i]%></li>
				<%
					}
				%>
		</ul>
		<a href="<%= request.getRequestURI()%>">BACK</a>
		<%
			}
		%>

		<%
			int uno = 2; 
			int dos = 5;
		%>

		<%=uno + dos%>

		
    </body>
</html>
