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
public class Comuna {
    
    int idComuna;
    String nombreComuna;
    int idProvincia;

    public Comuna(int idComuna, String nombreComuna, int idProvincia) {
        this.idComuna = idComuna;
        this.nombreComuna = nombreComuna;
        this.idProvincia = idProvincia;
    }

    public Comuna() {
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombreComuna() {
        return nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }
    
}
