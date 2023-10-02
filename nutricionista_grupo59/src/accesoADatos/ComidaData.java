
package accesoADatos;

import java.sql.Connection;

public class ComidaData {
    private Connection con=null;
    
    public ComidaData(){
        con=Conexion.getConexion();
    }
}
