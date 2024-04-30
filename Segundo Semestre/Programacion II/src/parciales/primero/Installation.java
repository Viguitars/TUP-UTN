package parciales.primero;

import java.util.ArrayList;
import java.util.List;

public class Installation {
    // Atributos
    private String category;
    private String location;
    private String name;
    private String type;
    private List<Test> tests;

    // Constructor Vacío
    public Installation() {
    }

    // Constructor Sobrecargado
    public Installation(String category, String location, String name,
                        String type) {
        this.category = category;
        this.location = location;
        this.name = name;
        this.type = type;
        this.tests = new ArrayList<>();
    }

    // Getters y Setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter para obtener la lista de pruebas que se realizan en la instalación
    public List<Test> getTests() {
        return tests;
    }

    // Método para obtener la lista de pruebas que se realizan en la instalación
    public void addTest(Test test) {
        tests.add(test);
    }
}
