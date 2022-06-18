package src;

import java.io.Serializable;

public class Herramienta implements Serializable {

    public static final String DISPONIBLE = "Disponible";
    public static final String OCUPADO = "Ocupado";
    private String nombre;
    private String disponibilidad;
    private String codigoHerramienta;

    public Herramienta(String nombre, String codigoHerramienta) {
        this.nombre = nombre;
        this.disponibilidad = DISPONIBLE;
        this.codigoHerramienta = codigoHerramienta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCodigoHerramienta() {
        return codigoHerramienta;
    }

}
