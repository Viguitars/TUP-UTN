package practicos.tp1.Ejercicio8;

public abstract class Employee {

    //    Atributos
    protected String name;
    protected int age;
    protected double salary;

    //    Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //    Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //    Método para todos los empleados
    public void work() {
        System.out.println(name + " is working.");
    }
}
