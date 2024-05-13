package practicos.tp2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        PetStore petStore = new PetStore();

        Dog dog = new Dog("Rex", 3, "Labrador", true, 100.0);
        Cat cat = new Cat("Garfield", 5, "Persian", false, 80.0);
        Bird bird = new Bird("Tweety", 2, "Canary", true, 50.0);
        Fish fish = new Fish("Nemo", 1, "Clownfish", 20.0);

        petStore.addAnimal(dog);
        petStore.addAnimal(cat);
        petStore.addAnimal(bird);
        petStore.addAnimal(fish);

        petStore.listAnimals();

        petStore.sellAnimal("Garfield");

        petStore.listAnimals();

        petStore.feedAnimal("Rex");
    }
}
