package Relaciones;

public class Domicilio {
    // Atributos
    private String calle; // Nombre de la calle
    private int numero; // Número de la calle

    // Constructor Vacío
    public Domicilio() {
    }

    // Constructor Sobrecargado
    public Domicilio(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    // Getter de la calle
    public String getCalle() {
        return calle;
    }

    // Setter de la calle
    public void setCalle(String calle) {
        this.calle = calle;
    }

    // Getter del número de la calle
    public int getNumero() {
        return numero;
    }

    // Setter del número de la calle
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
