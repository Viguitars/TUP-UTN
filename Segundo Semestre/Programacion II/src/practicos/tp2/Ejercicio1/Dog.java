package practicos.tp2.Ejercicio1;

public class Dog extends Animal {
    private String breed;
    private boolean vaccinated;

    public Dog(String name, int age, String breed, boolean vaccinated,
               double price) {
        super(name, age, "Dog", price);
        this.breed = breed;
        this.vaccinated = vaccinated;
    }
}
