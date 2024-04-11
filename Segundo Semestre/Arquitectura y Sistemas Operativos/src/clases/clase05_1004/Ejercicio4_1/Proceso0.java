package clases.clase05_1004.Ejercicio4_1;

public class Proceso0 implements Runnable {

    private static Monitor0 mon = new Monitor0();

    @Override
    public void run() {

        mon.inc();

        System.out.println(mon.getCont());

    }

}
