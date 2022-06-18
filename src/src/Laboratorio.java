package src;

import FIFO.Cola;
import java.io.Serializable;
import util.LSE;
import static src.Universidad.laboratorios;

public class Laboratorio implements Serializable {

    public static String DISPONIBLE = "Disponible";
    public static String OCUPADO = "Ocupado";
    public static String DESHABILITADO = "Deshabilitiado";
    private int cupo;
    private LSE<Prestamo> prestamoEstudiante;
    private LSE<Estudiante> estudiantes;
    private String disponibilidad;
    private String motivo;
    private Cola cola;

    public Laboratorio() {
        this.cupo = 2;
        this.prestamoEstudiante = new LSE<>();
        this.estudiantes = new LSE<>();
        this.disponibilidad = DISPONIBLE;
        this.motivo = motivo;
        this.cola = new Cola();
    }

    public Cola getCola() {
        return cola;
    }

    public LSE<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public int getCupo() {
        return cupo;
    }

    public LSE<Prestamo> getPrestamoEstudiante() {
        return prestamoEstudiante;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void regLab(Estudiante estudiante) {
        Boolean aux = siEstaLLeno();
        if (aux) {
            cola.offer(estudiante);

        } else {
            Persona buscar = buscarEstudianteTodosLosLaboratorios(estudiante.getCodigoUniversitario());
            if (buscar == null) {
                estudiantes.agregarNodo(estudiante);
            }
        }
    }

    public boolean siEstaLLeno() {
        if (estudiantes.getSize() == cupo) {
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarEstudiante(String codigoUniversitario) {
        boolean eliminado = false;
        for (int j = 0; j < prestamoEstudiante.getSize(); j++) {
            if (prestamoEstudiante.obtenerDatoIndice(j).getEstduiante().getCodigoUniversitario().equals(codigoUniversitario)) {
                prestamoEstudiante.obtenerDatoIndice(j).getHerramientas().setDisponibilidad("Disponible");
                prestamoEstudiante.eliminar(j);
            }
        }
        for (int i = 0; i < estudiantes.getSize(); i++) {
            if (estudiantes.obtenerDatoIndice(i).getCodigoUniversitario().equals(codigoUniversitario)) {
                if (cola.getCabeza() == null) {
                    estudiantes.eliminar(i);
                    eliminado = true;
                } else {
                    estudiantes.eliminar(i);
                    Estudiante estudiante = (Estudiante) getCola().poll();
                    if (buscarEstudianteTodosLosLaboratorios(estudiante.getCodigoUniversitario()) == null) {
                        estudiantes.agregarNodo(estudiante);
                        eliminado = true;
                    }
                }
            }
        }
        return eliminado;
    }

    public void eliminarTodosLosEstudiante() {
        for (int i = 0; i < prestamoEstudiante.getSize(); i++) {
            prestamoEstudiante.obtenerDatoIndice(i).getHerramientas().setDisponibilidad("Disponible");
        }
        prestamoEstudiante.removeAll();
        estudiantes.removeAll();
        cola.removeAll();
    }
//METODOS COLA:

    public void eliminarTodosLosEstudianteEnCola() {
        cola.removeAll();
    }

    public void registrarCola(Estudiante estudiante) {
        Persona buscar = buscarEstudianteTodosLosLaboratorios(estudiante.getCodigoUniversitario());
        if (buscar == null) {
            cola.offer(estudiante);
        }
    }

    public Estudiante obtenerDatoCola() {
        Estudiante estu = null;
        if (cola.peek() != null) {
            estu = (Estudiante) cola.peek();
        }
        return estu;
    }
    //METODOS ESTUDIANTE UNICO:

    public Estudiante buscarEstudianteTodosLosLaboratorios(String codigoUniversitario) {
        Estudiante estudiante = null;
        for (int i = 0; i < laboratorios.length; i++) {
            for (int j = 0; j < laboratorios[i].length; j++) {
                for (int k = 0; k < laboratorios[i][j].getEstudiantes().getSize(); k++) {
                    if (laboratorios[i][j].getEstudiantes().obtenerDatoIndice(k) instanceof Estudiante) {
                        Estudiante aux = (Estudiante) laboratorios[i][j].getEstudiantes().obtenerDatoIndice(k);
                        if (aux.getCodigoUniversitario().equals(codigoUniversitario)) {
                            estudiante = (Estudiante) laboratorios[i][j].getEstudiantes().obtenerDatoIndice(k);
                        }
                    }
                }
            }
        }
        return estudiante;
    }

    //METODO PRESTAMO
    public boolean registrarEstudiantePrestamo(Estudiante estudiante, Herramienta herramienta) {
        boolean registro = false;
        if (herramienta.getDisponibilidad().equals("Disponible")) {
            Prestamo prestamo = new Prestamo(estudiante, herramienta);
            prestamoEstudiante.agregarNodo(prestamo);
            herramienta.setDisponibilidad("Ocupado");
            registro = true;
            Universidad.serializarListaHerramientas();
            Universidad.serializarLaboratorios();
        }
        return registro;
    }

    public void retirarHerramientaEstudiante(Herramienta herramienta) {
        for (int i = 0; i < prestamoEstudiante.getSize(); i++) {
            if (prestamoEstudiante.obtenerDatoIndice(i).getHerramientas().getCodigoHerramienta().equals(herramienta.getCodigoHerramienta())) {
                prestamoEstudiante.eliminar(i);
                herramienta.setDisponibilidad("Disponible");
            }
        }
    }

    public void retirarTodasHerramientas() {
        for (int i = 0; i < prestamoEstudiante.getSize(); i++) {
            prestamoEstudiante.obtenerDatoIndice(i).getHerramientas().setDisponibilidad("Disponible");
            prestamoEstudiante.eliminar(i);
        }
    }
}
