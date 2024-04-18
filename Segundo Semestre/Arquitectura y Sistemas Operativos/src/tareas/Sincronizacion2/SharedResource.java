package tareas.Sincronizacion2;

public class SharedResource {
    private int count;

    public SharedResource() {
        count = 0;
    }

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }

    public synchronized int getCount() {
        return count;
    }
}
