/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import accesoADatos.ComidaData;
import entidades.Comida;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ListarComidas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };

    public ListarComidas() {
        initComponents();
        armarCabecera();
        ComidaData cd=new ComidaData();
        ArrayList<Comida> lista= new ArrayList<>();
        lista=(ArrayList<Comida>) cd.listarComida();
        for(Comida m: lista){
            modelo.addRow(new Object[]{m.getIdComida(), m.getNombre(), m.getCantCalorias()});
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtComidas = new javax.swing.JTable();
        jbSeleccionar = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jbSeleccionar)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jbSeleccionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed
        int filaseleccionada=jtComidas.getSelectedRow();
        if(filaseleccionada != 1) {
            PanelGestionesComidas pgc= new PanelGestionesComidas( (String) jtComidas.getValueAt(filaseleccionada, 1));
            
        }
    }//GEN-LAST:event_jbSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSeleccionar;
    private javax.swing.JTable jtComidas;
    // End of variables declaration//GEN-END:variables
private void armarCabecera() {

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad de Calorias");
        jtComidas.setModel(modelo);
        
    }

}
