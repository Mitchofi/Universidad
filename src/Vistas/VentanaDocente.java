package Vistas;

import controladores.ControladorVentanaDocente;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.Curso;
import src.Persona;
import src.RegistroNotas;
import src.Salon;
import util.LSE;

/**
 *
 * @author Acer
 */
public class VentanaDocente extends javax.swing.JFrame {

    DefaultTableModel modelo;
    VentanaLogin ventanaPrincipal;
    ControladorVentanaDocente controladorVentanaDocente;
    Curso curso;
    Salon salon;
    LSE objListar = new LSE();
    private Persona docente;

    public VentanaDocente(VentanaLogin ventanaPrincipal, Persona docente) {
        initComponents();
        this.modelo = new DefaultTableModel();
        this.ventanaPrincipal = ventanaPrincipal;
        this.controladorVentanaDocente = new ControladorVentanaDocente();
        this.docente = docente;
        setLocationRelativeTo(this);
        cargarComboCursos();
        cargarComboSalon();
        cargarTablaEstudiantes();
        validar();
    }

    public void validar() {
        for (int i = 0; i < controladorVentanaDocente.getPersonas().getSize(); i++) {
            if (controladorVentanaDocente.getPersonas().obtenerDatoIndice(i).getNombre().equals(docente.getNombre())) {
                jLabelNombreDocente.setText(controladorVentanaDocente.getPersonas().obtenerDatoIndice(i).getNombre());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboCursos = new javax.swing.JComboBox<>();
        txtNotaUno = new javax.swing.JTextField();
        txtNotaDos = new javax.swing.JTextField();
        txtNotaTres = new javax.swing.JTextField();
        jSeparatorNotaCorteUno = new javax.swing.JSeparator();
        jSeparatorNotaCorteDos = new javax.swing.JSeparator();
        jSeparatorNotaCorteTres = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jCerrarSesion = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JLabel();
        jSeleccionarSalon = new javax.swing.JPanel();
        btnSeleccionarHorario = new javax.swing.JLabel();
        jGuardarNota = new javax.swing.JPanel();
        btnGuardarNota = new javax.swing.JLabel();
        jLabelNombreDocente = new javax.swing.JLabel();
        jLabelNotaFinal = new javax.swing.JLabel();
        jLabelBienvenidoProfesor = new javax.swing.JLabel();
        jLabelTextNotaFinal = new javax.swing.JLabel();
        jComboCursos1 = new javax.swing.JComboBox<>();
        jLabelNombreDocente1 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboCursos.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jComboCursos.setBorder(null);
        jComboCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboCursos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboCursosItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, -1));

        txtNotaUno.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtNotaUno.setForeground(new java.awt.Color(153, 153, 153));
        txtNotaUno.setText("Nota corte 1:");
        txtNotaUno.setBorder(null);
        txtNotaUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNotaUnoMousePressed(evt);
            }
        });
        jPanel1.add(txtNotaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 167, 191, -1));

        txtNotaDos.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtNotaDos.setForeground(new java.awt.Color(153, 153, 153));
        txtNotaDos.setText("Nota corte 2:");
        txtNotaDos.setBorder(null);
        txtNotaDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNotaDosMousePressed(evt);
            }
        });
        jPanel1.add(txtNotaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 204, 191, -1));

        txtNotaTres.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtNotaTres.setForeground(new java.awt.Color(153, 153, 153));
        txtNotaTres.setText("Nota corte 3:");
        txtNotaTres.setToolTipText("");
        txtNotaTres.setBorder(null);
        txtNotaTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNotaTresMousePressed(evt);
            }
        });
        jPanel1.add(txtNotaTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 241, 191, -1));
        jPanel1.add(jSeparatorNotaCorteUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 188, 191, 10));
        jPanel1.add(jSeparatorNotaCorteDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 225, 191, 10));
        jPanel1.add(jSeparatorNotaCorteTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 262, 191, 10));

        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 510, 89));

        jCerrarSesion.setBackground(new java.awt.Color(51, 102, 255));
        jCerrarSesion.setPreferredSize(new java.awt.Dimension(150, 46));

        btnCerrarSesion.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.setText("CERRAR SESION");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jCerrarSesionLayout = new javax.swing.GroupLayout(jCerrarSesion);
        jCerrarSesion.setLayout(jCerrarSesionLayout);
        jCerrarSesionLayout.setHorizontalGroup(
            jCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(jCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
        );
        jCerrarSesionLayout.setVerticalGroup(
            jCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(jCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        jPanel1.add(jCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 216, 170, -1));

        jSeleccionarSalon.setBackground(new java.awt.Color(51, 102, 255));
        jSeleccionarSalon.setPreferredSize(new java.awt.Dimension(150, 46));

        btnSeleccionarHorario.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnSeleccionarHorario.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionarHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSeleccionarHorario.setText("SELECCIONAR HORARIO");
        btnSeleccionarHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionarHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSeleccionarHorarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jSeleccionarSalonLayout = new javax.swing.GroupLayout(jSeleccionarSalon);
        jSeleccionarSalon.setLayout(jSeleccionarSalonLayout);
        jSeleccionarSalonLayout.setHorizontalGroup(
            jSeleccionarSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(jSeleccionarSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnSeleccionarHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
        );
        jSeleccionarSalonLayout.setVerticalGroup(
            jSeleccionarSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(jSeleccionarSalonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnSeleccionarHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        jPanel1.add(jSeleccionarSalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 170, -1));

        jGuardarNota.setBackground(new java.awt.Color(51, 102, 255));
        jGuardarNota.setPreferredSize(new java.awt.Dimension(150, 46));

        btnGuardarNota.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnGuardarNota.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarNota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardarNota.setText("GUARDAR NOTA");
        btnGuardarNota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarNotaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jGuardarNotaLayout = new javax.swing.GroupLayout(jGuardarNota);
        jGuardarNota.setLayout(jGuardarNotaLayout);
        jGuardarNotaLayout.setHorizontalGroup(
            jGuardarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGuardarNota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jGuardarNotaLayout.setVerticalGroup(
            jGuardarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGuardarNota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(jGuardarNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 170, -1));

        jLabelNombreDocente.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabelNombreDocente.setText("Seleccione el salon en el que desea dar clase: ");
        jPanel1.add(jLabelNombreDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, 16));

        jLabelNotaFinal.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabelNotaFinal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNotaFinal.setText("0.0");
        jPanel1.add(jLabelNotaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 60, -1));

        jLabelBienvenidoProfesor.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabelBienvenidoProfesor.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBienvenidoProfesor.setText("Bienvenido Profesor:");
        jPanel1.add(jLabelBienvenidoProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 52, -1, -1));

        jLabelTextNotaFinal.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabelTextNotaFinal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextNotaFinal.setText(" NOTA FINAL:");
        jPanel1.add(jLabelTextNotaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jComboCursos1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jComboCursos1.setBorder(null);
        jComboCursos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboCursos1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboCursos1ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboCursos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 190, -1));

        jLabelNombreDocente1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabelNombreDocente1.setText("Seleccione el tipo que va a registrar: ");
        jPanel1.add(jLabelNombreDocente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 80, -1, 16));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarTablaEstudiantes() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = new String[]{
            "codigo universitario", "Nombre", "Apellido", "Cedula", "celular", "cursos"
        };
        model.setColumnIdentifiers(columnas);
        for (int i = 0; i < controladorVentanaDocente.getCursos().getSize(); i++) {
            for (int j = 0; j < controladorVentanaDocente.getCursos().obtenerDatoIndice(i).getRegistroNotas().getSize(); j++) {
                if (controladorVentanaDocente.buscarCurso(String.valueOf(jComboCursos.getSelectedItem())).getCodigoCurso().equals(controladorVentanaDocente.getCursos().obtenerDatoIndice(i).getCodigoCurso())) {
                    model.addRow(new Object[]{
                        controladorVentanaDocente.getCursos().obtenerDatoIndice(i).getRegistroNotas().obtenerDatoIndice(j).getEstudiante().getCodigoUniversitario(),
                        controladorVentanaDocente.getCursos().obtenerDatoIndice(i).getRegistroNotas().obtenerDatoIndice(j).getEstudiante().getNombre(),
                        controladorVentanaDocente.getCursos().obtenerDatoIndice(i).getRegistroNotas().obtenerDatoIndice(j).getEstudiante().getApellido(),
                        controladorVentanaDocente.getCursos().obtenerDatoIndice(i).getRegistroNotas().obtenerDatoIndice(j).getEstudiante().getCedula(),
                        controladorVentanaDocente.getCursos().obtenerDatoIndice(i).getRegistroNotas().obtenerDatoIndice(j).getEstudiante().getNumeroCelular(),
                        controladorVentanaDocente.getCursos().obtenerDatoIndice(i).getNombreCurso(),});
                }
            }
        }
        jTabla.setModel(model);
    }

    public void cargarComboSalon() {
        for (int i = 0; i < controladorVentanaDocente.getSalones().getSize(); i++) {
            jComboCursos1.addItem(controladorVentanaDocente.getSalones().obtenerDatoIndice(i).getCodigoSalon());
        }
        if (jComboCursos1.getSelectedItem() == null) {
            jComboCursos1.addItem("No tienes cursos asignados");
        }
    }

    public void cargarComboCursos() {
        for (int i = 0; i < controladorVentanaDocente.getCursos().getSize(); i++) {
            if (controladorVentanaDocente.getCursos().obtenerDatoIndice(i).getDocente().getCodigoUniversitario().equals(docente.getCodigoUniversitario())) {
                jComboCursos.addItem(controladorVentanaDocente.getCursos().obtenerDatoIndice(i).getCodigoCurso());
            }
        }
        if (jComboCursos.getSelectedItem() == null) {
            jComboCursos.addItem("No tienes cursos asignados");
        }
    }

    private void jComboCursosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboCursosItemStateChanged
        curso = controladorVentanaDocente.buscarCurso(String.valueOf(jComboCursos.getSelectedItem()));
        cargarTablaEstudiantes();
    }//GEN-LAST:event_jComboCursosItemStateChanged

    private void txtNotaDosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNotaDosMousePressed
        if (txtNotaDos.getText().equals("Nota corte 2:")) {
            txtNotaDos.setText("");
            txtNotaDos.setForeground(Color.black);
        }

        if (txtNotaUno.getText().isEmpty()) {
            txtNotaUno.setText("Nota corte 1:");
            txtNotaUno.setForeground(Color.gray);
        }

        if (txtNotaTres.getText().isEmpty()) {
            txtNotaTres.setText("Nota corte 3:");
            txtNotaTres.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNotaDosMousePressed

    private void txtNotaTresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNotaTresMousePressed
        if (txtNotaTres.getText().equals("Nota corte 3:")) {
            txtNotaTres.setText("");
            txtNotaTres.setForeground(Color.black);
        }

        if (txtNotaDos.getText().isEmpty()) {
            txtNotaDos.setText("Nota corte 2:");
            txtNotaDos.setForeground(Color.gray);
        }

        if (txtNotaUno.getText().isEmpty()) {
            txtNotaUno.setText("Nota corte 1:");
            txtNotaUno.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNotaTresMousePressed

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        ventanaPrincipal.predeterminado();
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void txtNotaUnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNotaUnoMousePressed
        if (txtNotaUno.getText().equals("Nota corte 1:")) {
            txtNotaUno.setText("");
            txtNotaUno.setForeground(Color.black);
        }

        if (txtNotaDos.getText().isEmpty()) {
            txtNotaDos.setText("Nota corte 2:");
            txtNotaDos.setForeground(Color.gray);
        }

        if (txtNotaTres.getText().isEmpty()) {
            txtNotaTres.setText("Nota corte 3:");
            txtNotaTres.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNotaUnoMousePressed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked

        String codigoUniversitario = String.valueOf(jTabla.getModel().getValueAt(jTabla.getSelectedRow(), 0));
        controladorVentanaDocente.setCurso(curso);
        RegistroNotas buscar = controladorVentanaDocente.buscarCalificacion(curso, codigoUniversitario);
        txtNotaUno.setText("" + buscar.getNotaUno());
        txtNotaDos.setText("" + buscar.getNotaDos());
        txtNotaTres.setText("" + buscar.getNotaTres());
        jLabelNotaFinal.setText("" + buscar.getNotaFinal());


     }//GEN-LAST:event_jTablaMouseClicked

    private void btnSeleccionarHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeleccionarHorarioMouseClicked
        Salon salon = controladorVentanaDocente.buscarSalon(String.valueOf(jComboCursos1.getSelectedItem()));
        Curso curso = controladorVentanaDocente.buscarCurso(String.valueOf(jComboCursos.getSelectedItem()));
        VentanaHorario ventanaHorario = new VentanaHorario(this, curso, salon);
        ventanaHorario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSeleccionarHorarioMouseClicked

    private void btnGuardarNotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarNotaMouseClicked
        double notaUno = Double.parseDouble(txtNotaUno.getText());
        double notaDos = Double.parseDouble(txtNotaDos.getText());
        double notaTres = Double.parseDouble(txtNotaTres.getText());
        if (notaUno <= 5.0 && notaDos <= 5.0 && notaTres <= 5.0 && notaUno >= 0.0
                && notaDos >= 0.0 && notaTres >= 0.0) {
            String codigoUniversitario = String.valueOf(jTabla.getModel().getValueAt(jTabla.getSelectedRow(), 0));
            String nombreEstudiante = String.valueOf(jTabla.getModel().getValueAt(jTabla.getSelectedRow(), 1));
            RegistroNotas buscar = controladorVentanaDocente.buscarCalificacion(curso, codigoUniversitario);
            buscar.setNotaUno(notaUno);
            buscar.setNotaDos(notaDos);
            buscar.setNotaTres(notaTres);
            buscar.setNotaFinal(RegistroNotas.notaFinalCalculo(notaUno, notaDos, notaTres, notaUno));
            jLabelNotaFinal.setText(String.valueOf(buscar.getNotaFinal()));
            JOptionPane.showMessageDialog(null, "la nota al estudiante: " + nombreEstudiante + " fue asignada correctamente, lleva un promedio final de: " + buscar.getNotaFinal()
            );
        } else {
            JOptionPane.showMessageDialog(null, "No puedes asignar una nota mayor a 5.0 o menor a 0.0");
        }
        controladorVentanaDocente.serializarListaCursos();        controladorVentanaDocente.serializarListaCursos();    }//GEN-LAST:event_btnGuardarNotaMouseClicked

    private void jComboCursos1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboCursos1ItemStateChanged
        salon = controladorVentanaDocente.buscarSalon(String.valueOf(jComboCursos1.getSelectedItem()));
        cargarTablaEstudiantes();    }//GEN-LAST:event_jComboCursos1ItemStateChanged

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnGuardarNota;
    private javax.swing.JLabel btnSeleccionarHorario;
    private javax.swing.JPanel jCerrarSesion;
    private javax.swing.JComboBox<String> jComboCursos;
    private javax.swing.JComboBox<String> jComboCursos1;
    private javax.swing.JPanel jGuardarNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBienvenidoProfesor;
    private javax.swing.JLabel jLabelNombreDocente;
    private javax.swing.JLabel jLabelNombreDocente1;
    private javax.swing.JLabel jLabelNotaFinal;
    private javax.swing.JLabel jLabelTextNotaFinal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jSeleccionarSalon;
    private javax.swing.JSeparator jSeparatorNotaCorteDos;
    private javax.swing.JSeparator jSeparatorNotaCorteTres;
    private javax.swing.JSeparator jSeparatorNotaCorteUno;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField txtNotaDos;
    private javax.swing.JTextField txtNotaTres;
    private javax.swing.JTextField txtNotaUno;
    // End of variables declaration//GEN-END:variables
}
