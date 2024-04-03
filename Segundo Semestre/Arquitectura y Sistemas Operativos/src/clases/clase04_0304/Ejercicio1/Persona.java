package clases.clase04_0304.Ejercicio1;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws EdadInvalidaException {
        this.nombre = nombre;

        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años");
        }
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
