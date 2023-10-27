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
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
        jbVolver = new javax.swing.JButton();
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
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 680));
        setLayout(null);

        contenido.setPreferredSize(new java.awt.Dimension(1000, 680));
        contenido.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jLabel1.setText("Formulario De Dietas");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido.add(jLabel1);
        jLabel1.setBounds(250, 50, 240, 40);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setText("Seleccione una dieta: ");
        contenido.add(jLabel2);
        jLabel2.setBounds(240, 110, 190, 23);

        jbVolver.setBackground(java.awt.SystemColor.activeCaption);
        jbVolver.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        contenido.add(jbVolver);
        jbVolver.setBounds(500, 460, 99, 24);

        jcbDietas.setBackground(new java.awt.Color(255, 204, 153));
        jcbDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDietasActionPerformed(evt);
            }
        });
        contenido.add(jcbDietas);
        jcbDietas.setBounds(410, 110, 190, 22);

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 16)); // NOI18N
        jLabel3.setText("Listado de Comidas");
        contenido.add(jLabel3);
        jLabel3.setBounds(300, 150, 140, 20);

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
        jScrollPane1.setBounds(150, 220, 452, 145);

        jbAgregar.setBackground(java.awt.SystemColor.activeCaption);
        jbAgregar.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbAgregar.setText("Agregar Comida");
        jbAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        contenido.add(jbAgregar);
        jbAgregar.setBounds(150, 390, 150, 30);

        jbQuitar.setBackground(java.awt.SystemColor.activeCaption);
        jbQuitar.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbQuitar.setText("Quitar Comida");
        jbQuitar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbQuitar.setPreferredSize(new java.awt.Dimension(125, 25));
        jbQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitarActionPerformed(evt);
            }
        });
        contenido.add(jbQuitar);
        jbQuitar.setBounds(450, 390, 150, 30);

        jrComidasAgregadas.setBackground(new java.awt.Color(255, 204, 153));
        jrComidasAgregadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrComidasAgregadasActionPerformed(evt);
            }
        });
        contenido.add(jrComidasAgregadas);
        jrComidasAgregadas.setBounds(150, 190, 19, 20);

        jrComidasnoAgregadas.setBackground(new java.awt.Color(255, 204, 153));
        jrComidasnoAgregadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrComidasnoAgregadasActionPerformed(evt);
            }
        });
        contenido.add(jrComidasnoAgregadas);
        jrComidasnoAgregadas.setBounds(580, 190, 19, 20);

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel4.setText("Comidas agregadas");
        contenido.add(jLabel4);
        jLabel4.setBounds(190, 190, 144, 20);

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel5.setText("Comidas sin agregar");
        contenido.add(jLabel5);
        jLabel5.setBounds(420, 180, 160, 30);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/blueberries-4011294_1280.jpg"))); // NOI18N
        contenido.add(Fondo);
        Fondo.setBounds(0, 0, 1000, 650);

        add(contenido);
        contenido.setBounds(0, 0, 1000, 680);
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
        DietaComidaData dcd = new DietaComidaData();
        Dieta diet = (Dieta) jcbDietas.getSelectedItem();

        Comida comi = new Comida();
        Dietacomida dietcomi = new Dietacomida();
        Dietacomida dietcomi2 = new Dietacomida();

        int filaseleccionada = jtComidas.getSelectedRow();
        if (filaseleccionada != -1) {
            comi.setIdComida((Integer) jtComidas.getValueAt(filaseleccionada, 0));
            comi.setNombre((String) jtComidas.getValueAt(filaseleccionada, 1));
            comi.setCantCalorias((Integer) jtComidas.getValueAt(filaseleccionada, 2));
            dietcomi.setComida(comi);
            dietcomi.setDieta(diet);
            dietcomi2=dcd.buscarDietaComida(diet.getIdDieta(), comi.getIdComida());
//            if(dietcomi.getIdDietaComida()==dietcomi2.getIdDietaComida()) {
            if(dietcomi2!=null){
                JOptionPane.showMessageDialog(this, "Esta comida ya esta agregada");
            }else {
                dcd.guardarDietaComida(dietcomi);
                Dieta selec= (Dieta) jcbDietas.getSelectedItem();
                List<Comida> lista= dcd.obtenerComidasSinDieta(selec.getIdDieta());
                borrarFilasTabla();
                for(Comida com: lista){
                    modelo.addRow(new Object[]{com.getIdComida(), com.getNombre(), com.getCantCalorias()});
                }
            }         
        }

    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarActionPerformed

        int idcomida, iddieta;
        Dieta diet = (Dieta) jcbDietas.getSelectedItem();
        int filaseleccionada = jtComidas.getSelectedRow();
        Dieta selec = (Dieta) jcbDietas.getSelectedItem();
        DietaComidaData dcd = new DietaComidaData();
        Dietacomida dietcomi = new Dietacomida();
        if (filaseleccionada != -1) {
            idcomida = (Integer) jtComidas.getValueAt(filaseleccionada, 0);
            iddieta = diet.getIdDieta();
            dietcomi = dcd.buscarDietaComida(iddieta, idcomida);
            if (dietcomi == null) {
                JOptionPane.showMessageDialog(this, "Para quitar una comida debe estar agregada");
            } else {
                dcd.borrarDietaComida(idcomida, iddieta);
                borrarFilasTabla();
                List<Comida> lista = dcd.obtenerComidasPorDieta(selec.getIdDieta());
                for (Comida com : lista) {
                    modelo.addRow(new Object[]{com.getIdComida(), com.getNombre(), com.getCantCalorias()});
                }
            }
        }
    }//GEN-LAST:event_jbQuitarActionPerformed

    private void jcbDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDietasActionPerformed
        borrarFilasTabla();
        jrComidasAgregadas.setSelected(false);
        jrComidasnoAgregadas.setSelected(false);
    }//GEN-LAST:event_jcbDietasActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed

        PanelPorDefecto bpm = new PanelPorDefecto();
        ShowPanel(bpm);

    }//GEN-LAST:event_jbVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbQuitar;
    private javax.swing.JButton jbVolver;
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

    private void ShowPanel(JPanel panel) {

        panel.setSize(1000, 680);
        panel.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(panel, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
}
