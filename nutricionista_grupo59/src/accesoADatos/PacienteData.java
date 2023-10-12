
package accesoADatos;

import entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PacienteData {
    private Connection con=null;
    
    public PacienteData(){
        con=Conexion.getConexion();
    }
    
    public List<Paciente> listarPacientes(){
        String sql="SELECT idPaciente, nombre, apellido, dni, domicilio, telefono, paciente.estado FROM paciente"; 
        ArrayList<Paciente> pacientes=new ArrayList<>();
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery() ;
            while(rs.next()){
                Paciente paciente=new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setEstado(rs.getBoolean("estado"));
                pacientes.add(paciente);
             }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla listarPacientes"+ex);
        }
        return pacientes;
        }
    
    //
     public void agregarPaciente(Paciente paciente){
        String sql="INSERT INTO paciente ( nombre,apellido, dni, domicilio, telefono, estado) "
                + "VALUES (? ,? ,? , ?, ? ,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setInt(3, paciente.getDni());
            ps.setString(4, paciente.getDomicilio());
            ps.setString(5, paciente.getTelefono());
            ps.setBoolean(6, paciente.isEstado());
           // ps.setString(7, paciente.getContraseña());
            
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                
                paciente.setIdPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paciente Guardado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a agregarPaciente" + ex);
        }
    }
     
     //
     public void eliminarPaciente(int dni){
        String sql="UPDATE paciente SET estado = 0 WHERE dni = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt (1,dni);
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Paciente borrado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder eliminarPaciente");
        }
 
    }
     
     //
     public Paciente buscarPaciente(int id){
        String sql="SELECT nombre,apellido,dni, domicilio, telefono, estado  FROM paciente WHERE idPaciente = ? ";
        Paciente paciente= null;
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                paciente=new Paciente();
                paciente.setIdPaciente(id);
                paciente.setDni(rs.getInt("dni"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                
                paciente.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a buscarPaciente");
        }
        return paciente;
        
    }
   
     public Paciente buscarPacientePorDni(int dni){
        
         String sql="SELECT * FROM paciente WHERE dni = ? ";
        Paciente paciente=null;
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,dni);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                paciente=new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setDni(dni);
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
               // paciente.setContraseña(rs.getString("contraseña"));
                paciente.setEstado(rs.getBoolean("estado"));

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder buscarPacientePor Dni "+ ex);
        }
        return paciente;
        
    } 
     
     public void modificarPaciente(Paciente paciente){
        String sql="UPDATE paciente SET dni = ?, apellido = ?, nombre = ?, domicilio = ? , telefono =?"
                + "WHERE idPaciente = ?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getNombre());
            ps.setString(4, paciente.getDomicilio());
            ps.setString(5, paciente.getTelefono());
            ps.setInt(6, paciente.getIdPaciente());
            
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Paciente modificado");
            }else{
                JOptionPane.showMessageDialog(null, "Paciente no se pudo modificar");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a modificarAlumno"+ex);
        }
        
    }
}
