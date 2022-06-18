package Vistas;

import controladores.ControladorVentanaRealizarPrestamo;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import singleton.Singleton;
import src.Curso;
import src.Estudiante;
import src.Herramienta;
import src.Laboratorio;
import src.Prestamo;
import src.Universidad;

/**
 *
 * @author Acer
 */
public class VentanaRealizarPrestamo extends javax.swing.JFrame {
    
    Universidad universidad;
    Estudiante estudiante;
    DefaultTableModel modelo;
    Curso curso;
    int fila;
    int columna;
    Laboratorio laboratorio;
    VentanaGestionarLab ventanaGestionarLab;
    ControladorVentanaRealizarPrestamo controladorVentanaRealizarPrestamo;
    
    public VentanaRealizarPrestamo(VentanaGestionarLab ventanaGestionarLab, Estudiante estudiante, int fila, int columna) {
        initComponents();
        this.universidad = Singleton.getINSTANCE().getUniversidad();
        this.curso = curso;
        this.fila = fila;
        this.columna = columna;
        this.estudiante = estudiante;
        this.modelo = new DefaultTableModel();
        this.controladorVentanaRealizarPrestamo = new ControladorVentanaRealizarPrestamo();
        this.laboratorio = controladorVentanaRealizarPrestamo.obtenerLaboratorio(fila, columna);
        this.ventanaGestionarLab = ventanaGestionarLab;
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
        jTablaHerramientasDisponibles = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaHerramientaPrestada = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jEliminarIngreso = new javax.swing.JPanel();
        btnEliminarIngreso = new javax.swing.JLabel();
        jPrestarHerramienta = new javax.swing.JPanel();
        btnPrestamoHerramienta = new javax.swing.JLabel();
        jVolver = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        txtCodigoHerramienta = new javax.swing.JTextField();
        jSeparadorNombre = new javax.swing.JSeparator();
        jLabelTextGetionarHerramientas = new javax.swing.JLabel();
        jLText = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel6.setText("Seleccione el tipo que va a registrar: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 80, -1, 16));

        jTablaHerramientasDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablaHerramientasDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaHerramientasDisponiblesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaHerramientasDisponibles);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 460, 120));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Herramientas disponibles");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        jTablaHerramientaPrestada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaHerramientaPrestadaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablaHerramientaPrestada);
        if (jTablaHerramientaPrestada.getColumnModel().getColumnCount() > 0) {
            jTablaHerramientaPrestada.getColumnModel().getColumn(0).setResizable(false);
            jTablaHerramientaPrestada.getColumnModel().getColumn(1).setResizable(false);
            jTablaHerramientaPrestada.getColumnModel().getColumn(2).setResizable(false);
            jTablaHerramientaPrestada.getColumnModel().getColumn(3).setResizable(false);
            jTablaHerramientaPrestada.getColumnModel().getColumn(4).setResizable(false);
            jTablaHerramientaPrestada.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 460, 120));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 52, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Herramientas prestadas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jEliminarIngreso.setBackground(new java.awt.Color(51, 102, 255));

        btnEliminarIngreso.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnEliminarIngreso.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminarIngreso.setText("RETIRAR HERRAMIENTA");
        btnEliminarIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarIngresoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jEliminarIngresoLayout = new javax.swing.GroupLayout(jEliminarIngreso);
        jEliminarIngreso.setLayout(jEliminarIngresoLayout);
        jEliminarIngresoLayout.setHorizontalGroup(
            jEliminarIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminarIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jEliminarIngresoLayout.setVerticalGroup(
            jEliminarIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jEliminarIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 170, -1));

        jPrestarHerramienta.setBackground(new java.awt.Color(51, 102, 255));

        btnPrestamoHerramienta.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnPrestamoHerramienta.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamoHerramienta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPrestamoHerramienta.setText("PRESTAR HERRAMIENTA");
        btnPrestamoHerramienta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrestamoHerramienta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrestamoHerramientaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPrestarHerramientaLayout = new javax.swing.GroupLayout(jPrestarHerramienta);
        jPrestarHerramienta.setLayout(jPrestarHerramientaLayout);
        jPrestarHerramientaLayout.setHorizontalGroup(
            jPrestarHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPrestamoHerramienta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPrestarHerramientaLayout.setVerticalGroup(
            jPrestarHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPrestamoHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPrestarHerramienta, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, -1, -1));

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
            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jVolverLayout.setVerticalGroup(
            jVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 170, -1));

        txtCodigoHerramienta.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtCodigoHerramienta.setForeground(new java.awt.Color(153, 153, 153));
        txtCodigoHerramienta.setText("Codigo herramienta");
        txtCodigoHerramienta.setBorder(null);
        txtCodigoHerramienta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodigoHerramientaMousePressed(evt);
            }
        });
        txtCodigoHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoHerramientaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoHerramienta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 191, -1));
        jPanel1.add(jSeparadorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 191, 10));

        jLabelTextGetionarHerramientas.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabelTextGetionarHerramientas.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextGetionarHerramientas.setText("GESTIONAR PRESTAMOS");
        jPanel1.add(jLabelTextGetionarHerramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLText.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLText.setText("Seleccione en la tabla la herramienta:");
        jPanel1.add(jLText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 16));

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
    public void initMetodos() {
        cargarTablasHerramientasDisponibles();
        cargarTablasHerramientasPrestadas();
    }
    

    private void jTablaHerramientasDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaHerramientasDisponiblesMouseClicked
        int seleccion = jTablaHerramientasDisponibles.rowAtPoint(evt.getPoint());
        String codigoEstudiante = jTablaHerramientasDisponibles.getValueAt(seleccion, 0).toString();
        txtCodigoHerramienta.setText(codigoEstudiante);
        txtCodigoHerramienta.setForeground(Color.black);
    }//GEN-LAST:event_jTablaHerramientasDisponiblesMouseClicked

    private void jTablaHerramientaPrestadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaHerramientaPrestadaMouseClicked
        int seleccion = jTablaHerramientaPrestada.rowAtPoint(evt.getPoint());
        String codigoEstudiante = jTablaHerramientaPrestada.getValueAt(seleccion, 0).toString();
        txtCodigoHerramienta.setText(codigoEstudiante);
        txtCodigoHerramienta.setForeground(Color.black);
    }//GEN-LAST:event_jTablaHerramientaPrestadaMouseClicked

    private void btnEliminarIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarIngresoMouseClicked
        if (txtCodigoHerramienta.getText().equals("Codigo herramienta")) {
            JOptionPane.showMessageDialog(this, "Selecciona la herramienta a retirar");
        } else {
            String codigo = txtCodigoHerramienta.getText();
            Herramienta herramienta = controladorVentanaRealizarPrestamo.buscarHerramienta(codigo);
            controladorVentanaRealizarPrestamo.retirarHerramientaEstudiante(herramienta, fila, columna);
            JOptionPane.showMessageDialog(null, "La herramienta se " + herramienta.getNombre() + " se retiro correctamente");
            cargarTablasHerramientasPrestadas();
            cargarTablasHerramientasDisponibles();
        }
    }//GEN-LAST:event_btnEliminarIngresoMouseClicked

    private void btnPrestamoHerramientaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestamoHerramientaMouseClicked
        if (txtCodigoHerramienta.getText().equals("Codigo herramienta")) {
            JOptionPane.showMessageDialog(null, "Por farvor selecciona un estudiante / escribe el codigo de la herramienta");
        } else {
            String codigoHerramienta = txtCodigoHerramienta.getText();
            Herramienta herramienta = controladorVentanaRealizarPrestamo.buscarHerramienta(codigoHerramienta);
            if (herramienta != null) {
                Prestamo prestamo = new Prestamo(estudiante, herramienta);
                if (controladorVentanaRealizarPrestamo.registrarEstudiantePrestamo(estudiante, herramienta, fila, columna)) {
                    JOptionPane.showMessageDialog(null, "La herrmmienta " + prestamo.getHerramientas().getNombre() + " fue prestado al estudiante: " + estudiante.getNombre());
                } else {
                    JOptionPane.showMessageDialog(null, "La herramienta que buscas ya fue prestada a otro estudiante");
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo encontrar la herramienta");
            }
            cargarTablasHerramientasPrestadas();
            cargarTablasHerramientasDisponibles();
        }
    }//GEN-LAST:event_btnPrestamoHerramientaMouseClicked

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        ventanaGestionarLab.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void txtCodigoHerramientaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoHerramientaMousePressed
        if (txtCodigoHerramienta.getText().equals("Codigo herramienta")) {
            txtCodigoHerramienta.setText("");
            txtCodigoHerramienta.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCodigoHerramientaMousePressed

    private void txtCodigoHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoHerramientaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoHerramientaActionPerformed
    
    public void cargarTablasHerramientasDisponibles() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = new String[]{
            "Codigo herramienta", "Nombre"
        };
        model.setColumnIdentifiers(columnas);
        for (int i = 0; i < controladorVentanaRealizarPrestamo.getHerramientas().getSize(); i++) {
            if (controladorVentanaRealizarPrestamo.getHerramientas().obtenerDatoIndice(i).getDisponibilidad().equals("Disponible")) {
                model.addRow(new Object[]{
                    controladorVentanaRealizarPrestamo.getHerramientas().obtenerDatoIndice(i).getCodigoHerramienta(),
                    controladorVentanaRealizarPrestamo.getHerramientas().obtenerDatoIndice(i).getNombre(),});
            }
        }
        jTablaHerramientasDisponibles.setModel(model);
    }
    
    public void cargarTablasHerramientasPrestadas() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = new String[]{
            "Codigo herramienta", "Nombre herramienta", "Codigo estudiante", "Nombre"
        };
        model.setColumnIdentifiers(columnas);
        for (int i = 0;
                i < controladorVentanaRealizarPrestamo.obtenerLaboratorio(fila, columna)
                        .getPrestamoEstudiante().getSize(); i++) {
            if (controladorVentanaRealizarPrestamo.obtenerLaboratorio(fila, columna).getPrestamoEstudiante().obtenerDatoIndice(i).getEstduiante() != null) {
                if (controladorVentanaRealizarPrestamo.obtenerLaboratorio(fila, columna).getPrestamoEstudiante().obtenerDatoIndice(i).getEstduiante().getCodigoUniversitario().equals(estudiante.getCodigoUniversitario())) {
                    model.addRow(new Object[]{
                        controladorVentanaRealizarPrestamo.obtenerLaboratorio(fila, columna).getPrestamoEstudiante().obtenerDatoIndice(i).getHerramientas().getCodigoHerramienta(),
                        controladorVentanaRealizarPrestamo.obtenerLaboratorio(fila, columna).getPrestamoEstudiante().obtenerDatoIndice(i).getHerramientas().getNombre(),
                        controladorVentanaRealizarPrestamo.obtenerLaboratorio(fila, columna).getPrestamoEstudiante().obtenerDatoIndice(i).getEstduiante().getCodigoUniversitario(),
                        controladorVentanaRealizarPrestamo.obtenerLaboratorio(fila, columna).getPrestamoEstudiante().obtenerDatoIndice(i).getEstduiante().getNombre(),});
                }
            }
        }
        
        jTablaHerramientaPrestada.setModel(model);
    }
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEliminarIngreso;
    private javax.swing.JLabel btnPrestamoHerramienta;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JPanel jEliminarIngreso;
    private javax.swing.JLabel jLText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTextGetionarHerramientas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPrestarHerramienta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparadorNombre;
    private javax.swing.JTable jTablaHerramientaPrestada;
    private javax.swing.JTable jTablaHerramientasDisponibles;
    private javax.swing.JPanel jVolver;
    private javax.swing.JTextField txtCodigoHerramienta;
    // End of variables declaration//GEN-END:variables
}
