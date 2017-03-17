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
public class Presolicitud {
    
    String cuota;
    String gigas;
    String entrga;
    int total;

    public Presolicitud() {
    }

    public Presolicitud(String cuota, String gigas, String entrga, int total) {
        this.cuota = cuota;
        this.gigas = gigas;
        this.entrga = entrga;
        this.total = total;
    }

    public String getCuota() {
        return cuota;
    }

    public void setCuota(String cuota) {
        this.cuota = cuota;
    }

    public String getGigas() {
        return gigas;
    }

    public void setGigas(String gigas) {
        this.gigas = gigas;
    }

    public String getEntrga() {
        return entrga;
    }

    public void setEntrga(String entrga) {
        this.entrga = entrga;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
