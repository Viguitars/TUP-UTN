package Ejemplo5;

public class Main {
    public static void main(String[] args) {
        // Creando una instancia de Contenedor con un String
        Contenedor<String> contenedorString = new Contenedor<>("Hola Mundo");
        System.out.println("Contenido del contenedor de String: " + contenedorString.getElemento());

        // Creando una instancia de Contenedor con un Integer
        Contenedor<Integer> contenedorInteger = new Contenedor<>(42);
        System.out.println("Contenido del contenedor de Integer: " + contenedorInteger.getElemento());

        // Creando una instancia de Contenedor con cualquier tipo de objeto
        Contenedor<?> contenedorDesconocido = new Contenedor<>("Objeto Desconocido");
        System.out.println("Contenido del contenedor desconocido: " + contenedorDesconocido.getElemento());
    }
}
