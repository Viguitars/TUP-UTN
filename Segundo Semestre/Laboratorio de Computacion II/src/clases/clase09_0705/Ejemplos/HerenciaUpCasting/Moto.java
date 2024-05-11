package clases.clase09_0705.Ejemplos.HerenciaUpCasting;

public class Moto extends Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo la moto...");
    }

    public void acelerar() {
        System.out.println("Acelerando la moto...");
    }
}
