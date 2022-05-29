package com.alopez.pooherencia.ejemplo;


import com.alopez.pooherencia.clases.Alumno;
import com.alopez.pooherencia.clases.AlumnoInternacional;
import com.alopez.pooherencia.clases.Persona;
import com.alopez.pooherencia.clases.Profesor;


public class EjemploHerenciaToString {

    public static void main(String[] args) {


        System.out.println("=====Creando instancia Objeto Alumno=====");
        Alumno alumno = new Alumno("Alejandro", "Lopez", 33, "UNAM"); //Creamos un nuevo
        // Alumno, asignando parametros, los cuales pueden pasarse por la existencia de un constructor
        alumno.setNotaEspaniol(9.2); //Los atributos fuera del constructor se definen con set
        alumno.setNotaHistoria(7.1);
        alumno.setNotaMatematicas(8.5);
        alumno.setEmail("alex@alexmail.com");


        System.out.println("=====Creando instancia Objeto AlumnoInternacional=====");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Reed", "Richards", "USA");
        //Creamos un nuevo AlumnoInternacional, asignando parametros, los cuales pueden pasarse por la existencia de un constructor
        alumnoInternacional.setEdad(35); //Los atributos fuera del constructor se definen con set
        alumnoInternacional.setInstitucion("Harvard");
        alumnoInternacional.setNotaIdioma(9.9);
        alumnoInternacional.setNotaEspaniol(9.5);
        alumnoInternacional.setNotaHistoria(9.1);
        alumnoInternacional.setNotaMatematicas(10.0);
        alumnoInternacional.setEmail("reed@reedmail.com");


        System.out.println("=====Creando instancia Objeto Profesor=====");
        Profesor profesor = new Profesor("Daniel", "Delgado", "Matematicas");
        //Creamos un nuevo Profesor, asignando parametros, los cuales pueden pasarse por la existencia de un constructor
        profesor.setEdad(55); //Los atributos fuera del constructor se definen con set
        profesor.setEmail("daniel@danielmail.com");


        System.out.println("===   ===   ===");
        System.out.println("   ===   ===   ");
        System.out.println("      ===      ");
        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor de " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());

        System.out.println("AlumnoInternacional: " + alumnoInternacional.getNombre() +
                " " + alumnoInternacional.getApellido() +
                " del pais " + alumnoInternacional.getPais() +
                " tiene " + alumnoInternacional.getEdad() + " años" +
                " y estudió en " + alumnoInternacional.getInstitucion());

        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){ //Imprimimos los datos del objeto persona
        System.out.println("===   ===   ===");
        System.out.println("   ===   ===   ");
        System.out.println("      ===      ");
        System.out.println(persona); //De esta forma invoca al metodo toString

    }

}