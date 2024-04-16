package clases.clase05_0904.AsociacionUnidireccional;

public class Student {
    private String name;
    private University university;

    public Student(String name) {
        this.name = name;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public University getUniversity() {
        return university;
    }

    public void changeUniversity(University newUniversity) {
        this.university = newUniversity;
    }

    public String toString() {
        return name + " estudia en " + university.getName();
    }
}
