package tareas.Sincronizacion2;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);// Crear un semáforo con un
        // permiso (exclusión mutua)
        SharedResource resource = new SharedResource();// Recurso compartido

        //        Crear dos procesos
        Process process1 = new Process(semaphore, resource, true);//
        // Incrementa el recurso
        Process process2 = new Process(semaphore, resource, false);
        //Decrementa el recurso

        //        Iniciar los procesos
        process1.start();
        process2.start();

        //        Esperar a que los procesos terminen
        try {
            process1.join();
            process2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //        Imprimir el estado final del recurso
        System.out.println("Final count: " + resource.getCount());

    }
}
