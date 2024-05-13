package practicos.tp6_genericas.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Producto> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    // Método para añadir un producto al almacén
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para imprimir los productos almacenados
    public void imprimirProductos() {
        System.out.println("Productos en el almacén: ");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
