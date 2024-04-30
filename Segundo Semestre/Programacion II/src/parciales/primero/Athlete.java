package parciales.primero;

public class Athlete extends Person implements Contract {
    // Atributos
    private double height;
    private int age;
    private double weight;

    // Constructor Vacío
    public Athlete() {
    }

    // Constructor Sobrecargado
    public Athlete(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    // Getters y Setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Implementación de los métodos de la interfaz Contract
    @Override
    public double calculateBMI(double weight, double height) {
        return weight / Math.sqrt(height);
    }

    public boolean hasExtraWeight(double weight) {
        double bmi = calculateBMI(this.weight, this.height);
        return bmi > 25;
    }

    @Override
    public double takePulse() {
        return 0.0;
    }
}
