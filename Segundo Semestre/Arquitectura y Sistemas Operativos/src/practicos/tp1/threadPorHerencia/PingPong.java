package practicos.tp1.threadPorHerencia;

public class PingPong extends Thread {
    private final String word; // Lo que va a escribir.
    private final int delay; // Tiempo entre escrituras

    public PingPong(String queDecir, int cadaCuantosMs) {
        word = queDecir;
        delay = cadaCuantosMs;
    }

    public void run() { //Se sobrescribe run() de Thread
        long startTime = System.currentTimeMillis(); // Tiempo de inicio

        while (true) {
            //            System.out.print(word + " ");
            System.out.print(word + " ");

            // Calcular el tiempo transcurrido
            long elapsedTime = System.currentTimeMillis() - startTime;

            // Imprimir el tiempo transcurrido junto con la palabra
            System.out.println("(" + elapsedTime + " ms)");
            try {
                sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
