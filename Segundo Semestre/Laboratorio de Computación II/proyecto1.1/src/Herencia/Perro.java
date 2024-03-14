package Herencia;

public class Perro extends Animal {
    private String pelaje;

    public Perro(String pelaje) {
        this.pelaje = pelaje;
    }

    public Perro(String raza, int edad, String pelaje) {
        super(raza, edad);
        this.pelaje = pelaje;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    void comer() {
        System.out.println("Yo como carne.");

    }
}
