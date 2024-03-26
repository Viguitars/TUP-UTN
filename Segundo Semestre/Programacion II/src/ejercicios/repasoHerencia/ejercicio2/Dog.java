package ejercicios.repasoHerencia.ejercicio2;

public class Dog extends Animal {
    private String breed;

    public Dog() {
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(String name, int age, String gender, String breed) {
        super(name, age, gender);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    public void information() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Breed: " + breed);
    }
}
