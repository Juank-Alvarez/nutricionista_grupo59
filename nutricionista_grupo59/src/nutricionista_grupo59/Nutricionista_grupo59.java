
package nutricionista_grupo59;

import accesoADatos.PacienteData;
import entidades.Paciente;


public class Nutricionista_grupo59 {

    public static void main(String[] args) {
        Paciente paciente1=new Paciente("Mauricio","Herrera",12345567,"SanJuan 2045","32435632",true);
        PacienteData pd=new PacienteData();
//        pd.agregarPaciente(paciente1);
        pd.modificarPaciente(paciente1);
        
    }
    
}
