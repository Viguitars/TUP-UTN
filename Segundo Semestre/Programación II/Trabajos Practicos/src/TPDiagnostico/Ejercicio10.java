package TPDiagnostico;

import java.util.Scanner;

/**
 * Crea un programa en Java que solicite al usuario ingresar las notas de un
 * conjunto de estudiantes y luego calcule el promedio de esas notas. El programa
 * debe preguntar al usuario cuántas notas desea ingresar, luego leer las notas y
 * finalmente calcular y mostrar el promedio.
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int numberOfGrades = sc.nextInt();

        if (numberOfGrades <= 0) {
            System.out.println("Error: Number of grades must be greater than 0" +
                    ".");
            return;
        }

        double sum = 0;
        for (int i = 1; i <= numberOfGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = sc.nextDouble();
            sum += grade;
        }

        double average = sum / numberOfGrades;

        System.out.println("The average of the grades is: " + average);

    }
}

