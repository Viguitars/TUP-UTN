package tareas.Sincronizacion;

import java.util.concurrent.Semaphore;

public class CenaFilosofos {
    public static void main(String[] args) {
        final int numFilosofos = 5;
        Semaphore[] palillos = new Semaphore[numFilosofos];

        for (int i = 0; i < numFilosofos; i++) {
            palillos[i] = new Semaphore(1);
        }

        Filosofo[] filosofos = new Filosofo[numFilosofos];
        for (int i = 0; i < numFilosofos; i++) {
            filosofos[i] = new Filosofo(palillos, i);
            filosofos[i].start();
        }
    }
}
