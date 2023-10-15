import java.util.Scanner;
import java.util.Arrays;

// Declaración e inicialización

// Declarar un array de 10 enteros e inicializar con los valores de los 10
// primeros números naturales.
class EjercicioArray1 {
    public static void main(String[] args) {

        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("\nLos primeros 10 números naturales son:");

        for (int n : num) {
            System.out.println(n);
        }
    }
}

// Declarar un array de 10 números reales e inicializar con los valores de los
// 10 primeros números primos.
class EjercicioArray2 {
    public static void main(String[] args) {

        double[] num = { 2.0, 3.0, 5.0, 7.0, 11.0, 13.0, 17.0, 19.0, 23.0, 29.0 };

        System.out.println("\nLos primeros 10 números primos son:");

        for (double n : num) {
            System.out.printf("%.0f %n", n);
        }
    }
}

// Declarar un array bidimensional de 10 filas y 10 columnas de números enteros.
class EjercicioArray3 {
    public static void main(String[] args) {
        int i, j;
        int[][] arrayBidimensional = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 } };

        System.out.println("\nArray Bidimensional:");

        for (i = 0; i < arrayBidimensional.length; i++) {
            for (j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.println("array[" + i + "][" + j + "] = " + arrayBidimensional[i][j]);
            }
        }
    }
}

// Declarar un array multidimensional de 3 dimensiones de números reales.
class EjercicioArray4 {
    public static void main(String[] args) {
        double[][][] arrayMultidimensional = {
                { { 1.1, 1.2, 1.3 }, { 1.4, 1.5, 1.6 }, { 1.7, 1.8, 1.9 } },
                { { 2.1, 2.2, 2.3 }, { 2.4, 2.5, 2.6 }, { 2.7, 2.8, 2.9 } },
                { { 3.1, 3.2, 3.3 }, { 3.4, 3.5, 3.6 }, { 3.7, 3.8, 3.9 } }
        };
        for (int i = 0; i < arrayMultidimensional.length; i++) {
            for (int j = 0; j < arrayMultidimensional[i].length; j++) {
                for (int k = 0; k < arrayMultidimensional[i][j].length; k++) {
                    System.out.println("array[" + i + "][" + j + "][" + k + "] = " + arrayMultidimensional[i][j][k]);
                }
            }
        }

    }
}

// Lectura y escritura

// Ingresar por teclado los valores de un array de 10 enteros.
class EjercicioArray5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = new int[10];

        System.out.println("\nIngrese 10 valores enteros:");
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = sc.nextInt();
        }

        System.out.println("\nValores ingresados en el array de enteros:");
        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i] + " ");
        }

        sc.close();
    }
}

// Ingresar por teclado los valores de un array de 10 números reales.
class EjercicioArray6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] reales = new double[10];

        System.out.println("\nIngrese 10 valores de números reales:");
        for (int i = 0; i < reales.length; i++) {
            reales[i] = sc.nextDouble();
        }

        System.out.println("\nValores ingresados en el array de números reales:");
        for (int i = 0; i < 10; i++) {
            System.out.println(reales[i] + " ");
        }

        sc.close();
    }
}

// Leer los datos de un array de caracteres y mostrarlos por pantalla.
class EjercicioArray7 {
    public static void main(String[] args) {
        char[] caracteres = { 'H', 'o', 'l', 'a', ' ', 'M', 'u', 'n', 'd', 'o' };

        System.out.println("\nValores del array de caracteres:");
        for (char c : caracteres) {
            System.out.print(c);
        }
    }
}

// Leer los datos de un array de booleanos y mostrarlos por pantalla.
class EjercicioArray8 {
    public static void main(String[] args) {
        boolean[] booleanos = { true, false, true, false, true, true, false, false, true, false };

        System.out.println("\nValores del array de booleanos:");
        for (boolean b : booleanos) {
            System.out.println(b);
        }
    }
}

// Operaciones aritméticas

// Sumar los elementos de un array de 10 enteros.
class EjercicioArray9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = new int[10];
        int suma = 0;

        for (int i = 0; i < enteros.length; i++) {
            System.out.print("Ingrese un número entero: ");
            enteros[i] = sc.nextInt();
            suma += enteros[i];
        }

        System.out.println("\nLa suma de los elementos del array de enteros es: " + suma);
        sc.close();
    }
}

// Multiplicar los elementos de un array de 10 números reales.
class EjercicioArray10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] reales = new double[10];
        double producto = 1.0;

        for (int i = 0; i < reales.length; i++) {
            System.out.print("Ingrese un número real: ");
            reales[i] = sc.nextDouble();
            producto *= reales[i];
        }

        System.out.println("\nEl producto de los elementos del array de números reales es: " + producto);
        sc.close();
    }
}

// Ordenar un array de 10 enteros de menor a mayor.
class EjercicioArray11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = new int[10];

        for (int i = 0; i < enteros.length; i++) {
            System.out.print("Ingrese un número entero: ");
            enteros[i] = sc.nextInt();
        }

        Arrays.sort(enteros);

        System.out.println("\nArray ordenado de menor a mayor: " + Arrays.toString(enteros));
        sc.close();
    }
}

