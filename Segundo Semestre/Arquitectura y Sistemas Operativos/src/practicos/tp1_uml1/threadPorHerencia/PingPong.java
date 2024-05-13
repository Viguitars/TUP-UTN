package practicos.tp1.threadPorHerencia;

public class PingPong extends Thread {
    private final String word; // Lo que va a escribir.
    private final int delay; // Tiempo entre escrituras

    public PingPong(String queDecir, int cadaCuantosMs) {
        word = queDecir;
        delay = cadaCuantosMs;
    }

    public void run() { //Se sobrescribe run() de Thread
        while (true) {
            System.out.print(word + " ");
            try {
                sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
