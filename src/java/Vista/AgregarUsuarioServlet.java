/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
    import java.math.BigInteger;
    import java.security.MessageDigest;
    import java.security.NoSuchAlgorithmException;
import Controlador.UsuarioBusiness;
import DB.Conexion;
import static com.sun.codemodel.JOp.lt;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.lt;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author felipe
 */
public class AgregarUsuarioServlet extends HttpServlet {

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

               String rut2 = request.getParameter("txtRut");
        String contrasena2 = request.getParameter("txtClave");
        String confirmar2 = request.getParameter("txtConfirmar");
        
        if(validarRut(rut2) == false || !contrasena2.equals(confirmar2)){
            
            request.getRequestDispatcher("/RegistroError.jsp").forward(request, response);
        }
        else
        {
        UsuarioBusiness nuevoUsuario;
        
     
        String rut = request.getParameter("txtRut");
        String Confirmacion = request.getParameter("txtConfirmar");
        String contrasena = request.getParameter("txtClave2");

        String Nombre = request.getParameter("txtNombre");
        String A_paterno = request.getParameter("txtApellidoPaterno");
        String A_materno = request.getParameter("txtApellidoMaterno");
        String direccion = request.getParameter("txtDireccion");
        String numeracion = request.getParameter("txtNumeracion");
        int numeracion_p = Integer.parseInt(numeracion);
        String comuna = request.getParameter("ddlComuna");
        System.out.println("Nombre de comuna"+comuna);

          Connection c = Conexion.Conectar();
          try {
            PreparedStatement query = c.prepareStatement("select comuna_id from COMUNAS WHERE comuna_nombre =?");
            query.setString(1,comuna);
            ResultSet rs= query.executeQuery();
            if (rs.next()) {
            int idComuna_p = rs.getInt("comuna_id");   
            String telefono = request.getParameter("txtNumeroTelefono");
            int telefono_p = Integer.parseInt(telefono);
            
            PreparedStatement query_2 = c.prepareStatement("INSERT INTO CLIENTE VALUES (?,?,?,?,?,?,?,?,?);");
            query_2.setString(1, rut);
            query_2.setString(2, contrasena);
            query_2.setString(3, Nombre);
            query_2.setString(4, A_paterno);
            query_2.setString(5, A_materno);
            query_2.setString(6, direccion);
            query_2.setInt(7, numeracion_p);
            query_2.setInt(8, telefono_p);
            query_2.setInt(9, idComuna_p);
            query_2.executeUpdate();
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
            }
            
            
            
            } catch (SQLException ex) {
                Logger.getLogger(AgregarUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        
    public static boolean validarRut(String rut) {
 
       
            boolean validacion = false;
            try {
                    rut =  rut.toUpperCase();
                    rut = rut.replace(".", "");
                    rut = rut.replace("-", "");
                    int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

                     char dv = rut.charAt(rut.length() - 1);

                    int m = 0, s = 1;
                     for (; rutAux != 0; rutAux /= 10) {
                        s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
                    }
                    if (dv == (char) (s != 0 ? s + 47 : 75)) {
                    validacion = true;
                 }

                } catch (java.lang.NumberFormatException e) 
                {   } 
            catch (Exception e) {
            }
            return validacion;
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
