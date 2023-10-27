
package Vistas;

import accesoADatos.ComidaData;
import entidades.Comida;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class PanelGestionesComidas extends javax.swing.JPanel {
    
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };
    
    int id=0;
   
    public PanelGestionesComidas() {
        initComponents();
        armarCabecera();
        ComidaData cd=new ComidaData();
        ArrayList<Comida> lista= new ArrayList<>();
        lista=(ArrayList<Comida>) cd.listarComida();
        for(Comida m: lista){
            modelo.addRow(new Object[]{m.getIdComida(), m.getNombre(), m.getCantCalorias()});
        }
    }
    
//    public PanelGestionesComidas(int id) {
//        initComponents();
//        ComidaData cd=new ComidaData();
//        Comida comi=new Comida();
//        comi=cd.buscarComida(id);
//        
//        jtNombreComida.setText(comi.getNombre());
//        jtDetalle.setText(comi.getDetalle());
//        jtCantCalorias.setText(comi.getCantCalorias()+"");
//        rbEstado.setSelected(comi.isEstado());
//    }

    public PanelGestionesComidas(String nombre){
        initComponents();
        JOptionPane.showMessageDialog(this, nombre);
        if(nombre.isEmpty()){
            
        }else{
            ComidaData cd=new ComidaData();
            Comida comi=new Comida();
            comi=cd.buscarNombreComida(nombre);
            jtNombreComida.setText(nombre);
            jtDetalle.setText(comi.getDetalle());
            jtCantCalorias.setText(comi.getCantCalorias()+"");
            rbEstado.setSelected(comi.isEstado());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jbLimpiarCampos = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbEstado = new javax.swing.JRadioButton();
        jtNombreComida = new javax.swing.JTextField();
        jtDetalle = new javax.swing.JTextField();
        jtCantCalorias = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtComidas = new javax.swing.JTable();
        jbSeleccionar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 680));
        setLayout(null);

        contenido.setPreferredSize(new java.awt.Dimension(1000, 650));
        contenido.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 2, 24)); // NOI18N
        jLabel1.setText("Gestion Comidas");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenido.add(jLabel1);
        jLabel1.setBounds(30, 10, 180, 40);

        jbAgregar.setBackground(java.awt.SystemColor.activeCaption);
        jbAgregar.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbAgregar.setText("Agregar");
        jbAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAgregar.setPreferredSize(new java.awt.Dimension(125, 25));
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        contenido.add(jbAgregar);
        jbAgregar.setBounds(15, 360, 120, 25);

        jbLimpiarCampos.setBackground(java.awt.SystemColor.activeCaption);
        jbLimpiarCampos.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbLimpiarCampos.setText("Limpiar Campos");
        jbLimpiarCampos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbLimpiarCampos.setPreferredSize(new java.awt.Dimension(125, 25));
        jbLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarCamposActionPerformed(evt);
            }
        });
        contenido.add(jbLimpiarCampos);
        jbLimpiarCampos.setBounds(15, 240, 120, 25);

        jbModificar.setBackground(java.awt.SystemColor.activeCaption);
        jbModificar.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbModificar.setPreferredSize(new java.awt.Dimension(125, 25));
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        contenido.add(jbModificar);
        jbModificar.setBounds(15, 320, 120, 25);

        jbBuscar.setBackground(java.awt.SystemColor.activeCaption);
        jbBuscar.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBuscar.setPreferredSize(new java.awt.Dimension(125, 25));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        contenido.add(jbBuscar);
        jbBuscar.setBounds(15, 280, 120, 25);

        jbVolver.setBackground(java.awt.SystemColor.activeCaption);
        jbVolver.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbVolver.setText("Volver");
        jbVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbVolver.setPreferredSize(new java.awt.Dimension(125, 25));
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        contenido.add(jbVolver);
        jbVolver.setBounds(15, 400, 120, 25);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setText("Nombre Comida");
        contenido.add(jLabel2);
        jLabel2.setBounds(12, 76, 140, 23);

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel3.setText("Detalle");
        contenido.add(jLabel3);
        jLabel3.setBounds(12, 116, 120, 23);

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel4.setText("Cantidad Calorias");
        contenido.add(jLabel4);
        jLabel4.setBounds(12, 161, 140, 23);

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel5.setText("Estado");
        contenido.add(jLabel5);
        jLabel5.setBounds(12, 199, 120, 23);

        rbEstado.setBackground(new java.awt.Color(255, 204, 153));
        contenido.add(rbEstado);
        rbEstado.setBounds(190, 200, 19, 20);

        jtNombreComida.setBackground(new java.awt.Color(255, 204, 153));
        jtNombreComida.setPreferredSize(new java.awt.Dimension(10, 30));
        jtNombreComida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreComidaKeyTyped(evt);
            }
        });
        contenido.add(jtNombreComida);
        jtNombreComida.setBounds(190, 70, 224, 30);

        jtDetalle.setBackground(new java.awt.Color(255, 204, 153));
        jtDetalle.setPreferredSize(new java.awt.Dimension(10, 30));
        contenido.add(jtDetalle);
        jtDetalle.setBounds(190, 116, 224, 30);

        jtCantCalorias.setBackground(new java.awt.Color(255, 204, 153));
        jtCantCalorias.setPreferredSize(new java.awt.Dimension(10, 30));
        jtCantCalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCantCaloriasKeyTyped(evt);
            }
        });
        contenido.add(jtCantCalorias);
        jtCantCalorias.setBounds(190, 162, 224, 30);

        jtComidas.setBackground(new java.awt.Color(255, 204, 153));
        jtComidas.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.MatteBorder(null)));
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
        jScrollPane1.setBounds(490, 30, 302, 230);

        jbSeleccionar.setBackground(java.awt.SystemColor.activeCaption);
        jbSeleccionar.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jbSeleccionar.setText("Seleccionar");
        jbSeleccionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSeleccionar.setPreferredSize(new java.awt.Dimension(125, 25));
        jbSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarActionPerformed(evt);
            }
        });
        contenido.add(jbSeleccionar);
        jbSeleccionar.setBounds(500, 290, 120, 25);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/breakfast-5132879_1920.jpg"))); // NOI18N
        contenido.add(Fondo);
        Fondo.setBounds(0, 0, 1030, 680);

        add(contenido);
        contenido.setBounds(0, 0, 930, 680);
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        

        ComidaData cm= new ComidaData();
        Comida comi = new Comida();
        comi = cm.buscarNombreComida(jtNombreComida.getText());
        if(jtNombreComida.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre para buscar");
            return;
        }
        if (comi == null){
            JOptionPane.showMessageDialog(this,"La comida no existe");
        }else{
            
            jtDetalle.setText(comi.getDetalle());
            jtCantCalorias.setText(Integer.toString(comi.getCantCalorias()));
            rbEstado.setSelected(comi.isEstado());
        }        
            
            
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
                
        if (jtNombreComida.getText().isEmpty() || jtDetalle.getText().isEmpty() || jtCantCalorias.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
            return;
        
        }
        try {
            Comida comi = new Comida();
            Comida comidas = new Comida();
            ComidaData cd = new ComidaData();
            comi = cd.buscarNombreComida(jtNombreComida.getText());
            if (comi == null) {
                
                comidas.setNombre(jtNombreComida.getText());
                comidas.setDetalle(jtDetalle.getText());
                comidas.setCantCalorias(Integer.parseInt(jtCantCalorias.getText()));
                comidas.setEstado(rbEstado.isSelected());

                cd.guardarComida(comidas);
                
                borrarFilasTabla();
                ArrayList<Comida> lista = new ArrayList<>();
                lista = (ArrayList<Comida>) cd.listarComida();
                for (Comida m : lista) {
                    modelo.addRow(new Object[]{m.getIdComida(), m.getNombre(), m.getCantCalorias()});
                }
                
            } else JOptionPane.showMessageDialog(this, "La comida ya existe");

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos validos");
        }
       
                                            

        
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
    
        if (jtNombreComida.getText().isEmpty() || jtDetalle.getText().isEmpty() || jtCantCalorias.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "no puede haber campos vacios");
            return;
        }
        try {
            ComidaData cd = new ComidaData();
            Comida comi = new Comida();
            comi = cd.buscarComida(id);
            boolean b=comi.isEstado();
            if (comi != null) {
                comi.setIdComida(id);
                comi.setDetalle(jtDetalle.getText());
                comi.setNombre(jtNombreComida.getText());
                comi.setCantCalorias(Integer.parseInt(jtCantCalorias.getText()));
                comi.setEstado(rbEstado.isSelected());
                if(b!=rbEstado.isSelected()){
                    if(rbEstado.isSelected()){
                        JOptionPane.showMessageDialog(this, "Se dio de Alta a la comida");
                    }else JOptionPane.showMessageDialog(this, "Se dio de Baja a la comida");
                }
                cd.modificarComida(comi);
                
                borrarFilasTabla();
                ArrayList<Comida> lista = new ArrayList<>();
                lista = (ArrayList<Comida>) cd.listarComida();
                for (Comida m : lista) {
                    modelo.addRow(new Object[]{m.getIdComida(), m.getNombre(), m.getCantCalorias()});
                }
            } else {
                JOptionPane.showMessageDialog(this, "La comida no existe");
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos validos");
        }

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarCamposActionPerformed
        jtNombreComida.setText("");
        jtDetalle.setText("");
        jtCantCalorias.setText("");
        rbEstado.setSelected(false);
    }//GEN-LAST:event_jbLimpiarCamposActionPerformed

    private void jtCantCaloriasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCantCaloriasKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_jtCantCaloriasKeyTyped

    private void jtNombreComidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreComidaKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c!= ' '))
            evt.consume();
    }//GEN-LAST:event_jtNombreComidaKeyTyped

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed
        int filaseleccionada=jtComidas.getSelectedRow();
        if(filaseleccionada != -1) {
            ComidaData cd=new ComidaData();
            Comida comi=new Comida();
            comi=cd.buscarComida((Integer)jtComidas.getValueAt(filaseleccionada, 0));
            id=(Integer)jtComidas.getValueAt(filaseleccionada, 0);
            jtNombreComida.setText(comi.getNombre());
            jtDetalle.setText(comi.getDetalle());
            jtCantCalorias.setText(comi.getCantCalorias()+"");
            rbEstado.setSelected(comi.isEstado());
        }
    }//GEN-LAST:event_jbSeleccionarActionPerformed

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
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiarCampos;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSeleccionar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTextField jtCantCalorias;
    private javax.swing.JTable jtComidas;
    private javax.swing.JTextField jtDetalle;
    private javax.swing.JTextField jtNombreComida;
    private javax.swing.JRadioButton rbEstado;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad de Calorias");
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

    private void borrarFilasTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
}

