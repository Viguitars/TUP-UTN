package clases.clase09_0705.Ejemplos.Parametrico;

public class Main {
    public static void main(String[] args) {
        // Crear un Contenedor para enteros
        Contenedor<Integer> integerContenedor = new Contenedor<>(10);
        System.out.println("Objeto en el contenedor de enteros: " +
                integerContenedor.getObjeto());

        // Crear un Contenedor para cadenas de texto
        Contenedor<String> stringContenedor = new Contenedor<>("Hola, mundo!");
        System.out.println("Objeto en el contenedor de cadenas: " +
                stringContenedor.getObjeto());

        // Crear un Contenedor para objetos de cualquier tipo
        Contenedor<Object> objectContenedor = new Contenedor<>(new Main());
        System.out.println("Objeto en el contenedor de objetos: " +
                objectContenedor.getObjeto());
    }
    /*
     * En este ejemplo, hemos creado instancias de la clase Contenedor para
     * almacenar un entero, una cadena de texto y un objeto de tipo Main. Cada
     * instancia de Contenedor está parametrizada con un tipo específico
     * (Integer, String y Object, respectivamente), lo que nos permite almacenar
     * diferentes tipos de objetos de manera segura.
     */
}
