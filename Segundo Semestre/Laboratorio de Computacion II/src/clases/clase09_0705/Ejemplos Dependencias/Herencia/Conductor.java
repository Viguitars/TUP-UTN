package clases.clase09_0705.Ejemplos.Herencia;

public class Conductor {
    /*
     * La clase Conductor depende de la clase Vehiculo para conducir. La
     * dependencia se establece a través de la composición, donde la clase
     * Conductor tiene un campo de tipo Vehiculo.
     */
    private Vehiculo vehiculo;

    public Conductor(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /*
     * La clase Conductor utiliza el vehículo a través del método
     * conducirVehiculo(), que llama al método conducir() del objeto vehiculo.
     */
    public void conducirVehiculo() {
        vehiculo.conducir();
    }
}
