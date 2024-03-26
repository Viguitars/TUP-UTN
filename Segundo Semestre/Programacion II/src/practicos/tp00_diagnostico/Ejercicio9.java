package practicos.tp00_diagnostico;

import java.util.Scanner;

/**
 * Crea un programa en Java que permita al usuario sumar dos matrices de tamaño
 * NxM. El programa debe solicitar al usuario que ingrese las dimensiones de las
 * matrices y luego ingresar los elementos de cada matriz. Después de eso, debe
 * calcular la suma de las dos matrices (resultando una tercera matriz con la
 * suma de los elementos de igual posición de las matrices operando) e imprimir
 * el resultado.
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for matrices: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns for matrices: ");
        int columns = sc.nextInt();

        int[][] matrix1 = inputMatrix("first", rows, columns, sc);
        int[][] matrix2 = inputMatrix("second", rows, columns, sc);

        int[][] resultMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Resultant Matrix:");
        printMatrix(resultMatrix);

    }

    public static int[][] inputMatrix(String ordinal, int rows, int columns,
                                      Scanner scanner) {
        System.out.println("Enter elements of " + ordinal + " matrix:");
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
