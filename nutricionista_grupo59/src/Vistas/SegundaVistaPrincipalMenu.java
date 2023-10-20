
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
//        PanelPorDefecto p1=new PanelPorDefecto();
//        ShowPanel(p1);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbGestionesPaciente = new javax.swing.JButton();
        jbGestionesComidas = new javax.swing.JButton();
        jbGestionesDietas = new javax.swing.JButton();
        jbCargarAvances = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbBuscarComidas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Contenido = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();
        FONDO_MENU = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel1.setLayout(null);

        jbGestionesPaciente.setText("Gestiones Paciente");
        jbGestionesPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGestionesPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(jbGestionesPaciente);
        jbGestionesPaciente.setBounds(12, 47, 133, 25);

        jbGestionesComidas.setText("Gestion Comidas");
        jbGestionesComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGestionesComidasActionPerformed(evt);
            }
        });
        jPanel1.add(jbGestionesComidas);
        jbGestionesComidas.setBounds(12, 90, 133, 25);

        jbGestionesDietas.setText("Gestion Dietas");
        jbGestionesDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGestionesDietasActionPerformed(evt);
            }
        });
        jPanel1.add(jbGestionesDietas);
        jbGestionesDietas.setBounds(12, 133, 133, 25);

        jbCargarAvances.setText("Listar Pacientes");
        jbCargarAvances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarAvancesActionPerformed(evt);
            }
        });
        jPanel1.add(jbCargarAvances);
        jbCargarAvances.setBounds(12, 176, 133, 25);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir);
        jbSalir.setBounds(12, 303, 133, 25);

        jbBuscarComidas.setText("Buscar Comidas");
        jbBuscarComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarComidasActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscarComidas);
        jbBuscarComidas.setBounds(12, 216, 133, 25);

        jButton1.setText("Manejo Dietas");
        jPanel1.add(jButton1);
        jButton1.setBounds(12, 260, 133, 25);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/italian-cuisine-2378729_1280.jpg"))); // NOI18N

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 2277, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Contenido);
        Contenido.setBounds(173, 0, 1770, 831);

        FONDO_MENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/paper-1074131_1280.jpg"))); // NOI18N
        jPanel1.add(FONDO_MENU);
        FONDO_MENU.setBounds(0, 0, 180, 650);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, 0, 1610, 650);

        pack();
        setLocationRelativeTo(null);
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

    private void jbGestionesDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGestionesDietasActionPerformed
        GestionesDietas p1=new GestionesDietas();
        ShowPanel(p1);
    }//GEN-LAST:event_jbGestionesDietasActionPerformed

    private void jbBuscarComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarComidasActionPerformed
       PanelBuscarComidas p1=new PanelBuscarComidas();
        ShowPanel(p1);
        
    }//GEN-LAST:event_jbBuscarComidasActionPerformed

    
     
     
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
    private javax.swing.JLabel FONDO_MENU;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscarComidas;
    private javax.swing.JButton jbCargarAvances;
    private javax.swing.JButton jbGestionesComidas;
    private javax.swing.JButton jbGestionesDietas;
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
