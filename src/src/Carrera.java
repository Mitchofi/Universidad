package src;

import java.io.Serializable;

public class Carrera implements Serializable {

    private String nombreCarrera;
    private String codigoCarrera;

    public Carrera(String nombreCarrera, String codigoCarrera) {
        this.nombreCarrera = nombreCarrera;
        this.codigoCarrera = codigoCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

}
