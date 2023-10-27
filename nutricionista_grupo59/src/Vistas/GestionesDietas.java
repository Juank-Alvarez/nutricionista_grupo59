/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import accesoADatos.DietaData;
import accesoADatos.PacienteData;
import entidades.Dieta;
import entidades.Paciente;
import java.awt.BorderLayout;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Juan
 */
public class GestionesDietas extends javax.swing.JPanel {

    /**
     * Creates new form GestionesDietas
     */
    public GestionesDietas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jbNueva = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jlDieta = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlPaciente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtPaciente = new javax.swing.JTextField();
        jtPesoInicial = new javax.swing.JTextField();
        jtPesoFinal = new javax.swing.JTextField();
        jtGenero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtAltura = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jdFechaFinal = new com.toedter.calendar.JDateChooser();
        jdFechaInicial = new com.toedter.calendar.JDateChooser();
        jlEstado = new javax.swing.JLabel();
        jrEstado = new javax.swing.JRadioButton();
        jtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtPesoBuscado = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 680));
        setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 680));
        jPanel1.setLayout(null);

        jbNueva.setBackground(java.awt.SystemColor.activeCaption);
        jbNueva.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbNueva.setText("Nueva Dieta");
        jbNueva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbNueva.setPreferredSize(new java.awt.Dimension(80, 25));
        jbNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaActionPerformed(evt);
            }
        });
        jPanel1.add(jbNueva);
        jbNueva.setBounds(10, 360, 110, 30);

        jbGuardar.setBackground(java.awt.SystemColor.activeCaption);
        jbGuardar.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbGuardar.setText("Guardar Dieta");
        jbGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar);
        jbGuardar.setBounds(140, 360, 110, 30);

        jbEliminar.setBackground(java.awt.SystemColor.activeCaption);
        jbEliminar.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbEliminar.setText("Alta/Baja");
        jbEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar);
        jbEliminar.setBounds(270, 360, 110, 30);

        jlDieta.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jlDieta.setText("Gestion Dietas");
        jlDieta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jlDieta);
        jlDieta.setBounds(30, 10, 150, 30);

        jlNombre.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jlNombre.setText("Nombre");
        jPanel1.add(jlNombre);
        jlNombre.setBounds(90, 60, 70, 23);

        jlPaciente.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jlPaciente.setText("Paciente");
        jPanel1.add(jlPaciente);
        jlPaciente.setBounds(12, 105, 65, 23);

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel3.setText("Fecha Inicial");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 150, 99, 23);

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel4.setText("Peso Inicial");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 150, 88, 23);

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel5.setText("Peso Final");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 200, 90, 16);

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel6.setText("Genero");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 250, 54, 23);

        jtPaciente.setBackground(new java.awt.Color(255, 204, 153));
        jtPaciente.setPreferredSize(new java.awt.Dimension(10, 25));
        jtPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPacienteActionPerformed(evt);
            }
        });
        jtPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPacienteKeyTyped(evt);
            }
        });
        jPanel1.add(jtPaciente);
        jtPaciente.setBounds(170, 100, 160, 30);

        jtPesoInicial.setBackground(new java.awt.Color(255, 204, 153));
        jtPesoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPesoInicialKeyTyped(evt);
            }
        });
        jPanel1.add(jtPesoInicial);
        jtPesoInicial.setBounds(430, 150, 100, 30);

        jtPesoFinal.setBackground(new java.awt.Color(255, 204, 153));
        jtPesoFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPesoFinalKeyTyped(evt);
            }
        });
        jPanel1.add(jtPesoFinal);
        jtPesoFinal.setBounds(430, 200, 100, 30);

        jtGenero.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.add(jtGenero);
        jtGenero.setBounds(170, 250, 90, 30);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel1.setText("Altura");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 250, 50, 20);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setText("FechaFinal");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 200, 86, 23);

        jtAltura.setBackground(new java.awt.Color(255, 204, 153));
        jtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtAlturaKeyTyped(evt);
            }
        });
        jPanel1.add(jtAltura);
        jtAltura.setBounds(430, 250, 100, 30);

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
        jbBuscar.setBounds(360, 50, 100, 30);

        jdFechaFinal.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.add(jdFechaFinal);
        jdFechaFinal.setBounds(122, 200, 150, 22);

        jdFechaInicial.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.add(jdFechaInicial);
        jdFechaInicial.setBounds(122, 150, 150, 22);

        jlEstado.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jlEstado.setText("Estado");
        jPanel1.add(jlEstado);
        jlEstado.setBounds(10, 300, 70, 23);

        jrEstado.setBackground(new java.awt.Color(255, 204, 153));
        jrEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jrEstado);
        jrEstado.setBounds(170, 300, 19, 20);

        jtNombre.setBackground(new java.awt.Color(255, 204, 153));
        jtNombre.setPreferredSize(new java.awt.Dimension(10, 25));
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jtNombre);
        jtNombre.setBounds(170, 50, 160, 30);

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel7.setText("Id");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(12, 63, 25, 23);

        jtId.setBackground(new java.awt.Color(255, 204, 153));
        jtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdKeyTyped(evt);
            }
        });
        jPanel1.add(jtId);
        jtId.setBounds(40, 52, 40, 30);

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel8.setText("Peso Buscado");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 300, 110, 23);

        jtPesoBuscado.setBackground(new java.awt.Color(255, 204, 153));
        jtPesoBuscado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPesoBuscadoKeyTyped(evt);
            }
        });
        jPanel1.add(jtPesoBuscado);
        jtPesoBuscado.setBounds(430, 300, 100, 30);

        jbSalir.setBackground(java.awt.SystemColor.activeCaption);
        jbSalir.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbSalir.setText("Volver");
        jbSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir);
        jbSalir.setBounds(10, 420, 110, 25);

        Fondo.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/green-682620_1280.jpg"))); // NOI18N
        jPanel1.add(Fondo);
        Fondo.setBounds(0, 0, 1000, 660);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 680);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaActionPerformed
        
        jtId.setText("");
        jtNombre.setText("");
        jtPaciente.setText("");
        jdFechaInicial.setDate(new java.util.Date());
        jtPesoInicial.setText("");
        jdFechaFinal.setDate(new java.util.Date());
        jtPesoFinal.setText("");
        jtPesoBuscado.setText("");
        jtGenero.setText("");
        jtAltura.setText("");
        jrEstado.setSelected(false);
        
        
    }//GEN-LAST:event_jbNuevaActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

         if (jtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresar un Id");
        } else {
            DietaData dd = new DietaData();
            Dieta dieta = new Dieta();
            PacienteData pd = new PacienteData();
            Paciente paci = new Paciente();
            dieta = dd.buscarDieta(Integer.parseInt(jtId.getText()));
            
            if (dieta == null) {
                JOptionPane.showMessageDialog(this, "Dieta no existe");

            } else {
                paci = pd.buscarPaciente(dieta.getPaciente().getIdPaciente());
                jtNombre.setText(dieta.getNombre());
                jtPaciente.setText("id: "+paci.getIdPaciente()+ ", nombre: " + paci.getNombre());
                LocalDate fi = dieta.getFechaInicial();
                LocalDate ff = dieta.getFechaFinal();
                java.util.Date date1 = java.util.Date.from(fi.atStartOfDay(ZoneId.systemDefault()).toInstant());
                java.util.Date date2 = java.util.Date.from(ff.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jdFechaInicial.setDate(date1);
                jtPesoInicial.setText(Double.toString((Double)dieta.getPesoInicial()));
                jdFechaFinal.setDate(date2);
                jtGenero.setText(dieta.getGenero());
                jtAltura.setText(Double.toString((Double)dieta.getAltura()));
                jtPesoBuscado.setText(Double.toString((Double)dieta.getPesoBuscado()));
                jtPesoFinal.setText(Double.toString((Double)dieta.getPesoFinal()));
                jrEstado.setSelected(paci.isEstado());
            }
        }
        
      
                                // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        DietaData dd = new DietaData();
        Dieta dieta = null;
        PacienteData pd = new PacienteData();
        Paciente paci = new Paciente();

        if (jtNombre.getText().isEmpty() || jtPaciente.getText().isEmpty() || jdFechaInicial.getDate() == null || jtPesoInicial.getText().isEmpty() || jtPesoBuscado.getText().isEmpty() || jdFechaFinal.getDate() == null || jtPesoFinal.getText().isEmpty() || jtAltura.getText().isEmpty() || jtGenero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "no puede haber campos vacios");
            return;
        }
        if (jtGenero.getText().equalsIgnoreCase("Masculino") || jtGenero.getText().equalsIgnoreCase("Femenino")) {

        } else {
            JOptionPane.showMessageDialog(this, "Para guardar un genero, se debe ingresar Masculino o Femenino ");
            return;
        }

        try {
            java.util.Date fechaIni = jdFechaInicial.getDate();
            java.util.Date fechaFin = jdFechaFinal.getDate();
            LocalDate fechaInicial = fechaIni.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFinal = fechaFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int id;
            if(jtId.getText().isEmpty()){
                id=0;
            }else id = Integer.parseInt(jtId.getText());

            dieta = dd.buscarDieta(id);
 
            if (dieta == null) {
                if (jtId.getText().isEmpty()) {

                } else {
                    JOptionPane.showMessageDialog(this, "no es necesario ingresar el id de dieta para guardar");
                    jtId.setText("");
                }
                ArrayList<Dieta> lista = new ArrayList<>();
                lista = (ArrayList<Dieta>) dd.listarDietas();
                dieta = new Dieta();

                dieta.setNombre(jtNombre.getText());
                //paci = pd.buscarPaciente(dieta.getPaciente().getIdPaciente());

                // paci.setNombre(jtPaciente.getText()) ;
                paci.setIdPaciente(Integer.parseInt(jtPaciente.getText()));

                dieta.setPaciente(paci);
                dieta.setFechaInicial(fechaInicial);
                dieta.setPesoInicial(Double.parseDouble(jtPesoInicial.getText()));
                dieta.setPesoBuscado(Double.parseDouble(jtPesoBuscado.getText()));
                dieta.setFechaFinal(fechaFinal);
                dieta.setPesoFinal(Double.parseDouble(jtPesoFinal.getText()));
                dieta.setAltura(Double.parseDouble(jtAltura.getText()));
                dieta.setGenero(jtGenero.getText());
                dieta.setEstado(jrEstado.isSelected());
                for (Dieta d : lista) {
                    if (d.getNombre().equals(dieta.getNombre()) ) {
                        JOptionPane.showMessageDialog(this, "La dieta ya existe, para modificar ingresar el id");
                        return;
                    } else {
                        dd.guardarDieta(dieta);
                    }
                }

            } else {

                if (dieta.isEstado() != jrEstado.isSelected()) {
                    JOptionPane.showMessageDialog(this, "Para cambiar el estado utilizar Alta/Baja");
                    if (jrEstado.isSelected()) {
                        jrEstado.setSelected(false);
                    } else {
                        jrEstado.setSelected(true);
                    }
                }
                dieta.setNombre(jtNombre.getText());
                paci.setIdPaciente(Integer.parseInt(jtPaciente.getText()));
                dieta.setPaciente(paci);
                dieta.setFechaInicial(fechaInicial);
                dieta.setPesoInicial(Double.parseDouble(jtPesoInicial.getText()));
                dieta.setPesoBuscado(Double.parseDouble(jtPesoBuscado.getText()));
                dieta.setFechaFinal(fechaFinal);
                dieta.setPesoFinal(Double.parseDouble(jtPesoFinal.getText()));
                dieta.setAltura(Double.parseDouble(jtAltura.getText()));
                dieta.setGenero(jtGenero.getText());
                dieta.setEstado(jrEstado.isSelected());
                dd.modificarDieta(dieta);
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido " + nfe);
        }


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (jtNombre.getText().isEmpty() || jtPaciente.getText().isEmpty() || jdFechaInicial.getDate() == null || jtPesoInicial.getText().isEmpty()|| jtPesoBuscado.getText().isEmpty() ||jdFechaFinal.getDate() == null || jtPesoFinal.getText().isEmpty()|| jtAltura.getText().isEmpty()||jtGenero.getText().isEmpty()) {//seria id y nombre???
            JOptionPane.showMessageDialog(this, "no puede haber campos vacios");
            return;
        }
        try {

            DietaData ad = new DietaData();
            Dieta dieta = new Dieta();
            Integer id = Integer.parseInt(jtId.getText());

            dieta = ad.buscarDieta(id);
            boolean b=dieta.isEstado();
            if (dieta == null) {
                JOptionPane.showMessageDialog(this, "No existe dieta");
                return;
            }
            if(jrEstado.isSelected()){
                ad.eliminarDieta(dieta.getIdDieta(), false);
                JOptionPane.showMessageDialog(this, "Se dio de Baja a la dieta");
                jrEstado.setSelected(false);
            }else{
                ad.eliminarDieta(dieta.getIdDieta(), true);
                JOptionPane.showMessageDialog(this, "Se dio de Alta a la dieta");
                jrEstado.setSelected(true);
            }
//            if(b!=jrEstado.isSelected()){
//                ad.eliminarDieta(dieta.getIdDieta(), jrEstado.isSelected());
//                if(dieta.isEstado()){
//                    JOptionPane.showMessageDialog(this, "Se dio de Baja a la dieta");
//                }else JOptionPane.showMessageDialog(this, "Se dio de Alta a la dieta");
//            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido");
        }


    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPacienteActionPerformed

    private void jtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_jtIdKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c!= ' '))
            evt.consume();
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPacienteKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_jtPacienteKeyTyped

    private void jtPesoInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesoInicialKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != '.')) evt.consume();
    }//GEN-LAST:event_jtPesoInicialKeyTyped

    private void jtPesoFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesoFinalKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != '.')) evt.consume();
    }//GEN-LAST:event_jtPesoFinalKeyTyped

    private void jtAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAlturaKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != '.')) evt.consume();
    }//GEN-LAST:event_jtAlturaKeyTyped

    private void jtPesoBuscadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesoBuscadoKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != '.')) evt.consume();
    }//GEN-LAST:event_jtPesoBuscadoKeyTyped

    private void jrEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoActionPerformed
        
    }//GEN-LAST:event_jrEstadoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        PanelPorDefecto bpm = new PanelPorDefecto();
        ShowPanel(bpm);
    }//GEN-LAST:event_jbSalirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNueva;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdFechaFinal;
    private com.toedter.calendar.JDateChooser jdFechaInicial;
    private javax.swing.JLabel jlDieta;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPaciente;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtAltura;
    private javax.swing.JTextField jtGenero;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPaciente;
    private javax.swing.JTextField jtPesoBuscado;
    private javax.swing.JTextField jtPesoFinal;
    private javax.swing.JTextField jtPesoInicial;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
     VistaPrincipalMenu bpn = new VistaPrincipalMenu();
            bpn.setVisible(true);
                
    }
    
    private void limiteInt() {
        int i = 0, cont = 0;
        for (i = 0; i < 9; i++) {
            cont++;
        }
    }

    private void ShowPanel(JPanel panel) {

        panel.setSize(1000, 680);
        panel.setLocation(0, 0);

        jPanel1.removeAll();
        jPanel1.add(panel, BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
    }
}

