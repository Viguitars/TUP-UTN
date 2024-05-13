package practicos.tp6_genericas.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de PilaArray y agregar elementos
        PilaArray<Integer> pila = new PilaArray<>(5);
        pila.aniadir(10);
        pila.aniadir(20);
        pila.aniadir(30);

        // Imprimir los elementos de la pila
        while (!pila.estaVacia()) {
            System.out.println("Elemento extraído: " + pila.extraer());
        }
    }
}
