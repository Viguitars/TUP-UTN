package practicos.tp3;

public class EjercicioB1 {
    public static void main(String[] args) {
        try {
            // Intentamos dividir por cero
            int resultado = dividirPorCero(10, 0);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Capturamos y manejamos la excepción ArithmeticException
            System.out.println("Se ha producido una ArithmeticException: " + e.getMessage());
        }
    }

    public static int dividirPorCero(int dividendo, int divisor) {
        return dividendo / divisor;
    }
}
