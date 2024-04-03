package practicos.tp1.Cliente;

public class Cliente extends Thread {
    public void run() {
        Recurso.uso();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
}
