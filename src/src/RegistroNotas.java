package src;

import java.io.Serializable;

public class RegistroNotas implements Serializable {

    public static final double NOTA_CORTE_UNO = 0.30;
    public static final double NOTA_CORTE_DOS = 0.30;
    public static final double NOTA_CORTE_TRES = 0.40;
    private Estudiante estudiante;
    private double notaUno;
    private double notaDos;
    private double notaTres;
    private double notaFinal;

    public RegistroNotas(Estudiante estudiante) {
        this.notaUno = 0.0;
        this.notaDos = 0.0;
        this.notaTres = 0.0;
        this.estudiante = estudiante;
        this.notaFinal = notaFinalCalculo(notaUno, notaDos, notaTres, notaFinal);
    }

    public double getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(double notaTres) {
        this.notaTres = notaTres;
    }

    public double getNotaUno() {
        return notaUno;
    }

    public void setNotaUno(double notaUno) {
        this.notaUno = notaUno;
    }

    public double getNotaDos() {
        return notaDos;
    }

    public void setNotaDos(double notaDos) {
        this.notaDos = notaDos;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public static double notaFinalCalculo(double notaUno, double notaDos, double notaTres, double notaFinal) {

        notaUno = notaUno * NOTA_CORTE_UNO;
        notaDos = notaDos * NOTA_CORTE_DOS;
        notaTres = notaTres * NOTA_CORTE_TRES;

        notaFinal = notaUno + notaDos + notaTres;

        return notaFinal;

    }

    @Override
    public String toString() {
        return notaUno + "";
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

}
