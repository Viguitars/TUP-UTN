package ejercicios.repasoHerencia.ejercicio1;

public class Bicycle extends Vehicle {
    private String type;

    public Bicycle() {

    }

    public Bicycle(String type) {
        this.type = type;
    }

    public Bicycle(String color, int numberOfWheels, String type) {
        super(color, numberOfWheels);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
