package practicos.tp3.Ejercicio2;

public class Employee {
    private String name;
    private Employee supervisor;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
        this.supervisor = null;
    }

    public Employee(String name, Employee supervisor) {
        this.name = name;
        this.supervisor = supervisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public void assignSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public String getSupervisorName() {
        if (supervisor != null) {
            return supervisor.name;
        } else {
            return "Without supervisor";
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Víctor");
        Employee employee2 = new Employee("Alex", employee1);

        System.out.println("Supervisor of " + employee2.name + ": " +
                employee2.getSupervisorName());
    }
}
