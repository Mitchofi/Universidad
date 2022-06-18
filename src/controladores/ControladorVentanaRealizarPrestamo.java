package controladores;

import singleton.Singleton;
import src.Estudiante;
import src.Herramienta;
import src.Laboratorio;
import src.Universidad;
import util.LSE;

public class ControladorVentanaRealizarPrestamo {

    private Universidad universidad;

    //CONSTRUCTOR
    public ControladorVentanaRealizarPrestamo() {
        this.universidad = Singleton.getINSTANCE().getUniversidad();
    }

    public LSE<Herramienta> getHerramientas() {
        return universidad.getHerramientas();
    }

    public Laboratorio obtenerLaboratorio(int fila, int columna) {
        return universidad.obtenerLaboratorio(fila, columna);
    }

    public Herramienta buscarHerramienta(String codigoHerramienta) {
        return universidad.buscarHerramienta(codigoHerramienta);
    }

    //METODO PRESTAMO
    public boolean registrarEstudiantePrestamo(Estudiante estudiante, Herramienta herramienta, int fila, int columna) {
        return universidad.registrarEstudiantePrestamo(estudiante, herramienta, fila, columna);
    }

    public void retirarHerramientaEstudiante(Herramienta herramienta, int fila, int columna) {
        universidad.retirarHerramientaEstudiante(herramienta, fila, columna);
    }
}
