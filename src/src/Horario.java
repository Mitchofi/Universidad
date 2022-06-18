package src;

import java.io.Serializable;
import java.util.Date;
import util.LSE;

public class Horario implements Serializable {

    public static String HORA_OCUPADA = "Ocupado";
    public static String HORA_DISPONIBLE = "Disponible";
        
    private  String estado;
    private Curso curso;   

    public Horario() {
        this.curso = null;
        this.estado = HORA_DISPONIBLE;       
    }
           
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
