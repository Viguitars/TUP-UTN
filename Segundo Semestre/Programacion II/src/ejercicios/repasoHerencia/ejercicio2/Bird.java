package ejercicios.repasoHerencia.ejercicio2;

public class Bird extends Animal {
    private String species;

    public Bird() {
    }

    public Bird(String species) {
        this.species = species;
    }

    public Bird(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Bird(String name, int age, String gender, String species) {
        super(name, age, gender);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void makeSound() {
        System.out.println("The bird chips.");
    }

    public void information() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Breed: " + species);
    }
}
