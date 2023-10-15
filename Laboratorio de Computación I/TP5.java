import java.util.Scanner;

// 1. Programa Java que lea un número entero por teclado y calcule si es par o 
// impar.
// Podemos saber si un número es par si el resto de dividir el número entre 2 
// es igual a cero. En caso contrario el número es impar. El operador Java que 
// calcula el resto de la división entre dos números enteros o no es el 
// operador %.
class TP5Ejercicio1 {
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
class TP5Ejercicio2 {
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
class TP5Ejercicio3 {
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
class TP5Ejercicio4 {
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
class TP5Ejercicio5 {
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
class TP5Ejercicio6 {
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
class TP5Ejercicio7 {
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
class TP5Ejercicio8 {
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
class TP5Ejercicio9 {
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
class TP5Ejercicio10 {
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
class TP5Ejercicio11 {
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
class TP5Ejercicio12 {
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
class TP5Ejercicio13 {
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
class TP5Ejercicio14 {
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
class TP5Ejercicio15 {
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

// 16. Programa que lea una variable entera mes y compruebe si el valor
// corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene
// 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el valor
// introducido esté comprendido entre 1 y 12.
class TP5Ejercicio16 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese el número de mes (1-12): ");
      int month = sc.nextInt();

      sc.close();

      switch (month) {
         case 1, 3, 5, 7, 8, 10, 12:
            System.out.println("El mes tiene 31 días.");
            break;
         case 4, 6, 9, 11:
            System.out.println("El mes tiene 30 días.");
            break;
         case 2:
            System.out.println("El mes tiene 28 días.");
            break;
         default:
            System.out.println("Ingrese un número de mes válido.");
            break;
      }
   }
}

// 17. Programa java para convertir una calificación numérica en alfabética.
// El programa lee por teclado una calificación numérica entre 0 y 10 y muestra
// por pantalla su correspondiente calificación alfabética.
// La equivalencia entre la calificación numérica y la alfabética se muestra en
// esta tabla:

// Nota numérica Nota Alfabética
// 0 <= nota < 5 Insuficiente
// 5 <= nota < 6 Suficiente
// 6 <= nota < 7 Bien
// 7 <= nota < 9 Notable
// 9 <= nota <= 10 Sobresaliente

// La calificación numérica que se introduce por teclado debe estar comprendida
// entre 0 y 10 para poder obtener su equivalente calificación alfabética. Si la
// calificación introducida no es válida se muestra un mensaje indicándolo y el
// programa finaliza.
class TP5Ejercicio17 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese una calificación numérica (0-10): ");
      int numericGrade = sc.nextInt();

      sc.close();

      if (numericGrade >= 0 && numericGrade <= 10) {
         if (numericGrade < 5) {
            System.out.println("Calificación Alfabética: Insuficiente");
         } else if (numericGrade < 6) {
            System.out.println("Calificación Alfabética: Suficiente");
         } else if (numericGrade < 7) {
            System.out.println("Calificación Alfabética: Bien");
         } else if (numericGrade < 9) {
            System.out.println("Calificación Alfabética: Notable");
         } else {
            System.out.println("Calificación Alfabética: Sobresaliente");
         }
      } else {
         System.out.println("Ingrese una calificación numérica válida (entre 0 y 10).");
      }
   }
}

// 18. Ejemplo de uso de while: Programa Java que muestre los números del 1 al
// 100 utilizando la instrucción while.
class TP5Ejercicio18 {
   public static void main(String[] args) {
      int i = 1;
      while (i <= 100) {
         System.out.println(i);
         i++;
      }
   }
}

// 19. Ejemplo de uso de do-while. Programa Java que muestre los números del 1
// al 100 utilizando la instrucción do..while.
class TP5Ejercicio19 {
   public static void main(String[] args) {
      int i = 1;
      do {
         System.out.println(i);
         i++;
      } while (i <= 100);
   }
}

// 20. Ejemplo de uso de for. Programa Java que muestre los números del 1 al 100
// utilizando la instrucción for.
class TP5Ejercicio20 {
   public static void main(String[] args) {
      for (int i = 1; i <= 100; i++) {
         System.out.println(i);
      }
   }
}

// 21. Ejemplo de uso de while. Programa Java que muestre los números del 100 al
// 1 utilizando la instrucción while.
class TP5Ejercicio21 {
   public static void main(String[] args) {
      int i = 100;
      while (i >= 1) {
         System.out.println(i);
         i--;
      }
   }
}

// 22. Ejemplo de uso de do-while. Programa Java que muestre los números del 100
// al 1 utilizando la instrucción do..while.
class TP5Ejercicio22 {
   public static void main(String[] args) {
      int i = 100;
      do {
         System.out.println(i);
         i--;
      } while (i >= 1);
   }
}

// 23. Ejemplo de for. Programa Java que muestre los números del 100 al 1
// utilizando la instrucción for.
class TP5Ejercicio23 {
   public static void main(String[] args) {
      for (int i = 100; i >= 1; i--) {
         System.out.println(i);
      }
   }
}

// 24. Escribe un programa Java que pida por teclado el valor de un número N y
// muestre por pantalla todos los números desde 1 hasta N. Resuelve este
// ejercicio de tres formas distintas:
// 1. Utilizando la estructura for
// 2. Utilizando la estructura while
// 3. Utilizando la estructura do .. while
class TP5Ejercicio24 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese un número entero N: ");
      int N = sc.nextInt();

