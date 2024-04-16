package clases.clase05_0904.AsociacionUnidireccional;

public class Main {
    public static void main(String[] args) {
        // Crear universidades
        University university1 = new University("Universidad 1");
        University university2 = new University("Universidad 2");

        // Crear estudiantes
        Student student1 = new Student("Estudiante 1");
        Student student2 = new Student("Estudiante 2");

        // Asociar estudiantes con universidades
        student1.setUniversity(university1);
        student2.setUniversity(university2);

        // Cambiar la universidad a la que asiste un estudiante
        student1.changeUniversity(university2);

        // Mostrar la universidad a la que pertenece cada estudiante
        System.out.println(student1);
        System.out.println(student2);
    }
}
