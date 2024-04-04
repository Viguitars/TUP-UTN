package clases.clase04_0304.Ejercicio2_3;

import java.util.Random;

public class Proceso extends Thread {
    private static final int tam = 800;
    private static final int[][] matriz = new int[tam][tam];
    private static double tiempo_inicio, tiempo_final;
    private int ini, fin;

    public Proceso(int ini, int fin) {
        this.ini = ini;
        this.fin = fin;
    }

    public void run() {
        for (int i = ini; i < fin; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] *= 10;
            }
        }
    }

    public static void main(String[] args) {
        Random rand = new Random(System.nanoTime());

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }

        tiempo_inicio = System.nanoTime();

        Proceso p1 = new Proceso(0, 400);
        Proceso p2 = new Proceso(400, 800);

        p1.start();
        p2.start();

        try {
            p1.join();
            p2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tiempo_final = (System.nanoTime() - tiempo_inicio) / 1000000.0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Demoró " + tiempo_final + " milisegundos.");
    }
}
