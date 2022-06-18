package Vistas;

import controladores.ControladorVentanaAsignarCursoEstudiante;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import singleton.Singleton;
import src.Curso;
import src.Docente;
import src.Estudiante;
import src.Persona;
import src.Universidad;
import util.LSE;

/**
 *
 * @author Acer
 */
public class VentanaAsignarCursoEstudiante_1 extends javax.swing.JFrame {

    Universidad universidad;
    DefaultTableModel modelo;
    VentanaLogin ventanaPrincipal;
    Curso curso;
    VentanaAdministradorGeneral ventanaAdministradorGeneral;
    ControladorVentanaAsignarCursoEstudiante controladorVentanaAsignarCursoEstudiante;

    public VentanaAsignarCursoEstudiante_1(VentanaLogin ventanaPrincipal, Curso curso,
            VentanaAdministradorGeneral ventanaAdministradorGeneral) {
        initComponents();
        this.universidad = Singleton.getINSTANCE().getUniversidad();
        this.curso = curso;
        this.modelo = new DefaultTableModel();
        this.ventanaPrincipal = ventanaPrincipal;
        this.ventanaAdministradorGeneral = ventanaAdministradorGeneral;
        this.controladorVentanaAsignarCursoEstudiante = new ControladorVentanaAsignarCursoEstudiante(curso);
        setLocationRelativeTo(this);
        initMetodos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jAsignar = new javax.swing.JPanel();
        btnAsignar = new javax.swing.JLabel();
        jVolver = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        jEliminar = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoEstudiante = new javax.swing.JTextField();
        jSeparadorNombre = new javax.swing.JSeparator();

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel6.setText("Seleccione el tipo que va a registrar: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 80, -1, 16));

        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla);
        if (jTabla.getColumnModel().getColumnCount() > 0) {
            jTabla.getColumnModel().getColumn(0).setResizable(false);
            jTabla.getColumnModel().getColumn(1).setResizable(false);
            jTabla.getColumnModel().getColumn(2).setResizable(false);
            jTabla.getColumnModel().getColumn(3).setResizable(false);
            jTabla.getColumnModel().getColumn(4).setResizable(false);
            jTabla.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 460, 120));

        jAsignar.setBackground(new java.awt.Color(51, 102, 255));

        btnAsignar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnAsignar.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAsignar.setText("ASIGNAR");
        btnAsignar.setToolTipText("");
        btnAsignar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAsignarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jAsignarLayout = new javax.swing.GroupLayout(jAsignar);
        jAsignar.setLayout(jAsignarLayout);
        jAsignarLayout.setHorizontalGroup(
            jAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAsignar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jAsignarLayout.setVerticalGroup(
            jAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAsignar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 80, 30));

        jVolver.setBackground(new java.awt.Color(51, 102, 255));

