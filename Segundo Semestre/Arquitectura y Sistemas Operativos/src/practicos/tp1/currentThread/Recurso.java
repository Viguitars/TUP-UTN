package practicos.tp1.Cliente;

public class Recurso {
    static synchronized void uso() {
        Thread t = Thread.currentThread();
        System.out.println("Soy " + t.getName());
    }
}
