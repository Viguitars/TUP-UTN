package practicos.tp02.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("The book '" + book.getTitle() + "' has been added " +
                "to the library.");
    }

    public void listAvailableBooks() {
        System.out.println("Available books in the library:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book.getTitle());
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.borrow();
                return;
            }
        }
        System.out.println("The book '" + title + "' is not available in the " +
                "library.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Could not return the book '" + title + "'.");
    }
}
