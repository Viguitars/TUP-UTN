package practicos.tp3_excepciones.Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un profesor
        Teacher teacher = new Teacher(12345678, "Claudio Guzman",
                "Departamento de Química");

        // Crear asignaturas
        Course course1 = new Course(101, "8:00", "Matemática");
        Course course2 = new Course(102, "10:00", "Física");
        Course course3 = new Course(103, "12:00", "Química");

        // Asignar profesor a las asignaturas
        course1.assignTeacher(teacher);
        course2.assignTeacher(teacher);
        course3.assignTeacher(teacher);

        // Agregar asignaturas al profesor
        teacher.addCourse(course1);
        teacher.addCourse(course2);
        teacher.addCourse(course3);

        // Crear grupos
        Group group1 = new Group("Matemática", 'A');
        Group group2 = new Group("Física", 'B');

        // Crear alumnos
        Student student1 = new Student(31456789, "Víctor");
        Student student2 = new Student(31654987, "Alejandra");
        Student student3 = new Student(32852369, "David");
        Student student4 = new Student(33147852, "Emma");

        // Agregar alumnos a los grupos
        group1.addStudents(student1);
        group1.addStudents(student2);
        group2.addStudents(student3);
        group2.addStudents(student4);

        // Asignar grupos a las asignaturas
        course1.assignGroup(group1);
        course2.assignGroup(group2);

        // Asignar el grupo al estudiante Víctor
        student1.addGroup(group1);
        student2.addGroup(group1);
        student3.addGroup(group2);
        student4.addGroup(group2);

        // Crear una lista de asignaturas
        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        // Agregar la lista de asignaturas al grupo
        group1.addReceives(courses);

        // a. Mostrar el aula de la tercera asignatura
        System.out.println(
                "a. Aula de la tercera asignatura: " + course3.getClassroom());

        // b. Mostrar los nombres de las asignaturas que imparte el profesor
        System.out.println(
                "\nb. Asignaturas que imparte el profesor " + teacher.getName() +
                        ":");
        for (Course course : teacher.getCourses()) {
            System.out.println(" - " + course.getName());
        }

        // c. Mostrar nombre y dni de los alumnos del grupo que recibe la
        // asignatura
        System.out.println("\nc. Alumnos del grupo que reciben la asignatura " +
                course1.getName() + ":");
        for (Student student : group1.getStudents()) {
            System.out.println(" - Nombre: " + student.getName() + ", DNI: " +
                    student.getDni());
        }

        // e. Mostrar todas las asignaturas recibidas por el primer grupo al
        // que pertenece un alumno
        System.out.println("\ne. Asignaturas recibidas por el grupo al que " +
                "pertenece " + student1.getName() + ":");
        if (!student1.getGroups().isEmpty()) {
            for (Course receivedCourse : student1.getGroups().get(0)
                    .getReceives()) {
                System.out.println(" - " + receivedCourse.getName());
            }
        } else {
            System.out.println("El alumno no pertenece a ningún grupo.");
        }

        // f. Mostrar el profesor que imparte una asignatura ingresada por el
        // usuario desde un alumno
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "\nf. Ingrese el nombre de una asignatura para conocer que " +
                        "profesor la imparte: ");
        String courseName = scanner.nextLine();
        for (Course course : student1.getGroups().get(0).getReceives()) {
            if (course.getName().equals(courseName)) {
                System.out.println(
                        " - El profesor que imparte " + courseName + " es: " +
                                course.getTeacher().getName());
                break;
            }
        }

        // g. Mostrar los nombres de todos los alumnos inscriptos en el Grupo
        // de la segunda asignatura
        System.out.println(
                "\ng. Nombres de todos los alumnos inscriptos en el grupo de " +
                        "la segunda asignatura:");
        for (Student student : group2.getStudents()) {
            System.out.println(" - " + student.getName());
        }
    }
}

/**
 * Respuesta h:
 * La diferencia principal entre una asociación, una composición y una
 * agregación radica en la naturaleza de la relación entre las clases
 * involucradas y la vida útil de los objetos relacionados.
 * <p>
 * - Asociación: Es una relación entre dos clases que puede ser de
 * cualquier tipo. No hay dependencia entre los objetos y su vida útil es
 * independiente.
 * <p>
 * - Composición: Es una relación más fuerte donde un objeto está
 * compuesto de otros objetos y su vida útil depende de los objetos que
 * lo componen. Si el objeto principal se destruye, los objetos
 * compuestos también se destruyen.
 * <p>
 * - Agregación: Es similar a la composición, pero más débil, donde un
 * objeto "tiene" otros objetos, pero su vida útil no depende de ellos.
 * Si el objeto principal se destruye, los objetos agregados aún pueden
 * existir independientemente.
 */
