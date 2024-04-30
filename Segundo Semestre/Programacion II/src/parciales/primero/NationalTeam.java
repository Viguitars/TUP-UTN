package parciales.primero;

import java.util.ArrayList;
import java.util.List;

public class NationalTeam {
    // Atributos
    private String color;
    private String country;
    private List<Athlete> members;

    // Constructor Vacío
    public NationalTeam() {
    }

    // Constructor Sobrecargado
    public NationalTeam(String color, String country) {
        this.color = color;
        this.country = country;
        this.members = new ArrayList<>();
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Getter para obtener la lista de los miembros del equipo
    public List<Athlete> getAthletes() {
        return members;
    }

    // Método para agregar un miembro al equipo
    public void addAthlete(Athlete athlete) {
        members.add(athlete);
    }

}
