package clases.clase09_0705.Ejemplos.HerenciaUpCasting;

public class Auto extends Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el auto...");
    }

    public void encenderLuces() {
        System.out.println("Encendiendo las luces del auto...");
    }
}
