package Relaciones;

public class Main {
    public static void main(String[] args) {
        // Creación de una nueva persona con su domicilio
        Persona p1 = new Persona("Víctor", 38, "Patricias Mendocinas", 464);
        // Creación de un nuevo curso
        Curso c1 = new Curso("Estadística");
        // Asociación de la persona con el curso
        p1.agregarCurso(c1);
        // Mostrar los datos de la persona
        p1.mostrarDatos();
    }
}
