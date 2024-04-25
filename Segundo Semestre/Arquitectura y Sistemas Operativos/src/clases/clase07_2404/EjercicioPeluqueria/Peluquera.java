package clases.clase07_2404.EjercicioPeluqueria;

import java.util.Random;

public class Peluquera implements Runnable {
    private final Peluqueria peluqueria;
    private final String nombre;

    public Peluquera(Peluqueria peluqueria, String nombre) {
        this.peluqueria = peluqueria;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        Random random = new Random();// generamos random para el tiempo de espera

        try {
            while (true) {
                Cliente cliente = peluqueria.obtenerCliente();
                System.out.println(
                        nombre + " comienza a atender a " + cliente.getName());
                int tiempoAtencion = random.nextInt(10) + 1;
                Thread.sleep(tiempoAtencion * 1000);
                System.out.println(nombre + " a terminado de atender a " +
                        cliente.getName() + " en " + tiempoAtencion +
                        " segundos.");

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
