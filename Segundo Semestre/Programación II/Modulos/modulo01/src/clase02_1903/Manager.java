package clase02_1903;

public class Manager extends Employee {
    public Manager() {
    }

    public Manager(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Manager: " + name;
    }
}
