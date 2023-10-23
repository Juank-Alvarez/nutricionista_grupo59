
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
        jbVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        jrCumplieron = new javax.swing.JRadioButton();
        jrNoCumplieron = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbIra = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setLayout(null);

        contenido.setPreferredSize(new java.awt.Dimension(752, 603));
        contenido.setLayout(null);

        jbVolver.setBackground(java.awt.SystemColor.activeCaption);
        jbVolver.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        contenido.add(jbVolver);
        jbVolver.setBounds(20, 410, 99, 27);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jLabel1.setText("Pacientes que no llegaron al peso buscado");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido.add(jLabel1);
        jLabel1.setBounds(20, 18, 420, 40);

        jtPacientes.setBackground(new java.awt.Color(255, 204, 153));
        jtPacientes.setBorder(new javax.swing.border.MatteBorder(null));
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

        contenido.add(jScrollPane1);
        jScrollPane1.setBounds(260, 110, 327, 257);

        jrCumplieron.setBackground(new java.awt.Color(255, 204, 153));
        jrCumplieron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCumplieronActionPerformed(evt);
            }
        });
        contenido.add(jrCumplieron);
        jrCumplieron.setBounds(90, 190, 21, 21);

        jrNoCumplieron.setBackground(new java.awt.Color(255, 204, 153));
        jrNoCumplieron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNoCumplieronActionPerformed(evt);
            }
        });
        contenido.add(jrNoCumplieron);
        jrNoCumplieron.setBounds(90, 290, 21, 21);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setText("Cumplieron la meta");
        contenido.add(jLabel2);
        jLabel2.setBounds(20, 140, 150, 30);

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel3.setText("No cumplieron la meta");
        contenido.add(jLabel3);
        jLabel3.setBounds(20, 240, 171, 23);

        jbIra.setBackground(java.awt.SystemColor.activeCaption);
        jbIra.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbIra.setText("Ir a Gention del Paciente");
        jbIra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIraActionPerformed(evt);
            }
        });
        contenido.add(jbIra);
        jbIra.setBounds(20, 340, 200, 27);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/strawberries-6309951_1280.jpg"))); // NOI18N
        contenido.add(Fondo);
        Fondo.setBounds(0, 0, 1000, 670);

        add(contenido);
        contenido.setBounds(0, 0, 1000, 665);
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

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed

        SegundaVistaPrincipalMenu bpm = new SegundaVistaPrincipalMenu();
        bpm.setVisible(true);
         //dispose();

    }//GEN-LAST:event_jbVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbIra;
    private javax.swing.JButton jbVolver;
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
