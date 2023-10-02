
package accesoADatos;

import java.sql.Connection;


public class PacienteData {
    private Connection con=null;
    
    public PacienteData(){
        con=Conexion.getConexion();
    }
    
    
    
}
