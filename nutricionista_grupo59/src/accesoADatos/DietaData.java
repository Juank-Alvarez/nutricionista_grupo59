
package accesoADatos;

import java.sql.Connection;

public class DietaData {
    private Connection con=null;
    
    public DietaData(){
        con=Conexion.getConexion();
    }
}
