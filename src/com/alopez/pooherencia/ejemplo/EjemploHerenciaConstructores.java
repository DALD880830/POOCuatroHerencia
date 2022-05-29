package com.alopez.pooherencia.ejemplo;


import com.alopez.pooherencia.clases.*;


public class EjemploHerenciaConstructores {

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


        System.out.println("==========");
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
        System.out.println("Datos en comun del tipo Persona");
        System.out.println("Persona: " + persona.getNombre() +
                " " + persona.getApellido() +
                " con la edad de " + persona.getEdad() +
                " tiene el email " + persona.getEmail());
        if (persona instanceof Alumno){ //Preguntamos si persona es una instancia de alumno
            System.out.println("Datos del alumno");
            System.out.println("Estudia en: " + ((Alumno)persona).getInstitucion()); //Imprimimos los atributos de Alumno
            System.out.println("Calificacion de Matematicas: " + ((Alumno)persona).getNotaMatematicas()); //Para ello debemos
            System.out.println("Calificacion de Español: " + ((Alumno)persona).getNotaEspaniol()); //Realizar el CAST
            System.out.println("Calificacion de Historia " + ((Alumno)persona).getNotaHistoria()); //((Alumno)persona)

            if (persona instanceof AlumnoInternacional){ //Preguntamos si persona es una instancia de AlumnoInternacional
                System.out.println("Datos propios del alumno extranjero");
                System.out.println("Calificacion de Idioma: " + ((AlumnoInternacional)persona).getNotaIdioma()); //Imprimimos los atributos de AlumnoInternacional
                System.out.println("Su pais de origen es: " + ((AlumnoInternacional)persona).getPais()); //Debemos realizar el CAST ((AlumnoInternacional)persona)

            }

            System.out.println("===");
            //A pesar de que el CAST es en Alumno, tanto Alumno como Alumno Internacional muestran su propio metodo
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio()); //Realizamos el CAST para usar el metodo calcularPromedio()
            System.out.println("===");



        }
        if (persona instanceof Profesor){ //Preguntamos si persona es una instancia de Profesor
            System.out.println("Dato propio del Profesor");
            System.out.println("Maestro de: " + ((Profesor) persona).getAsignatura()); //Hacemos el cast ((Profesor) persona) para imprimir el atributo propio de Profesor

        }

        System.out.println("===");
        System.out.println(persona.saludar());
        System.out.println("===");

    }


}