package src;

import java.io.Serializable;
import util.LSE;

/**
 *
 * @author Acer
 */
public class Curso implements Serializable {

    private String nombreCurso;
    private String codigoCurso;
    private Persona docente;
    private LSE<RegistroNotas> registroNotas;
    private Materia materia;
    private int intensidadHoraria;

    public Curso(String nombreCurso, String codigoCurso, Persona docente, Materia materia, int intensidadHoraria) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.docente = docente;
        this.registroNotas = new LSE<>();
        this.materia = materia;
        this.intensidadHoraria = intensidadHoraria;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Persona getDocente() {
        return docente;
    }

    public void setDocente(Persona docente) {
        this.docente = docente;
    }

    public LSE<RegistroNotas> getRegistroNotas() {
        return registroNotas;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getIntensidadHoraria() {
        return intensidadHoraria;
    }

    public void setIntensidadHoraria(int intensidadHoraria) {
        this.intensidadHoraria = intensidadHoraria;
    }

    @Override
    public String toString() {
        return nombreCurso;
    }

    public boolean registrarEstudianteCurso(Estudiante estudiante) {
        boolean registro = false;
        Persona buscar = buscarCodigoUniversitario(estudiante.getCodigoUniversitario());
        RegistroNotas estu = new RegistroNotas(estudiante);
        if (buscar == null) {
            registroNotas.agregarNodo(estu);
            registro = true;
        }
        return registro;
    }

    public boolean eliminarEstudiante(Estudiante estudiante, String codigoUniversitario) {
        boolean eliminado = false;
        for (int i = 0; i < registroNotas.getSize(); i++) {

            if (registroNotas.obtenerDatoIndice(i).getEstudiante().getCodigoUniversitario().equals(codigoUniversitario)) {
                if (registroNotas.obtenerDatoIndice(i).getNotaUno() == 0.0 && registroNotas.obtenerDatoIndice(i).getNotaDos() == 0.0
                        && registroNotas.obtenerDatoIndice(i).getNotaTres() == 0.0 && registroNotas.obtenerDatoIndice(i).getNotaFinal() == 0.0) {
                    registroNotas.eliminar(i);
                    eliminado = true;
                }
            }
        }
        return eliminado;
    }

    public Persona buscarCodigoUniversitario(String codigoUniversitario) {
        Persona persona = null;
        for (int i = 0; i < registroNotas.getSize(); i++) {
            if (registroNotas.obtenerDatoIndice(i).getEstudiante().getCodigoUniversitario().equals(codigoUniversitario)) {
                persona = registroNotas.obtenerDatoIndice(i).getEstudiante();
            }
        }
        return persona;
    }

    public RegistroNotas buscarCalificacion(Curso curso, String codigo) {

        RegistroNotas aux = null;

        for (int i = 0; i < curso.getRegistroNotas().getSize(); i++) {
            RegistroNotas est = curso.getRegistroNotas().obtenerDatoIndice(i);
            if (curso.getRegistroNotas().obtenerDatoIndice(i).getEstudiante().getCodigoUniversitario().equals(codigo)) {
                aux = curso.getRegistroNotas().obtenerDatoIndice(i);
            }
        }
        return aux;
    }

}
