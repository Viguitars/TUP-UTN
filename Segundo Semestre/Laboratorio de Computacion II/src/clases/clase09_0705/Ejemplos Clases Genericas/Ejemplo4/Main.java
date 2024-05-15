package Ejemplo4;

public class Main {
    public static void main(String[] args) {
        Producto<String> producto = new Producto<>("Televisor", 499.99);
        producto.agregarCaracteristica("Pantalla LED");
        producto.agregarCaracteristica("Resolución 4K");
        producto.agregarCaracteristica("Smart TV");

        System.out.println(producto);
    }
}
