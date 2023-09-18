import java.util.Scanner;

// 1. Programa Java que lea un número entero por teclado y calcule si es par o 
// impar.
// Podemos saber si un número es par si el resto de dividir el número entre 2 
// es igual a cero. En caso contrario el número es impar. El operador Java que 
// calcula el resto de la división entre dos números enteros o no es el 
// operador %.
class Ejercicio_1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese un número entero: ");
      int number = sc.nextInt();

      sc.close();

      if (number % 2 == 0) {
         System.out.println("El número " + number + " es par.");
      } else {
         System.out.println("El número " + number + " es impar.");
      }
   }
}

// 2. Programa que lea un número entero y muestre si el número es múltiplo de
// 10.
// Podemos comprobar si un número entero es múltiplo de 10 si al dividirlo por
// 10 el resto de esta división es cero.
class Ejercicio_2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese un número entero: ");
      int number = sc.nextInt();

      sc.close();

      if (number % 10 == 0) {
         System.out.println(number + " es múltiplo de 10.");
      } else {
         System.out.println(number + " no es múltiplo de 10.");
      }
   }
}

// 3. Programa que lea un carácter por teclado y compruebe si es una letra
// mayúscula.
class Ejercicio_3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese un carácter: ");
      char char1 = sc.next().charAt(0);

      sc.close();

      if (Character.isUpperCase(char1)) {
         System.out.println("El carácter " + char1 + " es mayúscula.");
      } else {
         System.out.println("El carácter " + char1 + " no es mayúscula.");
      }
   }
}

// 4. Programa java que comprueba si dos números enteros son iguales o no. Los
// números a comprobar se introducen por teclado.
// Este es un ejercicio básico en Java para practicar la estructura
// condicional if .. else.
class Ejercicio_4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese el primer número: ");
      int number1 = sc.nextInt();

      System.out.println("Ingrese el segundo número: ");
      int number2 = sc.nextInt();

      sc.close();

      if (number1 == number2) {
         System.out.println("El número " + number1 + " es igual a al número " + number2);
      } else {
         System.out.println("El número " + number1 + " no es igual a al número " + number2);
      }
   }
}

// 5. Programa java para calcular el mayor de dos números enteros que se
// introducen por teclado.
// El programa muestra por pantalla cuál de los dos números es el mayor o si
// son iguales.
class Ejercicio_5 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese el primero número: ");
      int number1 = sc.nextInt();

      System.out.println("Ingrese el segundo número: ");
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

// 6. Programa java para calcular si la última cifra de dos números enteros es
// la misma.
// Para realizar esto el programa lee por teclado dos números enteros y debe
// obtener la última cifra de cada uno de los números. Mediante una
// instrucción condicional if .. else mostrará un mensaje por pantalla
// indicando si los dos números acaban con la misma cifra o no.
// Para obtener la última cifra de un número se utiliza el operador % (resto).
// La última cifra de cada número se obtiene calculando el resto de la
// división del número entre 10. Por ejemplo, si uno de los números es 123 su
// última cifra se calcula 123 % 10 = 3
class Ejercicio_6 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese el primer número: ");
      int number1 = sc.nextInt();
      System.out.println("Ingrese el segundo número: ");
      int number2 = sc.nextInt();

      sc.close();

      if (number1 % 10 == number2 % 10) {
         System.out.println("Ambos número terminan con la misma cifra.");
      } else {
         System.out.println("Ambos números terminan con distinta cifra.");
      }
   }
}

// 7. Programa java para calcular si un número entero es múltiplo de tres y de
// cinco.
class Ejercicio_7 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese un número entero: ");
      int number = sc.nextInt();

      sc.close();

      if (number % 15 == 0) {
         System.out.println("El número " + number + " es múltiplo de 3 y 5.");
      } else {
         System.out.println("El número " + number + " no es múltiplo de 3 y 5.");
      }
   }
}

// 8. Programa java para calcular si un número entero es múltiplo de dos o de
// tres.
class Ejercicio_8 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese un número entero: ");
      int number = sc.nextInt();

      sc.close();

      if (number % 6 == 0) {
         System.out.println("El número " + number + " es múltiplo de 2 y 3.");
      } else {
         System.out.println("El número " + number + " no es múltiplo de 2 y 3.");
      }
   }
}

