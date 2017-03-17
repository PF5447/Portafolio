/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author felipe
 */
public class Solicitud {
    
private int codigo;
private String gigas;
private String minutos;
private String direccion_entrega;
private int telefono;
private String comuna;
private Date ingreso;
private int total;

    public Solicitud() {
    }

    public Solicitud(int codigo, String gigas, String minutos, String direccion_entrega, int telefono, String comuna, Date ingreso, int total) {
        this.codigo = codigo;
        this.gigas = gigas;
        this.minutos = minutos;
        this.direccion_entrega = direccion_entrega;
        this.telefono = telefono;
        this.comuna = comuna;
        this.ingreso = ingreso;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGigas() {
        return gigas;
    }

    public void setGigas(String gigas) {
        this.gigas = gigas;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public String getDireccion_entrega() {
        return direccion_entrega;
    }

    public void setDireccion_entrega(String direccion_entrega) {
        this.direccion_entrega = direccion_entrega;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}
