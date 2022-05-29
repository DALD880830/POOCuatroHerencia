package com.alopez.pooherencia.clases;


//Si esta clase la nombraramos como final, la clase no podría tener clase hija, no habrá herencia
//public final class Alumno extends Persona{
public class Alumno extends Persona{ //Con extends definimos que Alumno extiende de la clase Persona, "Alumno es hijo de Persona"

    private String institucion;
    private double notaMatematicas;
    private double notaEspaniol;
    private double notaHistoria;


    //Generamos un constructor
    public Alumno(){
        super(); //Invocamos el constructor del padre, esta instruccion debe ir como primera linea, así está de forma
        //explicita, sin embargo, si se omite, por defecto llama al constructor del padre, sin embargo, dicho constructor debe estar vacio
        System.out.println("Alumno: Inicializando Constructor");
    }

    public Alumno(String nombre, String apellido){ //Constructor con parametros
        super(nombre, apellido); //Invocamos de manera explicita al constructor del padre, y se almacenan en el constructor del padre
    }

    public Alumno(String nombre, String apellido, int edad){ //Constructor con parametros
        super(nombre, apellido, edad); //Invocamos de manera explicita al constructor del padre, y se almacenan en el constructor del padre
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){ //Constructor con parametros
        super(nombre, apellido, edad); //Invocamos de manera explicita al constructor del padre, y se almacenan en el constructor del padre
        this.institucion = institucion; //Podemos inicializar institucion, que es un atributo propio de la clase Alumno
    }

    public Alumno(String nombre, String apellido, int edad, String institucion, double notaMatematicas,
                  double notaEspaniol, double notaHistoria){ //Constructor con parametros
        this(nombre, apellido, edad, institucion); //Invocamos de manera explicita al constructor de arriba con this
        this.notaMatematicas = notaMatematicas; //Inicializamos los atributos de notas
        this.notaEspaniol = notaEspaniol;
        this.notaHistoria = notaHistoria;
    }




    //Getter and Setter de los atributos institucion, notaMatematicas, notaIdioma, notaHistoria
    public String getInstitucion() {
        return institucion;
    }
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }
    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaEspaniol() {
        return notaEspaniol;
    }
    public void setNotaEspaniol(double notaEspaniol) {
        this.notaEspaniol = notaEspaniol;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }
    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }


    @Override //Sobreescribimos el metodo del padre
    public String saludar(){
        String saludar = super.saludar(); //Invoca el metodo del padre, luego lo concatenamos con la sobreescritura de este metodo
        return saludar + " ya que terminen las clases, yo soy: " + getNombre(); //Modificamos el metodo padre y obtenemos el nombre de alumno
    }


    public double calcularPromedio(){ //Creamos un metodo para calcular el promedio de las notas
//        System.out.println("Calcular promedio" + this.getClass().getCanonicalName()); //Imprimimos esta clase y el nombre simple de la clase
        System.out.println("Calcular promedio" + Alumno.class.getCanonicalName()); //Cambiamos por el atributo estático class
        return (notaHistoria + notaEspaniol + notaMatematicas)/3;
    }

    //Imrpimimos el objeto mediante toString
    @Override
    public String toString() {
        return super.toString() + //Reutilizamos el metodo toString del padre
                "\ninstitucion='" + institucion + '\'' +
                ", notaMatematicas=" + notaMatematicas +
                ", notaEspaniol=" + notaEspaniol +
                ", notaHistoria=" + notaHistoria +
                ", Promedio" + this.calcularPromedio();
    }
}