package practicos.tp3_excepciones.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    // Atributos
    private final List<Group> groups;

    // Constructores
    public Student() {
        groups = new ArrayList<>();
    }

    public Student(int dni, String name) {
        super(dni, name);
        this.groups = new ArrayList<>();
    }

    // Método para obtener la lista de grupos en las que está el alumno
    public List<Group> getGroups() {
        return groups;
    }

    // Método para agregar un grupo a la lista de grupos del alumno
    public void addGroup(Group group) {
        groups.add(group);
    }
}
