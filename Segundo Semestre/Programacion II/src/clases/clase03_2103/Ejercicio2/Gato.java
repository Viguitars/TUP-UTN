package clases.clase03_2103.Ejercicio2;

public class Gato extends Felino {
    public Gato(String foto, String comida, String localizacion,
                String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau");

    }

    @Override
    public void comer() {
        System.out.println("El gato come " + getComida());

    }
}
