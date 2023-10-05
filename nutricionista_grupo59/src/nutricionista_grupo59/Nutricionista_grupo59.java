
package nutricionista_grupo59;

import accesoADatos.ComidaData;
import accesoADatos.DietaData;
import accesoADatos.PacienteData;
import entidades.Comida;
import entidades.Dieta;
import entidades.Paciente;
import java.time.LocalDate;
import java.util.ArrayList;


public class Nutricionista_grupo59 {

    public static void main(String[] args) {
        Paciente paciente1=new Paciente("Mauricio","Herrera",12345567,"SanJuan 2045","435632",3,true);
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
//          Comida comida1=new Comida("ensalada","mixta",150,true);
//          Comida comida2=new Comida(1,"tarta","dulce",1000,true);
//          ComidaData cd=new ComidaData();
////          cd.guardarComida(comida1);
//          cd.guardarComida(comida2);
//            //System.out.println(cd.buscarComida(2));
//            cd.modificarComida(comida2);
//            System.out.println(cd.buscarComida(2));
//         ArrayList<Comida> lista=new ArrayList<>();
//         lista=(ArrayList<Comida>)cd.listarComida();
//         for(Comida co: lista){
//             System.out.println(co.toString());
//         }
        Dieta dieta1=new Dieta(1,"astringente",paciente1,LocalDate.of(2020, 02, 07),100,90,"Masculino",1.80,LocalDate.of(2021, 05, 02),true);
        DietaData dd= new DietaData();
        Dieta dieta2=new Dieta();
//        dd.agregarDieta(dieta1);
        dieta2=dd.buscarDieta(1);
        System.out.println(dieta2.toString());
/*String nombre, Paciente paciente, LocalDate fechaInicial, double pesoInicial, double pesoBuscado, double pesoFinal, String genero, double altura, LocalDate fechaFinal, boolean estado)*/
        
        
         
//         System.out.println(cd.buscarNombreComida(3));
         
//          
    }
    
}
