package practicos.tp02.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Novella novella = new Novella("One Hundred Years of Solitude",
                "Gabriel García Márquez", 1967, "Magic realism");
        University university = new University("Introduction to Programming",
                "John Doe", 2020, "Computer Science");
        Children children = new Children("Harry Potter and the Philosopher's " +
                "Stone", "J.K. Rowling", 1997, 10);

        library.addBook(novella);
        library.addBook(university);
        library.addBook(children);

        library.listAvailableBooks();

        library.borrowBook("One Hundred Years of Solitude");
        library.borrowBook("Introduction to Programming");

        library.listAvailableBooks();

        library.returnBook("One Hundred Years of Solitude");

        library.listAvailableBooks();
    }
}
