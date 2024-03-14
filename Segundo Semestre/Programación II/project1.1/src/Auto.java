public class Auto extends Vehiculo {
    private boolean descapotable;

    public Auto() {

    }

    public Auto(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public Auto(String propietario, int puertas, int ruedas, boolean descapotable) {
        super(propietario, puertas, ruedas);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void bajar() {

    }

    public void caracteristicas() {

    }

    public void subir() {

    }
}
