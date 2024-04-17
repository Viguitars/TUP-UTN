package practicos.tp1.Ejercicio9;

public class Circle extends GeometricFigure {

    //    Atributo
    private double radius;

    //    Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //    Getters y Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //    Método para calcular el área del círculo
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    //    Método para calcular el perímetro del círculo
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
