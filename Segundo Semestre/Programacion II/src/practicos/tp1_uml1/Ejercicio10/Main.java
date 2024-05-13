package practicos.tp1_uml1.Ejercicio10;

public class Main {
    public static void main(String[] args) {
        // Crear un libro
        Book book = new Book("Clean Code", "Robert C. Martin", 25.99);

        // Imprimir información del libro
        System.out.println("Book:");
        book.printInfo();
        System.out.println();

        // Crear un libro de texto
        Textbook textbook = new Textbook("Introduction to Algorithms", "Thomas"
                + " H. Cormen", 50.99, "Algorithms");

        // Imprimir información del libro de texto
        System.out.println("Textbook:");
        textbook.printInfo();
        System.out.println();

        // Crear un libro de texto de la Universidad Nacional de Colombia
        NationalUniversityTextbook nationalTextbook =
                new NationalUniversityTextbook("Machine Learning",
                        "Christopher M. Bishop", 65.99, "Engineering");

        // Imprimir información del libro de texto de la Universidad Nacional
        // de Colombia
        System.out.println("National University Textbook:");
        nationalTextbook.printInfo();
        System.out.println();

        // Crear una novela
        Novel novel = new Novel("To Kill a Mockingbird", "Harper Lee", 15.99,
                "Historical");

        // Imprimir información de la novela
        System.out.println("Novel:");
        novel.printInfo();
    }
}
