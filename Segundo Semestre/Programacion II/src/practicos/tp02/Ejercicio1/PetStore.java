package practicos.tp02.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class PetStore {
    private List<Animal> animals;

    public PetStore() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void sellAnimal(String name) {
        animals.removeIf(animal -> animal.getName().equals(name));
    }

    public void feedAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                animal.feed(name);
                break;
            }
        }
    }

    public void listAnimals() {
        System.out.println("List of animals in the pet store:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
