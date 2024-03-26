package practicos.tp00_diagnostico;

import java.util.Scanner;

/**
 * Pide por teclado dos números y genera 10 números aleatorios entre esos
 * números. Usa el método Math.random para generar un número entero aleatorio.
 */

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        if (num2 <= num1) {
            System.out.println("The second number should be greater than " +
                    "firsts number.");
            return;
        }

        System.out.println("Generating 10 random numbers between " + num1 + " " +
                "and " + num2 + ".");

        for (int i = 0; i < 10; i++) {
            int randomNumber = generateRandomNumber(num1, num2);
            System.out.println(randomNumber);
        }

    }

    private static int generateRandomNumber(int num1, int num2) {
        return (int) ((Math.random() * (num2 - num1 + 1)) + num1);
    }
}
