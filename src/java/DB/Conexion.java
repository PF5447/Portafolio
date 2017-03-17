/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felipe inostroza
 */
public class Conexion {
    
    private static Connection cnx = null;
    public static Connection Conectar(){
        if (cnx == null) {
            try {
                //Establecer Conexion a Base de Datos
                Class.forName("com.mysql.jdbc.Driver");  
                String server = "jdbc:mysql://localhost/";
                String BD = "Examen_Java";
                String user = "root";
                String pass = "123456";
                cnx = (Connection) DriverManager.getConnection(server + BD, user, pass);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cnx;
    }
    
    public static void Cerrar(){
        if (cnx != null) {
            try {
                cnx.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
