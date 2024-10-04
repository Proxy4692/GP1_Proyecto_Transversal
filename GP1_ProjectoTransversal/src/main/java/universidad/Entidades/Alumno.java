package universidad.Entidades;

import java.time.LocalDate;
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
import java.util.HashSet;
import java.util.Iterator;
=======
>>>>>>> f4f9100764ef7870391c20d041b8b52b8916dcdd
>>>>>>> Stashed changes

public class Alumno{
    private int idAlumno;
    private String apellido;
    private String nombre;
    private LocalDate fechaNac;
    private boolean activo;

    public Alumno() {
    }

    public Alumno(int idAlumno, String apellido, String nombre, LocalDate fechaNac, boolean activo) {
        this.idAlumno = idAlumno;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.activo = activo;
<<<<<<< Updated upstream
    }

=======
    }

<<<<<<< HEAD
    public Alumno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getLegajo() {
        return legajo;
=======
>>>>>>> Stashed changes
    public Alumno(String apellido, String nombre, LocalDate fechaNac, boolean activo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.activo = activo;
<<<<<<< Updated upstream
=======
>>>>>>> f4f9100764ef7870391c20d041b8b52b8916dcdd
>>>>>>> Stashed changes
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    } 

    @Override
    public String toString(){
        return nombre + " " + apellido;
    }
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
    
    public int cantidadMaterias(){
        Iterator it = listaMaterias.iterator();
        int cantMaterias = 0;
        while (it.hasNext()) {            
            cantMaterias += 1;           
        }
        return cantMaterias;
    }

    public void setIdAlumno(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDni(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setFechaNacimiento(LocalDate toLocalDate) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setEstado(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getFechaNacimiento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getDni() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean isEstado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
=======
>>>>>>> f4f9100764ef7870391c20d041b8b52b8916dcdd
>>>>>>> Stashed changes
}