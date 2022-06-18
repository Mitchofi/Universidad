package controladores;

import singleton.Singleton;
import src.Estudiante;
import src.Herramienta;
import src.Laboratorio;
import src.Persona;
import src.Salon;
import src.Universidad;
import util.LSE;

public class ControladorVentanaReservarSalon {

    private Universidad universidad;

    //CONSTRUCTOR
    public ControladorVentanaReservarSalon() {
        this.universidad = Singleton.getINSTANCE().getUniversidad();
    }

    //GETTERS
    public LSE<Salon> getSalones() {
        return universidad.getSalones();
    }

    public Laboratorio obtenerLaboratorio(int fila, int columna) {
        return universidad.obtenerLaboratorio(fila, columna);
    }

    public LSE<Persona> getPersonas() {
        return universidad.getPersonas();
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    //METODOS BUSCADOR
    public Persona buscarPersonaCodigo(String codigo) {
        return universidad.buscarPersonaCodigo(codigo);
    }
}
