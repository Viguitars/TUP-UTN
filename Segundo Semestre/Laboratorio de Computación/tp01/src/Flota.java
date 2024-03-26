import java.util.ArrayList;

public class Flota {
    private ArrayList<Avion> listaAviones; // Composición con la clase Avión

    public Flota() {
        this.listaAviones = new ArrayList<>();
    }

    public Flota(ArrayList<Avion> listaAviones) {
        this.listaAviones = listaAviones;
    }

    public void getListaAviones() {
    }

    public void setListaAviones(ArrayList<Avion> listaAviones) {
        this.listaAviones = listaAviones;
    }

    public void agregarAvion(Avion avion) {
        listaAviones.add(avion);
    }

    public void removerAvion(Avion avion) {
        listaAviones.remove(avion);
    }


}
