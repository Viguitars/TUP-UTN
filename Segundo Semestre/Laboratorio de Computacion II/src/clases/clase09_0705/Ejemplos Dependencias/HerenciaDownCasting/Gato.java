package clases.clase09_0705.Ejemplos.HerenciaDownCasting;

public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Miau miau!");
    }

    public void rasgarMuebles() {
        System.out.println("Arañando los muebles...");
    }
}
