package clase02_1903;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("John");
        Official official = new Official("Paul");
        Technician technician = new Technician("George");
        Manager manager = new Manager("Ringo");

        System.out.println(worker.toString());
        System.out.println(official.toString());
        System.out.println(technician.toString());
        System.out.println(manager.toString());

    }
}
