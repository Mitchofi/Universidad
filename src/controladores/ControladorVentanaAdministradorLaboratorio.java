package controladores;

import singleton.Singleton;
import src.Estudiante;
import src.Herramienta;
import src.Laboratorio;
import src.Persona;
import src.Universidad;
import util.LSE;

public class ControladorVentanaAdministradorLaboratorio {
    
    private Universidad universidad;

    //CONSTRUCTOR
    public ControladorVentanaAdministradorLaboratorio() {
        this.universidad = Singleton.getINSTANCE().getUniversidad();
    }

    //METODOS GETTERS
    public LSE<Persona> getPersonas() {
        return universidad.getPersonas();
    }
    
    public Universidad getUniversidad() {
        return universidad;
    }
    
    public LSE<Herramienta> getHerramientas() {
        return universidad.getHerramientas();
    }

    //METODOS BUSCADORES GENERALES
    public Persona buscarPersonaCodigo(String codigo) {
        return universidad.buscarPersonaCodigo(codigo);
    }

    //METODO HERRAMIENTA
    public Herramienta buscarHerramienta(String codigoHerramienta) {
        return universidad.buscarHerramienta(codigoHerramienta);
    }
    
    public boolean registrarHerramienta(Herramienta herramienta) {
        return universidad.registrarHerramienta(herramienta);
    }
    
    public boolean eliminarHerramienta(String codigoHerramienta) {
        return universidad.eliminarHerramienta(codigoHerramienta);
    }
    
    public Laboratorio obtenerLaboratorio(int fila, int columna) {
        return universidad.obtenerLaboratorio(fila, columna);
    }

    //METDOOS LABORATORIO
    public boolean eliminarIngresoLaboratorio(String codigoUniversitario, int fila, int columna) {
        return universidad.eliminarIngresoLaboratorio(codigoUniversitario, fila, columna);
    }
    
    public void eliminarTodosLosEstudiante(int fila, int columna) {
        universidad.eliminarTodosLosEstudiante(fila, columna);
    }
    
    public void deshabilitarLaboratorio(int fila, int columna) {
        universidad.deshabilitarLaboratorio(fila, columna);
    }
    
    public void habilitarLaboratorio(int fila, int columna) {
        universidad.habilitarLaboratorio(fila, columna);
    }

    //METODO COLA
    public void regLab(int fila, int columna, Estudiante estudiante) {
        universidad.regLab(fila, columna, estudiante);
    }
    
    public void registrarColaLaboraorio(int fila, int col, Estudiante estudiante) {
        universidad.registrarColaLaboraorio(fila, col, estudiante);
    }
    
    public void eliminarTodosLosEstudianteEnCola(int fila, int columna) {
        universidad.eliminarTodosLosEstudianteEnCola(fila, columna);
    }
    
    public Persona buscarPersonaCodigoLab(String codigo, int fila, int columna) {
        return universidad.buscarPersonaCodigoLab(codigo, fila, columna);
    }
    
    public void retirarTodasHerramientas(int fila, int columna) {
        universidad.retirarTodasHerramientas(fila, columna);
    }
}
