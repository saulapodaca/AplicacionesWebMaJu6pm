<%-- 
    Document   : ejemplo.jsp
    Created on : 3 mar 2026, 6:55:20 p.m.
    Author     : saula
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            int hora = java.time.LocalTime.now().getHour();
            
            if (hora<12){
                out.println("Hola Buenos Dias");
                return;
            }
            
            if (hora >=12 && hora<=18){
                out.println("Hola Buenas Tardes");
            }
            
            if (hora>18){
                out.println("Hola Buenas Noches");
            }
        %>
    </body>
</html>
