public class Piloto extends Persona implements Volador {
    private int codigo;
    private int horasVuelo;
    private boolean enVuelo;
    private int altitud;

    public Piloto() {
    }


    public Piloto(String nombre, int edad, int codigo, int horasVuelo) {
        super(nombre, edad);
        this.codigo = codigo;
        this.horasVuelo = horasVuelo;
    }

    public Piloto(int codigo, int horasVuelo, boolean enVuelo, int altitud) {
        this.codigo = codigo;
        this.horasVuelo = horasVuelo;
        this.enVuelo = enVuelo;
        this.altitud = altitud;
    }

    public Piloto(String nombre, int edad, int codigo, int horasVuelo,
                  boolean enVuelo, int altitud) {
        super(nombre, edad);
        this.codigo = codigo;
        this.horasVuelo = horasVuelo;
        this.enVuelo = enVuelo;
        this.altitud = altitud;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public boolean isEnVuelo() {
        return enVuelo;
    }

    public void setEnVuelo(boolean enVuelo) {
        this.enVuelo = enVuelo;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    @Override
    public boolean enVuelo() {
        return enVuelo;
    }

    @Override
    public int altitud() {
        return altitud;
    }

    @Override
    public void aumentarAltitud(int cantidad) {
        if (enVuelo) {
            altitud += cantidad;
        } else {
            System.out.println("El piloto no puede aumentar la altitud porque "
                    + "no esta volando.");
        }

    }

    @Override
    public void disminuirAltitud(int cantidad) {
        if (enVuelo) {
            altitud -= cantidad;
            if (altitud < 0) {
                altitud = 0;
            }
        } else {
            System.out.println("El piloto no puede disminuir la altitud " +
                    "porque" + " no esta volando.");
        }

    }

    public void despegar() {
        System.out.println(nombre + " está despegando.");
    }

    public void aterrizar() {
        System.out.println(nombre + " está aterrizando.");
    }


}
