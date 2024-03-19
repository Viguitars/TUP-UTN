package TPDiagnostico;

import java.util.Scanner;


/**
 * Crea una calculadora simple en Java que pueda realizar operaciones básicas
 * como suma, resta, multiplicación y división. El programa debe solicitar al
 * usuario que ingrese dos números y luego le permite elegir la operación que
 * desea realizar. Una vez completada la operación, debe mostrar el resultado
 * al usuario. Cada operación debe implementarse en un método diferente. El
 * programa principal debe llamar a estos métodos según la operación
 * seleccionada por el usuario.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Enter the operation (1-4):");
        int choice = sc.nextInt();

        double result = switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> mult(num1, num2);
            case 4 -> div(num1, num2);
            default -> {
                System.out.println("Invalid operation.");
                yield 0;
            }
        };

        System.out.println("The resul of operations is: " + result);

    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double sub(double num1, double num2) {
        return num1 - num2;
    }

    private static double mult(double num1, double num2) {
        return num1 * num2;
    }

    private static double div(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("¡Error! Cannot divide by zero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}
