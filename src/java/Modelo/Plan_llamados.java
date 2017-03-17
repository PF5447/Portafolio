/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author felipe
 */
public class Plan_llamados {
    
    private  int id_llamados;
    private  String descripcion;
    private  int precio;

    public Plan_llamados() {
    }

    public Plan_llamados(int id_llamados, String descripcion, int precio) {
        this.id_llamados = id_llamados;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getId_llamados() {
        return id_llamados;
    }

    public void setId_llamados(int id_llamados) {
        this.id_llamados = id_llamados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
