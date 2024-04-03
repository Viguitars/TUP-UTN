package teoria.dependencia;

public class Circle {
    private double radius;
    private final double pi = 3.14159;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * pi * radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }
}
