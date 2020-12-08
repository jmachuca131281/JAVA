<%-- 
    Document   : index
    Created on : Nov 4, 2019, 9:21:53 AM
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
		<%--
		<%
			ArrayList al = new ArrayList();
			al.add("C");
			al.add("A");
			al.add("E");
			al.add("B");
			al.add("D");
			al.add("F");
		%>
		
		<select>
			<%  for (int i = 0; i < al.size(); i++) {
					String option = (String) al.get(i);
			%>
			<option value="<%= option%>"><%= option%></option>
			<% }%>
		</select>
		--%>
			<%
				ArrayList al = new ArrayList();
				al.add("papa");
				al.add("yuca");
				al.add("bananos");
				al.add("mangos");
				al.add("duraznos");
				al.add("Cebolla");
				al.add("totame");
				al.add("pan");
			%>
			<select>
				<% 
					for (int i = 0; i < al.size(); i++){
						String option = (String) al.get(i);
				%>
				<option value="<%= option %>"><%= option %></option>
				<%
					}
				%>			
			</select>
    </body>
</html>
