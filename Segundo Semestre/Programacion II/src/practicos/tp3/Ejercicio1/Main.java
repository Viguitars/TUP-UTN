package practicos.tp3.Ejercicio1;

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

        // a). Mostrar el aula de la tercera asignatura
        System.out.println(
                "Aula de la tercera asignatura: " + course3.getClassroom());

        // b). Mostrar los nombres de las asignaturas que imparte el profesor
        System.out.println(
                "\nAsignaturas que imparte el profesor " + teacher.getName() +
                        ":");
        for (Course course : teacher.getCourses()) {
            System.out.println(" - " + course.getName());
        }

        // Crear el primer grupo y agregar alumnos
        Group firstgroup = new Group("Matemática", 'A');
        Student student1 = new Student(31456789, "Víctor");
        Student student2 = new Student(31654987, "Alejandra");
        firstgroup.addStudents(student1);
        firstgroup.addStudents(student2);

        // Asignar grupo a la asignatura
        course1.assignGroup(firstgroup);
        course2.assignGroup(firstgroup);
        course3.assignGroup(firstgroup);

        // c). Mostrar nombre y dni de los alumnos del grupo que recibe la
        // asignatura
        System.out.println(
                "\nAlumnos del primer grupo que reciben la asignatura " +
                        course2.getName() + ":");
        for (Student student : firstgroup.getStudents()) {
            System.out.println(" - Nombre: " + student.getName() + ", DNI: " +
                    student.getDni());
        }

        // e). Mostrar todas las asignaturas recibidas por el primer grupo al
        // que pertenece un alumno
        System.out.println(
                "\nAsignaturas recibidas por el primer grupo al que pertenece " +
                        "el alumno " + student1.getName() + ":");
        // Student firstStudent = new Student(35123654, "Gastón");
        student1.addGroup(firstgroup);
        student2.addGroup(firstgroup);
        for (Course receivedCourse : student1.getGroups().get(0).getReceives()) {
            System.out.println(receivedCourse.getName());
        }

        // f). Mostrar el profesor que imparte una asignatura ingresada por el
        // usuario desde un alumno
        // Suponiendo que el usuario ingresó "Matemática"
        String courseName = "Matemática";
        for (Course course : student1.getGroups().get(0).getReceives()) {
            if (course.getName().equals(courseName)) {
                System.out.println(
                        "El profesor que imparte " + courseName + " es: " +
                                course.getTeacher().getName());
                break;
            }
        }

        // g). Mostrar los nombres de todos los alumnos inscriptos en el Grupo
        // de la segunda Asignatura
        Group secondGroup = new Group("Física", 'B');
        Student student3 = new Student(32852369, "David");
        Student student4 = new Student(33147852, "Emma");
        secondGroup.addStudents(student3);
        secondGroup.addStudents(student4);

        // Asignar grupo a la asignatura
        course2.assignGroup(secondGroup);

        System.out.println(
                "\nNombres de todos los alumnos inscriptos en el Grupo de la " +
                        "segunda Asignatura:");
        for (Student student : secondGroup.getStudents()) {
            System.out.println(" - " + student.getName());
        }

        /*
        Respuesta h:
        La diferencia principal entre una asociación, una composición y una
        agregación radica en la naturaleza de la relación entre las clases
        involucradas y la vida útil de los objetos relacionados.

        - Asociación: Es una relación entre dos clases que puede ser de
        cualquier tipo. No hay dependencia entre los objetos y su vida útil es
         independiente.

        - Composición: Es una relación más fuerte donde un objeto está
        compuesto de otros objetos y su vida útil depende de los objetos que
        lo componen. Si el objeto principal se destruye, los objetos
        compuestos también se destruyen.

        - Agregación: Es similar a la composición, pero más débil, donde un
        objeto "tiene" otros objetos, pero su vida útil no depende de ellos.
        Si el objeto principal se destruye, los objetos agregados aún pueden
        existir independientemente.
        */
    }
}
