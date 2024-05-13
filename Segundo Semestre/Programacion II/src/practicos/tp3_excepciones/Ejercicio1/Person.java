package practicos.tp3.Ejercicio1;

public abstract class Person {
    // Atributos
    protected int dni;
    protected String name;

    // Constructor Vacío
    public Person() {
    }

    // Constructor Sobrecargado
    public Person(int dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    // Getters y Setters de los atributos
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
