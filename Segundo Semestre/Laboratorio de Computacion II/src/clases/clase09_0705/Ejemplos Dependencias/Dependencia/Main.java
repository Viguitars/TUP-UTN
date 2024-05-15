package clases.clase09_0705.Ejemplos.Dependencia;

public class Main {
    public static void main(String[] args) {
        Servicio servicio = new Servicio();
        // Creamos una instancia de Cliente con la instancia de Servicio
        Cliente cliente = new Cliente(servicio);
        // Usamos el servicio a través del cliente
        cliente.usarServicio();
    }
}
