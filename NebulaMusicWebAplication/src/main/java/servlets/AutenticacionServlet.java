/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repositories.UsuariosDB;

/**
 *
 * @author saula
 */
@WebServlet(name = "AutenticacionServlet", urlPatterns = {"/autenticacion"})
public class AutenticacionServlet extends HttpServlet {

  
        @Override
        protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            String correo = request.getParameter("correo");
            String contrasena = request.getParameter("contrasenia");

            boolean valido = UsuariosDB.autenticar(correo, contrasena);

            if (valido) {
                response.sendRedirect("index.html");
            } else {
                response.sendRedirect("error.html");
            }
        }

}
