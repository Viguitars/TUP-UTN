package parciales.primero;

public class Person {
    // Atributos
    private int dni;
    private String name;

    // Constructor Vacío
    public Person() {
    }

    // Constructor Sobrecargado
    public Person(int dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    // Getters y Setters
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
