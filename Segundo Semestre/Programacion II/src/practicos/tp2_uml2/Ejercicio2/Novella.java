package practicos.tp2_uml2.Ejercicio2;

public class Novella extends Book {
    private String genre;

    public Novella(String title, String author, int publicationYear,
                   String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
