public interface Volador {
    boolean enVuelo();

    int altitud();

    void aumentarAltitud(int cantidad);

    void disminuirAltitud(int cantidad);
}
