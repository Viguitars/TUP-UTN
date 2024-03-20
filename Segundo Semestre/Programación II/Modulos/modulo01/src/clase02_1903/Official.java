package clase02_1903;

public class Official extends Worker {
    public Official() {
    }

    public Official(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Oficial: " + name;
    }
}
