package practicos.tp1.Ejercicio8;

public class Worker extends Employee {

    //    Atributo
    private String area;

    //    Constructor
    public Worker(String name, int age, double salary, String area) {
        super(name, age, salary);
        this.area = area;
    }

    //    Getters y Setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    //    Método específico para los trabajadores
    public void produce() {
        System.out.println(name + " is producing in the " + area + " area.");
    }
}
