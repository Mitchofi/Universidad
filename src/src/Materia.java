package src;

import java.io.Serializable;

public class Materia implements Serializable {

    private String nombreMateria;
    private String codigoMateria;

    public Materia(String nombreMateria, String codigoMateria) {
        this.nombreMateria = nombreMateria;
        this.codigoMateria = codigoMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

}
