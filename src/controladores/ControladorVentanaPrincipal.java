package controladores;

import singleton.Singleton;
import src.Persona;
import src.Salon;
import src.Universidad;
import src.Usuario;
import util.LSE;

public class ControladorVentanaPrincipal {

    private static Universidad universidad;

    //CONSTRUCTOR
    public ControladorVentanaPrincipal() {
        this.universidad = Singleton.getINSTANCE().getUniversidad();
    }

    //GETTERS
    public Universidad getUniversidad() {
        return universidad;
    }

    public LSE<Salon> getSalones() {
        return universidad.getSalones();
    }
 
    //METODOS LOGIN
    public int login(Usuario usuario) {
        return universidad.login(usuario);
    }

    //METODOS BUSCADORES
    public Persona buscarDocenteCuenta(Usuario usuario) {
        return universidad.buscarDocenteCuenta(usuario);
    }

    public Persona buscarEstudianteCuenta(Usuario usuario) {
        return universidad.buscarEstudianteCuenta(usuario);
    }

}
