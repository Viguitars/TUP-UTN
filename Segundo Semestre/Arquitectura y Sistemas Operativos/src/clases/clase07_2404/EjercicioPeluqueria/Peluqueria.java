package clases.clase07_2404.EjercicioPeluqueria;

import java.util.LinkedList;
import java.util.Queue;

public class Peluqueria {
    private static final int NUM_PELUQUERAS = 3;
    private static final int NUM_CLIENTES = 10;
    private Queue<Cliente> colaClientes = new LinkedList<>();
    Object lock = new Object();
    private Thread[] peluqueras;

    public Peluqueria() {
        peluqueras = new Thread[NUM_PELUQUERAS];
        for (int i = 0; i < NUM_PELUQUERAS; i++) {
            peluqueras[i] =
                    new Thread(new Peluquera(this, "Peluquera " + (i + 1)));
        }
    }

    public void iniciar() {
        for (Thread peluquera : peluqueras) {
            peluquera.start();
        }
        for (int i = 0; i <= NUM_CLIENTES; i++) {
            Cliente cliente = new Cliente("Cliente " + (i + 1));
            agregarCliente(cliente);
        }
    }

    public void agregarCliente(Cliente cliente) {
        synchronized (lock) {// solo accede un hilo
            this.colaClientes.offer(cliente);
            lock.notify();// notifica que hay un cliente en la cola
        }
    }

    public Cliente obtenerCliente() throws InterruptedException {
        synchronized (lock) {
            while (colaClientes.isEmpty()) {
                lock.wait();// suspende la ejecusion hasta que se libera la cola
            }
            return colaClientes.poll();// devuelve elementos de la cola
            // eliminando y devolviendo elementos en la parte frontal
            // si la cola esta vacia retorna null
        }
    }

}
