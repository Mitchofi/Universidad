package src;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String codigoUniversitario;
    private String contrasena;

    public Usuario(String codigoUniversitario, String contrasena) {
        this.codigoUniversitario = codigoUniversitario;
        this.contrasena = contrasena;
    }

    public String getCodigoUniversitario() {
        return codigoUniversitario;
    }

    public void setCodigoUniversitario(String codigoUniversitario) {
        this.codigoUniversitario = codigoUniversitario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contraseña) {
        this.contrasena = contraseña;
    }

}
