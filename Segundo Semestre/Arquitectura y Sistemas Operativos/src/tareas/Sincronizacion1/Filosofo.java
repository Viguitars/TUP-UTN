package tareas.Sincronizacion1;

import java.util.concurrent.Semaphore;

class Filosofo extends Thread {
    private Semaphore[] palillos;
    private int id;

    public Filosofo(Semaphore[] palillos, int id) {
        this.palillos = palillos;
        this.id = id;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Filósofo " + id + " pensando");
                Thread.sleep((long) (Math.random() * 5000)); // Pensar
                System.out.println("Filósofo " + id + " tiene hambre");

                // Intenta tomar el palillo izquierdo
                palillos[id].acquire();
                System.out.println("Filósofo " + id + " ha cogido el palillo " + "izquierdo");

                // Intenta tomar el palillo derecho
                palillos[(id + 1) % palillos.length].acquire();
                System.out.println("Filósofo " + id + " ha cogido el palillo " + "derecho");

                // Come
                System.out.println("Filósofo " + id + " comiendo");
                Thread.sleep((long) (Math.random() * 3000)); // Comer

                // Suelta los palillos
                palillos[id].release();
                palillos[(id + 1) % palillos.length].release();

                System.out.println("Filósofo " + id + " ha soltado los " +
                        "palillos");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
