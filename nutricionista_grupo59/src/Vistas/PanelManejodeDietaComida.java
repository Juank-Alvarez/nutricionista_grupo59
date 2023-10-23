/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import accesoADatos.ComidaData;
import accesoADatos.DietaComidaData;
import accesoADatos.DietaData;
import entidades.Comida;
import entidades.Dieta;
import entidades.Dietacomida;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class PanelManejodeDietaComida extends javax.swing.JPanel {

    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };
    
    public PanelManejodeDietaComida() {
        initComponents();
        cargarCombo();
        armarCabecera();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbDietas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtComidas = new javax.swing.JTable();
        jbAgregar = new javax.swing.JButton();
        jbQuitar = new javax.swing.JButton();
        jrComidasAgregadas = new javax.swing.JRadioButton();
        jrComidasnoAgregadas = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 650));

        contenido.setPreferredSize(new java.awt.Dimension(1000, 650));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Formulario De Dietas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione una dieta: ");

        jcbDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDietasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Listado de Comidas");

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

        jbAgregar.setText("Agregar Comida");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbQuitar.setText("Quitar Comida");
        jbQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitarActionPerformed(evt);
            }
        });

        jrComidasAgregadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrComidasAgregadasActionPerformed(evt);
            }
        });

        jrComidasnoAgregadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrComidasnoAgregadasActionPerformed(evt);
            }
        });

        jLabel4.setText("Comidas agregadas");

        jLabel5.setText("Comidas sin agregar");

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addComponent(jbAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbDietas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                                .addComponent(jrComidasAgregadas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrComidasnoAgregadas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(56, 56, 56)))))
                .addContainerGap(464, Short.MAX_VALUE))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbDietas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jrComidasnoAgregadas)
                    .addComponent(jrComidasAgregadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbQuitar))
                .addContainerGap(248, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jrComidasAgregadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrComidasAgregadasActionPerformed
        Dieta selec= (Dieta) jcbDietas.getSelectedItem();
        DietaComidaData dcd= new DietaComidaData();
        List<Comida> lista= dcd.obtenerComidasPorDieta(selec.getIdDieta());
        
        if(jrComidasAgregadas.isSelected()){
            jrComidasnoAgregadas.setSelected(false);
            borrarFilasTabla();
            for(Comida com: lista){
                modelo.addRow(new Object[]{com.getIdComida(), com.getNombre(), com.getCantCalorias()});
            }
        }else borrarFilasTabla();
    }//GEN-LAST:event_jrComidasAgregadasActionPerformed

    private void jrComidasnoAgregadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrComidasnoAgregadasActionPerformed
        Dieta selec= (Dieta) jcbDietas.getSelectedItem();
        DietaComidaData dcd= new DietaComidaData();
        List<Comida> lista= dcd.obtenerComidasSinDieta(selec.getIdDieta());
        
        if(jrComidasnoAgregadas.isSelected()){
            jrComidasAgregadas.setSelected(false);
            borrarFilasTabla();
            for(Comida com: lista){
                modelo.addRow(new Object[]{com.getIdComida(), com.getNombre(), com.getCantCalorias()});
            }
        }else borrarFilasTabla();
    }//GEN-LAST:event_jrComidasnoAgregadasActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        DietaComidaData dcd=new DietaComidaData();
        Dieta diet= (Dieta) jcbDietas.getSelectedItem();
        Comida comi=new Comida();
        Dietacomida dietcomi=new Dietacomida();
        int filaseleccionada = jtComidas.getSelectedRow();
        if(filaseleccionada != -1){
            comi.setIdComida((Integer) jtComidas.getValueAt(filaseleccionada, 0));
            comi.setNombre((String) jtComidas.getValueAt(filaseleccionada, 0));
            comi.setCantCalorias((Integer) jtComidas.getValueAt(filaseleccionada, 2));
            dietcomi.setComida(comi);
            dietcomi.setDieta(diet);
            dcd.guardarDietaComida(dietcomi);
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarActionPerformed

        DietaComidaData dietcomi=new DietaComidaData();
        int idcomida, iddieta;
        Dieta diet=(Dieta) jcbDietas.getSelectedItem();
        int filaseleccionada= jtComidas.getSelectedRow();
        if(filaseleccionada != -1){
            idcomida=(Integer) jtComidas.getValueAt(filaseleccionada, 0);
            iddieta= diet.getIdDieta();
            dietcomi.borrarDietaComida(idcomida, iddieta);
        }
        
        Dieta selec= (Dieta) jcbDietas.getSelectedItem();
        DietaComidaData dcd= new DietaComidaData();
        List<Comida> lista= dcd.obtenerComidasPorDieta(selec.getIdDieta());
        
        if(jrComidasAgregadas.isSelected()){
            jrComidasnoAgregadas.setSelected(false);
            borrarFilasTabla();
            for(Comida com: lista){
                modelo.addRow(new Object[]{com.getIdComida(), com.getNombre(), com.getCantCalorias()});
            }
        }else borrarFilasTabla();
    }//GEN-LAST:event_jbQuitarActionPerformed

    private void jcbDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDietasActionPerformed
        borrarFilasTabla();
        jrComidasAgregadas.setSelected(false);
        jrComidasnoAgregadas.setSelected(false);
    }//GEN-LAST:event_jcbDietasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbQuitar;
    private javax.swing.JComboBox<Dieta> jcbDietas;
    private javax.swing.JRadioButton jrComidasAgregadas;
    private javax.swing.JRadioButton jrComidasnoAgregadas;
    private javax.swing.JTable jtComidas;
    // End of variables declaration//GEN-END:variables
private void cargarCombo() {

        DietaData dd = new DietaData();
        ArrayList<Dieta> dietas = new ArrayList<>();
        dietas = (ArrayList<Dieta>) dd.listarDietas();

        for (Dieta diet : dietas) {
            jcbDietas.addItem(diet);
        }
    }

    private void borrarFilasTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void armarCabecera() {

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Calorias");
        jtComidas.setModel(modelo);
    }

}
