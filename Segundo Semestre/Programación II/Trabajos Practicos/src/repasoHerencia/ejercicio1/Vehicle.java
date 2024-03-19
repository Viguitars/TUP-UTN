package repasoHerencia.ejercicio1;

public abstract class Vehicle {
    protected String color;
    protected int numberOfWheels;

    public Vehicle() {
    }

    public Vehicle(String color, int numberOfheels) {
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
