package practicos.tp6_genericas.Ejercicio4;

import practicos.tp6_genericas.Ejercicio3.Producto;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Almacén
        Almacen<Producto> almacen = new Almacen<>();

        // Agregar varios productos de diferentes tipos
        almacen.agregarElemento(new Producto("Leche", 2.5));
        almacen.agregarElemento(new Producto("Pan", 1.0));
        almacen.agregarElemento(new Producto("Televisor", 500.0));

        // Imprimir los productos almacenados
        almacen.imprimirElementos();
    }
}
