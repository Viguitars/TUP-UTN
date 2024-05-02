package practicos.tp4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese la base del triángulo: ");
            double base = scanner.nextDouble();

            System.out.println("Ingrese la altura del triángulo: ");
            double height = scanner.nextDouble();

            double area = (base * height) / 2;

            System.out.println("El área del triángulo es: " + area);
        } catch (InputMismatchException e) {
            System.out.println("¡Error! Ingrese un valor válido.");
        }
        scanner.close();
    }
}
