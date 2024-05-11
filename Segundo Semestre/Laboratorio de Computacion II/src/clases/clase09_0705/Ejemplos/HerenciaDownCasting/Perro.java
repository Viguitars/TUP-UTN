package clases.clase09_0705.Ejemplos.HerenciaDownCasting;

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau guau!");
    }

    public void perseguirCola() {
        System.out.println("Persiguiendo la cola...");
    }
}
