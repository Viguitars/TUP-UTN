package practicos.tp1.Ejercicio8;

public class Main {
    public static void main(String[] args) {
        //        Crear un gerente y trabajador
        Manager manager = new Manager("Víctor", 39, 850000, "Maintenance " +
                "Service");
        Worker worker = new Worker("Gastón", 37, 550000, "Storage");

        //        Mostrar la información del gerente
        System.out.println("Manager information:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Salary: $" + manager.salary);

        //        Método del gerente
        manager.organizeActivities();

        //        Mostrar la información del trabajador
        System.out.println("\nWorker information:");
        System.out.println("Name: " + worker.name);
        System.out.println("Age: " + worker.age);
        System.out.println("Salary: $" + worker.salary);

        //        Método del trabajador
        worker.produce();

    }
}
