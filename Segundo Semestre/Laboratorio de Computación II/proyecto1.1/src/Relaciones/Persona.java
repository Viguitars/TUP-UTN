package Relaciones;

public class Persona {
    // Atributos
    private String nombre; // Nombre de la persona
    private int edad; // Edad de la persona

    // Atributos de Asociación
    private Curso curso; // Curso al que asiste la persona
    private Domicilio domicilio; // Domicilio de la persona

    // Constructor Vacío
    public Persona() {
    }

    // Constructor Sobrecargado
    public Persona(String nombre, int edad, String calle, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = new Domicilio(calle, numero); // Creación del domicilio al instanciar la persona
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Setter del nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter de la edad
    public int getEdad() {
        return edad;
    }

    // Setter de la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter del curso (Asociación)
    // No necesitamos un setter ya que tenemos el método agregarCurso()
    public Curso getCurso() {
        return curso;
    }

    // Getter del domicilio (Asociación)
    public Domicilio getDomicilio() {
        return domicilio;
    }

    // Setter del domicilio (Asociación)
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    // Método de acción: caminar
    public void caminar(int km) {
        System.out.println("Caminé " + km + " kilómetros.");
    }

    // Método para asociar un curso a la persona
    public void agregarCurso(Curso curso) {
        this.curso = curso;
    }

    // Método para mostrar los datos de la persona
    public void mostrarDatos() {
        System.out.println("Soy " + nombre + ", tengo " + edad + " años y vivo en " + domicilio.getCalle() + " " + domicilio.getNumero() + ".");
        if (curso != null) {
            System.out.println("Asisto al curso de " + curso.getNombre() + ".");
        } else {
            System.out.println("No estoy inscrito en ningún curso.");
        }
    }
}
