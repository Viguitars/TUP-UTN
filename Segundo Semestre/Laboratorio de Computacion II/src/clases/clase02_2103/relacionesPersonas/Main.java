package clases.clase02_2103.relacionesPersonas;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Víctor", 39, EstadoCivil.VIUDO);
        Persona p2 = new Persona("Eduardo", 12, EstadoCivil.SOLTERO);

        p1.agregarHijos(p2);
        p2.agregarPadre(p1);

        System.out.println("Yo soy " + p1.getNombre() + " y mi hijo es " + p1.getHijos().get(0).getNombre() + ".");

        System.out.println("Yo soy " + p2.getNombre() + " y mi padre es " + p2.getPadres()[0].getNombre() + ".");
    }
}
