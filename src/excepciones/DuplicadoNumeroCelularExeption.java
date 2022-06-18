package excepciones;

public class DuplicadoNumeroCelularExeption extends RuntimeException {

    public DuplicadoNumeroCelularExeption() {
        super("El numero de celular ya se encuentra registrado con un usuario");
    }
}
