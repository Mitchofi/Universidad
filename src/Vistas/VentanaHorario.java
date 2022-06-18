package Vistas;

import controladores.ControladorVentanaHorario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import src.BloqueDeHora;
import src.Curso;
import src.Horario;
import src.Persona;
import src.Salon;

public class VentanaHorario extends javax.swing.JFrame implements ActionListener {

    private JButton[][] botonesHorario;
    private VentanaDocente ventanaDocente;
    private ControladorVentanaHorario controladorVentanaHorario;
    private Persona docente;
    private Curso curso;
    private Salon salon;

    public VentanaHorario(VentanaDocente ventanaDocente, Curso curso, Salon salon) {
        initComponents();
        setLocationRelativeTo(this);
        this.controladorVentanaHorario = new ControladorVentanaHorario(salon);
        this.ventanaDocente = ventanaDocente;
        this.botonesHorario = new JButton[8][6];
        this.salon = salon;
        this.docente = docente;
        this.curso = curso;
        jLabelText.setEnabled(false);
        jLabelText.setVisible(false);
        cargarLaboratorios();
        validarPosiciones();
    }

    public void cargarLaboratorios() {
        int ancho = 100;
        int alto = 45;
        int separado = 100;
        int texto = 0;
        String hh = "HH";
        int contador = 0;
        for (int i = 0; i < botonesHorario.length; i++) {
            for (int j = 0; j < botonesHorario[i].length; j++) {
                botonesHorario[i][j] = new JButton();
                if (j > 0 && j < 2) {
                    botonesHorario[i][j].setBounds(
                            j * ancho + (separado - 165),
                            i * alto + separado,
                            ancho, alto
                    );
                } else if (j > 1 && j < 3) {
                    botonesHorario[i][j].setBounds(
                            j * ancho + (separado - 150),
                            i * alto + separado,
                            ancho, alto
                    );
                } else if (j > 2 && j < 4) {
                    botonesHorario[i][j].setBounds(
                            j * ancho + (separado - 137),
                            i * alto + separado,
                            ancho, alto
                    );

                } else if (j > 3 && j < 5) {
                    botonesHorario[i][j].setBounds(
                            j * ancho + (separado - 124),
                            i * alto + separado,
                            ancho, alto
                    );
                } else if (j > 4 && j < 6) {
                    botonesHorario[i][j].setBounds(
                            j * ancho + (separado - 111),
                            i * alto + separado,
                            ancho, alto
                    );
                } else if (j > 5 && j < 7) {
                    botonesHorario[i][j].setBounds(
                            j * ancho + (separado - 98),
                            i * alto + separado,
                            ancho, alto
                    );
                } else {
                    botonesHorario[i][j].setBounds(
                            j * ancho + (separado + 505),
                            i * alto + separado,
                            ancho, alto
                    );
                }
                botonesHorario[i][j].setText(String.valueOf("0" + texto + hh + "00"));
                botonesHorario[i][j].addActionListener(this);
                jPanel1.add(botonesHorario[i][j]);
            }
            texto++;
        }
    }

    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < botonesHorario.length; i++) {
            for (int j = 0; j < botonesHorario[i].length; j++) {
                if (ae.getSource().equals(botonesHorario[i][j])) {
                    Curso curso = this.curso;
                    Horario hora = controladorVentanaHorario.obtenerHora(i, j);

                    int opcion = JOptionPane.showConfirmDialog(null, "Desea asignar este espacio para el curso de " + curso.getNombreCurso());
                    if (opcion == 0) {
                        if (hora.getEstado().equals(Horario.HORA_DISPONIBLE)) {
                            hora.setCurso(curso);
                            hora.setEstado(Horario.HORA_OCUPADA);
                            curso.setIntensidadHoraria(curso.getIntensidadHoraria() - 1);
                            validarPosiciones();
                        } else if (hora.getEstado().equals(Horario.HORA_DISPONIBLE) && hora.getCurso().getCodigoCurso().equals(this.curso.getCodigoCurso())) {
                            JOptionPane.showMessageDialog(null, "Este bloque ya corresponde a este curso.");
                        }
                    }
                    if (opcion == 1) {

                    }
                }
            }

        }
    }

    public void validarPosiciones() {

//        for (int i = 0; i < botonesHorario.length; i++) {
//            for (int j = 0; j < botonesHorario[i].length; j++) {
//
//                Horario hora = controladorVentanaHorario.obtenerHora(i, j);
//
//                if (hora.getEstado().equals(Horario.HORA_DISPONIBLE)) {
//                    botonesHorario[i][j].setBackground(Color.GRAY);
//                } else if (hora.getEstado().equals(Horario.HORA_OCUPADA) && !(hora.getCurso().getDocente().getCodigoUniversitario().equals(docente.getCodigoUniversitario()))) {
//                    botonesHorario[i][j].setBackground(Color.red);
//                } else if (hora.getEstado().equals(BloqueDeHora.BLOQUE_OCUPADO) && !hora.getCurso().getCodigoCurso().equals(curso.getCodigoCurso())) {
//                    botonesHorario[i][j].setBackground(Color.BLUE);
//                    botonesHorario[i][j].setText(hora.getCurso().getMateria().getNombreMateria());
//                } else if (hora.getEstado().equals(BloqueDeHora.BLOQUE_OCUPADO) && hora.getCurso().getDocente().getCodigoUniversitario().equals(docente.getCodigoUniversitario()) && hora.getCurso().getCodigoCurso().equals(curso.getCodigoCurso())) {
//                    botonesHorario[i][j].setBackground(Color.green);
//                    botonesHorario[i][j].setText(hora.getCurso().getMateria().getNombreMateria());
//                }
//            }
//        }
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
        btnVolver = new javax.swing.JLabel();
        jLabelText = new javax.swing.JLabel();
        jDeshabilitarLab1 = new javax.swing.JPanel();
        btnGestionarLab1 = new javax.swing.JLabel();
        jDeshabilitarLab2 = new javax.swing.JPanel();
        btnGestionarLab2 = new javax.swing.JLabel();
        jDeshabilitarLab3 = new javax.swing.JPanel();
        btnGestionarLab3 = new javax.swing.JLabel();
        jDeshabilitarLab4 = new javax.swing.JPanel();
        btnGestionarLab4 = new javax.swing.JLabel();
        jDeshabilitarLab5 = new javax.swing.JPanel();
        btnGestionarLab5 = new javax.swing.JLabel();
        jDeshabilitarLab6 = new javax.swing.JPanel();
        btnGestionarLab6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jCerrarSesion.setBackground(new java.awt.Color(51, 102, 255));

        btnVolver.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setText("VOLVER");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jCerrarSesionLayout = new javax.swing.GroupLayout(jCerrarSesion);
        jCerrarSesion.setLayout(jCerrarSesionLayout);
        jCerrarSesionLayout.setHorizontalGroup(
            jCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
        );
        jCerrarSesionLayout.setVerticalGroup(
            jCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDeshabilitarLab1.setBackground(new java.awt.Color(51, 102, 255));

        btnGestionarLab1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnGestionarLab1.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarLab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGestionarLab1.setText("LUNES");

        javax.swing.GroupLayout jDeshabilitarLab1Layout = new javax.swing.GroupLayout(jDeshabilitarLab1);
        jDeshabilitarLab1.setLayout(jDeshabilitarLab1Layout);
        jDeshabilitarLab1Layout.setHorizontalGroup(
            jDeshabilitarLab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionarLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDeshabilitarLab1Layout.setVerticalGroup(
            jDeshabilitarLab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionarLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDeshabilitarLab2.setBackground(new java.awt.Color(51, 102, 255));

        btnGestionarLab2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnGestionarLab2.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarLab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGestionarLab2.setText("MARTES");

        javax.swing.GroupLayout jDeshabilitarLab2Layout = new javax.swing.GroupLayout(jDeshabilitarLab2);
        jDeshabilitarLab2.setLayout(jDeshabilitarLab2Layout);
        jDeshabilitarLab2Layout.setHorizontalGroup(
            jDeshabilitarLab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionarLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDeshabilitarLab2Layout.setVerticalGroup(
            jDeshabilitarLab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionarLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDeshabilitarLab3.setBackground(new java.awt.Color(51, 102, 255));

        btnGestionarLab3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnGestionarLab3.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarLab3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGestionarLab3.setText("MIERCOLES");

        javax.swing.GroupLayout jDeshabilitarLab3Layout = new javax.swing.GroupLayout(jDeshabilitarLab3);
        jDeshabilitarLab3.setLayout(jDeshabilitarLab3Layout);
        jDeshabilitarLab3Layout.setHorizontalGroup(
            jDeshabilitarLab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionarLab3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDeshabilitarLab3Layout.setVerticalGroup(
            jDeshabilitarLab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionarLab3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDeshabilitarLab4.setBackground(new java.awt.Color(51, 102, 255));

        btnGestionarLab4.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnGestionarLab4.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarLab4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGestionarLab4.setText("JUEVES");

        javax.swing.GroupLayout jDeshabilitarLab4Layout = new javax.swing.GroupLayout(jDeshabilitarLab4);
        jDeshabilitarLab4.setLayout(jDeshabilitarLab4Layout);
        jDeshabilitarLab4Layout.setHorizontalGroup(
            jDeshabilitarLab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionarLab4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDeshabilitarLab4Layout.setVerticalGroup(
            jDeshabilitarLab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionarLab4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDeshabilitarLab5.setBackground(new java.awt.Color(51, 102, 255));

        btnGestionarLab5.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnGestionarLab5.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarLab5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGestionarLab5.setText("VIERNES");

        javax.swing.GroupLayout jDeshabilitarLab5Layout = new javax.swing.GroupLayout(jDeshabilitarLab5);
        jDeshabilitarLab5.setLayout(jDeshabilitarLab5Layout);
        jDeshabilitarLab5Layout.setHorizontalGroup(
            jDeshabilitarLab5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionarLab5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDeshabilitarLab5Layout.setVerticalGroup(
            jDeshabilitarLab5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionarLab5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDeshabilitarLab6.setBackground(new java.awt.Color(51, 102, 255));

        btnGestionarLab6.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnGestionarLab6.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarLab6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGestionarLab6.setText("SABADO");

        javax.swing.GroupLayout jDeshabilitarLab6Layout = new javax.swing.GroupLayout(jDeshabilitarLab6);
        jDeshabilitarLab6.setLayout(jDeshabilitarLab6Layout);
        jDeshabilitarLab6Layout.setHorizontalGroup(
            jDeshabilitarLab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionarLab6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDeshabilitarLab6Layout.setVerticalGroup(
            jDeshabilitarLab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionarLab6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(jLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(jCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jDeshabilitarLab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDeshabilitarLab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDeshabilitarLab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDeshabilitarLab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDeshabilitarLab5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDeshabilitarLab6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDeshabilitarLab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDeshabilitarLab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDeshabilitarLab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDeshabilitarLab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDeshabilitarLab5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDeshabilitarLab6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 400, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        ventanaDocente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnGestionarLab1;
    private javax.swing.JLabel btnGestionarLab2;
    private javax.swing.JLabel btnGestionarLab3;
    private javax.swing.JLabel btnGestionarLab4;
    private javax.swing.JLabel btnGestionarLab5;
    private javax.swing.JLabel btnGestionarLab6;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JPanel jCerrarSesion;
    private javax.swing.JPanel jDeshabilitarLab1;
    private javax.swing.JPanel jDeshabilitarLab2;
    private javax.swing.JPanel jDeshabilitarLab3;
    private javax.swing.JPanel jDeshabilitarLab4;
    private javax.swing.JPanel jDeshabilitarLab5;
    private javax.swing.JPanel jDeshabilitarLab6;
    private javax.swing.JLabel jLabelText;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