      System.out.println("1. Usando for:");
      for (int i = 1; i <= N; i++) {
         System.out.println(i);
      }

      System.out.println("2. Usando while:");
      int i = 1;
      while (i <= N) {
         System.out.println(i);
         i++;
      }

      System.out.println("3. Usando do..while:");
      i = 1;
      do {
         System.out.println(i);
         i++;
      } while (i <= N);

      sc.close();
   }
}

// 25. Programa que pida que se introduzca por teclado el valor de un número
// entero N y muestre los números desde N hasta 1 ambos incluidos. Se debe
// resolver este ejercicio de tres formas distintas utilizando la estructura
// repetitiva:
// 1. Utilizando la estructura for
// 2. Utilizando la estructura while
// 3. Utilizando la estructura do .. while
class TP5Ejercicio25 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese un número entero N: ");
      int N = sc.nextInt();

      System.out.println("1. Usando for:");
      for (int i = N; i >= 1; i--) {
         System.out.println(i);
      }

      System.out.println("2. Usando while:");
      int i = N;
      while (i >= 1) {
         System.out.println(i);
         i--;
      }

      System.out.println("3. Usando do..while:");
      i = N;
      do {
         System.out.println(i);
         i--;
      } while (i >= 1);

      sc.close();
   }
}

// 26. Programa que pida que se introduzcan dos números enteros por teclado y
// muestre los números desde el menor hasta el mayor de los números
// introducidos. Los dos números introducidos deben ser distintos. Si son
// iguales se mostrará un mensaje indicándolo y se vuelven a introducir.
class TP5Ejercicio26 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese un número entero A: ");
      int A = sc.nextInt();
      System.out.print("Ingrese un número entero B (mayor que A): ");
      int B = sc.nextInt();

      sc.close();

      if (A < B) {
         System.out.println("Números  entre " + A + " y " + B + ":");
         for (int i = A; i <= B; i++) {
            System.out.println(i);
         }
      } else {
         System.out.println("A debe ser menor que B. Por favor, ingrese valores válidos.");
      }
   }
}

// 27. Programa que pida que se introduzcan dos números enteros A y B por
// teclado y muestre los números pares que hay entre A y B. A debe ser menor que
// B. Si no es así se mostrará un mensaje indicándolo y se vuelven a introducir.
class TP5Ejercicio27 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese un número entero A: ");
      int A = sc.nextInt();
      System.out.print("Ingrese un número entero B (mayor que A): ");
      int B = sc.nextInt();

      sc.close();

      if (A < B) {
         System.out.println("Números pares entre " + A + " y " + B + ":");
         for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
               System.out.println(i);
            }
         }
      } else {
         System.out.println("A debe ser menor que B. Por favor, ingrese valores válidos.");
      }
   }
}

// 28. Programa que lea dos números enteros positivos N y M y muestre los
// múltiplos de N que hay desde 1 hasta M. Por ejemplo si N = 4 y M = 500 el
// programa mostrará los múltiplos de 4 desde 1 hasta 500. El valor de N deberá
// ser menor que el valor de M. Si no se introducen valores válidos para N o M
// se mostrará el mensaje correspondiente y se vuelven a pedir.
class TP5Ejercicio28 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N, M;

      do {
         System.out.print("Ingrese un número entero positivo N: ");
         N = sc.nextInt();

         if (N <= 0) {
            System.out.println("Por favor, ingrese un valor válido para N (debe ser positivo).");
         }
      } while (N <= 0);

      do {
         System.out.print("Ingrese un número entero positivo M: ");
         M = sc.nextInt();

         if (M <= 0) {
            System.out.println("Por favor, ingrese un valor válido para M (debe ser positivo).");
         }
      } while (M <= 0);

      if (N < M) {
         System.out.println("Múltiplos de " + N + " desde 1 hasta " + M + ":");
         for (int i = 1; i <= M; i++) {
            if (i % N == 0) {
               System.out.println(i);
            }
         }
      } else {
         System.out.println("N debe ser menor que M para encontrar múltiplos.");
      }

      sc.close();
   }
}

// 29. Programa Java que convierte millas a kilómetros. El programa pide que se
// introduzca una cantidad de millas y calcula y muestra su equivalente en
// Kilómetros. El proceso se repite hasta que se introduzca un 0 como valor para
// las millas.
// 1 Milla equivale a 1.6093 Kilómetros.
// El valor de los KM resultantes se debe mostrar con dos decimales.
// Para pasar de millas a Km realizaremos la operación:
// Km = millas * 1.6093
class TP5Ejercicio29 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      double miles;
      final double MILES_TO_KILOMETERS = 1.6093;

      do {
         System.out.print("Ingrese una cantidad de millas (0 para salir): ");
         miles = sc.nextDouble();

         if (miles != 0) {
            double kilometers = miles * MILES_TO_KILOMETERS;
            System.out.println(miles + " millas son equivalentes a " + kilometers + " kilómetros.");
         }
      } while (miles != 0);

      sc.close();
   }
}
