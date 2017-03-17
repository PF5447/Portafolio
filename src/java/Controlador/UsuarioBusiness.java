/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DB.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felipe
 */
public class UsuarioBusiness implements UsuarioBusinessInterface{

    @Override
    public Usuario recuperarUsuario(String rut,String pass) {
       
        Connection c = Conexion.Conectar();        
        Usuario usr= null;
        try{
            PreparedStatement query = c.prepareStatement("select * from CLIENTE where rut=? and contrasena=?");
            query.setString(1, rut);
            query.setString(2, pass);
            ResultSet rs= query.executeQuery();
            while(rs.next()){
                usr= new Usuario();
                usr.setRut(rs.getString("rut"));
                usr.setContrasena(rs.getString("contrasena"));
                usr.setNombre(rs.getString("nombre"));
                usr.setApellido_paterno(rs.getString("apellido_paterno"));
                usr.setApellido_materno(rs.getString("apellido_materno"));
                usr.setDireccion(rs.getString("direccion"));
                usr.setNumeracion(rs.getInt("numeracion"));
                usr.setTelefono(rs.getInt("telefono"));
                usr.setId_comuna(rs.getInt("COMUNAS_idComuna"));
                
                
                System.out.println("Nombre :"+usr.getNombre());
            }            
        }catch(SQLException ex){
            Logger.getLogger(UsuarioBusiness.class.getName()).log(Level.SEVERE, null, ex);            
        }
        
        return usr;
    }
    
    

    @Override
    public boolean validarUsuario(String rut, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean AgregarUsuario(String rut,String confirmacion, String contrasena, String nombre, String apellido_pat, String apellido_mat, String direccion, int numeracion, int telefono, int idComuna) {
        Connection c = Conexion.Conectar(); 
        
        try {
                     
                        
            PreparedStatement query = c.prepareStatement("INSERT INTO CLIENTE VALUES (?,?,?,?,?,?,?,?,?);");
            query.setString(1, rut);
            query.setString(2, contrasena);
            query.setString(3, nombre);
            query.setString(4, apellido_pat);
            query.setString(5, apellido_mat);
            query.setString(6, direccion);
            query.setInt(7, numeracion);
            query.setInt(8, telefono);
            query.setInt(9, idComuna);
            query.execute();
                         
            return true;  
                 
           
            
            
        } catch (SQLException e) {
            System.out.println("Error"+e.getMessage());
            return false;
        }
   
        
        
        
    }
    
    
    
}
