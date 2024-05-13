package practicos.tp3_excepciones;

import java.util.Random;

public class EjercicioB3 {
    public static void main(String[] args) {
        try {
            int numeroAleatorio = generarNumeroAleatorio();
            verificarParidad(numeroAleatorio);
            System.out.println("El número generado es par: " + numeroAleatorio);
        } catch (Exception e) {
            System.out.println("Se generó una excepción: " + e.getMessage());
        }
    }

    // Genera un número aleatorio entre 1 y 100
    public static int generarNumeroAleatorio() {
        Random rand = new Random();
        return rand.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
    }

    // Verifica si un número es par o impar
    public static void verificarParidad(int numero) throws Exception {
        if (numero % 2 != 0) {
            throw new Exception("El número generado es impar: " + numero);
        }
    }
}
