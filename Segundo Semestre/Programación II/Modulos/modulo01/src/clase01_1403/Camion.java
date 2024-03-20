package clase01_1403;


public class Camion extends Vehiculo {
    private float carga;

    public Camion() {
    }

    public Camion(float carga) {
        this.carga = carga;
    }

    public Camion(String propietario, int puertas, int ruedas, float carga) {
        super(propietario, puertas, ruedas);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    public void caracteristicas() {
        if (carga >= 1000) {
            System.out.println("El camión esta sobrecargado");
        } else {
            System.out.println("Puede continuar.");
        }

    }

}


