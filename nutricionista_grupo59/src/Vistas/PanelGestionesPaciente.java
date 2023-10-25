/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import accesoADatos.PacienteData;
import entidades.Paciente;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class PanelGestionesPaciente extends javax.swing.JPanel {
    
    
    public PanelGestionesPaciente() {
        initComponents();
                
    }
    
    public PanelGestionesPaciente(int dni){
        initComponents();
        if(dni!=0){
            PacienteData pd=new PacienteData();
            Paciente paci=new Paciente();
            paci=pd.buscarPacientePorDni(dni);
            jtNombre.setText(paci.getNombre());
            jtApellido.setText(paci.getApellido());
            jtDni.setText(paci.getDni()+"");
            jtDomicilio.setText(paci.getDomicilio());
            jtTelefono.setText(paci.getTelefono());
            jrEstado.setSelected(paci.isEstado());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtDomicilio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jrEstado = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 680));
        setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 831));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jLabel1.setText("Por Favor ingrese sus datos para ser registrado");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(12, 13, 455, 33);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 60, 100, 29);

        jtNombre.setBackground(new java.awt.Color(255, 204, 153));
        jtNombre.setPreferredSize(new java.awt.Dimension(10, 30));
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jtNombre);
        jtNombre.setBounds(200, 60, 197, 30);

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 100, 100, 23);

        jtApellido.setBackground(new java.awt.Color(255, 204, 153));
        jtApellido.setPreferredSize(new java.awt.Dimension(10, 30));
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(jtApellido);
        jtApellido.setBounds(200, 100, 197, 30);

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel4.setText("Dni");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 150, 100, 23);

        jtDni.setBackground(new java.awt.Color(255, 204, 153));
        jtDni.setPreferredSize(new java.awt.Dimension(10, 30));
        jtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniActionPerformed(evt);
            }
        });
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });
        jPanel1.add(jtDni);
        jtDni.setBounds(200, 150, 197, 30);

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel5.setText("Domicilio");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 190, 100, 23);

        jtDomicilio.setBackground(new java.awt.Color(255, 204, 153));
        jtDomicilio.setPreferredSize(new java.awt.Dimension(10, 30));
        jPanel1.add(jtDomicilio);
        jtDomicilio.setBounds(200, 190, 197, 30);

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel6.setText("Telefono");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 240, 100, 23);

        jtTelefono.setBackground(new java.awt.Color(255, 204, 153));
        jtTelefono.setPreferredSize(new java.awt.Dimension(10, 30));
        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(jtTelefono);
        jtTelefono.setBounds(200, 240, 197, 30);

        jbLimpiar.setBackground(java.awt.SystemColor.activeCaption);
        jbLimpiar.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbLimpiar.setText("Limpiar campos");
        jbLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar);
        jbLimpiar.setBounds(20, 360, 150, 40);

        jbGuardar.setBackground(java.awt.SystemColor.activeCaption);
        jbGuardar.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGuardar.setContentAreaFilled(false);
        jbGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbGuardar.setOpaque(true);
        jbGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar);
        jbGuardar.setBounds(610, 60, 100, 40);

        jbVolver.setBackground(java.awt.SystemColor.activeCaption);
        jbVolver.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbVolver.setText("Volver");
        jbVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jbVolver);
        jbVolver.setBounds(610, 260, 99, 21);

        jbBuscar.setBackground(java.awt.SystemColor.activeCaption);
        jbBuscar.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar);
        jbBuscar.setBounds(610, 130, 99, 21);

        jrEstado.setBackground(new java.awt.Color(255, 204, 153));
        jrEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jrEstado);
        jrEstado.setBounds(200, 290, 19, 20);

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel7.setText("Estado");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 290, 90, 23);

        jbModificar.setBackground(java.awt.SystemColor.activeCaption);
        jbModificar.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbModificar.setText("Modificar ");
        jbModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbModificar);
        jbModificar.setBounds(610, 190, 99, 21);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/bell-pepper-2179100_1280.jpg"))); // NOI18N
        jPanel1.add(Fondo);
        Fondo.setBounds(0, 0, 1000, 680);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 680);
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtNombre.setText("");
        jtApellido.setText("");
        jtDni.setText("");
        jtDomicilio.setText("");
        jtTelefono.setText("");
        jrEstado.setSelected(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        
        if (jtNombre.getText().isEmpty() || jtApellido.getText().isEmpty() || jtDni.getText().isEmpty() || jtDomicilio.getText().isEmpty() || jtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "no puede haber campos vacios");
            return;
        }
        try {
            Paciente paci = new Paciente();
            Paciente paciente = new Paciente();
            PacienteData pd = new PacienteData();
            paci = pd.buscarPacientePorDni(Integer.parseInt(jtDni.getText()));
            if (paci == null) {
                
                paciente.setNombre(jtNombre.getText());
                paciente.setApellido(jtApellido.getText());
                paciente.setDni(Integer.parseInt(jtDni.getText()));
                paciente.setDomicilio(jtDomicilio.getText());
                paciente.setTelefono(jtTelefono.getText());
                
                paciente.setEstado(jrEstado.isSelected());
                pd.agregarPaciente(paciente);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo agregar el paciente porque ya existe");
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos validos");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        
        PanelPorDefecto bpm = new PanelPorDefecto();
        ShowPanel(bpm);
        
        
        
                
                
                
        
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        if (jtDni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Para buscar un paciente debe ingresar un dni");
        } else {
            PacienteData pd = new PacienteData();
            Paciente paci = new Paciente();
            paci = pd.buscarPacientePorDni(Integer.parseInt(jtDni.getText()));
            if (paci == null) {
                JOptionPane.showMessageDialog(this, "El paciente no existe");

            } else {
                jtNombre.setText(paci.getNombre());
                jtApellido.setText(paci.getApellido());
                jtDomicilio.setText(paci.getDomicilio());
                jtTelefono.setText(paci.getTelefono());
                jrEstado.setSelected(paci.isEstado());
            }
        }
       
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        if (jtNombre.getText().isEmpty() || jtApellido.getText().isEmpty() || jtDni.getText().isEmpty() || jtDomicilio.getText().isEmpty() || jtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "no puede haber campos vacios");
            return;
        }
        try {
            Paciente paci = new Paciente();
            Paciente paci2 = new Paciente();
            PacienteData pd = new PacienteData();
            paci = pd.buscarPacientePorDni(Integer.parseInt(jtDni.getText()));
            boolean b = paci.isEstado();
            if (paci != null) {
                paci.setNombre(jtNombre.getText());
                paci.setApellido(jtApellido.getText());
                paci.setDni(Integer.parseInt(jtDni.getText()));
                paci.setDomicilio(jtDomicilio.getText());
                paci.setTelefono(jtTelefono.getText());
                paci.setEstado(jrEstado.isSelected());
                pd.modificarPaciente(paci);
                if (b != jrEstado.isSelected()) {
                    if (jrEstado.isSelected()) {
                        JOptionPane.showMessageDialog(this, "Se dio de Alta al paciente");
                    } else {
                        JOptionPane.showMessageDialog(this, "Se dio de Baja al paciente");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "El paciente no existe");
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos validos");
        }

//        

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped

        char c = evt.getKeyChar();
        if (c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_jtDniKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c!= ' '))
            evt.consume();
        
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
      
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c!= ' '))
            evt.consume();
        
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyTyped
       char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c!= '+')) 
        evt.consume();
    }//GEN-LAST:event_jtTelefonoKeyTyped

    private void jrEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEstadoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
private void ShowPanel(JPanel panel) {

        panel.setSize(1000, 680);
        panel.setLocation(0, 0);

        jPanel1.removeAll();
        jPanel1.add(panel, BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
    }

    

 



}

