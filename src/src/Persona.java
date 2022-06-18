package src;

import java.io.Serializable;

public class Persona implements Serializable {

    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String numeroCelular;
    protected String edad;
    protected String direccion;
    protected String entidadSalud;
    protected String codigoUniversitario;
    protected String correo;
    protected Usuario usuario;

    public Persona(String nombre, String apellido, String cedula, String numeroCelular, String edad, String direccion, String entidadSalud, String codigoUniversitario, String correo, Usuario usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.numeroCelular = numeroCelular;
        this.edad = edad;
        this.direccion = direccion;
        this.entidadSalud = entidadSalud;
        this.codigoUniversitario = codigoUniversitario;
        this.correo = correo;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEntidadSalud() {
        return entidadSalud;
    }

    public void setEntidadSalud(String entidadSalud) {
        this.entidadSalud = entidadSalud;
    }

    public String getCodigoUniversitario() {
        return codigoUniversitario;
    }

    public void setCodigoUniversitario(String codigoUniversitario) {
        this.codigoUniversitario = codigoUniversitario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
