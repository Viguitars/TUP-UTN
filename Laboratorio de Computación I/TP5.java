import java.util.Scanner;

/* Ejercicio 1
Programa Java que lea un número entero por teclado y calcule si es par o 
impar. */

class ejercicio_1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese un número entero: ");

      int number = sc.nextInt();

      sc.close();

      if (number % 2 == 0) {
         System.out.print("El número " + number + " es par.");
      } else {
         System.out.print("El número " + number + " es impar.");
      }
   }
}

/*
 * Ejercicio 2
 * Programa que lea un número entero y muestre si el número es múltiplo de 10.
 */
class ejercicio_2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Ingrese un número entero: ");

      int number = sc.nextInt();

      sc.close();

      if (number % 10 == 0) {
         System.out.print(number + " es múltiplo de 10.");
      } else {
         System.out.print(number + " no es múltiplo de 10.");
      }
   }
}

/*
 * Ejercicio 3
 * Programa que lea un carácter por teclado y compruebe si es una letra
 * mayúscula.
 */
class ejercicio_3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese una letra: ");

      String letter = sc.nextLine();

      sc.close();

      if (letter.length() != 1) {
         System.out.println("La letra " + letter + " no es mayúscula.");
      } else if ((letter.compareTo("A") >= 0) && (letter.compareTo("Z") <= 0)) {
         System.out.println("La letra " + letter + " es mayúscula.");
      } else {
         System.out.println("La letra " + letter + " no es mayúscula.");
      }
   }
}

/*
 * Ejercicio_4
 * Programa java que comprueba si dos números enteros son iguales o no. Los
 * números a comprobar se introducen por teclado.
 */
class ejercicio_4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese el primer número: ");
      int number1 = sc.nextInt();

      System.out.print("Ingrese el segundo número: ");
      int number2 = sc.nextInt();

      sc.close();

      if (number1 == number2) {
         System.out.print("El número " + number1 + " es igual a al número " + number2);
      } else {
         System.out.print("El número " + number1 + " no es igual a al número " + number2);
      }

   }

}

/*
 * Ejercicio_5
 * Programa java para calcular el mayor de dos números enteros que se
 * introducen por teclado.
 */

class ejercicio_5 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese el primero número: ");
      int number1 = sc.nextInt();

      System.out.print("Ingrese el segundo número: ");
      int number2 = sc.nextInt();

      sc.close();

      if (number1 > number2) {
         System.out.println("El número " + number1 + " es mayor al número " + number2 + ".");
      } else if (number1 < number2) {
         System.out.println("El número " + number2 + " es mayor al número " + number1 + ".");
      } else {
         System.out.println("El número " + number1 + " es igual al número " + number2 + ".");
      }
   }
}

/*
 * Ejercicio 6
 * Programa java para calcular si la última cifra de dos números enteros es la
 * misma.
 * Para realizar esto el programa lee por teclado dos números enteros y debe
 * obtener la última cifra de cada uno de los números. Mediante una instrucción
 * condicional if .. else mostrará un mensaje por pantalla indicando si los dos
 * números acaban con la misma cifra o no.
 * Para obtener la última cifra de un número se utiliza el operador % (resto).
 * La última cifra de cada número se obtiene calculando el resto de la división
 * del número entre 10. Por ejemplo, si uno de los números es 123 su última
 * cifra
 * se calcula 123 % 10 = 3
 */
class ejercicio_6 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese el primer número: ");
      int number1 = sc.nextInt();
      System.out.print("Ingrese el segundo número: ");
      int number2 = sc.nextInt();

      // last_digit_of_number1 = number1 % 10;
      // last_digit_of_number2 = number2 % 10;

      sc.close();

      if (number1 % 10 == number2 % 10) {
         System.out.println("Ambos número terminan con la misma cifra.");
      } else {
         System.out.println("Ambos números terminan con distinta cifra.");
      }
   }
}
