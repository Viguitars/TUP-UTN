import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.println("Bienvenido a Calculadora");
        System.out.println("Ingrese el primer número:");

        double num1 = sc.nextDouble();

        do {

            System.out.println("\nIngrese el segundo número:");
            double num2 = sc.nextDouble();

            System.out.println("\nMenu de Operaciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");

            System.out.println("\nIngrese una operación:");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                switch (opcion) {
                    case 1:
                        System.out.println("\nOperación Suma");
                        double sum = num1 + num2;
                        System.out.println("\nLa suma de " + num1 + " y " + num2 + " es igual a " + sum);
                        num1 = sum;
                        break;
                    case 2:
                        System.out.println("\nOperación Resta");
                        double rest = num1 - num2;
                        System.out.println("\nLa resta de " + num1 + " y " + num2 + " es igual a " + rest);
                        num1 = rest;
                        break;
                    case 3:
                        System.out.println("\nOperación Multiplicación");
                        double multiply = num1 * num2;
                        System.out.println("\nLa multiplicación de " + num1 + " y " + num2 + " es igual a " + multiply);
                        num1 = multiply;
                        break;
                    case 4:
                        System.out.println("\nOperación División");
                        if (num2 == 0) {
                            System.out.println("El número no puede ser cero. Ingrese un valor válido.");
                        } else {
                            double div = num1 / num2;
                            System.out.println("\nLa división de " + num1 + " y " + num2 + " es igual a " + div);
                            num1 = div;
                            break;
                        }
                }

            } else if (opcion == 0) {
                System.out.println("\n¡Hasta luego!");
            } else {
                System.out.println("\nIngrese una opción válida.");
            }

        } while (opcion != 0);

        sc.close();
    }

}
/*
 * **Sección 1: Suma **
 * 
 * 1. Implemente la función `suma` en Java que realice la suma de dos números y
 * devuelva el resultado.
 * 2. Cree un programa de Java que solicite al usuario ingresar dos números,
 * luego llame a la función `suma` e imprima el resultado.
 ** 
 * Sección 2: Resta**
 * 
 * 1. Implemente la función `resta` en Java que realice la resta de dos números
 * y devuelva el resultado.
 * 2. Modifique el programa de Java para que también pueda realizar operaciones
 * de resta. Solicite al usuario elegir entre suma o resta y realice la
 * operación correspondiente.
 ** 
 * Sección 3: Multiplicación**
 * 
 * 1. Implemente la función `multiplicación` en Java que realice la
 * multiplicación de dos números y devuelva el resultado.
 * 2. Agregue la capacidad de realizar operaciones de multiplicación en el
 * programa de Java. Permita que el usuario elija entre suma, resta o
 * multiplicación y realice la operación correspondiente.
 ** 
 * Sección 4: División **
 * 
 * 1. Implemente la función `división` en Java que realice la división de dos
 * números y devuelva el resultado.
 * 2. Modifique el programa de Java para que pueda realizar operaciones de
 * división. Asegúrese de manejar correctamente la división por cero y muestre
 * un mensaje de error si es necesario.
 ** 
 * Sección 5: Secuencia de Operaciones **
 * 
 * 1. Modifique el programa de Java para que permita realizar múltiples
 * operaciones en secuencia sin reiniciar la calculadora. Utilice el resultado
 * de la operación anterior como el primer número para la siguiente operación.
 ** 
 * Sección 6: Salir de la Calculadora **
 * 
 * 1. Agregue una opción para que el usuario pueda salir de la calculadora en
 * cualquier momento.
 * 2. Cuando el usuario decida salir, muestre un mensaje de despedida.
 */
