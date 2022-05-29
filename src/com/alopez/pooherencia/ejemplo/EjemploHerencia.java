package com.alopez.pooherencia.ejemplo;


import com.alopez.pooherencia.clases.*; //Importamos alumno, persona y profesor


public class EjemploHerencia {

    public static void main(String[] args) {


        System.out.println("=====Creando instancia Objeto Alumno=====");
        Alumno alumno = new Alumno(); //Creamos un nuevo Alumno
        alumno.setNombre("Alejandro"); //Accedemos al atributo private nombre de Persona por medio del los getter and setter
        alumno.setApellido("Lopez");
        alumno.setInstitucion("UNAM");
        alumno.setNotaEspaniol(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(8.8);


        System.out.println("=====Creando instancia Objeto AlumnoInternacional=====");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional(); //Creamos un nuevo alumno, solo que este deriva de la clase AlumnoInternacional
        alumnoInternacional.setNombre("Peter");
        alumnoInternacional.setApellido("Parker");
        alumnoInternacional.setPais("USA");
        alumnoInternacional.setEdad(21);
        alumnoInternacional.setInstitucion("Harvard");
        alumnoInternacional.setNotaIdioma(9.9);
        alumnoInternacional.setNotaEspaniol(6.2);
        alumnoInternacional.setNotaHistoria(7.3);
        alumnoInternacional.setNotaMatematicas(8.0);


        System.out.println("=====Creando instancia Objeto Profesor=====");
        Profesor profesor = new Profesor();
        profesor.setNombre("Daniel"); //Accedemos al atributo private nombre de Persona por medio del los getter and setter
        profesor.setApellido("Delgado");
        profesor.setAsignatura("Matematicas");

        System.out.println("==========");
        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor de " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());

        System.out.println("AlumnoInternacional: " + alumnoInternacional.getNombre() +
                " " + alumnoInternacional.getApellido() +
                " del pais " + alumnoInternacional.getPais() +
                " tiene " + alumnoInternacional.getEdad() + " años" +
                " y estudió en " + alumnoInternacional.getInstitucion());


        System.out.println("=====Creando instancia Objeto Alumnito=====");
        //Creando un nuevo alumno usando el tipo Persona
        Persona alumnito = new Alumno(); //Al ser de tipo Persona, a pesar de que se crea new Alumno() no se puede acceder a los atributos de Alumno
        ((Alumno)alumnito).setInstitucion("UNAM"); //Para acceder a los atributos de la clase Alumno, se debe hacer un CAST ((Alumno)alumnito)
        System.out.println(((Alumno)alumnito).getInstitucion()); //Al realizar el print tambien es necesario realizar el CAST


        //Recorremos la jerarquia de clases
        Class clasesita = alumnoInternacional.getClass(); //Class, clase de java con toda la informacion de la clase
        while (clasesita.getSuperclass() != null){ //Recorremos la jerarquia, si la clase tiene un padre se itera, comienza en la clase en la que se encuentra
            String hija = clasesita.getName(); //Obtenemos el nombre de la clase
            String padre = clasesita.getSuperclass().getName(); //Obtenemos el nombre de la clase padre con Superclass
            System.out.println(hija + " es una clase hija de " + padre); //Imprimimos
            clasesita = clasesita.getSuperclass(); //Volvemos a iterar, colocando la clase padre como la nueva clase hija, para saber si tiene clase padre
        }

    }

}