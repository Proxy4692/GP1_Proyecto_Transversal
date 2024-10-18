package universidad.Entidades;

public class Materia_old {
    
    private int idMateria;
    private String nombre;
    private int anioMateria;
    boolean activo;

    public Materia_old() {
    }

    public Materia_old(int idMateria, String nombre, int anioMateria, boolean activo) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }

    public Materia_old(String nombre, int anioMateria, boolean activo) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    

    
    @Override
    public String toString() {
        return  nombre + " (Año: " + anioMateria+ ")";
    }

    public void add(Materia_old materia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}