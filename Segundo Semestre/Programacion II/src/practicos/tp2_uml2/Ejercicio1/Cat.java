package practicos.tp2_uml2.Ejercicio1;

public class Cat extends Animal {
    private String breed;
    private boolean sterilized;

    public Cat(String name, int age, String breed, boolean sterilized,
               double price) {
        super(name, age, "Cat", price);
        this.breed = breed;
        this.sterilized = sterilized;
    }
}
