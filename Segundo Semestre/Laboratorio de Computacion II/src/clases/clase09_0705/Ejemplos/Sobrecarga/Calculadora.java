package clases.clase09_0705.Ejemplos.Sobrecarga;

public class Calculadora {
    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para sumar tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método para sumar dos números de punto flotante
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar dos enteros
    public int restar(int a, int b) {
        return a - b;
    }

    // Método para restar dos números de punto flotante
    public double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dos enteros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para multiplicar dos números de punto flotante
    public double multiplicar(double a, double b) {
        return a * b;
    }
    /*
     * En este ejemplo, la clase Calculadora tiene múltiples métodos con el
     * mismo nombre (sumar, restar y multiplicar), pero cada uno tiene una lista
     * diferente de parámetros. Esto permite que el cliente llame al método
     * adecuado según los tipos de datos con los que estén trabajando.
     */
}
