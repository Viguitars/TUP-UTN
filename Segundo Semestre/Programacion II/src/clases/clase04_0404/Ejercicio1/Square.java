package clases.clase04_0404.Ejercicio1;

public class Square implements Rotatable, Shape, Drawable {

    @Override
    public void draw() {
        System.out.println("A square was drawn.");
    }

    @Override
    public void area(float side) {
        System.out.println("The area of a square is " + (side * side));
    }

    @Override
    public void rotate(float degrees) {
        System.out.println("The square was rotated " + degrees + " degrees.");
    }

}
