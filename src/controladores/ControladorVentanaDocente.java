package controladores;

import singleton.Singleton;
import src.Curso;
import src.Persona;
import src.RegistroNotas;
import src.Salon;
import src.Universidad;
import util.LSE;

public class ControladorVentanaDocente {

    Universidad universidad;
    private Curso curso;

    //CONSTRUCTOR   
    public ControladorVentanaDocente() {
        this.universidad = Singleton.getINSTANCE().getUniversidad();
        this.curso = curso;
    }

    //GETTERS AND SETTERS
    public LSE<Curso> getCursos() {
        return universidad.getCursos();
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LSE<Persona> getPersonas() {
        return universidad.getPersonas();
    }

    public Salon buscarSalon(String codigoSalon) {
        return universidad.buscarSalon(codigoSalon);
    }

    //BUSCADORES GENERALES
    public Curso buscarCurso(String CodigoCurso) {
        return universidad.buscarCurso(CodigoCurso);
    }

    public RegistroNotas buscarCalificacion(Curso cursos, String codigo) {
        return curso.buscarCalificacion(cursos, codigo);
    }

    //SERIALIZAR CURSO
    public void serializarListaCursos() {
        Universidad.serializarListaCursos();
    }

    public LSE<Salon> getSalones() {
        return universidad.getSalones();
    }
}
