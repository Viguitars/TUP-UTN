package practicos.tp1.Ejercicio9;

public class Rectangle extends GeometricFigure {

    //    Atributos
    private double length;
    private double width;

    //    Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //    Getter y Setter
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //    Método para calcular el área de un rectángulo
    @Override
    public double calculateArea() {
        return length * width;
    }

    //    Método para calcular el perímetro de un rectángulo
    @Override
    public double calculatePerimeter() {
        return (2 * length) + (2 + width);
    }
}
