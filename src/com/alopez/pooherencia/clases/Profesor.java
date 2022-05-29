package com.alopez.pooherencia.clases;

public class Profesor extends Persona{ //Con extends definimos que Profesor extiende de la clase Persona, "Profesor es hijo de Persona"

    private String asignatura;


    //Generamos un constructor
    public Profesor(){
        System.out.println("Profesor: Inicializando Constructor");
    }

    public Profesor(String nombre, String apellido){ //Constructor con parametros
        super(nombre, apellido); //Invocamos al constructor del padre
    }

    public Profesor(String nombre, String apellido, String asignatura){ //Constructor con parametros, agregando el atributo propio de la clase profesor
        super(nombre, apellido); //Invocamos al constructor del padre
        this.asignatura = asignatura; //Inicializamos el atributo propio de la clase
    }





    //Getter and Setter de asignatura
    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }


    @Override
    public String saludar() {
        return "HEY, Hola, hoy empiezan las clases, mi nombre es: " + getNombre() + //Modificamos el metodo padre y
                " yo les daré la clase de: " + getAsignatura(); //obtenemos el nombre de profesor y la asignatura que imparte
    }

    //Imrpimimos el objeto mediante toString


    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura='" + asignatura + '\'';
    }
}