package clases.clase05_0904.ExepcionesVarias;

import java.util.Scanner;

public class EjemploExcepciones09ManzanasConThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de manzanas: ");
        int m = Integer.parseInt(sc.nextLine());
        System.out.print("Número de personas: ");
        int p = Integer.parseInt(sc.nextLine());
        try {
            System.out.print("A cada persona le corresponden " + reparteManzanas(m, p) + " manzanas.");
        } catch (ArithmeticException ae) {
            System.out.println("Los datos introducidos no son correctos.");
        }
    }

    public static int reparteManzanas(int manzanas, int personas) {
        try {
            return manzanas / personas;
        } catch (ArithmeticException ae) {
            System.out.println("El número de personas vale 0.");
            throw ae;
        }
    }
}
