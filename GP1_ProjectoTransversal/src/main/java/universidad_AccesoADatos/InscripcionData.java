package universidad_AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidad.Entidades.Inscripcion;

public class InscripcionData {
    private Connection con = null;
    
    public InscripcionData(){
        this.con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion insc){
        String sql="INSERT INTO inscripcion(idAlumno, idMateria, nota) VALUES (?, ?, ?)";
        
        try{PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, insc.getAlumno().getIdAlumno());
        ps.setInt(2, insc.getMateria().getIdMateria());
        ps.setDouble(3, insc.getNota());
        
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }
}