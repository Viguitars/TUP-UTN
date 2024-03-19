public abstract class Vehiculo {
    // Atributos
    private String propietario;
    private int puertas;
    private int ruedas;

    //Constructor Vació
    public Vehiculo() {
    }

    // Constructor Sobrecargado
    public Vehiculo(String propietario, int puertas, int ruedas) {
        this.propietario = propietario;
        this.puertas = puertas;
        this.ruedas = ruedas;
    }
    // Getters y Setters

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    // Método
    public abstract void caracteristicas();
}