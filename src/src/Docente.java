package src;

import java.io.Serializable;

public class Docente extends Persona implements Serializable {

    public Docente(String nombre, String apellido, String cedula, String numeroCelular, String edad, String direccion, String entidadSalud, String codigoUniversitario, String correo, Usuario usuario) {
        super(nombre, apellido, cedula, numeroCelular, edad, direccion, entidadSalud, codigoUniversitario, correo, usuario);
    }
}
