package practicos.tp6_genericas.Ejercicio4;

import practicos.tp6_genericas.Ejercicio3.Producto;

import java.util.ArrayList;
import java.util.List;

public class Almacen<T extends Producto> {
    private List<T> elementos;

    public Almacen() {
        this.elementos = new ArrayList<>();
    }

    // Método para añadir un elemento al almacén
    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    // Método para imprimir los elementos almacenados
    public void imprimirElementos() {
        System.out.println("Elementos en el almacén:");
        for (T elmento : elementos) {
            System.out.println(elmento);
        }
    }
}
