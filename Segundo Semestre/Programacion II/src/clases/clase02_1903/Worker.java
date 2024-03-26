package clases.clase02_1903;

public class Worker extends Employee {
    public Worker() {
    }

    public Worker(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Worker: " + name;
    }
}
