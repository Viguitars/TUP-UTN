package clase03_2103.Ejercicio2;

public abstract class Felino extends Animal {
    public Felino(String foto, String comida, String localizacion,
                  String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }

    @Override
    public void rugir() {
    }
}
