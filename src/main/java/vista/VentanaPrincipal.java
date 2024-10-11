/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControladorPrincipal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modelo.Locker;

/**
 *
 * @author Cami
 */
public class VentanaPrincipal extends javax.swing.JFrame implements ActionListener {

    JButton[][] botones;
    ControladorPrincipal controlador;

    /**
     * Creates new form VentanaPrincipal
     *
     * @param controller
     */
    public VentanaPrincipal(ControladorPrincipal controller) {
        initComponents();
        setLocationRelativeTo(this);
        this.controlador = controller == null ? new ControladorPrincipal() : controller;
        botones = new JButton[3][5];
        dibujarBotones();
        pintarBotones();
    }

//    private void dibujarBotones() {
//        int separado = 30; // Espacio entre los botones
//        int ancho = 60;
//        int alto = 40;
//        int texto = 1; // Contador para el texto de los botones
//
//        for (int i = 0; i < botones.length; i++) {
//            for (int j = 0; j < botones[i].length; j++) {
//                // Si es la posición central (fila 1, columna 2), no se crea el botón
//                if (!(i == 1 && j == 2)) {
//                    botones[i][j] = new JButton();
//
//                    botones[i][j].setBounds(
//                        ancho * j + separado,
//                        alto * i + separado,
//                        ancho,
//                        alto);
//
//                    botones[i][j].setText(String.valueOf(texto));
//                    botones[i][j].addActionListener(this);
//
//                    panelBotones.add(botones[i][j]);
//
//                    // Incrementar el texto para el siguiente botón
//                    texto++; 
//
//                    // Cuando llegues al botón 5, salta a 11
//                    if (texto == 6) {
//                        texto = 11;
//                    }
//
//                    // Cuando llegues al botón 14, salta a 21
//                    if (texto == 15) {
//                        texto = 21;
//                    }
//                }
//            }
//        }
//    }
    
    private void dibujarBotones() {
        int separado = 20;
        int ancho = 60;
        int alto = 60;
        int texto = 1;
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j] = new JButton();
                
                botones[i][j].setBounds(
                        ancho * j + separado, 
                        alto * i + separado,
                        ancho, alto);
                botones[i][j].setText(String.valueOf(texto));
                botones[i][j].addActionListener(this);
                panelBotones.add(botones[i][j]);
                texto++;
            }
        }
    }


    private void pintarBotones() {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                Locker locker  = controlador.entregarLocker(i, j);
                if (locker != null && locker.getId()!= 0 && locker.getNombre() != null && locker.getContraseña() != null) {//Verifica que el locker este asignado
                    botones[i][j].setBackground(Color.BLUE);
                    if (locker.validarOcupado()) {//Verifica que en el locker este ocupado
                        botones[i][j].setBackground(Color.GREEN);
                    }
                } else {
                    botones[i][j].setBackground(Color.WHITE);
                }
            }
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (e.getSource().equals(botones[i][j])) {
                    int fila = i;
                    int columna = j;
                    Locker locker = controlador.entregarLocker(fila, columna);
                    if(locker.getContraseña() == null){
                        VentanaAsignacion va = new VentanaAsignacion(controlador, locker);
                        va.setVisible(true);
                        this.dispose();
                    }else{
                        VentanaContrasena vc  = new VentanaContrasena(this.controlador, locker);
                        vc.setVisible(true);
                        this.dispose();
                    }
                }
            }
        }
    }
   
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null).setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBotones.setBorder(javax.swing.BorderFactory.createTitledBorder("Lockers"));

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelBotones;
    // End of variables declaration//GEN-END:variables
    
}

