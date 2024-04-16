package clases.clase05_0904.Agregacion;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Department> departments = new ArrayList<Department>();

    public void addDepartment(Department department) {
        departments.add(department);
    }
}
