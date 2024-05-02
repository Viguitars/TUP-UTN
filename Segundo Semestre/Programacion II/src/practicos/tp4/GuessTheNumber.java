package practicos.tp4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Intenta adivinar un número entre 1 y 100.");

        while (true) {
            try {
                System.out.print("Introduzca un número: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println(
                            "¡Felicidades! ¡Has adivinado el número!");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println(
                            "¡No! El número es mayor al que has ingresado.");
                } else {
                    System.out.println(
                            "¡No! El número es menor al que has ingresado.");
                }
            } catch (InputMismatchException e) {
                System.out.println("¡Error! Introduce un número válido.");
                scanner.next(); // limpiar el buffer del scanner
                attempts++;
            }
        }
        scanner.close();
    }
}
