package clases.clase06_1604.EjerciciosArrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumMayor {
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

        // Determinar el mayor número y su posición
        int mayor = numeros.get(0);
        int posicion = 0;
        for (int i = 1; i < 10; i++) {
            if (numeros.get(i) > mayor) {
                mayor = numeros.get(i);
                posicion = i;
            }
        }

        System.out.println("El mayor número ingresado es " + mayor + " y se " +
                "encuentra en la posición " + (posicion + 1));
    }
}
