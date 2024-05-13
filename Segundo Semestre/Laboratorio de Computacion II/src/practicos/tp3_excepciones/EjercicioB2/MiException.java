package practicos.tp3_excepciones.EjercicioB2;

class MiException extends Exception {
    private String vehiculo;

    // Constructor que recibe el nombre del vehículo
    public MiException(String vehiculo) {
        super();
        this.vehiculo = vehiculo;
    }

    // Método para obtener el nombre del vehículo
    public String getVehiculo() {
        return vehiculo;
    }
}
