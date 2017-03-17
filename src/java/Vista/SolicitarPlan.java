/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DB.Conexion;
import Modelo.Presolicitud;
import Modelo.Solicitud;
import Modelo.Usuario;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author felipe
 */
public class SolicitarPlan extends HttpServlet {

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
            throws ServletException, IOException, ParseException {
        
      Usuario usuario =  (Usuario) request.getSession().getAttribute("usuario");
      Presolicitud presolicitud =  (Presolicitud) request.getSession().getAttribute("sesion_total"); 
      Solicitud solicitud = new Solicitud();
      
      int comuna = usuario.getId_comuna();
              Connection c = Conexion.Conectar();
        try {
            PreparedStatement query = c.prepareStatement("select comuna_nombre from COMUNAS WHERE comuna_id =?");
            query.setInt(1,comuna);
            ResultSet rs= query.executeQuery();
            if (rs.next()) {
            String comuna_r = rs.getString("comuna_nombre");   
                      
            solicitud.setGigas(presolicitud.getGigas());
            solicitud.setMinutos(presolicitud.getCuota());
                if (presolicitud.getEntrga().equals("Entrega del Chip en Domicilio")) {
                    solicitud.setDireccion_entrega(usuario.getDireccion());
                }else{
                    solicitud.setDireccion_entrega(presolicitud.getEntrga());
                }
            solicitud.setTelefono(usuario.getTelefono());
            solicitud.setComuna(comuna_r);
            
            
         
            solicitud.setTotal(presolicitud.getTotal());
            PreparedStatement query_2 = c.prepareStatement("INSERT INTO PLANES VALUES (NULL,?,?,?,?,?,NOW(),?);");
            query_2.setString(1,presolicitud.getGigas());
            query_2.setString(2, presolicitud.getCuota());
            query_2.setString(3, solicitud.getDireccion_entrega());
            query_2.setInt(4, solicitud.getTelefono());
            query_2.setString(5,comuna_r );
            query_2.setInt(6, presolicitud.getTotal());
            query_2.execute();
            request.getRequestDispatcher("/ListarSolicitudes.jsp").forward(request, response);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AgregarUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(SolicitarPlan.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(SolicitarPlan.class.getName()).log(Level.SEVERE, null, ex);
        }
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
