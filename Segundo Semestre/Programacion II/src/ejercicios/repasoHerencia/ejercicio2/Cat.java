package ejercicios.repasoHerencia.ejercicio2;

public class Cat extends Animal {
    private String color;

    public Cat() {
    }

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String name, int age, String gender, String color) {
        super(name, age, gender);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }

    public void information() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Breed: " + color);
    }
}
