import java.util.Scanner;

// 1. Programa Java que lea por teclado 10 números enteros y los guarde en un
// array. A continuación calcula y muestra por separado la media de los valores
// positivos y la de los negativos.
class TP6Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i;
            double positive_sum = 0, negative_sum = 0, positive_average, negative_average;

            double[] values = new double[10];

            for (i = 0; i < values.length; i++) {
                System.out.println("Ingrese el " + (i + 1) + "° valor:");
                values[i] = sc.nextDouble();
            }

            for (i = 0; i < values.length; i++) {
                if (values[i] > 0) {
                    positive_sum += values[i];
                } else {
                    negative_sum += values[i];
                }
            }

            positive_average = positive_sum / values.length;

            negative_average = negative_sum / values.length;

            System.out.printf("Valor medio de los número positivos: %.2f %n", positive_average);

            System.out.printf("Valor medio de los número negativos: %.2f %n", negative_average);

            sc.close();
        }
    }
}

// 2. Programa Java que lea 10 números enteros por teclado y los guarde en un
// array. Calcula y muestra la media de los números que estén en las posiciones
// pares del array.
// Considera la primera posición del array como par.
class TP6Ejercicio2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i;
            double sum = 0, average;
            double[] values = new double[10];

            for (i = 0; i < values.length; i++) {
                System.out.println("Ingrese el " + (i + 1) + "° valor:");
                values[i] = sc.nextDouble();
            }

            for (i = 0; i < values.length; i++) {
                if (i % 2 == 0) {
                    sum += values[i];
                }
            }

            average = sum / 5;

            System.out.printf("El valor medio de los números en posición par es: %.2f %n", average);

            sc.close();
        }
    }
}

// 3. Programa que lee por teclado la nota de los alumnos de una clase y calcula
// la nota media del grupo. También muestra los alumnos con notas superiores a
// la media. El número de alumnos se lee por teclado.
// Este programa utiliza un array de elementos de tipo double que contendrá las
// notas de los alumnos.
// El tamaño del array será el número de alumnos de la clase, por lo tanto
// primero se pedirá por teclado el número de alumnos y a continuación se creará
// el array.
// Se realizan 3 recorridos sobre el array, el primero para asignar a cada
// elemento las notas introducidas por teclado, el segundo para sumarlas y
// calcular la media y el tercero para mostrar los alumnos con notas superiores
// a la media.
class TP6Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de alumnos: ");
        int numStudents = sc.nextInt();

        double[] grades = new double[numStudents];
        double totalGrade = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
            totalGrade += grades[i];
        }

        double groupAverage = numStudents > 0 ? totalGrade / numStudents : 0;

        System.out.println("La media del grupo es: " + groupAverage);
        System.out.println("Alumnos con notas superiores a la media:");

        for (int i = 0; i < numStudents; i++) {
            if (grades[i] > groupAverage) {
                System.out.println("Alumno " + (i + 1) + ": " + grades[i]);
            }
        }

        sc.close();
    }
}

// 4. Programa que crea un array de 20 elementos llamado Pares y guarde los 20
// primeros números pares. Mostrar por pantalla el contenido del array creado.
class TP6Ejercicio4 {
    public static void main(String[] args) {
        int[] evenNumbers = new int[20];

        for (int i = 0, num = 2; i < 20; i++, num += 2) {
            evenNumbers[i] = num;
        }

        System.out.println("Los primeros 20 números pares son:");
        for (int i = 0; i < 20; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}

// 5. Programa Java que guarda en un array 10 números enteros que se leen por
// teclado. A continuación se recorre el array y calcula cuántos números son
// positivos, cuántos negativos y cuántos ceros.
class TP6Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese " + (i + 1) + "° número entero: ");
            numbers[i] = sc.nextInt();

            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Cantidad de números positivos: " + positiveCount);
        System.out.println("Cantidad de números negativos: " + negativeCount);
        System.out.println("Cantidad de ceros: " + zeroCount);

        sc.close();
    }
}

