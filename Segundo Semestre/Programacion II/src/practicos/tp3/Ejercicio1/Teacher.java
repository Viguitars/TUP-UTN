package practicos.tp3.Ejercicio1;

import java.util.ArrayList;

public class Teacher extends Person {
    private String departament;
    private ArrayList<Subject> subjects;

    public Teacher(String departament, ArrayList<Subject> subjects) {
        this.departament = departament;
        this.subjects = subjects;
    }

    public Teacher(int dni, String name, String departament,
                   ArrayList<Subject> subjects) {
        super(dni, name);
        this.departament = departament;
        this.subjects = subjects;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }
}
