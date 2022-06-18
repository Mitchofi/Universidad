package src;

import java.io.Serializable;

public class Prestamo implements Serializable {

    private Herramienta herramientas;
    private Estudiante estduiante;

    public Prestamo(Estudiante estudiante, Herramienta herramientas) {
        this.herramientas = herramientas;
        this.estduiante = estudiante;
    }

    public Herramienta getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(Herramienta herramientas) {
        this.herramientas = herramientas;
    }

    public Estudiante getEstduiante() {
        return estduiante;
    }

    public void setEstduiante(Estudiante estduiante) {
        this.estduiante = estduiante;
    }

}
