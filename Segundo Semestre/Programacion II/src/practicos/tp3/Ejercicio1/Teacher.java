package practicos.tp3.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    // Atributos
    private String department;
    private List<Course> teaches;

    // Constructores
    public Teacher() {
        teaches = new ArrayList<>();
    }

    public Teacher(int dni, String name, String department) {
        super(dni, name);
        this.department = department;
        this.teaches = new ArrayList<>();
    }

    // Getters y Setters de los atributos
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Método para obtener la lista de asignaturas que imparte el profesor
    public List<Course> getCourses() {
        return teaches;
    }

    // Método para agregar una asignatura al profesor
    public void addCourse(Course course) {
        teaches.add(course);
    }
}
