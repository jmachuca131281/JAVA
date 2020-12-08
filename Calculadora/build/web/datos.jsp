<%-- 
    Document   : datos.jsp
    Created on : 21-oct-2019, 9:20:53
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
        <h1>El resultado de la operaciòn es:</h1>
        <%
            double r=0;
            double d1 = Double.parseDouble(request.getParameter("d1"));
            double d2 = Double.parseDouble(request.getParameter("d2"));
            String s = request.getParameter("gender");
            
            if (s.equals("multiplicar")) {
                r = d1*d2;                    
            } else if(s.equals("dividir")){                
                r = d1/d2; 
            }else if (s.equals("restar")){
                r = d1-d2; 
            }else if (s.equals("sumar")){
                r = d1+d2; 
            }
            out.println("La operaciòn es: " + r);            
        %>
    </body>
</html>
