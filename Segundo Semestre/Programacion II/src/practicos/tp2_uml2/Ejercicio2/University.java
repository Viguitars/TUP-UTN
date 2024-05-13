package practicos.tp2.Ejercicio2;

public class University extends Book {
    private String course;

    public University(String title, String author, int publicationYear,
                      String course) {
        super(title, author, publicationYear);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
