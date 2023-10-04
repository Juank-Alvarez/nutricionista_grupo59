
package accesoADatos;

import entidades.Dieta;
import entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class DietaData {
    private Connection con=null;
    
    public DietaData(){
        con=Conexion.getConexion();
    }
    
    public void agregarDieta(Dieta dieta){
        String sql="INSERT INTO dieta ( nombre,idPaciente,fechaInicial, pesoInicial, pesoBuscado, pesoFinal, "
                + "fechaFinal, altura, gereno, estado) VALUES (? ,? ,? , ?, ? ,? , ?, ? ,? ,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(4, dieta.getPesoInicial());
            ps.setDouble(5, dieta.getPesoBuscado());
            ps.setDouble(6, dieta.getPesoFinal());
            ps.setDate(7, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(8, dieta.getAltura());
            ps.setString(9, dieta.getGenero());
            ps.setBoolean(10, dieta.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                
                dieta.setIdDieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Dieta Guardada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a agregar dieta");
        }
    }
    
    public void eliminarDieta(int id){
        String sql="UPDATE dieta SET estado = 0 WHERE idDieta = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt (1,id);
            int exito= ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Dieta borrada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a eliminarDieta");
        }
    }
    
    public Dieta buscarDieta(int id){
        String sql="SELECT dieta.nombre, paciente.nombre, paciente.apellido, pesoInicial, pesoBuscado, pesoFinal "
                + "FROM dieta, paciente WHERE idDieta = ? ";
        Dieta dieta= null;
        Paciente paciente=null;
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                dieta=new Dieta();
                paciente=new Paciente();
                dieta.setIdDieta(id);
                dieta.setNombre(rs.getString("dieta.nombre"));
                paciente.setNombre(rs.getString("paciente.nombre"));
                paciente.setApellido(rs.getString("apellido"));
                dieta.setPaciente(paciente);
                dieta.setPesoInicial(rs.getDouble("pesoInicial"));
                dieta.setPesoBuscado(rs.getDouble("pesoBuscado"));
                dieta.setPesoFinal(rs.getDouble("pesoFinal"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a buscarPaciente");
        }
        return dieta;
        
    }
    
    public void modificarDieta(Dieta dieta){
        //no puse idpaciente, revisar despues
        String sql="UPDATE dieta SET nombre = ?, fechaInicial = ?, pesoInicial = ?, "
                + "pesoBuscado = ?, pesoFinal = ?, fechaFinal = ?, altura = ?, genero = ?"
                + "WHERE idDieta = ?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, dieta.getNombre());
            ps.setDate(2, Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(3, dieta.getPesoInicial());
            ps.setDouble(4, dieta.getPesoBuscado());
            ps.setDouble(5, dieta.getPesoFinal());
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(7, dieta.getAltura());
            ps.setString(8, dieta.getGenero());
            
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Dieta modificada");
            }else{
                JOptionPane.showMessageDialog(null, "Dieta no se pudo modificar");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a modificarDieta");
        }
        
    }
    
}
