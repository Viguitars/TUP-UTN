package clases.clase05_0904.ExepcionesPropias;

public class ExcepcionAlturaFueraDeRango extends Exception {
    public ExcepcionAlturaFueraDeRango() {
        System.out.println("ExcepcionAlturaFueraDeRango: La altura está fuera " +
                "del rango permitido.");
    }
}
