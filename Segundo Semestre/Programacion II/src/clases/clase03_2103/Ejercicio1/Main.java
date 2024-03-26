package clases.clase03_2103.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee(1, "Víctor",
                1500, 700);
        System.out.println(fullTimeEmployee1.getName() + " tiene un salario de" +
                " " +
                "$" + fullTimeEmployee1.calculateSalary());

        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee(2,
                "Alejandra", 1500, 500, 25);
        System.out.println(partTimeEmployee1.getName() + " tiene un salario de" +
                " " +
                "$" + partTimeEmployee1.calculateSalary());
    }
}
