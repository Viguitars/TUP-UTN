package practicos.tp2.Ejercicio1;

public class Bird extends Animal {
    private String species;
    private boolean canSpeak;

    public Bird(String name, int age, String species, boolean canSpeak,
                double price) {
        super(name, age, "Bird", price);
        this.species = species;
        this.canSpeak = canSpeak;
    }
}
