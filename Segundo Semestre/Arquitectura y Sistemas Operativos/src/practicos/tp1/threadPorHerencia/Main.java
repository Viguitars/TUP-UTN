package practicos.tp1.threadPorHerencia;

public class Main {
    public static void main(String[] args) {
        // Declaración de 2 threads
        PingPong t1 = new PingPong("PING", 33);
        PingPong t2 = new PingPong("PONG", 10);
        // Activación
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
