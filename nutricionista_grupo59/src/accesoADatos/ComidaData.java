
package accesoADatos;

import entidades.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ComidaData {
    private Connection con=null;
    
    public ComidaData(){
        con=Conexion.getConexion();
    }
    
    public void guardarComida(Comida comida){
        String sql="INSERT INTO comida(nombre, detalle,cantCalorias,estado) VALUES ( ?,?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setBoolean(4, comida.isEstado());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                comida.setIdComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Comida Guardada");
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a guardarComida"+ex);
        }
    }    
        
     public Comida buscarComida(int id){
        String sql="SELECT nombre, detalle,cantCalorias,estado FROM `comida` WHERE idComida= ? ";
        Comida comida=null;
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                comida=new Comida();
                comida.setIdComida(id);
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                //comida.setCantCalorias( rs.getInt("cantCalorias"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a buscarComida"+ex);
        }
        return comida;
    }
     
     public void modificarComida(Comida comida){
        String sql="UPDATE comida SET nombre = ?,detalle = ?,cantCalorias = ?,estado = ? WHERE idComida = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setBoolean(4, comida.isEstado());
            ps.setInt(5, comida.getIdComida());
                    
            
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Comida modificada");
            }else{
                //aqui error
                JOptionPane.showMessageDialog(null, "Comida no se pudo modificar");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a modificarComida"+ex);
        } 
    }
     
   public void eliminarComida(int id){
        String sql="UPDATE comida SET estado = 0 WHERE idComida = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt (1,id);
            int exito= ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Materia borrada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a eliminarComida"+ex);
        }
        
    }
   
   public List<Comida> listarComida(){
        String sql="SELECT idComida, nombre, detalle, cantCalorias From comida WHERE estado = 1";
        ArrayList<Comida> comidas=new ArrayList<>();
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery() ;
            while(rs.next()){
                Comida comida=new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(rs.getBoolean("estado"));
                
                comidas.add(comida);
             }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a listarComida"+ex);
        }
        return comidas;
    }
   
   public Comida buscarNombreComida(String nombre){
        String sql="SELECT * FROM `comida` WHERE nombre = ?";
        Comida comida=null;
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
         
            ps.setString(1, nombre);
            ResultSet rs=ps.executeQuery();
             
             
            if (rs.next()) {
               comida = new Comida();
               comida.setNombre(nombre);
               comida.setIdComida(rs.getInt("idComida"));
               comida.setDetalle(rs.getString("detalle"));
               comida.setCantCalorias(rs.getInt("cantCalorias"));
               comida.setEstado(rs.getBoolean("estado"));
               
           }
           ps.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo acceder a buscarComida" + ex);
       }
       return comida;
                
    
                
               
            
    }
   
}

