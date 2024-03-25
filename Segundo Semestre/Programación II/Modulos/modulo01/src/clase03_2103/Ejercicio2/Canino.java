package clase03_2103.Ejercicio2;

public abstract class Canino extends Animal {
    public Canino(String foto, String comida, String localizacion,
                  String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }

    @Override
    public void rugir() {
    }
}
