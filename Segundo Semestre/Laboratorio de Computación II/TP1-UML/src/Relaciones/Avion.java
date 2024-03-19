package Relaciones;

public class Avion {
    // Atributos
    private String matricula;
    private int capacidad;
    private String modelo;

    // Constructor vació
    public Avion() {

    }

    // Constructor sobrecargado
    public Avion(String matricula, int capacidad, String modelo) {
        this.matricula = matricula;
        this.capacidad = capacidad;
        this.modelo = modelo;
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Métodos
    public void despegar() {
        System.out.println("El avión de modelo " + modelo + " a despegado.");

    }

    public void aterrizar() {
        System.out.println("El avión de modelo " + modelo + " a aterrizado.");

    }


}
