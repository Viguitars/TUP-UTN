package clases.clase05_0904.Agregacion;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Person> owners;

    public Book(String title) {
        this.title = title;
        this.owners = new ArrayList<>();
    }

    public void addOwner(Person person) {
        owners.add(person);
    }

    public List<Person> getOwners() {
        return owners;
    }

    public String toString() {
        return title + " is owned by: " + owners;
    }
}
