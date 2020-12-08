<%-- 
    Document   : index
    Created on : Nov 4, 2019, 12:46:57 PM
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
        <h3>Choose an actor</h3>
		<form method="get">
			<input type="checkbox" name="author" value="Tan Ah Teck">Tan
			<input type="checkbox" name="author" value="Mohd Ali">Ali
			<input type="checkbox" name="author" value="Kumar">Tan
			<input type="submit" name="Query"
		</form>
		<%
			String[] authors = request.getParameterValues("author");
			if (authors != null){
		%>
			<h3>You have selected author(s):</h3>
			<ul>
		<% 
			for (int i = 0; i < authors.length; ++i){
		%>
			<li><%= authors[i] %></li>
		<%
			}
		%>
			
		</ul>
		<%
			}
		%>
			<a href="<%= request.getRequestURI() %>">Back</a>
    </body>
</html>
