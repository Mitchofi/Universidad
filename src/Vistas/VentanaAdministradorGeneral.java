package Vistas;

import controladores.ControladorVentanaAdministradorGeneral;
import excepciones.DuplicadoDocumentoExeption;
import excepciones.DuplicadoNumeroCelularExeption;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.Carrera;
import src.Curso;
import src.Docente;
import src.Estudiante;
import src.Materia;
import src.Persona;
import src.Salon;
import src.Universidad;
import src.Usuario;

/**
 *
 * @author Acer
 */
public class VentanaAdministradorGeneral extends javax.swing.JFrame {

    DefaultTableModel modelo;

    VentanaLogin ventanaPrincipal;

    ControladorVentanaAdministradorGeneral controladorVentanaAdministrador;

    public VentanaAdministradorGeneral(VentanaLogin ventanaPrincipal) {
        initComponents();
        setLocationRelativeTo(this);
        this.modelo = new DefaultTableModel();
        this.ventanaPrincipal = ventanaPrincipal;
        this.controladorVentanaAdministrador = new ControladorVentanaAdministradorGeneral();
        inicializarDatos();
        cargarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLbAdministrador = new javax.swing.JLabel();
        jcomboBoxIntensidadHoraria = new javax.swing.JComboBox<>();
        jComboPersona = new javax.swing.JComboBox<>();
        jComboxCarrera = new javax.swing.JComboBox<>();
        jComboxDocente = new javax.swing.JComboBox<>();
        jComboxMateria = new javax.swing.JComboBox<>();
        jLText = new javax.swing.JLabel();
        txtNombreEstudiante = new javax.swing.JTextField();
        txtNombreDocente = new javax.swing.JTextField();
        jSeparadorNombre = new javax.swing.JSeparator();
        txtApellido = new javax.swing.JTextField();
        jSeparatorApellido = new javax.swing.JSeparator();
        txtCedula = new javax.swing.JTextField();
        jSeparatorCedula = new javax.swing.JSeparator();
        txtNumeroCelular = new javax.swing.JTextField();
        jSeparatorNumeroCelular = new javax.swing.JSeparator();
        txtCodigoDocente = new javax.swing.JTextField();
        jSeparatorDocente = new javax.swing.JSeparator();
        jSeparatorContrasena = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jSeparatorCursos = new javax.swing.JSeparator();
        txtContrasena = new javax.swing.JPasswordField();
        txtNumeroSalon = new javax.swing.JTextField();
        txtCupo = new javax.swing.JTextField();
        txtCodigoEstudiante = new javax.swing.JTextField();
        jRegistrar = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JLabel();
        jCerrar = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        jEliminar = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JLabel();
        jModificar = new javax.swing.JPanel();
        btnModificar = new javax.swing.JLabel();
        jAsignarCurso = new javax.swing.JPanel();
        btnAsignarCurso = new javax.swing.JLabel();
        jSeparatorDocente5 = new javax.swing.JSeparator();
        txtEdad = new javax.swing.JTextField();
        jSeparadorNombre1 = new javax.swing.JSeparator();
        txtDireccion = new javax.swing.JTextField();
        txtEntidadSalud = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jSeparatorNumeroCelular1 = new javax.swing.JSeparator();
        jSeparatorCursos1 = new javax.swing.JSeparator();
        jSeparatorCedula1 = new javax.swing.JSeparator();
        jSeparatorNumeroCelular2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbAdministrador.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLbAdministrador.setForeground(new java.awt.Color(0, 0, 0));
        jLbAdministrador.setText("BIENVENIDO ADMINISTRADOR GENERAL");
        jPanel1.add(jLbAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jcomboBoxIntensidadHoraria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Intensidad", "1", "2", "3", "4" }));
        jPanel1.add(jcomboBoxIntensidadHoraria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, -1));

        jComboPersona.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jComboPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Docentes", "Estudiantes", "Salones", "Materias", "Cursos", "Carreras" }));
        jComboPersona.setBorder(null);
        jComboPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboPersona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboPersonaItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 107, -1));

        jComboxCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carrera" }));
        jPanel1.add(jComboxCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 190, -1));

        jComboxDocente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cursos" }));
        jPanel1.add(jComboxDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 190, -1));

        jComboxMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Materia" }));
        jPanel1.add(jComboxMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, -1));

        jLText.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLText.setText("Seleccione el tipo que va a registrar: ");
        jPanel1.add(jLText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 16));

        txtNombreEstudiante.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtNombreEstudiante.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreEstudiante.setText("Nombre");
        txtNombreEstudiante.setBorder(null);
        txtNombreEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreEstudianteMousePressed(evt);
            }
        });
        jPanel1.add(txtNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 191, -1));

        txtNombreDocente.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtNombreDocente.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreDocente.setText("Nombre");
        txtNombreDocente.setBorder(null);
        txtNombreDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreDocenteMousePressed(evt);
            }
        });
        jPanel1.add(txtNombreDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 191, -1));
        jPanel1.add(jSeparadorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 191, 10));

        txtApellido.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(153, 153, 153));
        txtApellido.setText("Apellido");
        txtApellido.setBorder(null);
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 191, -1));
        jPanel1.add(jSeparatorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 191, 10));

        txtCedula.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(153, 153, 153));
        txtCedula.setText("Cedula");
        txtCedula.setToolTipText("");
        txtCedula.setBorder(null);
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 191, -1));
        jPanel1.add(jSeparatorCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 191, 10));

        txtNumeroCelular.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtNumeroCelular.setForeground(new java.awt.Color(153, 153, 153));
        txtNumeroCelular.setText("Numero de celular");
        txtNumeroCelular.setBorder(null);
        txtNumeroCelular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroCelularMousePressed(evt);
            }
        });
        jPanel1.add(txtNumeroCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 191, -1));
        jPanel1.add(jSeparatorNumeroCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 191, 10));

        txtCodigoDocente.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtCodigoDocente.setForeground(new java.awt.Color(153, 153, 153));
        txtCodigoDocente.setText("Codigo docente");
        txtCodigoDocente.setToolTipText("");
        txtCodigoDocente.setBorder(null);
        jPanel1.add(txtCodigoDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 191, -1));
        jPanel1.add(jSeparatorDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 191, 10));
        jPanel1.add(jSeparatorContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 191, 10));

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 1090, 120));
        jPanel1.add(jSeparatorCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 191, 10));

        txtContrasena.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(153, 153, 153));
        txtContrasena.setText("********");
        txtContrasena.setBorder(null);
        txtContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContrasenaMousePressed(evt);
            }
        });
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 191, -1));

        txtNumeroSalon.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtNumeroSalon.setForeground(new java.awt.Color(153, 153, 153));
        txtNumeroSalon.setText("Cupo");
        txtNumeroSalon.setBorder(null);
        jPanel1.add(txtNumeroSalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 191, -1));

        txtCupo.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtCupo.setForeground(new java.awt.Color(153, 153, 153));
        txtCupo.setText("Numero de salon");
        txtCupo.setToolTipText("");
        txtCupo.setBorder(null);
        txtCupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCupoMousePressed(evt);
            }
        });
        jPanel1.add(txtCupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 191, -1));

        txtCodigoEstudiante.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtCodigoEstudiante.setForeground(new java.awt.Color(153, 153, 153));
        txtCodigoEstudiante.setText("Codigo estudiante");
        txtCodigoEstudiante.setToolTipText("");
        txtCodigoEstudiante.setBorder(null);
        txtCodigoEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodigoEstudianteMousePressed(evt);
            }
        });
        jPanel1.add(txtCodigoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 191, -1));

        jRegistrar.setBackground(new java.awt.Color(51, 102, 255));

        btnRegistrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setToolTipText("");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jRegistrarLayout = new javax.swing.GroupLayout(jRegistrar);
        jRegistrar.setLayout(jRegistrarLayout);
        jRegistrarLayout.setHorizontalGroup(
            jRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jRegistrarLayout.setVerticalGroup(
            jRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 110, 30));

        jCerrar.setBackground(new java.awt.Color(51, 102, 255));

        btnCerrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setText("CERRAR SESION");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jCerrarLayout = new javax.swing.GroupLayout(jCerrar);
        jCerrar.setLayout(jCerrarLayout);
        jCerrarLayout.setHorizontalGroup(
            jCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCerrarLayout.createSequentialGroup()
                .addComponent(btnCerrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jCerrarLayout.setVerticalGroup(
            jCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, 110, 30));

        jEliminar.setBackground(new java.awt.Color(51, 102, 255));

        btnEliminar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setToolTipText("");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jEliminarLayout = new javax.swing.GroupLayout(jEliminar);
        jEliminar.setLayout(jEliminarLayout);
        jEliminarLayout.setHorizontalGroup(
            jEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jEliminarLayout.setVerticalGroup(
            jEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 110, -1));

        jModificar.setBackground(new java.awt.Color(51, 102, 255));

        btnModificar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModificar.setText("MODIFICAR");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jModificarLayout = new javax.swing.GroupLayout(jModificar);
        jModificar.setLayout(jModificarLayout);
        jModificarLayout.setHorizontalGroup(
            jModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jModificarLayout.setVerticalGroup(
            jModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 110, -1));

        jAsignarCurso.setBackground(new java.awt.Color(51, 102, 255));

        btnAsignarCurso.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnAsignarCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAsignarCurso.setText("LLENAR CURSO");
        btnAsignarCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignarCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAsignarCursoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jAsignarCursoLayout = new javax.swing.GroupLayout(jAsignarCurso);
        jAsignarCurso.setLayout(jAsignarCursoLayout);
        jAsignarCursoLayout.setHorizontalGroup(
            jAsignarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAsignarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jAsignarCursoLayout.setVerticalGroup(
            jAsignarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAsignarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jAsignarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 110, -1));
        jPanel1.add(jSeparatorDocente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 191, 10));

        txtEdad.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(153, 153, 153));
        txtEdad.setText("Edad");
        txtEdad.setBorder(null);
        txtEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEdadMousePressed(evt);
            }
        });
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 191, -1));
        jPanel1.add(jSeparadorNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 191, 10));

        txtDireccion.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(153, 153, 153));
        txtDireccion.setText("Direccion");
        txtDireccion.setBorder(null);
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionMousePressed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 191, -1));

        txtEntidadSalud.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtEntidadSalud.setForeground(new java.awt.Color(153, 153, 153));
        txtEntidadSalud.setText("Entidad de salud");
        txtEntidadSalud.setToolTipText("");
        txtEntidadSalud.setBorder(null);
        txtEntidadSalud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEntidadSaludMousePressed(evt);
            }
        });
        jPanel1.add(txtEntidadSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 191, -1));

        txtCorreo.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(153, 153, 153));
        txtCorreo.setText("Correo");
        txtCorreo.setBorder(null);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 191, -1));
        jPanel1.add(jSeparatorNumeroCelular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 191, 10));
        jPanel1.add(jSeparatorCursos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 191, 10));
        jPanel1.add(jSeparatorCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 191, 10));
        jPanel1.add(jSeparatorNumeroCelular2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 191, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1159, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarCursoMouseClicked
        switch (jComboPersona.getSelectedIndex()) {
            case 5:
                if (txtCodigoDocente.getText().equals("Codigo curso")) {
                    JOptionPane.showMessageDialog(null, "Selecciona el curso a asignar los estudiantes");
                } else {
                    String codigoCurso = txtCupo.getText();
                    Curso auxCurso = controladorVentanaAdministrador.buscarCurso(codigoCurso);
                    if (auxCurso != null) {
                        VentanaAsignarCursoEstudiante_1 ventanaAsignarCursoEstudiante = new VentanaAsignarCursoEstudiante_1(ventanaPrincipal, auxCurso, this);
                        ventanaAsignarCursoEstudiante.setVisible(true);
                        this.dispose();
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Debes seleccionar el curso que quieres llenar");
                    }
                }
        }
    }//GEN-LAST:event_btnAsignarCursoMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        switch (jComboPersona.getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Por favor selecciona un tipo distinto");
            case 1:
                if (txtCodigoDocente.getText().equals("123") || txtCodigoDocente.equals("456")) {
                    JOptionPane.showMessageDialog(null, "Ya hay un usuario registrado con ese codigo");
                } else {
                    if (txtNombreDocente.getText().equals("Nombre docente")
                            || txtNombreDocente.getText().isEmpty()
                            || txtApellido.getText().equals("Apellido")
                            || txtApellido.getText().isEmpty()
                            || txtCedula.getText().equals("Cedula")
                            || txtCedula.getText().isEmpty()
                            || txtNumeroCelular.getText().equals("Numero celular")
                            || txtNumeroCelular.getText().isEmpty()
                            || txtEdad.getText().equals("Edad")
                            || txtEdad.getText().isEmpty()
                            || txtDireccion.getText().equals("Edad")
                            || txtEntidadSalud.getText().equals("Entidad de salud")
                            || txtEntidadSalud.getText().isEmpty()
                            || txtCorreo.getText().equals("Entidad de salud")
                            || txtCorreo.getText().isEmpty()
                            || String.valueOf(txtContrasena.getPassword()).equals("********")
                            || String.valueOf(txtContrasena.getPassword()).isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor rellena todos los datos");
                    } else {
                        String codigoDocente = txtCodigoDocente.getText();
                        String nombre = txtNombreDocente.getText();
                        String apellido = txtApellido.getText();
                        String cedula = txtCedula.getText();
                        String numeroCelular = txtNumeroCelular.getText();
                        String edad = txtEdad.getText();
                        String direccion = txtDireccion.getText();
                        String entidadSalud = txtEntidadSalud.getText();
                        String correo = txtCorreo.getText();
                        String contrasena = String.valueOf(txtContrasena.getPassword());
                        Usuario usuario = new Usuario(codigoDocente, contrasena);
                        if (controladorVentanaAdministrador.modificarDocente(nombre, apellido, cedula, numeroCelular, edad, direccion, entidadSalud, codigoDocente, correo, usuario)) {
                            JOptionPane.showMessageDialog(null, "El docente con la cedula: " + cedula + " Se modifico correctamente");
                            predeterminadoDocente();
                        } else {
                            JOptionPane.showMessageDialog(null, "El docente con la cedula: " + cedula + " No se pudo modificar revisa los datos");
                        }
                    }
                    cargarTablaDocente();
                }
                break;

            case 2:
                if (txtCodigoDocente.getText().equals("123") || txtCodigoDocente.equals("456")) {
                    JOptionPane.showMessageDialog(null, "Ya hay un usuario registrado con ese codigo");
                } else {
                    if (txtNombreEstudiante.getText().equals("Nombre estudiante")
                            || txtApellido.getText().equals("Apellido")
                            || txtCedula.getText().equals("Cedula")
                            || txtNumeroCelular.getText().equals("Numero celular")
                            || txtCodigoEstudiante.getText().equals("Codigo estudiante")
                            || String.valueOf(txtContrasena.getPassword()).equals("********")
                            || jComboxCarrera.getSelectedItem().equals("Carrera")
                            || txtNombreEstudiante.getText().isEmpty()
                            || txtApellido.getText().isEmpty()
                            || txtCedula.getText().isEmpty()
                            || txtNumeroCelular.getText().isEmpty()
                            || txtCodigoEstudiante.getText().isEmpty()
                            || String.valueOf(txtContrasena.getPassword()).isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor rellena todos los datos");
                    } else {
                        String codigoEstudiante = txtCodigoEstudiante.getText();
                        String nombre = txtNombreEstudiante.getText();
                        String apellido = txtApellido.getText();
                        String cedula = txtCedula.getText();
                        String numeroCelular = txtNumeroCelular.getText();
                        String edad = txtEdad.getText();
                        String direccion = txtDireccion.getText();
                        String entidadSalud = txtEntidadSalud.getText();
                        String correo = txtCorreo.getText();
                        String contrasena = String.valueOf(txtContrasena.getPassword());
                        String carrera = String.valueOf(jComboxCarrera.getSelectedItem());
                        Carrera auxCarrera = controladorVentanaAdministrador.buscarCarrera(carrera);
                        Usuario usuario = new Usuario(codigoEstudiante, contrasena);
                        if (controladorVentanaAdministrador.modificarEstudiante(auxCarrera, nombre, apellido, cedula, numeroCelular, edad, direccion, entidadSalud, codigoEstudiante, correo, usuario)) {
                            JOptionPane.showMessageDialog(null, "El estudiante con la cedula: " + cedula + " Se modifico correctamente");
                            predeterminadoEstudiante();
                        } else {
                            JOptionPane.showMessageDialog(null, "El estudiante con la cedula: " + cedula + " No se pudo modificar revisa los datos");
                        }
                    }
                    cargarTablaEstudiantes();
                }
                break;
            case 4:
                if (txtNombreDocente.getText().equals("Nombre materia") || txtNombreDocente.getText().isEmpty()
                        || txtCodigoDocente.getText().equals("Codigo materia") || txtCodigoDocente.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor rellena todos los datos");
                } else {
                    String nombreMateria = txtNombreDocente.getText();
                    String codigoMaeria = txtCodigoDocente.getText();
                    if (controladorVentanaAdministrador.modificarMateria(nombreMateria, codigoMaeria)) {
                        JOptionPane.showMessageDialog(null, "La materia con el codigo: " + nombreMateria + " Se modifico correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "La materia con el codigo: " + nombreMateria + " No se pudo modificar revisa los datos");
                    }
                }
                cargarTablaMateria();
                break;
            case 5:
                if (txtNombreDocente.getText().equals("Nombre curso") || jComboxDocente.getSelectedItem().equals("Codigo docente")
                        || jComboxMateria.getSelectedItem().equals("Codigo materia") || txtCupo.getText().equals("Codigo curso")) {
                    JOptionPane.showMessageDialog(null, "Por favor rellena todos los datos");
                } else {
                    String nombreCurso = txtNombreDocente.getText();
                    String codigoCurso = txtCupo.getText();
                    String codigoMateria = String.valueOf(jComboxMateria.getSelectedItem());
                    Materia auxMateria = controladorVentanaAdministrador.buscarMateria(codigoMateria);
                    String codigoDocente = String.valueOf(jComboxDocente.getSelectedItem());
                    Persona auxDocente = controladorVentanaAdministrador.buscarPersonaCodigo(codigoDocente);
                        int intensidadHoraria = Integer.parseInt(String.valueOf(jcomboBoxIntensidadHoraria.getSelectedItem()));
                    if (auxDocente instanceof Docente) {
                        if (controladorVentanaAdministrador.modificarCurso(nombreCurso, codigoCurso, auxDocente, auxMateria, intensidadHoraria)) {
                            JOptionPane.showMessageDialog(null, "El curso con el codigo: " + codigoCurso + " Se modifico correctamente");
                            predeterminadoCurso();
                        } else {
                            JOptionPane.showMessageDialog(null, "El curso con el codigo: " + codigoCurso + " No se pudo modificar revisa los datos");
                        }
                    }
                    cargarTablaCursos();
                }
                break;
            case 6:
                if (txtNombreDocente.getText().equals("Nombre carrera") || txtNombreDocente.getText().isEmpty()
                        || txtCodigoDocente.getText().equals("Codigo carrera") || txtCodigoDocente.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor rellena todos los datos");
                } else {
                    String nombreCarrera = txtNombreDocente.getText();
                    String codigoCarrera = txtCodigoDocente.getText();
                    if (controladorVentanaAdministrador.modificarCarrera(nombreCarrera, codigoCarrera)) {
                        JOptionPane.showMessageDialog(null, "La materia con el codigo: " + nombreCarrera + " Se modifico correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "La materia con el codigo: " + codigoCarrera + " No se pudo modificar revisa los datos");
                    }
                }
                cargarTablaCarreras();
                break;
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        switch (jComboPersona.getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Por favor selecciona un tipo distinto");
            case 1:
                if (txtCedula.getText().equals("Cedula ") || txtCedula.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor rellena el dato de documento");
                } else {
                    String cedula = txtCedula.getText();
                    boolean eliminar = controladorVentanaAdministrador.eliminarDocente(cedula);
                    if (eliminar == true) {
                        JOptionPane.showMessageDialog(null, "El usuario con la cedula: " + cedula + " fue eliminado correctamente");
                        predeterminadoDocente();
                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario con la cedula: " + cedula + " no pudo ser elimnado");
                    }
                    cargarTablaDocente();
                }
                break;

            case 2:
                if (txtCedula.getText().equals("Cedula") || txtCedula.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor rellena el dato de documento");
                } else {
                    String cedula = txtCedula.getText();
                    if (controladorVentanaAdministrador.eliminarEstudiante(cedula)) {
                        JOptionPane.showMessageDialog(null, "El usuario con la cedula: " + cedula + " fue eliminado correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario con la cedula: " + cedula + " no pudo ser elimnado");
                    }
                    cargarTablaEstudiantes();
                }
                break;
            case 3:
                if (txtNumeroSalon.getText().equals("Numero de salon") || txtNumeroSalon.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor selecciona/ingresa el numero de salon a eliminar");
                } else {
                    String SalonNumero = txtNumeroSalon.getText();
                    if (controladorVentanaAdministrador.eliminarSalon(SalonNumero)) {
                        JOptionPane.showMessageDialog(null, "El Salon con el numero: " + SalonNumero + " fue eliminado correctamente");
                        predeterminadoSalon();
                    } else {
                        JOptionPane.showMessageDialog(null, "El Salon con el numero: " + SalonNumero + " no pudo ser elimnado");
                        predeterminadoSalon();
                    }
                    cargarTablaSalones();
                }
                break;
            case 4:
                if (txtNombreDocente.getText().equals("Nombre materia") || txtNombreDocente.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor selecciona el curso a eliminar");
                } else {
                    String nombreMateria = txtNombreDocente.getText();
                    String codigoMateria = txtCodigoDocente.getText();
                    if (controladorVentanaAdministrador.eliminarMateria(codigoMateria)) {
                        JOptionPane.showMessageDialog(null, "La materia con el nombre de: " + nombreMateria + " fue eliminado correctamente");
                        predeterminadoCurso();
                    } else {
                        JOptionPane.showMessageDialog(null, "La materia con el nombre de: " + nombreMateria + " no pudo ser elimnado");
                        predeterminadoMateria();
                    }
                    cargarTablaMateria();
                }
                break;

            case 5:
                if (txtNombreDocente.getText().equals("Nombre curso") || txtNombreDocente.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor selecciona/ingresa el nombre del curso a eliminar");
                } else {
                    String nombreCurso = txtNombreDocente.getText();
                    if (controladorVentanaAdministrador.eliminarCurso(nombreCurso)) {
                        JOptionPane.showMessageDialog(null, "El curso con el nombre de: " + nombreCurso + " fue eliminado correctamente, "
                                + "recuerda cambiar el curso del docente ");
                        predeterminadoCurso();
                    } else {
                        JOptionPane.showMessageDialog(null, "El curso con el nombre de: " + nombreCurso + " no pudo ser elimnado");
                        predeterminadoCurso();
                    }
                    cargarTablaCursos();
                }
                break;

            case 6:
                if (txtNombreDocente.getText().equals("Nombre carrera") || txtNombreDocente.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor selecciona/ingresa el nombre del curso a eliminar");
                } else {
                    String codigoCarrera = txtCodigoDocente.getText();
                    String nombreCarrera = txtNombreDocente.getText();
                    if (controladorVentanaAdministrador.eliminarCarrera(codigoCarrera)) {
                        JOptionPane.showMessageDialog(null, "La carrera con el nombre de: " + nombreCarrera + " fue eliminado correctamente.");
                        predeterminadoCarrera();
                    } else {
                        JOptionPane.showMessageDialog(null, "La carrera con el nombre de: " + nombreCarrera + " no pudo ser elimnado.");
                        predeterminadoCarrera();
                    }
                    cargarTablaCarreras();
                }
                break;
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        ventanaPrincipal.predeterminado();
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        switch (jComboPersona.getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Por favor selecciona un tipo distinto");
                break;
            case 1:
                if (txtCodigoDocente.getText().equals("123") || txtCodigoDocente.equals("456")) {
                    JOptionPane.showMessageDialog(null, "Ya hay un usuario registrado con ese codigo");
                } else {
                    if (txtNombreDocente.getText().equals("Nombre")
                            || txtApellido.getText().equals("Apellido")
                            || txtCedula.getText().equals("Cedula")
                            || txtNumeroCelular.getText().equals("Numero de celular")
                            || String.valueOf(txtContrasena.getPassword()).equals("********")
                            || txtNombreDocente.getText().isEmpty()
                            || txtApellido.getText().isEmpty()
                            || txtCedula.getText().isEmpty()
                            || txtNumeroCelular.getText().isEmpty()
                            || String.valueOf(txtContrasena.getPassword()).isEmpty()) {
                    } else {
                        if (validLtrs(txtNombreDocente.getText())
                                && validLtrs(txtApellido.getText())
                                && validNums(txtCedula.getText())
                                && validNums(txtNumeroCelular.getText())
                                && validNums(txtEdad.getText())
                                && validLtrs(txtEntidadSalud.getText())) {
                            int auxCodigoDocente = Universidad.codigoDocente;
                            String codigoDocente = "docen" + auxCodigoDocente;
                            String nombre = txtNombreDocente.getText();
                            String apellido = txtApellido.getText();
                            String cedula = txtCedula.getText();
                            String numeroCelular = txtNumeroCelular.getText();
                            String edad = txtEdad.getText();
                            String direccion = txtDireccion.getText();
                            String entidadSalud = txtEntidadSalud.getText();
                            String correo = txtCorreo.getText();
                            String contrasena = String.valueOf(txtContrasena.getPassword());
                            Usuario usuario = new Usuario(codigoDocente, contrasena);
                            Docente docente = new Docente(nombre, apellido, cedula, numeroCelular, edad, direccion, entidadSalud, codigoDocente, correo, usuario);
                            try {
                                int confirmarRegistroDocente = controladorVentanaAdministrador.registrarDocente(docente);
                                switch (confirmarRegistroDocente) {
                                    case 1:
                                        txtCedula.setText("Cedula");
                                        txtCedula.setForeground(Color.gray);
                                        break;
                                    case 2:
                                        predeterminadoEstudiante();
                                        break;
                                    case 3:
                                        txtNumeroCelular.setText("Numero celular");
                                        txtNumeroCelular.setForeground(Color.gray);
                                        break;
                                }
                            } catch (DuplicadoDocumentoExeption | DuplicadoNumeroCelularExeption e) {
                                JOptionPane.showMessageDialog(null, e.getMessage());
                            }
                        }
                        cargarTablaDocente();
                    }
                }
                break;

            case 2:
                if (txtCodigoDocente.getText().equals("123") || txtCodigoDocente.equals("456")) {
                    JOptionPane.showMessageDialog(null, "Ya hay un usuario registrado con ese codigo");
                } else {
                    if (txtNombreEstudiante.getText().equals("Nombre")
                            || txtApellido.getText().equals("Apellido")
                            || txtCedula.getText().equals("Cedula")
                            || txtNumeroCelular.getText().equals("Numero de celular")
                            || String.valueOf(txtContrasena.getPassword()).equals("********")
                            || jComboxCarrera.getSelectedItem().equals("Carrera")
                            || txtNombreEstudiante.getText().isEmpty()
                            || txtApellido.getText().isEmpty()
                            || txtCedula.getText().isEmpty()
                            || txtNumeroCelular.getText().isEmpty()
                            || String.valueOf(txtContrasena.getPassword()).isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor rellena todos los datos");
                    } else {
                        if (validLtrs(txtNombreEstudiante.getText())
                                && validLtrs(txtApellido.getText())
                                && validNums(txtCedula.getText())
                                && validNums(txtNumeroCelular.getText())) {
                            int auxCodigoEstudiante = Universidad.codigoEstudiante;
                            String codigoEstudiante = "estu" + auxCodigoEstudiante;
                            String nombre = txtNombreEstudiante.getText();
                            String apellido = txtApellido.getText();
                            String cedula = txtCedula.getText();
                            String numeroCelular = txtNumeroCelular.getText();
                            String edad = txtEdad.getText();
                            String direccion = txtDireccion.getText();
                            String entidadSalud = txtEntidadSalud.getText();
                            String correo = txtCorreo.getText();
                            String contrasena = String.valueOf(txtContrasena.getPassword());
                            String carrera = String.valueOf(jComboxCarrera.getSelectedItem());
                            Carrera auxCarrera = controladorVentanaAdministrador.buscarCarrera(carrera);
                            Usuario usuario = new Usuario(codigoEstudiante, contrasena);
                            Estudiante estudiante = new Estudiante(auxCarrera, nombre, apellido, cedula, numeroCelular, edad, direccion, entidadSalud, codigoEstudiante, correo, usuario);
                            try {
                                int confirmarRegistroEstudiante = controladorVentanaAdministrador.registrarEstudiante(estudiante);
                                switch (confirmarRegistroEstudiante) {
                                    case 1:
                                        txtCedula.setText("Cedula");
                                        txtCedula.setForeground(Color.gray);
                                        break;
                                    case 2:
                                        predeterminadoEstudiante();
                                        break;
                                    case 3:
                                        txtNumeroCelular.setText("Numero celular");
                                        txtNumeroCelular.setForeground(Color.gray);
                                        break;
                                }
                            } catch (DuplicadoDocumentoExeption | DuplicadoNumeroCelularExeption e) {
                                JOptionPane.showMessageDialog(null, e.getMessage());
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "verifica los datos ingresados");
                            validadorEstu();
                        }
                        cargarTablaEstudiantes();
                    }
                }

                break;

            case 3:
                int auxCodigoSalon = Universidad.codigoSalon;
                String codigoSalon = "salon" + auxCodigoSalon;
                Salon salon = new Salon(codigoSalon);
                boolean confirmarRegistroSalon = controladorVentanaAdministrador.registrarSalon(salon);
                if (confirmarRegistroSalon) {
                    JOptionPane.showMessageDialog(null, "se registro correctamente el salon con el codigo: " + codigoSalon);
                    txtNumeroSalon.setText("Numero de salon");
                    txtNumeroSalon.setForeground(Color.gray);

                } else {
                    JOptionPane.showMessageDialog(null, "Ya hay un salon registrado con el salon con el codigo: " + codigoSalon);
                    txtNumeroSalon.setText("Numero de salon");
                    txtNumeroSalon.setForeground(Color.gray);
                }
                cargarTablaSalones();
                break;
            case 4:
                if (txtNombreDocente.getText().equals("Nombre materia") || txtNombreDocente.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor rellena los datos");
                } else {
                    String materias = txtNombreDocente.getText();
                    int auxCodigoMateria = Universidad.codigoMaterias;
                    String codigo = "materia" + auxCodigoMateria;
                    Materia materia = new Materia(materias, codigo);
                    boolean confirmarRegistroMateria = controladorVentanaAdministrador.registrarMateria(materia);
                    if (confirmarRegistroMateria) {
                        JOptionPane.showMessageDialog(null, "se registro correctamente la materia: " + materia.getNombreMateria());
                        txtNombreDocente.setText("Nombre materia");
                        txtNombreDocente.setForeground(Color.gray);
                        jComboxCarrera.removeAllItems();
                        jComboxCarrera.addItem("Materia");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya hay una materia registrado con el nombre: " + materia.getNombreMateria());
                        txtNombreDocente.setText("Nombre materia");
                        txtNombreDocente.setForeground(Color.gray);
                    }
                    cargarTablaMateria();
                }
                break;
            case 5:
                if (txtNombreDocente.getText().equals("Nombre curso") || txtNombreDocente.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor rellena los datos");
                } else {
                    String nombreCurso = txtNombreDocente.getText();
                    String codigoCurso = "curso" + controladorVentanaAdministrador.getCodigoCurso();
                    String materia = String.valueOf(jComboxMateria.getSelectedItem());
                    String docente = String.valueOf(jComboxDocente.getSelectedItem());
                    int intensidadHoraria = Integer.parseInt(String.valueOf(jcomboBoxIntensidadHoraria.getSelectedItem()));
                    Materia auxMateria = controladorVentanaAdministrador.buscarMateria(materia);
                    Persona auxDocente = controladorVentanaAdministrador.buscarPersonaCodigo(docente);
                    Curso curso = new Curso(nombreCurso, codigoCurso, auxDocente, auxMateria, intensidadHoraria);
                    boolean confirmarRegistroCurso = controladorVentanaAdministrador.registrarCurso(curso);
                    if (confirmarRegistroCurso) {
                        JOptionPane.showMessageDialog(null, "se registro correctamente el curso: " + curso.getNombreCurso());
                        predeterminadoCurso();
                    } else {
                        JOptionPane.showMessageDialog(null, "El docente "
                                + curso.getDocente().getNombre() + " dicta la materia "
                                + "con el codigo: "
                                + curso.getMateria().getCodigoMateria());
                        txtNombreDocente.setText("Nombre curso");
                        txtNombreDocente.setForeground(Color.gray);
                    }
                    cargarTablaCursos();
                }
                break;
            case 6:
                if (txtNombreDocente.getText().equals("Nombre carrera") || txtNombreDocente.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor rellena los datos");
                } else {
                    int auxCodigoCarrera = Universidad.codigoCarrera;
                    String codigoCarrera = "carrera" + auxCodigoCarrera;
                    String nombreCarrera = txtNombreDocente.getText();
                    Carrera carrera = new Carrera(nombreCarrera, codigoCarrera);
                    boolean confirmarRegistroCarrera = controladorVentanaAdministrador.registrarCarrera(carrera);

                    if (confirmarRegistroCarrera) {
                        JOptionPane.showMessageDialog(null, "se registro correctamente la carrera: " + carrera.getNombreCarrera());
                        txtNombreDocente.setText("Nombre carrera");
                        txtNombreDocente.setForeground(Color.gray);
                        txtCodigoDocente.setText("Codigo carrera");
                        txtCodigoDocente.setForeground(Color.gray);
                        jComboxCarrera.removeAllItems();
                        jComboxCarrera.addItem("Carrera");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya hay una carrera registrada con el nombre: " + carrera.getNombreCarrera());
                        txtNombreDocente.setText("Nombre carrera");
                        txtNombreDocente.setForeground(Color.gray);
                    }
                    cargarTablaCarreras();
                }
                break;
        }
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void txtCodigoEstudianteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoEstudianteMousePressed
        if (txtCodigoEstudiante.getText().equals("Codigo estudiante")) {
            txtCodigoEstudiante.setText("");
            txtCodigoEstudiante.setForeground(Color.black);
        }
        if (txtNumeroCelular.getText().isEmpty()) {
            txtNumeroCelular.setText("Numero  de celular");
            txtNumeroCelular.setForeground(Color.gray);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);
        }
        if (txtApellido.getText().equals("")) {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);
        }
        if (txtNombreEstudiante.getText().isEmpty()) {
            txtNombreEstudiante.setText("Nombre");
            txtNombreEstudiante.setForeground(Color.gray);
        }
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
            txtContrasena.setText("********");
            txtContrasena.setForeground(Color.gray);
        }
        if (txtEdad.getText().isEmpty()) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtEntidadSalud.getText().isEmpty()) {
            txtEntidadSalud.setText("Entidad de salud");
            txtEntidadSalud.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCodigoEstudianteMousePressed

    private void txtNombreEstudianteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreEstudianteMousePressed
        if (txtNombreEstudiante.getText().equals("Nombre")) {
            txtNombreEstudiante.setText("");
            txtNombreEstudiante.setForeground(Color.black);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
        }
        if (txtApellido.getText().isEmpty()) {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);
        }
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);
        }
        if (txtNumeroCelular.getText().isEmpty()) {
            txtNumeroCelular.setText("Numero de celular");
            txtNumeroCelular.setForeground(Color.gray);
        }
        if (txtCodigoEstudiante.getText().isEmpty()) {
            txtCodigoEstudiante.setText("Codigo estudiante");
            txtCodigoEstudiante.setForeground(Color.gray);
        }
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
            txtContrasena.setText("********");
            txtContrasena.setForeground(Color.gray);
        }
        if (txtEdad.getText().isEmpty()) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtEntidadSalud.getText().isEmpty()) {
            txtEntidadSalud.setText("Entidad de salud");
            txtEntidadSalud.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreEstudianteMousePressed

    private void txtContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContrasenaMousePressed
        if (String.valueOf(txtContrasena.getPassword()).equals("********")) {
            txtContrasena.setText("");
            txtContrasena.setForeground(Color.black);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
        }
        if (txtCodigoEstudiante.getText().isEmpty()) {
            txtCodigoEstudiante.setText("Codigo estudiante");
            txtCodigoEstudiante.setForeground(Color.gray);
        }
        if (txtCupo.getText().isEmpty()) {
            txtCupo.setText("Codigo estudiante");
            txtCupo.setForeground(Color.gray);
        }
        if (txtNombreEstudiante.getText().isEmpty()) {
            txtNombreEstudiante.setText("Nombre");
            txtNombreEstudiante.setForeground(Color.gray);
        }
        if (txtCodigoDocente.getText().isEmpty()) {
            txtCodigoDocente.setText("Codigo docente");
            txtCodigoDocente.setForeground(Color.gray);
        }
        if (txtNumeroCelular.getText().isEmpty()) {
            txtNumeroCelular.setText("Numero de celular");
            txtNumeroCelular.setForeground(Color.gray);
        }
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);
        }
        if (txtApellido.getText().equals("")) {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);
        }
        if (txtNombreDocente.getText().isEmpty()) {
            txtNombreDocente.setText("Nombre");
            txtNombreDocente.setForeground(Color.gray);
        }
        if (txtEdad.getText().isEmpty()) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtEntidadSalud.getText().isEmpty()) {
            txtEntidadSalud.setText("Entidad de salud");
            txtEntidadSalud.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContrasenaMousePressed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        switch (jComboPersona.getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Por favor selecciona un tipo distinto");
            case 1:

                int seleccion = jTabla.rowAtPoint(evt.getPoint());
                String codigo = jTabla.getValueAt(seleccion, 0).toString();
                String nombre = jTabla.getValueAt(seleccion, 1).toString();
                String apellido = jTabla.getValueAt(seleccion, 2).toString();
                String cedula = jTabla.getValueAt(seleccion, 3).toString();
                String numeroCelular = jTabla.getValueAt(seleccion, 4).toString();
                String edad = jTabla.getValueAt(seleccion, 5).toString();
                String direccion = jTabla.getValueAt(seleccion, 6).toString();
                String entidadSalud = jTabla.getValueAt(seleccion, 7).toString();
                String correo = jTabla.getValueAt(seleccion, 8).toString();
                String contrasena = jTabla.getValueAt(seleccion, 9).toString();
                txtCodigoDocente.setText(codigo);
                txtCodigoDocente.setForeground(Color.black);
                txtNombreDocente.setText(nombre);
                txtNombreDocente.setForeground(Color.black);
                txtApellido.setText(apellido);
                txtApellido.setForeground(Color.black);
                txtCedula.setText(cedula);
                txtCedula.setForeground(Color.black);
                txtNumeroCelular.setText(numeroCelular);
                txtNumeroCelular.setForeground(Color.black);
                txtEdad.setText(edad);
                txtEdad.setForeground(Color.black);
                txtDireccion.setText(direccion);
                txtDireccion.setForeground(Color.black);
                txtEntidadSalud.setText(entidadSalud);
                txtEntidadSalud.setForeground(Color.black);
                txtCorreo.setText(correo);
                txtCorreo.setForeground(Color.black);
                txtContrasena.setText(contrasena);
                txtContrasena.setForeground(Color.black);
                txtCedula.enable(false);
                txtCodigoDocente.enable(false);
                break;

            case 2:
                seleccion = jTabla.rowAtPoint(evt.getPoint());
                codigo = jTabla.getValueAt(seleccion, 0).toString();
                nombre = jTabla.getValueAt(seleccion, 1).toString();
                apellido = jTabla.getValueAt(seleccion, 2).toString();
                cedula = jTabla.getValueAt(seleccion, 3).toString();
                numeroCelular = jTabla.getValueAt(seleccion, 4).toString();
                edad = jTabla.getValueAt(seleccion, 5).toString();
                direccion = jTabla.getValueAt(seleccion, 6).toString();
                entidadSalud = jTabla.getValueAt(seleccion, 7).toString();
                correo = jTabla.getValueAt(seleccion, 8).toString();
                contrasena = jTabla.getValueAt(seleccion, 9).toString();
                String carrera = jTabla.getValueAt(seleccion, 10).toString();
                String CodigoCarrera = jTabla.getValueAt(seleccion, 11).toString();
                txtCodigoDocente.setText(codigo);
                txtCodigoDocente.setForeground(Color.black);
                txtNombreEstudiante.setText(nombre);
                txtNombreEstudiante.setForeground(Color.black);
                txtApellido.setText(apellido);
                txtApellido.setForeground(Color.black);
                txtCedula.setText(cedula);
                txtCedula.setForeground(Color.black);
                txtNumeroCelular.setText(numeroCelular);
                txtNumeroCelular.setForeground(Color.black);
                txtEdad.setText(edad);
                txtEdad.setForeground(Color.black);
                txtDireccion.setText(direccion);
                txtDireccion.setForeground(Color.black);
                txtEntidadSalud.setText(entidadSalud);
                txtEntidadSalud.setForeground(Color.black);
                txtCorreo.setText(correo);
                txtCorreo.setForeground(Color.black);
                txtContrasena.setText(contrasena);
                txtContrasena.setForeground(Color.black);
                jComboxCarrera.setSelectedItem(carrera);
                txtCedula.enable(false);
                txtCodigoEstudiante.enable(false);
                break;
            case 3:
                seleccion = jTabla.rowAtPoint(evt.getPoint());
                String numeroSalon = jTabla.getValueAt(seleccion, 0).toString();
                txtCodigoEstudiante.setText(numeroSalon);
                txtNumeroSalon.setText(numeroSalon);
                txtNumeroSalon.setForeground(Color.black);
                break;
            case 4:
                seleccion = jTabla.rowAtPoint(evt.getPoint());
                String nombreMateria = jTabla.getValueAt(seleccion, 1).toString();
                String codigoMateria = jTabla.getValueAt(seleccion, 0).toString();
                txtNombreDocente.setText(nombreMateria);
                txtNombreDocente.setForeground(Color.black);
                txtCodigoDocente.setText(codigoMateria);
                txtCodigoDocente.setForeground(Color.black);
                break;
            case 5:
                seleccion = jTabla.rowAtPoint(evt.getPoint());
                String codigoCurso = jTabla.getValueAt(seleccion, 0).toString();
                String nombreCurso = jTabla.getValueAt(seleccion, 1).toString();
                String codigoMateriaCurso = jTabla.getValueAt(seleccion, 2).toString();
                String codigoDocenteCurso = jTabla.getValueAt(seleccion, 4).toString();
                String intensidadHoraria = jTabla.getValueAt(seleccion, 6).toString();
                txtCupo.setText(codigoCurso);
                txtCupo.setForeground(Color.gray);
                txtNombreDocente.setText(nombreCurso);
                txtNombreDocente.setForeground(Color.black);
                jComboxDocente.setSelectedItem(codigoDocenteCurso);
                jComboxMateria.setSelectedItem(codigoMateriaCurso);
                jcomboBoxIntensidadHoraria.setSelectedItem(intensidadHoraria);
                break;

            case 6:
                seleccion = jTabla.rowAtPoint(evt.getPoint());
                String codigoCarrera = jTabla.getValueAt(seleccion, 0).toString();
                String nombreCarrera = jTabla.getValueAt(seleccion, 1).toString();
                txtNombreDocente.setText(nombreCarrera);
                txtNombreDocente.setForeground(Color.black);
                txtCodigoDocente.setText(codigoCarrera);
                txtCodigoDocente.setForeground(Color.black);
                break;
        }
    }//GEN-LAST:event_jTablaMouseClicked

    private void txtNumeroCelularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroCelularMousePressed
        if (txtNumeroCelular.getText().equals("Numero de celular")) {
            txtNumeroCelular.setText("");
            txtNumeroCelular.setForeground(Color.black);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
        }
        if (txtCodigoEstudiante.getText().isEmpty()) {
            txtCodigoEstudiante.setText("Codigo estudiante");
            txtCodigoEstudiante.setForeground(Color.gray);
        }
        if (txtCodigoEstudiante.getText().isEmpty()) {
            txtCodigoEstudiante.setText("Codigo Nombre");
            txtCodigoEstudiante.setForeground(Color.gray);
        }
        if (txtCupo.getText().isEmpty()) {
            txtCupo.setText("Codigo estudiante");
            txtCupo.setForeground(Color.gray);
        }
        if (txtNombreEstudiante.getText().isEmpty()) {
            txtNombreEstudiante.setText("Nombre");
            txtNombreEstudiante.setForeground(Color.gray);
        }
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);
        }
        if (txtApellido.getText().equals("")) {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);
        }
        if (txtNombreDocente.getText().isEmpty()) {
            txtNombreDocente.setText("Nombre");
            txtNombreDocente.setForeground(Color.gray);
        }

        if (txtCodigoDocente.getText().isEmpty()) {
            txtCodigoDocente.setText("Codigo docente");
            txtCodigoDocente.setForeground(Color.gray);
        }
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
            txtContrasena.setText("********");
            txtContrasena.setForeground(Color.gray);
        }
        if (txtEdad.getText().isEmpty()) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtEntidadSalud.getText().isEmpty()) {
            txtEntidadSalud.setText("Entidad de salud");
            txtEntidadSalud.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNumeroCelularMousePressed

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed
        if (txtCedula.getText().equals("Cedula")) {
            txtCedula.setText("");
            txtCedula.setForeground(Color.black);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
        }
        if (txtCodigoEstudiante.getText().isEmpty()) {
            txtCodigoEstudiante.setText("Codigo estudiante");
            txtCodigoEstudiante.setForeground(Color.gray);
        }
        if (txtCodigoEstudiante.getText().isEmpty()) {
            txtCodigoEstudiante.setText("Codigo estudiante");
            txtCodigoEstudiante.setForeground(Color.gray);
        }
        if (txtCupo.getText().isEmpty()) {
            txtCupo.setText("Codigo estudiante");
            txtCupo.setForeground(Color.gray);
        }
        if (txtNombreEstudiante.getText().isEmpty()) {
            txtNombreEstudiante.setText("Nombre");
            txtNombreEstudiante.setForeground(Color.gray);
        }
        if (txtApellido.getText().equals("")) {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);
        }
        if (txtNombreDocente.getText().isEmpty()) {
            txtNombreDocente.setText("Nombre");
            txtNombreDocente.setForeground(Color.gray);
        }

        if (txtNumeroCelular.getText().isEmpty()) {
            txtNumeroCelular.setText("Numero de celular");
            txtNumeroCelular.setForeground(Color.gray);
        }
        if (txtCodigoDocente.getText().isEmpty()) {
            txtCodigoDocente.setText("Codigo docente");
            txtCodigoDocente.setForeground(Color.gray);
        }
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
            txtContrasena.setText("********");
            txtContrasena.setForeground(Color.gray);
        }
        if (txtEdad.getText().isEmpty()) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtEntidadSalud.getText().isEmpty()) {
            txtEntidadSalud.setText("Entidad de salud");
            txtEntidadSalud.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCedulaMousePressed

    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed
        if (txtApellido.getText().equals("Apellido")) {
            txtApellido.setText("");
            txtApellido.setForeground(Color.black);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
        }
        if (txtCodigoEstudiante.getText().isEmpty()) {
            txtCodigoEstudiante.setText("Codigo estudiante");
            txtCodigoEstudiante.setForeground(Color.gray);
        }
        if (txtCodigoEstudiante.getText().isEmpty()) {
            txtCodigoEstudiante.setText("Codigo estudiante");
            txtCodigoEstudiante.setForeground(Color.gray);
        }
        if (txtCupo.getText().isEmpty()) {
            txtCupo.setText("Codigo estudiante");
            txtCupo.setForeground(Color.gray);
        }
        if (txtNombreEstudiante.getText().isEmpty()) {
            txtNombreEstudiante.setText("Nombre");
            txtNombreEstudiante.setForeground(Color.gray);
        }
        if (txtNombreDocente.getText().isEmpty()) {
            txtNombreDocente.setText("Nombre");
            txtNombreDocente.setForeground(Color.gray);
        }
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);
        }
        if (txtNumeroCelular.getText().isEmpty()) {
            txtNumeroCelular.setText("Numero de celular");
            txtNumeroCelular.setForeground(Color.gray);
        }
        if (txtCodigoDocente.getText().isEmpty()) {
            txtCodigoDocente.setText("Codigo docente");
            txtCodigoDocente.setForeground(Color.gray);
        }
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
            txtContrasena.setText("********");
            txtContrasena.setForeground(Color.gray);
        }
        if (txtEdad.getText().isEmpty()) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtEntidadSalud.getText().isEmpty()) {
            txtEntidadSalud.setText("Entidad de salud");
            txtEntidadSalud.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtApellidoMousePressed

    private void txtNombreDocenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreDocenteMousePressed
        if (txtNombreDocente.getText().equals("Nombre")
                || txtNombreDocente.getText().equals("Nombre curso")
                || txtNombreDocente.getText().equals("Nombre materia")
                || txtNombreDocente.getText().equals("Nombre carrera")) {
            txtNombreDocente.setText("");
            txtNombreDocente.setForeground(Color.black);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
            txtContrasena.setText("********");
            txtContrasena.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
        }
        if (txtCodigoEstudiante.getText().isEmpty()) {
            txtCodigoEstudiante.setText("Codigo Nombre");
            txtCodigoEstudiante.setForeground(Color.gray);
        }
        if (txtApellido.getText().isEmpty()) {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);
        }
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);
        }
        if (txtNumeroCelular.getText().isEmpty()) {
            txtNumeroCelular.setText("Numero de celular");
            txtNumeroCelular.setForeground(Color.gray);
        }
        if (txtCodigoDocente.getText().isEmpty()) {
            txtCodigoDocente.setText("Codigo docente");
            txtCodigoDocente.setForeground(Color.gray);
        }
        if (txtEdad.getText().isEmpty()) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtEntidadSalud.getText().isEmpty()) {
            txtEntidadSalud.setText("Entidad de salud");
            txtEntidadSalud.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreDocenteMousePressed

    private void jComboPersonaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboPersonaItemStateChanged
        if (jComboPersona.getSelectedIndex() == 0) {
            jSeparatorNumeroCelular2.setVisible(false);
            jcomboBoxIntensidadHoraria.setVisible(false);
            jSeparatorCedula1.setVisible(false);
            jComboxMateria.setVisible(false);
            jComboxDocente.setVisible(false);
            btnModificar.setVisible(false);
            jEliminar.setVisible(false);
            btnEliminar.setVisible(false);
            txtNumeroSalon.setVisible(false);
            txtCupo.setVisible(false);
            txtNombreEstudiante.setVisible(false);
            txtCodigoEstudiante.setVisible(false);
            txtCupo.setVisible(false);
            txtNombreDocente.setVisible(false);
            jSeparadorNombre.setVisible(false);
            txtApellido.setVisible(false);
            jSeparatorApellido.setVisible(false);
            txtCedula.setVisible(false);
            jSeparatorCedula.setVisible(false);
            txtNumeroCelular.setVisible(false);
            jSeparatorNumeroCelular.setVisible(false);
            txtCodigoDocente.setVisible(false);
            jSeparatorDocente.setVisible(false);
            txtContrasena.setVisible(false);
            jSeparatorContrasena.setVisible(false);
            jSeparatorCursos.setVisible(false);
            jTabla.setVisible(false);
            jRegistrar.setVisible(false);
            jScrollPane1.setVisible(false);
            jComboxCarrera.setVisible(false);
            btnAsignarCurso.setVisible(false);
            jAsignarCurso.setVisible(false);
            txtDireccion.setVisible(false);
            txtEntidadSalud.setVisible(false);
            txtEdad.setVisible(false);
            txtCorreo.setVisible(false);
            jSeparadorNombre1.setVisible(false);
            jSeparatorNumeroCelular1.setVisible(false);
            jSeparatorDocente5.setVisible(false);
            jSeparatorCursos.setVisible(false);
            jSeparatorCursos1.setVisible(false);

        } else if (jComboPersona.getSelectedIndex() == 1) {
            jSeparatorNumeroCelular2.setVisible(true);
            jcomboBoxIntensidadHoraria.setVisible(false);
            jComboxCarrera.setVisible(false);
            jSeparatorCedula1.setVisible(false);
            jComboxMateria.setVisible(false);
            jComboxDocente.setVisible(false);
            btnModificar.setVisible(true);
            jModificar.setVisible(true);
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
            txtEntidadSalud.setText("Entidad de salud");
            txtEntidadSalud.setForeground(Color.gray);
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);
            txtNumeroCelular.setText("Numero de celular");
            txtNumeroCelular.setForeground(Color.gray);
            txtCodigoDocente.enable(false);
            txtCodigoDocente.setText("Codigo docente");
            txtCodigoDocente.setForeground(Color.gray);
            txtContrasena.setText("********");
            txtContrasena.setForeground(Color.gray);
            txtNombreDocente.setText("Nombre");
            txtNombreDocente.setForeground(Color.gray);
            txtCedula.enable(true);
            jEliminar.setVisible(true);
            btnEliminar.setVisible(true);
            txtCupo.setVisible(false);
            txtNumeroSalon.setVisible(false);
            txtCupo.setVisible(false);
            txtNombreDocente.setVisible(true);
            jSeparadorNombre.setVisible(true);
            txtApellido.setVisible(true);
            jSeparatorApellido.setVisible(true);
            txtCedula.setVisible(true);
            jSeparatorCedula.setVisible(true);
            txtNumeroCelular.setVisible(true);
            jSeparatorNumeroCelular.setVisible(true);
            txtCodigoDocente.setVisible(true);
            jSeparatorDocente.setVisible(true);
            txtContrasena.setVisible(true);
            jSeparatorContrasena.setVisible(true);
            txtNombreEstudiante.setVisible(false);
            txtCodigoEstudiante.setVisible(false);
            jTabla.setVisible(true);
            jRegistrar.setVisible(true);
            jScrollPane1.setVisible(true);
            btnAsignarCurso.setVisible(false);
            jAsignarCurso.setVisible(false);
            txtDireccion.setVisible(true);
            txtEntidadSalud.setVisible(true);
            txtEdad.setVisible(true);
            txtCorreo.setVisible(true);
            jSeparadorNombre1.setVisible(true);
            jSeparatorNumeroCelular1.setVisible(true);
            jSeparatorDocente5.setVisible(true);
            jSeparatorCursos.setVisible(false);
            jSeparatorCursos1.setVisible(true);
            cargarTablaDocente();

        } else if (jComboPersona.getSelectedIndex() == 2) {
            jSeparatorNumeroCelular2.setVisible(true);
            jcomboBoxIntensidadHoraria.setVisible(false);
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
            txtEntidadSalud.setText("Entidad de salud");
            txtEntidadSalud.setForeground(Color.gray);
            jAsignarCurso.setVisible(false);
            btnAsignarCurso.setVisible(false);
            jSeparatorCedula1.setVisible(false);
            jComboxMateria.setVisible(false);
            jComboxDocente.setVisible(false);
            btnModificar.setVisible(true);
            jModificar.setVisible(true);
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);
            txtNumeroCelular.setText("Numero de celular");
            txtNumeroCelular.setForeground(Color.gray);
            txtCodigoEstudiante.setText("Codigo estudiante");
            txtCodigoEstudiante.setForeground(Color.gray);
            txtContrasena.setText("********");
            txtContrasena.setForeground(Color.gray);
            txtNombreEstudiante.setText("Nombre");
            txtNombreEstudiante.setForeground(Color.gray);
            jEliminar.setVisible(true);
            btnEliminar.setVisible(true);
            txtNombreEstudiante.setVisible(true);
            txtCodigoEstudiante.setVisible(true);
            txtCodigoEstudiante.enable(false);
            txtCupo.setVisible(false);
            txtCedula.enable(true);
            txtNumeroSalon.setVisible(false);
            txtNombreDocente.setVisible(false);
            jSeparadorNombre.setVisible(true);
            txtApellido.setVisible(true);
            jSeparatorApellido.setVisible(true);
            txtCedula.setVisible(true);
            jSeparatorCedula.setVisible(true);
            txtNumeroCelular.setVisible(true);
            jSeparatorNumeroCelular.setVisible(true);
            txtCodigoDocente.setVisible(true);
            txtCodigoDocente.setText("Codigo estudiante");
            txtCodigoDocente.setForeground(Color.gray);
            txtCodigoDocente.enable(false);
            jSeparatorNumeroCelular1.setVisible(true);
            jSeparatorDocente.setVisible(true);
            txtContrasena.setVisible(true);
            jSeparatorContrasena.setVisible(true);
            jSeparatorCursos.setVisible(false);
            jTabla.setVisible(true);
            jRegistrar.setVisible(true);
            jScrollPane1.setVisible(true);
            jComboxCarrera.setVisible(true);
            jComboxCarrera.removeAllItems();
            jComboxCarrera.addItem("Carrera");
            btnAsignarCurso.setVisible(false);
            jAsignarCurso.setVisible(false);
            txtDireccion.setVisible(true);
            txtEntidadSalud.setVisible(true);
            txtEdad.setVisible(true);
            txtCorreo.setVisible(true);
            jSeparadorNombre1.setVisible(true);
            jSeparatorNumeroCelular1.setVisible(true);
            jSeparatorDocente5.setVisible(true);
            jSeparatorCursos.setVisible(true);
            jSeparatorCursos1.setVisible(true);
            llenarComboxCarrera();
            cargarTablaEstudiantes();

        } else if (jComboPersona.getSelectedIndex() == 3) {
            jSeparatorNumeroCelular2.setVisible(false);
            jcomboBoxIntensidadHoraria.setVisible(false);
            jSeparatorCedula1.setVisible(false);
            jComboxMateria.setVisible(false);
            btnModificar.setVisible(false);
            jModificar.setVisible(false);
            jEliminar.setVisible(true);
            btnEliminar.setVisible(true);
            txtNombreEstudiante.setVisible(false);
            txtCodigoEstudiante.setVisible(false);
            txtNumeroSalon.setEnabled(false);
            txtNumeroSalon.setText("Numero de salon");
            txtNumeroSalon.setForeground(Color.gray);
            txtCupo.setVisible(false);
            txtNumeroSalon.setVisible(true);
            txtNombreDocente.setVisible(false);
            jSeparadorNombre.setVisible(true);
            txtApellido.setVisible(false);
            jSeparatorApellido.setVisible(false);
            txtCedula.setVisible(false);
            jSeparatorCedula.setVisible(false);
            txtNumeroCelular.setVisible(false);
            jSeparatorNumeroCelular.setVisible(false);
            txtCodigoDocente.setVisible(false);
            jSeparatorDocente.setVisible(false);
            txtContrasena.setVisible(false);
            jSeparatorContrasena.setVisible(false);
            jSeparatorCursos.setVisible(false);
            jTabla.setVisible(true);
            jRegistrar.setVisible(true);
            jScrollPane1.setVisible(true);
            jComboxCarrera.setVisible(false);
            btnAsignarCurso.setVisible(false);
            jAsignarCurso.setVisible(false);
            txtDireccion.setVisible(false);
            txtEntidadSalud.setVisible(false);
            txtEdad.setVisible(false);
            txtCorreo.setVisible(false);
            jComboxDocente.setVisible(false);
            jSeparadorNombre1.setVisible(false);
            jSeparatorNumeroCelular1.setVisible(false);
            jSeparatorDocente5.setVisible(false);
            jSeparatorCursos.setVisible(false);
            jSeparatorCursos1.setVisible(false);
            cargarTablaSalones();
        }
        if (jComboPersona.getSelectedIndex() == 4) {
            jSeparatorNumeroCelular2.setVisible(true);
            jcomboBoxIntensidadHoraria.setVisible(false);
            jSeparatorCedula1.setVisible(false);
            jComboxMateria.setVisible(false);
            btnModificar.setVisible(true);
            jModificar.setVisible(true);
            jComboxCarrera.setVisible(false);
            jEliminar.setVisible(true);
            btnEliminar.setVisible(true);
            txtNumeroSalon.setVisible(false);
            txtCupo.setVisible(false);
            txtNombreEstudiante.setVisible(false);
            txtCodigoEstudiante.setVisible(false);
            txtCupo.setVisible(false);
            txtNombreDocente.setVisible(true);
            jSeparadorNombre.setVisible(true);
            txtNombreDocente.setText("Nombre materia");
            txtNombreDocente.setForeground(Color.gray);
            txtCodigoDocente.setVisible(true);
            txtCodigoDocente.setText("Codigo materia");
            txtCodigoDocente.setForeground(Color.gray);
            txtCodigoDocente.enable(false);
            jSeparatorNumeroCelular1.setVisible(false);
            txtApellido.setVisible(false);
            jSeparatorApellido.setVisible(false);
            txtCedula.setVisible(false);
            jSeparatorCedula.setVisible(false);
            txtNumeroCelular.setVisible(false);
            jSeparatorNumeroCelular.setVisible(false);
            jSeparatorDocente.setVisible(false);
            txtContrasena.setVisible(false);
            jSeparatorContrasena.setVisible(false);
            jSeparatorCursos.setVisible(false);
            jTabla.setVisible(true);
            jRegistrar.setVisible(true);
            jScrollPane1.setVisible(true);
            btnAsignarCurso.setVisible(false);
            jAsignarCurso.setVisible(false);
            txtDireccion.setVisible(false);
            txtEntidadSalud.setVisible(false);
            jComboxDocente.setVisible(false);
            txtEdad.setVisible(false);
            txtCorreo.setVisible(false);
            jSeparadorNombre1.setVisible(false);
            jSeparatorDocente5.setVisible(false);
            jSeparatorCursos.setVisible(false);
            jSeparatorCursos1.setVisible(false);
            cargarTablaMateria();
        }
        if (jComboPersona.getSelectedIndex() == 5) {
            jSeparatorNumeroCelular2.setVisible(true);
            jcomboBoxIntensidadHoraria.setVisible(true);
            jSeparatorCedula1.setVisible(true);
            jSeparatorCedula.setVisible(true);
            btnModificar.setVisible(true);
            jModificar.setVisible(true);
            jComboxCarrera.setVisible(false);
            jEliminar.setVisible(true);
            btnEliminar.setVisible(true);
            txtNumeroSalon.setVisible(false);
            txtCupo.setVisible(false);
            txtNombreEstudiante.setVisible(false);
            txtCodigoEstudiante.setVisible(false);
            txtCupo.setVisible(true);
            txtCupo.setText("Codigo curso");
            txtCupo.setForeground(Color.gray);
            txtCupo.enable(false);
            jSeparatorDocente5.setVisible(true);
            txtNombreDocente.setVisible(true);
            jSeparadorNombre.setVisible(true);
            txtNombreDocente.setText("Nombre curso");
            txtNombreDocente.setForeground(Color.gray);
            txtApellido.setVisible(false);
            jSeparatorApellido.setVisible(false);
            txtCedula.setVisible(false);
            jSeparatorCedula.setVisible(false);
            txtNumeroCelular.setVisible(false);
            jSeparatorNumeroCelular.setVisible(false);
            txtCodigoDocente.setVisible(false);
            jSeparatorDocente.setVisible(false);
            txtContrasena.setVisible(false);
            jSeparatorContrasena.setVisible(false);
            jSeparatorCursos.setVisible(false);
            jTabla.setVisible(true);
            jRegistrar.setVisible(true);
            jScrollPane1.setVisible(true);
            btnAsignarCurso.setVisible(true);
            jAsignarCurso.setVisible(true);
            jComboxDocente.setVisible(true);
            jSeparatorNumeroCelular1.setVisible(true);
            txtDireccion.setVisible(false);
            txtEntidadSalud.setVisible(false);
            txtEdad.setVisible(false);
            txtCorreo.setVisible(false);
            jSeparadorNombre1.setVisible(false);
            jSeparatorNumeroCelular1.setVisible(false);
            jSeparatorCursos.setVisible(false);
            jSeparatorCursos1.setVisible(false);
            jComboxMateria.setVisible(true);
            llenarComboxMateria();
            llenarComboxDocente();
            cargarTablaCursos();
        }
        if (jComboPersona.getSelectedIndex() == 6) {
            jSeparatorNumeroCelular2.setVisible(true);
            jcomboBoxIntensidadHoraria.setVisible(false);
            jSeparatorCedula1.setVisible(false);
            jComboxMateria.setVisible(false);
            jComboxDocente.setVisible(false);
            btnModificar.setVisible(true);
            jModificar.setVisible(true);
            jEliminar.setVisible(true);
            btnEliminar.setVisible(true);
            txtNumeroSalon.setVisible(false);
            txtNombreEstudiante.setVisible(false);
            txtCodigoEstudiante.setVisible(false);
            txtCupo.setVisible(false);
            txtNombreDocente.setVisible(true);
            jSeparadorNombre.setVisible(true);
            txtApellido.setVisible(false);
            jSeparatorApellido.setVisible(false);
            txtCedula.setVisible(false);
            jSeparatorCedula.setVisible(false);
            txtNumeroCelular.setVisible(false);
            jSeparatorNumeroCelular.setVisible(false);
            txtNombreDocente.setText("Nombre carrera");
            txtNombreDocente.setForeground(Color.gray);
            txtCodigoDocente.setVisible(true);
            txtCodigoDocente.setText("Codigo carrera");
            txtCodigoDocente.setForeground(Color.gray);
            txtCodigoDocente.enable(false);
            jSeparatorDocente.setVisible(false);
            txtContrasena.setVisible(false);
            jSeparatorContrasena.setVisible(false);
            jSeparatorCursos.setVisible(false);
            jTabla.setVisible(true);
            jRegistrar.setVisible(true);
            jScrollPane1.setVisible(true);
            jComboxCarrera.setVisible(false);
            btnAsignarCurso.setVisible(false);
            jAsignarCurso.setVisible(false);
            txtDireccion.setVisible(false);
            txtEntidadSalud.setVisible(false);
            txtEdad.setVisible(false);
            txtCorreo.setVisible(false);
            jSeparadorNombre1.setVisible(false);
            jSeparatorNumeroCelular1.setVisible(false);
            jSeparatorDocente5.setVisible(false);
            jSeparatorCursos.setVisible(false);
            jSeparatorCursos1.setVisible(false);
            cargarTablaCarreras();
        }
    }//GEN-LAST:event_jComboPersonaItemStateChanged

    private void txtCupoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCupoMousePressed
        if (txtCupo.getText().equals("Numero de salon")) {
            txtCupo.setText("");
            txtCupo.setForeground(Color.black);
        }
        if (txtNumeroSalon.getText().isEmpty()) {
            txtNumeroSalon.setText("Cupo");
            txtNumeroSalon.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCupoMousePressed

    private void txtEdadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEdadMousePressed
        if (txtEdad.getText().equals("Edad")) {
            txtEdad.setText("");
            txtEdad.setForeground(Color.black);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
            txtContrasena.setText("********");
            txtContrasena.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
        }
        if (txtCodigoEstudiante.getText().isEmpty()) {
            txtCodigoEstudiante.setText("Codigo estudiante");
            txtCodigoEstudiante.setForeground(Color.gray);
        }
        if (txtApellido.getText().isEmpty()) {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);
        }
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);
        }
        if (txtNumeroCelular.getText().isEmpty()) {
            txtNumeroCelular.setText("Numero de celular");
            txtNumeroCelular.setForeground(Color.gray);
        }
        if (txtCodigoDocente.getText().isEmpty()) {
            txtCodigoDocente.setText("Codigo docente");
            txtCodigoDocente.setForeground(Color.gray);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtEntidadSalud.getText().isEmpty()) {
            txtEntidadSalud.setText("Entidad de salud");
            txtEntidadSalud.setForeground(Color.gray);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtEntidadSalud.getText().isEmpty()) {
            txtEntidadSalud.setText("Entidad de salud");
            txtEntidadSalud.setForeground(Color.gray);
        }
        if (txtNombreDocente.getText().isEmpty()) {
            txtNombreDocente.setText("Nombre");
            txtNombreDocente.setForeground(Color.gray);
        }
        if (txtNombreEstudiante.getText().isEmpty()) {
            txtNombreEstudiante.setText("Nombre");
            txtNombreEstudiante.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtEdadMousePressed

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
        if (txtDireccion.getText().equals("Direccion")) {
            txtDireccion.setText("");
            txtDireccion.setForeground(Color.black);
        }
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
            txtContrasena.setText("********");
            txtContrasena.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
        }
        if (txtEdad.getText().isEmpty()) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (txtCodigoEstudiante.getText().isEmpty()) {
            txtCodigoEstudiante.setText("Codigo estudiante");
            txtCodigoEstudiante.setForeground(Color.gray);
        }
        if (txtApellido.getText().isEmpty()) {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);
        }
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);
        }
        if (txtNumeroCelular.getText().isEmpty()) {
            txtNumeroCelular.setText("Numero de celular");
            txtNumeroCelular.setForeground(Color.gray);
        }
        if (txtCodigoDocente.getText().isEmpty()) {
            txtCodigoDocente.setText("Codigo docente");
            txtCodigoDocente.setForeground(Color.gray);
        }
        if (txtEdad.getText().isEmpty()) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (txtEntidadSalud.getText().isEmpty()) {
            txtEntidadSalud.setText("Entidad de salud");
            txtEntidadSalud.setForeground(Color.gray);
        }
        if (txtEntidadSalud.getText().isEmpty()) {
            txtEntidadSalud.setText("Entidad de salud");
            txtEntidadSalud.setForeground(Color.gray);
        }
        if (txtNombreDocente.getText().isEmpty()) {
            txtNombreDocente.setText("Nombre");
            txtNombreDocente.setForeground(Color.gray);
        }
        if (txtNombreEstudiante.getText().isEmpty()) {
            txtNombreEstudiante.setText("Nombre");
            txtNombreEstudiante.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtDireccionMousePressed

    private void txtEntidadSaludMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEntidadSaludMousePressed
        if (txtEntidadSalud.getText().equals("Entidad de salud")) {
            txtEntidadSalud.setText("");
            txtEntidadSalud.setForeground(Color.black);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
            txtContrasena.setText("********");
            txtContrasena.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.gray);
        }
        if (txtEdad.getText().isEmpty()) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (txtCodigoEstudiante.getText().isEmpty()) {
            txtCodigoEstudiante.setText("Codigo estudiante");
            txtCodigoEstudiante.setForeground(Color.gray);
        }
        if (txtApellido.getText().isEmpty()) {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);
        }
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);
        }
        if (txtNumeroCelular.getText().isEmpty()) {
            txtNumeroCelular.setText("Numero de celular");
            txtNumeroCelular.setForeground(Color.gray);
        }
        if (txtCodigoDocente.getText().isEmpty()) {
            txtCodigoDocente.setText("Codigo docente");
            txtCodigoDocente.setForeground(Color.gray);
        }
        if (txtEdad.getText().isEmpty()) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (txtNombreDocente.getText().isEmpty()) {
            txtNombreDocente.setText("Nombre");
            txtNombreDocente.setForeground(Color.gray);
        }
        if (txtNombreEstudiante.getText().isEmpty()) {
            txtNombreEstudiante.setText("Nombre");
            txtNombreEstudiante.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtEntidadSaludMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        if (txtCorreo.getText().equals("Correo")) {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.black);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
            txtContrasena.setText("********");
            txtContrasena.setForeground(Color.gray);
        }
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Direccion");
            txtDireccion.setForeground(Color.gray);
        }
        if (txtEdad.getText().isEmpty()) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (txtCodigoEstudiante.getText().isEmpty()) {
            txtCodigoEstudiante.setText("Codigo estudiante");
            txtCodigoEstudiante.setForeground(Color.gray);
        }
        if (txtNombreEstudiante.getText().isEmpty()) {
            txtNombreEstudiante.setText("nombre");
            txtNombreEstudiante.setForeground(Color.gray);
        }
        if (txtApellido.getText().isEmpty()) {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);
        }
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);
        }
        if (txtNumeroCelular.getText().isEmpty()) {
            txtNumeroCelular.setText("Numero de celular");
            txtNumeroCelular.setForeground(Color.gray);
        }
        if (txtCodigoDocente.getText().isEmpty()) {
            txtCodigoDocente.setText("Codigo docente");
            txtCodigoDocente.setForeground(Color.gray);
        }
        if (txtEdad.getText().isEmpty()) {
            txtEdad.setText("Edad");
            txtEdad.setForeground(Color.gray);
        }
        if (txtEntidadSalud.getText().isEmpty()) {
            txtEntidadSalud.setText("Entidad de salud");
            txtEntidadSalud.setForeground(Color.gray);
        }
        if (txtNombreDocente.getText().isEmpty()) {
            txtNombreDocente.setText("Nombre");
            txtNombreDocente.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCorreoMousePressed

    public void cargarTablaDocente() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = new String[]{
            "Codigo docente", "Nombre", "Apellido", "Cedula", "Celular", "Edad", "Direccion", "entidad de salud", "Correo", "Contraseña",};
        model.setColumnIdentifiers(columnas);
        for (int i = 0; i < controladorVentanaAdministrador.getPersonas().getSize(); i++) {
            if (controladorVentanaAdministrador.getPersonas().obtenerDatoIndice(i) instanceof Docente) {
                Docente docente = (Docente) controladorVentanaAdministrador.getPersonas().obtenerDatoIndice(i);
                model.addRow(new Object[]{
                    docente.getCodigoUniversitario(),
                    docente.getNombre(),
                    docente.getApellido(),
                    docente.getCedula(),
                    docente.getNumeroCelular(),
                    docente.getEdad(),
                    docente.getDireccion(),
                    docente.getEntidadSalud(),
                    docente.getCorreo(),
                    docente.getUsuario().getContrasena(),});
            }
        }
        jTabla.setModel(model);
    }

    public void cargarTablaEstudiantes() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = new String[]{
            "Codigo estudiante", "Nombre", "Apellido", "Cedula", "Celular", "Edad", "Direccion", "entidad de salud", "Correo", "Contraseña", "Codigo carrera", "Carrera"
        };
        model.setColumnIdentifiers(columnas);
        for (int i = 0; i < controladorVentanaAdministrador.getPersonas().getSize(); i++) {
            if (controladorVentanaAdministrador.getPersonas().obtenerDatoIndice(i) instanceof Estudiante) {
                Estudiante estudiante = (Estudiante) controladorVentanaAdministrador.getPersonas().obtenerDatoIndice(i);
                model.addRow(new Object[]{
                    estudiante.getCodigoUniversitario(),
                    estudiante.getNombre(),
                    estudiante.getApellido(),
                    estudiante.getCedula(),
                    estudiante.getNumeroCelular(),
                    estudiante.getEdad(),
                    estudiante.getDireccion(),
                    estudiante.getEntidadSalud(),
                    estudiante.getCorreo(),
                    estudiante.getUsuario().getContrasena(),
                    estudiante.getCarrera().getCodigoCarrera(),
                    estudiante.getCarrera().getNombreCarrera(),});

            }
        }
        jTabla.setModel(model);
    }

    public void cargarTablaSalones() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = new String[]{
            "Numero de salon"
        };
        model.setColumnIdentifiers(columnas);
        for (int i = 0; i < controladorVentanaAdministrador.getSalones().getSize(); i++) {
            model.addRow(new Object[]{
                controladorVentanaAdministrador.getSalones().obtenerDatoIndice(i).getCodigoSalon(),});
        }

        jTabla.setModel(model);
    }

    public void cargarTablaMateria() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = new String[]{
            "Codigo materia", "Nombre de las materia"
        };
        model.setColumnIdentifiers(columnas);
        for (int i = 0; i < controladorVentanaAdministrador.getMaterias().getSize(); i++) {
            model.addRow(new Object[]{
                controladorVentanaAdministrador.getMaterias().obtenerDatoIndice(i).getCodigoMateria(),
                controladorVentanaAdministrador.getMaterias().obtenerDatoIndice(i).getNombreMateria(),});
        }

        jTabla.setModel(model);
    }

    public void cargarTablaCursos() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = new String[]{
            "Codigo curso", "Nombre curso", "Codigo Materia", "Nombre materia", "Codigo docente", "Docente", "Intensidad horaria"};
        model.setColumnIdentifiers(columnas);
        for (int i = 0; i < controladorVentanaAdministrador.getCursos().getSize(); i++) {
            model.addRow(new Object[]{
                controladorVentanaAdministrador.getCursos().obtenerDatoIndice(i).getCodigoCurso(),
                controladorVentanaAdministrador.getCursos().obtenerDatoIndice(i).getNombreCurso(),
                controladorVentanaAdministrador.getCursos().obtenerDatoIndice(i).getMateria().getCodigoMateria(),
                controladorVentanaAdministrador.getCursos().obtenerDatoIndice(i).getMateria().getNombreMateria(),
                controladorVentanaAdministrador.getCursos().obtenerDatoIndice(i).getDocente().getCodigoUniversitario(),
                controladorVentanaAdministrador.getCursos().obtenerDatoIndice(i).getDocente().getNombre(),
                controladorVentanaAdministrador.getCursos().obtenerDatoIndice(i).getIntensidadHoraria(),});
        }

        jTabla.setModel(model);
    }

    public void cargarTablaCarreras() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = new String[]{
            "Codigo carrera", "Nombre de carrera"
        };
        model.setColumnIdentifiers(columnas);
        for (int i = 0; i < controladorVentanaAdministrador.getCarreras().getSize(); i++) {
            model.addRow(new Object[]{
                controladorVentanaAdministrador.getCarreras().obtenerDatoIndice(i).getCodigoCarrera(),
                controladorVentanaAdministrador.getCarreras().obtenerDatoIndice(i).getNombreCarrera(),});
        }

        jTabla.setModel(model);
    }

    public void llenarComboxDocente() {
        jComboxDocente.removeAllItems();
        jComboxDocente.addItem("Codigo docente");
        for (int i = 0; i < controladorVentanaAdministrador.getPersonas().getSize(); i++) {
            if (controladorVentanaAdministrador.getPersonas().obtenerDatoIndice(i) instanceof Docente) {
                jComboxDocente.addItem(controladorVentanaAdministrador.getPersonas().obtenerDatoIndice(i).getCodigoUniversitario());
            }
        }
    }

    public void llenarComboxMateria() {
        jComboxMateria.removeAllItems();
        jComboxMateria.addItem("Codigo materia");
        for (int i = 0; i < controladorVentanaAdministrador.getMaterias().getSize(); i++) {
            jComboxMateria.addItem(controladorVentanaAdministrador.getMaterias().obtenerDatoIndice(i).getCodigoMateria());
        }
    }

    public void llenarComboxCarrera() {
        for (int i = 0; i < controladorVentanaAdministrador.getCarreras().getSize(); i++) {
            jComboxCarrera.addItem(controladorVentanaAdministrador.retornarCarreraPos(i).getCodigoCarrera());
        }
    }

    public void predeterminadoDocente() {
        txtCodigoDocente.setText("Codigo docente");
        txtCodigoDocente.setForeground(Color.gray);
        txtNombreDocente.setText("Nombre");
        txtNombreDocente.setForeground(Color.gray);
        txtApellido.setText("Apellido");
        txtApellido.setForeground(Color.gray);
        txtCedula.setText("Cedula");
        txtCedula.setForeground(Color.gray);
        txtCedula.setEnabled(true);
        txtNumeroCelular.setText("Numero de celular");
        txtNumeroCelular.setForeground(Color.gray);
        txtEdad.setText("Edad");
        txtEdad.setForeground(Color.gray);
        txtDireccion.setText("Direccion");
        txtDireccion.setForeground(Color.gray);
        txtEntidadSalud.setText("Entidad de salud");
        txtEntidadSalud.setForeground(Color.gray);
        txtCorreo.setText("Correo");
        txtCorreo.setForeground(Color.gray);
        txtContrasena.setText("********");
        txtContrasena.setForeground(Color.gray);
        jComboxCarrera.setSelectedItem("Curso");

    }

    public void predeterminadoEstudiante() {
        txtCodigoEstudiante.setText("Codigo estudiante");
        txtCodigoEstudiante.setForeground(Color.gray);
        txtNombreEstudiante.setText("Nombre");
        txtNombreEstudiante.setForeground(Color.gray);
        txtApellido.setText("Apellido");
        txtApellido.setForeground(Color.gray);
        txtCedula.setText("Cedula");
        txtCedula.setForeground(Color.gray);
        txtNumeroCelular.setText("Numero de celular");
        txtNumeroCelular.setForeground(Color.gray);
        txtEdad.setText("Edad");
        txtEdad.setForeground(Color.gray);
        txtDireccion.setText("Direccion");
        txtDireccion.setForeground(Color.gray);
        txtEntidadSalud.setText("Entidad de salud");
        txtEntidadSalud.setForeground(Color.gray);
        txtCorreo.setText("Correo");
        txtCorreo.setForeground(Color.gray);
        txtContrasena.setText("********");
        txtContrasena.setForeground(Color.gray);
        jComboxCarrera.setSelectedItem("Carrera");

    }

    public void predeterminadoSalon() {
        txtNumeroSalon.setText("Numero de salon");
        txtNumeroSalon.setForeground(Color.gray);
    }

    public void predeterminadoMateria() {
        txtNombreDocente.setText("Nombre materia");
        txtNombreDocente.setForeground(Color.gray);
        txtCodigoDocente.setText("Codigo materia");
        txtCodigoDocente.setForeground(Color.gray);
    }

    public void predeterminadoCurso() {
        txtNombreDocente.setText("Nombre curso");
        txtNombreDocente.setForeground(Color.gray);
        jcomboBoxIntensidadHoraria.setSelectedItem("Intensidad");
        jComboxMateria.setSelectedItem("Codigo materia");
        jComboxDocente.setSelectedItem("Codigo docente");
        txtCupo.setText("Codigo curso");
        txtCupo.setForeground(Color.gray);
    }

    public void predeterminadoCarrera() {
        txtNombreDocente.setText("Nombre carrera");
        txtNombreDocente.setForeground(Color.gray);
        txtCodigoDocente.setText("Codigo carrera");
        txtCodigoDocente.setForeground(Color.gray);
    }

    public boolean validLtrs(String datos) {
        return datos.matches("[ a-z A-Z ]*");
    }

    public boolean validNums(String datos) {
        return datos.matches("[ 0-9 ]*");
    }

    public void validadorDocen() {
        if (validLtrs(txtNombreDocente.getText())) {

        } else {
            txtNombreDocente.setText("Nombre");
            txtNombreDocente.setForeground(Color.gray);

        }
        if (validLtrs(txtApellido.getText())) {

        } else {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);

        }
        if (validNums(txtCedula.getText())) {

        } else {
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);

        }
        if (validNums(txtNumeroCelular.getText())) {
        } else {
            txtNumeroCelular.setText("Numero de celular");
            txtNumeroCelular.setForeground(Color.gray);
        }
    }

    public void validadorEstu() {
        if (validLtrs(txtNombreEstudiante.getText())) {

        } else {
            txtNombreEstudiante.setText("Nombre");
            txtNombreEstudiante.setForeground(Color.gray);
        }
        if (validLtrs(txtApellido.getText())) {

        } else {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(Color.gray);

        }
        if (validNums(txtCedula.getText())) {

        } else {
            txtCedula.setText("Cedula");
            txtCedula.setForeground(Color.gray);

        }
        if (validNums(txtNumeroCelular.getText())) {
        } else {
            txtNumeroCelular.setText("Numero celular");
            txtNumeroCelular.setForeground(Color.gray);

        }
    }

    public void inicializarDatos() {
        if (jComboPersona.getSelectedIndex() == 0) {
            jSeparatorNumeroCelular2.setVisible(false);
            jcomboBoxIntensidadHoraria.setVisible(false);
            jSeparatorCedula1.setVisible(false);
            jComboxMateria.setVisible(false);
            jComboxDocente.setVisible(false);
            jEliminar.setVisible(false);
            btnEliminar.setVisible(false);
            txtNombreEstudiante.setVisible(false);
            txtCodigoEstudiante.setVisible(false);
            txtCupo.setVisible(false);
            txtNumeroSalon.setVisible(false);
            txtCupo.setVisible(false);
            txtNombreDocente.setVisible(false);
            jSeparadorNombre.setVisible(false);
            txtApellido.setVisible(false);
            jSeparatorApellido.setVisible(false);
            txtCedula.setVisible(false);
            jSeparatorCedula.setVisible(false);
            txtNumeroCelular.setVisible(false);
            jSeparatorNumeroCelular.setVisible(false);
            txtCodigoDocente.setVisible(false);
            jSeparatorDocente.setVisible(false);
            txtContrasena.setVisible(false);
            jSeparatorContrasena.setVisible(false);
            jTabla.setVisible(false);
            jRegistrar.setVisible(false);
            jScrollPane1.setVisible(false);
            btnModificar.setVisible(false);
            jComboxCarrera.setVisible(false);
            jSeparatorCursos.setVisible(false);
            btnAsignarCurso.setVisible(false);
            jAsignarCurso.setVisible(false);
            txtDireccion.setVisible(false);
            txtEntidadSalud.setVisible(false);
            txtEdad.setVisible(false);
            txtCorreo.setVisible(false);
            jSeparatorCursos1.setVisible(false);
            jSeparadorNombre1.setVisible(false);
            jSeparatorNumeroCelular1.setVisible(false);
            jSeparatorDocente5.setVisible(false);
            jSeparatorCursos.setVisible(false);
        }
    }

    public void cargarTablas() {
        cargarTablaDocente();
        cargarTablaCursos();
        cargarTablaMateria();
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAsignarCurso;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnModificar;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JPanel jAsignarCurso;
    private javax.swing.JPanel jCerrar;
    private javax.swing.JComboBox<String> jComboPersona;
    private javax.swing.JComboBox<String> jComboxCarrera;
    private javax.swing.JComboBox<String> jComboxDocente;
    private javax.swing.JComboBox<String> jComboxMateria;
    private javax.swing.JPanel jEliminar;
    private javax.swing.JLabel jLText;
    private javax.swing.JLabel jLbAdministrador;
    private javax.swing.JPanel jModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparadorNombre;
    private javax.swing.JSeparator jSeparadorNombre1;
    private javax.swing.JSeparator jSeparatorApellido;
    private javax.swing.JSeparator jSeparatorCedula;
    private javax.swing.JSeparator jSeparatorCedula1;
    private javax.swing.JSeparator jSeparatorContrasena;
    private javax.swing.JSeparator jSeparatorCursos;
    private javax.swing.JSeparator jSeparatorCursos1;
    private javax.swing.JSeparator jSeparatorDocente;
    private javax.swing.JSeparator jSeparatorDocente5;
    private javax.swing.JSeparator jSeparatorNumeroCelular;
    private javax.swing.JSeparator jSeparatorNumeroCelular1;
    private javax.swing.JSeparator jSeparatorNumeroCelular2;
    private javax.swing.JTable jTabla;
    private javax.swing.JComboBox<String> jcomboBoxIntensidadHoraria;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigoDocente;
    private javax.swing.JTextField txtCodigoEstudiante;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCupo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEntidadSalud;
    private javax.swing.JTextField txtNombreDocente;
    private javax.swing.JTextField txtNombreEstudiante;
    private javax.swing.JTextField txtNumeroCelular;
    private javax.swing.JTextField txtNumeroSalon;
    // End of variables declaration//GEN-END:variables
}
