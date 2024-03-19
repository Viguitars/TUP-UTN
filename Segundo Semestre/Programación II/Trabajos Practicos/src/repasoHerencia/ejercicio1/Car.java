package repasoHerencia.ejercicio1;

public class Car extends Vehicle {
    private int speed;
    private int displacements;

    public Car() {
    }

    public Car(String color, int numberOfWheels, int speed, int displacements) {
        super(color, numberOfWheels);
        this.speed = speed;
        this.displacements = displacements;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDisplacements() {
        return displacements;
    }

    public void setDisplacements(int displacements) {
        this.displacements = displacements;
    }
}
