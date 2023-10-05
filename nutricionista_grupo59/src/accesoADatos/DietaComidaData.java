
package accesoADatos;

import java.sql.Connection;

public class DietaComidaData {
    private Connection con=null;
    
    public DietaComidaData(){
        con=Conexion.getConexion();
    }
}
//