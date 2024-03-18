package TPDiagnostico;

import java.util.Scanner;

/**
 * Crea un programa en Java que convierta la temperatura de grados Celsius a
 * Fahrenheit y viceversa. El programa debe permitir al usuario elegir la
 * dirección de la conversión y luego ingresar la temperatura a convertir.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // Create a Scanner objet to read user input
        Scanner sc = new Scanner(System.in);
        // Display the options
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        // Prompt the user fot the option
        System.out.println("Choose an option (1-2):");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter temperature in Celsius");
            double celsius = sc.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + "° Celsius is equal to " + fahrenheit +
                    "° Fahrenheit");
        } else if (choice == 2) {
            System.out.println("Enter temperature in Fahrenheit");
            double fahrenheit = sc.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + "° Fahrenheit is equal to " + celsius +
                    "° Celsius.");

        } else {
            System.out.println("Invalid option. Please choose 1 or 2.");
        }
    }

    // Method to convert Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
