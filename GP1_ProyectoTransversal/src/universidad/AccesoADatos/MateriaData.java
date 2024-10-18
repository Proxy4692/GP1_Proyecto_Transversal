package universidad.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidad.Entidades.Materia;


public class MateriaData {
    
    private Connection con = null;
    
    public MateriaData(){
        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia){
        String sql = "INSERT INTO materia (nombre, anioMateria, estado) VALUES (?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            ResultSet mg = ps.getGeneratedKeys();
            if (mg.next()) {
                    materia.setIdMateria(mg.getInt(1));
                    JOptionPane.showMessageDialog(null, "La materia "+materia.getNombre()
                            +" ha sido guardada exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "La materia no pudo ser guardada");
            }
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error al guardar la materia: " + ex.getMessage());
        }
    }
    
    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET nombre = ?, anioMateria = ?, estado = ? WHERE idMateria = ?";
        try{
            PreparedStatement ps = con.prepareStatement (sql);
            ps.setString(1, materia. getNombre ());
            ps.setInt(2, materia. getAnioMateria ());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia. getIdMateria ());
            int mm=ps.executeUpdate();
            if (mm == 1){
                JOptionPane.showMessageDialog(null, "La materia " +materia.getNombre()
                        +" fue modificada exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "La materia " +materia.getNombre()
                        +" no fue modificada");
            }
            
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al modificar la materia: " + ex.getMessage());
        }
    }
    
        public void eliminarMateria(int id){
        String sql = "DELETE FROM materia WHERE idMateria = ?";
        try{
            MateriaData md = new MateriaData();
            Materia matb = md.buscarMateria(id);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int me=ps.executeUpdate();
            if(me == 1){
                JOptionPane.showMessageDialog(null, "La materia " +matb.getNombre()
                        +" ha sido eliminada");
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al eliminar la materia: " + ex.getMessage());
        }
    }
        
        
        public Materia buscarMateria(int id){
        Materia materia = null;
        String sql = "SELECT * FROM materia WHERE idMateria = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet mb = ps.executeQuery();
            if (mb.next()) {
                materia = new Materia();
                materia.setIdMateria (mb.getInt("idMateria"));
                materia.setNombre (mb.getString("nombre"));
                materia.setAnioMateria (mb.getInt("anioMateria"));
                materia.setEstado (mb.getBoolean("estado"));
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al buscar la materia: " + ex.getMessage());
        }
        return materia;
    }
        
        public List<Materia> listarMaterias(){
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia";
        try{
                PreparedStatement ps = con.prepareStatement (sql);
                ResultSet ml = ps.executeQuery ();
            while (ml.next()) {
                Materia materia = new Materia();
                materia.setIdMateria (ml.getInt ("idMateria"));
                materia.setNombre (ml.getString ("nombre"));
                materia.setAnioMateria (ml.getInt ("anioMateria"));
                materia.setEstado (ml.getBoolean ("estado"));
                materias.add(materia);
            }
            ps.close ();
        }catch(SQLException ex){
            System.out.println ("Error al listar las materias: " + ex.getMessage ());
        }
        return materias;
    }
}
