package universidad.Entidades;

public class Inscripcion_old{
    public int idInscripcion;
    public Alumno_old alumno;
    public Materia_old materia;
    public double nota;

    public Inscripcion_old(int idInscripcion, Alumno_old alumno, Materia_old materia, double nota) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion_old(Alumno_old alumno, Materia_old materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion_old() {
    }

    public Inscripcion_old(double nota) {
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno_old getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno_old alumno) {
        this.alumno = alumno;
    }

    public Materia_old getMateria() {
        return materia;
    }

    public void setMateria(Materia_old materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
}
