package practicos.tp1_uml1.Ejercicio8;

public class Manager extends Employee {

    //    Atributo
    private String deparment;

    //    Constructor
    public Manager(String name, int age, double salary, String deparment) {
        super(name, age, salary);
        this.deparment = deparment;
    }

    //    Getters y Setters
    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    //    Método específico para los gerentes
    public void organizeActivities() {
        System.out.println(name + " is organizing activities in the " + deparment + " department.");
    }

}
