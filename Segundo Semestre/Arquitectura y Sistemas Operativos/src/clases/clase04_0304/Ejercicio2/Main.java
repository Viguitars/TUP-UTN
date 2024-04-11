package clases.clase04_0304.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        try {
//            Se crea un array de cinco elementos
            int[] numeros = new int[5];

//            Se intenta acceder al elemento seis del array (índice fuera de bounds)
            int numero = numeros[6];

            System.out.println("El número es: " + numero);
        } catch (ArrayIndexOutOfBoundsException e) {
//            Se captura la excepción ArrayIndexOutOfBoundsException
            System.out.println("Error: " + e.getMessage());
            System.out.println("Fuera de parámetro.");
        }
    }
}
