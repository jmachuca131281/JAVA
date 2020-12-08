<%-- 
    Document   : datos
    Created on : Oct 27, 2019, 5:22:34 PM
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
            String u = request.getParameter("uname");
            String p = request.getParameter("psw");
            
            if ( u.equals("jose") && p.equals("1234")) {
                
                out.println("Welcome, you are login");
                
            } else {
                
                out.println("Tray again");
                
            }       
        %>   
    </body>
</html>
