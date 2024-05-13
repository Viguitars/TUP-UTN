package practicos.tp6_genericas.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Almacén
        Almacen almacen = new Almacen();

        // Agregar varios productos de diferentes tipos
        almacen.agregarProducto(new Producto("Leche", 2.5));
        almacen.agregarProducto(new Producto("Pan", 1));
        almacen.agregarProducto(new Producto("Televiso", 500));

        // Imprimir los productos almacenados
        almacen.imprimirProductos();
    }
}
