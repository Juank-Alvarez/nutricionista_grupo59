/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import accesoADatos.ComidaData;
import entidades.Comida;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class PanelBuscarComidas extends javax.swing.JPanel {

    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };
    
    public PanelBuscarComidas() {
        initComponents();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CArtel = new javax.swing.JLabel();
        jtCantCalorias = new javax.swing.JTextField();
        jbVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtComidas = new javax.swing.JTable();
        jbBuscar = new javax.swing.JButton();
        jbGestionComida = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setLayout(null);

        contenido.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar cantidad de calorias");
        contenido.add(jLabel1);
        jLabel1.setBounds(16, 54, 230, 23);

        CArtel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Cartel comidas mejorado.jpg"))); // NOI18N
        contenido.add(CArtel);
        CArtel.setBounds(100, 430, 425, 140);

        jtCantCalorias.setBackground(new java.awt.Color(255, 204, 153));
        contenido.add(jtCantCalorias);
        jtCantCalorias.setBounds(264, 51, 134, 22);

        jbVolver.setBackground(java.awt.SystemColor.activeCaption);
        jbVolver.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbVolver.setText("Volver");
        jbVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        contenido.add(jbVolver);
        jbVolver.setBounds(570, 150, 110, 30);

        jtComidas.setBackground(new java.awt.Color(255, 204, 153));
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

        contenido.add(jScrollPane1);
        jScrollPane1.setBounds(96, 93, 452, 314);

        jbBuscar.setBackground(java.awt.SystemColor.activeCaption);
        jbBuscar.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        contenido.add(jbBuscar);
        jbBuscar.setBounds(449, 50, 100, 25);

        jbGestionComida.setBackground(java.awt.SystemColor.activeCaption);
        jbGestionComida.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbGestionComida.setText("Ir a Gestion de Comida");
        jbGestionComida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGestionComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGestionComidaActionPerformed(evt);
            }
        });
        contenido.add(jbGestionComida);
        jbGestionComida.setBounds(570, 100, 190, 30);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/tomato-2823820_1280.jpg"))); // NOI18N
        contenido.add(Fondo);
        Fondo.setBounds(0, 0, 1030, 680);

        add(contenido);
        contenido.setBounds(0, 0, 1030, 690);
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        ArrayList<Comida> comidas = new ArrayList<>();
        ComidaData cd=new ComidaData();
        
        comidas=(ArrayList<Comida>) cd.buscarComidaPorCalorias(Integer.parseInt(jtCantCalorias.getText()));
        
        borrarFilasTabla();
        for(Comida m: comidas){
            modelo.addRow(new Object[]{m.getIdComida(), m.getNombre(), m.getCantCalorias()});
        }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGestionComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGestionComidaActionPerformed

        int filaseleccionada=jtComidas.getSelectedRow();
        if(filaseleccionada != 1) {
            PanelGestionesComidas pgc= new PanelGestionesComidas( (String) jtComidas.getValueAt(filaseleccionada, 1));
            ShowPanel(pgc);
        }
    }//GEN-LAST:event_jbGestionComidaActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed

        PanelPorDefecto bpm = new PanelPorDefecto();
        ShowPanel(bpm);
    }//GEN-LAST:event_jbVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CArtel;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGestionComida;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTextField jtCantCalorias;
    private javax.swing.JTable jtComidas;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad de Calorias");
        jtComidas.setModel(modelo);
        
    }
    
    private void borrarFilasTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void ShowPanel(JPanel panel) {

        panel.setSize(1000, 680);
        panel.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(panel, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

}
