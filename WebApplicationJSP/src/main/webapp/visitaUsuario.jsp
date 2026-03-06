<%-- 
    Document   : visitaUsuario.jsp
    Created on : 3 mar 2026, 7:27:52 p.m.
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
        <% models.Usuario usuario = (models.Usuario) request.getAttribute("usuario"); %>
        <h1>Información del Usuario</h1>
        
        Nombre: <% usuario.getNombre(); %>
        Edad: <% usuario.getEdad(); %>
    </body>
</html>
