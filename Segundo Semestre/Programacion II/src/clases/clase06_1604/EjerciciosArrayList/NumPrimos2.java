package clases.clase06_1604.EjerciciosArrayList;

import java.util.ArrayList;

public class NumPrimos2 {
    public static void main(String[] args) {
        ArrayList<Integer> primos = new ArrayList<>();

        // Almacenar en un ArrayList los 10 números primos comprendidos entre
        // 100 y 300
        for (int i = 100; i <= 300; i++) {
            if (esPrimo(i)) {
                primos.add(i);
                if (primos.size() == 10) {
                    break;
                }
            }
        }

        System.out.println("Los 10 números primos entre 100 y 300 son:");
        for (int primo : primos) {
            System.out.print(primo + " ");
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
