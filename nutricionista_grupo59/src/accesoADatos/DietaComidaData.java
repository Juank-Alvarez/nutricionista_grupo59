package accesoADatos;

import entidades.Comida;
import entidades.Dieta;
import entidades.Dietacomida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DietaComidaData {

    private Connection con = null;
    private DietaData dietad = new DietaData();
    private ComidaData comidad = new ComidaData();

    public DietaComidaData() {
        con = Conexion.getConexion();
    }

    public void guardarDietaComida(Dietacomida diet) {

        try {
            String sql = "INSERT INTO dietacomida(idDieta,idComida) VALUES (?,?)";
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, diet.getDieta().getIdDieta());
                ps.setInt(2, diet.getComida().getIdComida());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();

                if (rs.next()) {

                    diet.setIdDietaComida(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Comida agregada");
                }
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar la dieta");

        }

    }

    public void borrarDietaComida(int idComida, int idDieta) {

        String sql = "DELETE FROM dietacomida WHERE idComida = ? and idDieta = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idComida);
            ps.setInt(2, idDieta);

            int filas = ps.executeUpdate();
            if (filas > 0) {

                JOptionPane.showMessageDialog(null, "Se elimino la comida ");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al aceder a borrar dieta comida ");
        }
    }

    public List<Dietacomida> obtenerDietaComida() {
        ArrayList<Dietacomida> dietas = new ArrayList<>();

        String sql = "SELECT * FROM dietacomida";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Dietacomida insc = new Dietacomida();
                insc.setIdDietaComida(rs.getInt("idDietaComida"));
                Comida com = comidad.buscarComida(rs.getInt("idComida"));
                Dieta die = dietad.buscarDieta(rs.getInt("idDieta"));
                insc.setComida(com);
                insc.setDieta(die);

                dietas.add(insc);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener dietas");
        }
        return dietas;
    }

    public List<Dietacomida> obtenerDietaPorPaciente(int idPaciente) {

        ArrayList<Dietacomida> diet = new ArrayList();

        String sql = "SELECT * FROM dietacomida WHERE idPaciente = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Dietacomida insc = new Dietacomida();
                insc.setIdDietaComida(rs.getInt("idDietaComida"));
                Comida com = comidad.buscarComida(rs.getInt("idComida"));
                Dieta die = dietad.buscarDieta(rs.getInt("idDieta"));
                insc.setComida(com);
                insc.setDieta(die);
               
                diet.add(insc);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla obtener DietaPorPaciente");
        }

        return diet;

    }

    public Dietacomida buscarDietaComida(int idd, int idc){
        
         String sql="SELECT * FROM dietaComida WHERE idDieta = ? AND idComida = ?";
        Dietacomida dietcomi=null;
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idd);
            ps.setInt(2,idc);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                dietcomi =new Dietacomida();
                Comida comi=new Comida();
                Dieta diet=new Dieta();
                comi.setIdComida(idc);
                diet.setIdDieta(idd);
                dietcomi.setComida(comi);
                dietcomi.setDieta(diet);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder buscarPacientePor Dni "+ ex);
        }
        return dietcomi;
        
    } 
    
    public List<Comida> obtenerComidasPorDieta(int idDieta) {

        ArrayList<Comida> comidas = new ArrayList();

          String sql = "SELECT comida.idComida, comida.nombre, comida.cantCalorias "
                  + "FROM comida, dietacomida WHERE dietacomida.idComida = comida.idComida "
                  + "AND idDieta = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Comida comi= new Comida();
                comi.setNombre(rs.getString("nombre"));
                comi.setIdComida(rs.getInt("idComida"));
                comi.setCantCalorias(rs.getInt("cantCalorias"));
                comidas.add(comi);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla obtenerComidaPorDieta");
        }
        return comidas;
    }
    
    public List<Comida> obtenerComidasSinDieta(int idDieta) {

        ArrayList<Comida> comidas = new ArrayList();

//          String sql = "SELECT comida.idComida, comida.nombre, comida.cantCalorias "
//                  + "FROM comida, dietacomida WHERE dietacomida.idComida != comida.idComida ";

        String sql = "SELECT comida.idComida, comida.nombre, comida.cantCalorias "
           + "FROM comida "
           + "WHERE comida.idComida NOT IN ("
           + "    SELECT dietacomida.idComida "
           + "    FROM dietacomida "
           + "    WHERE dietacomida.idDieta = ?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Comida comi= new Comida();
                comi.setNombre(rs.getString("nombre"));
                comi.setIdComida(rs.getInt("idComida"));
                comi.setCantCalorias(rs.getInt("cantCalorias"));
                comidas.add(comi);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla obtenerComidaPorDieta");
        }
        return comidas;
    }
}
