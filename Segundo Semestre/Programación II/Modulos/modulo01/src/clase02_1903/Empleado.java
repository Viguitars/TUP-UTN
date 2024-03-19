package clase02_1903;

public abstract class Empleado {
    private String nombre;

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "clase02.Empleado{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
