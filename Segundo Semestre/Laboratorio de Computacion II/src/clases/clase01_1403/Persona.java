package clases.clase01_1403;

public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private float peso;
    private float altura;

    // Constructor Vacio
    public Persona() {
    }

    // Constructor Sobrecargado
    public Persona(String nombre, int edad, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Método
    public void comer() {
        System.out.println("Estoy comiendo.");
    }
}
