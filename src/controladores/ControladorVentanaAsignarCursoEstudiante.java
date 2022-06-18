package controladores;

import singleton.Singleton;
import src.Curso;
import src.Estudiante;
import src.Persona;
import src.Universidad;
import util.LSE;

public class ControladorVentanaAsignarCursoEstudiante {

    private Universidad universidad;
    public static Curso curso;

    //CONSTRUCTOR
    public ControladorVentanaAsignarCursoEstudiante(Curso curso) {
        this.universidad = Singleton.getINSTANCE().getUniversidad();
        this.curso = curso;
    }

    //GETTERS
    public LSE<Persona> getPersonas() {
        return universidad.getPersonas();
    }

    public LSE<Persona> getEstudiantes() {
        return universidad.getPersonas();
    }

    public LSE<Curso> getCursos() {
        return universidad.getCursos();
    }

    //METODOS CURSOS
    public Curso retornarCursoPos(int i) {
        return universidad.retornarCursoPos(i);
    }

    public Curso buscarCurso(String nombreCurso) {
        return universidad.buscarCurso(nombreCurso);
    }

    public Persona buscarCodigoUniversitario(String codigoUniversitario) {
        return curso.buscarCodigoUniversitario(codigoUniversitario);
    }

    public boolean registrarEstudianteCurso(Estudiante estudiante) {
        return curso.registrarEstudianteCurso(estudiante);
    }

    public Persona buscarPersonaCodigo(String codigo) {
        return universidad.buscarPersonaCodigo(codigo);
    }

    public boolean eliminarEstudiante(Estudiante estudiante, String codigoUniversitario) {
        return curso.eliminarEstudiante(estudiante, codigoUniversitario);
    }
}
