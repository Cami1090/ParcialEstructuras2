/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControladorLocker;
import controlador.ControladorPrincipal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Locker;
import modelo.Objeto;
import util.IList;


/**
 *
 * @author Cami
 */
public class VentanaLocker extends javax.swing.JFrame {

    private ControladorLocker controlador;
    private ControladorPrincipal controladorPrincipal;
    private Locker locker;

    /**
     * Creates new form VentanaAuditoria
     */
    public VentanaLocker(ControladorPrincipal controladorPrincipal, Locker locker) {
        initComponents();
        setTitle("Ventana Gestion locker");
        this.controladorPrincipal = controladorPrincipal;
        controlador = new ControladorLocker(locker);
        this.locker = locker;
        
       llenarTabla();
    }

    private void limpiarCampos() {
       
        txtId.setText("");
        txtNombre.setText("");
    }

    private boolean validarCampos() {
        String nombre = txtNombre.getText();
        String id = txtId.getText();
       

        if (nombre.equals("") || id.equals("")) {
            return false;
        }
        return true;
    }

   private void llenarTabla() {
    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(new Object[]{"ID", "Nombre"});
    
    IList<Objeto> objetos = controlador.getObjetos(); 
    System.out.println("Objetos en el locker: " + objetos.size()); 

    for (int i = 0; i < objetos.size(); i++) {
        Objeto objeto = objetos.get(i); 
        
        model.addRow(new Object[]{
            objeto.getId(),
            objeto.getNombre()
        });
    }

    tabla.setModel(model);
}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatosParticipantes = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        btnDesocupar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDatosParticipantes.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestion de elementos:"));

        txtId.setBorder(javax.swing.BorderFactory.createTitledBorder("Id: "));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnGuardar.setText("CREAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre:"));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosParticipantesLayout = new javax.swing.GroupLayout(panelDatosParticipantes);
        panelDatosParticipantes.setLayout(panelDatosParticipantesLayout);
        panelDatosParticipantesLayout.setHorizontalGroup(
            panelDatosParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosParticipantesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosParticipantesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelDatosParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelDatosParticipantesLayout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosParticipantesLayout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))
                    .addGroup(panelDatosParticipantesLayout.createSequentialGroup()
                        .addGroup(panelDatosParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(txtId))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelDatosParticipantesLayout.setVerticalGroup(
            panelDatosParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosParticipantesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(panelDatosParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelDatosParticipantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Elementos"));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnDesocupar.setText("Desocupar");
        btnDesocupar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesocuparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(panelDatosParticipantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnDesocupar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDatosParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDesocupar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        Objeto aux = new Objeto(id, nombre);
        boolean guardar = controlador.guardarObjeto(aux);
        if(guardar){
            JOptionPane.showMessageDialog(null, "El objeto se guardo");
            llenarTabla();
        }else {
            JOptionPane.showMessageDialog(null, "No se pudo guardar");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
//
  try {
        if (!txtId.getText().isEmpty()) {
            int id = Integer.parseInt(txtId.getText());
           
            Objeto objeto = controlador.buscarObjeto(id);
            
            if (objeto != null) {
             
                txtNombre.setText(objeto.getNombre());
                JOptionPane.showMessageDialog(null, "Objeto encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el objeto con ID: " + id);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un ID válido");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "ID debe ser un número válido");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar: ");
    }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    try {
        if (!txtId.getText().isEmpty()) {
            int id = Integer.parseInt(txtId.getText());

        
            Objeto objeto = controlador.buscarObjeto(id);
            
            if (objeto != null) {
                String nuevoNombre = txtNombre.getText();
                objeto.setNombre(nuevoNombre);
                controlador.editarObjeto(objeto);
                JOptionPane.showMessageDialog(null, "Objeto modificado correctamente");
                llenarTabla();  
            } else {
                JOptionPane.showMessageDialog(null, "El objeto con ID " + id + " no existe.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un ID válido");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "ID debe ser un número válido");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al modificar: ");
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VentanaPrincipal vp = new VentanaPrincipal(this.controladorPrincipal);
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnDesocuparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesocuparActionPerformed
        if (controlador.getObjetos().size() > 0) {
        String contrasenia = JOptionPane.showInputDialog("Ingrese la contraseña");
        if(locker.getContraseña().equals(contrasenia)){
            controlador.desocupar();
            VentanaPrincipal vp = new VentanaPrincipal(controladorPrincipal);
            vp.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
        }   
        }else{
             JOptionPane.showMessageDialog(null, "No hay objetos en el locker para desocupar");
        }
    }//GEN-LAST:event_btnDesocuparActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
 try {
        if (!txtId.getText().isEmpty()) {
            int id = Integer.parseInt(txtId.getText());
            controlador.eliminarObjeto(id);
            JOptionPane.showMessageDialog(null, "Objeto eliminado correctamente");
            llenarTabla();  
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un ID válido");
        }
    } catch (NumberFormatException e) {
        // Manejo de error si el ID no es un número
        JOptionPane.showMessageDialog(null, "ID debe ser un número entero válido");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar: ");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDesocupar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDatosParticipantes;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
