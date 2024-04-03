package teoria.dependencia;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(10);
        Circle circle2 = new Circle();
        circle2.setRadius(20);

        System.out.println("Circle one, area: " + circle1.getArea() + ", " +
                "circumference: " + circle1.getCircumference());
        System.out.println("Circle dos, area: " + circle2.getArea() + ", " +
                "circumference: " + circle2.getCircumference());
    }
}
