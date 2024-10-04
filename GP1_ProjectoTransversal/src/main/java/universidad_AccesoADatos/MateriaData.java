package universidad_AccesoADatos;

import java.sql.Connection;
import universidad.Entidades.Materia;

public class MateriaData {
    private Connection con = null;
    
    public MateriaData(){
        this.con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        
    }
}
