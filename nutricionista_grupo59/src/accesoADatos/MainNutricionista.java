package accesoADatos;


import java.util.List;

/**
 *
 * @author egle2
 */
public class MainNutricionista {

    public static void main(String[] args) {
        // Tu código aquí
    }

//    public static void main(String[] args) {
    // Aquí puedes crear objetos de la clase ConsultaData o realizar operaciones relacionadas con la nutrición.
    // Por ejemplo:
    ConsultaData consultaData = new ConsultaData();

    // Crear una nueva consulta nutricional
    ClienteNutricionista cliente = new ClienteNutricionista(/* datos del cliente */);
    PlanNutricional planNutricional = new PlanNutricional(/* datos del plan nutricional */);
    private ConsultaNutricional nuevaConsulta;

    public MainNutricionista() {
        this.nuevaConsulta = new ConsultaNutricional(cliente, planNutricional, "Observaciones de la consulta");
    }

    consultaData.guardarConsultaNutricional (nuevaConsulta);

    // Realizar otras operaciones relacionadas con la nutrición
    // ...
    // Obtener y mostrar consultas nutricionales
    private List<ConsultaNutricional> consultas = consultaData.obtenerConsultasNutricionales();

    for (private ConsultaNutricional consulta : consultas

    
        ) {
            System.out.println("ID: " + getConsulta().getIdConsulta());
        System.out.println(getConsulta().getCliente().getNombreCompleto() + "Cliente: ");
        System.out.println(getConsulta().getPlanNutricional().getNombre() + "Plan Nutricional: ");
        System.out.println("Observaciones: " + getConsulta().getObservaciones());
        System.out.println();
    }

    /**
     * @return the nuevaConsulta
     */
    public ConsultaNutricional getNuevaConsulta() {
        return nuevaConsulta;
    }

    /**
     * @param nuevaConsulta the nuevaConsulta to set
     */
    public void setNuevaConsulta(ConsultaNutricional nuevaConsulta) {
        this.nuevaConsulta = nuevaConsulta;
    }

    private static class nuevaConsulta {

        public nuevaConsulta() {
        }
    }

    /**
     * @return the consulta
     */
    public ConsultaNutricional getConsulta() {
        return consulta;
    }

    /**
     * @param consulta the consulta to set
     */
    public void setConsulta(ConsultaNutricional consulta) {
        this.consulta = consulta;
    }

    /**
     * @return the consultas
     */
    public List<ConsultaNutricional> getConsultas() {
        return consultas;
    }

    /**
     * @param consultas the consultas to set
     */
    public void setConsultas(List<ConsultaNutricional> consultas) {
        this.consultas = consultas;
    }
}

class ConsultaData {

    public ConsultaData() {
    }

}

class ClienteNutricionista {

    public ClienteNutricionista() {
    }
}

class PlanNutricional {

    public PlanNutricional() {
    }
}

class ConsultaNutricional {

    public ConsultaNutricional() {
    }

    String getIdConsulta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getPlanNutricional() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getObservaciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
