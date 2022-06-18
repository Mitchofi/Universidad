package Vistas;

import controladores.ControladorVentanaEstudiante;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.Curso;
import src.Estudiante;
import src.Persona;
import src.Universidad;

/**
 *
 * @author Acer
 */
public class VentanaEstudiante extends javax.swing.JFrame {

    DefaultTableModel modelo;
    VentanaLogin ventanaPrincipal;
    ControladorVentanaEstudiante controladorVentanaEstudiante;
    private Persona estudiante;

    public VentanaEstudiante(VentanaLogin ventanaPrincipal, Persona estudiante) {
        initComponents();
        this.modelo = new DefaultTableModel();
        this.ventanaPrincipal = ventanaPrincipal;
        this.controladorVentanaEstudiante = new ControladorVentanaEstudiante();
        this.estudiante = estudiante;
        validar();
        cargarTablaNotas();
        setLocationRelativeTo(this);
    }

    public void validar() {
        for (int i = 0; i < controladorVentanaEstudiante.getPersonas().getSize(); i++) {
            if (controladorVentanaEstudiante.getPersonas().obtenerDatoIndice(i).getNombre().equals(estudiante.getNombre())) {
                jlabelNombreEstu.setText(controladorVentanaEstudiante.getPersonas().obtenerDatoIndice(i).getNombre());
            }
        }
    }

    public void cargarTablaNotas() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = new String[]{
            "Codigo curso", "Nombre materia", "Docente", "Corte 1", "Corte 2", "Corte 3", "Definitiva"
        };
        model.setColumnIdentifiers(columnas);
        for (int i = 0; i < controladorVentanaEstudiante.getCursos().getSize(); i++) {
            for (int j = 0; j < controladorVentanaEstudiante.getCursos().obtenerDatoIndice(i).getRegistroNotas().getSize(); j++) {
                if (controladorVentanaEstudiante.getCursos().obtenerDatoIndice(i).getRegistroNotas().obtenerDatoIndice(j).getEstudiante().getCodigoUniversitario().equals(estudiante.getCodigoUniversitario())) {
                    model.addRow(new Object[]{
                        controladorVentanaEstudiante.getCursos().obtenerDatoIndice(j).getCodigoCurso(),
                        controladorVentanaEstudiante.getCursos().obtenerDatoIndice(j).getMateria().getNombreMateria(),
                        controladorVentanaEstudiante.getCursos().obtenerDatoIndice(j).getDocente().getNombre(),
                        controladorVentanaEstudiante.getCursos().obtenerDatoIndice(i).getRegistroNotas().obtenerDatoIndice(j).getNotaUno(),
                        controladorVentanaEstudiante.getCursos().obtenerDatoIndice(i).getRegistroNotas().obtenerDatoIndice(j).getNotaDos(),
                        controladorVentanaEstudiante.getCursos().obtenerDatoIndice(i).getRegistroNotas().obtenerDatoIndice(j).getNotaTres(),
                        controladorVentanaEstudiante.getCursos().obtenerDatoIndice(i).getRegistroNotas().obtenerDatoIndice(j).getNotaFinal(),});
                }
            }
        }
        jTabla.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelBienvenido = new javax.swing.JLabel();
        jlabelNombreEstu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jCerrarSesion = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JLabel();
        jRetirtarCurso = new javax.swing.JPanel();
        btnRetirarCurso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBienvenido.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBienvenido.setText("Bienvenido Estudiante:");
        jPanel1.add(jLabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jlabelNombreEstu.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jlabelNombreEstu.setText("Seleccione el tipo que va a registrar: ");
        jPanel1.add(jlabelNombreEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 16));

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
        jScrollPane1.setViewportView(jTabla);
        if (jTabla.getColumnModel().getColumnCount() > 0) {
            jTabla.getColumnModel().getColumn(0).setResizable(false);
            jTabla.getColumnModel().getColumn(1).setResizable(false);
            jTabla.getColumnModel().getColumn(2).setResizable(false);
            jTabla.getColumnModel().getColumn(3).setResizable(false);
            jTabla.getColumnModel().getColumn(4).setResizable(false);
            jTabla.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 600, 100));

        jCerrarSesion.setBackground(new java.awt.Color(51, 102, 255));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCerrarSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jCerrarSesionLayout.setVerticalGroup(
            jCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));

        jRetirtarCurso.setBackground(new java.awt.Color(51, 102, 255));

        btnRetirarCurso.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnRetirarCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirarCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRetirarCurso.setText("RETIRAR CURSO");
        btnRetirarCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetirarCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetirarCursoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jRetirtarCursoLayout = new javax.swing.GroupLayout(jRetirtarCurso);
        jRetirtarCurso.setLayout(jRetirtarCursoLayout);
        jRetirtarCursoLayout.setHorizontalGroup(
            jRetirtarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRetirtarCursoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRetirarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jRetirtarCursoLayout.setVerticalGroup(
            jRetirtarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRetirarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jRetirtarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        ventanaPrincipal.predeterminado();
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnRetirarCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetirarCursoMouseClicked
        String codigoCurso = String.valueOf(jTabla.getModel().getValueAt(jTabla.getSelectedRow(), 0));
        String nombreCurso = String.valueOf(jTabla.getModel().getValueAt(jTabla.getSelectedRow(), 1));
        Curso auxCurso = controladorVentanaEstudiante.buscarCursoMateria(codigoCurso);
        Estudiante estu = (Estudiante) estudiante;
        for (int i = 0; i < controladorVentanaEstudiante.getCursos().getSize(); i++) {
            for (int j = 0; j < controladorVentanaEstudiante.getCursos().obtenerDatoIndice(i).getRegistroNotas().getSize(); j++) {
                if (auxCurso.eliminarEstudiante(estu, estu.getCodigoUniversitario())) {
                    JOptionPane.showMessageDialog(null, "Se elimino correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No te puedes retirar del curso: " + nombreCurso + " debido a que ya tienes una o mas notas en el mismo");
                }
                cargarTablaNotas();
                Universidad.serializarListaCursos();
            }
        }    }//GEN-LAST:event_btnRetirarCursoMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnRetirarCurso;
    private javax.swing.JPanel jCerrarSesion;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jRetirtarCurso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JLabel jlabelNombreEstu;
    // End of variables declaration//GEN-END:variables
}
