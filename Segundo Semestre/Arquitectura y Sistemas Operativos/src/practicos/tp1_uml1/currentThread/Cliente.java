package practicos.tp1_uml1.currentThread;

public class Cliente extends Thread {
    public void run() {
        Recurso.uso();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
}
