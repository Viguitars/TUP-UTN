import java.util.Date;

public class Vuelo {
    private String numero;
    private Date fecha;
    private String origen;
    private String destino;
    private Avion avion; // Asociación con la clase Avión
    private Piloto piloto;

    public Vuelo() {

    }

    public Vuelo(String numero, Date fecha, String origen, String destino,
                 Avion avion) {
        this.numero = numero;
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.avion = avion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void realizarReseva() {
        System.out.println("Reserva realizada para el vuelo " + numero);

    }

    public void cancelarReserva() {
        System.out.println("Reserva cancelada para el vuelo " + numero);

    }

}
