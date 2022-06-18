package controladores;

import singleton.Singleton;
import src.Carrera;
import src.Curso;
import src.Docente;
import src.Estudiante;
import src.Materia;
import src.Persona;
import src.Salon;
import src.Universidad;
import src.Usuario;
import util.LSE;

public class ControladorVentanaAdministradorGeneral {

    private Universidad universidad;

    //CONSTRUCTOR
    public ControladorVentanaAdministradorGeneral() {
        this.universidad = Singleton.getINSTANCE().getUniversidad();
    }

    //GETTERS
    public Universidad getUniversidad() {
        return universidad;
    }

    public LSE<Persona> getPersonas() {
        return universidad.getPersonas();
    }

    //METODOS SALONES
    public LSE<Salon> getSalones() {
        return universidad.getSalones();
    }

    public boolean registrarSalon(Salon salon) {
        return universidad.registrarSalon(salon);
    }

    public boolean eliminarSalon(String numeroSalon) {
        return universidad.eliminarSalon(numeroSalon);
    }

    //METODOS CURSOS
    public LSE<Curso> getCursos() {
        return universidad.getCursos();
    }

    public Curso retornarCursoPos(int i) {
        return universidad.retornarCursoPos(i);
    }

    public int getCodigoCurso() {
        return universidad.getCodigoCurso();
    }

    public Curso buscarCurso(String CodigoCurso) {
        return universidad.buscarCurso(CodigoCurso);
    }

    public boolean registrarCurso(Curso curso) {
        return universidad.registrarCurso(curso);
    }

    public boolean eliminarCurso(String nombreCurso) {
        return universidad.eliminarCurso(nombreCurso);
    }

    public boolean modificarCurso(String nombreCurso, String codigoCurso,
            Persona docente, Materia materia, int intensidadHoraria) {
        return universidad.modificarCurso(nombreCurso, codigoCurso, docente,
                materia, intensidadHoraria);
    }

    //METODOS MATERIAS
    public LSE<Materia> getMaterias() {
        return universidad.getMaterias();
    }

    public Materia buscarMateria(String codigoMateria) {
        return universidad.buscarMateria(codigoMateria);
    }

    public boolean registrarMateria(Materia materia) {
        return universidad.registrarMateria(materia);
    }

    public boolean eliminarMateria(String codigoMateria) {
        return universidad.eliminarMateria(codigoMateria);
    }

    public boolean modificarMateria(String nombreMateria, String codigoMateria) {
        return universidad.modificarMateria(nombreMateria, codigoMateria);
    }

    //METODOS ESTUDIANTES
    public int registrarEstudiante(Estudiante estudiante) {
        return universidad.registrarEstudiante(estudiante);
    }

    public boolean eliminarEstudiante(String cedula) {
        return universidad.eliminarEstudiante(cedula);
    }

    public boolean modificarEstudiante(Carrera carrera, String nombre,
            String apellido, String cedula, String numeroCelular, String edad,
            String direccion, String entidadSalud, String codigoUniversitario,
            String correo, Usuario usuario) {
        return universidad.modificarEstudiante(carrera, nombre, apellido, cedula,
                numeroCelular, edad, direccion, entidadSalud,
                codigoUniversitario, correo, usuario);
    }

    //METODOS CARRERAS
    public LSE<Carrera> getCarreras() {
        return universidad.getCarreras();
    }

    public Carrera retornarCarreraPos(int i) {
        return universidad.retornarCarreraPos(i);
    }

    public Carrera buscarCarrera(String codigoCarrera) {
        return universidad.buscarCarrera(codigoCarrera);
    }

    public boolean registrarCarrera(Carrera carrera) {
        return universidad.registrarCarrera(carrera);
    }

    public boolean eliminarCarrera(String codigoCarrera) {
        return universidad.eliminarCarrera(codigoCarrera);
    }

    public boolean modificarCarrera(String nombreCarrera, String codigoCarrera) {
        return universidad.modificarCarrera(nombreCarrera, codigoCarrera);
    }

    //METODOS BUSCADORES
    public Persona buscarPersonaCodigo(String codigo) {
        return universidad.buscarPersonaCodigo(codigo);
    }

    public Persona buscarCedula(String documento) {
        return universidad.buscarCedula(documento);
    }

    //METODOS DOCENTES
    public int registrarDocente(Docente docente) {
        return universidad.registrarDocente(docente);
    }

    public boolean eliminarDocente(String cedula) {
        return universidad.eliminarDocente(cedula);
    }

    public boolean modificarDocente(String nombre, String apellido,
            String cedula, String numeroCelular, String edad, String direccion,
            String entidadSalud, String codigoUniversitario, String correo,
            Usuario usuario) {
        return universidad.modificarDocente(nombre, apellido, cedula,
                numeroCelular, edad, direccion, entidadSalud, codigoUniversitario,
                correo, usuario);
    }

}
