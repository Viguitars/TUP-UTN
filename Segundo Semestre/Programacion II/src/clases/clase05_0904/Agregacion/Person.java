package clases.clase05_0904.Agregacion;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Book> books;

    public Person(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        book.addOwner(this);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String toString() {
        return name + " has the following books: " + books;
    }
}
