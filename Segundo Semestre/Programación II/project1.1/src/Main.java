public class Main {
    public static void main(String[] args) {

        Auto a1 = new Auto("Victor Gomenza", 3, 4, true);
        Camion c1 = new Camion("Alejandra Segovia", 2, 18, 950);

        System.out.println("El auto tiene: " + a1.getPuertas() + " puertas, " + a1.getRuedas() + " ruedas y su dueño es " + a1.getPropietario() + ".");
        System.out.println();
        System.out.println("El camion de " + c1.getPropietario() + " tiene " +
                "una carga de " + c1.getCarga() + " kilos.");
        c1.caracteristicas();
        ;

    }
}