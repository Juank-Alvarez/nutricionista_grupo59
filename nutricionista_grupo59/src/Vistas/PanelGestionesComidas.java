
package Vistas;

import accesoADatos.ComidaData;
import entidades.Comida;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class PanelGestionesComidas extends javax.swing.JPanel {
    
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };
    
    int id=0;
   
    public PanelGestionesComidas() {
        initComponents();
        armarCabecera();
        ComidaData cd=new ComidaData();
        ArrayList<Comida> lista= new ArrayList<>();
        lista=(ArrayList<Comida>) cd.listarComida();
        for(Comida m: lista){
            modelo.addRow(new Object[]{m.getIdComida(), m.getNombre(), m.getCantCalorias()});
        }
    }
    
//    public PanelGestionesComidas(int id) {
//        initComponents();
//        ComidaData cd=new ComidaData();
//        Comida comi=new Comida();
//        comi=cd.buscarComida(id);
//        
//        jtNombreComida.setText(comi.getNombre());
//        jtDetalle.setText(comi.getDetalle());
//        jtCantCalorias.setText(comi.getCantCalorias()+"");
//        rbEstado.setSelected(comi.isEstado());
//    }

    public PanelGestionesComidas(String nombre){
        initComponents();
        if(nombre.isEmpty()){
            
        }else{
            ComidaData cd=new ComidaData();
            Comida comi=new Comida();
            comi=cd.buscarNombreComida(nombre);
            jtNombreComida.setText(nombre);
            jtDetalle.setText(comi.getDetalle());
            jtCantCalorias.setText(comi.getCantCalorias()+"");
            rbEstado.setSelected(comi.isEstado());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtComidas = new javax.swing.JTable();
        jbSeleccionar = new javax.swing.JButton();

        contenido.setPreferredSize(new java.awt.Dimension(1000, 650));

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

        jtComidas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtComidas);

        jbSeleccionar.setText("Seleccionar");
        jbSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbLimpiarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbEstado)
                            .addComponent(jtDetalle)
                            .addComponent(jtNombreComida)
                            .addComponent(jtCantCalorias, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                        .addComponent(jbSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtNombreComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtCantCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rbEstado))
                        .addGap(18, 18, 18)
                        .addComponent(jbLimpiarCampos)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jbModificar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbSeleccionar))
                .addContainerGap(258, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        

//        ComidaData cm= new ComidaData();
//        Comida comi = new Comida();
//        comi = cm.buscarNombreComida(jtNombreComida.getText());
//        
//        if (comi == null){
//            JOptionPane.showMessageDialog(this,"La comida no existe");
//        }else{
//            
//            jtDetalle.setText(comi.getDetalle());
//            jtCantCalorias.setText(Integer.toString(comi.getCantCalorias()));
//            rbEstado.setSelected(comi.isEstado());
//        }        
            
            
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
                
        if (jtNombreComida.getText().isEmpty() || jtDetalle.getText().isEmpty() || jtCantCalorias.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
            return;
        
        }
        try {
            Comida comi = new Comida();
            Comida comidas = new Comida();
            ComidaData cd = new ComidaData();
            comi = cd.buscarNombreComida(jtNombreComida.getText());
            if (comi == null) {
                
                comidas.setNombre(jtNombreComida.getText());
                comidas.setDetalle(jtDetalle.getText());
                comidas.setCantCalorias(Integer.parseInt(jtCantCalorias.getText()));
                comidas.setEstado(rbEstado.isSelected());

                cd.guardarComida(comidas);
                
                borrarFilasTabla();
                ArrayList<Comida> lista = new ArrayList<>();
                lista = (ArrayList<Comida>) cd.listarComida();
                for (Comida m : lista) {
                    modelo.addRow(new Object[]{m.getIdComida(), m.getNombre(), m.getCantCalorias()});
                }
                
            } else JOptionPane.showMessageDialog(this, "La comida ya existe");

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
            ComidaData cd = new ComidaData();
            Comida comi = new Comida();
            comi = cd.buscarComida(id);
            if (comi != null) {
                comi.setIdComida(id);
                comi.setDetalle(jtDetalle.getText());
                comi.setNombre(jtNombreComida.getText());
                comi.setCantCalorias(Integer.parseInt(jtCantCalorias.getText()));
                comi.setEstado(rbEstado.isSelected());
                cd.modificarComida(comi);
                
                borrarFilasTabla();
                ArrayList<Comida> lista = new ArrayList<>();
                lista = (ArrayList<Comida>) cd.listarComida();
                for (Comida m : lista) {
                    modelo.addRow(new Object[]{m.getIdComida(), m.getNombre(), m.getCantCalorias()});
                }
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
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c!= ' '))
            evt.consume();
    }//GEN-LAST:event_jtNombreComidaKeyTyped

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed
        int filaseleccionada=jtComidas.getSelectedRow();
        if(filaseleccionada != -1) {
            ComidaData cd=new ComidaData();
            Comida comi=new Comida();
            comi=cd.buscarComida((Integer)jtComidas.getValueAt(filaseleccionada, 0));
            id=(Integer)jtComidas.getValueAt(filaseleccionada, 0);
            jtNombreComida.setText(comi.getNombre());
            jtDetalle.setText(comi.getDetalle());
            jtCantCalorias.setText(comi.getCantCalorias()+"");
            rbEstado.setSelected(comi.isEstado());
        }
    }//GEN-LAST:event_jbSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiarCampos;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSeleccionar;
    private javax.swing.JTextField jtCantCalorias;
    private javax.swing.JTable jtComidas;
    private javax.swing.JTextField jtDetalle;
    private javax.swing.JTextField jtNombreComida;
    private javax.swing.JRadioButton rbEstado;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad de Calorias");
        jtComidas.setModel(modelo);
        
    }
    
    private void ShowPanel(JPanel panel) {

        panel.setSize(680, 420);
        panel.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(panel, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    private void borrarFilasTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
}

