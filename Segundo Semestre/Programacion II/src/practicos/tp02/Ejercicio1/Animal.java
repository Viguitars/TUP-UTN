package practicos.tp02.Ejercicio1;

public class Animal {
    private String name;
    private int age;
    private String animalType;
    private double price;

    public Animal(String name, int age, String animalType, double price) {
        this.name = name;
        this.age = age;
        this.animalType = animalType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void feed(String name) {
        System.out.println("Feeding " + name);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Type: " + animalType +
                ", Price: " + price;
    }
}
