package practicos.tp3_excepciones.EjercicioA7;

public class Main {
    public static void main(String[] args) {
        try {
            // Simulamos una situación que puede lanzar la excepción base
            throw new CustomException("Esto es una excepción personalizada.");
        } catch (CustomException e) {
            System.out.println("Capturada una excepción base: " + e.getMessage());
        }
        try {
            // Simulamos una situación que puede lanzar la excepción derivada
            throw new SubCustomException("Esto es una sub-excepción " +
                    "personalizada.");
        } catch (SubCustomException e) {
            System.out.println("Capturada una sub-excepción: " + e.getMessage());
        } catch (CustomException e) {
            // En este caso, la excepción derivada también es capturada por el
            // bloque de la excepción base
            System.out.println("Capturada una excepción base: " + e.getMessage());
        }
    }
}
