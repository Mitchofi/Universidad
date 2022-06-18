package excepciones;

public class DuplicadoDocumentoExeption extends RuntimeException {

    public DuplicadoDocumentoExeption() {
        super("El documento ya se encuentra registrado con un usuario");
    }
}
