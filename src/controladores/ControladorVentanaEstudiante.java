package controladores;

import static controladores.ControladorVentanaAsignarCursoEstudiante.curso;
import singleton.Singleton;
import src.Curso;
import src.Estudiante;
import src.Persona;
import src.Universidad;
import util.LSE;

public class ControladorVentanaEstudiante {

    private Universidad universidad;

    //CONSTRUCTOR
    public ControladorVentanaEstudiante() {
        this.universidad = Singleton.getINSTANCE().getUniversidad();
    }

    //GETTERS
    public Universidad getUniversidad() {
        return universidad;
    }

    public LSE<Persona> getPersonas() {
        return universidad.getPersonas();
    }

    public LSE<Curso> getCursos() {
        return universidad.getCursos();
    }

    //BUSCAR CURSO
    public Curso buscarCursoMateria(String codigoCurso) {
        return universidad.buscarCurso(codigoCurso);
    }

    //ELIMINAR ESTUDIANTE DE CURSO
    public boolean eliminarEstudiante(Estudiante estudiante, String codigoUniversitario) {
        return curso.eliminarEstudiante(estudiante, codigoUniversitario);
    }
}
