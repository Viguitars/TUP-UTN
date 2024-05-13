package practicos.tp3_excepciones.EjercicioB2;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso de las excepciones
        try {
            Auto auto = new Auto("Auto");
            auto.acelera(130);
        } catch (MiException e) {
            System.out.println("Excepción en " + e.getVehiculo() + ": El " +
                    "vehículo intenta acelerar a más de 120km/h");
        }

        try {
            Camion camion = new Camion("Camión");
            camion.acelera(140);
        } catch (MiException e) {
            System.out.println("Excepción en " + e.getVehiculo() + ": El " +
                    "vehículo intenta acelerar a más de 120km/h");
        }

        try {
            Chofer chofer1 = new Chofer(false);
            Chofer chofer2 = new Chofer(true); // Esta línea lanzará una
            // excepción
        } catch (MatriculaVencidaException e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
