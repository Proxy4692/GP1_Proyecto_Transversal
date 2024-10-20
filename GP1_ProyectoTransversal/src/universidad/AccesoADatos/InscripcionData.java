package universidad.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet gi = ps.getGeneratedKeys();
            if(gi.next()){
                insc.setIdInscripto(gi.getInt(1));
                JOptionPane.showMessageDialog(null, "El alumno "+insc.getAlumno().getNombre()+" "
                        +insc.getAlumno().getApellido()+" ha sido inscripto en "+insc.getMateria().getNombre());
            }else{
                    JOptionPane.showMessageDialog(null, "El alumno "+insc.getAlumno().getNombre()+" "
                        +insc.getAlumno().getApellido()+" no fue inscripto en "+insc.getMateria().getNombre());
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
            int an = ps.executeUpdate();
            if(an == 1){
                JOptionPane.showMessageDialog(null, "La nota fue actualizada a "+nota);
            }else{
                JOptionPane.showMessageDialog(null, "La nota no pudo ser actualizada a "+nota);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }
    
    public void borrarInscripcionAlumnoMateria(int idAlumno, int idMateria){
        try{
            String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int bi = ps.executeUpdate();
            if(bi == 1){
                Alumno alub = ad.buscarAlumno(idAlumno);
                Materia matb = md.buscarMateria(idMateria);                               
                JOptionPane.showMessageDialog(null, "Inscripcion del alumno "
                        +alub.getNombre()+" "+alub.getApellido()+" en la materia "
                        +matb.getNombre()+" ha sido anulada");
            }else{
                JOptionPane.showMessageDialog(null, "Inscripcion del alumno id "+idAlumno
                        +" no fue anulada");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
            String sql = "SELECT * FROM inscripcion";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet oi = ps.executeQuery();
            while(oi.next()){
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripto(oi.getInt("idInscripto"));
                Alumno alu = ad.buscarAlumno(oi.getInt("idAlumno"));
                Materia mat = md.buscarMateria(oi.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(oi.getDouble("nota"));
                cursadas.add(insc);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return cursadas;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
            String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet oia = ps.executeQuery();
            while(oia.next()){
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripto(oia.getInt("idInscripto"));
                Alumno alu = ad.buscarAlumno(oia.getInt("idAlumno"));
                Materia mat = md.buscarMateria(oia.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(oia.getDouble("nota"));
                cursadas.add(insc);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return cursadas;
    }
    
    public List<Materia> obtenerMateriasCursadasPorAlumno(int idAlumno){
        ArrayList<Materia> materias = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, materia.nombre, materia.anioMateria "
                +"FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria "
                + "AND inscripcion.idAlumno = ? AND materia.estado = true;";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet oma = ps.executeQuery();
            while(oma.next()){
                Materia materia = new Materia();
                materia.setIdMateria(oma.getInt("idMateria"));
                materia.setNombre(oma.getString("nombre"));
                materia.setAnioMateria(oma.getInt("anioMateria"));
                materias.add(materia);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return materias;
    }
    
    public List<Materia> obtenerMateriasNoCursadasPorAlumno(int idAlumno){
        ArrayList<Materia> materias = new ArrayList<>();    
        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria NOT IN "
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet onma = ps.executeQuery();
            while(onma.next()){
                Materia materia = new Materia();
                materia.setIdMateria(onma.getInt("idMateria"));
                materia.setNombre(onma.getString("nombre"));
                materia.setAnioMateria(onma.getInt("anioMateria"));
                materias.add(materia);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return materias;
    }
    
    public List<Alumno> obtenerAlumnosPorMateria(int idMateria){
        ArrayList<Alumno> alumnosMateria = new ArrayList<>();
        String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado "
                + "FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = true;";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet apm = ps.executeQuery();
            while(apm.next()){
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(apm.getInt("idAlumno"));
                alumno.setApellido(apm.getString("apellido"));
                alumno.setNombre(apm.getString("nombre"));
                alumno.setFechaNacimiento(apm.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(apm.getBoolean("estado"));
                alumnosMateria.add(alumno);
            }
            ps.close();
            }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
        return alumnosMateria;
    }
}
