package practicos.tp1_uml1.threadInterfazRunnable;

public class Main {
    public static void main(String[] args) {
        // Los objetos r1 y r2 definen la funcionalidad.
        // (definen los métodos run())
        PingPong2 r1 = new PingPong2("PING", 33);
        PingPong2 r2 = new PingPong2("PONG", 10);
        // Se crean los threads
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        // Se activan los threads
        t1.start();
        t2.start();
        // Espera 2 segundos
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        // Finaliza la ejecución de los threads
        t1.stop();
        t2.stop();
    }
}

/**
 * El programa crea dos hilos secundarios que imprimen las palabras "PING" y
 * "PONG" cada 33 y 10 milisegundos respectivamente en la consola durante dos
 * segundos.
 */
