package Relaciones;

import java.util.Date;

public class Vuelo {
    // Atributos
    private String numeroVuelo;
    private Date fechaSalida;
    private String origen;
    private String destino;
    private Avion avion;

    // Constructor Vació
    public Vuelo() {

    }

    // Constructor Sobrecargado
    public Vuelo(String numeroVuelo, Date fechaSalida, String origen, String destino, Avion avion) {
        this.numeroVuelo = numeroVuelo;
        this.fechaSalida = fechaSalida;
        this.origen = origen;
        this.destino = destino;
        // Relación con la clase Avión
        this.avion = avion;
    }

    // Getters y Setters
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    // Métodos
    public void resevar() {

    }

    public void cancelarReserva() {

    }

}
