package clase03_2103.Ejercicio1;

public class PartTimeEmployee extends Employee {
    private float hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int id, String name, float salary,
                            float hourlyRate, int hoursWorked) {
        super(id, name, salary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public float calculateSalary() {
        return super.calculateSalary() + (hourlyRate * hoursWorked);
    }
}