// Ordenar un array de 10 cadenas de forma alfabética.
class EjercicioArray12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cadenas = new String[10];

        for (int i = 0; i < cadenas.length; i++) {
            System.out.print("Ingrese una cadena de texto: ");
            cadenas[i] = sc.next();
        }

        Arrays.sort(cadenas);

        System.out.println("\nArray ordenado alfabéticamente: " + Arrays.toString(cadenas));
        sc.close();
    }
}

// Ejercicios adicionales

// Implementar un método que cuente el número de elementos pares en un array de
// enteros.
class EjercicioArray13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = new int[10];

        for (int i = 0; i < enteros.length; i++) {
            System.out.print("Ingrese un número entero: ");
            enteros[i] = sc.nextInt();
        }

        int contadorPares = contarPares(enteros);
        System.out.println("\nNúmero de elementos pares: " + contadorPares);

        sc.close();
    }

    public static int contarPares(int[] enteros) {
        int contador = 0;
        for (int num : enteros) {
            if (num % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}

// Implementar un método que cuente el número de elementos mayores que 10 en un
// array de números reales.
class EjercicioArray14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] reales = new double[10];

        for (int i = 0; i < reales.length; i++) {
            System.out.println("Ingrese un número real: ");
            reales[i] = sc.nextDouble();
        }

        int resultado = mayoresDeDiez(reales);

        System.out.println("\nNúmero de elementos mayores que 10: " + resultado);

        sc.close();
    }

    public static int mayoresDeDiez(double[] reales) {
        int contador = 0;
        for (double num : reales) {
            if (num > 10) {
                contador++;
            }
        }
        return contador;
    }
}

// Implementar un método que calcule la suma de los elementos de un array de
// enteros que sean múltiplos de 3.
class EjercicioArray15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = new int[10];

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Ingrese un número entero: ");
            enteros[i] = sc.nextInt();
        }

        int resultado = sumaMultiplosDe3(enteros);

        System.out.println("\nLa suma de los elementos múltiplos de 3 es: " + resultado);

        sc.close();
    }

    public static int sumaMultiplosDe3(int[] enteros) {
        int suma = 0;
        for (int num : enteros) {
            if (num % 3 == 0) {
                suma += num;
            }
        }
        return suma;
    }
}

// Implementar un método que encuentre el elemento máximo de un array de
// enteros.
class EjercicioArray16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = new int[10];

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Ingrese un número entero:");
            enteros[i] = sc.nextInt();
        }

        int resultado = maxNum(enteros);

        System.out.println("El elemento máximo es: " + resultado);

        sc.close();
    }

    public static int maxNum(int[] enteros) {
        int max = 0;
        for (int num : enteros) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

// Implementar un método que encuentre el elemento mínimo de un array de
// cadenas.
class EjercicioArray17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cadena = new String[5];

        for (int i = 0; i < cadena.length; i++) {
            System.out.println("Ingrese una cadena de texto:");
            cadena[i] = sc.next();
        }

        String resultado = minCadena(cadena);

        System.out.println("La menor cadena es: " + resultado + " con " + (resultado.length()) + " letras.");

        sc.close();
    }

    public static String minCadena(String[] cadena) {
        String minString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam consequat porttitor odio. Vestibulum cursus augue enim, pulvinar tempus ipsum molestie ut. Donec efficitur sollicitudin sem, ut dignissim est porta quis. Aliquam erat volutpat. Ut semper semper est, eu pellentesque libero vestibulum sed. Vivamus blandit ipsum felis, id consequat tortor lacinia nec. Sed vulputate leo non leo gravida, tristique finibus neque consectetur. Aliquam erat nibh, fermentum pharetra finibus in, tincidunt vel urna. Aenean vel leo et urna dictum tempor. Donec facilisis aliquet tortor non consectetur. Proin mattis finibus purus, at tempor massa accumsan non. Vivamus eleifend ex eu ornare tempor. Aliquam tincidunt molestie urna a maximus. Suspendisse accumsan neque tortor, et lobortis erat vulputate id. Duis laoreet ac orci sed accumsan. Nam tristique mollis odio.";

        for (String str : cadena) {
            if (str.length() < minString.length()) {
                minString = str;
            }
        }
        return minString;
    }
}

// Implementar un método que copie un array de enteros a otro array de enteros.
class EjercicioArray18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array_original = new int[10];

        for (int i = 0; i < array_original.length; i++) {
            System.out.print("Ingrese un número entero para el array original: ");
            array_original[i] = sc.nextInt();
        }

        System.out.println("\nArray copiado correctamente.");
        System.out.println("\nArray Original");
        mostrarArray(array_original);
        System.out.println("Array Copiado");
        mostrarArray(copiarArray(array_original));

        sc.close();
    }

    public static int[] copiarArray(int[] array_original) {
        int[] array_copia = new int[array_original.length];

        System.arraycopy(array_original, 0, array_copia, 0, 10);

        return array_copia;

    }

    public static void mostrarArray(int[] array) {
        System.out.println("Dirección de memoria: " + array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }
}
