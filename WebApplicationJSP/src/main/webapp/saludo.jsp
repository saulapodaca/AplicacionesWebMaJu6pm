<%-- 
    Document   : saludo.jsp
    Created on : 3 mar 2026, 7:08:43 p.m.
    Author     : saula
--%>

<%@page errorPage="error.jsp" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int a = 10/0;
            
            String nombre = request.getParameter("nombre");
            if (nombre==null){
                nombre="Invitado";
            }
        %>
        <h1>Hola <%=nombre%></h1>
        
        <%! int i = 0; %>
        
        <%
            i ++;
            
            out.println("Visitas: " + i);
        %>
    </body>
</html>
