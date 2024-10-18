package universidad.AccesoADatos;

import java.sql.Connection;
import java.time.LocalDate;
import universidad.Entidades.Alumno_old;
import universidad.Entidades.Inscripcion_old;
import universidad.Entidades.Materia_old;


public class TestClasesData {


    public static void main(String[] args) {
        
        //Testeo de metodos de clase Conexion_old
        Connection con=Conexion_old.getConexion();
        //Testeo de metodos de clase AlumnoData_old
        AlumnoData_old alu=new AlumnoData_old();
        System.out.println(".........................ALUMNODATA..........................");
        System.out.println();
        //GUARDAR ALUMNO
        Alumno_old alu1= new Alumno_old(32478489,"Luna","Ignacio",LocalDate.of(1981, 4, 25),true);
        Alumno_old alu2= new Alumno_old(35478489,"Perez","Pedro",LocalDate.of(1978, 6, 1),true);
        Alumno_old alu3= new Alumno_old(29478489,"Cura","Juan",LocalDate.of(1984, 2, 17),true);
        Alumno_old alu4= new Alumno_old(38478489,"Maranguelo","Osvaldo",LocalDate.of(1982, 9, 6),true);
        Alumno_old alu5= new Alumno_old(40478489,"Aldao","Marta",LocalDate.of(1986, 12, 14),true);     
        alu.guardarAlumno(alu1);
        alu.guardarAlumno(alu2);
        alu.guardarAlumno(alu3);
        alu.guardarAlumno(alu4);
        alu.guardarAlumno(alu5);
        System.out.println(".........................GUARDAR ALUMNO - OK");
        //MODIFICAR ALUMNO
        alu2.setDni(39000000);
        alu3.setApellido("Coria");
        alu4.setNombre("Orlando");
        alu5.setFechaNacimiento(LocalDate.of(1999, 9, 9));
        alu.modificarAlumno(alu1);
        alu.modificarAlumno(alu2);
        alu.modificarAlumno(alu3);
        alu.modificarAlumno(alu4);
        alu.modificarAlumno(alu5);
        System.out.println(".........................MODIFICAR ALUMNO - OK");
        //BUSCAR ALUMNO
        Alumno_old aluB=alu.buscarAlumno(alu5.getIdAlumno());
        System.out.println("BUSCAR ALUMNO id "+alu5.getIdAlumno());
        System.out.println(aluB.toString());
        System.out.println(".........................BUSCAR ALUMNO - OK");
        //BUSCAR ALUMNO POR DNI        
        Alumno_old aluBdni=alu.buscarAlumnoPorDni(29478489);
        System.out.println("BUSCAR ALUMNO POR DNI 29478489");
        System.out.println(aluBdni.toString());
        System.out.println(".........................BUSCAR ALUMNO POR DNI ALUMNO - OK");
        //LISTAR ALUMNOS
        System.out.println("MOSTRAR LISTA DE ALUMNOS ACTIVOS");
        for(Alumno_old alumno:alu.listarAlumnos()){
            System.out.println(alumno.toString());           
        }
        System.out.println(".........................LISTAR ALUMNO - OK");
        //ELIMINAR ALUMNO
        int id1 = alu1.getIdAlumno();
        for (int i = id1; i <= (id1 + 4); i++) {
            alu.eliminarAlumno(i);   
        }
        System.out.println("MOSTRAR LISTA DE ALUMNOS ACTIVOS");
        for(Alumno_old alumno:alu.listarAlumnos()){
            System.out.println(alumno.toString());           
        }
        System.out.println(".........................ELIMINAR ALUMNO - OK");
        //RECUPERAR ALUMNOS ELIMINADOS        
        alu1.setEstado(true);
        alu2.setEstado(true);
        alu3.setEstado(true);
        alu4.setEstado(true);
        alu5.setEstado(true);
        alu.modificarAlumno(alu1);
        alu.modificarAlumno(alu2);
        alu.modificarAlumno(alu3);
        alu.modificarAlumno(alu4);
        alu.modificarAlumno(alu5);
        System.out.println(".........................RECUPERAR ALUMNOS ELIMINADOS - OK");
        System.out.println();
        System.out.println();
        //Testeo de metodos de clase MateriaData_old
        MateriaData_old mat=new MateriaData_old();
        System.out.println(".........................MATERIADATA..........................");
        System.out.println();
        //INSERTAR MATERIA
        Materia_old mat1= new Materia_old("Laboratorio",2,true);
        Materia_old mat2= new Materia_old("Matematica",3,true);
        Materia_old mat3= new Materia_old("Ingles",1,true);
        Materia_old mat4= new Materia_old("Programacion",3,true);
        Materia_old mat5= new Materia_old("Base de datos",2,true);
        mat.guardarMateria(mat1);
        mat.guardarMateria(mat2);
        mat.guardarMateria(mat3);
        mat.guardarMateria(mat4);
        mat.guardarMateria(mat5);
        System.out.println(".........................INSERTAR MATERIA - OK");
        //MODIFICAR MATERIA
        mat1.setNombre("Laboratorio de Programacion");
        mat2.setNombre("Matematica Aplicada");
        mat3.setAnioMateria(1);
        mat4.setNombre("Programacion Web");
        mat5.setAnioMateria(1);
        mat.modificarMateria(mat1);
        mat.modificarMateria(mat2);
        mat.modificarMateria(mat3);
        mat.modificarMateria(mat4);
        mat.modificarMateria(mat5);
        System.out.println(".........................MODIFICAR MATERIA - OK");
        //BUSCAR MATERIA
        Materia_old matB=mat.buscarMateria(mat3.getIdMateria());
        System.out.println("BUSCAR MATERIA id "+mat3.getIdMateria());
        System.out.println(matB.toString());
        System.out.println(".........................BUSCAR MATERIA - OK");
        //LISTAR MATERIA
        System.out.println("MOSTRAR LISTA DE MATERIAS");
        for(Materia_old materia:mat.listarMaterias()){
            System.out.println(materia.toString());           
        }
        System.out.println(".........................LISTAR MATERIA - OK");
        //ELIMINAR MATERIA
        int md1 = mat1.getIdMateria();
        for (int i = md1; i <= (md1 + 4); i++) {
            mat.eliminarMateria(i);   
        }
        System.out.println("MOSTRAR LISTA DE MATERIAS");
        for(Materia_old materia:mat.listarMaterias()){
            System.out.println(materia.toString());          
        }
        System.out.println(".........................ELIMINAR MATERIA - OK");
        //RECUPERAR MATERIAS ELIMINADAS        
        mat.guardarMateria(mat1);
        mat.guardarMateria(mat2);
        mat.guardarMateria(mat3);
        mat.guardarMateria(mat4);
        mat.guardarMateria(mat5);
        System.out.println(".........................RECUPERAR MATERIAS ELIMINADAS - OK");        
        System.out.println();
        System.out.println();        
        //Testeo de metodos de clase AlumnoData_old
        InscripcionData_old id=new InscripcionData_old();
        System.out.println(".........................INSCRIPCIONDATA..........................");
        System.out.println();
        //GUARDAR INSCRIPCION
        Inscripcion_old insc1=new Inscripcion_old(alu1,mat1,7.5);
        Inscripcion_old insc2=new Inscripcion_old(alu1,mat3,9);
        Inscripcion_old insc3=new Inscripcion_old(alu1,mat5,8.3);
        Inscripcion_old insc4=new Inscripcion_old(alu2,mat2,6.3);
        Inscripcion_old insc5=new Inscripcion_old(alu2,mat4,7);
        Inscripcion_old insc6=new Inscripcion_old(alu2,mat5,8.9);
        Inscripcion_old insc7=new Inscripcion_old(alu3,mat1,9.6);
        Inscripcion_old insc8=new Inscripcion_old(alu3,mat3,7);
        Inscripcion_old insc9=new Inscripcion_old(alu3,mat4,10);
        Inscripcion_old insc10=new Inscripcion_old(alu4,mat2,5.8);
        Inscripcion_old insc11=new Inscripcion_old(alu4,mat3,4.5);
        Inscripcion_old insc12=new Inscripcion_old(alu4,mat4,9);
        Inscripcion_old insc13=new Inscripcion_old(alu5,mat2,8.1);
        Inscripcion_old insc14=new Inscripcion_old(alu5,mat3,6.5);
        Inscripcion_old insc15=new Inscripcion_old(alu5,mat4,4);
        id.guardarInscripcion(insc1);
        id.guardarInscripcion(insc2);
        id.guardarInscripcion(insc3);
        id.guardarInscripcion(insc4);
        id.guardarInscripcion(insc5);
        id.guardarInscripcion(insc6);
        id.guardarInscripcion(insc7);
        id.guardarInscripcion(insc8);
        id.guardarInscripcion(insc9);
        id.guardarInscripcion(insc10);
        id.guardarInscripcion(insc11);
        id.guardarInscripcion(insc12);
        id.guardarInscripcion(insc13);
        id.guardarInscripcion(insc14);
        id.guardarInscripcion(insc15);
        System.out.println(".........................GUARDAR INSCRIPCION - OK");
        //ACTUALIZAR INSCRIPCION
        id.actualizarNota(alu1.getIdAlumno(), mat5.getIdMateria(), 8.5);
        id.actualizarNota(alu2.getIdAlumno(), mat2.getIdMateria(), 6.5);
        id.actualizarNota(alu3.getIdAlumno(), mat1.getIdMateria(), 9.5);
        id.actualizarNota(alu4.getIdAlumno(), mat2.getIdMateria(), 6);
        id.actualizarNota(alu5.getIdAlumno(), mat2.getIdMateria(), 8);
        System.out.println(".........................ACTUALIZAR INSCRIPCION - OK");
        //BORRAR INSCRIPCION
        id.borrarInscripcionAlumnoMateria(alu3.getIdAlumno(), mat4.getIdMateria());
        id.borrarInscripcionAlumnoMateria(alu4.getIdAlumno(), mat4.getIdMateria());
        id.borrarInscripcionAlumnoMateria(alu5.getIdAlumno(), mat4.getIdMateria());
        System.out.println(".........................BORRAR INSCRIPCION - OK");
        //LISTAR INSCRIPCIONES
        System.out.println("MOSTRAR LISTA DE INSCRIPCIONES");
        for(Inscripcion_old inscripcion:id.obtenerInscripciones()){
            System.out.println(inscripcion.toString());           
        }
        System.out.println(".........................LISTAR INSCRIPCIONES - OK");
        //LISTAR INSCRIPCIONES POR ALUMNO
        System.out.println("MOSTRAR INSCRIPCIONES DE ALUMNO "+alu2.getNombre()+" "+alu2.getApellido());
        for(Inscripcion_old inscripcion:id.obtenerInscripcionesPorAlumno(alu2.getIdAlumno())){
            System.out.println(inscripcion.toString());           
        }
        System.out.println(".........................LISTAR INSCRIPCIONES POR ALUMNO- OK");
        //LISTAR MATERIAS INSCRIPTAS POR ALUMNO
        System.out.println("MOSTRAR MATERIAS INSCRIPTAS DE ALUMNO "+alu1.getNombre()+" "+alu1.getApellido());
        for(Materia_old materia:id.obtenerMateriasCursadasPorAlumno(alu1.getIdAlumno())){
            System.out.println(materia.toString());           
        }
        System.out.println(".........................LISTAR MATERIAS INSCRIPTAS POR ALUMNO- OK");
        //LISTAR MATERIAS NO INSCRIPTAS POR ALUMNO
        System.out.println("MOSTRAR MATERIAS NO INSCRIPTAS DE ALUMNO "+alu1.getNombre()+" "+alu1.getApellido());
        for(Materia_old materia:id.obtenerMateriasNoCursadasPorAlumno(alu1.getIdAlumno())){
            System.out.println(materia.toString());           
        }
        System.out.println(".........................LISTAR MATERIAS NO INSCRIPTAS POR ALUMNO- OK");
        //LISTAR ALUMNOS POR MATERIA
        System.out.println("MOSTRAR ALUMNOS DE MATERIA "+mat1.getNombre());
        for(Alumno_old alumno:id.obtenerAlumnosPorMateria(mat1.getIdMateria())){
            System.out.println(alumno.toString());           
        }
        System.out.println(".........................LISTAR ALUMNOS POR MATERIA- OK");
    }
}
