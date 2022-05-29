package com.alopez.pooherencia.clases;


//Si esta clase la nombraramos como final, la clase no podría tener clase hija, no habrá herencia, sin embargo, al no contar con clase hija, no marca error
//public final class AlumnoInternacional extends Alumno{
public class AlumnoInternacional extends Alumno{ //Con extends definimos que AlumnoInternacional extiende de la clase Alumno, "AlumnoInternacional es hijo de Alumno"

    private String pais;
    private double notaIdioma;


    //Generamos un constructor
    public AlumnoInternacional(){
        System.out.println("AlumnoInternacional: Inicializando Constructor");
    }

    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais){
        super(nombre, apellido);
        this.pais = pais;
    }



    //Getter and Setter de los atributos pais, idioma
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdioma() {
        return notaIdioma;
    }
    public void setNotaIdioma(double notaIdioma) {
        this.notaIdioma = notaIdioma;
    }


    @Override
    public String saludar() {
        return "HEY, Hola, yo soy extranjero, mi nombre es: " + getNombre() + //Modificamos el metodo padre y
                " mi pais de origen es: " + getPais(); //obtenemos el nombre de Alumo Internacional y su pais;
    }


    @Override
    public double calcularPromedio() { //Sobreescribimos el metodo del padre que es Alumno
//        System.out.println("Calcular promedio" + this.getClass().getCanonicalName()); //Imprimimos esta clase y el nombre simple de la clase
//        System.out.println("Calcular promedio" + AlumnoInternacional.class.getCanonicalName()); //Cambiamos por el atributo estatico class
        return ((super.calcularPromedio()*3) + notaIdioma)/4; //Multiplicamos por 3 para obtener la suma de las 3 notas, y sumamos la nota de idioma y dividimos entre 4
    }

    //Imrpimimos el objeto mediante toString


    @Override
    public String toString() {
        return super.toString() +
                "\npais='" + pais + '\'' +
                ", notaIdioma=" + notaIdioma +
                '}';
    }
}