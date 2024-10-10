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
    private Connection con;
    
    public MateriaData() {
    }

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, anio, activo) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, materia.getNombre());
                ps.setInt(2, materia.getAnioMateria());
                ps.setBoolean(3, materia.isActivo());

                ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    materia.setIdMateria(rs.getInt(1));
            }
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error al guardar la materia: " + ex.getMessage());
        }
    }

    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT * FROM materia WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria (rs.getInt("idMateria"));
                materia.setNombre (rs.getString("nombre"));
                materia.setAnioMateria (rs.getInt("anio"));
                materia.setActivo (rs.getBoolean("activo"));
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar la materia: " + ex.getMessage());
        }
        return materia;
    }

    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre = ?, anio = ?, activo = ? WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement (sql);
            ps.setString(1, materia. getNombre ());
            ps.setInt(2, materia. getAnioMateria ());
            ps.setBoolean(3, materia. isActivo ());
            ps.setInt(4, materia. getIdMateria ());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al modificar la materia: " + ex.getMessage());
        }
    }

    public void eliminarMateria(int id) {
        String sql = "DELETE FROM materia WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar la materia: " + ex.getMessage());
        }
    }

    public List<Materia> listarMaterias() {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia";
        try {
                PreparedStatement ps = con.prepareStatement (sql);
                ResultSet rs = ps.executeQuery ();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria (rs.getInt ("idMateria"));
                materia.setNombre (rs.getString ("nombre"));
                materia.setAnioMateria (rs.getInt ("anio"));
                materia.setActivo (rs.getBoolean ("activo"));
                materias.add(materia);
            }
            ps.close ();
        } catch (SQLException ex) {
            System.out.println ("Error al listar las materias: " + ex.getMessage ());
        }
        return materias;
    }
}
