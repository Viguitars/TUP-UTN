package parciales.primero;

import java.util.ArrayList;
import java.util.List;

public class Site {
    // Atributos
    private int stage;
    private String date;
    private String time;
    private List<Installation> installations;

    // Constructor Vacío
    public Site() {
    }

    // Constructor Sobrecargado
    public Site(int stage, String date, String time) {
        this.stage = stage;
        this.date = date;
        this.time = time;
        this.installations = new ArrayList<>();
    }

    // Getters y Setters
    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // Getter para obtener la lista de instalaciones donde se realiza la
    // prueba
    public List<Installation> getInstallations() {
        return installations;
    }

    // Método para agregar una instalación a la lista de instalaciones donde
    // se realiza la prueba
    public void addInstallation(Installation installation) {
        installations.add(installation);
    }

}
