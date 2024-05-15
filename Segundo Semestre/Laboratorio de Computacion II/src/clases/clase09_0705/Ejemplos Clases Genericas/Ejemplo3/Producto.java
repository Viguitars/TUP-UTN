package Ejemplo3;

import java.util.ArrayList;

public class Producto { private String nombre;
    private double precio;
    private ArrayList<String> caracteristicas;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.caracteristicas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void agregarCaracteristica(String caracteristica) {
        caracteristicas.add(caracteristica);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", caracteristicas=" + caracteristicas +
                '}';
    }

}
