package practicos.tp2_uml2.Ejercicio1;

public class Fish extends Animal {
    private String type;

    public Fish(String name, int age, String type, double price) {
        super(name, age, "Fish", price);
        this.type = type;
    }
}
