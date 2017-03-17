/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Presolicitud;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author felipe
 */
public class CalculosServlet extends HttpServlet {

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
 
        Presolicitud presolicitud = new Presolicitud();
        String cuota_minutos = request.getParameter("ddlLista");
        presolicitud.setCuota(cuota_minutos);
       
        String cuota_gigas = request.getParameter("radios");
        presolicitud.setGigas(cuota_gigas);
                
        String entrega = request.getParameter("chkEntrega");
          
        
        
        switch (cuota_minutos) {
            case "2000 MINUTOS":
                presolicitud.setTotal(3000);
                break;
            case "800 MINUTOS":
                 presolicitud.setTotal(1000);
                break;
            default:
                 presolicitud.setTotal(5000);
                break;
        }
        
        switch (cuota_gigas) {
            case "5 Gigas":
                 presolicitud.setTotal(presolicitud.getTotal()+4000);
                break;
            case "7 Gigas":
                presolicitud.setTotal(presolicitud.getTotal()+6000);
                break;
            case "8 Gigas":
                presolicitud.setTotal(presolicitud.getTotal()+8000);
                break;
            default:
                break;
        }
        
        if (entrega == null){
            presolicitud.setEntrga("Retirado en Sucursal");
        }else if (entrega.equals("A Domicilio")) {
            presolicitud.setEntrga("Entrega del Chip en Domicilio");
        }
        
        request.getSession().setAttribute("sesion_total", presolicitud);
        request.getRequestDispatcher("/Confirmacion.jsp").forward(request, response);
        
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
