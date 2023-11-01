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

        System.out.println("\nMatriz A:");
        mostrarMatriz(matrizA);

        System.out.println("\nMatriz B:");
        mostrarMatriz(matrizB);

        int[][] matrizSuma = sumarMatrices(matrizA, matrizB);

        System.out.println("\nMatriz A + Matriz B:");
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

        System.out.println("\nMatriz A:");
        mostrarMatriz(matrizA);

        System.out.println("\nMatriz B:");
        mostrarMatriz(matrizB);

        int[][] matrizProducto = multiplicarMatrices(matrizA, matrizB);

        System.out.println("\nMatriz A * Matriz B:");
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
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
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
class TP8Ejercicio5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int filas = rnd.nextInt(10) + 1;
        int vector[] = new int[filas];
        int escalar = rnd.nextInt(10);

        cargarVector(vector);

        System.out.println("\nVector:");
        mostrarVector(vector);

        int[] vectorProductoEscalar = productoEscalar(vector, escalar);

        System.out.println("\nProducto escalar del vector con número " + escalar + ":");
        mostrarVector(vectorProductoEscalar);

    }

    public static void cargarVector(int[] vector) {
        Random rnd = new Random();
        int filas = vector.length;

        for (int i = 0; i < filas; i++) {
            vector[i] = rnd.nextInt(99) + 1;
        }
    }

    public static void mostrarVector(int[] vector) {
        int filas = vector.length;

        System.out.print("[");
        for (int i = 0; i < filas; i++) {
            System.out.print(vector[i]);
            if (i < filas - 1) {
                System.out.print(", ");
            }

        }
        System.out.println("]");
    }

    public static int[] productoEscalar(int[] vector, int escalar) {
        int[] resultado = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i] * escalar;
        }

        return resultado;
    }

}

// Implementar una función que calcule la suma de todos los elementos de una
// matriz.
class TP8Ejercicio6 {
    public static void main(String[] args) {

        final int FILAS = 5, COLUMNAS = 4;
        int[][] matriz = new int[FILAS][COLUMNAS];

        cargarMatriz(matriz);

        System.out.println("Matriz:");
        mostrarMatriz(matriz);

        int suma = sumaMatriz(matriz);

        System.out.println("Suma de Matriz: " + suma);

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

    public static int sumaMatriz(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        return suma;
    }

}

// Desarrollar un método para encontrar el elemento máximo en una matriz y su
// posición.
class TP8Ejercicio7 {
    public static void main(String[] args) {

        final int FILAS = 5, COLUMNAS = 4;
        int[][] matriz = new int[FILAS][COLUMNAS];

        cargarMatriz(matriz);

        System.out.println("Matriz:");
        mostrarMatriz(matriz);

        int[] resultado = encontrarMaximo(matriz);
        int maximo = resultado[0];
        int fila = resultado[1];
        int columna = resultado[2];

        System.out.println(
                "\nEl elemento máximo es " + maximo + " y se encuentra en la fila " + fila + " y columna " + columna);

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

    public static int[] encontrarMaximo(int[][] matriz) {
        int maximo = matriz[0][0];
        int filaMaximo = 0;
        int columnaMaximo = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    filaMaximo = i;
                    columnaMaximo = j;
                }
            }
        }

        int[] resultado = { maximo, filaMaximo, columnaMaximo };
        return resultado;
    }

}

// Crear una función que devuelva la suma de una fila específica de una matriz.
class TP8Ejercicio8 {
    public static void main(String[] args) {

        Random rnd = new Random();
        final int FILAS = 5, COLUMNAS = 4;
        int[][] matriz = new int[FILAS][COLUMNAS];

        cargarMatriz(matriz);

        System.out.println("Matriz:");
        mostrarMatriz(matriz);

        int filaRandom = rnd.nextInt(4) + 1;
        int suma = sumaFila(matriz, filaRandom);

        System.out.println("La suma de la fila " + filaRandom + " es: " + suma);

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

    public static int sumaFila(int[][] matriz, int fila) {

        int suma = 0;

        for (int j = 0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }

        return suma;

    }

}

// Implementar una función que determine si una matriz es diagonal (todos los
// elementos fuera de la diagonal principal son cero).
// Matriz Diagonal:
// Una matriz diagonal es una matriz cuadrada en la que todos los elementos
// fuera de la diagonal principal son iguales a 0. Los elementos en la diagonal
// principal pueden ser cualquier número, no necesariamente 1.
// Por ejemplo, una matriz diagonal 3x3 podría ser:
// D =
// | 2 0 0 |
// | 0 5 0 |
// | 0 0 9 |
class TP8Ejercicio9 {
    public static void main(String[] args) {

        final int FILAS = 3, COLUMNAS = 3;
        int[][] matriz = new int[FILAS][COLUMNAS];

        cargarMatriz(matriz);

        System.out.println("Matriz:");
        mostrarMatriz(matriz);

        boolean esDiagonal = esMatrizDiagonal(matriz);

        if (esDiagonal) {
            System.out.println("\nLa matriz es diagonal.");
        } else {
            System.out.println("\nLa matriz no es diagonal.");
        }

    }

