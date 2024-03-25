package TP1;

public class Main {
    public static void main(String[] args) {

        Piloto piloto = new Piloto("Victor", 39, 1234, 500, true, 10000);

        piloto.comer();
        piloto.dormir();
        piloto.despegar();
        piloto.aterrizar();
        System.out.println();

        Avion avion = new Avion("ARG1540", 200, "Boeing 737");

        avion.despegar();
        avion.aterrizar();
        System.out.println();

        Flota flota = new Flota();

        flota.agregarAvion(avion);
        flota.getListaAviones();
        flota.removerAvion(avion);


    }
}
