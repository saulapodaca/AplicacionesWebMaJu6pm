<%-- 
    Document   : error.jsp
    Created on : 3 mar 2026, 7:16:03 p.m.
    Author     : saula
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ERROR JSP Page</title>
    </head>
    <body>
        <h1>OCURRIÓ UN ERROR EN LA APLICACIÓN</h1>
        
        <p><strong>Mensaje: </strong> <%= exception.getMessage() %></p>
        
        <p>Por favor intente nuevamente o contacte al administrador</p>
    </body>
</html>
