package clases.clase09_0705.Ejemplos.Coercion;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        double b = 2.5;
        /**
         * Realizamos una operación aritmética entre un entero y un double
         * La coerción implícita convertirá el entero 'a' en double antes de
         * la división*/
        double resultado = a / b;
        // Imprimimos el resultado
        System.out.println("El resultado de la división es: " + resultado);
    }
}
