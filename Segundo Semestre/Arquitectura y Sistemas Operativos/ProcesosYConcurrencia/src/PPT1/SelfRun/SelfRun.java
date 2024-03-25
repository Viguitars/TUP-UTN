package PPT1.SelfRun;

public class SelfRun implements Runnable {
    private final Thread internalThread;
    private boolean noStopRequired;

    public SelfRun() {
        System.out.println("Comienza ejecución");
        noStopRequired = true;
        internalThread = new Thread(this);
        internalThread.start();
    }

    public void run() {
        while (noStopRequired) {
            System.out.println("En ejecución");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stopRequest() {
        noStopRequired = false;
        internalThread.interrupt();
    }
}
