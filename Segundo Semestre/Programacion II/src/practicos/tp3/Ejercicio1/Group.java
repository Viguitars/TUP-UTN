package practicos.tp3.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Group {
    // Atributos
    private String course;
    private char letter;
    public List<Student> students;
    public List<Course> receives;

    // Constructores
    public Group() {
        students = new ArrayList<>();
        receives = new ArrayList<>();
    }

    public Group(String course, char letter) {
        this.course = course;
        this.letter = letter;
        this.students = new ArrayList<>();
        this.receives = new ArrayList<>();
    }

    // Getters y Setters de los atributos
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    // Método para obtener la lista de alumnos que pertenecen al grupo
    public List<Student> getStudents() {
        return students;
    }

    // Método para agregar alumnos al grupo
    public void addStudents(Student student) {
        students.add(student);
    }

    // Método para obtener la lista de asignaturas que recibe el grupo
    public List<Course> getReceives() {
        return receives;
    }

    // Método para agregar asignaturas al grupo
    public void addReceives(List<Course> receives) {
        this.receives = receives;
    }
}
