package universidad.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import javax.swing.JOptionPane;
import universidad.Entidades.Alumno;
import universidad.Entidades.Inscripcion;
import universidad.Entidades.Materia;

public class InscripcionData {
    private Connection con = null;
    private MateriaData md = new MateriaData();
    private AlumnoData ad = new AlumnoData();
    
    public InscripcionData(){
        this.con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion insc){
        String sql="INSERT INTO inscripcion(idAlumno, idMateria, nota) VALUES (?, ?, ?)";
        
        try{PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, insc.getAlumno().getIdAlumno());
        ps.setInt(2, insc.getMateria().getIdMateria());
        ps.setDouble(3, insc.getNota());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if(rs.next){
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
    
    public List<Inscripcion> obtenerInscripcions(){
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
            String sql = "SELECT * FROM inscripcion";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
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
    
    public List<Inscripcion> obtenerInscripcionsPorAlumno(int idAlumno){
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
            String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
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
}