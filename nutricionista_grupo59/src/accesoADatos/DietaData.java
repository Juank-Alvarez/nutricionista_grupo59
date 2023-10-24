
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
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class DietaData {
    private Connection con=null;
    
    public DietaData(){
        con=Conexion.getConexion();
    }
    
    public void guardarDieta(Dieta dieta){
        String sql="INSERT INTO dieta ( idDieta, nombre,dieta.idPaciente,fechaInicial, pesoInicial,pesoBuscado,fechaFinal, "
                + "pesoFinal, altura, genero, estado) VALUES (? ,? ,? , ?, ? ,? , ? ,? ,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dieta.getIdDieta());
            ps.setString(2, dieta.getNombre());
            ps.setInt(3, dieta.getPaciente().getIdPaciente());
            ps.setDate(4, Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(5, dieta.getPesoInicial());
            ps.setDouble(6, dieta.getPesoBuscado());
            ps.setDouble(7, dieta.getPesoFinal());
            ps.setDate(8, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(9, dieta.getAltura());
            ps.setString(10, dieta.getGenero());
            ps.setBoolean(11, dieta.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                
                dieta.setIdDieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Dieta Guardada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a guardar dieta");
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
        String sql="SELECT idDieta,dieta.nombre, dieta.idpaciente, fechaInicial, pesoInicial,pesoBuscado,fechaFinal, pesoFinal,altura, genero, dieta.estado "
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
                paciente.setIdPaciente(id);
                dieta.setPaciente(paciente);
                dieta.setFechaInicial(LocalDate.MIN);
                //dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setPesoInicial(rs.getDouble("pesoInicial"));
                dieta.setPesoBuscado(rs.getDouble("pesoBuscado"));
                dieta.setFechaFinal(LocalDate.MIN);
                //dieta.setFechaInicial(rs.getDate("fechafinal").toLocalDate());
                dieta.setPesoFinal(rs.getDouble("pesoFinal"));
                dieta.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a buscarDieta"+ex);
        }
        return dieta;
        
    }
    
    public void modificarDieta(Dieta dieta){
        //no puse idpaciente, revisar despues
        String sql="UPDATE dieta SET nombre = ?, fechaInicial = ?, pesoInicial = ?, "
                + " pesoFinal = ?, fechaFinal = ?, altura = ?, genero = ?"
                + "WHERE idDieta = ?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, dieta.getNombre());
            ps.setDate(2, Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(3, dieta.getPesoInicial());
            
            ps.setDouble(5, dieta.getPesoFinal());
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(7, dieta.getAltura());
            ps.setString(8, dieta.getGenero());
            ps.setInt(9, dieta.getIdDieta());
            
            
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Dieta modificada");
            }else{
                JOptionPane.showMessageDialog(null, "Dieta no se pudo modificar");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a modificarDieta"+ex);
        }
        
    }
    
    public List<Dieta> listarDietas(){
        String sql="SELECT * FROM dieta"; 
        ArrayList<Dieta> dietas=new ArrayList<>();
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery() ;
            while(rs.next()){
                Dieta dieta=new Dieta();
                Paciente paci=new Paciente();
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setNombre(rs.getString("nombre"));
                paci.setIdPaciente(rs.getInt("idPaciente"));
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setPesoInicial(rs.getInt("pesoInicial"));
//                dieta.setPesoBuscado(rs.getInt("pesoBuscado");
                dieta.setPesoFinal(rs.getInt("pesoFinal"));
                dieta.setAltura(rs.getDouble("altura"));
                dieta.setGenero(rs.getString("genero"));
                dieta.setEstado(rs.getBoolean("estado"));
                dietas.add(dieta);
             }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla listarPacientes"+ex);
        }
        return dietas;
        }
    
}
