package clases.clase06_1604.EjemploArrayListYArray;

import clases.clase06_1604.EjemploArrayListYArray.EjemploArrayList.MiArrayList;
import clases.clase06_1604.EjemploArrayListYArray.EjemploArreglo.MiColeccion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejemplo con Arreglo.");
        String[] palabras = {"Hola", "Mundo", "en", "Java"};
        MiColeccion miColeccion = new MiColeccion(palabras);

        for (String palabra : miColeccion) {
            System.out.println(palabra);
        }

        System.out.println("--------------------------");
        System.out.println("Ejemplo con ArrayList.");
        MiArrayList<String> miLista = new MiArrayList<>();
        miLista.agregarElemento("Hola");
        miLista.agregarElemento("Mundo");
        miLista.agregarElemento("en");
        miLista.agregarElemento("Java");

        for (String elemento : miLista) {
            System.out.println(elemento);
        }
    }
}
