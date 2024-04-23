package clases.clase08_2304.EjercicioExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario que ingrese dos números
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Solicitar al usuario que elija la operación
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            // Realizar la operación seleccionada
            double result = 0;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        throw new ArithmeticException(
                                "Division by zero is not allowed");
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid choice");
                    return;
            }

            // Mostrar el resultado
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
