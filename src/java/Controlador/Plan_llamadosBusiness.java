/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DB.Conexion;
import Modelo.Plan_llamados;
import Modelo.Plan_navegacion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felipe
 */
public class Plan_llamadosBusiness implements Plan_llamadosBusinessInterface{

    @Override
    public ArrayList<Plan_llamados> listarLLamados() {
        
        Plan_llamados plan_llamados;
        Connection c = Conexion.Conectar();
        ArrayList<Plan_llamados> planes = new ArrayList<>();
        try{
            java.sql.PreparedStatement query = c.prepareStatement("select * from PLAN_LLAMADAS");
            ResultSet rs= query.executeQuery();
            while(rs.next()){
                plan_llamados = new Plan_llamados();
                plan_llamados.setId_llamados(rs.getInt("id_plan"));
                plan_llamados.setDescripcion(rs.getString("descripcion"));
                plan_llamados.setPrecio(rs.getInt("precio"));
                planes.add(plan_llamados);
            }
            
        }catch(SQLException ex) {
            Logger.getLogger(ComunaBusiness.class.getName()).log(Level.SEVERE, null, ex);            
        }
        return planes;
        
        
    }
    
}
