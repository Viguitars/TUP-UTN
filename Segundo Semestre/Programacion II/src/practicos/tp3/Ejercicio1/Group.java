package practicos.tp3.Ejercicio1;

import java.util.ArrayList;

public class Group {
    private String course;
    private char letter;
    private ArrayList<Subject> subjects;
    private ArrayList<Student> students;

    public Group() {
    }

    public Group(String course, char letter, ArrayList<Subject> subjects,
                 ArrayList<Student> students) {
        this.course = course;
        this.letter = letter;
        this.subjects = subjects;
        this.students = students;
    }

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

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
