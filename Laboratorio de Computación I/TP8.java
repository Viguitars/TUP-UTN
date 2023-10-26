import java.util.Random;
import java.util.Scanner;

// Escribir un método para sumar dos matrices de enteros y devolver la matriz
// resultante.
class TP8Ejercicio1 {
    public static void main(String[] args) {

        final int FILAS = 5, COLUMNAS = 4;

        int[][] matrizA = new int[FILAS][COLUMNAS];
        int[][] matrizB = new int[FILAS][COLUMNAS];

        cargarMatriz(matrizA);
        cargarMatriz(matrizB);

        System.out.println("Matriz A:");
        mostrarMatriz(matrizA);

        System.out.println("Matriz B:");
        mostrarMatriz(matrizB);

        int[][] matrizSuma = sumarMatrices(matrizA, matrizB);

        System.out.println("Matriz A + Matriz B:");
        mostrarMatriz(matrizSuma);

    }

    public static void cargarMatriz(int[][] matriz) {
        Random rnd = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rnd.nextInt(99) + 1;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("[" + i + "][" + j + "]= " + (matriz[i][j]));
            }
        }
    }

    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] matrizSuma = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizSuma;
    }

}

// Implementar un método para multiplicar dos matrices de enteros y devolver el
// resultado.
class TP8Ejercicio2 {
    public static void main(String[] args) {

        final int FILAS = 5, COLUMNAS = 4;

        int[][] matrizA = new int[FILAS][COLUMNAS];
        int[][] matrizB = new int[FILAS][COLUMNAS];

        cargarMatriz(matrizA);
        cargarMatriz(matrizB);

        System.out.println("Matriz A:");
        mostrarMatriz(matrizA);

        System.out.println("Matriz B:");
        mostrarMatriz(matrizB);

        int[][] matrizProducto = multiplicarMatrices(matrizA, matrizB);

        System.out.println("Matriz A * Matriz B:");
        mostrarMatriz(matrizProducto);

    }

    public static void cargarMatriz(int[][] matriz) {
        Random rnd = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rnd.nextInt(99) + 1;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("[" + i + "][" + j + "]= " + (matriz[i][j]));
            }
        }
    }

    public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] matrizProducto = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizProducto[i][j] = matrizA[i][j] * matrizB[i][j];
            }
        }
        return matrizProducto;
    }

}

// Crear una función que calcule la transpuesta de una matriz.
// La matriz transpuesta es una matriz obtenida al intercambiar las filas por
// columnas de una matriz dada. Esto significa que los elementos que estaban en
// la fila i y columna j de la matriz original estarán en la fila j y columna i
// de la matriz transpuesta. La notación típica para denotar la matriz
// transpuesta de A es A^T.
class TP8Ejercicio3 {
    public static void main(String[] args) {

        final int FILAS = 5, COLUMNAS = 4;

        int matriz[][] = new int[FILAS][COLUMNAS];

        cargarMatriz(matriz);

        System.out.println("\nMatriz:");
        mostrarMatriz(matriz);

        int[][] matrizTranspuesta = obtenerMatrizTranspuesta(matriz);
        System.out.println("\nSu matriz transpuesta es:");
        mostrarMatriz(matrizTranspuesta);

    }

    public static void cargarMatriz(int[][] matriz) {
        Random rnd = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rnd.nextInt(99) + 1;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            System.out.print("[");
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static int[][] obtenerMatrizTranspuesta(int[][] matriz) {
        int filas = matriz[0].length;
        int columnas = matriz.length;
        int[][] matrizTranspuesta = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[i][j] = matriz[j][i];
            }
        }
        return matrizTranspuesta;
    }
}

// Desarrollar un método para verificar si una matriz es simétrica (igual a su
// transpuesta).
class TP8Ejercicio4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int filas = rnd.nextInt(4) + 2;
        int columnas = rnd.nextInt(4) + 2;

        int matriz[][] = new int[filas][columnas];

        cargarMatriz(matriz);

        System.out.println("\nMatriz:");
        mostrarMatriz(matriz);

        int[][] matrizTranspuesta = obtenerMatrizTranspuesta(matriz);
        
        System.out.println("\nSu matriz transpuesta es:");
        mostrarMatriz(matrizTranspuesta);

        boolean esSimétrica = esMatrizSimétrica(matriz, matrizTranspuesta);

        if (esSimétrica) {
            System.out.println("\nLa Matriz es simétrica.");
        } else {
            System.out.println("\nLa Matriz no es simétrica.");
        }

    }

    public static void cargarMatriz(int[][] matriz) {
        Random rnd = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rnd.nextInt(99) + 1;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            System.out.print("[");
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static int[][] obtenerMatrizTranspuesta(int[][] matriz) {
        int filas = matriz[0].length;
        int columnas = matriz.length;
        int[][] matrizTranspuesta = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[i][j] = matriz[j][i];
            }
        }
        return matrizTranspuesta;
    }

    public static boolean esMatrizSimétrica(int[][] matriz, int[][] matrizTranspuesta) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != matrizTranspuesta[i][j]) {
                    return false;
                }
            }

        }

        return true;

    }
}

// Escribir un método que calcule el producto escalar de un vector (matriz
// unidimensional) por un número.

// Implementar una función que calcule la suma de todos los elementos de una
// matriz.

// Desarrollar un método para encontrar el elemento máximo en una matriz y su
// posición.

// Crear una función que devuelva la suma de una fila específica de una matriz.

// Implementar una función que determine si una matriz es diagonal (todos los
// elementos fuera de la diagonal principal son cero).

// Matriz Diagonal:

// Una matriz diagonal es una matriz cuadrada en la que todos los elementos
// fuera de la diagonal principal son iguales a 0. Los elementos en la diagonal
// principal pueden ser cualquier número, no necesariamente 1.

// Por ejemplo, una matriz diagonal 3x3 podría ser:

// D = | 2 0 0 |
// | 0 5 0 |
// | 0 0 9 |

// Crear una función que genere una matriz identidad de tamaño n.

// Matriz Identidad (o Matriz Unitaria):

// La matriz identidad, denotada generalmente como "I" o "I_n" (donde "n"
// representa el tamaño de la matriz cuadrada), es una matriz cuadrada especial
// en la que todos los elementos de la diagonal principal son iguales a 1 y
// todos los demás elementos son iguales a 0.

// Por ejemplo, la matriz identidad 3x3 sería:

// I_3 = | 1 0 0 |
// | 0 1 0 |
// | 0 0 1 |

// Escribir un método para contar la cantidad de elementos pares e impares en
// una matriz.

// Implementar una función que rote una matriz 90 grados en sentido horario.

// Desarrollar un método para encontrar el número de veces que aparece un valor
// específico en una matriz.

// Crear una función que invierta el orden de las filas en una matriz.

// Escribir un método para sumar todas las diagonales de una matriz cuadrada.

// Implementar una función que verifique si una matriz es ortogonal (su
// transpuesta es igual a su inversa).

// Desarrollar un método para encontrar el valor mínimo en cada fila de una
// matriz y devolverlos en un arreglo.

// Crear una función que calcule el producto de matrices de diferentes tamaños,
// si es posible; de lo contrario, devolver una matriz nula.
