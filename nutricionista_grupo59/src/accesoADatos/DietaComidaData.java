
package accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DietaComidaData {
    private Connection con=null;
    
    public DietaComidaData(){
        con=Conexion.getConexion();
    }
}