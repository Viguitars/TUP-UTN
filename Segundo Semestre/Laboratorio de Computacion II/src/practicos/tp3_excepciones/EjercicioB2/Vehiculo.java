package practicos.tp3.EjercicioB2;

class Vehiculo {
    protected String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    // Método para acelerar
    public void acelera(int velocidad) throws MiException {
        if (velocidad > 120) {
            throw new MiException(this.nombre);
        }
    }
}
