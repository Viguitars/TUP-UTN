package clases.clase04_0304.Ejercicio3;

public class Tres {
    private static int metodo() {
        int valor = 0;

        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W"); // Aquí se produce una
            // excepción NumberFormatException
            valor = valor + 1;
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("W"); // Se vuelve a intentar
            // convertir "W" a entero, lo que arroja la misma excepción
            System.out.println("Valor final del catch: " + valor);
        } finally {
            valor = valor + 1; // Se ejecuta sin importar si hay excepciones o no
            System.out.println("Valor final del finally:" + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor; // Se devuelve el valor 4
    }

    public static void main(String[] args) {
        try {
            System.out.println(metodo()); // Aquí se imprime la excepción
            // generada por parseInt("W") y luego el valor devuelto por el método
        } catch (Exception e) {
            System.err.println("Excepcion en metodo ( ) ");
            e.printStackTrace();
        }
    }
}
