package clases.clase07_1804;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    // Atributo
    private List<Product> inventory;

    // Constructor Vacío
    public Supermarket() {
        this.inventory = new ArrayList<>();
    }

    // Constructor Sobrecargado
    public Supermarket(List<Product> inventory) {
        this.inventory = inventory;
    }

    // Getters y Setters
    public List<Product> getInventory() {
        return inventory;
    }

    public void setInventory(List<Product> inventory) {
        this.inventory = inventory;
    }

    // Método para agregar nuevos productos al inventario
    public void addProduct(Product product) {
        inventory.add(product);
    }

    // Método para buscar un producto por nombre
    public Product searchProduct(String name) {
        for (Product product : inventory) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    // Método para que un cliente realice una compra
    public void makePurchase(Customer customer) {
        for (Product product : customer.getCart()) {
            Product foundProduct = searchProduct(product.getName());
            if (foundProduct != null && foundProduct.getStockQuantity() > 0) {
                foundProduct.setStockQuantity(
                        (foundProduct.getStockQuantity()) - 1);
            }
        }
    }

    // Método para imprimir la lista de productos disponibles
    public void showInventory() {
        System.out.println("Available products");
        for (Product product : inventory) {
            product.printProductInfo();
        }
    }

}
