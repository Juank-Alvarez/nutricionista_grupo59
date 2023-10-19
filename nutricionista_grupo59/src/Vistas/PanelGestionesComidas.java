
package Vistas;

import accesoADatos.ComidaData;
import entidades.Comida;
import javax.swing.JOptionPane;


public class PanelGestionesComidas extends javax.swing.JPanel {

   
    public PanelGestionesComidas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jbLimpiarCampos = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbEstado = new javax.swing.JRadioButton();
        jtNombreComida = new javax.swing.JTextField();
        jtDetalle = new javax.swing.JTextField();
        jtCantCalorias = new javax.swing.JTextField();

        jLabel1.setText("Gestion Comidas");

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbLimpiarCampos.setText("Limpiar Campos");
        jbLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarCamposActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre Comida");

        jLabel3.setText("Detalle");

        jLabel4.setText("Cantidad Calorias");

        jLabel5.setText("Estado");

        jtNombreComida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreComidaKeyTyped(evt);
            }
        });

        jtCantCalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCantCaloriasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbEstado)
                            .addComponent(jtDetalle)
                            .addComponent(jtNombreComida)
                            .addComponent(jtCantCalorias, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jbLimpiarCampos)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jLabel2)
                    .addComponent(jtNombreComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jbModificar)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtCantCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbEstado))
                .addGap(12, 12, 12)
                .addComponent(jbBuscar)
                .addGap(18, 18, 18)
                .addComponent(jbLimpiarCampos)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        ComidaData cm= new ComidaData();
        Comida comi = new Comida();
        comi = cm.buscarNombreComida(jtNombreComida.getText());
        
        if (comi == null){
            JOptionPane.showMessageDialog(this,"La comida no existe");
        }else{
            
            jtDetalle.setText(comi.getDetalle());
            jtCantCalorias.setText(Integer.toString(comi.getCantCalorias()));
            rbEstado.setSelected(comi.isEstado());
        }        
            
            
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        
        boolean b = false;
        
        if (jtNombreComida.getText().isEmpty() || jtDetalle.getText().isEmpty() || jtCantCalorias.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
            return;
        
        }
        try {
            Comida comi = new Comida();
            Comida comidas = new Comida();
            ComidaData cm = new ComidaData();
            comi = cm.buscarNombreComida(jtNombreComida.getText());
            if (comi == null) {
                
                comidas.setNombre(jtNombreComida.getText());
                comidas.setDetalle(jtDetalle.getText());
                comidas.setCantCalorias(Integer.parseInt(jtCantCalorias.getText()));
                comidas.setEstado(rbEstado.isSelected());

                cm.guardarComida(comidas);
                b = true;
            } else {
                comi.setNombre(jtNombreComida.getText());
                comi.setDetalle(jtDetalle.getText());
                
                comi.setCantCalorias(Integer.parseInt(jtCantCalorias.getText()));
                comi.setEstado(rbEstado.isSelected());
                cm.modificarComida(comi);
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos validos");
        }
       
                                            

        
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
    
        if (jtNombreComida.getText().isEmpty() || jtDetalle.getText().isEmpty() || jtCantCalorias.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "no puede haber campos vacios");
            return;
        }
        try {
            ComidaData cm= new ComidaData();
            Comida comi = new Comida();
            comi = cm.buscarNombreComida(jtNombreComida.getText());
            if (comi != null) {
                comi.setDetalle(jtNombreComida.getText());
                comi.setCantCalorias(Integer.parseInt(jtCantCalorias.getText()));
                comi.setEstado(rbEstado.isSelected());
                cm.modificarComida(comi);

            } else {
                JOptionPane.showMessageDialog(this, "La comida no existe");
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos validos");
        }
        
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarCamposActionPerformed
        jtNombreComida.setText("");
        jtDetalle.setText("");
        jtCantCalorias.setText("");
        rbEstado.setSelected(false);
    }//GEN-LAST:event_jbLimpiarCamposActionPerformed

    private void jtCantCaloriasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCantCaloriasKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_jtCantCaloriasKeyTyped

    private void jtNombreComidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreComidaKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
            evt.consume();
    }//GEN-LAST:event_jtNombreComidaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiarCampos;
    private javax.swing.JButton jbModificar;
    private javax.swing.JTextField jtCantCalorias;
    private javax.swing.JTextField jtDetalle;
    private javax.swing.JTextField jtNombreComida;
    private javax.swing.JRadioButton rbEstado;
    // End of variables declaration//GEN-END:variables
}

