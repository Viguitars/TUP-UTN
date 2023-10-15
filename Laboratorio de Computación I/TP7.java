import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/* cSpell:disable */

// Ordenar un array de números enteros de menor a mayor.
class TP7Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = { 4, 2, 8, 1, 6, 3 };
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}

// Ordenar un array de números enteros de mayor a menor.
class TP7Ejercicio2 {
    public static void main(String[] args) {
        Integer[] numeros = { 4, 2, 8, 1, 6, 3 };
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println(Arrays.toString(numeros));
    }
}

// Ordenar un array de números flotantes de menor a mayor.
class TP7Ejercicio3 {
    public static void main(String[] args) {
        float[] numeros = { 4.2f, 2.1f, 8.5f, 1.0f, 6.7f, 3.3f };
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}

// Ordenar un array de números flotantes de mayor a menor.
class TP7Ejercicio4 {
    public static void main(String[] args) {
        float[] numeros = { 4.2f, 2.1f, 8.5f, 1.0f, 6.7f, 3.3f };
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
class TP7Ejercicio5 {
    public static void main(String[] args) {
        String[] palabras = { "perro", "gato", "elefante", "ratón", "tigre" };
        Arrays.sort(palabras);
        System.out.println(Arrays.toString(palabras));
    }
}

// Ordenar un array de cadenas de texto en orden inverso.
class TP7Ejercicio6 {
    public static void main(String[] args) {
        String[] palabras = { "perro", "gato", "elefante", "ratón", "tigre" };
        Arrays.sort(palabras, Collections.reverseOrder());
        System.out.println(Arrays.toString(palabras));
    }
}

// Ordenar un array de objetos de una clase personalizada.

// Ordenar un array de objetos de una clase personalizada por un atributo
// específico.

// Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
// burbuja.
class TP7Ejercicio9 {
    public static void main(String[] args) {
        int[] numeros = { 4, 2, 8, 1, 6, 3 };

        System.out.println("Array sin ordenar");
        imprimirArray(numeros);
        burbuja(numeros);
        System.out.println("Ordenamiento de burbuja");
        imprimirArray(numeros);
    }

    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }
}

// Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
// por selección.
class TP7Ejercicio10 {
    public static void main(String[] args) {
        int[] numeros = { 4, 2, 8, 1, 6, 3 };

        System.out.println("Array sin ordenar");
        imprimirArray(numeros);
        seleccion(numeros);
        System.out.println("Ordenamiento por selección");
        imprimirArray(numeros);
    }

    public static void seleccion(int A[]) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) { // tomamos como menor el primero
            menor = A[i]; // de los elementos que quedan por ordenar
            pos = i; // y guardamos su posición
            for (j = i + 1; j < A.length; j++) { // buscamos en el resto
                if (A[j] < menor) { // del array algún elemento
                    menor = A[j]; // menor que el actual
                    pos = j;
                }
            }
            if (pos != i) { // si hay alguno menor se intercambia
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }
}

// Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
// por inserción.
class TP7Ejercicio11 {
    public static void main(String[] args) {
        int[] numeros = { 4, 2, 8, 1, 6, 3 };

        System.out.println("Array sin ordenar");
        imprimirArray(numeros);
        insercionDirecta(numeros);
        System.out.println("Ordenamiento por inserción directa");
        imprimirArray(numeros);
    }

    public static void insercionDirecta(int A[]) {
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++) { // desde el segundo elemento hasta
            aux = A[p]; // el final, guardamos el elemento y
            j = p - 1; // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < A[j])) { // mientras queden posiciones y el
                                               // valor de aux sea menor que los
                A[j + 1] = A[j]; // de la izquierda, se desplaza a
                j--; // la derecha
            }
            A[j + 1] = aux; // colocamos aux en su sitio
        }
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }
}

// Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
// por mezcla.
class TP7Ejercicio12 {
    public static void main(String[] args) {
        int[] numeros = { 4, 2, 8, 1, 6, 3 };

        System.out.println("Array sin ordenar");
        imprimirArray(numeros);
        mergeSort(numeros, 0, numeros.length - 1);
        System.out.println("Ordenamiento por mezcla o merge");
        imprimirArray(numeros);
    }

    public static void mergeSort(int A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergeSort(A, izq, m);
            mergeSort(A, m + 1, der);
            merge(A, izq, m, der);
        }
    }

    public static void merge(int A[], int izq, int m, int der) {
        int i, j, k;
        int[] B = new int[A.length]; // array auxiliar
        for (i = izq; i <= der; i++) // copia ambas mitades en el array auxiliar
            B[i] = A[i];

        i = izq;
        j = m + 1;
        k = izq;

        while (i <= m && j <= der) // copia el siguiente elemento más grande
            if (B[i] <= B[j])
                A[k++] = B[i++];
            else
                A[k++] = B[j++];

        while (i <= m) // copia los elementos que quedan de la
            A[k++] = B[i++]; // primera mitad (si los hay)
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }
}

// Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
// shell.
class TP7Ejercicio13 {
    public static void main(String[] args) {
        int[] numeros = { 4, 2, 8, 1, 6, 3 };

        System.out.println("Array sin ordenar");
        imprimirArray(numeros);
        shell(numeros);
        System.out.println("Ordenamiento shell");
        imprimirArray(numeros);
    }

    public static void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) { // Mientras se intercambie algún elemento
                cambios = false;
                for (i = salto; i < A.length; i++) // se da una pasada
                {
                    if (A[i - salto] > A[i]) { // y si están desordenados
                        aux = A[i]; // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true; // y se marca como cambio.
                    }
                }
            }
        }
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
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
class TP7Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];

        System.out.println("Ingrese 20 números enteros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("\n¿Cómo desea ordenar el array? \n1. ASCENDENTE \n2. DESCENDENTE");
        String orden = sc.next();

        System.out.println("\n¿Qué método de ordenamiento desea usar? \n1. Inserción \n2. Burbuja \n3. Selección");
        String metodo = sc.next();

        if (orden.equals("1")) {
            if (metodo.equals("1")) {
                ordenarInsercionAscendente(array);
            } else if (metodo.equals("2")) {
                ordenarBurbujaAscendente(array);
            } else if (metodo.equals("3")) {
                ordenarSeleccionAscendente(array);
            }
        } else if (orden.equals("1")) {
            if (metodo.equals("1")) {
                ordenarInsercionDescendente(array);
            } else if (metodo.equals("2")) {
                ordenarBurbujaDescendente(array);
            } else if (metodo.equals("3")) {
                ordenarSeleccionDescendente(array);
            }
        }

        sc.close();

        System.out.println("Array ordenado:");
        imprimirArray(array);
    }

    public static void ordenarInsercionAscendente(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int actual = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > actual) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = actual;
        }
    }

    public static void ordenarInsercionDescendente(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int actual = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < actual) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = actual;
        }
    }

    public static void ordenarBurbujaAscendente(int[] array) {
        int n = array.length;
        boolean intercambio;
        do {
            intercambio = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    intercambio = true;
                }
            }
            n--;
        } while (intercambio);
    }

    public static void ordenarBurbujaDescendente(int[] array) {
        int n = array.length;
        boolean intercambio;
        do {
            intercambio = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] < array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    intercambio = true;
                }
            }
            n--;
        } while (intercambio);
    }

    public static void ordenarSeleccionAscendente(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void ordenarSeleccionDescendente(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