    public static void cargarMatriz(int[][] matriz) {
        Random rnd = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rnd.nextInt(4);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static boolean esMatrizDiagonal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

}

// Crear una función que genere una matriz identidad de tamaño n.
// Matriz Identidad (o Matriz Unitaria):
// La matriz identidad, denotada generalmente como "I" o "I_n" (donde "n"
// representa el tamaño de la matriz cuadrada), es una matriz cuadrada especial
// en la que todos los elementos de la diagonal principal son iguales a 1 y
// todos los demás elementos son iguales a 0.
// Por ejemplo, la matriz identidad 3x3 sería:
// I_3 =
// | 1 0 0 |
// | 0 1 0 |
// | 0 0 1 |
class TP8Ejercicio10 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = rnd.nextInt(9) + 1;
        int[][] matrizIdentidad = generarMatrizIdentidad(n);

        System.out.println("\nMatriz Identidad " + n + "x" + n + ":");
        mostrarMatriz(matrizIdentidad);
    }

    public static int[][] generarMatrizIdentidad(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}

// Escribir un método para contar la cantidad de elementos pares e impares en
// una matriz.
class TP8Ejercicio11 {
    public static void main(String[] args) {

        final int FILAS = 5, COLUMNAS = 4;
        int[][] matriz = new int[FILAS][COLUMNAS];

        cargarMatriz(matriz);

        System.out.println("Matriz:");
        mostrarMatriz(matriz);

        int[] resultado = contarParesImpares(matriz);

        System.out.println("\nCantidad de números pares: " + resultado[0]);
        System.out.println("Cantidad de números impares: " + resultado[1]);

    }

    public static void cargarMatriz(int[][] matriz) {
        Random rnd = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rnd.nextInt(4);
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

    public static int[] contarParesImpares(int[][] matriz) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        int[] resultado = { pares, impares };
        return resultado;
    }
}

// Implementar una función que rote una matriz 90 grados en sentido horario.
class TP8Ejercicio12 {
    public static void main(String[] args) {

        final int FILAS = 5, COLUMNAS = 5;
        int[][] matriz = new int[FILAS][COLUMNAS];

        cargarMatriz(matriz);

        System.out.println("Matriz:");
        mostrarMatriz(matriz);

        rotarMatriz90Grados(matriz);

        System.out.println("\nMatriz rotada 90 grados en sentido horario:");
        mostrarMatriz(matriz);

    }

    public static void cargarMatriz(int[][] matriz) {
        Random rnd = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rnd.nextInt(4);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void rotarMatriz90Grados(int[][] matriz) {
        int n = matriz.length;

        for (int capa = 0; capa < n / 2; capa++) {
            int primer = capa;
            int ultimo = n - 1 - capa;

            for (int i = primer; i < ultimo; i++) {
                int offset = i - primer;
                int superior = matriz[primer][i];

                matriz[primer][i] = matriz[ultimo - offset][primer];

                matriz[ultimo - offset][primer] = matriz[ultimo][ultimo - offset];

                matriz[ultimo][ultimo - offset] = matriz[i][ultimo];

                matriz[i][ultimo] = superior;
            }
        }
    }
}

// Desarrollar un método para encontrar el número de veces que aparece un valor
// específico en una matriz.
class TP8Ejercicio13 {
    public static void main(String[] args) {

        Random rnd = new Random();
        final int FILAS = 5, COLUMNAS = 4;
        int[][] matriz = new int[FILAS][COLUMNAS];

        cargarMatriz(matriz);

        System.out.println("Matriz:");
        mostrarMatriz(matriz);

        int valorBuscado = rnd.nextInt(99) + 1;
        ;
        int cantidad = contarValorEnMatriz(matriz, valorBuscado);

        System.out.println("\nEl valor " + valorBuscado + " aparece " + cantidad + " veces en la matriz.");

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

    public static int contarValorEnMatriz(int[][] matriz, int valor) {
        int cantidad = 0;

        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento == valor) {
                    cantidad++;
                }
            }
        }

        return cantidad;
    }

}

// Crear una función que invierta el orden de las filas en una matriz.
class TP8Ejercicio14 {
    public static void main(String[] args) {

        final int FILAS = 5, COLUMNAS = 4;
        int[][] matriz = new int[FILAS][COLUMNAS];

        cargarMatriz(matriz);

        System.out.println("\nMatriz:");
        mostrarMatriz(matriz);

        int[][] matrizInvertida = invertirFilas(matriz);

        System.out.println("\nMatriz Filas Invertidas:");
        mostrarMatriz(matrizInvertida);

    }

    public static void cargarMatriz(int[][] matriz) {
        Random rnd = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rnd.nextInt(89) + 10;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static int[][] invertirFilas(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizInvertida = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizInvertida[i][j] = matriz[filas - 1 - i][j];
            }
        }

