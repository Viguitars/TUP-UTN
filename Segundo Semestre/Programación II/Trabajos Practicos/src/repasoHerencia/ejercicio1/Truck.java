package repasoHerencia.ejercicio1;

public class Truck extends Car {
    private double loadCapacity;

    public Truck() {

    }

    public Truck(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Truck(String color, int numberOfWheels, double loadCapacity,
                 int displacements) {
        super(color, numberOfWheels, 0, displacements);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
