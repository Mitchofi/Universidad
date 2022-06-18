package singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import src.Carrera;
import src.Curso;
import src.Herramienta;
import src.Laboratorio;
import src.Materia;
import src.Persona;
import util.LSE;
import src.Salon;
import src.Universidad;

public class Singleton {

    private static Singleton INSTANCE = new Singleton();
    private static Universidad universidad = new Universidad();
    private static Laboratorio[][] laboratorios;
    private static LSE<Salon> salones;
    private static LSE<Curso> cursos;
    private static LSE<Persona> personas;
    private static LSE<Carrera> carreras;
    private static LSE<Materia> materias;
    private static LSE<Herramienta> herramientas;
    private static int codigosEstudiante;
    private static int codigosDocente;
    private static int codigoSalon;
    private static int codigoMaterias;
    private static int codigoHerramientas;
    private static int codigoCurso;
    private static int codigoCarrera;

    private Singleton() {
        leerDatosPersonas();
        leerDatosLaboratorios();
        leerDatosCursos();
        leerDatosSalones();
        leerDatosCarreras();
        leerDatosHerramientas();
        leerDatosMaterias();
        leerCodigoCurso();
        leerCodigoSalon();
        leerCodigoCarrera();
        leerCodigosMateria();
        leerCodigosEstudiante();
        leerCodigosDocente();
        leerCodigosHerramienta();
    }

    //GETTERS
    public LSE<Herramienta> getHerramienta() {
        return herramientas;
    }

    public int getCodigoHerramientas() {
        return codigoHerramientas;
    }

    public LSE<Persona> getPersonas() {
        return personas;
    }

    public static int getCodigoMaterias() {
        return codigoMaterias;
    }

    public int getCodigoSalon() {
        return codigoSalon;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public int getCodigosEstudiante() {
        return codigosEstudiante;
    }

    public int getCodigosDocente() {
        return codigosDocente;
    }

    public LSE<Materia> getMaterias() {
        return materias;
    }

    public LSE<Salon> getSalones() {
        return salones;
    }

    public LSE<Curso> getCursos() {
        return cursos;
    }

    public LSE<Carrera> getCarreras() {
        return carreras;
    }

    public static Singleton getINSTANCE() {
        return INSTANCE;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public Laboratorio[][] getDatosLaboratorios() {
        return laboratorios;
    }
    
    //METODOS LEER ELEMENTOS
    public void leerDatosLaboratorios() {
        try {
            FileInputStream archivo = new FileInputStream("laboratorios.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            laboratorios = (Laboratorio[][]) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getStackTrace();
            laboratorios = new Laboratorio[3][6];
        }
    }

    private void leerDatosCursos() {
        try {
            FileInputStream archivo = new FileInputStream("cursos.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            cursos = (LSE<Curso>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getStackTrace();
            cursos = new LSE();
        }
    }

    private void leerDatosPersonas() {
        try {
            FileInputStream archivo = new FileInputStream("personas.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            personas = (LSE<Persona>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getStackTrace();
            personas = new LSE();
        }
    }

    private void leerDatosSalones() {
        try {
            FileInputStream archivo = new FileInputStream("salones.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            salones = (LSE<Salon>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getStackTrace();
            salones = new LSE();
        }
    }

    private void leerDatosHerramientas() {
        try {
            FileInputStream archivo = new FileInputStream("herramientas.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            herramientas = (LSE<Herramienta>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getStackTrace();
            herramientas = new LSE();
        }
    }

    private void leerDatosCarreras() {
        try {
            FileInputStream archivo = new FileInputStream("carreras.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            carreras = (LSE<Carrera>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getStackTrace();
            carreras = new LSE();
        }
    }

    private void leerCodigosEstudiante() {
        try {
            FileInputStream archivo = new FileInputStream("codigoEstudiante.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            codigosEstudiante = (int) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getStackTrace();
            codigosEstudiante = 0;
        }
    }

    private void leerCodigoCurso() {
        try {
            FileInputStream archivo = new FileInputStream("codigoCurso.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            codigoCurso = (int) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getStackTrace();
            codigoCurso = 0;
        }
    }

    private void leerCodigoSalon() {
        try {
            FileInputStream archivo = new FileInputStream("codigoSalon.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            codigoSalon = (int) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getStackTrace();
            codigoSalon = 0;
        }
    }

    private void leerCodigoCarrera() {
        try {
            FileInputStream archivo = new FileInputStream("codigoCarrera.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            codigoCarrera = (int) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getStackTrace();
            codigoCarrera = 0;
        }
    }

    private void leerCodigosDocente() {
        try {
            FileInputStream archivo = new FileInputStream("codigoDocente.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            codigosDocente = (int) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getStackTrace();
            codigosDocente = 0;
        }
    }

    private void leerCodigosMateria() {
        try {
            FileInputStream archivo = new FileInputStream("codigoMateria.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            codigoMaterias = (int) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getStackTrace();
            codigoMaterias = 0;
        }
    }

    private void leerDatosMaterias() {
        try {
            FileInputStream archivo = new FileInputStream("materias.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            materias = (LSE<Materia>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getStackTrace();
            materias = new LSE<>();
        }
    }

    private void leerCodigosHerramienta() {
        try {
            FileInputStream archivo = new FileInputStream("codigoHerramienta.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            codigoHerramientas = (int) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.getStackTrace();
            codigoHerramientas = 0;
        }
    }
}
