package Relaciones;

public class Curso {
    // Atributo
    private String nombre; // Nombre del curso

    // Constructor Vacío
    public Curso() {
    }

    // Constructor Sobrecargado
    public Curso(String nombre) {
        this.nombre = nombre;
    }

    // Getter del nombre del curso
    public String getNombre() {
        return nombre;
    }

    // Setter del nombre del curso
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
