package TPDiagnostico;

import java.util.Scanner;

/**
 * Pedir números al usuario y cuando el usuario meta un -1 se terminará el
 * programa.
 * Al terminar, mostrará lo siguiente:
 * mayor número introducido
 * menor número introducido
 * suma de todos los números
 * suma de los números positivos
 * suma de los números negativos
 * media de la suma (la primera que pido)
 * El número -1 no contará como número.
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int positiveSum = 0;
        int negativeSum = 0;
        int count = 0;

        int number;
        do {
            System.out.print("Enter a number (-1 to stop): ");
            number = sc.nextInt();
            if (number != -1) {
                count++;
                sum += number;
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                if (number > 0) {
                    positiveSum += number;
                } else if (number < 0) {
                    negativeSum += number;
                }
            }
        } while (number != -1);

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            System.out.println("Maximum number: " + max);
            System.out.println("Minimum number: " + min);
            System.out.println("Sum of all numbers: " + sum);
            System.out.println("Sum of positive numbers: " + positiveSum);
            System.out.println("Sum of negative numbers: " + negativeSum);
            System.out.println("Average: " + (double) sum / count);
        }

    }
}

