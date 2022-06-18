package src;

import java.io.Serializable;
import util.LSE;

public class Salon implements Serializable {

    private LSE<Curso> curso;
    private Horario[][] horario;
    private String codigoSalon;

    public Salon(String codigoSalon) {
        this.curso = new LSE<>();
        this.horario = new Horario[8][6];
        this.codigoSalon = codigoSalon;
    }

    public LSE<Curso> getCurso() {
        return curso;
    }

    public Horario[][] getHorario() {
        return horario;
    }

    public Horario obtenerHorario(int fila, int columna) {
        return horario[fila][columna];
    }

    public String getCodigoSalon() {
        return codigoSalon;
    }

    public void setCodigoSalon(String codigoSalon) {
        this.codigoSalon = codigoSalon;
    }

}