// 6. Programa Java que llene un array con 10 números enteros que se leen por
// teclado. A continuación calcula y muestra la media de los valores positivos y
// la de los valores negativos del array.
class TP6Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int positiveSum = 0, negativeSum = 0;
        int positiveCount = 0, negativeCount = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese " + (i + 1) + "° número entero: ");
            numbers[i] = sc.nextInt();

            if (numbers[i] > 0) {
                positiveSum += numbers[i];
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeSum += numbers[i];
                negativeCount++;
            }
        }

        double positiveAverage = positiveCount > 0 ? (double) positiveSum / positiveCount : 0;
        double negativeAverage = negativeCount > 0 ? (double) negativeSum / negativeCount : 0;

        System.out.println("Media de valores positivos: " + positiveAverage);
        System.out.println("Media de valores negativos: " + negativeAverage);

        sc.close();
    }
}

// 7. Programa Java para leer la altura de N personas y calcular la altura
// media. Calcular cuántas personas tienen una altura superior a la media y
// cuántas tienen una altura inferior a la media. El valor de N se pide por
// teclado y debe ser entero positivo.
class TP6Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int numPersons = sc.nextInt();

        if (numPersons <= 0) {
            System.out.println("El número de personas debe ser un entero positivo.");
            return;
        }

        double[] heights = new double[numPersons];
        double sumOfHeights = 0;

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Ingrese la altura de la persona " + (i + 1) + " en centímetros: ");
            heights[i] = sc.nextDouble();
            sumOfHeights += heights[i];
        }

        double averageHeight = sumOfHeights / numPersons;
        int tallPersons = 0;
        int shortPersons = 0;

        for (int i = 0; i < numPersons; i++) {
            if (heights[i] > averageHeight) {
                tallPersons++;
            } else if (heights[i] < averageHeight) {
                shortPersons++;
            }
        }

        System.out.println("Altura media: " + averageHeight + " cm");
        System.out.println("Personas más altas que la media: " + tallPersons);
        System.out.println("Personas más bajas que la media: " + shortPersons);

        sc.close();
    }
}

// 8. Programa Java que lea el nombre y el sueldo de 20 empleados y muestre el
// nombre y el sueldo del empleado que más gana.

// Para hacerlo utilizaremos dos arrays:
// Un array de String para los nombres de los empleados
// Un array de tipo double para los sueldos de cada empleado.

// Al mismo tiempo que leemos los datos de los empleados iremos comprobando cuál
// es el que tiene el mayor sueldo. Para ello tomamos el sueldo del primer
// empleado que se lee como mayor sueldo y después vamos comprobando el resto de
// sueldos. Cuando encontramos alguno mayor que el mayor actual este sueldo se
// convierte en el nuevo mayor.

// En general para calcular el mayor de una serie de números tomamos el primero
// como mayor y después comparamos el resto de números.
class TP6Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEmployees = 20;
        String[] employeeNames = new String[numEmployees];
        double[] salaries = new double[numEmployees];
        String highestPaidEmployee = "";
        double highestSalary = Double.MIN_VALUE;

        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            employeeNames[i] = sc.next();
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            salaries[i] = sc.nextDouble();

            if (salaries[i] > highestSalary) {
                highestSalary = salaries[i];
                highestPaidEmployee = employeeNames[i];
            }
        }

        System.out.println(
                "El empleado con el sueldo más alto es " + highestPaidEmployee + " con un sueldo de $" + highestSalary);

        sc.close();
    }
}

// 9. En esta entrada vamos a escribir un método Java que llene un array de
// enteros con números aleatorios.

// Los números aleatorios deberán estar comprendidos entre dos límites (desde,
// hasta) ambos incluidos.

// El método recibe como parámetros los valores desde, hasta y el tamaño del
// array.

// El método devuelve mediante return el array de enteros creado.

// Para obtener números enteros aleatorios usaremos el método nextInt() de la
// clase Random.

// Para que los números aleatorios obtenidos estén dentro de los limites
// utilizaremos el método nextInt() de la siguiente forma:

// nextInt(hasta - desde + 1) + desde

// Ayuda

