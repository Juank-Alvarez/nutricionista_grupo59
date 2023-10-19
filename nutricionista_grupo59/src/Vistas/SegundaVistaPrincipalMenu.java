
package Vistas;

import accesoADatos.ComidaData;
import entidades.Comida;
import entidades.Paciente;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class SegundaVistaPrincipalMenu extends javax.swing.JFrame {

    
    public SegundaVistaPrincipalMenu() {
        initComponents();
        PanelPorDefecto p1=new PanelPorDefecto();
        ShowPanel(p1);
        VistaPrincipalMenu cd=new VistaPrincipalMenu();
        Paciente paci=new Paciente();
        paci=cd.SaludoPaciente();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbGestionesPaciente = new javax.swing.JButton();
        jbGestionesComidas = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jbCargarAvances = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        Contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(752, 603));

        jbGestionesPaciente.setText("Gestiones Paciente");
        jbGestionesPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGestionesPacienteActionPerformed(evt);
            }
        });

        jbGestionesComidas.setText("Gestion Comidas");
        jbGestionesComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGestionesComidasActionPerformed(evt);
            }
        });

        jButton3.setText("Gestion Dietas");

        jbCargarAvances.setText("Listar Pacientes");
        jbCargarAvances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarAvancesActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbGestionesPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbGestionesComidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCargarAvances, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jbGestionesPaciente)
                .addGap(18, 18, 18)
                .addComponent(jbGestionesComidas)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jbCargarAvances)
                .addGap(31, 31, 31)
                .addComponent(jbSalir)
                .addContainerGap(403, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGestionesPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGestionesPacienteActionPerformed
       
         PanelGestionesPaciente p1=new PanelGestionesPaciente();
        ShowPanel(p1);
    }//GEN-LAST:event_jbGestionesPacienteActionPerformed

    private void jbGestionesComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGestionesComidasActionPerformed
     
         PanelGestionesComidas p1=new PanelGestionesComidas();
        ShowPanel(p1);
        
    }//GEN-LAST:event_jbGestionesComidasActionPerformed

    private void jbCargarAvancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarAvancesActionPerformed
      
        PanelListarPacientes p1=new PanelListarPacientes();
       ShowPanel(p1);
    }//GEN-LAST:event_jbCargarAvancesActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        
           String botones[] = {"Cerrar Sesion", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿Desea cerrar sesion?", "Título", 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION) {
            VistaPrincipalMenu bpn = new VistaPrincipalMenu();
            bpn.setVisible(true);
            dispose();
        } else if (eleccion == JOptionPane.NO_OPTION) {
            System.out.println("Se canceló el cierre de sesion.");
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    
     
     
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
            java.util.logging.Logger.getLogger(SegundaVistaPrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SegundaVistaPrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SegundaVistaPrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SegundaVistaPrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SegundaVistaPrincipalMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenido;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCargarAvances;
    private javax.swing.JButton jbGestionesComidas;
    private javax.swing.JButton jbGestionesPaciente;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables

private void ShowPanel(JPanel panel) {

        panel.setSize(680, 420);
        panel.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.add(panel, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }



}
