package src;

import excepciones.DuplicadoDocumentoExeption;
import excepciones.DuplicadoNumeroCelularExeption;
import singleton.Singleton;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import util.LSE;

public class Universidad implements Serializable {

    //ATRIBUTOS
    Singleton singleton;
    public static int codigoEstudiante;
    public static int codigoDocente;
    public static int codigoSalon;
    public static int codigoCurso;
    public static int codigoHerramienta;
    public static int codigoCarrera;
    public static int codigoMaterias;
    public static LSE<Salon> salones;
    private static LSE<Materia> materias;
    public static LSE<Herramienta> herramientas;
    public static LSE<Persona> personas;
    public static LSE<Curso> cursos;
    public static LSE<Carrera> carreras;
    public static Laboratorio[][] laboratorios;
    public static String ADMINISTRADOR_GENERAL = "admin";
    public static String CONTRASENA_ADMIN_GENERAL = "123";
    public static String ADMINISTRADOR_LABORAORIO = "adminlab";
    public static String CONTRASENA_ADMIN_LABORAORIO = "456";

    //CONSTRUCTOR
    public Universidad() {
        this.salones = Singleton.getINSTANCE().getSalones();
        this.personas = Singleton.getINSTANCE().getPersonas();
        this.cursos = Singleton.getINSTANCE().getCursos();
        this.carreras = Singleton.getINSTANCE().getCarreras();
        this.laboratorios = Singleton.getINSTANCE().getDatosLaboratorios();
        this.materias = Singleton.getINSTANCE().getMaterias();
        this.herramientas = Singleton.getINSTANCE().getHerramienta();
        this.codigoEstudiante = Singleton.getINSTANCE().getCodigosEstudiante();
        this.codigoSalon = Singleton.getINSTANCE().getCodigoSalon();
        this.codigoDocente = Singleton.getINSTANCE().getCodigosDocente();
        this.codigoCurso = Singleton.getINSTANCE().getCodigoCurso();
        this.codigoCarrera = Singleton.getINSTANCE().getCodigoCarrera();
        this.codigoMaterias = Singleton.getINSTANCE().getCodigoMaterias();
        this.codigoHerramienta = Singleton.getINSTANCE().getCodigoHerramientas();
        initlaboratorios();
    }

    // GETTERS AND SETTERS
    public LSE<Herramienta> getHerramientas() {
        return herramientas;
    }

    public LSE<Salon> getSalones() {
        return salones;
    }

    public LSE<Materia> getMaterias() {
        return materias;
    }

    public LSE<Persona> getPersonas() {
        return personas;
    }

    public LSE<Curso> getCursos() {
        return cursos;
    }

