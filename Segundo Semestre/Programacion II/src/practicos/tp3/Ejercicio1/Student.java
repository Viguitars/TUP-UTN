package practicos.tp3.Ejercicio1;

import java.util.ArrayList;

public class Student extends Person{
    private ArrayList<Group> groups;

    public Student(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public Student(int identityDocument, String name, ArrayList<Group> groups) {
        super(identityDocument, name);
        this.groups = groups;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }
}
