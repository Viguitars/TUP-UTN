import java.util.Scanner;
import java.util.Arrays;


// Declaración e inicialización

// Declarar un array de 10 enteros e inicializarlo con los valores de los 10
// primeros números naturales.
class Ejercicio_1 {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Los primeros 10 números naturales son:");

        for (int n : num) {
            System.out.println(n);
        }
    }
}

// Declarar un array de 10 números reales e inicializarlo con los valores de los
// 10 primeros números primos.
class Ejercicio_2 {
    public static void main(String[] args) {

        double[] num = {2.0, 3.0, 5.0, 7.0, 11.0, 13.0, 17.0, 19.0, 23.0, 29.0};

        System.out.println("Los primeros 10 números primos son:");

        for (double n : num) {
            System.out.printf("%.0f %n", n);
        }
    }
}

// Declarar un array bidimensional de 10 filas y 10 columnas de números enteros.
class Ejercicio_3 {
    public static void main(String[] args) {
        int i, j, count = 1;
        int[][] num = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}};

        System.out.println("Array Bidimensional:");


        for (i = 0; i < num.length; i++) {
            System.out.println("Matriz " + count + ":");
            for (j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
            count++;
        }
    }
}

// Declarar un array multidimensional de 3 dimensiones de números reales.
// double[][][] arreglo3D = new double[3][3][3];
class Ejercicio_4 {
    public static void main(String[] args) {
        double[][][] num = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};

    }
}

// Lectura y escritura

// Ingresar por teclado los valores de un array de 10 enteros.
class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = new int[10];

        System.out.println("Ingrese 10 valores enteros:");
        for (int i = 0; i < 10; i++) {
            enteros[i] = sc.nextInt();
        }

        System.out.println("Valores ingresados en el array de enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print(enteros[i] + " ");
        }

        sc.close();
    }
}

// Ingresar por teclado los valores de un array de 10 números reales.
class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Ingrese 10 valores de números reales:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextDouble();
        }

        System.out.println("Valores ingresados en el array de números reales:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}

// Leer los datos de un array de caracteres y mostrarlos por pantalla.
class Ejercicio_7 {
    public static void main(String[] args) {
        char[] caracteres = {'H', 'o', 'l', 'a', ' ', 'M', 'u', 'n', 'd', 'o'};

        System.out.println("Valores del array de caracteres:");
        for (char c : caracteres) {
            System.out.print(c);
        }
    }
}

// Leer los datos de un array de booleanos y mostrarlos por pantalla.
class Ejercicio_8 {
    public static void main(String[] args) {
        boolean[] booleanos = {true, false, true, false, true, true, false, false, true, false};

        System.out.println("Valores del array de booleanos:");
        for (boolean b : booleanos) {
            System.out.println(b);
        }
    }
}

// Operaciones aritméticas

// Sumar los elementos de un array de 10 enteros.
class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = new int[10];
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            enteros[i] = sc.nextInt();
            suma += enteros[i];
        }

        System.out.println("La suma de los elementos del array de enteros es: " + suma);
        sc.close();
    }
}

// Multiplicar los elementos de un array de 10 números reales.
class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double producto = 1.0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número real: ");
            numbers[i] = sc.nextDouble();
            producto *= numbers[i];
        }

        System.out.println("El producto de los elementos del array de números reales es: " + producto);
        sc.close();
    }
}

// Ordenar un array de 10 enteros de menor a mayor.
class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            enteros[i] = sc.nextInt();
        }

        Arrays.sort(enteros);

        System.out.println("Array ordenado de menor a mayor: " + Arrays.toString(enteros));
        sc.close();
    }
}

// Ordenar un array de 10 cadenas de forma alfabética.
class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cadenas = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese una cadena: ");
            cadenas[i] = sc.next();
        }

        Arrays.sort(cadenas);

        System.out.println("Array ordenado alfabéticamente: " + Arrays.toString(cadenas));
        sc.close();
    }
}

// Ejercicios adicionales

// Implementar un método que cuente el número de elementos pares en un array de
// enteros.
class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = new int[10];
        int contadorPares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            enteros[i] = sc.nextInt();
            if (enteros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Número de elementos pares: " + contadorPares);
        sc.close();
    }
}

// Implementar un método que cuente el número de elementos mayores que 10 en un
// array de números reales.
class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número real: ");
            numbers[i] = sc.nextDouble();
            if (numbers[i] > 10) {
                count++;
            }
        }

        System.out.println("Número de elementos mayores que 10: " + count);
        sc.close();
    }
}

// Implementar un método que calcule la suma de los elementos de un array de
// enteros que sean múltiplos de 3.
class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = new int[10];
        int sumaMultiplosDe3 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            enteros[i] = sc.nextInt();
            if (enteros[i] % 3 == 0) {
                sumaMultiplosDe3 += enteros[i];
            }
        }

        System.out.println("La suma de elementos múltiplos de 3 es: " + sumaMultiplosDe3);
        sc.close();
    }
}


// Implementar un método que encuentre el elemento máximo de un array de
// enteros.
class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            numbers[i] = sc.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("El elemento máximo es: " + max);
        sc.close();
    }
}

// Implementar un método que encuentre el elemento mínimo de un array de
// cadenas.
class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[10];
        String min = "";

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese una cadena de texto: ");
            strings[i] = sc.nextLine();
            if (min.isEmpty() || strings[i].compareTo(min) < 0) {
                min = strings[i];
            }
        }

        System.out.println("El elemento mínimo es: " + min);
        sc.close();
    }
}

// Implementar un método que copie un array de enteros a otro array de enteros.
class Ejercicio_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array_original = new int[10];
        int[] array_copia = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero para el array original: ");
            array_original[i] = sc.nextInt();
        }

        System.arraycopy(array_original, 0, array_copia, 0, 10);

        System.out.println("Array copiado correctamente.");

        sc.close();
    }
}
