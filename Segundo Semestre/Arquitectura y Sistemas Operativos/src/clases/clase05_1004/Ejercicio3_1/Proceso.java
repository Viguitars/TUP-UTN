package clases.clase05_1004.Ejercicio3_1;

public class Proceso implements Runnable{

     static int cont =0;
     private static Object object = new Object();// debe ser estático sino se produce igual el indeterminismo

    @Override
    public void run() {
        synchronized (object) { //cual es la diferencia entre poner el synchronized adentro o afuera del bucle
        for (int i = 0; i <20000 ; i++) {
           //synchronized (object) {
               cont++;
           }
        }
        

    }
}
