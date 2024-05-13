package practicos.tp1.Ejercicio10;

public class Textbook extends Book {

    //    Atributo
    private String course;

    //    Constructor
    public Textbook(String title, String author, double price, String course) {
        super(title, author, price);
        this.course = course;
    }

    //    Getters y Setters
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    //  Método específico para imprimir la información del libro
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Course: " + course);
    }
}
