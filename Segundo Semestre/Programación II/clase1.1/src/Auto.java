public class Auto extends Vehiculo {
    private boolean descapotable;

    public Auto() {

    }

    public Auto(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public Auto(String propietario, int puertas, int ruedas,
                boolean descapotable) {
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

    @Override
    public void caracteristicas() {
        System.out.println("Puertas: " + this.getPuertas());
        System.out.println("Ruedas: " + this.getRuedas());
        if (isDescapotable()) {
            System.out.println("El auto es descapotable");
        } else {
            System.out.println("El auto no es descapotable.");
        }

    }

    public void subir() {

    }
}
