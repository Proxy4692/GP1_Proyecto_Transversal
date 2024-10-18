package universidad.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import universidad.Entidades.Alumno_old;
import universidad.Entidades.Inscripcion_old;
import universidad.Entidades.Materia_old;

public class InscripcionData_old{
    private Connection con = null;
    private MateriaData_old md = new MateriaData_old();
    private AlumnoData_old ad = new AlumnoData_old();
    
    public InscripcionData_old(){
        this.con = Conexion_old.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion_old insc){
        String sql="INSERT INTO inscripcion(idAlumno, idMateria, nota) VALUES (?, ?, ?)";
        
        try{PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, insc.getAlumno().getIdAlumno());
        ps.setInt(2, insc.getMateria().getIdMateria());
        ps.setDouble(3, insc.getNota());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if(rs.next()){
            insc.setIdInscripcion(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Inscripcion Registrada");
        }
        ps.close();
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        try{
            String sql= "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "Nota Actualizada");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }
    public void borrarInscripcion(int idAlumno, int idMateria){
        try{
            String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filas = ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "Inscripcion Borrada");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }
    
    public List<Inscripcion_old> obtenerInscripcions(){
        ArrayList<Inscripcion_old> cursadas = new ArrayList<>();
            String sql = "SELECT * FROM inscripcion";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Inscripcion_old insc = new Inscripcion_old();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno_old alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia_old mat = md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return cursadas;
    }
    
    public List<Inscripcion_old> obtenerInscripcionsPorAlumno(int idAlumno){
        ArrayList<Inscripcion_old> cursadas = new ArrayList<>();
            String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Inscripcion_old insc = new Inscripcion_old();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno_old alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia_old mat = md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return cursadas;
    }
    
    public List<Materia_old> obtenerMateriasCursadas(int idAlumno){
        ArrayList<Materia_old> materias = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion,"
                + " materia WHERE inscripcion.idMateria = materia.idMateria"
                + "AND inscripcion.idAlumno = ?;";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Materia_old materia = new Materia_old();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.add(materia);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return materias;
    }
    
    public List<Materia_old> obtenerMateriasNoCursadas(int idAlumno){
        ArrayList<Materia_old> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in "
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Materia_old materia = new Materia_old();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.add(materia);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return materias;
    }
    
    public List<Alumno_old> obtenerAlumnosPorMateria(int idMateria){
        ArrayList<Alumno_old> alumnosMateria = new ArrayList<>();
        String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado"
                + "FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = 1";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Alumno_old alumno = new Alumno_old();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnosMateria.add(alumno);
            }
            ps.close();
                    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
        return alumnosMateria;
    }
}