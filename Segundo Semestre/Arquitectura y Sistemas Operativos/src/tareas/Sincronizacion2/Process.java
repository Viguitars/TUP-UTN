package tareas.Sincronizacion2;

import java.util.concurrent.Semaphore;

public class Process extends Thread {
    private Semaphore semaphore;
    private SharedResource resource;
    private boolean isIncrementing;

    public Process(Semaphore semaphore, SharedResource resource,
                   boolean isIncrementing) {
        this.semaphore = semaphore;
        this.resource = resource;
        this.isIncrementing = isIncrementing;
    }

    public void run() {
        try {
            // Adquirir el semáforo antes de acceder al recurso compartido
            semaphore.acquire();
            if (isIncrementing) {
                resource.increment();
                System.out.println("Aumentar: " + resource.getCount());
            } else {
                resource.decrement();
                System.out.println("Disminuir: " + resource.getCount());
            }
            // Liberar el semáforo después de acceder al recurso compartido
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
