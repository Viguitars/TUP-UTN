package TP1;

import java.util.Date;

public class Reserva {
    private int codigo;
    private Date fecha;
    private Vuelo vuelo;
    private Pasajero pasajero;

    public Reserva() {
    }

    public Reserva(int codigo, Date fecha, Vuelo vuelo, Pasajero pasajero) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public void realizarReseva() {
        System.out.println("Reserva realizada con éxito para el vuelo " + vuelo.getNumero());

    }

    public void cancelarReserva() {
        System.out.println("Reserva cancelada para el vuelo " + vuelo.getNumero());

    }
}
