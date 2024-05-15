package Ejemplo1;

public class Main {
    public static void main(String[] args) {
        Equipo<String> equipoFutbol = new Equipo<>("Equipo de Fútbol");
        equipoFutbol.agregarJugador("Messi");
        equipoFutbol.agregarJugador("Neymar");
        equipoFutbol.agregarJugador("Ronaldo");
        equipoFutbol.mostrarJugadores();

        Equipo<Integer> equipoBaloncesto = new Equipo<>("Equipo de Baloncesto");
        equipoBaloncesto.agregarJugador(23);
        equipoBaloncesto.agregarJugador(11);
        equipoBaloncesto.agregarJugador(7);
        equipoBaloncesto.mostrarJugadores();

        Equipo<Integer> equipoFutbol2 = new Equipo<>("Equipo de Fútbol");
        equipoFutbol2.agregarJugador(10);
        equipoFutbol2.agregarJugador(7);
        equipoFutbol2.agregarJugador(9);
        equipoFutbol2.mostrarJugadores();
    }
}