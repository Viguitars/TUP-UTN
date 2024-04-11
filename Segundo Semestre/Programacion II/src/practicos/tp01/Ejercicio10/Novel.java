package practicos.tp01.Ejercicio10;

public class Novel extends Book {

    //    Atributo
    private String genre;

    //    Constructor
    public Novel(String title, String author, double price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    //    Getters y Setters
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //  Método específico para imprimir la información del libro
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Genre: " + genre);
    }
}
