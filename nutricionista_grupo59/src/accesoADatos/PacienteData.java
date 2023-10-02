
package accesoADatos;

import entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PacienteData {
    private Connection con=null;
    
    public PacienteData(){
        con=Conexion.getConexion();
    }
    
    public List<Paciente> listarPacientes(){
        String sql="SELECT idPaciente, nombre, apellido, dni, domicilio, telefono FROM paciente, dieta WHERE pesoFinal != pesoBuscado ";
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
                pacientes.add(paciente);
             }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla listarPacientes");
        }
        return pacientes;
        }
   
}
