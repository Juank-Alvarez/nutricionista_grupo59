
package nutricionista_grupo59;

import accesoADatos.ComidaData;
import accesoADatos.PacienteData;
import entidades.Comida;
import entidades.Paciente;
import java.util.ArrayList;


public class Nutricionista_grupo59 {

    public static void main(String[] args) {
//        Paciente paciente1=new Paciente("Mauricio","Herrera",12345567,"SanJuan 2045","435632",3,true);
        //PacienteData pd=new PacienteData();
//        pd.agregarPaciente(paciente1);
//        pd.modificarPaciente(paciente1);
//        pd.eliminarPaciente(3);
//         ArrayList<Paciente> lista=new ArrayList<>();
//         lista=(ArrayList<Paciente>) pd.listarPacientes();
//         for(Paciente pac : lista){
//             System.out.println(pac.toString());
//         }
//        Paciente pac=new Paciente();
//         pac=pd.buscarPaciente(3);
//        System.out.println(pac.toString());
          Comida comida1=new Comida("ensalada","mixta",150,true);
          Comida comida2=new Comida("sopa","de verduras",200,true);
          ComidaData cd=new ComidaData();
//          cd.guardarComida(comida1);
//          cd.guardarComida(comida2);
            System.out.println(cd.buscarComida(2));
          
    }
    
}
