package clases.clase06_1604.EjerciciosArrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumMayorPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Leer los 10 enteros y almacenarlos en el ArrayList
        for (int i = 0; i < 10; i++) {
            int numero;
            while (true) {
                try {
                    System.out.print("Ingrese el número " + (i + 1) + ": ");
                    numero = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("¡Error! Por favor ingrese un número " + "entero válido.");
                    sc.next();
                }
            }
            numeros.add(numero);
        }

        // Determinar el mayor número primo y su posición
        int mayorPrimo = -1;
        int posicion = -1;
        for (int i = 0; i < 10; i++) {
            int num = numeros.get(i);
            if (esPrimo(num) && num > mayorPrimo) {
                mayorPrimo = num;
                posicion = i;
            }
        }

        if (posicion != -1) {
            System.out.println("El mayor número primo ingresado es " + mayorPrimo + " y se encuentra en la posición " + (posicion + 1));
        } else {
            System.out.println("No se encontraron números primos en el " +
                    "arreglo" + ".");
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
