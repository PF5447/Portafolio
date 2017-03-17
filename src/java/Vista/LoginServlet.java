/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ComunaBusiness;

import Controlador.UsuarioBusiness;
import Modelo.Comuna;
import Modelo.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author felipe
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String rut = request.getParameter("rut");
        String pass = request.getParameter("pass2");
        UsuarioBusiness ub = new UsuarioBusiness();
        Usuario u = null;
            try {                
                u = ub.recuperarUsuario(rut, pass);
   
                if (u != null) {
                    request.getSession().setAttribute("usuario", u);
                    request.getRequestDispatcher("/Lobby.jsp").forward(request, response);
                    
                }
                else {
                    request.setAttribute("Error", "Error de Login");
                    request.getRequestDispatcher("/LoginError.jsp").forward(request, response);
                }
                
            } catch (IOException | ServletException e) {
                request.setAttribute("Error", "Error Desconocido");
                System.out.println("Enviando a Login ------>");
                request.getRequestDispatcher("/Login.jsp").forward(request, response);
            }
       
        
        
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