        return matrizInvertida;
    }

}

// Escribir un método para sumar todas las diagonales de una matriz cuadrada.
class TP8Ejercicio15 {
    public static void main(String[] args) {

        final int FILAS = 4, COLUMNAS = 4;
        int[][] matriz = new int[FILAS][COLUMNAS];

        cargarMatriz(matriz);

        System.out.println("\nMatriz:");
        mostrarMatriz(matriz);

        int sumaDiagonales = sumarDiagonales(matriz);

        System.out.println("\nSuma de todas las diagonales: " + sumaDiagonales);

    }

    public static void cargarMatriz(int[][] matriz) {
        Random rnd = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rnd.nextInt(89) + 10;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static int sumarDiagonales(int[][] matriz) {
        int suma = 0;
        int filas = matriz.length;

        for (int i = 0; i < filas; i++) {
            suma += matriz[i][i];
        }

        for (int i = 0; i < filas; i++) {
            suma += matriz[i][filas - 1 - i];
        }

        return suma;
    }

}

// Implementar una función que verifique si una matriz es ortogonal (su
// transpuesta es igual a su inversa).
class TP8Ejercicio16 {
    public static void main(String[] args) {
        final int FILAS = 5, COLUMNAS = 4;
        int[][] matriz = new int[FILAS][COLUMNAS];

        cargarMatriz(matriz);

        System.out.println("\nMatriz:");
        mostrarMatriz(matriz);

        boolean esOrtogonal = verificarMatrizOrtogonal(matriz);

        if (esOrtogonal) {
            System.out.println("\nLa matriz es ortogonal.");
        } else {
            System.out.println("\nLa matriz no es ortogonal.");
        }

    }

    public static void cargarMatriz(int[][] matriz) {
        Random rnd = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rnd.nextInt(89) + 10;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static boolean verificarMatrizOrtogonal(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false;
        }

        int[][] transpuesta = obtenerMatrizTranspuesta(matriz);
        int[][] inversa = obtenerMatrizInversa(matriz);

        return sonMatricesIguales(transpuesta, inversa);
    }

    public static int[][] obtenerMatrizTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }

    public static int[][] obtenerMatrizInversa(int[][] matriz) {

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] inversa = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == j) {
                    inversa[i][j] = 1;
                } else {
                    inversa[i][j] = 0;
                }
            }
        }

        return inversa;
    }

    public static boolean sonMatricesIguales(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;

        if (matrizB.length != filas || matrizB[0].length != columnas) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matrizA[i][j] != matrizB[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

}

// Desarrollar un método para encontrar el valor mínimo en cada fila de una
// matriz y devolverlos en un arreglo.
class TP8Ejercicio17 {
    public static void main(String[] args) {

        final int FILAS = 4, COLUMNAS = 4;
        int[][] matriz = new int[FILAS][COLUMNAS];

        cargarMatriz(matriz);

        System.out.println("\nMatriz:");
        mostrarMatriz(matriz);

        int[] minimosPorFila = encontrarMinimoPorFila(matriz);

        System.out.println("");
        for (int fila = 0; fila < minimosPorFila.length; fila++) {
            System.out.println("Mínimo en la fila " + fila + ": " + minimosPorFila[fila]);
        }

    }

    public static void cargarMatriz(int[][] matriz) {
        Random rnd = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rnd.nextInt(89) + 10;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static int[] encontrarMinimoPorFila(int[][] matriz) {
        int filas = matriz.length;
        int[] minimosPorFila = new int[filas];

        for (int fila = 0; fila < filas; fila++) {
            int minimo = matriz[fila][0];
            for (int columna = 1; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] < minimo) {
                    minimo = matriz[fila][columna];
                }
            }
            minimosPorFila[fila] = minimo;
        }

        return minimosPorFila;
    }

}

// Crear una función que calcule el producto de matrices de diferentes tamaños,
// si es posible; de lo contrario, devolver una matriz nula.

class TP8Ejercicio18 {
    public static void main(String[] args) {

        final int FILAS = 4, COLUMNAS = 4;

        int[][] matrizA = new int[FILAS][COLUMNAS];
        int[][] matrizB = new int[FILAS][COLUMNAS];

        cargarMatriz(matrizA);
        cargarMatriz(matrizB);

        System.out.println("\nMatriz A:");
        mostrarMatriz(matrizA);

        System.out.println("\nMatriz B:");
        mostrarMatriz(matrizB);

        int[][] resultado = productoMatrices(matrizA, matrizB);

        if (resultado != null) {
            System.out.println("\nProducto de matrices:");
            mostrarMatriz(resultado);
        } else {
            System.out.println("\nLa multiplicación de matrices no es posible.");
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
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static int[][] productoMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        if (columnasA != filasB) {
            return null;
        }

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                int suma = 0;
                for (int k = 0; k < columnasA; k++) {
                    suma += matrizA[i][k] * matrizB[k][j];
                }
                resultado[i][j] = suma;
            }
        }

        return resultado;
    }

}