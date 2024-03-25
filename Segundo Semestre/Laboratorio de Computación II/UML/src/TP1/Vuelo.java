package TP1;

import java.util.Date;

public class Vuelo {
    private String numeroVuelo;
    private Date fechaSalida;
    private String origen;
    private String destino;
    private Avion avion; // Asociación con la clase Avión

    public Vuelo() {

    }

    public Vuelo(String numeroVuelo, Date fechaSalida, String origen,
                 String destino, Avion avion) {
        this.numeroVuelo = numeroVuelo;
        this.fechaSalida = fechaSalida;
        this.origen = origen;
        this.destino = destino;
        this.avion = avion;
    }

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

    public void realizarReseva() {
        System.out.println("Reserva realizada para el vuelo " + numeroVuelo);

    }

    public void cancelarReserva() {
        System.out.println("Reserva cancelada para el vuelo " + numeroVuelo);

    }

}
