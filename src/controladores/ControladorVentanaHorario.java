package controladores;

import src.Horario;
import src.Salon;

public class ControladorVentanaHorario {

    Salon salon;

    public ControladorVentanaHorario(Salon salon) {
        this.salon = salon;
    }

    public Horario obtenerHora(int i, int j) {
        return salon.obtenerHorario(i, j);
    }

}
