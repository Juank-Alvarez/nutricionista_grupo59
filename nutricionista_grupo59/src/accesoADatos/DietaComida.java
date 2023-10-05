package accesoADatos;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;

//package dietacomida;
/**
 *
 * @author egle2
 */
public class DietaComida {

    private static class ConsultaNutricional {

        public ConsultaNutricional() {
        }

        private void setIdConsulta(int aInt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setObservaciones(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setCliente(ClienteNutricionista cliente) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setPlanNutricional(PlanNutricional plan) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private Object getPlanNutricional() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getObservaciones() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private Object getCliente() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class PlanNutricionalData {

        public PlanNutricionalData() {
        }

        private PlanNutricional buscarPlanNutricional(int aInt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class PlanNutricional {

        public PlanNutricional() {
        }
    }

    private static class Conexion {

        private static Connection getConexion() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public Conexion() {
        }
    }

    private static class ClienteNutricionista {

        public ClienteNutricionista() {
        }
    }

    /**
     */
//    public class DietaComida {
    private Connection con = null;
    private final PlanNutricionalData planData;
    private final ClienteNutricionistaData clienteData;

    public DietaComida() {
        this.clienteData = new ClienteNutricionistaData();
        this.planData = new PlanNutricionalData();
        this.con = Conexion.getConexion();
    }

    public void guardarConsultaNutricional(ConsultaNutricional consulta) {
        try {
            String sql = "INSERT INTO consulta_nutricional(idCliente, idPlanNutricional, observaciones) VALUES (?,?,?)";
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, consulta.getCliente().getIdCliente());
                ps.setInt(2, consulta.getPlanNutricional().getIdPlanNutricional());
                ps.setString(3, consulta.getObservaciones());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();

                if (rs.next()) {
                    consulta.setIdConsulta(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Consulta Nutricional Registrada");
                }
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder al guardado");
        }
    }

    public void actualizarObservaciones(int idConsulta, String observaciones) {
        String sql = "UPDATE consulta_nutricional SET observaciones = ? WHERE idConsulta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, observaciones);
            ps.setInt(2, idConsulta);
            int filas = ps.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Observaciones Actualizadas");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
    }

    public void borrarConsultaNutricional(int idConsulta) {
        String sql = "DELETE FROM consulta_nutricional WHERE idConsulta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idConsulta);
            int filas = ps.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Consulta Nutricional Eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
    }

    public List<ConsultaNutricional> obtenerConsultasNutricionales() {
        ArrayList<ConsultaNutricional> consultas = new ArrayList<>();
        String sql = "SELECT * FROM consulta_nutricional";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ConsultaNutricional consulta = new ConsultaNutricional();
                consulta.setIdConsulta(rs.getInt("idConsulta"));
                ClienteNutricionista cliente = clienteData.buscarClienteNutricionista(rs.getInt("idCliente"));
                PlanNutricional plan = planData.buscarPlanNutricional(rs.getInt("idPlanNutricional"));
                consulta.setCliente(cliente);
                consulta.setPlanNutricional(plan);
                consulta.setObservaciones(rs.getString("observaciones"));
                consultas.add(consulta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla consulta_nutricional");
        }
        return consultas;
    }

    public List<ConsultaNutricional> obtenerConsultasPorCliente(int idCliente) {
        ArrayList<ConsultaNutricional> consultas = new ArrayList();
        String sql = "SELECT * FROM consulta_nutricional WHERE idCliente = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ConsultaNutricional consulta = new ConsultaNutricional();
                consulta.setIdConsulta(rs.getInt("idConsulta"));
                ClienteNutricionista cliente = clienteData.buscarClienteNutricionista(rs.getInt("idCliente"));
                PlanNutricional plan = planData.buscarPlanNutricional(rs.getInt("idPlanNutricional"));
                consulta.setCliente(cliente);
                consulta.setPlanNutricional(plan);
                consulta.setObservaciones(rs.getString("observaciones"));
                consultas.add(consulta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla consulta_nutricional");
        }
        return consultas;
    }

    private static class ClienteNutricionistaData {

        public ClienteNutricionistaData() {
        }

        private ClienteNutricionista buscarClienteNutricionista(int aInt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}


//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
//    
//}
