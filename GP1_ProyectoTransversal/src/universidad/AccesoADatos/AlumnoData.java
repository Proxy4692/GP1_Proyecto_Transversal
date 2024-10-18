package universidad.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidad.Entidades.Alumno;

public class AlumnoData {
    
    private Connection con = null;

    public AlumnoData(){
        con = Conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) "
                + "VALUES (?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            ResultSet ag = ps.getGeneratedKeys();
            if(ag.next()){
                alumno.setIdAlumno(ag.getInt(1));
                JOptionPane.showMessageDialog(null, "El alumno "+alumno.getNombre()+" "
                        +alumno.getApellido()+" ha sido guardado exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "El alumno no pudo ser guardado");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
        }
    }
    
    public void modificarAlumno(Alumno alumno){
        String sql = "UPDATE alumno SET dni = ? , apellido = ?, nombre = ?, fechaNacimiento = ?, estado = ? WHERE idAlumno = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.setInt(6, alumno.getIdAlumno());
            int am=ps.executeUpdate();
            if (am==1){
                JOptionPane.showMessageDialog(null, "El alumno " +alumno.getNombre()+" "
                        +alumno.getApellido()+" fue modificado exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "El alumno " +alumno.getNombre()+" "
                        +alumno.getApellido()+" no fue modificado");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
    }
    
    public void eliminarAlumno(int id){
        try{
            AlumnoData ad = new AlumnoData();
            Alumno alub = ad.buscarAlumno(id);
            String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int ae= ps.executeUpdate();
            if(ae==1){
                JOptionPane.showMessageDialog(null, "El alumno "+alub.getNombre()+" "+alub.getApellido()+" ha sido eliminado");
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }
    }
    

    public Alumno buscarAlumno(int id){
        Alumno alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet ab = ps.executeQuery();
            if(ab.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(ab.getInt("dni"));
                alumno.setApellido(ab.getString("apellido"));
                alumno.setNombre(ab.getString("nombre"));
                alumno.setFechaNacimiento(ab.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni){
        Alumno alumno = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni=? AND estado = 1";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet abd = ps.executeQuery();
            if (abd.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(abd.getInt("idAlumno"));
                alumno.setDni(abd.getInt("dni"));
                alumno.setApellido(abd.getString("apellido"));
                alumno.setNombre(abd.getString("nombre"));
                alumno.setFechaNacimiento(abd.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return alumno;
    }

    public List<Alumno> listarAlumnos(){
        List<Alumno> alumnos = new ArrayList<>();
        try{
            String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet al = ps.executeQuery();
            while(al.next()){
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(al.getInt("idAlumno"));
                alumno.setDni(al.getInt("dni"));
                alumno.setApellido(al.getString("apellido"));
                alumno.setNombre(al.getString("nombre"));
                alumno.setFechaNacimiento(al.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
                alumnos.add(alumno);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return alumnos;
    }

}
