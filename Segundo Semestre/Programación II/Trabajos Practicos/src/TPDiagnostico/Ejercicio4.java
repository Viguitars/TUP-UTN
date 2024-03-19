package TPDiagnostico;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Pide un número por teclado e indica si es un número primo o no.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Enter a positive integer number:");
                num = sc.nextInt();
                if (num > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a positive integer " +
                            "greater than 0.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a positive " +
                        "integer.");
                sc.next();
            }
        }

        boolean isPrime = checkPrime(num);

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
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
