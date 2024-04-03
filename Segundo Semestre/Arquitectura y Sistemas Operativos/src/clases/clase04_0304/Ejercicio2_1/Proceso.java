package clases.clase04_0304.Ejercicio2_1;

import java.util.Random;

public class Proceso extends Thread {
    private static int tam = 8;
    private static int[] vec = new int[tam];
    private int ini, fin;

    public Proceso(int ini, int fin) {
        this.ini = ini;
        this.fin = fin;
    }

    public void run() {
        for (int i = ini; i < fin; i++) {
            vec[i] += 10;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random(System.nanoTime());

        System.out.println("Números random:");

        for (int i = 0; i < vec.length; i++) {
            vec[i] = rand.nextInt(10);
            System.out.println(vec[i]);
        }

        Proceso p1 = new Proceso(0, 4);
        Proceso p2 = new Proceso(4, 8);

        p1.start();
        p2.start();

        try {
            p1.join();
            p2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Números random más diez:");

        for (int j : vec) {
            System.out.println(j);

        }


    }
}
