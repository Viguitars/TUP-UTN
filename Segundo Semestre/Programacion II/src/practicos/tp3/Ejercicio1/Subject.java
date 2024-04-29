package practicos.tp3.Ejercicio1;

public class Subject {
    private int classroom;
    private String time;
    private String name;
    private Teacher teacher;
    private Group group;

    public Subject() {
    }

    public Subject(int classroom, String time, String name, Teacher teacher,
                   Group group) {
        this.classroom = classroom;
        this.time = time;
        this.name = name;
        this.teacher = teacher;
        this.group = group;
    }

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
