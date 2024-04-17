package practicos.tp2.Ejercicio2;

public class Book implements Borrowable {
    private String title;
    private String author;
    private int publicationYear;
    private boolean borrowed;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public void borrow() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("The book '" + title + "' has been borrowed.");
        } else {
            System.out.println("The book '" + title + "' is already borrowed.");
        }
    }

    @Override
    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println("The book '" + title + "' has been returned.");
        } else {
            System.out.println("The book '" + title + "' was not borrowed.");
        }
    }
}
