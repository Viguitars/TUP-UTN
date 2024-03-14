package Herencia;

public class Main {
    public static void main(String[] args) {
        Pajaro p1 = new Pajaro("Tordo", 2, "fino");

        System.out.println("Soy un " + p1.getRaza() + ", tengo " + p1.getEdad() + " años y tengo plumaje " + p1.getPlumaje() + ".");

        p1.comer();
        p1.cantar();
    }
}
