package Vistas;

import controladores.ControladorVentanaPrincipal;
import java.awt.Color;
import javax.swing.JOptionPane;
import src.Usuario;

/**
 * &
 *
 * @author Acer
 */
public class VentanaLogin extends javax.swing.JFrame {

    private ControladorVentanaPrincipal controladorVentanaPrincipal;
    
    public VentanaLogin() {
        initComponents();   
        setLocationRelativeTo(this);
        this.controladorVentanaPrincipal = new ControladorVentanaPrincipal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jLabelIniciarSesion = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparadorUsuario = new javax.swing.JSeparator();
        jSeparadorContrasena = new javax.swing.JSeparator();
        txtContrasena = new javax.swing.JPasswordField();
        jPanelIngresar = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgenLogin.png"))); // NOI18N

        jLabelIniciarSesion.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabelIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        jLabelIniciarSesion.setText("INCIAR SESION");

        txtUsuario.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("Codigo Universitario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });

        txtContrasena.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(153, 153, 153));
        txtContrasena.setText("********");
        txtContrasena.setBorder(null);
        txtContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContrasenaMousePressed(evt);
            }
        });

        jPanelIngresar.setBackground(new java.awt.Color(51, 102, 255));

        btnIngresar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIngresar.setText("INGRESAR");
        btnIngresar.setToolTipText("");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelIngresarLayout = new javax.swing.GroupLayout(jPanelIngresar);
        jPanelIngresar.setLayout(jPanelIngresarLayout);
        jPanelIngresarLayout.setHorizontalGroup(
            jPanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );
        jPanelIngresarLayout.setVerticalGroup(
            jPanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparadorUsuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                        .addComponent(jSeparadorContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelIniciarSesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jLabelImagen))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabelIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparadorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparadorContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelImagen)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if (txtUsuario.getText().equals("Codigo Universitario")) {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
            txtContrasena.setText("********");
            txtContrasena.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContrasenaMousePressed
        if (String.valueOf(txtContrasena.getPassword()).equals("********")) {
            txtContrasena.setText("");
            txtContrasena.setForeground(Color.black);
        }
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Codigo Universitario");
            txtUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContrasenaMousePressed

    public void predeterminado() {
        txtContrasena.setText("********");
        txtContrasena.setForeground(Color.gray);
        txtUsuario.setText("Codigo Universitario");
        txtUsuario.setForeground(Color.gray);

    }

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        String nombre = txtUsuario.getText();
        String contrasena = String.valueOf(txtContrasena.getPassword());
        Usuario usuario = new Usuario(nombre, contrasena);
        int casos = controladorVentanaPrincipal.getUniversidad().login(usuario);
        switch (casos) {
            case 1:
                JOptionPane.showMessageDialog(null, "Usuario/contraeña incorrecta");
                break;
            case 2:
                VentanaAdministradorGeneral ventana = new VentanaAdministradorGeneral(this);
                ventana.setVisible(true);
                this.dispose();
                break;
            case 3:
                VentanaAdministradorLaboratorio ventanaLaboratorio = new VentanaAdministradorLaboratorio(this);
                ventanaLaboratorio.setVisible(true);
                this.dispose();
                break;
            case 4:
                VentanaDocente ventanaDocente = new VentanaDocente(this, controladorVentanaPrincipal.buscarDocenteCuenta(usuario));
                ventanaDocente.setVisible(true);
                this.dispose();
                break;
            case 5:
                VentanaEstudiante ventanaEstudiante = new VentanaEstudiante(this, controladorVentanaPrincipal.buscarEstudianteCuenta(usuario));
                ventanaEstudiante.setVisible(true);
                this.dispose();
                break;
        }
    }//GEN-LAST:event_btnIngresarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnIngresar;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelIniciarSesion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelIngresar;
    private javax.swing.JSeparator jSeparadorContrasena;
    private javax.swing.JSeparator jSeparadorUsuario;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
