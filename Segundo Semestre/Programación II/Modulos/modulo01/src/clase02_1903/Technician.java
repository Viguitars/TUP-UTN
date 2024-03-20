package clase02_1903;

public class Technician extends Worker {
    public Technician() {
    }

    public Technician(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Technician: " + name;
    }
}
