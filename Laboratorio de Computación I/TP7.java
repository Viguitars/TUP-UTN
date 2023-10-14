import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

// Ordenar un array de números enteros de menor a mayor.
class Ejercicio_1 {
    public static void main(String[] args) {
        int[] numeros = {4, 2, 8, 1, 6, 3};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}

// Ordenar un array de números enteros de mayor a menor.
class Ejercicio_2 {
    public static void main(String[] args) {
        Integer[] numeros = {4, 2, 8, 1, 6, 3};
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println(Arrays.toString(numeros));
    }
}

// Ordenar un array de números flotantes de menor a mayor.
class Ejercicio_3 {
    public static void main(String[] args) {
        float[] numeros = {4.2f, 2.1f, 8.5f, 1.0f, 6.7f, 3.3f};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}

// Ordenar un array de números flotantes de mayor a menor.
class Ejercicio_4 {
    public static void main(String[] args) {
        float[] numeros = {4.2f, 2.1f, 8.5f, 1.0f, 6.7f, 3.3f};
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length / 2; i++) {
            float temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numeros));
    }
}

// Ordenar un array de cadenas de texto en orden alfabético.
class Ejercicio_5 {
    public static void main(String[] args) {
        String[] palabras = {"perro", "gato", "elefante", "ratón", "tigre"};
        Arrays.sort(palabras);
        System.out.println(Arrays.toString(palabras));
    }
}

// Ordenar un array de cadenas de texto en orden inverso.
class Ejercicio_6 {
    public static void main(String[] args) {
        String[] palabras = {"perro", "gato", "elefante", "ratón", "tigre"};
        Arrays.sort(palabras, Collections.reverseOrder());
        System.out.println(Arrays.toString(palabras));
    }
}

// Ordenar un array de objetos de una clase personalizada.

// Ordenar un array de objetos de una clase personalizada por un atributo
// específico.

// Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
// burbuja.
class Ejercicio_9 {
    public static void main(String[] args) {
        int[] numeros = {4, 2, 8, 1, 6, 3};
        int n = numeros.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numeros));
    }
}

// Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
// por selección.
class Ejercicio_10 {
    public static void main(String[] args) {
        int[] numeros = {4, 2, 8, 1, 6, 3};
        int n = numeros.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros[j] < numeros[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numeros[minIndex];
            numeros[minIndex] = numeros[i];
            numeros[i] = temp;
        }

        System.out.println(Arrays.toString(numeros));
    }
}

// Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
// por inserción.
class Ejercicio_11 {
    public static void main(String[] args) {
        int[] numeros = {4, 2, 8, 1, 6, 3};
        int n = numeros.length;

        for (int i = 1; i < n; i++) {
            int key = numeros[i];
            int j = i - 1;

            while (j >= 0 && numeros[j] > key) {
                numeros[j + 1] = numeros[j];
                j = j - 1;
            }

            numeros[j + 1] = key;
        }

        System.out.println(Arrays.toString(numeros));
    }
}

// Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
// por mezcla.
class Ejercicio_12 {
    public static void main(String[] args) {
        int[] numeros = {4, 2, 8, 1, 6, 3};
        mergeSort(numeros);
        System.out.println(Arrays.toString(numeros));
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;

        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < nL) {
            arr[k++] = left[i++];
        }

        while (j < nR) {
            arr[k++] = right[j++];
        }
    }
}

// Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
// shell.
class Ejercicio_13 {
    public static void main(String[] args) {
        int[] numeros = {4, 2, 8, 1, 6, 3};
        shellSort(numeros);
        System.out.println(Arrays.toString(numeros));
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
    }
}

// Codifique un algoritmo que permita cargar un array de una dimensión de 20
// elementos enteros. Finalizada la carga de los 20 elementos el programa debe
// solicitar como se desea ordenar el array ASCENDENTE O DESCENDENTE y que
// método de ordenamiento aplicar (inserción, burbuja, selección), según las
// opciones elegidas aplique el algoritmos fundamental de ordenamiento que
// corresponda. Muestre por pantalla el array original desordenado y su
// resultante ordenado según las opciones elegidas.
class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear un array de 20 elementos enteros
        int[] numeros = new int[20];

        // Ingresar los valores en el array
        System.out.println("Ingrese los 20 elementos enteros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Solicitar método de ordenamiento y dirección
        System.out.print("¿Cómo desea ordenar el array? (ASCENDENTE/DESCENDENTE): ");
        String orden = sc.next().toUpperCase();

        System.out.print("Elija el método de ordenamiento (INSERCION/BURBUJA/SELECCION): ");
        String metodo = sc.next().toUpperCase();

        // Ordenar el array según la elección del usuario
        if (orden.equals("ASCENDENTE")) {
            switch (metodo) {
                case "INSERCION" -> ordenarPorInsercionAscendente(numeros);
                case "BURBUJA" -> ordenarPorBurbujaAscendente(numeros);
                case "SELECCION" -> ordenarPorSeleccionAscendente(numeros);
            }
        } else if (orden.equals("DESCENDENTE")) {
            switch (metodo) {
                case "INSERCION" -> ordenarPorInsercionDescendente(numeros);
                case "BURBUJA" -> ordenarPorBurbujaDescendente(numeros);
                case "SELECCION" -> ordenarPorSeleccionDescendente(numeros);
            }
        }

        // Mostrar el array ordenado
        System.out.println("Array original: ");
        imprimirArray(numeros);
    }

    // Método para imprimir un array
    public static void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Métodos de ordenamiento (ascendente)
    public static void ordenarPorInsercionAscendente(int[] arr) {
        // Implementa el algoritmo de ordenamiento por inserción
        // …
    }

    public static void ordenarPorBurbujaAscendente(int[] arr) {
        // Implementa el algoritmo de ordenamiento burbuja (ascendente)
        // ...
    }

    public static void ordenarPorSeleccionAscendente(int[] arr) {
        // Implementa el algoritmo de ordenamiento por selección (ascendente)
        // …
    }

    // Métodos de ordenamiento (descendente)
    public static void ordenarPorInsercionDescendente(int[] arr) {
        // Implementa el algoritmo de ordenamiento por inserción (descendente)
        // …
    }

    public static void ordenarPorBurbujaDescendente(int[] arr) {
        // Implementa el algoritmo de ordenamiento burbuja (descendente)
        // ...
    }

    public static void ordenarPorSeleccionDescendente(int[] arr) {
        // Implementa el algoritmo de ordenamiento por selección (descendente)
        // …
    }
}
