package clases.clase04_0404.Ejercicio1;

public class Circle implements Shape, Drawable {
    @Override
    public void draw() {
        System.out.println("A circle can be drawn.");
    }

    @Override
    public void area(float radius) {
        System.out.println("The area of a circle is " + (float) (Math.PI * radius * radius));
    }

}
