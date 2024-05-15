package Ejemplo4;

import java.util.ArrayList;

public class Producto <T> {

    private String nombre;
    private double precio;
    private ArrayList<T> caracteristicas;

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

    public ArrayList<T> getCaracteristicas() {
        return caracteristicas;
    }

    public void agregarCaracteristica(T caracteristica) {
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
