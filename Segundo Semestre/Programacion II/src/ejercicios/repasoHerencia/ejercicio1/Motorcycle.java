package ejercicios.repasoHerencia.ejercicio1;

public class Motorcycle extends Bicycle {
    private int speed;
    private int displacement;

    public Motorcycle() {
    }

    public Motorcycle(int speed, int displacement) {
        this.speed = speed;
        this.displacement = displacement;
    }

    public Motorcycle(String type, int speed, int displacement) {
        super(type);
        this.speed = speed;
        this.displacement = displacement;
    }

    public Motorcycle(String color, int numberOfWheels, String type, int speed
            , int displacement) {
        super(color, numberOfWheels, type);
        this.speed = speed;
        this.displacement = displacement;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
}
