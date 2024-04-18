package clases.clase07_1804;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    // Atributos
    private String name;
    private String lastName;
    private List<Product> cart;

    // Constructor Vacío
    public Customer() {
    }

    // Constructor Sobrecargado
    public Customer(String name, String lastName, List<Product> cart) {
        this.name = name;
        this.lastName = lastName;
        this.cart = new ArrayList<>();
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    // Método para agregar productos al carrito
    public void addProductToCart(Product product) {
        cart.add(product);
    }

    // Método para calcular el total de la compra
    public double calculateTotaPurchase() {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        return total;
    }
}
