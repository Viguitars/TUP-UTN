package repasoHerencia.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Tangerine", 9, "Famale", "Labrador");
        Cat cat = new Cat("Minina", 12, "Famale", "Black");
        Bird bird = new Bird("Tweeti", 2, "Male", "Parrot");

        System.out.println("- Animal sound:");
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

        System.out.println("\n- Dog information:");
        dog.information();
        System.out.println("\n- Cat information:");
        cat.information();
        System.out.println("\n- Bird information:");
        bird.information();

    }
}
