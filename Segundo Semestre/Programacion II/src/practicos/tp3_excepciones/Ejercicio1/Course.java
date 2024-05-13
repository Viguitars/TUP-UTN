package practicos.tp3_excepciones.Ejercicio1;

public class Course {
    // Atributos
    private int classroom;
    private String time;
    private String name;
    private Teacher teacher;
    private Group group;

    // Constructor Vació
    public Course() {
    }

    // Constructos Sobrecargado
    public Course(int classroom, String time, String name) {
        this.classroom = classroom;
        this.time = time;
        this.name = name;
    }

    // Getters y Setters de los atributos
    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    // Método para asignar un grupo a la asignatura
    public void assignGroup(Group group) {
        this.group = group;
    }

    // Método para asignar un profesor a la asignatura
    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
