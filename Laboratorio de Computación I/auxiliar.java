import java.util.Scanner;

/* 29. Programa Java que convierte millas a kilómetros. El programa pide que se introduzca una cantidad de millas y calcula y muestra su equivalente en Kilómetros. El proceso se repite hasta que se introduzca un 0 como valor para las millas.
1 Milla equivale a 1.6093 Kilómetros.
El valor de los KM resultantes se debe mostrar con dos decimales.
Para pasar de millas a Km realizaremos la operación:
Km = millas * 1.6093
 */

class Ejercicios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double MILES_TO_KILOMETERS = 1.6093d;
        double miles;

        do {
            System.out.println("Ingrese millas (0 para salir):");
            miles = sc.nextDouble();

            if (miles != 0) {

                double kilometers = miles * MILES_TO_KILOMETERS;

                System.out.printf("%.0f millas con %.2f kilómetros.", miles, kilometers);

            }

        } while (miles != 0);

        sc.close();
    }
}