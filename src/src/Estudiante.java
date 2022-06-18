package src;

import java.io.Serializable;

public class Estudiante extends Persona implements Serializable {

    private Carrera carrera;
    
    public Estudiante(Carrera carrera, String nombre, String apellido, String cedula, String numeroCelular, String edad, String direccion, String entidadSalud, String codigoUniversitario, String correo, Usuario usuario) {
        super(nombre, apellido, cedula, numeroCelular, edad, direccion, entidadSalud, codigoUniversitario, correo, usuario);
        this.carrera = carrera;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

}
