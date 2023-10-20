
package Vistas;

import accesoADatos.PacienteData;
import entidades.Paciente;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class PanelListarPacientes extends javax.swing.JPanel {

    private DefaultTableModel model = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };

    Paciente paci=new Paciente();
    
    public PanelListarPacientes() {
        initComponents();
        armarCabecera();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        jrCumplieron = new javax.swing.JRadioButton();
        jrNoCumplieron = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbIra = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 650));

        contenido.setPreferredSize(new java.awt.Dimension(752, 603));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Pacientes que no llegaron al peso buscado");

        jtPacientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtPacientes);

        jrCumplieron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCumplieronActionPerformed(evt);
            }
        });

        jrNoCumplieron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNoCumplieronActionPerformed(evt);
            }
        });

        jLabel2.setText("Cumplieron la meta");

        jLabel3.setText("No cumplieron la meta");

        jbIra.setText("Ir a Gention del Paciente");
        jbIra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbIra))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jrCumplieron))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jrNoCumplieron)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrCumplieron)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrNoCumplieron)
                        .addGap(88, 88, 88)
                        .addComponent(jbIra))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(274, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jrCumplieronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCumplieronActionPerformed
        PacienteData pd= new PacienteData();
        List<Paciente> lista=new ArrayList<>();
        lista=pd.listarPacientesQueCumplieron();
        if (jrCumplieron.isSelected()) {
            jrNoCumplieron.setSelected(false);
            borrarFilasTabla();
            for (Paciente m : lista) {
                model.addRow(new Object[]{m.getIdPaciente(), m.getNombre(), m.getApellido(), m.getDni()});
            }
        }else borrarFilasTabla();
    }//GEN-LAST:event_jrCumplieronActionPerformed

    private void jrNoCumplieronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNoCumplieronActionPerformed
        PacienteData pd= new PacienteData();
        List<Paciente> lista=new ArrayList<>();
        lista=pd.listarPacientesQueNoCumplieron();
        if (jrNoCumplieron.isSelected()) {
            jrCumplieron.setSelected(false);
            borrarFilasTabla();
            for (Paciente m : lista) {
                model.addRow(new Object[]{m.getIdPaciente(), m.getNombre(), m.getApellido(), m.getDni()});
            }
        }else borrarFilasTabla();
    }//GEN-LAST:event_jrNoCumplieronActionPerformed

    private void jbIraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIraActionPerformed

        int filaseleccionada=jtPacientes.getSelectedRow();
        if(filaseleccionada != -1){
            PanelGestionesPaciente pgp=new PanelGestionesPaciente((Integer) jtPacientes.getValueAt(filaseleccionada,3));
            ShowPanel(pgp);
        }
        
    }//GEN-LAST:event_jbIraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbIra;
    private javax.swing.JRadioButton jrCumplieron;
    private javax.swing.JRadioButton jrNoCumplieron;
    private javax.swing.JTable jtPacientes;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Dni");
        
        jtPacientes.setModel(model);

    }

    private void borrarFilasTabla() {
        int indice = model.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    
    private void ShowPanel(JPanel panel) {

        panel.setSize(680, 420);
        panel.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(panel, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
    
}
