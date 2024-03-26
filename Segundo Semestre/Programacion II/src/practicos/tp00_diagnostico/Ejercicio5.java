package practicos.tp00_diagnostico;


import java.util.Scanner;

/**
 * Crea un programa que pida al usuario un número mínimo y un máximo y muestre
 * por pantalla todos los números primos incluidos en ese rango. Validar que
 * mínimo sea menor que máximo.
 */


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the minimum number: ");
        int min = sc.nextInt();
        System.out.print("Enter the maximum number: ");
        int max = sc.nextInt();

        if (min >= max) {
            System.out.println("Error: Minimum number should be less than " +
                    "maximum number.");
            return;
        }

        System.out.println("Prime numbers between " + min + " and " + max + " " +
                "are:");
        for (int i = min; i <= max; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
