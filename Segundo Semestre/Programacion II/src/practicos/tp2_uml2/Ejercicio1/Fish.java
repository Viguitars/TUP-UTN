package practicos.tp2.Ejercicio1;

public class Fish extends Animal {
    private String type;

    public Fish(String name, int age, String type, double price) {
        super(name, age, "Fish", price);
        this.type = type;
    }
}
