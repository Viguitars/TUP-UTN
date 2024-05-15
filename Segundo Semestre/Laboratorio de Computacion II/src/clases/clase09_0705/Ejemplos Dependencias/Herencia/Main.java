package clases.clase09_0705.Ejemplos.Herencia;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        Moto moto = new Moto();

        // Creamos una instancia de Conductor con Auto
        Conductor conductorAuto = new Conductor(auto);
        // Creamos una instancia de Conductor con Moto
        Conductor conductorMoto = new Conductor(moto);

        conductorAuto.conducirVehiculo();
        conductorMoto.conducirVehiculo();
    }
}
