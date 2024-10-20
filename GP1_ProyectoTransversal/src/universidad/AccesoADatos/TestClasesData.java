package universidad.AccesoADatos;

import java.sql.Connection;
import java.time.LocalDate;
import universidad.Entidades.Alumno;
import universidad.Entidades.Inscripcion;
import universidad.Entidades.Materia;


public class TestClasesData {


    public static void main(String[] args) {
        
        System.out.println("El siguiente test prueba todos los atributos de las clases data.");
        System.out.println("Para evitar conflictos al agregar registros duplicados, es importante que");
        System.out.println("previamente la base de datos universidadulp este sin ningun dato.");
        //Testeo de metodos de clase Conexion
        Connection con=Conexion.getConexion();
        //Testeo de metodos de clase AlumnoData
        AlumnoData alu=new AlumnoData();
        System.out.println(".........................ALUMNODATA..........................");
        System.out.println();
        //GUARDAR ALUMNO
        Alumno alu1= new Alumno(32478489,"Luna","Ignacio",LocalDate.of(1981, 4, 25),true);
        Alumno alu2= new Alumno(35478489,"Perez","Pedro",LocalDate.of(1978, 6, 1),true);
        Alumno alu3= new Alumno(29478489,"Cura","Juan",LocalDate.of(1984, 2, 17),true);
        Alumno alu4= new Alumno(38478489,"Maranguelo","Osvaldo",LocalDate.of(1982, 9, 6),true);
        Alumno alu5= new Alumno(40478489,"Aldao","Marta",LocalDate.of(1986, 12, 14),true);     
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
        Alumno aluB=alu.buscarAlumno(alu5.getIdAlumno());
        System.out.println("BUSCAR ALUMNO id "+alu5.getIdAlumno());
        System.out.println(aluB.toString());
        System.out.println(".........................BUSCAR ALUMNO - OK");
        //BUSCAR ALUMNO POR DNI        
        Alumno aluBdni=alu.buscarAlumnoPorDni(29478489);
        System.out.println("BUSCAR ALUMNO POR DNI 29478489");
        System.out.println(aluBdni.toString());
        System.out.println(".........................BUSCAR ALUMNO POR DNI ALUMNO - OK");
        //LISTAR ALUMNOS
        System.out.println("MOSTRAR LISTA DE ALUMNOS ACTIVOS");
        for(Alumno alumno:alu.listarAlumnos()){
            System.out.println(alumno.toString());           
        }
        System.out.println(".........................LISTAR ALUMNO - OK");
        //ELIMINAR ALUMNO
        int id1 = alu1.getIdAlumno();
        for (int i = id1; i <= (id1 + 4); i++) {
            alu.eliminarAlumno(i);   
        }
        System.out.println("MOSTRAR LISTA DE ALUMNOS ACTIVOS");
        for(Alumno alumno:alu.listarAlumnos()){
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
        //Testeo de metodos de clase MateriaData
        MateriaData mat=new MateriaData();
        System.out.println(".........................MATERIADATA..........................");
        System.out.println();
        //INSERTAR MATERIA
        Materia mat1= new Materia("Laboratorio",2,true);
        Materia mat2= new Materia("Matematica",3,true);
        Materia mat3= new Materia("Ingles",1,true);
        Materia mat4= new Materia("Programacion",3,true);
        Materia mat5= new Materia("Base de datos",2,true);
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
        Materia matB=mat.buscarMateria(mat3.getIdMateria());
        System.out.println("BUSCAR MATERIA id "+mat3.getIdMateria());
        System.out.println(matB.toString());
        System.out.println(".........................BUSCAR MATERIA - OK");
        //LISTAR MATERIA
        System.out.println("MOSTRAR LISTA DE MATERIAS");
        for(Materia materia:mat.listarMaterias()){
            System.out.println(materia.toString());           
        }
        System.out.println(".........................LISTAR MATERIA - OK");
        //ELIMINAR MATERIA
        int md1 = mat1.getIdMateria();
        for (int i = md1; i <= (md1 + 4); i++) {
            mat.eliminarMateria(i);   
        }
        System.out.println("MOSTRAR LISTA DE MATERIAS");
        for(Materia materia:mat.listarMaterias()){
            System.out.println(materia.toString());          
        }
        System.out.println(".........................ELIMINAR MATERIA - OK");

        //RECUPERAR MATERIAS ELIMINADAS        
        mat1.setEstado(true);
        mat2.setEstado(true);
        mat3.setEstado(true);
        mat4.setEstado(true);
        mat5.setEstado(true);
        mat.modificarMateria(mat1);
        mat.modificarMateria(mat2);
        mat.modificarMateria(mat3);
        mat.modificarMateria(mat4);
        mat.modificarMateria(mat5);
        System.out.println(".........................RECUPERAR MATERIAS ELIMINADAS - OK");        
        System.out.println();
        System.out.println();        

        //Testeo de metodos de clase AlumnoData
        InscripcionData id=new InscripcionData();
        System.out.println(".........................INSCRIPCIONDATA..........................");
        System.out.println();
        //GUARDAR INSCRIPCION
        Inscripcion insc1=new Inscripcion(alu1,mat1,7.5);
        Inscripcion insc2=new Inscripcion(alu1,mat3,9);
        Inscripcion insc3=new Inscripcion(alu1,mat5,8.3);
        Inscripcion insc4=new Inscripcion(alu2,mat2,6.3);
        Inscripcion insc5=new Inscripcion(alu2,mat4,7);
        Inscripcion insc6=new Inscripcion(alu2,mat5,8.9);
        Inscripcion insc7=new Inscripcion(alu3,mat1,9.6);
        Inscripcion insc8=new Inscripcion(alu3,mat3,7);
        Inscripcion insc9=new Inscripcion(alu3,mat4,10);
        Inscripcion insc10=new Inscripcion(alu4,mat2,5.8);
        Inscripcion insc11=new Inscripcion(alu4,mat3,4.5);
        Inscripcion insc12=new Inscripcion(alu4,mat4,9);
        Inscripcion insc13=new Inscripcion(alu5,mat2,8.1);
        Inscripcion insc14=new Inscripcion(alu5,mat3,6.5);
        Inscripcion insc15=new Inscripcion(alu5,mat4,4);
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
        for(Inscripcion inscripcion:id.obtenerInscripciones()){
            System.out.println(inscripcion.toString());           
        }
        System.out.println(".........................LISTAR INSCRIPCIONES - OK");
        //LISTAR INSCRIPCIONES POR ALUMNO
        System.out.println("MOSTRAR INSCRIPCIONES DE ALUMNO "+alu2.getNombre()+" "+alu2.getApellido());
        for(Inscripcion inscripcion:id.obtenerInscripcionesPorAlumno(alu2.getIdAlumno())){
            System.out.println(inscripcion.toString());           
        }
        System.out.println(".........................LISTAR INSCRIPCIONES POR ALUMNO- OK");
        //LISTAR MATERIAS INSCRIPTAS POR ALUMNO
        System.out.println("MOSTRAR MATERIAS INSCRIPTAS DE ALUMNO "+alu1.getNombre()+" "+alu1.getApellido());
        for(Materia materia:id.obtenerMateriasCursadasPorAlumno(alu1.getIdAlumno())){
            System.out.println(materia.toString());           
        }
        System.out.println(".........................LISTAR MATERIAS INSCRIPTAS POR ALUMNO- OK");
        //LISTAR MATERIAS NO INSCRIPTAS POR ALUMNO
        System.out.println("MOSTRAR MATERIAS NO INSCRIPTAS DE ALUMNO "+alu1.getNombre()+" "+alu1.getApellido());
        for(Materia materia:id.obtenerMateriasNoCursadasPorAlumno(alu1.getIdAlumno())){
            System.out.println(materia.toString());           
        }
        System.out.println(".........................LISTAR MATERIAS NO INSCRIPTAS POR ALUMNO- OK");
        //LISTAR ALUMNOS POR MATERIA
        System.out.println("MOSTRAR ALUMNOS DE MATERIA "+mat1.getNombre());
        for(Alumno alumno:id.obtenerAlumnosPorMateria(mat1.getIdMateria())){
            System.out.println(alumno.toString());           
        }
        System.out.println(".........................LISTAR ALUMNOS POR MATERIA- OK");
    }
}
