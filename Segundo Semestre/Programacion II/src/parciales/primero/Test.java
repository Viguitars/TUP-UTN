package parciales.primero;

import java.util.ArrayList;
import java.util.List;

public class Test {
    // Atributos
    private int code;
    private String title;
    private List<Athlete> participants;

    // Constructor Vacío
    public Test() {
    }

    // Constructor Sobrecargado
    public Test(int code, String title) {
        this.code = code;
        this.title = title;
        this.participants = new ArrayList<>();
    }

    // Getters y Setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter para obtener la lista de los atletas que participan de las pruebas
    public List<Athlete> getAthletes() {
        return participants;
    }

    // Método para agregar un atleta a la lista de participantes de las pruebas
    public void addAthlete(Athlete athlete) {
        participants.add(athlete);
    }

}
