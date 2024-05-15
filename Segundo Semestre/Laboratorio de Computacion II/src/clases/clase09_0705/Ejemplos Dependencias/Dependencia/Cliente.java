package clases.clase09_0705.Ejemplos.Dependencia;

public class Cliente {
    /**
     * La clase Cliente depende de la clase Servicio, ya que necesita una
     * instancia de Servicio para realizar su funcionalidad. Esta dependencia se
     * establece a través de la composición, donde la clase Cliente tiene un
     * campo de tipo Servicio.**/
    private final Servicio servicio;

    public Cliente(Servicio servicio) {
        this.servicio = servicio;
    }

    /**
     * La clase Cliente utiliza el servicio a través del método usarServicio(),
     * que llama al método realizarTarea() del objeto servicio.**/
    public void usarServicio() {
        servicio.realizarTarea();
    }
}
