package src;

public class BloqueDeHora {
    
public static String BLOQUE_OCUPADO = "Ocupado";
public static String BLOQUE_DISPONIBLE = "Disponible";

private String estado;
private Curso curso;

    public BloqueDeHora( Curso curso) {
        this.estado = BLOQUE_DISPONIBLE;
        this.curso = curso;
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
