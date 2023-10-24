
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
        Contenido = new javax.swing.JPanel();
        jlSaludo = new javax.swing.JLabel();
        jlMensaje = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jlFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel1.setLayout(null);

        jbGestionesPaciente.setBackground(java.awt.SystemColor.activeCaption);
        jbGestionesPaciente.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbGestionesPaciente.setText("Gestiones Paciente");
        jbGestionesPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGestionesPaciente.setPreferredSize(new java.awt.Dimension(125, 25));
        jbGestionesPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGestionesPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(jbGestionesPaciente);
        jbGestionesPaciente.setBounds(12, 47, 150, 30);

        jbGestionesComidas.setBackground(java.awt.SystemColor.activeCaption);
        jbGestionesComidas.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbGestionesComidas.setText("Gestion Comidas");
        jbGestionesComidas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGestionesComidas.setPreferredSize(new java.awt.Dimension(125, 25));
        jbGestionesComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGestionesComidasActionPerformed(evt);
            }
        });
        jPanel1.add(jbGestionesComidas);
        jbGestionesComidas.setBounds(12, 90, 150, 30);

        jbGestionesDietas.setBackground(java.awt.SystemColor.activeCaption);
        jbGestionesDietas.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbGestionesDietas.setText("Gestion Dietas");
        jbGestionesDietas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGestionesDietas.setPreferredSize(new java.awt.Dimension(125, 25));
        jbGestionesDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGestionesDietasActionPerformed(evt);
            }
        });
        jPanel1.add(jbGestionesDietas);
        jbGestionesDietas.setBounds(12, 133, 150, 30);

        jbCargarAvances.setBackground(java.awt.SystemColor.activeCaption);
        jbCargarAvances.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbCargarAvances.setText("Listar Pacientes");
        jbCargarAvances.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCargarAvances.setPreferredSize(new java.awt.Dimension(115, 25));
        jbCargarAvances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarAvancesActionPerformed(evt);
            }
        });
        jPanel1.add(jbCargarAvances);
        jbCargarAvances.setBounds(10, 180, 150, 30);

        jbSalir.setBackground(java.awt.SystemColor.activeCaption);
        jbSalir.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSalir.setPreferredSize(new java.awt.Dimension(125, 25));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir);
        jbSalir.setBounds(10, 280, 150, 30);

        Contenido.setLayout(null);

        jlSaludo.setFont(new java.awt.Font("Bodoni MT", 2, 36)); // NOI18N
        jlSaludo.setForeground(new java.awt.Color(51, 51, 51));
        jlSaludo.setText("¡Bienvenido a NutriApp!");
        jlSaludo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Contenido.add(jlSaludo);
        jlSaludo.setBounds(0, 0, 380, 80);

        jlMensaje.setText("NutriApp es tu herramienta completa de gestión para tu consultorio nutricional.");
        Contenido.add(jlMensaje);
        jlMensaje.setBounds(10, 100, 480, 70);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/italian-cuisine-2378729_1280.jpg"))); // NOI18N
        Contenido.add(Fondo);
        Fondo.setBounds(0, 0, 850, 680);

        jPanel1.add(Contenido);
        Contenido.setBounds(170, 0, 830, 650);

        jButton1.setText("jButton1");
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 490, 79, 25);

        jButton2.setText("jButton2");
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 450, 79, 25);

        jButton3.setBackground(java.awt.SystemColor.activeCaption);
        jButton3.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jButton3.setText("Dietas Registradas");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setPreferredSize(new java.awt.Dimension(125, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 230, 150, 30);

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/paper-1074131_1280.jpg"))); // NOI18N
        jPanel1.add(jlFondo);
        jlFondo.setBounds(0, 0, 170, 680);

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
        
           String botones[] = {"Salir", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿Desea Salir de la App?", "Título", 0, 0, null, botones, this);
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       PanelManejodeDietaComida p1=new PanelManejodeDietaComida();
       ShowPanel(p1);
    }//GEN-LAST:event_jButton3ActionPerformed

    
     
     
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
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCargarAvances;
    private javax.swing.JButton jbGestionesComidas;
    private javax.swing.JButton jbGestionesDietas;
    private javax.swing.JButton jbGestionesPaciente;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JLabel jlMensaje;
    private javax.swing.JLabel jlSaludo;
    // End of variables declaration//GEN-END:variables

private void ShowPanel(JPanel panel) {

        panel.setSize(1000, 650);
        panel.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.add(panel, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }



}
