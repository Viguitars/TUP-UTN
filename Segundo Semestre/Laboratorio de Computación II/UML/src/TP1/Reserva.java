package TP1;

import java.util.Date;

public class Reserva {
    private int codigoReserva;
    private Date fechaReserva;
    private Vuelo vuelo;

    public Reserva() {
    }

    public Reserva(int codigoReserva, Date fechaReserva, Vuelo vuelo) {
        this.codigoReserva = codigoReserva;
        this.fechaReserva = fechaReserva;
        this.vuelo = vuelo;
    }

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public void realizarReseva() {
        System.out.println("Reserva realizada con éxito para el vuelo " + vuelo.getNumeroVuelo());

    }

    public void cancelarReserva() {
        System.out.println("Reserva cancelada para el vuelo " + vuelo.getNumeroVuelo());

    }
}
