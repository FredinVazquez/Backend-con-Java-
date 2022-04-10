//package Semana1.Tareas.Tarea1;

public class TibutonMartillo {
    // Atributos
    private double peso, longitud, anchura, fuerza, velocidadNadar;
    private String nombre, color;
    private int edad;

    //Constructor - Además del constructor por omisión o vacío
    TibutonMartillo(){}

    TibutonMartillo(double peso, double longitud, double anchura, double fuerza, double velocidadNadar
    , String nombre, String color, int edad){
        this.peso = peso;
        this.longitud=longitud;
        this.anchura = anchura;
        this.fuerza = fuerza;
        this.velocidadNadar = velocidadNadar;
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    // Métodos - Comportamiento del tiburon martillo
    // Getters
    public double getPeso(){return peso;}
    public double getLongitud(){return longitud;}
    public double getAnchura(){return anchura;}
    public double getFuerza(){return fuerza;}
    public double getVelocidadNadar(){return velocidadNadar;}
    public String getNombre(){return nombre;}
    public String getColor(){return color;}
    public int getEdad(){return edad;}

    // En este caso no uso setters debido a todo lo voy a inicializar por medio del cosntructor y nose ha
    // visto scanf

    // Acciones
    public void observar(){
        System.out.println("El tiburon " + getNombre() + "acaba de observar una presa.");
    }

    public void cazar(){
        System.out.println("El tiburon " + getNombre() + " comenzó la caza de la presa");
    }

    public void comer(){
        System.out.println("El tiburon " + getNombre() + " está comiendo a su presa con una fuerza de " + getFuerza()
                +" [N].");
    }

    public void nadar(){
        System.out.println("El tiburon " + getNombre() + " empezó a nadar a una velocidad de " + getVelocidadNadar());
    }

    public void camuflaje(){
        System.out.println("Está escondido de una zona de color " + getColor());
    }

    public void datos(){
        System.out.println("El tiburon martillo es carnívoro y ovovivíparo, este tiburon tiene por nombre" +
                getNombre() + " cuyo color es " + getColor() + ".\n"
                + "Mide " + getLongitud() + " [m] y con una anchura de "+getAnchura() +"[m].\n"
                + "Cuenta con una velocidad para nadar de "+getVelocidadNadar()+"[m/s], con un peso de " +
                getPeso() + "[kg].");
    }
}