    public LSE<Carrera> getCarreras() {
        return carreras;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public int getCodigoMaterias() {
        return codigoMaterias;
    }

    // INICIALIZAR LABORATORIOS
    private void initlaboratorios() {
        for (int i = 0; i < laboratorios.length; i++) {
            for (int j = 0; j < laboratorios[i].length; j++) {
                if (laboratorios[i][j] == null) {
                    laboratorios[i][j] = new Laboratorio();
                }
            }
        }
    }

    //METODO LOGIN
    public int login(Usuario usuario) {
        int numero = 1;
        if (usuario.getCodigoUniversitario().equals(ADMINISTRADOR_GENERAL)
                && usuario.getContrasena().equals(CONTRASENA_ADMIN_GENERAL)) {
            numero = 2;
        } else if (usuario.getCodigoUniversitario().equals(ADMINISTRADOR_LABORAORIO)
                && usuario.getContrasena().equals(CONTRASENA_ADMIN_LABORAORIO)) {
            numero = 3;
        } else if (buscarPersonaCuenta(usuario) instanceof Docente) {
            numero = 4;
        } else if (buscarPersonaCuenta(usuario) instanceof Estudiante) {
            numero = 5;
        }
        return numero;
    }

    //METODO RETORNAR POSICIONES
    public Curso retornarCursoPos(int i) {
        return cursos.obtenerDatoIndice(i);
    }

    public Laboratorio obtenerLaboratorio(int fila, int columna) {
        return laboratorios[fila][columna];
    }

    public Carrera retornarCarreraPos(int i) {
        return carreras.obtenerDatoIndice(i);
    }

    //METODOS SALONES
    public Salon buscarSalon(String codigoSalon) {
        Salon salon = null;
        for (int i = 0; i < salones.getSize(); i++) {
            if (salones.obtenerDatoIndice(i).getCodigoSalon().equals(codigoSalon)) {
                salon = salones.obtenerDatoIndice(i);
            }
        }
        return salon;
    }

    public boolean registrarSalon(Salon salon) {
        boolean registro = false;
        Salon buscar = buscarSalon(salon.getCodigoSalon());
        if (buscar == null) {
            salones.agregarNodo(salon);
            registro = true;
            serializarListaSalones();
            codigoSalon++;
            serializarCodigoSalon();
        }
        return registro;
    }

    public boolean eliminarSalon(String codigoSalon) {
        boolean eliminado = false;
        for (int i = 0; i < salones.getSize(); i++) {
            if (salones.obtenerDatoIndice(i).getCodigoSalon().equals(codigoSalon)) {
                salones.eliminar(i);
                eliminado = true;
                serializarListaSalones();
            }
        }
        return eliminado;
    }

    //METODOS CURSOS
    public Curso buscarCursoMateria(String codigoMateria) {
        Curso curso = null;
        for (int i = 0; i < cursos.getSize(); i++) {
            if (cursos.obtenerDatoIndice(i).getMateria().getCodigoMateria().equals(codigoMateria)) {
                curso = cursos.obtenerDatoIndice(i);
            }
        }
        return curso;
    }

    public Curso buscarCurso(String CodigoCurso) {
        Curso curso = null;
        for (int i = 0; i < cursos.getSize(); i++) {
            if (cursos.obtenerDatoIndice(i).getCodigoCurso().equals(CodigoCurso)) {
                curso = cursos.obtenerDatoIndice(i);
            }
        }
        return curso;
    }

    public boolean buscarCursoDocente(Docente docente, Curso curso) {
        boolean cursoDocente = false;
        for (int i = 0; i < cursos.getSize(); i++) {
            if (cursos.obtenerDatoIndice(i).getNombreCurso().equals(curso.getNombreCurso()) && cursos.obtenerDatoIndice(i).getDocente().getCedula().equals(docente.getCedula())) {
                cursoDocente = true;
            }
        }
        return cursoDocente;
    }

    public boolean buscarCursoEstudiante(Persona estudiante, Curso curso) {
        boolean cursoEstudiante = false;
        for (int i = 0; i < cursos.obtenerDatoIndice(i).getRegistroNotas().getSize(); i++) {
            if (cursos.obtenerDatoIndice(i).getNombreCurso().equals(curso.getNombreCurso()) && personas.obtenerDatoIndice(i).getCedula().equals(estudiante.getCedula())) {
                cursoEstudiante = true;
            }
        }
        return cursoEstudiante;
    }

    public boolean registrarCurso(Curso curso) {
        boolean registro = false;
        Curso buscarCursomateria = buscarCursoMateria(curso.getMateria().getCodigoMateria());
        if (buscarCursomateria == null) {
            cursos.agregarNodo(curso);
            serializarListaCursos();
            codigoCurso++;
            serializarCodigoCurso();
            registro = true;
        }
        return registro;
    }

    public boolean eliminarCurso(String nombreCurso) {
        boolean eliminado = false;
        for (int i = 0; i < cursos.getSize(); i++) {
            if (cursos.obtenerDatoIndice(i).getNombreCurso().equals(nombreCurso)) {
                cursos.eliminar(i);
                eliminado = true;
                serializarListaCursos();
            }
        }
        return eliminado;
    }

    public boolean modificarCurso(String nombreCurso, String codigoCurso,
            Persona docente, Materia materia, int intensidadHoraria) {
        boolean modifico = false;
        Curso curso = buscarCurso(codigoCurso);
        if (curso != null) {
            curso.setNombreCurso(nombreCurso);
            curso.setCodigoCurso(codigoCurso);
            curso.setDocente(docente);
            curso.setMateria(materia);
            curso.setIntensidadHoraria(intensidadHoraria);
            modifico = true;
            serializarListaCursos();
        }
        return modifico;
    }

    //METODOS MATERIAS
    public Materia buscarMateria(String codigoMateria) {
        Materia materia = null;
        for (int i = 0; i < materias.getSize(); i++) {
            if (materias.obtenerDatoIndice(i).getCodigoMateria().equals(codigoMateria)) {
                materia = materias.obtenerDatoIndice(i);
            }
        }
        return materia;
    }

    public Materia buscarMateriaNombre(String nombre) {
        Materia materia = null;
        for (int i = 0; i < materias.getSize(); i++) {
            if (materias.obtenerDatoIndice(i).getNombreMateria().equals(nombre)) {
                materia = materias.obtenerDatoIndice(i);
            }
        }
        return materia;
    }

    public boolean registrarMateria(Materia materia) {
        boolean registro = false;
        Materia buscarMateria = buscarMateria(materia.getNombreMateria());
        if (buscarMateria == null) {
            materias.agregarNodo(materia);
            registro = true;
            serializarListaMaterias();
            codigoMaterias++;
            serializarCodigoMateria();
        }
        return registro;
    }

    public boolean eliminarMateria(String codigoMateria) {
        boolean eliminado = false;
        for (int i = 0; i < materias.getSize(); i++) {
            if (materias.obtenerDatoIndice(i).getCodigoMateria().equals(codigoMateria)) {
                materias.eliminar(i);
                eliminado = true;
                serializarListaMaterias();
            }
        }
        return eliminado;
    }

    public boolean modificarMateria(String nombreMateria, String codigoMateria) {
        boolean modifico = false;
        Materia materia = buscarMateria(codigoMateria);
        if (materia != null) {
            materia.setNombreMateria(nombreMateria);
            materia.setCodigoMateria(codigoMateria);
            modifico = true;
            serializarListaMaterias();
        }
        return modifico;
    }

    //METODOS ESTUDIANTE
    public int registrarEstudiante(Estudiante estudiante) throws DuplicadoNumeroCelularExeption, DuplicadoDocumentoExeption {
        int registro = 1;
        Persona buscarCedula = buscarCedula(estudiante.getCedula());
        Persona buscarNumeroCelular = buscarNumeroCelular(estudiante.getNumeroCelular());
        if (buscarCedula != null) {
            registro = 1;
            throw new DuplicadoNumeroCelularExeption();
        }
        if (buscarNumeroCelular != null) {
            registro = 3;
            throw new DuplicadoDocumentoExeption();
        } else {
            if (buscarNumeroCelular == null) {
                personas.agregarNodo(estudiante);
                codigoEstudiante++;
                serializarCodigoEstudiante();
                serializarListaPersonas();
                registro = 2;
            }
        }
        return registro;
    }

    public boolean eliminarEstudiante(String cedula) {
        boolean eliminado = false;
        for (int i = 0; i < personas.getSize(); i++) {
            if (personas.obtenerDatoIndice(i) instanceof Estudiante
                    && personas.obtenerDatoIndice(i).getCedula().equals(cedula)) {
                personas.eliminar(i);
                eliminado = true;
                serializarListaPersonas();
            }
        }
        return eliminado;
    }

    public boolean modificarEstudiante(Carrera carrera, String nombre,
            String apellido, String cedula, String numeroCelular, String edad,
            String direccion, String entidadSalud, String codigoUniversitario,
            String correo, Usuario usuario) {
        boolean modifico = false;
        Persona persona = buscarCedula(cedula);
        if (persona instanceof Estudiante) {
            Estudiante estu = (Estudiante) persona;
            estu.setCarrera(carrera);
            estu.setNombre(nombre);
            estu.setApellido(apellido);
            estu.setNumeroCelular(numeroCelular);
            estu.setEdad(edad);
            estu.setDireccion(direccion);
            estu.setEntidadSalud(entidadSalud);
            estu.setCorreo(correo);
            estu.getUsuario().setContrasena(usuario.getContrasena());
            modifico = true;
            serializarListaPersonas();
        }
        return modifico;
    }

    //METODOS CARRERA
    public Carrera buscarCarrera(String codigoCarrera) {
        Carrera carrera = null;
        for (int i = 0; i < carreras.getSize(); i++) {
            if (carreras.obtenerDatoIndice(i).getCodigoCarrera().equals(codigoCarrera)) {
                carrera = carreras.obtenerDatoIndice(i);
            }
        }
        return carrera;
    }

    public boolean registrarCarrera(Carrera carrera) {
        boolean registro = false;
        Carrera buscarCarrera = buscarCarrera(carrera.getNombreCarrera());
        if (buscarCarrera == null) {
            carreras.agregarNodo(carrera);
            serializarListaCarreras();
            codigoCarrera++;
            registro = true;
            serializarCodigoCarrera();
        }
        return registro;
    }

    public boolean eliminarCarrera(String codigoCarrera) {
        boolean eliminado = false;
        for (int i = 0; i < carreras.getSize(); i++) {
            if (carreras.obtenerDatoIndice(i).getCodigoCarrera().equals(codigoCarrera)) {
                carreras.eliminar(i);
                eliminado = true;
                serializarListaCarreras();
            }
        }
        for (int i = 0; i < personas.getSize(); i++) {
            if (personas.obtenerDatoIndice(i) instanceof Estudiante) {
                Estudiante estudiante = (Estudiante) personas.obtenerDatoIndice(i);
                if (estudiante.getCarrera().getCodigoCarrera().equals(codigoCarrera)) {
                    Carrera auxiliarCarrera = new Carrera("Sin carrera", "");
                    estudiante.setCarrera(auxiliarCarrera);
                    serializarListaPersonas();
                }
            }
        }
        return eliminado;
    }

    public boolean modificarCarrera(String nombreCarrera, String codigoCarrera) {
        boolean modifico = false;
        Carrera carrera = buscarCarrera(codigoCarrera);
        if (carrera != null) {
            carrera.setNombreCarrera(nombreCarrera);
            carrera.setCodigoCarrera(codigoCarrera);
            modifico = true;
            serializarListaCarreras();
        }
        return modifico;
    }

    //METODOS BUSCADORES GENERAL
    public Persona buscarPersonaCodigo(String codigo) {
        Persona persona = null;
        for (int i = 0; i < personas.getSize(); i++) {
            if (personas.obtenerDatoIndice(i).getCodigoUniversitario().equals(codigo)) {
                persona = personas.obtenerDatoIndice(i);
            }
        }
        return persona;
    }

    public Persona buscarEstudianteCuenta(Usuario usuario) {
        Persona persona = null;
        for (int i = 0; i < personas.getSize(); i++) {
            if (personas.obtenerDatoIndice(i) instanceof Estudiante && personas.obtenerDatoIndice(i).getCodigoUniversitario().equals(usuario.getCodigoUniversitario())
                    && personas.obtenerDatoIndice(i).getUsuario().getContrasena().equals(usuario.getContrasena())) {
                persona = personas.obtenerDatoIndice(i);
            }
        }
        return persona;
    }

    public Persona buscarDocenteCuenta(Usuario usuario) {
        Persona persona = null;
        for (int i = 0; i < personas.getSize(); i++) {
            if (personas.obtenerDatoIndice(i) instanceof Docente && personas.obtenerDatoIndice(i).getCodigoUniversitario().equals(usuario.getCodigoUniversitario())
                    && personas.obtenerDatoIndice(i).getUsuario().getContrasena().equals(usuario.getContrasena())) {
                persona = personas.obtenerDatoIndice(i);
            }
        }
        return persona;
    }

    public Persona buscarPersonaCuenta(Usuario usuario) {
        Persona persona = null;
        for (int i = 0; i < personas.getSize(); i++) {
            if (personas.obtenerDatoIndice(i).getCodigoUniversitario().equals(usuario.getCodigoUniversitario())
                    && personas.obtenerDatoIndice(i).getUsuario().getContrasena().equals(usuario.getContrasena())) {
                persona = personas.obtenerDatoIndice(i);
            }
        }
        return persona;
    }

    public Persona buscarNumeroCelular(String numeroCelular) {
        Persona persona = null;
        for (int i = 0; i < personas.getSize(); i++) {
            if (personas.obtenerDatoIndice(i).getNumeroCelular().equals(numeroCelular)) {
                persona = personas.obtenerDatoIndice(i);
            }
        }
        return persona;
    }

    public Persona buscarCedula(String documento) {
        Persona persona = null;
        for (int i = 0; i < personas.getSize(); i++) {
            if (personas.obtenerDatoIndice(i).getCedula().equals(documento)) {
                persona = personas.obtenerDatoIndice(i);
            }
        }
        return persona;
    }

    public RegistroNotas buscarCalificacion(Curso curso, String codigo) {

        RegistroNotas aux = null;

        for (int i = 0; i < curso.getRegistroNotas().getSize(); i++) {
            if (curso.getRegistroNotas().obtenerDatoIndice(i).getEstudiante().getCodigoUniversitario().equals(codigo)) {
                aux = curso.getRegistroNotas().obtenerDatoIndice(i);
            }

        }
        return aux;

    }

    //METODOS DOCENTE
    public int registrarDocente(Docente docente) throws DuplicadoNumeroCelularExeption, DuplicadoDocumentoExeption {
        int registro;
        Persona buscarCedula = buscarCedula(docente.getCedula());
        Persona buscarNumeroCelular = buscarNumeroCelular(docente.getNumeroCelular());
        if (buscarCedula != null) {
            registro = 1;
            throw new DuplicadoNumeroCelularExeption();
        }
        if (buscarNumeroCelular != null) {
            registro = 3;
            throw new DuplicadoDocumentoExeption();
        } else {
            Persona persona;
            persona = new Docente(docente.getNombre(),
                    docente.getApellido(), docente.getCedula(),
                    docente.getNumeroCelular(), docente.getEdad(), docente.getDireccion(),
                    docente.getEntidadSalud(), docente.getCodigoUniversitario(), docente.getCorreo(), docente.getUsuario());
            personas.agregarNodo(persona);
            serializarListaPersonas();
            codigoDocente++;
            serializarCodigoDocente();
            registro = 2;
        }
        return registro;
    }

    public boolean eliminarDocente(String cedula) {
        boolean eliminado = false;
        for (int i = 0; i < personas.getSize(); i++) {
            if (personas.obtenerDatoIndice(i) instanceof Docente
                    && personas.obtenerDatoIndice(i).getCedula().equals(cedula)) {
                personas.eliminar(i);
                eliminado = true;
                serializarListaPersonas();
                serializarCodigoDocente();
            }
        }
        return eliminado;
    }

    public boolean modificarDocente(String nombre, String apellido,
            String cedula, String numeroCelular, String edad,
            String direccion, String entidadSalud, String codigoUniversitario,
            String correo, Usuario usuario) {
        boolean modifico = false;
        Persona persona = buscarCedula(cedula);
        if (persona instanceof Docente) {
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setNumeroCelular(numeroCelular);
            persona.setEdad(edad);
            persona.setDireccion(direccion);
            persona.setEntidadSalud(entidadSalud);
            persona.setCorreo(correo);
            persona.getUsuario().setContrasena(usuario.getContrasena());
            modifico = true;
            serializarListaPersonas();
        }
        return modifico;
    }

    //METODOS HERRAMIENTAS:
    public Persona buscarPersonaCodigoLab(String codigo, int fila, int columna) {
        Persona persona = null;
        for (int i = 0; i < laboratorios[fila][columna].getEstudiantes().getSize(); i++) {
            if (laboratorios[fila][columna].getEstudiantes().obtenerDatoIndice(i).getCodigoUniversitario().equals(codigo)) {
                persona = laboratorios[fila][columna].getEstudiantes().obtenerDatoIndice(i);
            }
        }
        return persona;
    }

    public int buscarHerramientaCantidad(String nombre) {
        int contador = 0;
        for (int i = 0; i < herramientas.getSize(); i++) {
            if (herramientas.obtenerDatoIndice(i).getNombre().equals(nombre)) {
                contador++;
            }
        }
        return contador;
    }

    public Herramienta buscarHerramienta(String codigoHerramienta) {
        Herramienta herramienta = null;
        for (int i = 0; i < herramientas.getSize(); i++) {
            if (herramientas.obtenerDatoIndice(i).getCodigoHerramienta().equals(codigoHerramienta)) {
                herramienta = herramientas.obtenerDatoIndice(i);
            }
        }
        return herramienta;
    }

    public boolean registrarHerramienta(Herramienta herramienta) {
        boolean registro = false;
        Herramienta buscarHerramienta = buscarHerramienta(herramienta.getCodigoHerramienta());
        int buscarCantHerramientas = buscarHerramientaCantidad(herramienta.getNombre());
        if (buscarHerramienta == null) {
            if (buscarCantHerramientas < 2) {
                herramientas.agregarNodo(herramienta);
                codigoHerramienta++;
                serializarListaHerramientas();
                serializarCodigoHerramienta();
                registro = true;
            }
        }
        return registro;
    }

    public boolean eliminarHerramienta(String codigoHerramienta) {
        boolean eliminado = false;
        for (int i = 0; i < herramientas.getSize(); i++) {
            if (herramientas.obtenerDatoIndice(i).getCodigoHerramienta().equals(codigoHerramienta)) {
                herramientas.eliminar(i);
                eliminado = true;
                serializarListaHerramientas();
                serializarCodigoHerramienta();
            }
        }
        return eliminado;
    }

    //METODOS LABORATORIOS
    public void regLab(int fila, int col, Estudiante estudiante) {
        laboratorios[fila][col].regLab(estudiante);
        serializarLaboratorios();
    }

    public void registrarColaLaboraorio(int fila, int col, Estudiante estudiante) {
        laboratorios[fila][col].registrarCola(estudiante);
        serializarLaboratorios();
    }

    public void eliminarTodosLosEstudiante(int fila, int columna) {
        Laboratorio laboratorio = obtenerLaboratorio(fila, columna);
        laboratorio.eliminarTodosLosEstudiante();
        serializarLaboratorios();
        serializarListaHerramientas();
    }

    public void retirarTodasHerramientas(int fila, int columna) {
        Laboratorio laboratorio = obtenerLaboratorio(fila, columna);
        laboratorio.retirarTodasHerramientas();
    }

    public void eliminarTodosLosEstudianteEnCola(int fila, int columna) {
        Laboratorio laboratorio = obtenerLaboratorio(fila, columna);
        laboratorio.eliminarTodosLosEstudianteEnCola();
    }

    public boolean eliminarIngresoLaboratorio(String codigoUniversitario, int fila, int columna) {
        Laboratorio laboratorio = obtenerLaboratorio(fila, columna);
        if (laboratorio.eliminarEstudiante(codigoUniversitario)) {
            serializarListaHerramientas();
            serializarLaboratorios();
            return true;
        }
        return false;
    }

    public void deshabilitarLaboratorio(int fila, int columna) {
        laboratorios[fila][columna].setDisponibilidad(Laboratorio.DESHABILITADO);
        serializarLaboratorios();
    }

    public void habilitarLaboratorio(int fila, int columna) {
        laboratorios[fila][columna].setDisponibilidad(Laboratorio.DISPONIBLE);
        serializarLaboratorios();
    }

    public boolean registrarEstudiantePrestamo(Estudiante estudiante, Herramienta herramienta, int fila, int columna) {
        return laboratorios[fila][columna].registrarEstudiantePrestamo(estudiante, herramienta);
    }

    public void retirarHerramientaEstudiante(Herramienta herramienta, int fila, int columna) {
        laboratorios[fila][columna].retirarHerramientaEstudiante(herramienta);
        serializarListaHerramientas();
        serializarLaboratorios();
    }

//SERIALIZAR ELEMENTOS: 
    public static void serializarListaPersonas() {
        try {
            FileOutputStream archivo = new FileOutputStream("personas.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(personas);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarListaHerramientas() {
        try {
            FileOutputStream archivo = new FileOutputStream("herramientas.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(herramientas);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarListaCursos() {
        try {
            FileOutputStream archivo = new FileOutputStream("cursos.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(cursos);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarListaSalones() {
        try {
            FileOutputStream archivo = new FileOutputStream("salones.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(salones);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarListaCarreras() {
        try {
            FileOutputStream archivo = new FileOutputStream("carreras.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(carreras);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarLaboratorios() {
        try {
            FileOutputStream archivo = new FileOutputStream("laboratorios.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(laboratorios);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarListaMaterias() {
        try {
            FileOutputStream archivo = new FileOutputStream("materias.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(materias);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarCodigoDocente() {
        try {
            FileOutputStream archivo = new FileOutputStream("codigodocente.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(codigoDocente);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarCodigoSalon() {
        try {
            FileOutputStream archivo = new FileOutputStream("codigoSalon.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(codigoSalon);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarCodigoCurso() {
        try {
            FileOutputStream archivo = new FileOutputStream("codigoCurso.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(codigoCurso);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarCodigoCarrera() {
        try {
            FileOutputStream archivo = new FileOutputStream("codigoCarrera.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(codigoCarrera);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarCodigoEstudiante() {
        try {
            FileOutputStream archivo = new FileOutputStream("codigoestudiante.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(codigoEstudiante);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarCodigoMateria() {
        try {
            FileOutputStream archivo = new FileOutputStream("codigoMateria.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(codigoMaterias);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void serializarCodigoHerramienta() {
        try {
            FileOutputStream archivo = new FileOutputStream("codigoHerramienta.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(codigoHerramienta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
