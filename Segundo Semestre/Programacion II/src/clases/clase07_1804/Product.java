package clases.clase07_1804;

public class Product {
    // Atributos
    private String name;
    private double price;
    private int stockQuantity;
    // Constructor Vacío

    public Product() {
    }
    // Constructor Sobrecargado

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    // Getters y Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    // Método para imprimir la información del producto
    public void printProductInfo() {
        System.out.println(
                "Product: " + name + ", Price: " + price + ", Stock quantity: " +
                        stockQuantity);
    }
}
