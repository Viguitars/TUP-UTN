import java.util.Scanner;

/* Programa java para comprobar si un número entero de tres cifras es capicúa.
El programa pide que se introduzca un número entero y comprueba si el número es 
capicúa o no lo es. Si el número introducido no tiene tres cifras se muestra un 
mensaje indicándolo y el programa finaliza.
Un número es capicúa si se puede leer igual de izquierda a derecha que de 
derecha a izquierda. Por ejemplo, los números 1221, 35053, 969 ... son capicúa.
Como el programa pide que el número introducido sea de tres cifras, para 
comprobar si es capicúa solo tendremos que comprobar si la primera cifra y la 
última son iguales. */

class repaso_parcial1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número de tres cifras
        System.out.print("Ingrese un número entero de tres cifras: ");
        int number = sc.nextInt();

        // Verificar si el número tiene tres cifras
        if (number >= 100 && number <= 999) {
            // Extraer las cifras individuales
            int first_digit = number / 100;
            int last_digit = number % 10;

            // Comprobar si el número es capicúa
            if (first_digit == last_digit) {
                System.out.println("El número " + number + " es capicúa.");
            } else {
                System.out.println("El número " + number + " no es capicúa.");
            }
        } else {
            System.out.println("El número no tiene tres cifras.");
        }

        // Cerrar el objeto Scanner
        sc.close();
    }
}
