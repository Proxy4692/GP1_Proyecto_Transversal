package universidad.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion_old {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB ="universidadulp";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static  Connection connection;
    
  private Conexion_old (){}    
    public static Connection getConexion(){
    
    
    if(connection ==null){
    
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
            
            JOptionPane.showMessageDialog(null,"Conectado");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al cargar los driver");
            
            
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error al cargar la Base de Datos");
        }
        }
    
        return connection;
        }
    }
   