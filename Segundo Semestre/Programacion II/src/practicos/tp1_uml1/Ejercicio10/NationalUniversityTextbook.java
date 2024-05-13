package practicos.tp1.Ejercicio10;

public class NationalUniversityTextbook extends Book {

    //    Atributo
    private String faculty;

    //    Constructor
    public NationalUniversityTextbook(String title, String author,
                                      double price, String faculty) {
        super(title, author, price);
        this.faculty = faculty;
    }

    //    Getters y Setters
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    //  Método específico para imprimir la información del libro
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Faculty: " + faculty);
    }
}