        btnVolver.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setText("VOLVER");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jVolverLayout = new javax.swing.GroupLayout(jVolver);
        jVolver.setLayout(jVolverLayout);
        jVolverLayout.setHorizontalGroup(
            jVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jVolverLayout.setVerticalGroup(
            jVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, 80, 30));

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
            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jEliminarLayout.setVerticalGroup(
            jEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Estudiantes disponibles");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        jTabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabla1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabla1);
        if (jTabla1.getColumnModel().getColumnCount() > 0) {
            jTabla1.getColumnModel().getColumn(0).setResizable(false);
            jTabla1.getColumnModel().getColumn(1).setResizable(false);
            jTabla1.getColumnModel().getColumn(2).setResizable(false);
            jTabla1.getColumnModel().getColumn(3).setResizable(false);
            jTabla1.getColumnModel().getColumn(4).setResizable(false);
            jTabla1.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 460, 120));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Curso:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 52, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Estudiantes registrados al curso");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel7.setText("Seleccione el tipo que va a registrar: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 80, -1, 16));

        txtCodigoEstudiante.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtCodigoEstudiante.setForeground(new java.awt.Color(153, 153, 153));
        txtCodigoEstudiante.setText("Codigo estudiante");
        txtCodigoEstudiante.setBorder(null);
        txtCodigoEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodigoEstudianteMousePressed(evt);
            }
        });
        jPanel1.add(txtCodigoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 191, -1));
        jPanel1.add(jSeparadorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 191, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void initMetodos() {
        cargarTablaEstudiantesU();
        cargarTablaEstudiantesCurso();
        cargarComboCursos();
        validar();
    }

    public void cargarComboCursos() {
//        for (int i = 0; i < Singleton.getINSTANCE().getCursos().getSize(); i++) {
//            jComboxCurso.addItem(Singleton.getINSTANCE().getCursos().obtenerDatoIndice(i).getNombreCurso());
//        }
    }

    public void restaurarCombox() {
//        jComboxCurso.setSelectedItem("Cursos");
    }

    private void btnAsignarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarMouseClicked
        if (txtCodigoEstudiante.equals("Codigo estudiante")) {
            JOptionPane.showMessageDialog(null, "Por farvor selecciona un estudiante / escribe el codigo del estudiante");
        } else {
            String codigoUniversitario = txtCodigoEstudiante.getText();
            Persona estudiante = controladorVentanaAsignarCursoEstudiante.buscarPersonaCodigo(codigoUniversitario);
            Estudiante estu = (Estudiante) estudiante;
            if (controladorVentanaAsignarCursoEstudiante.buscarCodigoUniversitario(estudiante.getCodigoUniversitario()) == null) {
                if (controladorVentanaAsignarCursoEstudiante.registrarEstudianteCurso(estu)) {
                    JOptionPane.showMessageDialog(null, "El curso " + curso.getNombreCurso() + " fue asginado correctamente al estudiante: " + estudiante.getNombre());
                    cargarTablaEstudiantesU();
                    cargarTablaEstudiantesCurso();
                    universidad.serializarListaCursos();
                    predeterminadoCodigoEstu();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El curso ya esta asinado al estudiante: " + estudiante.getNombre());
            }
        }
    }//GEN-LAST:event_btnAsignarMouseClicked

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        ventanaAdministradorGeneral.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if (txtCodigoEstudiante.getText().equals("Codigo universitario")) {
            JOptionPane.showMessageDialog(this, "Selecciona el estudiante a eliminar");
        } else {
            String codigo = txtCodigoEstudiante.getText();
            Persona estudiante = controladorVentanaAsignarCursoEstudiante.buscarPersonaCodigo(codigo);
            Estudiante estu = (Estudiante) estudiante;
            if (controladorVentanaAsignarCursoEstudiante.eliminarEstudiante(estu, codigo)) {
                JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "El estudiante no se encuentra registrado en el curso, por lo cual no se puede eliminar");
            }
            predeterminadoCodigoEstu();
            restaurarCombox();
            cargarTablaEstudiantesCurso();
            universidad.serializarListaCursos();
            cargarTablaEstudiantesU();
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        int seleccion = jTabla.rowAtPoint(evt.getPoint());
        String codigoEstudiante = jTabla.getValueAt(seleccion, 0).toString();
        txtCodigoEstudiante.setText(codigoEstudiante);
        txtCodigoEstudiante.setForeground(Color.black);
    }//GEN-LAST:event_jTablaMouseClicked

    private void jTabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabla1MouseClicked
        int seleccion = jTabla1.rowAtPoint(evt.getPoint());
        String codigoEstudiante = jTabla1.getValueAt(seleccion, 0).toString();
        txtCodigoEstudiante.setText(codigoEstudiante);
        txtCodigoEstudiante.setForeground(Color.black);
    }//GEN-LAST:event_jTabla1MouseClicked

    public void cargarTablaEstudiantesU() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = new String[]{
            "Codigo", "Nombre", "Apellido", "Cedula", "Celular", "Carrera"
        };
        model.setColumnIdentifiers(columnas);
        for (int i = 0; i < controladorVentanaAsignarCursoEstudiante.getPersonas().getSize(); i++) {
            if (controladorVentanaAsignarCursoEstudiante.getPersonas().obtenerDatoIndice(i) instanceof Estudiante) {
                Estudiante estudiante = (Estudiante) controladorVentanaAsignarCursoEstudiante.getPersonas().obtenerDatoIndice(i);
                if (controladorVentanaAsignarCursoEstudiante.buscarCodigoUniversitario(estudiante.getCodigoUniversitario()) == null) {
                    model.addRow(new Object[]{
                        estudiante.getCodigoUniversitario(),
                        estudiante.getNombre(),
                        estudiante.getApellido(),
                        estudiante.getCedula(),
                        estudiante.getNumeroCelular(),
                        estudiante.getCarrera().getNombreCarrera(),});
                }
            }
        }

        jTabla.setModel(model);
    }

    public void cargarTablaEstudiantesCurso() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = new String[]{
            "Codigo", "Nombre", "Apellido", "Cedula", "Celular", "Carrera"
        };
        model.setColumnIdentifiers(columnas);
        for (int i = 0; i < controladorVentanaAsignarCursoEstudiante.getEstudiantes().getSize(); i++) {
            if (controladorVentanaAsignarCursoEstudiante.getEstudiantes().obtenerDatoIndice(i) instanceof Estudiante) {
                Estudiante estudiante = (Estudiante) controladorVentanaAsignarCursoEstudiante.getPersonas().obtenerDatoIndice(i);
                if (controladorVentanaAsignarCursoEstudiante.buscarCodigoUniversitario(estudiante.getCodigoUniversitario()) != null) {
                    model.addRow(new Object[]{
                        estudiante.getCodigoUniversitario(),
                        estudiante.getNombre(),
                        estudiante.getApellido(),
                        estudiante.getCedula(),
                        estudiante.getNumeroCelular(),
                        estudiante.getCarrera().getNombreCarrera(),});
                }
            }
        }

        jTabla1.setModel(model);
    }

    private void txtCodigoEstudianteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoEstudianteMousePressed
        if (txtCodigoEstudiante.getText().equals("Codigo estudiante")) {
            txtCodigoEstudiante.setText("");
            txtCodigoEstudiante.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCodigoEstudianteMousePressed

    private void predeterminadoCodigoEstu() {
        txtCodigoEstudiante.setText("Codigo estudiante");
        txtCodigoEstudiante.setForeground(Color.gray);
    }

    public void validar() {
        for (int i = 0; i < controladorVentanaAsignarCursoEstudiante.getCursos().getSize(); i++) {
            if (controladorVentanaAsignarCursoEstudiante.getCursos().obtenerDatoIndice(i).getNombreCurso().equals(curso.getNombreCurso())) {
                jLabel7.setText(controladorVentanaAsignarCursoEstudiante.getCursos().obtenerDatoIndice(i).getNombreCurso());
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAsignar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JPanel jAsignar;
    private javax.swing.JPanel jEliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparadorNombre;
    private javax.swing.JTable jTabla;
    private javax.swing.JTable jTabla1;
    private javax.swing.JPanel jVolver;
    private javax.swing.JTextField txtCodigoEstudiante;
    // End of variables declaration//GEN-END:variables
}
