package controladores;

import singleton.Singleton;
import src.Laboratorio;
import src.Universidad;

public class ControladorVentanaLaboratorio {

    private Universidad universidad;

    //CONSTRUCTOR
    public ControladorVentanaLaboratorio() {
        this.universidad = Singleton.getINSTANCE().getUniversidad();
    }

    //METODOS OBTENER LABORATORIO
    public Laboratorio obtenerLaboratorio(int fila, int columna) {
        return universidad.obtenerLaboratorio(fila, columna);
    }

    //METODOS LABORATORIOS
    public void deshabilitarLaboratorio(int fila, int columna) {
        universidad.deshabilitarLaboratorio(fila, columna);
    }

    public void habilitarLaboratorio(int fila, int columna) {
        universidad.habilitarLaboratorio(fila, columna);
    }
}
