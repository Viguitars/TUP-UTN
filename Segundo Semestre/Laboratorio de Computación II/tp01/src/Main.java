import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //        Crear aviones
        Avion avion1 = new Avion("LV-1503", 200, "Boeing 737");
        Avion avion2 = new Avion("LV-2501", 150, "Airbus A320");

        //        Crear flota y agregar aviones
        Flota flota = new Flota();
        flota.agregarAvion(avion1);
        flota.agregarAvion(avion2);

        //        Crear pilotos
        Piloto piloto1 = new Piloto("Victor", 39, 1001, 2000);
        Piloto piloto2 = new Piloto("Alejandra", 38, 1002, 1800);

        //        Crear vuelos y asignar aviones y pilotos
        Vuelo vuelo1 = new Vuelo("AR-150", new Date(), "Buenos Aires",
                "New " + "York", avion1);
        Vuelo vuelo2 = new Vuelo("AR-250", new Date(), "New York",
                "Buenos " + "Aires", avion2);
        vuelo1.setPiloto(piloto1);
        vuelo2.setPiloto(piloto2);

        //        Crear pasajeros
        Pasajero pasajero1 = new Pasajero("Mario", "Rivero", "22543987", 55);
        Pasajero pasajero2 = new Pasajero("Armando", "Villega", "20654367", 57);

        //        Realizar reservas
        Reserva reserva1 = new Reserva(1, new Date(), vuelo1, pasajero1);
        Reserva reserva2 = new Reserva(1, new Date(), vuelo2, pasajero2);

        System.out.println("Información del pasajero 1:");
        System.out.println(pasajero1.obtenerInformacionCompleta());
        System.out.println("¿Es menor de edad? " + (pasajero1.esMenorDeEdad()
                ? "Si" : "No"));

        System.out.println("\nInformación del avión 1:");
        System.out.println("Matricula:" + avion1.getMatricula());
        System.out.println("Modelo: " + avion1.getModelo());
        System.out.println("Capacidad: " + avion2.getCapacidad());

        System.out.println("\nRealizando reserva para el vuelo 1:");
        reserva1.realizarReseva();
        System.out.println("\nRealizando reserva para el vuelo 2:");
        reserva2.realizarReseva();

        System.out.println("\nCancelando reserva para el vuelo 1:");
        reserva1.cancelarReserva();
        System.out.println("\nCancelando reserva para el vuelo 2:");
        reserva2.cancelarReserva();

        System.out.println("\nDespegando avión 1:");
        avion2.despegar();

        System.out.println("\nAumentando altitud del avión 1:");
        piloto1.aumentarAltitud(10000);

        System.out.println("\nAterrizar avión 1:");
        avion2.aterrizar();

    }
}
