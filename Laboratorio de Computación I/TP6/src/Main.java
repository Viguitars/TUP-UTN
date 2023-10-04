import java.util.Scanner;

// 1. Programa Java que lea por teclado 10 números enteros y los guarde en un
// array. A continuación calcula y muestra por separado la media de los valores
// positivos y la de los negativos.
class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

// 2. Programa Java que lea 10 números enteros por teclado y los guarde en un
// array. Calcula y muestra la media de los números que estén en las posiciones
// pares del array.
// Considera la primera posición del array como par.

class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

// 4. Programa que crea un array de 20 elementos llamado Pares y guarde los 20
// primeros números pares. Mostrar por pantalla el contenido del array creado.

// 5. Programa Java que guarda en un array 10 números enteros que se leen por
// teclado. A continuación se recorre el array y calcula cuántos números son
// positivos, cuántos negativos y cuántos ceros.

// 6. Programa Java que llene un array con 10 números enteros que se leen por
// teclado. A continuación calcula y muestra la media de los valores positivos y
// la de los valores negativos del array.

// 7. Programa Java para leer la altura de N personas y calcular la altura
// media. Calcular cuántas personas tienen una altura superior a la media y
// cuántas tienen una altura inferior a la media. El valor de N se pide por
// teclado y debe ser entero positivo.}

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
