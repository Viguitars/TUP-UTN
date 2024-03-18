package TPDiagnostico;

import java.util.Scanner;

/**
 * Pide por teclado dos números y genera 10 números aleatorios entre esos
 * números. Usa el método Math.random para generar un número entero aleatorio.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        // Create a Scanner object for read user input
        Scanner sc = new Scanner(System.in);
        // Prompt the user for the first number
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        // Prompt the user for the second number
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        if (num2 <= num1) {
            System.out.println("The second number should be greater than firsts number.");
            return;
        }

        System.out.println("Generating 10 random numbers between " + num1 + " and " + num2 + ".");
        // Generating ten random numbers
        for (int i = 0; i < 10; i++) {
            int randomNumber = generateRandomNumber(num1, num2);
            System.out.println(randomNumber);
        }

    }

    // Method to generate random numbers
    private static int generateRandomNumber(int num1, int num2) {
        return (int) ((Math.random() * (num2 - num1 + 1)) + num1);
    }
}
