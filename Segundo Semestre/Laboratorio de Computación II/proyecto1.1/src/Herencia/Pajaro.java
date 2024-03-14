package Herencia;

public class Pajaro extends Animal implements Volador, Cantor{
    private String plumaje;

    public Pajaro(String plumaje) {
        this.plumaje = plumaje;
    }

    public Pajaro(String raza, int edad, String plumaje) {
        super(raza, edad);
        this.plumaje = plumaje;
    }

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    @Override
    void comer() {
        System.out.println("Yo como alpiste.");

    }

    @Override
    public void volar() {
        System.out.println("Yo vuelo con mis alas.");
    }

    @Override
    public void cantar() {
        System.out.println("Yo canto muy bien.");
    }
}
