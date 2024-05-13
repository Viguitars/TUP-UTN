package practicos.tp3_excepciones;

public class EjercicioA2 {
    public static void main(String[] args) {
        try {
            // Intentamos dividir por cero, lo que generará una excepción
            int resultado = dividir(10, 0);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Capturamos la excepción y mostramos el mensaje asociado a la
            // excepción
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    public static int dividir(int dividendo, int divisor) {
        return dividendo / divisor;
    }

}
