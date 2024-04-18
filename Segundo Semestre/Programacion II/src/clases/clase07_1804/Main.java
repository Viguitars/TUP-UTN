package clases.clase07_1804;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Product product1 = new Product("Banana", 1.50, 10);
        Product product2 = new Product("Milk", 2.50, 20);

        // Crear supermercado
        Supermarket supermarket = new Supermarket();

        // Agregar productos al inventario del supermercado
        supermarket.addProduct(product1);
        supermarket.addProduct(product2);

        // Crear un cliente con el carrito vació
        List<Product> cart = new ArrayList<>();
        Customer customer = new Customer("Víctor", "Gomenza", cart);

        // Agregar productos al carrito del cliente
        customer.addProductToCart(product1);
        customer.addProductToCart(product2);

        // Mostrar los productos disponibles en el supermercado
        supermarket.showInventory();

        // Realizar compra
        supermarket.makePurchase(customer);

        // Mostrar el inventario actualizado
        System.out.println("\nUpdated inventory");
        supermarket.showInventory();

        // Calcular el total de la compra
        double totalPurchase = customer.calculateTotaPurchase();
        System.out.println("\nTotal purchase: $" + totalPurchase);
    }
}
