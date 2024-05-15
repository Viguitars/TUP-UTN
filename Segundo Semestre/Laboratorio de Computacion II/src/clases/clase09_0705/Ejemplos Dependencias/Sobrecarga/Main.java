package clases.clase09_0705.Ejemplos.Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Suma de enteros
        System.out.println("Suma de enteros: " + calculadora.sumar(5, 3));

        // Suma de enteros sobrecargada
        System.out.println(
                "Suma de enteros sobrecargada: " + calculadora.sumar(5, 3, 2));

        // Suma de números de punto flotante
        System.out.println("Suma de números de punto flotante: " +
                calculadora.sumar(5.5, 3.2));

        // Resta de enteros
        System.out.println("Resta de enteros: " + calculadora.restar(5, 3));

        // Resta de números de punto flotante
        System.out.println("Resta de números de punto flotante: " +
                calculadora.restar(5.5, 3.2));

        // Multiplicación de enteros
        System.out.println(
                "Multiplicación de enteros: " + calculadora.multiplicar(5, 3));

        // Multiplicación de números de punto flotante
        System.out.println("Multiplicación de números de punto flotante: " +
                calculadora.multiplicar(5.5, 3.2));
    }
}
