package Vistas;

import controladores.ControladorVentanaLaboratorio;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import src.Laboratorio;
import src.Universidad;

public class VentanaAdministradorLaboratorio extends javax.swing.JFrame implements ActionListener {

    private JButton[][] botonLaboratorios;
    private VentanaLogin ventanaPrincipal;
    private ControladorVentanaLaboratorio controladorVentanaLaboratorio;

    public VentanaAdministradorLaboratorio(VentanaLogin ventanaPrincipal) {
        initComponents();
        setLocationRelativeTo(this);
        this.controladorVentanaLaboratorio = new ControladorVentanaLaboratorio();
        this.ventanaPrincipal = ventanaPrincipal;
        this.botonLaboratorios = new JButton[3][6];
        jLabelText.setEnabled(false);
        jLabelText.setVisible(false);
        cargarLaboratorios();
        validarPosiciones();
    }

    public void cargarLaboratorios() {
        int ancho = 80;
        int alto = 80;
        int separado = 100;
        int texto = 0;
        int contador = 0;
        for (int i = 0; i < botonLaboratorios.length; i++) {
            for (int j = 0; j < botonLaboratorios[i].length; j++) {
                botonLaboratorios[i][j] = new JButton();

                if (i == 0) {
                    if (j < 4) {

                        botonLaboratorios[i][j].setBounds(
                                j * ancho + separado,
                                i * alto + separado,
                                ancho, alto);
                        botonLaboratorios[i][j].setText(String.valueOf(texto));
                        texto++;

                    } else {
                        botonLaboratorios[i][j].setBounds(
                                j * ancho + (separado + separado),
                                i * alto + separado,
                                ancho, alto);
                        botonLaboratorios[i][j].setText(String.valueOf(texto));
                        texto++;
                    }
                }
                if (i == 1) {
                    if (j < 1) {

                        botonLaboratorios[i][j].setBounds(
                                j * ancho + separado,
                                i * alto + separado,
                                ancho, alto);
                        botonLaboratorios[i][j].setText(String.valueOf(texto));
                        texto++;
                        contador++;
                    }
                }
                if (i == 2) {
                    if (j < 4) {

                        botonLaboratorios[i][j].setBounds(
                                j * ancho + separado,
                                i * alto + separado,
                                ancho, alto);
                        botonLaboratorios[i][j].setText(String.valueOf(texto));
                        texto++;
                        contador++;
                    } else {
                        botonLaboratorios[i][j].setBounds(
                                j * ancho + (separado + separado),
                                i * alto + separado,
                                ancho, alto);
                        botonLaboratorios[i][j].setText(String.valueOf(texto));
                        texto++;
                    }
                }
                botonLaboratorios[i][j].addActionListener(this);
                jPanel1.add(botonLaboratorios[i][j]);
            }
        }
    }

    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < botonLaboratorios.length; i++) {
            for (int j = 0; j < botonLaboratorios[i].length; j++) {
                if (ae.getSource().equals(botonLaboratorios[i][j])) {
                    Laboratorio laboratorio = controladorVentanaLaboratorio.obtenerLaboratorio(i, j);

                    if (laboratorio.getDisponibilidad().equals(Laboratorio.DISPONIBLE) && jLabelText.isEnabled() == false) {

                        VentanaGestionarLab ventanaAdminLab = new VentanaGestionarLab(this, i, j);
                        ventanaAdminLab.setVisible(true);
                        ventanaAdminLab.setLocationRelativeTo(null);
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "El motivo por el cual el laboratorio está deshabilitado es :  " + laboratorio.getMotivo());
                    }
                    if (laboratorio.getDisponibilidad().equals(Laboratorio.DESHABILITADO) && jLabelText.isEnabled() == false) {

                        int opcion = JOptionPane.showConfirmDialog(null, "Este laboratorio está deshabilitado, ¿desea habilitarlo?", "Elija", JOptionPane.YES_NO_OPTION);

                        if (opcion == 0) {

                            controladorVentanaLaboratorio.habilitarLaboratorio(i, j);
                            validarPosiciones();
                            break;
                        }
                    }
                }
            }
        }
    }

    public void validarPosiciones() {
        for (int i = 0; i < botonLaboratorios.length; i++) {
            for (int j = 0; j < botonLaboratorios[i].length; j++) {

                Laboratorio laboratorio = controladorVentanaLaboratorio.obtenerLaboratorio(i, j);

                if (laboratorio.getDisponibilidad().equals(Laboratorio.DISPONIBLE)) {
                    botonLaboratorios[i][j].setBackground(Color.white);
                } else if (laboratorio.getDisponibilidad().equals(Laboratorio.DESHABILITADO)) {
                    botonLaboratorios[i][j].setBackground(Color.gray);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCerrarSesion = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JLabel();
        jLabelText = new javax.swing.JLabel();
        jDeshabilitarLab = new javax.swing.JPanel();
        btnGestionarLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        jDeshabilitarLab.setBackground(new java.awt.Color(51, 102, 255));

        btnGestionarLab.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnGestionarLab.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGestionarLab.setText("GESTIONAR HERRAMIENTAS");
        btnGestionarLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionarLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGestionarLabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jDeshabilitarLabLayout = new javax.swing.GroupLayout(jDeshabilitarLab);
        jDeshabilitarLab.setLayout(jDeshabilitarLabLayout);
        jDeshabilitarLabLayout.setHorizontalGroup(
            jDeshabilitarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionarLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDeshabilitarLabLayout.setVerticalGroup(
            jDeshabilitarLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDeshabilitarLabLayout.createSequentialGroup()
                .addComponent(btnGestionarLab, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDeshabilitarLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(474, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDeshabilitarLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        ventanaPrincipal.predeterminado();
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnGestionarLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarLabMouseClicked
        VentanaGestionarHerramienta ventanaAdministradorLaboratorio = new VentanaGestionarHerramienta(this);
        ventanaAdministradorLaboratorio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGestionarLabMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnGestionarLab;
    private javax.swing.JPanel jCerrarSesion;
    private javax.swing.JPanel jDeshabilitarLab;
    private javax.swing.JLabel jLabelText;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
