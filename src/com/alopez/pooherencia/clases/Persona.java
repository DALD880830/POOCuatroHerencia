package com.alopez.pooherencia.clases;

public class Persona {

    private String nombre; //Los atributos en la clase padre deben ser private
    private String apellido; //Además, si fueran solo protected, las clases que estan dentro del mismo package podrían acceder a los atributos de manera directa
    private int edad;
    private String email;


    //Generamos un constructor
    public Persona(){ //Constructor vacio, se dice que esta vacio porque no recibe parametros
        System.out.println("Persona: Inicializando Constructor");
    }
    public Persona(String nombre, String apellido){ //Constructor con parametros
        this.nombre = nombre; //Inicializamos nombre
        this.apellido = apellido; //Inicializamos apellido
    }
    public Persona(String nombre, String apellido, int edad){ //Sobrecarga de constructor
        this(nombre, apellido); //Reutilizamos el constructor Persona de arriba
        this.edad = edad; //Inicializamos edad
    }




    //Getter and Setter de los atributos nombre, apellido, edad, email
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }



    public String saludar(){ //Metodo generico para saludar
        return "HEY, Hola :)";
    }


    //Imrpimimos el objeto mediante toString
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", saludo" + this.saludar();
    }
}