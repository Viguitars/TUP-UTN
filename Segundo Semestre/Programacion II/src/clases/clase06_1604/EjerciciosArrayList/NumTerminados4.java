package clases.clase06_1604.EjerciciosArrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumTerminados4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Leer los 10 números enteros y almacenarlos en el ArrayList
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

        System.out.println("Los números terminados en 4 son:");

        // Determinar las posiciones de los números terminados en 4
        for (int i = 0; i < 10; i++) {
            if (numeros.get(i) % 10 == 4) {
                System.out.println("Número: " + numeros.get(i) + ", Posición: " + (i + 1));
            }
        }
    }
}