// 9. Programa que lea dos caracteres y compruebe si son iguales.
class Ejercicio_9 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese el primer carácter: ");
      String char1 = sc.nextLine();
      System.out.println("Ingrese el segundo carácter: ");
      String char2 = sc.nextLine();

      sc.close();

      if (char1.length() != 1 || char2.length() != 1) {
         System.out.println("Ingrese un valor válido.");
      } else if (char1.equals(char2)) {
         System.out.println("Los caracteres son iguales.");
      } else {
         System.out.println("Los caracteres no son iguales.");
      }
   }
}

// 10. Programa java que lea dos caracteres por teclado y compruebe si los dos
// son letras minúsculas.
class Ejercicio_10 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese el primer carácter: ");
      char char1 = sc.next().charAt(0);
      System.out.println("Ingrese el segundo carácter: ");
      char char2 = sc.next().charAt(0);

      sc.close();

      if (Character.isLowerCase(char1) && Character.isLowerCase(char2)) {
         System.out.println(char1 + " y " + char2 + " son letras minúsculas.");
      } else {
         System.out.println(char1 + " y " + char2 + " no son letras minúsculas.");
      }
   }
}

// 11. Programa java que lea un carácter por teclado y compruebe si es un dígito
// numérico (cifra entre 0 y 9).
class Ejercicio_11 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese un carácter:");
      char char1 = sc.next().charAt(0);

      sc.close();

      if (Character.isDigit(char1)) {
         System.out.println(char1 + " es un dígito.");
      } else {
         System.out.println(char1 + " no es un dígito:");
      }
   }
}

// 12. Programa que lea dos números por teclado y muestre el resultado de la
// división del primer número por el segundo. Se debe comprobar que el divisor
// no puede ser cero.
class Ejercicio_12 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese el primer número:");
      double number1 = sc.nextDouble();
      System.out.println("Ingrese el segundo número:");
      double number2 = sc.nextDouble();

      sc.close();

      if (number2 != 0) {
         double result = number1 / number2;

         System.out.println("El resultado de dividir " + number1 + " en " + number2 + " es: " + result + ".");
      } else {
         System.out.println("El segundo número no puede ser cero.");
      }
   }
}

// 13. Programa java para comprobar si un año es bisiesto.
// El programa pide que se introduzca el valor de un año por teclado y calcula
// si es un año bisiesto o no lo es.
// Un año es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible
// por 400.
class Ejercicio_13 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese el año:");
      int year = sc.nextInt();

      sc.close();

      if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
         System.out.println(year + " es bisiesto.");
      } else {
         System.out.println(year + " no es bisiesto.");
      }
   }
}

// 14. Programa java para comprobar si un número entero de tres cifras es
// capicúa.
// El programa pide que se introduzca un número entero y comprueba si el número
// es capicúa o no lo es. Si el número introducido no tiene tres cifras se
// muestra un mensaje indicándolo y el programa finaliza.
// Un número es capicúa si se puede leer igual de izquierda a derecha que de
// derecha a izquierda. Por ejemplo, los números 1221, 35053, 969 ... son
// capicúa.
// Como el programa pide que el número introducido sea de tres cifras, para
// comprobar si es capicúa solo tendremos que comprobar si la primera cifra y la
// última son iguales.
class Ejercicio_14 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese un número entero de tres cifras:");
      int number = sc.nextInt();

      sc.close();

      if (number >= 100 && number <= 999) {
         int first_digit = number / 100;
         int last_digit = number % 10;

         if (first_digit == last_digit) {
            System.out.println(number + " es capicúa.");
         } else {
            System.out.println(number + " no es capicúa.");
         }
      } else {
         System.out.println("El número debe ser de tres cifras.");
      }
   }
}

// 15. Programa que lea por teclado tres números enteros H, M, S
// correspondientes a hora, minutos y segundos respectivamente, y comprueba si
// la hora que indican es una hora válida.

// Supondremos que leemos una hora en modo 24 Horas, es decir, el valor válido
// para las horas será mayor o igual que cero y menor que 24. El valor válido
// para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos.
class Ejercicio_15 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingresa la hora:");
      int hour = sc.nextInt();
      System.out.println("Ingresa los minutos:");
      int minutes = sc.nextInt();
      System.out.println("Ingresa los segundos:");
      int seconds = sc.nextInt();

      sc.close();

      boolean valid_hour = (hour >= 0 && hour <= 24);
      boolean valid_minutes = (minutes >= 0 && minutes <= 59);
      boolean valid_seconds = (seconds >= 0 && seconds <= 59);

      if (valid_hour && valid_minutes && valid_seconds) {
         System.out.println(hour + ":" + minutes + ":" + seconds + " es válida.");
      } else {
         System.out.println(hour + ":" + minutes + ":" + seconds + " no es válida.");
      }
   }
}
