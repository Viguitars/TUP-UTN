package clases.clase09_0705.Ejemplos.HerenciaUpCasting;

public class Main {
    public static void main(String[] args) {
        // Hacer up casting de un objeto de tipo Auto a Vehiculo
        Vehiculo vehiculo1 = new Auto();

        // Llama al método de la clase Auto
        vehiculo1.conducir();

        // Hacer up casting de un objeto de tipo Moto a Vehiculo
        Vehiculo vehiculo2 = new Moto();

        // Llama al método de la clase Moto
        vehiculo2.conducir();

        /*
         * En este ejemplo, hemos creado instancias de las clases Auto y
         * Motocicleta, pero las hemos almacenado en referencias de tipo
         * Vehiculo. Luego, podemos llamar al método conducir() de la clase
         * Vehiculo en ambos casos, y se ejecutará el método correspondiente
         * de la clase derivada (Auto o Motocicleta).
         */
    }
}
