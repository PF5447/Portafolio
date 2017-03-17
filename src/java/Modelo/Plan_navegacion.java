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
public class Plan_navegacion {
    
    private  int id_navegacion;
    private  String descripcion;
    private int precio;

    public Plan_navegacion() {
    }

    public Plan_navegacion(int id_navegacion, String descripcion, int precio) {
        this.id_navegacion = id_navegacion;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getId_navegacion() {
        return id_navegacion;
    }

    public void setId_navegacion(int id_navegacion) {
        this.id_navegacion = id_navegacion;
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
