public class Persona {
    // Atributos
    String nombre;
    int edad;
    String dni;

    // Método constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobrecarga de constructor
    public Persona(String dni) {
        this.dni = dni;
    }

    // Método
    public void correr() {
        System.out.println("Soy " + nombre + ", tengo " + edad + " años y estoy corriendo un Maratón");

    }

    // Sobrecarga de Método
    public void correr(int km) {
        System.out.println("He corrido " + km + " kilómetros.");

    }

}