// 10. Programa Java para sumar dos matrices de número enteros.
// A) A partir de dos matrices A y B el programa obtendrá una matriz C que
// contendrá la suma de las dos matrices.
// Las matrices A y B que vamos a sumar se crean dentro del programa. El número
// de filas y columnas de A y B se introduce por teclado, así como los valores
// que contienen.
// La suma de dos matrices se realiza de la siguiente forma:
// La matriz suma de dos matrices A y B se obtiene sumando los elementos de A y
// B que se encuentran en la misma posición. Por ejemplo, si las matrices A y B
// son estas:

// Matriz A: 2 1 3 Matriz B: 1 5 2
// 4 0 8 3 1 7
// La matriz C, suma de A+B será esta:
// Matriz C: 3 6 5
// 7 1 15
class TP6Ejercicio10_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de filas de las matrices:");
        int rows = sc.nextInt();
        System.out.println("Ingrese el número de columnas de las matrices:");
        int cols = sc.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] matrixC = new int[rows][cols];

        System.out.println("Ingrese los valores de la matriz A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ingrese los valores de la matriz B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("La matriz resultante C, suma de A y B, es:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}

// B) SUMA DE MATRICES EN JAVA UTILIZANDO MÉTODOS

// En esta segunda versión del programa para sumar matrices realizaremos el
// programa utilizando los siguientes métodos:
// Un método para leer un número entero. Este método lee un número entero por
// teclado y lo devuelve.
// Un método para crear una matriz. El método recibe el número de filas y
// columnas y crea y devuelve una matriz de ese tamaño.
// Un método para llenar una matriz con números enteros. El método recibe la
// matriz y asigna a cada elemento un valor entero que se introduce por teclado.
// Un método para mostrar una matriz por pantalla. El método recibe la matriz a
// mostrar.
// Un método que realiza la suma de dos matrices. El método recibe las dos
// matrices a sumar y devuelve una matriz con el resultado de la suma de ambas
// matrices.
class TP6Ejercicio10_B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el número de filas de las matrices: ");
            int rows = sc.nextInt();
            System.out.print("Ingrese el número de columnas de las matrices: ");
            int columns = sc.nextInt();

            int[][] matrixA = createMatrix(rows, columns);
            int[][] matrixB = createMatrix(rows, columns);

            System.out.println("Ingrese los valores de la matriz A:");
            fillMatrix(matrixA);

            System.out.println("Ingrese los valores de la matriz B:");
            fillMatrix(matrixB);

            int[][] sumMatrix = sumMatrices(matrixA, matrixB);

            System.out.println("La matriz resultante de la suma es:");
            displayMatrix(sumMatrix);
        }
    }

    public static int[][] createMatrix(int rows, int columns) {
        return new int[rows][columns];
    }

    public static void fillMatrix(int[][] matrix) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
        }
    }

    public static int[][] sumMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int columns = matrixA[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// 11. Programa Java para obtener la matriz transpuesta de una matriz.
// Dada una matriz A su transpuesta AT se obtiene intercambiando las filas por
// columnas y las columnas por filas.
// Por ejemplo, si tenemos la matriz A de 2 filas y 4 columnas:
// 1 2 3 4
// 5 6 7 8
// Su matriz transpuesta es una matriz de 4 filas y 2 columnas con este
// contenido:
// 1 5
// 2 6
// 3 7
// 4 8
// La primera fila de A se convierte en la primera columna de la matriz
// transpuesta y la segunda fila de A se convierte en la segunda columna de la
// matriz transpuesta.
// Si la dimensión de la matriz A es 2 x 3 (2 filas y 3 columnas) la dimensión
// de su matriz transpuesta será 3 x 2 (3 filas y 2 columnas).
// En general si la matriz A se ha creado de tamaño A[filas][columnas] su matriz
// transpuesta se debe crear de tamaño AT[columnas]filas].
class TP6Ejercicio11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el número de filas de la matriz: ");
            int rows = sc.nextInt();
            System.out.print("Ingrese el número de columnas de la matriz: ");
            int columns = sc.nextInt();

            int[][] matrix = new int[rows][columns];

            System.out.println("Ingrese los valores de la matriz:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            int[][] transposeMatrix = transpose(matrix);

            System.out.println("La matriz transpuesta es:");
            displayMatrix(transposeMatrix);
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposeMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
